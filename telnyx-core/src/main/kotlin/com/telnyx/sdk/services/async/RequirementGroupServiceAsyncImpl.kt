// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

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
import com.telnyx.sdk.core.prepareAsync
import com.telnyx.sdk.models.requirementgroups.RequirementGroup
import com.telnyx.sdk.models.requirementgroups.RequirementGroupCreateParams
import com.telnyx.sdk.models.requirementgroups.RequirementGroupDeleteParams
import com.telnyx.sdk.models.requirementgroups.RequirementGroupListParams
import com.telnyx.sdk.models.requirementgroups.RequirementGroupRetrieveParams
import com.telnyx.sdk.models.requirementgroups.RequirementGroupSubmitForApprovalParams
import com.telnyx.sdk.models.requirementgroups.RequirementGroupUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class RequirementGroupServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : RequirementGroupServiceAsync {

    private val withRawResponse: RequirementGroupServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): RequirementGroupServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): RequirementGroupServiceAsync =
        RequirementGroupServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: RequirementGroupCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<RequirementGroup> =
        // post /requirement_groups
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: RequirementGroupRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<RequirementGroup> =
        // get /requirement_groups/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: RequirementGroupUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<RequirementGroup> =
        // patch /requirement_groups/{id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: RequirementGroupListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<RequirementGroup>> =
        // get /requirement_groups
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: RequirementGroupDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<RequirementGroup> =
        // delete /requirement_groups/{id}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    override fun submitForApproval(
        params: RequirementGroupSubmitForApprovalParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<RequirementGroup> =
        // post /requirement_groups/{id}/submit_for_approval
        withRawResponse().submitForApproval(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RequirementGroupServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RequirementGroupServiceAsync.WithRawResponse =
            RequirementGroupServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<RequirementGroup> =
            jsonHandler<RequirementGroup>(clientOptions.jsonMapper)

        override fun create(
            params: RequirementGroupCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RequirementGroup>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("requirement_groups")
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

        private val retrieveHandler: Handler<RequirementGroup> =
            jsonHandler<RequirementGroup>(clientOptions.jsonMapper)

        override fun retrieve(
            params: RequirementGroupRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RequirementGroup>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("requirement_groups", params._pathParam(0))
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

        private val updateHandler: Handler<RequirementGroup> =
            jsonHandler<RequirementGroup>(clientOptions.jsonMapper)

        override fun update(
            params: RequirementGroupUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RequirementGroup>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("requirement_groups", params._pathParam(0))
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

        private val listHandler: Handler<List<RequirementGroup>> =
            jsonHandler<List<RequirementGroup>>(clientOptions.jsonMapper)

        override fun list(
            params: RequirementGroupListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<RequirementGroup>>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("requirement_groups")
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
                    }
                }
        }

        private val deleteHandler: Handler<RequirementGroup> =
            jsonHandler<RequirementGroup>(clientOptions.jsonMapper)

        override fun delete(
            params: RequirementGroupDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RequirementGroup>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("requirement_groups", params._pathParam(0))
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

        private val submitForApprovalHandler: Handler<RequirementGroup> =
            jsonHandler<RequirementGroup>(clientOptions.jsonMapper)

        override fun submitForApproval(
            params: RequirementGroupSubmitForApprovalParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RequirementGroup>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "requirement_groups",
                        params._pathParam(0),
                        "submit_for_approval",
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
                            .use { submitForApprovalHandler.handle(it) }
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
