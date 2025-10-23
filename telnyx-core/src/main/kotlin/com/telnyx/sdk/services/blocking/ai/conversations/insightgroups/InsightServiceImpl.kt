// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai.conversations.insightgroups

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.checkRequired
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
import com.telnyx.sdk.models.ai.conversations.insightgroups.insights.InsightAssignParams
import com.telnyx.sdk.models.ai.conversations.insightgroups.insights.InsightAssignResponse
import com.telnyx.sdk.models.ai.conversations.insightgroups.insights.InsightDeleteUnassignParams
import com.telnyx.sdk.models.ai.conversations.insightgroups.insights.InsightDeleteUnassignResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class InsightServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    InsightService {

    private val withRawResponse: InsightService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): InsightService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): InsightService =
        InsightServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun assign(
        params: InsightAssignParams,
        requestOptions: RequestOptions,
    ): InsightAssignResponse =
        // post /ai/conversations/insight-groups/{group_id}/insights/{insight_id}/assign
        withRawResponse().assign(params, requestOptions).parse()

    override fun deleteUnassign(
        params: InsightDeleteUnassignParams,
        requestOptions: RequestOptions,
    ): InsightDeleteUnassignResponse =
        // delete /ai/conversations/insight-groups/{group_id}/insights/{insight_id}/unassign
        withRawResponse().deleteUnassign(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        InsightService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): InsightService.WithRawResponse =
            InsightServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val assignHandler: Handler<InsightAssignResponse> =
            jsonHandler<InsightAssignResponse>(clientOptions.jsonMapper)

        override fun assign(
            params: InsightAssignParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InsightAssignResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("insightId", params.insightId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "ai",
                        "conversations",
                        "insight-groups",
                        params._pathParam(0),
                        "insights",
                        params._pathParam(1),
                        "assign",
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { assignHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val deleteUnassignHandler: Handler<InsightDeleteUnassignResponse> =
            jsonHandler<InsightDeleteUnassignResponse>(clientOptions.jsonMapper)

        override fun deleteUnassign(
            params: InsightDeleteUnassignParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InsightDeleteUnassignResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("insightId", params.insightId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "ai",
                        "conversations",
                        "insight-groups",
                        params._pathParam(0),
                        "insights",
                        params._pathParam(1),
                        "unassign",
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { deleteUnassignHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
