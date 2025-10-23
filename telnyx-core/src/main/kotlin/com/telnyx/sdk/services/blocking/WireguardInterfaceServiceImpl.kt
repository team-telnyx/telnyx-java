// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

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
import com.telnyx.sdk.core.prepare
import com.telnyx.sdk.models.wireguardinterfaces.WireguardInterfaceCreateParams
import com.telnyx.sdk.models.wireguardinterfaces.WireguardInterfaceCreateResponse
import com.telnyx.sdk.models.wireguardinterfaces.WireguardInterfaceDeleteParams
import com.telnyx.sdk.models.wireguardinterfaces.WireguardInterfaceDeleteResponse
import com.telnyx.sdk.models.wireguardinterfaces.WireguardInterfaceListParams
import com.telnyx.sdk.models.wireguardinterfaces.WireguardInterfaceListResponse
import com.telnyx.sdk.models.wireguardinterfaces.WireguardInterfaceRetrieveParams
import com.telnyx.sdk.models.wireguardinterfaces.WireguardInterfaceRetrieveResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class WireguardInterfaceServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    WireguardInterfaceService {

    private val withRawResponse: WireguardInterfaceService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): WireguardInterfaceService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): WireguardInterfaceService =
        WireguardInterfaceServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: WireguardInterfaceCreateParams,
        requestOptions: RequestOptions,
    ): WireguardInterfaceCreateResponse =
        // post /wireguard_interfaces
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: WireguardInterfaceRetrieveParams,
        requestOptions: RequestOptions,
    ): WireguardInterfaceRetrieveResponse =
        // get /wireguard_interfaces/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: WireguardInterfaceListParams,
        requestOptions: RequestOptions,
    ): WireguardInterfaceListResponse =
        // get /wireguard_interfaces
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: WireguardInterfaceDeleteParams,
        requestOptions: RequestOptions,
    ): WireguardInterfaceDeleteResponse =
        // delete /wireguard_interfaces/{id}
        withRawResponse().delete(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        WireguardInterfaceService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): WireguardInterfaceService.WithRawResponse =
            WireguardInterfaceServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<WireguardInterfaceCreateResponse> =
            jsonHandler<WireguardInterfaceCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: WireguardInterfaceCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<WireguardInterfaceCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("wireguard_interfaces")
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

        private val retrieveHandler: Handler<WireguardInterfaceRetrieveResponse> =
            jsonHandler<WireguardInterfaceRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: WireguardInterfaceRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<WireguardInterfaceRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("wireguard_interfaces", params._pathParam(0))
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

        private val listHandler: Handler<WireguardInterfaceListResponse> =
            jsonHandler<WireguardInterfaceListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: WireguardInterfaceListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<WireguardInterfaceListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("wireguard_interfaces")
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

        private val deleteHandler: Handler<WireguardInterfaceDeleteResponse> =
            jsonHandler<WireguardInterfaceDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: WireguardInterfaceDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<WireguardInterfaceDeleteResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("wireguard_interfaces", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
