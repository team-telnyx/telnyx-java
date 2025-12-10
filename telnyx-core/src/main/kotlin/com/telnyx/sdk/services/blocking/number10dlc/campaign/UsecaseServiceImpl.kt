// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.number10dlc.campaign

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
import com.telnyx.sdk.models.number10dlc.campaign.usecase.UsecaseRetrieveCostParams
import com.telnyx.sdk.models.number10dlc.campaign.usecase.UsecaseRetrieveCostResponse
import java.util.function.Consumer

class UsecaseServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    UsecaseService {

    private val withRawResponse: UsecaseService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): UsecaseService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): UsecaseService =
        UsecaseServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieveCost(
        params: UsecaseRetrieveCostParams,
        requestOptions: RequestOptions,
    ): UsecaseRetrieveCostResponse =
        // get /10dlc/campaign/usecase/cost
        withRawResponse().retrieveCost(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        UsecaseService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): UsecaseService.WithRawResponse =
            UsecaseServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveCostHandler: Handler<UsecaseRetrieveCostResponse> =
            jsonHandler<UsecaseRetrieveCostResponse>(clientOptions.jsonMapper)

        override fun retrieveCost(
            params: UsecaseRetrieveCostParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UsecaseRetrieveCostResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("10dlc", "campaign", "usecase", "cost")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveCostHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
