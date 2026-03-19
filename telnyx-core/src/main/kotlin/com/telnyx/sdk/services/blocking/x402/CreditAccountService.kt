// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.x402

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.x402.creditaccount.CreditAccountCreatePaymentQuoteParams
import com.telnyx.sdk.models.x402.creditaccount.CreditAccountCreatePaymentQuoteResponse
import com.telnyx.sdk.models.x402.creditaccount.CreditAccountSettlePaymentParams
import com.telnyx.sdk.models.x402.creditaccount.CreditAccountSettlePaymentResponse
import java.util.function.Consumer

/**
 * Operations for x402 cryptocurrency payment transactions. Fund your Telnyx account using USDC
 * stablecoin payments via the x402 protocol.
 */
interface CreditAccountService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CreditAccountService

    /**
     * Creates a payment quote for the specified USD amount. Returns payment details including the
     * x402 payment requirements, network, and expiration time. The quote must be settled before it
     * expires.
     */
    fun createPaymentQuote(
        params: CreditAccountCreatePaymentQuoteParams
    ): CreditAccountCreatePaymentQuoteResponse = createPaymentQuote(params, RequestOptions.none())

    /** @see createPaymentQuote */
    fun createPaymentQuote(
        params: CreditAccountCreatePaymentQuoteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CreditAccountCreatePaymentQuoteResponse

    /**
     * Settles an x402 payment using the quote ID and a signed payment authorization. The payment
     * signature can be provided via the `PAYMENT-SIGNATURE` header or the `payment_signature` body
     * parameter. Settlement is idempotent — submitting the same quote ID multiple times returns the
     * existing transaction.
     */
    fun settlePayment(
        params: CreditAccountSettlePaymentParams
    ): CreditAccountSettlePaymentResponse = settlePayment(params, RequestOptions.none())

    /** @see settlePayment */
    fun settlePayment(
        params: CreditAccountSettlePaymentParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CreditAccountSettlePaymentResponse

    /**
     * A view of [CreditAccountService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CreditAccountService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v2/x402/credit_account/quote`, but is otherwise
         * the same as [CreditAccountService.createPaymentQuote].
         */
        @MustBeClosed
        fun createPaymentQuote(
            params: CreditAccountCreatePaymentQuoteParams
        ): HttpResponseFor<CreditAccountCreatePaymentQuoteResponse> =
            createPaymentQuote(params, RequestOptions.none())

        /** @see createPaymentQuote */
        @MustBeClosed
        fun createPaymentQuote(
            params: CreditAccountCreatePaymentQuoteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CreditAccountCreatePaymentQuoteResponse>

        /**
         * Returns a raw HTTP response for `post /v2/x402/credit_account`, but is otherwise the same
         * as [CreditAccountService.settlePayment].
         */
        @MustBeClosed
        fun settlePayment(
            params: CreditAccountSettlePaymentParams
        ): HttpResponseFor<CreditAccountSettlePaymentResponse> =
            settlePayment(params, RequestOptions.none())

        /** @see settlePayment */
        @MustBeClosed
        fun settlePayment(
            params: CreditAccountSettlePaymentParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CreditAccountSettlePaymentResponse>
    }
}
