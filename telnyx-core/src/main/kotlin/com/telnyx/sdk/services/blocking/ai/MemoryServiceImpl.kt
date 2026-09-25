// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.services.blocking.ai.memory.NamespaceService
import com.telnyx.sdk.services.blocking.ai.memory.NamespaceServiceImpl
import java.util.function.Consumer

class MemoryServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    MemoryService {

    private val withRawResponse: MemoryService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val namespaces: NamespaceService by lazy { NamespaceServiceImpl(clientOptions) }

    override fun withRawResponse(): MemoryService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): MemoryService =
        MemoryServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Whether a write has finished. */
    override fun namespaces(): NamespaceService = namespaces

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MemoryService.WithRawResponse {

        private val namespaces: NamespaceService.WithRawResponse by lazy {
            NamespaceServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MemoryService.WithRawResponse =
            MemoryServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Whether a write has finished. */
        override fun namespaces(): NamespaceService.WithRawResponse = namespaces
    }
}
