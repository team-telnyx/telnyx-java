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
import com.telnyx.sdk.models.useraddresses.UserAddressCreateParams
import com.telnyx.sdk.models.useraddresses.UserAddressCreateResponse
import com.telnyx.sdk.models.useraddresses.UserAddressListParams
import com.telnyx.sdk.models.useraddresses.UserAddressListResponse
import com.telnyx.sdk.models.useraddresses.UserAddressRetrieveParams
import com.telnyx.sdk.models.useraddresses.UserAddressRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class UserAddressServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    UserAddressServiceAsync {

    private val withRawResponse: UserAddressServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): UserAddressServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): UserAddressServiceAsync =
        UserAddressServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: UserAddressCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<UserAddressCreateResponse> =
        // post /user_addresses
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: UserAddressRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<UserAddressRetrieveResponse> =
        // get /user_addresses/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: UserAddressListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<UserAddressListResponse> =
        // get /user_addresses
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        UserAddressServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): UserAddressServiceAsync.WithRawResponse =
            UserAddressServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<UserAddressCreateResponse> =
            jsonHandler<UserAddressCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: UserAddressCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<UserAddressCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("user_addresses")
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

        private val retrieveHandler: Handler<UserAddressRetrieveResponse> =
            jsonHandler<UserAddressRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: UserAddressRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<UserAddressRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("user_addresses", params._pathParam(0))
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

        private val listHandler: Handler<UserAddressListResponse> =
            jsonHandler<UserAddressListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: UserAddressListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<UserAddressListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("user_addresses")
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
    }
}
