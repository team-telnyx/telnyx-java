// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai.missions.runs

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
import com.telnyx.sdk.models.ai.missions.runs.telnyxagents.TelnyxAgentLinkParams
import com.telnyx.sdk.models.ai.missions.runs.telnyxagents.TelnyxAgentLinkResponse
import com.telnyx.sdk.models.ai.missions.runs.telnyxagents.TelnyxAgentListParams
import com.telnyx.sdk.models.ai.missions.runs.telnyxagents.TelnyxAgentListResponse
import com.telnyx.sdk.models.ai.missions.runs.telnyxagents.TelnyxAgentUnlinkParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class TelnyxAgentServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    TelnyxAgentService {

    private val withRawResponse: TelnyxAgentService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): TelnyxAgentService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): TelnyxAgentService =
        TelnyxAgentServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: TelnyxAgentListParams,
        requestOptions: RequestOptions,
    ): TelnyxAgentListResponse =
        // get /ai/missions/{mission_id}/runs/{run_id}/telnyx-agents
        withRawResponse().list(params, requestOptions).parse()

    override fun link(
        params: TelnyxAgentLinkParams,
        requestOptions: RequestOptions,
    ): TelnyxAgentLinkResponse =
        // post /ai/missions/{mission_id}/runs/{run_id}/telnyx-agents
        withRawResponse().link(params, requestOptions).parse()

    override fun unlink(params: TelnyxAgentUnlinkParams, requestOptions: RequestOptions) {
        // delete /ai/missions/{mission_id}/runs/{run_id}/telnyx-agents/{telnyx_agent_id}
        withRawResponse().unlink(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TelnyxAgentService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TelnyxAgentService.WithRawResponse =
            TelnyxAgentServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<TelnyxAgentListResponse> =
            jsonHandler<TelnyxAgentListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: TelnyxAgentListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TelnyxAgentListResponse> {
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
            }
        }

        private val linkHandler: Handler<TelnyxAgentLinkResponse> =
            jsonHandler<TelnyxAgentLinkResponse>(clientOptions.jsonMapper)

        override fun link(
            params: TelnyxAgentLinkParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TelnyxAgentLinkResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { linkHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val unlinkHandler: Handler<Void?> = emptyHandler()

        override fun unlink(
            params: TelnyxAgentUnlinkParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { unlinkHandler.handle(it) }
            }
        }
    }
}
