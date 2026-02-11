// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai

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
import com.telnyx.sdk.models.ai.missions.MissionCloneMissionParams
import com.telnyx.sdk.models.ai.missions.MissionCloneMissionResponse
import com.telnyx.sdk.models.ai.missions.MissionCreateParams
import com.telnyx.sdk.models.ai.missions.MissionCreateResponse
import com.telnyx.sdk.models.ai.missions.MissionDeleteMissionParams
import com.telnyx.sdk.models.ai.missions.MissionListEventsPage
import com.telnyx.sdk.models.ai.missions.MissionListEventsPageResponse
import com.telnyx.sdk.models.ai.missions.MissionListEventsParams
import com.telnyx.sdk.models.ai.missions.MissionListPage
import com.telnyx.sdk.models.ai.missions.MissionListPageResponse
import com.telnyx.sdk.models.ai.missions.MissionListParams
import com.telnyx.sdk.models.ai.missions.MissionRetrieveParams
import com.telnyx.sdk.models.ai.missions.MissionRetrieveResponse
import com.telnyx.sdk.models.ai.missions.MissionUpdateMissionParams
import com.telnyx.sdk.models.ai.missions.MissionUpdateMissionResponse
import com.telnyx.sdk.services.blocking.ai.missions.KnowledgeBaseService
import com.telnyx.sdk.services.blocking.ai.missions.KnowledgeBaseServiceImpl
import com.telnyx.sdk.services.blocking.ai.missions.McpServerService
import com.telnyx.sdk.services.blocking.ai.missions.McpServerServiceImpl
import com.telnyx.sdk.services.blocking.ai.missions.RunService
import com.telnyx.sdk.services.blocking.ai.missions.RunServiceImpl
import com.telnyx.sdk.services.blocking.ai.missions.ToolService
import com.telnyx.sdk.services.blocking.ai.missions.ToolServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class MissionServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    MissionService {

    private val withRawResponse: MissionService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val runs: RunService by lazy { RunServiceImpl(clientOptions) }

    private val knowledgeBases: KnowledgeBaseService by lazy {
        KnowledgeBaseServiceImpl(clientOptions)
    }

    private val mcpServers: McpServerService by lazy { McpServerServiceImpl(clientOptions) }

    private val tools: ToolService by lazy { ToolServiceImpl(clientOptions) }

    override fun withRawResponse(): MissionService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): MissionService =
        MissionServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun runs(): RunService = runs

    override fun knowledgeBases(): KnowledgeBaseService = knowledgeBases

    override fun mcpServers(): McpServerService = mcpServers

    override fun tools(): ToolService = tools

    override fun create(
        params: MissionCreateParams,
        requestOptions: RequestOptions,
    ): MissionCreateResponse =
        // post /ai/missions
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: MissionRetrieveParams,
        requestOptions: RequestOptions,
    ): MissionRetrieveResponse =
        // get /ai/missions/{mission_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(params: MissionListParams, requestOptions: RequestOptions): MissionListPage =
        // get /ai/missions
        withRawResponse().list(params, requestOptions).parse()

    override fun cloneMission(
        params: MissionCloneMissionParams,
        requestOptions: RequestOptions,
    ): MissionCloneMissionResponse =
        // post /ai/missions/{mission_id}/clone
        withRawResponse().cloneMission(params, requestOptions).parse()

    override fun deleteMission(params: MissionDeleteMissionParams, requestOptions: RequestOptions) {
        // delete /ai/missions/{mission_id}
        withRawResponse().deleteMission(params, requestOptions)
    }

    override fun listEvents(
        params: MissionListEventsParams,
        requestOptions: RequestOptions,
    ): MissionListEventsPage =
        // get /ai/missions/events
        withRawResponse().listEvents(params, requestOptions).parse()

    override fun updateMission(
        params: MissionUpdateMissionParams,
        requestOptions: RequestOptions,
    ): MissionUpdateMissionResponse =
        // put /ai/missions/{mission_id}
        withRawResponse().updateMission(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MissionService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val runs: RunService.WithRawResponse by lazy {
            RunServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val knowledgeBases: KnowledgeBaseService.WithRawResponse by lazy {
            KnowledgeBaseServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val mcpServers: McpServerService.WithRawResponse by lazy {
            McpServerServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val tools: ToolService.WithRawResponse by lazy {
            ToolServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MissionService.WithRawResponse =
            MissionServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun runs(): RunService.WithRawResponse = runs

        override fun knowledgeBases(): KnowledgeBaseService.WithRawResponse = knowledgeBases

        override fun mcpServers(): McpServerService.WithRawResponse = mcpServers

        override fun tools(): ToolService.WithRawResponse = tools

        private val createHandler: Handler<MissionCreateResponse> =
            jsonHandler<MissionCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: MissionCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MissionCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "missions")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveHandler: Handler<MissionRetrieveResponse> =
            jsonHandler<MissionRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: MissionRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MissionRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("missionId", params.missionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "missions", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<MissionListPageResponse> =
            jsonHandler<MissionListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: MissionListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MissionListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "missions")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        MissionListPage.builder()
                            .service(MissionServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val cloneMissionHandler: Handler<MissionCloneMissionResponse> =
            jsonHandler<MissionCloneMissionResponse>(clientOptions.jsonMapper)

        override fun cloneMission(
            params: MissionCloneMissionParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MissionCloneMissionResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("missionId", params.missionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "missions", params._pathParam(0), "clone")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { cloneMissionHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val deleteMissionHandler: Handler<Void?> = emptyHandler()

        override fun deleteMission(
            params: MissionDeleteMissionParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("missionId", params.missionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "missions", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteMissionHandler.handle(it) }
            }
        }

        private val listEventsHandler: Handler<MissionListEventsPageResponse> =
            jsonHandler<MissionListEventsPageResponse>(clientOptions.jsonMapper)

        override fun listEvents(
            params: MissionListEventsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MissionListEventsPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "missions", "events")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listEventsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        MissionListEventsPage.builder()
                            .service(MissionServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val updateMissionHandler: Handler<MissionUpdateMissionResponse> =
            jsonHandler<MissionUpdateMissionResponse>(clientOptions.jsonMapper)

        override fun updateMission(
            params: MissionUpdateMissionParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MissionUpdateMissionResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("missionId", params.missionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "missions", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateMissionHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
