// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.x402

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
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
interface CreditAccountServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CreditAccountServiceAsync

    /**
     * Creates a payment quote for the specified USD amount. Returns payment details including the
     * x402 payment requirements, network, and expiration time. The quote must be settled before it
     * expires.
     */
    fun createPaymentQuote(
        params: CreditAccountCreatePaymentQuoteParams
    ): CompletableFuture<CreditAccountCreatePaymentQuoteResponse> =
        createPaymentQuote(params, RequestOptions.none())

    /** @see createPaymentQuote */
    fun createPaymentQuote(
        params: CreditAccountCreatePaymentQuoteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CreditAccountCreatePaymentQuoteResponse>

    /**
     * Settles an x402 payment using the quote ID and a signed payment authorization. The payment
     * signature can be provided via the `PAYMENT-SIGNATURE` header or the `payment_signature` body
     * parameter. Settlement is idempotent — submitting the same quote ID multiple times returns the
     * existing transaction.
     */
    fun settlePayment(
        params: CreditAccountSettlePaymentParams
    ): CompletableFuture<CreditAccountSettlePaymentResponse> =
        settlePayment(params, RequestOptions.none())

    /** @see settlePayment */
    fun settlePayment(
        params: CreditAccountSettlePaymentParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CreditAccountSettlePaymentResponse>

    /**
     * A view of [CreditAccountServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CreditAccountServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v2/x402/credit_account/quote`, but is otherwise
         * the same as [CreditAccountServiceAsync.createPaymentQuote].
         */
        fun createPaymentQuote(
            params: CreditAccountCreatePaymentQuoteParams
        ): CompletableFuture<HttpResponseFor<CreditAccountCreatePaymentQuoteResponse>> =
            createPaymentQuote(params, RequestOptions.none())

        /** @see createPaymentQuote */
        fun createPaymentQuote(
            params: CreditAccountCreatePaymentQuoteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CreditAccountCreatePaymentQuoteResponse>>

        /**
         * Returns a raw HTTP response for `post /v2/x402/credit_account`, but is otherwise the same
         * as [CreditAccountServiceAsync.settlePayment].
         */
        fun settlePayment(
            params: CreditAccountSettlePaymentParams
        ): CompletableFuture<HttpResponseFor<CreditAccountSettlePaymentResponse>> =
            settlePayment(params, RequestOptions.none())

        /** @see settlePayment */
        fun settlePayment(
            params: CreditAccountSettlePaymentParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CreditAccountSettlePaymentResponse>>
    }
}
