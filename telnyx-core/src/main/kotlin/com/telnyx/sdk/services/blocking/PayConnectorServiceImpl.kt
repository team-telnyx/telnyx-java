// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.handlers.emptyHandler
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
import com.telnyx.sdk.models.payconnectors.PayConnectorCreateParams
import com.telnyx.sdk.models.payconnectors.PayConnectorDeleteParams
import com.telnyx.sdk.models.payconnectors.PayConnectorListPage
import com.telnyx.sdk.models.payconnectors.PayConnectorListPageResponse
import com.telnyx.sdk.models.payconnectors.PayConnectorListParams
import com.telnyx.sdk.models.payconnectors.PayConnectorResponse
import com.telnyx.sdk.models.payconnectors.PayConnectorRetrieveParams
import com.telnyx.sdk.models.payconnectors.PayConnectorUpdateParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Generic payment connector configuration. */
class PayConnectorServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    PayConnectorService {

    private val withRawResponse: PayConnectorService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PayConnectorService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PayConnectorService =
        PayConnectorServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: PayConnectorCreateParams,
        requestOptions: RequestOptions,
    ): PayConnectorResponse =
        // post /pay_connectors
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: PayConnectorRetrieveParams,
        requestOptions: RequestOptions,
    ): PayConnectorResponse =
        // get /pay_connectors/{name}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: PayConnectorUpdateParams,
        requestOptions: RequestOptions,
    ): PayConnectorResponse =
        // patch /pay_connectors/{name}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: PayConnectorListParams,
        requestOptions: RequestOptions,
    ): PayConnectorListPage =
        // get /pay_connectors
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: PayConnectorDeleteParams, requestOptions: RequestOptions) {
        // delete /pay_connectors/{name}
        withRawResponse().delete(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PayConnectorService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PayConnectorService.WithRawResponse =
            PayConnectorServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<PayConnectorResponse> =
            jsonHandler<PayConnectorResponse>(clientOptions.jsonMapper)

        override fun create(
            params: PayConnectorCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PayConnectorResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("pay_connectors")
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

        private val retrieveHandler: Handler<PayConnectorResponse> =
            jsonHandler<PayConnectorResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: PayConnectorRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PayConnectorResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("name", params.name().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("pay_connectors", params._pathParam(0))
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

        private val updateHandler: Handler<PayConnectorResponse> =
            jsonHandler<PayConnectorResponse>(clientOptions.jsonMapper)

        override fun update(
            params: PayConnectorUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PayConnectorResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("name", params.name().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("pay_connectors", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<PayConnectorListPageResponse> =
            jsonHandler<PayConnectorListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: PayConnectorListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PayConnectorListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("pay_connectors")
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
                        PayConnectorListPage.builder()
                            .service(PayConnectorServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: PayConnectorDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("name", params.name().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("pay_connectors", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }
    }
}
