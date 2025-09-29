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
import com.telnyx.api.models.ai.conversations.insightgroups.InsightGroupDeleteParams
import com.telnyx.api.models.ai.conversations.insightgroups.InsightGroupDeleteResponse
import com.telnyx.api.models.ai.conversations.insightgroups.InsightGroupInsightGroupsParams
import com.telnyx.api.models.ai.conversations.insightgroups.InsightGroupRetrieveInsightGroupsParams
import com.telnyx.api.models.ai.conversations.insightgroups.InsightGroupRetrieveInsightGroupsResponse
import com.telnyx.api.models.ai.conversations.insightgroups.InsightGroupRetrieveParams
import com.telnyx.api.models.ai.conversations.insightgroups.InsightGroupUpdateParams
import com.telnyx.api.models.ai.conversations.insightgroups.InsightTemplateGroupDetail
import com.telnyx.api.services.async.ai.conversations.insightgroups.InsightServiceAsync
import com.telnyx.api.services.async.ai.conversations.insightgroups.InsightServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class InsightGroupServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    InsightGroupServiceAsync {

    private val withRawResponse: InsightGroupServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val insights: InsightServiceAsync by lazy { InsightServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): InsightGroupServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): InsightGroupServiceAsync =
        InsightGroupServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun insights(): InsightServiceAsync = insights

    override fun retrieve(
        params: InsightGroupRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<InsightTemplateGroupDetail> =
        // get /ai/conversations/insight-groups/{group_id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: InsightGroupUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<InsightTemplateGroupDetail> =
        // put /ai/conversations/insight-groups/{group_id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: InsightGroupDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<InsightGroupDeleteResponse> =
        // delete /ai/conversations/insight-groups/{group_id}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    override fun insightGroups(
        params: InsightGroupInsightGroupsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<InsightTemplateGroupDetail> =
        // post /ai/conversations/insight-groups
        withRawResponse().insightGroups(params, requestOptions).thenApply { it.parse() }

    override fun retrieveInsightGroups(
        params: InsightGroupRetrieveInsightGroupsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<InsightGroupRetrieveInsightGroupsResponse> =
        // get /ai/conversations/insight-groups
        withRawResponse().retrieveInsightGroups(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        InsightGroupServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val insights: InsightServiceAsync.WithRawResponse by lazy {
            InsightServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): InsightGroupServiceAsync.WithRawResponse =
            InsightGroupServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun insights(): InsightServiceAsync.WithRawResponse = insights

        private val retrieveHandler: Handler<InsightTemplateGroupDetail> =
            jsonHandler<InsightTemplateGroupDetail>(clientOptions.jsonMapper)

        override fun retrieve(
            params: InsightGroupRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InsightTemplateGroupDetail>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("groupId", params.groupId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "conversations", "insight-groups", params._pathParam(0))
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

        private val updateHandler: Handler<InsightTemplateGroupDetail> =
            jsonHandler<InsightTemplateGroupDetail>(clientOptions.jsonMapper)

        override fun update(
            params: InsightGroupUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InsightTemplateGroupDetail>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("groupId", params.groupId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "conversations", "insight-groups", params._pathParam(0))
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

        private val deleteHandler: Handler<InsightGroupDeleteResponse> =
            jsonHandler<InsightGroupDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: InsightGroupDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InsightGroupDeleteResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("groupId", params.groupId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "conversations", "insight-groups", params._pathParam(0))
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

        private val insightGroupsHandler: Handler<InsightTemplateGroupDetail> =
            jsonHandler<InsightTemplateGroupDetail>(clientOptions.jsonMapper)

        override fun insightGroups(
            params: InsightGroupInsightGroupsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InsightTemplateGroupDetail>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "conversations", "insight-groups")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { insightGroupsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveInsightGroupsHandler:
            Handler<InsightGroupRetrieveInsightGroupsResponse> =
            jsonHandler<InsightGroupRetrieveInsightGroupsResponse>(clientOptions.jsonMapper)

        override fun retrieveInsightGroups(
            params: InsightGroupRetrieveInsightGroupsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InsightGroupRetrieveInsightGroupsResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "conversations", "insight-groups")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveInsightGroupsHandler.handle(it) }
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
