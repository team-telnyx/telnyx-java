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
import com.telnyx.sdk.models.ai.mcpservers.McpServerCreateParams
import com.telnyx.sdk.models.ai.mcpservers.McpServerCreateResponse
import com.telnyx.sdk.models.ai.mcpservers.McpServerDeleteParams
import com.telnyx.sdk.models.ai.mcpservers.McpServerListPageAsync
import com.telnyx.sdk.models.ai.mcpservers.McpServerListParams
import com.telnyx.sdk.models.ai.mcpservers.McpServerListResponse
import com.telnyx.sdk.models.ai.mcpservers.McpServerRetrieveParams
import com.telnyx.sdk.models.ai.mcpservers.McpServerRetrieveResponse
import com.telnyx.sdk.models.ai.mcpservers.McpServerUpdateParams
import com.telnyx.sdk.models.ai.mcpservers.McpServerUpdateResponse
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

    override fun create(
        params: McpServerCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<McpServerCreateResponse> =
        // post /ai/mcp_servers
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: McpServerRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<McpServerRetrieveResponse> =
        // get /ai/mcp_servers/{mcp_server_id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: McpServerUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<McpServerUpdateResponse> =
        // put /ai/mcp_servers/{mcp_server_id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: McpServerListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<McpServerListPageAsync> =
        // get /ai/mcp_servers
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: McpServerDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /ai/mcp_servers/{mcp_server_id}
        withRawResponse().delete(params, requestOptions).thenAccept {}

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

        private val createHandler: Handler<McpServerCreateResponse> =
            jsonHandler<McpServerCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: McpServerCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<McpServerCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "mcp_servers")
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

        private val retrieveHandler: Handler<McpServerRetrieveResponse> =
            jsonHandler<McpServerRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: McpServerRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<McpServerRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("mcpServerId", params.mcpServerId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "mcp_servers", params._pathParam(0))
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

        private val updateHandler: Handler<McpServerUpdateResponse> =
            jsonHandler<McpServerUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: McpServerUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<McpServerUpdateResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("mcpServerId", params.mcpServerId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "mcp_servers", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { updateHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listHandler: Handler<List<McpServerListResponse>> =
            jsonHandler<List<McpServerListResponse>>(clientOptions.jsonMapper)

        override fun list(
            params: McpServerListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<McpServerListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "mcp_servers")
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
                                    it.forEach { it.validate() }
                                }
                            }
                            .let {
                                McpServerListPageAsync.builder()
                                    .service(McpServerServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .items(it)
                                    .build()
                            }
                    }
                }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: McpServerDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("mcpServerId", params.mcpServerId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "mcp_servers", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { deleteHandler.handle(it) }
                    }
                }
        }
    }
}
