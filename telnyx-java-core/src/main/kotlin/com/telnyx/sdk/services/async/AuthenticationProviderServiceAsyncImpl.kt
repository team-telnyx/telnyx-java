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
import com.telnyx.sdk.models.authenticationproviders.AuthenticationProviderCreateParams
import com.telnyx.sdk.models.authenticationproviders.AuthenticationProviderCreateResponse
import com.telnyx.sdk.models.authenticationproviders.AuthenticationProviderDeleteParams
import com.telnyx.sdk.models.authenticationproviders.AuthenticationProviderDeleteResponse
import com.telnyx.sdk.models.authenticationproviders.AuthenticationProviderListParams
import com.telnyx.sdk.models.authenticationproviders.AuthenticationProviderListResponse
import com.telnyx.sdk.models.authenticationproviders.AuthenticationProviderRetrieveParams
import com.telnyx.sdk.models.authenticationproviders.AuthenticationProviderRetrieveResponse
import com.telnyx.sdk.models.authenticationproviders.AuthenticationProviderUpdateParams
import com.telnyx.sdk.models.authenticationproviders.AuthenticationProviderUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class AuthenticationProviderServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) :
    AuthenticationProviderServiceAsync {

    private val withRawResponse: AuthenticationProviderServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AuthenticationProviderServiceAsync.WithRawResponse =
        withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): AuthenticationProviderServiceAsync =
        AuthenticationProviderServiceAsyncImpl(
            clientOptions.toBuilder().apply(modifier::accept).build()
        )

    override fun create(
        params: AuthenticationProviderCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AuthenticationProviderCreateResponse> =
        // post /authentication_providers
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: AuthenticationProviderRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AuthenticationProviderRetrieveResponse> =
        // get /authentication_providers/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: AuthenticationProviderUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AuthenticationProviderUpdateResponse> =
        // patch /authentication_providers/{id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: AuthenticationProviderListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AuthenticationProviderListResponse> =
        // get /authentication_providers
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: AuthenticationProviderDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AuthenticationProviderDeleteResponse> =
        // delete /authentication_providers/{id}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AuthenticationProviderServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AuthenticationProviderServiceAsync.WithRawResponse =
            AuthenticationProviderServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<AuthenticationProviderCreateResponse> =
            jsonHandler<AuthenticationProviderCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: AuthenticationProviderCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AuthenticationProviderCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("authentication_providers")
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

        private val retrieveHandler: Handler<AuthenticationProviderRetrieveResponse> =
            jsonHandler<AuthenticationProviderRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: AuthenticationProviderRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AuthenticationProviderRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("authentication_providers", params._pathParam(0))
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

        private val updateHandler: Handler<AuthenticationProviderUpdateResponse> =
            jsonHandler<AuthenticationProviderUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: AuthenticationProviderUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AuthenticationProviderUpdateResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("authentication_providers", params._pathParam(0))
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

        private val listHandler: Handler<AuthenticationProviderListResponse> =
            jsonHandler<AuthenticationProviderListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: AuthenticationProviderListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AuthenticationProviderListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("authentication_providers")
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

        private val deleteHandler: Handler<AuthenticationProviderDeleteResponse> =
            jsonHandler<AuthenticationProviderDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: AuthenticationProviderDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AuthenticationProviderDeleteResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("authentication_providers", params._pathParam(0))
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
