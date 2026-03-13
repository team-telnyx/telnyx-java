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
import com.telnyx.sdk.models.x402.creditaccount.CreditAccountCreateQuoteParams
import com.telnyx.sdk.models.x402.creditaccount.CreditAccountCreateQuoteResponse
import com.telnyx.sdk.models.x402.creditaccount.CreditAccountSettleParams
import com.telnyx.sdk.models.x402.creditaccount.CreditAccountSettleResponse
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

    override fun createQuote(
        params: CreditAccountCreateQuoteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CreditAccountCreateQuoteResponse> =
        // post /v2/x402/credit_account/quote
        withRawResponse().createQuote(params, requestOptions).thenApply { it.parse() }

    override fun settle(
        params: CreditAccountSettleParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CreditAccountSettleResponse> =
        // post /v2/x402/credit_account
        withRawResponse().settle(params, requestOptions).thenApply { it.parse() }

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

        private val createQuoteHandler: Handler<CreditAccountCreateQuoteResponse> =
            jsonHandler<CreditAccountCreateQuoteResponse>(clientOptions.jsonMapper)

        override fun createQuote(
            params: CreditAccountCreateQuoteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CreditAccountCreateQuoteResponse>> {
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
                            .use { createQuoteHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val settleHandler: Handler<CreditAccountSettleResponse> =
            jsonHandler<CreditAccountSettleResponse>(clientOptions.jsonMapper)

        override fun settle(
            params: CreditAccountSettleParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CreditAccountSettleResponse>> {
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
                            .use { settleHandler.handle(it) }
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
