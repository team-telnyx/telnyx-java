// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.services.blocking.ai.openai.EmbeddingService
import com.telnyx.sdk.services.blocking.ai.openai.EmbeddingServiceImpl
import java.util.function.Consumer

class OpenAIServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    OpenAIService {

    private val withRawResponse: OpenAIService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val embeddings: EmbeddingService by lazy { EmbeddingServiceImpl(clientOptions) }

    override fun withRawResponse(): OpenAIService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): OpenAIService =
        OpenAIServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun embeddings(): EmbeddingService = embeddings

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        OpenAIService.WithRawResponse {

        private val embeddings: EmbeddingService.WithRawResponse by lazy {
            EmbeddingServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): OpenAIService.WithRawResponse =
            OpenAIServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun embeddings(): EmbeddingService.WithRawResponse = embeddings
    }
}
