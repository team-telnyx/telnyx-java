// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai.missions.runs

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
import com.telnyx.sdk.models.ai.missions.runs.telnyxagents.TelnyxAgentLinkParams
import com.telnyx.sdk.models.ai.missions.runs.telnyxagents.TelnyxAgentLinkResponse
import com.telnyx.sdk.models.ai.missions.runs.telnyxagents.TelnyxAgentListParams
import com.telnyx.sdk.models.ai.missions.runs.telnyxagents.TelnyxAgentListResponse
import com.telnyx.sdk.models.ai.missions.runs.telnyxagents.TelnyxAgentUnlinkParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class TelnyxAgentServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    TelnyxAgentServiceAsync {

    private val withRawResponse: TelnyxAgentServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): TelnyxAgentServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): TelnyxAgentServiceAsync =
        TelnyxAgentServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: TelnyxAgentListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TelnyxAgentListResponse> =
        // get /ai/missions/{mission_id}/runs/{run_id}/telnyx-agents
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun link(
        params: TelnyxAgentLinkParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TelnyxAgentLinkResponse> =
        // post /ai/missions/{mission_id}/runs/{run_id}/telnyx-agents
        withRawResponse().link(params, requestOptions).thenApply { it.parse() }

    override fun unlink(
        params: TelnyxAgentUnlinkParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /ai/missions/{mission_id}/runs/{run_id}/telnyx-agents/{telnyx_agent_id}
        withRawResponse().unlink(params, requestOptions).thenAccept {}

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TelnyxAgentServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TelnyxAgentServiceAsync.WithRawResponse =
            TelnyxAgentServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<TelnyxAgentListResponse> =
            jsonHandler<TelnyxAgentListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: TelnyxAgentListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TelnyxAgentListResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("runId", params.runId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "ai",
                        "missions",
                        params._pathParam(0),
                        "runs",
                        params._pathParam(1),
                        "telnyx-agents",
                    )
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
                    }
                }
        }

        private val linkHandler: Handler<TelnyxAgentLinkResponse> =
            jsonHandler<TelnyxAgentLinkResponse>(clientOptions.jsonMapper)

        override fun link(
            params: TelnyxAgentLinkParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TelnyxAgentLinkResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("runId", params.runId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "ai",
                        "missions",
                        params._pathParam(0),
                        "runs",
                        params._pathParam(1),
                        "telnyx-agents",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { linkHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val unlinkHandler: Handler<Void?> = emptyHandler()

        override fun unlink(
            params: TelnyxAgentUnlinkParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("telnyxAgentId", params.telnyxAgentId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "ai",
                        "missions",
                        params._pathParam(0),
                        "runs",
                        params._pathParam(1),
                        "telnyx-agents",
                        params._pathParam(2),
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { unlinkHandler.handle(it) }
                    }
                }
        }
    }
}
