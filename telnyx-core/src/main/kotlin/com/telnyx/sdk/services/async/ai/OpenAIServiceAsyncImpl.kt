// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.services.async.ai.openai.EmbeddingServiceAsync
import com.telnyx.sdk.services.async.ai.openai.EmbeddingServiceAsyncImpl
import java.util.function.Consumer

class OpenAIServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    OpenAIServiceAsync {

    private val withRawResponse: OpenAIServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val embeddings: EmbeddingServiceAsync by lazy {
        EmbeddingServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): OpenAIServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): OpenAIServiceAsync =
        OpenAIServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** OpenAI-compatible embeddings endpoints for generating vector representations of text */
    override fun embeddings(): EmbeddingServiceAsync = embeddings

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        OpenAIServiceAsync.WithRawResponse {

        private val embeddings: EmbeddingServiceAsync.WithRawResponse by lazy {
            EmbeddingServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): OpenAIServiceAsync.WithRawResponse =
            OpenAIServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** OpenAI-compatible embeddings endpoints for generating vector representations of text */
        override fun embeddings(): EmbeddingServiceAsync.WithRawResponse = embeddings
    }
}
