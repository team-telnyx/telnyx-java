// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai.missions

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.handlers.emptyHandler
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
import com.telnyx.sdk.core.prepareAsync
import com.telnyx.sdk.models.ai.missions.knowledgebases.KnowledgeBaseCreateKnowledgeBaseParams
import com.telnyx.sdk.models.ai.missions.knowledgebases.KnowledgeBaseCreateKnowledgeBaseResponse
import com.telnyx.sdk.models.ai.missions.knowledgebases.KnowledgeBaseDeleteKnowledgeBaseParams
import com.telnyx.sdk.models.ai.missions.knowledgebases.KnowledgeBaseGetKnowledgeBaseParams
import com.telnyx.sdk.models.ai.missions.knowledgebases.KnowledgeBaseGetKnowledgeBaseResponse
import com.telnyx.sdk.models.ai.missions.knowledgebases.KnowledgeBaseListKnowledgeBasesParams
import com.telnyx.sdk.models.ai.missions.knowledgebases.KnowledgeBaseListKnowledgeBasesResponse
import com.telnyx.sdk.models.ai.missions.knowledgebases.KnowledgeBaseUpdateKnowledgeBaseParams
import com.telnyx.sdk.models.ai.missions.knowledgebases.KnowledgeBaseUpdateKnowledgeBaseResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class KnowledgeBaseServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    KnowledgeBaseServiceAsync {

    private val withRawResponse: KnowledgeBaseServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): KnowledgeBaseServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): KnowledgeBaseServiceAsync =
        KnowledgeBaseServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun createKnowledgeBase(
        params: KnowledgeBaseCreateKnowledgeBaseParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<KnowledgeBaseCreateKnowledgeBaseResponse> =
        // post /ai/missions/{mission_id}/knowledge-bases
        withRawResponse().createKnowledgeBase(params, requestOptions).thenApply { it.parse() }

    override fun deleteKnowledgeBase(
        params: KnowledgeBaseDeleteKnowledgeBaseParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /ai/missions/{mission_id}/knowledge-bases/{knowledge_base_id}
        withRawResponse().deleteKnowledgeBase(params, requestOptions).thenAccept {}

    override fun getKnowledgeBase(
        params: KnowledgeBaseGetKnowledgeBaseParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<KnowledgeBaseGetKnowledgeBaseResponse> =
        // get /ai/missions/{mission_id}/knowledge-bases/{knowledge_base_id}
        withRawResponse().getKnowledgeBase(params, requestOptions).thenApply { it.parse() }

    override fun listKnowledgeBases(
        params: KnowledgeBaseListKnowledgeBasesParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<KnowledgeBaseListKnowledgeBasesResponse> =
        // get /ai/missions/{mission_id}/knowledge-bases
        withRawResponse().listKnowledgeBases(params, requestOptions).thenApply { it.parse() }

    override fun updateKnowledgeBase(
        params: KnowledgeBaseUpdateKnowledgeBaseParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<KnowledgeBaseUpdateKnowledgeBaseResponse> =
        // put /ai/missions/{mission_id}/knowledge-bases/{knowledge_base_id}
        withRawResponse().updateKnowledgeBase(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        KnowledgeBaseServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): KnowledgeBaseServiceAsync.WithRawResponse =
            KnowledgeBaseServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createKnowledgeBaseHandler: Handler<KnowledgeBaseCreateKnowledgeBaseResponse> =
            jsonHandler<KnowledgeBaseCreateKnowledgeBaseResponse>(clientOptions.jsonMapper)

        override fun createKnowledgeBase(
            params: KnowledgeBaseCreateKnowledgeBaseParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<KnowledgeBaseCreateKnowledgeBaseResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("missionId", params.missionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "missions", params._pathParam(0), "knowledge-bases")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createKnowledgeBaseHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val deleteKnowledgeBaseHandler: Handler<Void?> = emptyHandler()

        override fun deleteKnowledgeBase(
            params: KnowledgeBaseDeleteKnowledgeBaseParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("knowledgeBaseId", params.knowledgeBaseId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "ai",
                        "missions",
                        params._pathParam(0),
                        "knowledge-bases",
                        params._pathParam(1),
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { deleteKnowledgeBaseHandler.handle(it) }
                    }
                }
        }

        private val getKnowledgeBaseHandler: Handler<KnowledgeBaseGetKnowledgeBaseResponse> =
            jsonHandler<KnowledgeBaseGetKnowledgeBaseResponse>(clientOptions.jsonMapper)

        override fun getKnowledgeBase(
            params: KnowledgeBaseGetKnowledgeBaseParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<KnowledgeBaseGetKnowledgeBaseResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("knowledgeBaseId", params.knowledgeBaseId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "ai",
                        "missions",
                        params._pathParam(0),
                        "knowledge-bases",
                        params._pathParam(1),
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getKnowledgeBaseHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listKnowledgeBasesHandler: Handler<KnowledgeBaseListKnowledgeBasesResponse> =
            jsonHandler<KnowledgeBaseListKnowledgeBasesResponse>(clientOptions.jsonMapper)

        override fun listKnowledgeBases(
            params: KnowledgeBaseListKnowledgeBasesParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<KnowledgeBaseListKnowledgeBasesResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("missionId", params.missionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "missions", params._pathParam(0), "knowledge-bases")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listKnowledgeBasesHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val updateKnowledgeBaseHandler: Handler<KnowledgeBaseUpdateKnowledgeBaseResponse> =
            jsonHandler<KnowledgeBaseUpdateKnowledgeBaseResponse>(clientOptions.jsonMapper)

        override fun updateKnowledgeBase(
            params: KnowledgeBaseUpdateKnowledgeBaseParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<KnowledgeBaseUpdateKnowledgeBaseResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("knowledgeBaseId", params.knowledgeBaseId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "ai",
                        "missions",
                        params._pathParam(0),
                        "knowledge-bases",
                        params._pathParam(1),
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { updateKnowledgeBaseHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }
    }
}
