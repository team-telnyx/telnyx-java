// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking

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
import com.telnyx.api.core.http.parseable
import com.telnyx.api.core.prepare
import com.telnyx.api.models.invoices.InvoiceListParams
import com.telnyx.api.models.invoices.InvoiceListResponse
import com.telnyx.api.models.invoices.InvoiceRetrieveParams
import com.telnyx.api.models.invoices.InvoiceRetrieveResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class InvoiceServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    InvoiceService {

    private val withRawResponse: InvoiceService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): InvoiceService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): InvoiceService =
        InvoiceServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: InvoiceRetrieveParams,
        requestOptions: RequestOptions,
    ): InvoiceRetrieveResponse =
        // get /invoices/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: InvoiceListParams,
        requestOptions: RequestOptions,
    ): InvoiceListResponse =
        // get /invoices
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        InvoiceService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): InvoiceService.WithRawResponse =
            InvoiceServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<InvoiceRetrieveResponse> =
            jsonHandler<InvoiceRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: InvoiceRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InvoiceRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("invoices", params._pathParam(0))
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

        private val listHandler: Handler<InvoiceListResponse> =
            jsonHandler<InvoiceListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: InvoiceListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InvoiceListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("invoices")
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
    }
}
