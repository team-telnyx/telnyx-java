// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai.conversations.insightgroups

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.handlers.emptyHandler
import com.telnyx.sdk.core.handlers.errorBodyHandler
import com.telnyx.sdk.core.handlers.errorHandler
import com.telnyx.sdk.core.http.HttpMethod
import com.telnyx.sdk.core.http.HttpRequest
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponse.Handler
import com.telnyx.sdk.core.http.json
import com.telnyx.sdk.core.http.parseable
import com.telnyx.sdk.core.prepareAsync
import com.telnyx.sdk.models.ai.conversations.insightgroups.insights.InsightAssignParams
import com.telnyx.sdk.models.ai.conversations.insightgroups.insights.InsightDeleteUnassignParams
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
    ): CompletableFuture<Void?> =
        // post /ai/conversations/insight-groups/{group_id}/insights/{insight_id}/assign
        withRawResponse().assign(params, requestOptions).thenAccept {}

    override fun deleteUnassign(
        params: InsightDeleteUnassignParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /ai/conversations/insight-groups/{group_id}/insights/{insight_id}/unassign
        withRawResponse().deleteUnassign(params, requestOptions).thenAccept {}

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

        private val assignHandler: Handler<Void?> = emptyHandler()

        override fun assign(
            params: InsightAssignParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
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
                        response.use { assignHandler.handle(it) }
                    }
                }
        }

        private val deleteUnassignHandler: Handler<Void?> = emptyHandler()

        override fun deleteUnassign(
            params: InsightDeleteUnassignParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
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
                        response.use { deleteUnassignHandler.handle(it) }
                    }
                }
        }
    }
}
