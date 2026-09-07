package com.telnyx.sdk.core

import com.telnyx.sdk.core.http.HttpResponse
import java.io.FilterInputStream
import java.io.InputStream
import java.util.concurrent.CompletableFuture
import java.util.concurrent.atomic.AtomicBoolean

/** One transport response lifetime, shared by parser, logging and cancellation cleanup. */
private class OwnedHttpResponse(private val response: HttpResponse) : HttpResponse by response {
    private val closed = AtomicBoolean()
    private val stream: InputStream by lazy {
        object : FilterInputStream(response.body()) {
            override fun close() = this@OwnedHttpResponse.close()
        }
    }

    override fun body(): InputStream = stream

    override fun close() {
        if (closed.compareAndSet(false, true)) response.close()
    }
}

/** Adopt before a request-owned handler can parse or create aliases; never use on shared auth. */
@JvmSynthetic
internal fun CompletableFuture<HttpResponse>.ownResponse(): CompletableFuture<HttpResponse> {
    val source = this
    val result =
        object : CompletableFuture<HttpResponse>() {
            @Synchronized
            override fun cancel(mayInterruptIfRunning: Boolean): Boolean {
                val cancelled = super.cancel(mayInterruptIfRunning)
                if (cancelled) source.cancel(mayInterruptIfRunning)
                return cancelled
            }
        }
    source.whenComplete { response, error ->
        if (error != null) {
            // Adoption is transparent: retry classification must see the transport error.
            result.completeExceptionally(error)
        } else {
            val owned = if (response is OwnedHttpResponse) response else OwnedHttpResponse(response)
            if (!result.complete(owned)) owned.close()
        }
    }
    return result
}
