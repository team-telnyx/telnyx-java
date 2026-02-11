// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai.openai

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.handlers.errorBodyHandler
import com.telnyx.sdk.core.handlers.errorHandler
import com.telnyx.sdk.core.handlers.jsonHandler
import com.telnyx.sdk.core.http.HttpMethod
import com.telnyx.sdk.core.http.HttpRequest
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponse.Handler
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.core.http.json
import com.telnyx.sdk.core.http.parseable
import com.telnyx.sdk.core.prepare
import com.telnyx.sdk.models.ai.openai.embeddings.EmbeddingCreateEmbeddingsParams
import com.telnyx.sdk.models.ai.openai.embeddings.EmbeddingCreateEmbeddingsResponse
import com.telnyx.sdk.models.ai.openai.embeddings.EmbeddingListEmbeddingModelsParams
import com.telnyx.sdk.models.ai.openai.embeddings.EmbeddingListEmbeddingModelsResponse
import java.util.function.Consumer

class EmbeddingServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    EmbeddingService {

    private val withRawResponse: EmbeddingService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): EmbeddingService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): EmbeddingService =
        EmbeddingServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun createEmbeddings(
        params: EmbeddingCreateEmbeddingsParams,
        requestOptions: RequestOptions,
    ): EmbeddingCreateEmbeddingsResponse =
        // post /ai/openai/embeddings
        withRawResponse().createEmbeddings(params, requestOptions).parse()

    override fun listEmbeddingModels(
        params: EmbeddingListEmbeddingModelsParams,
        requestOptions: RequestOptions,
    ): EmbeddingListEmbeddingModelsResponse =
        // get /ai/openai/embeddings/models
        withRawResponse().listEmbeddingModels(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        EmbeddingService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EmbeddingService.WithRawResponse =
            EmbeddingServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createEmbeddingsHandler: Handler<EmbeddingCreateEmbeddingsResponse> =
            jsonHandler<EmbeddingCreateEmbeddingsResponse>(clientOptions.jsonMapper)

        override fun createEmbeddings(
            params: EmbeddingCreateEmbeddingsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EmbeddingCreateEmbeddingsResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "openai", "embeddings")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createEmbeddingsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listEmbeddingModelsHandler: Handler<EmbeddingListEmbeddingModelsResponse> =
            jsonHandler<EmbeddingListEmbeddingModelsResponse>(clientOptions.jsonMapper)

        override fun listEmbeddingModels(
            params: EmbeddingListEmbeddingModelsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EmbeddingListEmbeddingModelsResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "openai", "embeddings", "models")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listEmbeddingModelsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
