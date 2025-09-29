// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.handlers.errorBodyHandler
import com.telnyx.api.core.handlers.errorHandler
import com.telnyx.api.core.handlers.jsonHandler
import com.telnyx.api.core.http.HttpMethod
import com.telnyx.api.core.http.HttpRequest
import com.telnyx.api.core.http.HttpResponse
import com.telnyx.api.core.http.HttpResponse.Handler
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.core.http.parseable
import com.telnyx.api.core.prepareAsync
import com.telnyx.api.models.wellknown.WellKnownRetrieveAuthorizationServerMetadataParams
import com.telnyx.api.models.wellknown.WellKnownRetrieveAuthorizationServerMetadataResponse
import com.telnyx.api.models.wellknown.WellKnownRetrieveProtectedResourceMetadataParams
import com.telnyx.api.models.wellknown.WellKnownRetrieveProtectedResourceMetadataResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class WellKnownServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    WellKnownServiceAsync {

    private val withRawResponse: WellKnownServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): WellKnownServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): WellKnownServiceAsync =
        WellKnownServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieveAuthorizationServerMetadata(
        params: WellKnownRetrieveAuthorizationServerMetadataParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<WellKnownRetrieveAuthorizationServerMetadataResponse> =
        // get /.well-known/oauth-authorization-server
        withRawResponse().retrieveAuthorizationServerMetadata(params, requestOptions).thenApply {
            it.parse()
        }

    override fun retrieveProtectedResourceMetadata(
        params: WellKnownRetrieveProtectedResourceMetadataParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<WellKnownRetrieveProtectedResourceMetadataResponse> =
        // get /.well-known/oauth-protected-resource
        withRawResponse().retrieveProtectedResourceMetadata(params, requestOptions).thenApply {
            it.parse()
        }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        WellKnownServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): WellKnownServiceAsync.WithRawResponse =
            WellKnownServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveAuthorizationServerMetadataHandler:
            Handler<WellKnownRetrieveAuthorizationServerMetadataResponse> =
            jsonHandler<WellKnownRetrieveAuthorizationServerMetadataResponse>(
                clientOptions.jsonMapper
            )

        override fun retrieveAuthorizationServerMetadata(
            params: WellKnownRetrieveAuthorizationServerMetadataParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<
            HttpResponseFor<WellKnownRetrieveAuthorizationServerMetadataResponse>
        > {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(
                        if (clientOptions.baseUrlOverridden()) clientOptions.baseUrl()
                        else "https://api.telnyx.com"
                    )
                    .addPathSegments(".well-known", "oauth-authorization-server")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveAuthorizationServerMetadataHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveProtectedResourceMetadataHandler:
            Handler<WellKnownRetrieveProtectedResourceMetadataResponse> =
            jsonHandler<WellKnownRetrieveProtectedResourceMetadataResponse>(
                clientOptions.jsonMapper
            )

        override fun retrieveProtectedResourceMetadata(
            params: WellKnownRetrieveProtectedResourceMetadataParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WellKnownRetrieveProtectedResourceMetadataResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(
                        if (clientOptions.baseUrlOverridden()) clientOptions.baseUrl()
                        else "https://api.telnyx.com"
                    )
                    .addPathSegments(".well-known", "oauth-protected-resource")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveProtectedResourceMetadataHandler.handle(it) }
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
