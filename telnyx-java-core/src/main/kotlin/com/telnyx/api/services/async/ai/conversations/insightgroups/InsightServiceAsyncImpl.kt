// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async.ai.conversations.insightgroups

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.checkRequired
import com.telnyx.api.core.handlers.errorBodyHandler
import com.telnyx.api.core.handlers.errorHandler
import com.telnyx.api.core.handlers.jsonHandler
import com.telnyx.api.core.http.HttpMethod
import com.telnyx.api.core.http.HttpRequest
import com.telnyx.api.core.http.HttpResponse
import com.telnyx.api.core.http.HttpResponse.Handler
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.core.http.json
import com.telnyx.api.core.http.parseable
import com.telnyx.api.core.prepareAsync
import com.telnyx.api.models.ai.conversations.insightgroups.insights.InsightAssignParams
import com.telnyx.api.models.ai.conversations.insightgroups.insights.InsightAssignResponse
import com.telnyx.api.models.ai.conversations.insightgroups.insights.InsightDeleteUnassignParams
import com.telnyx.api.models.ai.conversations.insightgroups.insights.InsightDeleteUnassignResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class InsightServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    InsightServiceAsync {

    private val withRawResponse: InsightServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): InsightServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): InsightServiceAsync =
        InsightServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun assign(
        params: InsightAssignParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<InsightAssignResponse> =
        // post /ai/conversations/insight-groups/{group_id}/insights/{insight_id}/assign
        withRawResponse().assign(params, requestOptions).thenApply { it.parse() }

    override fun deleteUnassign(
        params: InsightDeleteUnassignParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<InsightDeleteUnassignResponse> =
        // delete /ai/conversations/insight-groups/{group_id}/insights/{insight_id}/unassign
        withRawResponse().deleteUnassign(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        InsightServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): InsightServiceAsync.WithRawResponse =
            InsightServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val assignHandler: Handler<InsightAssignResponse> =
            jsonHandler<InsightAssignResponse>(clientOptions.jsonMapper)

        override fun assign(
            params: InsightAssignParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InsightAssignResponse>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { assignHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val deleteUnassignHandler: Handler<InsightDeleteUnassignResponse> =
            jsonHandler<InsightDeleteUnassignResponse>(clientOptions.jsonMapper)

        override fun deleteUnassign(
            params: InsightDeleteUnassignParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InsightDeleteUnassignResponse>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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
}
