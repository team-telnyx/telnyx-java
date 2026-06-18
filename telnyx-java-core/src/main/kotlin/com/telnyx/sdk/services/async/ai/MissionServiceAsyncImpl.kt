// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai

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
import com.telnyx.sdk.models.ai.missions.MissionCloneMissionParams
import com.telnyx.sdk.models.ai.missions.MissionCloneMissionResponse
import com.telnyx.sdk.models.ai.missions.MissionCreateParams
import com.telnyx.sdk.models.ai.missions.MissionCreateResponse
import com.telnyx.sdk.models.ai.missions.MissionDeleteMissionParams
import com.telnyx.sdk.models.ai.missions.MissionListEventsPageAsync
import com.telnyx.sdk.models.ai.missions.MissionListEventsPageResponse
import com.telnyx.sdk.models.ai.missions.MissionListEventsParams
import com.telnyx.sdk.models.ai.missions.MissionListPageAsync
import com.telnyx.sdk.models.ai.missions.MissionListPageResponse
import com.telnyx.sdk.models.ai.missions.MissionListParams
import com.telnyx.sdk.models.ai.missions.MissionRetrieveParams
import com.telnyx.sdk.models.ai.missions.MissionRetrieveResponse
import com.telnyx.sdk.models.ai.missions.MissionUpdateMissionParams
import com.telnyx.sdk.models.ai.missions.MissionUpdateMissionResponse
import com.telnyx.sdk.services.async.ai.missions.KnowledgeBaseServiceAsync
import com.telnyx.sdk.services.async.ai.missions.KnowledgeBaseServiceAsyncImpl
import com.telnyx.sdk.services.async.ai.missions.McpServerServiceAsync
import com.telnyx.sdk.services.async.ai.missions.McpServerServiceAsyncImpl
import com.telnyx.sdk.services.async.ai.missions.RunServiceAsync
import com.telnyx.sdk.services.async.ai.missions.RunServiceAsyncImpl
import com.telnyx.sdk.services.async.ai.missions.ToolServiceAsync
import com.telnyx.sdk.services.async.ai.missions.ToolServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class MissionServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    MissionServiceAsync {

    private val withRawResponse: MissionServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val runs: RunServiceAsync by lazy { RunServiceAsyncImpl(clientOptions) }

    private val knowledgeBases: KnowledgeBaseServiceAsync by lazy {
        KnowledgeBaseServiceAsyncImpl(clientOptions)
    }

    private val mcpServers: McpServerServiceAsync by lazy {
        McpServerServiceAsyncImpl(clientOptions)
    }

    private val tools: ToolServiceAsync by lazy { ToolServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): MissionServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): MissionServiceAsync =
        MissionServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun runs(): RunServiceAsync = runs

    override fun knowledgeBases(): KnowledgeBaseServiceAsync = knowledgeBases

    override fun mcpServers(): McpServerServiceAsync = mcpServers

    override fun tools(): ToolServiceAsync = tools

    override fun create(
        params: MissionCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MissionCreateResponse> =
        // post /ai/missions
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: MissionRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MissionRetrieveResponse> =
        // get /ai/missions/{mission_id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: MissionListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MissionListPageAsync> =
        // get /ai/missions
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun cloneMission(
        params: MissionCloneMissionParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MissionCloneMissionResponse> =
        // post /ai/missions/{mission_id}/clone
        withRawResponse().cloneMission(params, requestOptions).thenApply { it.parse() }

    override fun deleteMission(
        params: MissionDeleteMissionParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /ai/missions/{mission_id}
        withRawResponse().deleteMission(params, requestOptions).thenAccept {}

    override fun listEvents(
        params: MissionListEventsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MissionListEventsPageAsync> =
        // get /ai/missions/events
        withRawResponse().listEvents(params, requestOptions).thenApply { it.parse() }

    override fun updateMission(
        params: MissionUpdateMissionParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MissionUpdateMissionResponse> =
        // put /ai/missions/{mission_id}
        withRawResponse().updateMission(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MissionServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val runs: RunServiceAsync.WithRawResponse by lazy {
            RunServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val knowledgeBases: KnowledgeBaseServiceAsync.WithRawResponse by lazy {
            KnowledgeBaseServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val mcpServers: McpServerServiceAsync.WithRawResponse by lazy {
            McpServerServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val tools: ToolServiceAsync.WithRawResponse by lazy {
            ToolServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MissionServiceAsync.WithRawResponse =
            MissionServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun runs(): RunServiceAsync.WithRawResponse = runs

        override fun knowledgeBases(): KnowledgeBaseServiceAsync.WithRawResponse = knowledgeBases

        override fun mcpServers(): McpServerServiceAsync.WithRawResponse = mcpServers

        override fun tools(): ToolServiceAsync.WithRawResponse = tools

        private val createHandler: Handler<MissionCreateResponse> =
            jsonHandler<MissionCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: MissionCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MissionCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "missions")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveHandler: Handler<MissionRetrieveResponse> =
            jsonHandler<MissionRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: MissionRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MissionRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("missionId", params.missionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "missions", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listHandler: Handler<MissionListPageResponse> =
            jsonHandler<MissionListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: MissionListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MissionListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "missions")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                MissionListPageAsync.builder()
                                    .service(MissionServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val cloneMissionHandler: Handler<MissionCloneMissionResponse> =
            jsonHandler<MissionCloneMissionResponse>(clientOptions.jsonMapper)

        override fun cloneMission(
            params: MissionCloneMissionParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MissionCloneMissionResponse>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { cloneMissionHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val deleteMissionHandler: Handler<Void?> = emptyHandler()

        override fun deleteMission(
            params: MissionDeleteMissionParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { deleteMissionHandler.handle(it) }
                    }
                }
        }

        private val listEventsHandler: Handler<MissionListEventsPageResponse> =
            jsonHandler<MissionListEventsPageResponse>(clientOptions.jsonMapper)

        override fun listEvents(
            params: MissionListEventsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MissionListEventsPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "missions", "events")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listEventsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                MissionListEventsPageAsync.builder()
                                    .service(MissionServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val updateMissionHandler: Handler<MissionUpdateMissionResponse> =
            jsonHandler<MissionUpdateMissionResponse>(clientOptions.jsonMapper)

        override fun updateMission(
            params: MissionUpdateMissionParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MissionUpdateMissionResponse>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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
}
