package com.telnyx.sdk.core

import java.util.concurrent.CompletableFuture
import java.util.concurrent.CompletionException
import java.util.concurrent.atomic.AtomicReference

private class RequestFuture<T>(private val beforeCancel: () -> Unit = {}) : CompletableFuture<T>() {
    @Volatile
    var interrupt = true
        private set

    @Synchronized
    override fun cancel(mayInterruptIfRunning: Boolean): Boolean {
        if (!isDone) {
            interrupt = mayInterruptIfRunning
            beforeCancel()
        }
        return super.cancel(mayInterruptIfRunning)
    }
}

/** Serializes only request/backoff creation with terminal cancellation, never response parsing. */
internal class RequestCancellationScope {
    private var cancelled = false

    @Synchronized
    fun <T> start(action: () -> CompletableFuture<T>): CompletableFuture<T> =
        if (cancelled) CompletableFuture<T>().also { it.cancel(false) } else action()

    fun <T> bind(source: CompletableFuture<T>): CompletableFuture<T> {
        val result = RequestFuture<T>({ synchronized(this) { cancelled = true } })
        result.whenComplete { _, _ -> if (result.isCancelled) source.cancel(result.interrupt) }
        source.whenComplete { value, error ->
            if (error != null)
                result.completeExceptionally(
                    if (error is CompletionException) error else CompletionException(error)
                )
            else if (!result.complete(value)) discard(value, result.interrupt)
        }
        return result
    }
}

/**
 * A discarded child has no active delivery observer; cancellation alone cannot dispose its value.
 */
private fun discard(value: Any?, interrupt: Boolean, alreadyClosed: Any? = null) {
    if (value is CompletableFuture<*>) {
        value.whenComplete { child, failure ->
            if (failure == null) discard(child, interrupt, alreadyClosed)
        }
        value.cancel(interrupt)
    } else if (value !== alreadyClosed) (value as? AutoCloseable)?.close()
}

/** Compose request-owned stages, including a child created concurrently with cancellation. */
@JvmSynthetic
internal fun <T, R> CompletableFuture<T>.composeCancellable(
    mapper: (T) -> CompletableFuture<R>
): CompletableFuture<R> = composeCancellableImpl(false, mapper)

@JvmSynthetic
internal fun <T, R> CompletableFuture<T>.composeCancellableAsync(
    mapper: (T) -> CompletableFuture<R>
): CompletableFuture<R> = composeCancellableImpl(true, mapper)

private fun <T, R> CompletableFuture<T>.composeCancellableImpl(
    async: Boolean,
    mapper: (T) -> CompletableFuture<R>,
): CompletableFuture<R> {
    val result = RequestFuture<R>()
    val active = AtomicReference<CompletableFuture<*>>(this)
    result.whenComplete { _, _ -> if (result.isCancelled) active.get().cancel(result.interrupt) }
    val observer =
        java.util.function.BiConsumer<T, Throwable?> { value, error ->
            if (error != null)
                result.completeExceptionally(
                    if (error is CompletionException) error else CompletionException(error)
                )
            else if (!result.isDone) {
                try {
                    val child = mapper(value)
                    active.set(child)
                    // Ref: CompletableFuture.cancel does not propagate to dependent stages.
                    // Recheck after publication so cancellation cannot miss a newly created child.
                    if (result.isCancelled) child.cancel(result.interrupt)
                    child.whenComplete { next, failure ->
                        if (failure != null)
                            result.completeExceptionally(
                                if (failure is CompletionException) failure
                                else CompletionException(failure)
                            )
                        else if (!result.complete(next)) (next as? AutoCloseable)?.close()
                    }
                } catch (e: Throwable) {
                    result.completeExceptionally(
                        if (e is CompletionException) e else CompletionException(e)
                    )
                }
            } else {
                discard(value, result.interrupt)
            }
        }
    if (async) whenCompleteAsync(observer) else whenComplete(observer)
    return result
}

/** Only use with futures owned by this request, never shared authentication work. */
@JvmSynthetic
internal fun <T, R> CompletableFuture<T>.mapCancellable(mapper: (T) -> R): CompletableFuture<R> =
    handleCancellable { value, error ->
        if (error != null) throw error
        @Suppress("UNCHECKED_CAST") mapper(value as T)
    }

@JvmSynthetic
internal fun <T, R> CompletableFuture<T>.handleCancellable(
    mapper: (T?, Throwable?) -> R
): CompletableFuture<R> {
    val result = RequestFuture<R>()
    val parsing = AtomicReference<AutoCloseable?>()
    fun closeParsing() {
        parsing.getAndSet(null)?.close()
    }
    result.whenComplete { _, _ ->
        if (result.isCancelled) {
            cancel(result.interrupt)
            closeParsing()
        }
    }
    whenComplete { value, error ->
        run {
            parsing.set(value as? AutoCloseable)
            if (result.isDone) closeParsing()
            else
                try {
                    val mapped = mapper(value, error)
                    if (!result.complete(mapped)) {
                        closeParsing()
                        discard(mapped, result.interrupt, value)
                    } else parsing.set(null)
                } catch (e: Throwable) {
                    try {
                        closeParsing()
                    } catch (cleanup: Throwable) {
                        if (cleanup !== e) e.addSuppressed(cleanup)
                    }
                    result.completeExceptionally(
                        if (e is CompletionException) e else CompletionException(e)
                    )
                }
        }
    }
    return result
}
