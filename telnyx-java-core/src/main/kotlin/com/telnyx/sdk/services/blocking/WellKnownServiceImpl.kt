// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.handlers.errorBodyHandler
import com.telnyx.sdk.core.handlers.errorHandler
import com.telnyx.sdk.core.handlers.jsonHandler
import com.telnyx.sdk.core.http.HttpMethod
import com.telnyx.sdk.core.http.HttpRequest
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponse.Handler
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.core.http.parseable
import com.telnyx.sdk.core.prepare
import com.telnyx.sdk.models.wellknown.WellKnownRetrieveAuthorizationServerMetadataParams
import com.telnyx.sdk.models.wellknown.WellKnownRetrieveAuthorizationServerMetadataResponse
import com.telnyx.sdk.models.wellknown.WellKnownRetrieveProtectedResourceMetadataParams
import com.telnyx.sdk.models.wellknown.WellKnownRetrieveProtectedResourceMetadataResponse
import java.util.function.Consumer

class WellKnownServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    WellKnownService {

    private val withRawResponse: WellKnownService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): WellKnownService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): WellKnownService =
        WellKnownServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieveAuthorizationServerMetadata(
        params: WellKnownRetrieveAuthorizationServerMetadataParams,
        requestOptions: RequestOptions,
    ): WellKnownRetrieveAuthorizationServerMetadataResponse =
        // get /.well-known/oauth-authorization-server
        withRawResponse().retrieveAuthorizationServerMetadata(params, requestOptions).parse()

    override fun retrieveProtectedResourceMetadata(
        params: WellKnownRetrieveProtectedResourceMetadataParams,
        requestOptions: RequestOptions,
    ): WellKnownRetrieveProtectedResourceMetadataResponse =
        // get /.well-known/oauth-protected-resource
        withRawResponse().retrieveProtectedResourceMetadata(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        WellKnownService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): WellKnownService.WithRawResponse =
            WellKnownServiceImpl.WithRawResponseImpl(
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
        ): HttpResponseFor<WellKnownRetrieveAuthorizationServerMetadataResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(
                        if (clientOptions.baseUrlOverridden()) clientOptions.baseUrl()
                        else "https://api.telnyx.com"
                    )
                    .addPathSegments(".well-known", "oauth-authorization-server")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveAuthorizationServerMetadataHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
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
        ): HttpResponseFor<WellKnownRetrieveProtectedResourceMetadataResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(
                        if (clientOptions.baseUrlOverridden()) clientOptions.baseUrl()
                        else "https://api.telnyx.com"
                    )
                    .addPathSegments(".well-known", "oauth-protected-resource")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
