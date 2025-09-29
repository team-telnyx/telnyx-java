// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking.networks

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
import com.telnyx.api.models.networks.defaultgateway.DefaultGatewayCreateParams
import com.telnyx.api.models.networks.defaultgateway.DefaultGatewayCreateResponse
import com.telnyx.api.models.networks.defaultgateway.DefaultGatewayDeleteParams
import com.telnyx.api.models.networks.defaultgateway.DefaultGatewayDeleteResponse
import com.telnyx.api.models.networks.defaultgateway.DefaultGatewayRetrieveParams
import com.telnyx.api.models.networks.defaultgateway.DefaultGatewayRetrieveResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class DefaultGatewayServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    DefaultGatewayService {

    private val withRawResponse: DefaultGatewayService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): DefaultGatewayService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): DefaultGatewayService =
        DefaultGatewayServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: DefaultGatewayCreateParams,
        requestOptions: RequestOptions,
    ): DefaultGatewayCreateResponse =
        // post /networks/{id}/default_gateway
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: DefaultGatewayRetrieveParams,
        requestOptions: RequestOptions,
    ): DefaultGatewayRetrieveResponse =
        // get /networks/{id}/default_gateway
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun delete(
        params: DefaultGatewayDeleteParams,
        requestOptions: RequestOptions,
    ): DefaultGatewayDeleteResponse =
        // delete /networks/{id}/default_gateway
        withRawResponse().delete(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DefaultGatewayService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DefaultGatewayService.WithRawResponse =
            DefaultGatewayServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<DefaultGatewayCreateResponse> =
            jsonHandler<DefaultGatewayCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: DefaultGatewayCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DefaultGatewayCreateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("pathId", params.pathId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("networks", params._pathParam(0), "default_gateway")
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

        private val retrieveHandler: Handler<DefaultGatewayRetrieveResponse> =
            jsonHandler<DefaultGatewayRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: DefaultGatewayRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DefaultGatewayRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("networks", params._pathParam(0), "default_gateway")
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

        private val deleteHandler: Handler<DefaultGatewayDeleteResponse> =
            jsonHandler<DefaultGatewayDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: DefaultGatewayDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DefaultGatewayDeleteResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("networks", params._pathParam(0), "default_gateway")
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
