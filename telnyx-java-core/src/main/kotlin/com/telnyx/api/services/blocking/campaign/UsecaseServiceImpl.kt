// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking.campaign

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
import com.telnyx.api.core.prepare
import com.telnyx.api.models.campaign.usecase.UsecaseGetCostParams
import com.telnyx.api.models.campaign.usecase.UsecaseGetCostResponse
import java.util.function.Consumer

class UsecaseServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    UsecaseService {

    private val withRawResponse: UsecaseService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): UsecaseService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): UsecaseService =
        UsecaseServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun getCost(
        params: UsecaseGetCostParams,
        requestOptions: RequestOptions,
    ): UsecaseGetCostResponse =
        // get /campaign/usecase/cost
        withRawResponse().getCost(params, requestOptions).parse()

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

        private val getCostHandler: Handler<UsecaseGetCostResponse> =
            jsonHandler<UsecaseGetCostResponse>(clientOptions.jsonMapper)

        override fun getCost(
            params: UsecaseGetCostParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UsecaseGetCostResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("campaign", "usecase", "cost")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getCostHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
