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
import com.telnyx.sdk.models.ai.missions.mcpservers.McpServerCreateMcpServerParams
import com.telnyx.sdk.models.ai.missions.mcpservers.McpServerCreateMcpServerResponse
import com.telnyx.sdk.models.ai.missions.mcpservers.McpServerDeleteMcpServerParams
import com.telnyx.sdk.models.ai.missions.mcpservers.McpServerGetMcpServerParams
import com.telnyx.sdk.models.ai.missions.mcpservers.McpServerGetMcpServerResponse
import com.telnyx.sdk.models.ai.missions.mcpservers.McpServerListMcpServersParams
import com.telnyx.sdk.models.ai.missions.mcpservers.McpServerListMcpServersResponse
import com.telnyx.sdk.models.ai.missions.mcpservers.McpServerUpdateMcpServerParams
import com.telnyx.sdk.models.ai.missions.mcpservers.McpServerUpdateMcpServerResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class McpServerServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    McpServerServiceAsync {

    private val withRawResponse: McpServerServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): McpServerServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): McpServerServiceAsync =
        McpServerServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun createMcpServer(
        params: McpServerCreateMcpServerParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<McpServerCreateMcpServerResponse> =
        // post /ai/missions/{mission_id}/mcp-servers
        withRawResponse().createMcpServer(params, requestOptions).thenApply { it.parse() }

    override fun deleteMcpServer(
        params: McpServerDeleteMcpServerParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /ai/missions/{mission_id}/mcp-servers/{mcp_server_id}
        withRawResponse().deleteMcpServer(params, requestOptions).thenAccept {}

    override fun getMcpServer(
        params: McpServerGetMcpServerParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<McpServerGetMcpServerResponse> =
        // get /ai/missions/{mission_id}/mcp-servers/{mcp_server_id}
        withRawResponse().getMcpServer(params, requestOptions).thenApply { it.parse() }

    override fun listMcpServers(
        params: McpServerListMcpServersParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<McpServerListMcpServersResponse> =
        // get /ai/missions/{mission_id}/mcp-servers
        withRawResponse().listMcpServers(params, requestOptions).thenApply { it.parse() }

    override fun updateMcpServer(
        params: McpServerUpdateMcpServerParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<McpServerUpdateMcpServerResponse> =
        // put /ai/missions/{mission_id}/mcp-servers/{mcp_server_id}
        withRawResponse().updateMcpServer(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        McpServerServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): McpServerServiceAsync.WithRawResponse =
            McpServerServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createMcpServerHandler: Handler<McpServerCreateMcpServerResponse> =
            jsonHandler<McpServerCreateMcpServerResponse>(clientOptions.jsonMapper)

        override fun createMcpServer(
            params: McpServerCreateMcpServerParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<McpServerCreateMcpServerResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("missionId", params.missionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "missions", params._pathParam(0), "mcp-servers")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createMcpServerHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val deleteMcpServerHandler: Handler<Void?> = emptyHandler()

        override fun deleteMcpServer(
            params: McpServerDeleteMcpServerParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("mcpServerId", params.mcpServerId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "ai",
                        "missions",
                        params._pathParam(0),
                        "mcp-servers",
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
                        response.use { deleteMcpServerHandler.handle(it) }
                    }
                }
        }

        private val getMcpServerHandler: Handler<McpServerGetMcpServerResponse> =
            jsonHandler<McpServerGetMcpServerResponse>(clientOptions.jsonMapper)

        override fun getMcpServer(
            params: McpServerGetMcpServerParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<McpServerGetMcpServerResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("mcpServerId", params.mcpServerId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "ai",
                        "missions",
                        params._pathParam(0),
                        "mcp-servers",
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
                            .use { getMcpServerHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listMcpServersHandler: Handler<McpServerListMcpServersResponse> =
            jsonHandler<McpServerListMcpServersResponse>(clientOptions.jsonMapper)

        override fun listMcpServers(
            params: McpServerListMcpServersParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<McpServerListMcpServersResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("missionId", params.missionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "missions", params._pathParam(0), "mcp-servers")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listMcpServersHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val updateMcpServerHandler: Handler<McpServerUpdateMcpServerResponse> =
            jsonHandler<McpServerUpdateMcpServerResponse>(clientOptions.jsonMapper)

        override fun updateMcpServer(
            params: McpServerUpdateMcpServerParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<McpServerUpdateMcpServerResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("mcpServerId", params.mcpServerId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "ai",
                        "missions",
                        params._pathParam(0),
                        "mcp-servers",
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
                            .use { updateMcpServerHandler.handle(it) }
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
