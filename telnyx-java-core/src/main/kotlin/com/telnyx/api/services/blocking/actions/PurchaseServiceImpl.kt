// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking.actions

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
import com.telnyx.api.core.http.json
import com.telnyx.api.core.http.parseable
import com.telnyx.api.core.prepare
import com.telnyx.api.models.actions.purchase.PurchaseCreateParams
import com.telnyx.api.models.actions.purchase.PurchaseCreateResponse
import java.util.function.Consumer

class PurchaseServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    PurchaseService {

    private val withRawResponse: PurchaseService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PurchaseService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PurchaseService =
        PurchaseServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: PurchaseCreateParams,
        requestOptions: RequestOptions,
    ): PurchaseCreateResponse =
        // post /actions/purchase/esims
        withRawResponse().create(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PurchaseService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PurchaseService.WithRawResponse =
            PurchaseServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<PurchaseCreateResponse> =
            jsonHandler<PurchaseCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: PurchaseCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PurchaseCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("actions", "purchase", "esims")
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
    }
}
