// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.x402

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
import com.telnyx.sdk.models.x402.creditaccount.CreditAccountCreateQuoteParams
import com.telnyx.sdk.models.x402.creditaccount.CreditAccountCreateQuoteResponse
import com.telnyx.sdk.models.x402.creditaccount.CreditAccountSettleParams
import com.telnyx.sdk.models.x402.creditaccount.CreditAccountSettleResponse
import java.util.function.Consumer

/**
 * Operations for x402 cryptocurrency payment transactions. Fund your Telnyx account using USDC
 * stablecoin payments via the x402 protocol.
 */
class CreditAccountServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    CreditAccountService {

    private val withRawResponse: CreditAccountService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CreditAccountService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CreditAccountService =
        CreditAccountServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun createQuote(
        params: CreditAccountCreateQuoteParams,
        requestOptions: RequestOptions,
    ): CreditAccountCreateQuoteResponse =
        // post /v2/x402/credit_account/quote
        withRawResponse().createQuote(params, requestOptions).parse()

    override fun settle(
        params: CreditAccountSettleParams,
        requestOptions: RequestOptions,
    ): CreditAccountSettleResponse =
        // post /v2/x402/credit_account
        withRawResponse().settle(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CreditAccountService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CreditAccountService.WithRawResponse =
            CreditAccountServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createQuoteHandler: Handler<CreditAccountCreateQuoteResponse> =
            jsonHandler<CreditAccountCreateQuoteResponse>(clientOptions.jsonMapper)

        override fun createQuote(
            params: CreditAccountCreateQuoteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CreditAccountCreateQuoteResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v2", "x402", "credit_account", "quote")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createQuoteHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val settleHandler: Handler<CreditAccountSettleResponse> =
            jsonHandler<CreditAccountSettleResponse>(clientOptions.jsonMapper)

        override fun settle(
            params: CreditAccountSettleParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CreditAccountSettleResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v2", "x402", "credit_account")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
