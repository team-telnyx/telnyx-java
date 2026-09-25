// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.services.async.ai.memory.NamespaceServiceAsync
import com.telnyx.sdk.services.async.ai.memory.NamespaceServiceAsyncImpl
import java.util.function.Consumer

class MemoryServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    MemoryServiceAsync {

    private val withRawResponse: MemoryServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val namespaces: NamespaceServiceAsync by lazy {
        NamespaceServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): MemoryServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): MemoryServiceAsync =
        MemoryServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Whether a write has finished. */
    override fun namespaces(): NamespaceServiceAsync = namespaces

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MemoryServiceAsync.WithRawResponse {

        private val namespaces: NamespaceServiceAsync.WithRawResponse by lazy {
            NamespaceServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MemoryServiceAsync.WithRawResponse =
            MemoryServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Whether a write has finished. */
        override fun namespaces(): NamespaceServiceAsync.WithRawResponse = namespaces
    }
}
