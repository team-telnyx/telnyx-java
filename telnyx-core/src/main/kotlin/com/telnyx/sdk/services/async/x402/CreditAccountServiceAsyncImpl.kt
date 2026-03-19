// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.x402

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
import com.telnyx.sdk.core.prepareAsync
import com.telnyx.sdk.models.x402.creditaccount.CreditAccountCreatePaymentQuoteParams
import com.telnyx.sdk.models.x402.creditaccount.CreditAccountCreatePaymentQuoteResponse
import com.telnyx.sdk.models.x402.creditaccount.CreditAccountSettlePaymentParams
import com.telnyx.sdk.models.x402.creditaccount.CreditAccountSettlePaymentResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/**
 * Operations for x402 cryptocurrency payment transactions. Fund your Telnyx account using USDC
 * stablecoin payments via the x402 protocol.
 */
class CreditAccountServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    CreditAccountServiceAsync {

    private val withRawResponse: CreditAccountServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CreditAccountServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CreditAccountServiceAsync =
        CreditAccountServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun createPaymentQuote(
        params: CreditAccountCreatePaymentQuoteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CreditAccountCreatePaymentQuoteResponse> =
        // post /v2/x402/credit_account/quote
        withRawResponse().createPaymentQuote(params, requestOptions).thenApply { it.parse() }

    override fun settlePayment(
        params: CreditAccountSettlePaymentParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CreditAccountSettlePaymentResponse> =
        // post /v2/x402/credit_account
        withRawResponse().settlePayment(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CreditAccountServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CreditAccountServiceAsync.WithRawResponse =
            CreditAccountServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createPaymentQuoteHandler: Handler<CreditAccountCreatePaymentQuoteResponse> =
            jsonHandler<CreditAccountCreatePaymentQuoteResponse>(clientOptions.jsonMapper)

        override fun createPaymentQuote(
            params: CreditAccountCreatePaymentQuoteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CreditAccountCreatePaymentQuoteResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v2", "x402", "credit_account", "quote")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createPaymentQuoteHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val settlePaymentHandler: Handler<CreditAccountSettlePaymentResponse> =
            jsonHandler<CreditAccountSettlePaymentResponse>(clientOptions.jsonMapper)

        override fun settlePayment(
            params: CreditAccountSettlePaymentParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CreditAccountSettlePaymentResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v2", "x402", "credit_account")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { settlePaymentHandler.handle(it) }
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
