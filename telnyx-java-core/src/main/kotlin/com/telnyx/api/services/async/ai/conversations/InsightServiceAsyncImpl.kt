// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async.ai.conversations

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
import com.telnyx.api.models.ai.conversations.insights.InsightCreateParams
import com.telnyx.api.models.ai.conversations.insights.InsightDeleteParams
import com.telnyx.api.models.ai.conversations.insights.InsightDeleteResponse
import com.telnyx.api.models.ai.conversations.insights.InsightListParams
import com.telnyx.api.models.ai.conversations.insights.InsightListResponse
import com.telnyx.api.models.ai.conversations.insights.InsightRetrieveParams
import com.telnyx.api.models.ai.conversations.insights.InsightTemplateDetail
import com.telnyx.api.models.ai.conversations.insights.InsightUpdateParams
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

    override fun create(
        params: InsightCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<InsightTemplateDetail> =
        // post /ai/conversations/insights
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: InsightRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<InsightTemplateDetail> =
        // get /ai/conversations/insights/{insight_id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: InsightUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<InsightTemplateDetail> =
        // put /ai/conversations/insights/{insight_id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: InsightListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<InsightListResponse> =
        // get /ai/conversations/insights
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: InsightDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<InsightDeleteResponse> =
        // delete /ai/conversations/insights/{insight_id}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

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

        private val createHandler: Handler<InsightTemplateDetail> =
            jsonHandler<InsightTemplateDetail>(clientOptions.jsonMapper)

        override fun create(
            params: InsightCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InsightTemplateDetail>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "conversations", "insights")
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

        private val retrieveHandler: Handler<InsightTemplateDetail> =
            jsonHandler<InsightTemplateDetail>(clientOptions.jsonMapper)

        override fun retrieve(
            params: InsightRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InsightTemplateDetail>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("insightId", params.insightId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "conversations", "insights", params._pathParam(0))
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

        private val updateHandler: Handler<InsightTemplateDetail> =
            jsonHandler<InsightTemplateDetail>(clientOptions.jsonMapper)

        override fun update(
            params: InsightUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InsightTemplateDetail>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("insightId", params.insightId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "conversations", "insights", params._pathParam(0))
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

        private val listHandler: Handler<InsightListResponse> =
            jsonHandler<InsightListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: InsightListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InsightListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "conversations", "insights")
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

        private val deleteHandler: Handler<InsightDeleteResponse> =
            jsonHandler<InsightDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: InsightDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InsightDeleteResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("insightId", params.insightId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "conversations", "insights", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { deleteHandler.handle(it) }
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
