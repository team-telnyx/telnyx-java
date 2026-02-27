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
import com.telnyx.sdk.models.publicinternetgateways.PublicInternetGatewayCreateParams
import com.telnyx.sdk.models.publicinternetgateways.PublicInternetGatewayCreateResponse
import com.telnyx.sdk.models.publicinternetgateways.PublicInternetGatewayDeleteParams
import com.telnyx.sdk.models.publicinternetgateways.PublicInternetGatewayDeleteResponse
import com.telnyx.sdk.models.publicinternetgateways.PublicInternetGatewayListPage
import com.telnyx.sdk.models.publicinternetgateways.PublicInternetGatewayListPageResponse
import com.telnyx.sdk.models.publicinternetgateways.PublicInternetGatewayListParams
import com.telnyx.sdk.models.publicinternetgateways.PublicInternetGatewayRetrieveParams
import com.telnyx.sdk.models.publicinternetgateways.PublicInternetGatewayRetrieveResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Public Internet Gateway operations */
class PublicInternetGatewayServiceImpl
internal constructor(private val clientOptions: ClientOptions) : PublicInternetGatewayService {

    private val withRawResponse: PublicInternetGatewayService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PublicInternetGatewayService.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): PublicInternetGatewayService =
        PublicInternetGatewayServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: PublicInternetGatewayCreateParams,
        requestOptions: RequestOptions,
    ): PublicInternetGatewayCreateResponse =
        // post /public_internet_gateways
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: PublicInternetGatewayRetrieveParams,
        requestOptions: RequestOptions,
    ): PublicInternetGatewayRetrieveResponse =
        // get /public_internet_gateways/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: PublicInternetGatewayListParams,
        requestOptions: RequestOptions,
    ): PublicInternetGatewayListPage =
        // get /public_internet_gateways
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: PublicInternetGatewayDeleteParams,
        requestOptions: RequestOptions,
    ): PublicInternetGatewayDeleteResponse =
        // delete /public_internet_gateways/{id}
        withRawResponse().delete(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PublicInternetGatewayService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PublicInternetGatewayService.WithRawResponse =
            PublicInternetGatewayServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<PublicInternetGatewayCreateResponse> =
            jsonHandler<PublicInternetGatewayCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: PublicInternetGatewayCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PublicInternetGatewayCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("public_internet_gateways")
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

        private val retrieveHandler: Handler<PublicInternetGatewayRetrieveResponse> =
            jsonHandler<PublicInternetGatewayRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: PublicInternetGatewayRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PublicInternetGatewayRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("public_internet_gateways", params._pathParam(0))
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

        private val listHandler: Handler<PublicInternetGatewayListPageResponse> =
            jsonHandler<PublicInternetGatewayListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: PublicInternetGatewayListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PublicInternetGatewayListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("public_internet_gateways")
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
                    .let {
                        PublicInternetGatewayListPage.builder()
                            .service(PublicInternetGatewayServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<PublicInternetGatewayDeleteResponse> =
            jsonHandler<PublicInternetGatewayDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: PublicInternetGatewayDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PublicInternetGatewayDeleteResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("public_internet_gateways", params._pathParam(0))
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
