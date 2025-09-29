// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking.bundlepricing

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
import com.telnyx.api.core.prepare
import com.telnyx.api.models.bundlepricing.userbundles.UserBundleCreateParams
import com.telnyx.api.models.bundlepricing.userbundles.UserBundleCreateResponse
import com.telnyx.api.models.bundlepricing.userbundles.UserBundleDeactivateParams
import com.telnyx.api.models.bundlepricing.userbundles.UserBundleDeactivateResponse
import com.telnyx.api.models.bundlepricing.userbundles.UserBundleListParams
import com.telnyx.api.models.bundlepricing.userbundles.UserBundleListResourcesParams
import com.telnyx.api.models.bundlepricing.userbundles.UserBundleListResourcesResponse
import com.telnyx.api.models.bundlepricing.userbundles.UserBundleListResponse
import com.telnyx.api.models.bundlepricing.userbundles.UserBundleListUnusedParams
import com.telnyx.api.models.bundlepricing.userbundles.UserBundleListUnusedResponse
import com.telnyx.api.models.bundlepricing.userbundles.UserBundleRetrieveParams
import com.telnyx.api.models.bundlepricing.userbundles.UserBundleRetrieveResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class UserBundleServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    UserBundleService {

    private val withRawResponse: UserBundleService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): UserBundleService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): UserBundleService =
        UserBundleServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: UserBundleCreateParams,
        requestOptions: RequestOptions,
    ): UserBundleCreateResponse =
        // post /bundle_pricing/user_bundles/bulk
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: UserBundleRetrieveParams,
        requestOptions: RequestOptions,
    ): UserBundleRetrieveResponse =
        // get /bundle_pricing/user_bundles/{user_bundle_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: UserBundleListParams,
        requestOptions: RequestOptions,
    ): UserBundleListResponse =
        // get /bundle_pricing/user_bundles
        withRawResponse().list(params, requestOptions).parse()

    override fun deactivate(
        params: UserBundleDeactivateParams,
        requestOptions: RequestOptions,
    ): UserBundleDeactivateResponse =
        // delete /bundle_pricing/user_bundles/{user_bundle_id}
        withRawResponse().deactivate(params, requestOptions).parse()

    override fun listResources(
        params: UserBundleListResourcesParams,
        requestOptions: RequestOptions,
    ): UserBundleListResourcesResponse =
        // get /bundle_pricing/user_bundles/{user_bundle_id}/resources
        withRawResponse().listResources(params, requestOptions).parse()

    override fun listUnused(
        params: UserBundleListUnusedParams,
        requestOptions: RequestOptions,
    ): UserBundleListUnusedResponse =
        // get /bundle_pricing/user_bundles/unused
        withRawResponse().listUnused(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        UserBundleService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): UserBundleService.WithRawResponse =
            UserBundleServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<UserBundleCreateResponse> =
            jsonHandler<UserBundleCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: UserBundleCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UserBundleCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("bundle_pricing", "user_bundles", "bulk")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveHandler: Handler<UserBundleRetrieveResponse> =
            jsonHandler<UserBundleRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: UserBundleRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UserBundleRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("userBundleId", params.userBundleId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("bundle_pricing", "user_bundles", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<UserBundleListResponse> =
            jsonHandler<UserBundleListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: UserBundleListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UserBundleListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("bundle_pricing", "user_bundles")
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

        private val deactivateHandler: Handler<UserBundleDeactivateResponse> =
            jsonHandler<UserBundleDeactivateResponse>(clientOptions.jsonMapper)

        override fun deactivate(
            params: UserBundleDeactivateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UserBundleDeactivateResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { deactivateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listResourcesHandler: Handler<UserBundleListResourcesResponse> =
            jsonHandler<UserBundleListResourcesResponse>(clientOptions.jsonMapper)

        override fun listResources(
            params: UserBundleListResourcesParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UserBundleListResourcesResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listResourcesHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listUnusedHandler: Handler<UserBundleListUnusedResponse> =
            jsonHandler<UserBundleListUnusedResponse>(clientOptions.jsonMapper)

        override fun listUnused(
            params: UserBundleListUnusedParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UserBundleListUnusedResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("bundle_pricing", "user_bundles", "unused")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
