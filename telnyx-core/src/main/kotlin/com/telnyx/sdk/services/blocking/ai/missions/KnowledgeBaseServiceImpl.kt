// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai.missions

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
import com.telnyx.sdk.core.prepare
import com.telnyx.sdk.models.ai.missions.knowledgebases.KnowledgeBaseCreateKnowledgeBaseParams
import com.telnyx.sdk.models.ai.missions.knowledgebases.KnowledgeBaseCreateKnowledgeBaseResponse
import com.telnyx.sdk.models.ai.missions.knowledgebases.KnowledgeBaseDeleteKnowledgeBaseParams
import com.telnyx.sdk.models.ai.missions.knowledgebases.KnowledgeBaseGetKnowledgeBaseParams
import com.telnyx.sdk.models.ai.missions.knowledgebases.KnowledgeBaseGetKnowledgeBaseResponse
import com.telnyx.sdk.models.ai.missions.knowledgebases.KnowledgeBaseListKnowledgeBasesParams
import com.telnyx.sdk.models.ai.missions.knowledgebases.KnowledgeBaseListKnowledgeBasesResponse
import com.telnyx.sdk.models.ai.missions.knowledgebases.KnowledgeBaseUpdateKnowledgeBaseParams
import com.telnyx.sdk.models.ai.missions.knowledgebases.KnowledgeBaseUpdateKnowledgeBaseResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class KnowledgeBaseServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    KnowledgeBaseService {

    private val withRawResponse: KnowledgeBaseService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): KnowledgeBaseService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): KnowledgeBaseService =
        KnowledgeBaseServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun createKnowledgeBase(
        params: KnowledgeBaseCreateKnowledgeBaseParams,
        requestOptions: RequestOptions,
    ): KnowledgeBaseCreateKnowledgeBaseResponse =
        // post /ai/missions/{mission_id}/knowledge-bases
        withRawResponse().createKnowledgeBase(params, requestOptions).parse()

    override fun deleteKnowledgeBase(
        params: KnowledgeBaseDeleteKnowledgeBaseParams,
        requestOptions: RequestOptions,
    ) {
        // delete /ai/missions/{mission_id}/knowledge-bases/{knowledge_base_id}
        withRawResponse().deleteKnowledgeBase(params, requestOptions)
    }

    override fun getKnowledgeBase(
        params: KnowledgeBaseGetKnowledgeBaseParams,
        requestOptions: RequestOptions,
    ): KnowledgeBaseGetKnowledgeBaseResponse =
        // get /ai/missions/{mission_id}/knowledge-bases/{knowledge_base_id}
        withRawResponse().getKnowledgeBase(params, requestOptions).parse()

    override fun listKnowledgeBases(
        params: KnowledgeBaseListKnowledgeBasesParams,
        requestOptions: RequestOptions,
    ): KnowledgeBaseListKnowledgeBasesResponse =
        // get /ai/missions/{mission_id}/knowledge-bases
        withRawResponse().listKnowledgeBases(params, requestOptions).parse()

    override fun updateKnowledgeBase(
        params: KnowledgeBaseUpdateKnowledgeBaseParams,
        requestOptions: RequestOptions,
    ): KnowledgeBaseUpdateKnowledgeBaseResponse =
        // put /ai/missions/{mission_id}/knowledge-bases/{knowledge_base_id}
        withRawResponse().updateKnowledgeBase(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        KnowledgeBaseService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): KnowledgeBaseService.WithRawResponse =
            KnowledgeBaseServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createKnowledgeBaseHandler: Handler<KnowledgeBaseCreateKnowledgeBaseResponse> =
            jsonHandler<KnowledgeBaseCreateKnowledgeBaseResponse>(clientOptions.jsonMapper)

        override fun createKnowledgeBase(
            params: KnowledgeBaseCreateKnowledgeBaseParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<KnowledgeBaseCreateKnowledgeBaseResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createKnowledgeBaseHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val deleteKnowledgeBaseHandler: Handler<Void?> = emptyHandler()

        override fun deleteKnowledgeBase(
            params: KnowledgeBaseDeleteKnowledgeBaseParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteKnowledgeBaseHandler.handle(it) }
            }
        }

        private val getKnowledgeBaseHandler: Handler<KnowledgeBaseGetKnowledgeBaseResponse> =
            jsonHandler<KnowledgeBaseGetKnowledgeBaseResponse>(clientOptions.jsonMapper)

        override fun getKnowledgeBase(
            params: KnowledgeBaseGetKnowledgeBaseParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<KnowledgeBaseGetKnowledgeBaseResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getKnowledgeBaseHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listKnowledgeBasesHandler: Handler<KnowledgeBaseListKnowledgeBasesResponse> =
            jsonHandler<KnowledgeBaseListKnowledgeBasesResponse>(clientOptions.jsonMapper)

        override fun listKnowledgeBases(
            params: KnowledgeBaseListKnowledgeBasesParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<KnowledgeBaseListKnowledgeBasesResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("missionId", params.missionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "missions", params._pathParam(0), "knowledge-bases")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listKnowledgeBasesHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateKnowledgeBaseHandler: Handler<KnowledgeBaseUpdateKnowledgeBaseResponse> =
            jsonHandler<KnowledgeBaseUpdateKnowledgeBaseResponse>(clientOptions.jsonMapper)

        override fun updateKnowledgeBase(
            params: KnowledgeBaseUpdateKnowledgeBaseParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<KnowledgeBaseUpdateKnowledgeBaseResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
