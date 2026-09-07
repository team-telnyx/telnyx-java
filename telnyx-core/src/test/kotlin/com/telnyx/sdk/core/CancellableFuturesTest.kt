package com.telnyx.sdk.core

import java.util.concurrent.CompletableFuture
import java.util.concurrent.CountDownLatch
import java.util.concurrent.TimeUnit
import org.junit.jupiter.api.Test

internal class CancellableFuturesTest {
    @Test
    fun completedRetryChildDiscardClosesResponse() {
        val beforeFlatten = CountDownLatch(1)
        val resume = CountDownLatch(1)
        val closes = java.util.concurrent.atomic.AtomicInteger()
        val response = AutoCloseable {
            closes.incrementAndGet()
            Unit
        }
        val source = CompletableFuture<AutoCloseable>()
        val handled =
            source.handleCancellable { value, _ -> CompletableFuture.completedFuture(value!!) }
        val flat = handled.composeCancellable { it }
        handled.whenComplete { _, _ ->
            beforeFlatten.countDown()
            check(resume.await(2, TimeUnit.SECONDS))
        }
        val worker = Thread { source.complete(response) }
        worker.start()
        check(beforeFlatten.await(2, TimeUnit.SECONDS))
        check(flat.cancel(false))
        resume.countDown()
        worker.join(2000)
        check(closes.get() == 1) { "Discarded completed retry response closes=${closes.get()}" }
    }

    @Test
    fun dependentFailureObserversMatchJdk() {
        for (failure in
            listOf(
                IllegalStateException("failure"),
                java.util.concurrent.CancellationException(),
            )) {
            val source = CompletableFuture<String>()
            val dependent = source.mapCancellable { it }
            val legacy = source.thenApply { it }
            source.completeExceptionally(failure)
            var actual: Throwable? = null
            var expected: Throwable? = null
            dependent.whenComplete { _, e -> actual = e }
            legacy.whenComplete { _, e -> expected = e }
            check(actual?.javaClass == expected?.javaClass) {
                "Dependent observer lost CompletionException"
            }
            check(!dependent.isCancelled)
        }
    }

    @Test
    fun cancellationClosesResponseDuringParsing() {
        val entered = CountDownLatch(1)
        val closed = CountDownLatch(1)
        val source = CompletableFuture<AutoCloseable>()
        val parsed =
            source.mapCancellable {
                entered.countDown()
                check(closed.await(2, TimeUnit.SECONDS)) {
                    "Active parsing response was not closed"
                }
                "parsed"
            }
        val worker = Thread { source.complete(AutoCloseable { closed.countDown() }) }
        worker.start()
        try {
            check(entered.await(2, TimeUnit.SECONDS))
            parsed.cancel(false)
            check(closed.await(1, TimeUnit.SECONDS)) { "Cancellation leaked active response" }
        } finally {
            closed.countDown()
            worker.join(2000)
        }
    }

    @Test
    fun cancellationPreservesInterruptFlag() {
        for (flag in listOf(false, true)) {
            var received: Boolean? = null
            val source =
                object : CompletableFuture<String>() {
                    override fun cancel(mayInterruptIfRunning: Boolean): Boolean {
                        received = mayInterruptIfRunning
                        return super.cancel(mayInterruptIfRunning)
                    }
                }
            source.mapCancellable { it }.cancel(flag)
            check(received == flag) { "Interrupt flag changed" }
        }
    }

    @Test
    fun cancelledHandlerCancelsChildPublishedLate() {
        val source = CompletableFuture<String>()
        val entered = CountDownLatch(1)
        val release = CountDownLatch(1)
        val child = CompletableFuture<String>()
        val handled =
            source
                .handleCancellable { _, _ ->
                    entered.countDown()
                    check(release.await(2, TimeUnit.SECONDS))
                    child
                }
                .composeCancellable { it }
        val worker = Thread { source.complete("ready") }
        worker.start()
        try {
            check(entered.await(2, TimeUnit.SECONDS))
            handled.cancel(false)
        } finally {
            release.countDown()
            worker.join(2000)
        }
        check(child.isCancelled) { "Lost retry child was not cancelled" }
    }

    @Test
    fun asynchronousCompositionDoesNotRunOnCallerThread() {
        val caller = Thread.currentThread()
        val result =
            CompletableFuture.completedFuture("ready").composeCancellableAsync {
                check(Thread.currentThread() !== caller)
                CompletableFuture.completedFuture(it)
            }
        check(result.get(2, TimeUnit.SECONDS) == "ready")
    }

    @Test
    fun deliveredRawResponseRemainsOpenAfterRejectedCancellation() {
        var closed = false
        val response = AutoCloseable { closed = true }
        val result = CompletableFuture.completedFuture(response).mapCancellable { it }
        check(result.join() === response)
        check(!result.cancel(false))
        check(!closed)
    }

    @Test
    fun parserExceptionClosesInputAndPreservesFailure() {
        var closed = false
        val failure = IllegalStateException("parse failed")
        val result =
            CompletableFuture.completedFuture(AutoCloseable { closed = true }).mapCancellable {
                throw failure
            }
        try {
            result.join()
            error("Expected failure")
        } catch (error: java.util.concurrent.CompletionException) {
            check(error.cause === failure)
        }
        check(closed)
    }

    @Test
    fun cleanupFailureDoesNotLeaveParserFuturePending() {
        val failure = IllegalStateException("parse")
        val result =
            CompletableFuture.completedFuture(AutoCloseable { error("close") }).mapCancellable {
                throw failure
            }
        check(result.isDone) { "Cleanup failure left result pending" }
        try {
            result.join()
            error("Expected failure")
        } catch (error: java.util.concurrent.CompletionException) {
            check(error.cause === failure)
        }
    }

    @Test
    fun mappedCancellationReachesSource() {
        for (interrupt in listOf(false, true)) {
            val source = CompletableFuture<String>()
            val mapped = source.mapCancellable { it.length }
            check(mapped.cancel(interrupt))
            check(source.isCancelled)
        }
    }

    @Test
    fun undeliveredMappedResourceIsClosed() {
        val entered = CountDownLatch(1)
        val release = CountDownLatch(1)
        var closed = false
        val source = CompletableFuture<String>()
        val mapped =
            source.mapCancellable {
                entered.countDown()
                check(release.await(2, TimeUnit.SECONDS))
                AutoCloseable { closed = true }
            }
        val worker = Thread { source.complete("ready") }
        worker.start()
        try {
            check(entered.await(2, TimeUnit.SECONDS))
            mapped.cancel(true)
        } finally {
            release.countDown()
            worker.join(2000)
        }
        check(!worker.isAlive)
        check(closed)
    }

    @Test
    fun composedCancellationReachesActiveChild() {
        val source = CompletableFuture<String>()
        val child = CompletableFuture<String>()
        val composed = source.composeCancellable { child }
        source.complete("start")
        composed.cancel(true)
        check(child.isCancelled)
    }

    @Test
    fun lateSourceResourceIsClosed() {
        val source =
            object : CompletableFuture<AutoCloseable>() {
                override fun cancel(mayInterruptIfRunning: Boolean) = false
            }
        var closed = false
        val mapped = source.mapCancellable { it }
        mapped.cancel(false)
        source.complete(AutoCloseable { closed = true })
        check(closed)
    }

    @Test
    fun childPublishedAfterCancellationIsCancelled() {
        val entered = CountDownLatch(1)
        val release = CountDownLatch(1)
        val source = CompletableFuture<String>()
        val child = CompletableFuture<String>()
        val composed =
            source.composeCancellable {
                entered.countDown()
                check(release.await(2, TimeUnit.SECONDS))
                child
            }
        val worker = Thread { source.complete("start") }
        worker.start()
        try {
            check(entered.await(2, TimeUnit.SECONDS))
            composed.cancel(false)
        } finally {
            release.countDown()
            worker.join(2000)
        }
        check(!worker.isAlive)
        check(child.isCancelled)
    }

    @Test
    fun cancellationBeforeDispatchDoesNotInvokeMapper() {
        var dispatched = false
        val source = CompletableFuture<String>()
        val composed =
            source.composeCancellable {
                dispatched = true
                CompletableFuture.completedFuture(it)
            }
        composed.cancel(true)
        source.complete("late")
        check(source.isCancelled)
        check(!dispatched)
    }

    @Test
    fun normalCompletionAndIndependentRequestAreUnaffected() {
        val independent = CompletableFuture<String>()
        val source = CompletableFuture<String>()
        val cancelled = source.mapCancellable { it }
        cancelled.cancel(true)
        check(!independent.isCancelled)
        val successful =
            independent.composeCancellable { CompletableFuture.completedFuture(it.length) }
        independent.complete("ok")
        check(successful.join() == 2)
        check(!successful.cancel(false))
    }
}
