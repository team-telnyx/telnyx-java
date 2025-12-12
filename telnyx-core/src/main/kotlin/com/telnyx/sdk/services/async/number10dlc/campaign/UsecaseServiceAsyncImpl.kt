// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.number10dlc.campaign

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
import com.telnyx.sdk.core.prepareAsync
import com.telnyx.sdk.models.number10dlc.campaign.usecase.UsecaseGetCostParams
import com.telnyx.sdk.models.number10dlc.campaign.usecase.UsecaseGetCostResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class UsecaseServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    UsecaseServiceAsync {

    private val withRawResponse: UsecaseServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): UsecaseServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): UsecaseServiceAsync =
        UsecaseServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun getCost(
        params: UsecaseGetCostParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<UsecaseGetCostResponse> =
        // get /10dlc/campaign/usecase/cost
        withRawResponse().getCost(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        UsecaseServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): UsecaseServiceAsync.WithRawResponse =
            UsecaseServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val getCostHandler: Handler<UsecaseGetCostResponse> =
            jsonHandler<UsecaseGetCostResponse>(clientOptions.jsonMapper)

        override fun getCost(
            params: UsecaseGetCostParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<UsecaseGetCostResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("10dlc", "campaign", "usecase", "cost")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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
}
