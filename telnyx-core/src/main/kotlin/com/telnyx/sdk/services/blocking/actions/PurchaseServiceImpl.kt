// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.actions

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
import com.telnyx.sdk.core.http.json
import com.telnyx.sdk.core.http.parseable
import com.telnyx.sdk.core.prepare
import com.telnyx.sdk.models.actions.purchase.PurchaseCreateParams
import com.telnyx.sdk.models.actions.purchase.PurchaseCreateResponse
import java.util.function.Consumer

/** SIM Cards operations */
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
