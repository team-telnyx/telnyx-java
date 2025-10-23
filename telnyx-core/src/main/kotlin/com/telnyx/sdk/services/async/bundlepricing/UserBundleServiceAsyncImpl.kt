// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.bundlepricing

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
import com.telnyx.sdk.models.bundlepricing.userbundles.UserBundleCreateParams
import com.telnyx.sdk.models.bundlepricing.userbundles.UserBundleCreateResponse
import com.telnyx.sdk.models.bundlepricing.userbundles.UserBundleDeactivateParams
import com.telnyx.sdk.models.bundlepricing.userbundles.UserBundleDeactivateResponse
import com.telnyx.sdk.models.bundlepricing.userbundles.UserBundleListParams
import com.telnyx.sdk.models.bundlepricing.userbundles.UserBundleListResourcesParams
import com.telnyx.sdk.models.bundlepricing.userbundles.UserBundleListResourcesResponse
import com.telnyx.sdk.models.bundlepricing.userbundles.UserBundleListResponse
import com.telnyx.sdk.models.bundlepricing.userbundles.UserBundleListUnusedParams
import com.telnyx.sdk.models.bundlepricing.userbundles.UserBundleListUnusedResponse
import com.telnyx.sdk.models.bundlepricing.userbundles.UserBundleRetrieveParams
import com.telnyx.sdk.models.bundlepricing.userbundles.UserBundleRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class UserBundleServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    UserBundleServiceAsync {

    private val withRawResponse: UserBundleServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): UserBundleServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): UserBundleServiceAsync =
        UserBundleServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: UserBundleCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<UserBundleCreateResponse> =
        // post /bundle_pricing/user_bundles/bulk
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: UserBundleRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<UserBundleRetrieveResponse> =
        // get /bundle_pricing/user_bundles/{user_bundle_id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: UserBundleListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<UserBundleListResponse> =
        // get /bundle_pricing/user_bundles
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun deactivate(
        params: UserBundleDeactivateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<UserBundleDeactivateResponse> =
        // delete /bundle_pricing/user_bundles/{user_bundle_id}
        withRawResponse().deactivate(params, requestOptions).thenApply { it.parse() }

    override fun listResources(
        params: UserBundleListResourcesParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<UserBundleListResourcesResponse> =
        // get /bundle_pricing/user_bundles/{user_bundle_id}/resources
        withRawResponse().listResources(params, requestOptions).thenApply { it.parse() }

    override fun listUnused(
        params: UserBundleListUnusedParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<UserBundleListUnusedResponse> =
        // get /bundle_pricing/user_bundles/unused
        withRawResponse().listUnused(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        UserBundleServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): UserBundleServiceAsync.WithRawResponse =
            UserBundleServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<UserBundleCreateResponse> =
            jsonHandler<UserBundleCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: UserBundleCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<UserBundleCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("bundle_pricing", "user_bundles", "bulk")
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

        private val retrieveHandler: Handler<UserBundleRetrieveResponse> =
            jsonHandler<UserBundleRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: UserBundleRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<UserBundleRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("userBundleId", params.userBundleId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("bundle_pricing", "user_bundles", params._pathParam(0))
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

        private val listHandler: Handler<UserBundleListResponse> =
            jsonHandler<UserBundleListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: UserBundleListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<UserBundleListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("bundle_pricing", "user_bundles")
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

        private val deactivateHandler: Handler<UserBundleDeactivateResponse> =
            jsonHandler<UserBundleDeactivateResponse>(clientOptions.jsonMapper)

        override fun deactivate(
            params: UserBundleDeactivateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<UserBundleDeactivateResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("userBundleId", params.userBundleId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("bundle_pricing", "user_bundles", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { deactivateHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listResourcesHandler: Handler<UserBundleListResourcesResponse> =
            jsonHandler<UserBundleListResourcesResponse>(clientOptions.jsonMapper)

        override fun listResources(
            params: UserBundleListResourcesParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<UserBundleListResourcesResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("userBundleId", params.userBundleId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "bundle_pricing",
                        "user_bundles",
                        params._pathParam(0),
                        "resources",
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listResourcesHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listUnusedHandler: Handler<UserBundleListUnusedResponse> =
            jsonHandler<UserBundleListUnusedResponse>(clientOptions.jsonMapper)

        override fun listUnused(
            params: UserBundleListUnusedParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<UserBundleListUnusedResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("bundle_pricing", "user_bundles", "unused")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listUnusedHandler.handle(it) }
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
