// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.machinepayments.MachinePaymentAccountCreditParams
import com.telnyx.sdk.models.machinepayments.MachinePaymentAccountCreditResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/**
 * Machine payment (MPP) account-credit operations. Fund your Telnyx account programmatically from a
 * machine or agent using the Machine Payment Protocol, an HTTP-402 flow settled via Stripe or
 * Tempo.
 */
interface MachinePaymentServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MachinePaymentServiceAsync

    /**
     * Creates an account credit using the Machine Payment Protocol (MPP), an HTTP-402 payment flow
     * for machines and agents.
     *
     * The flow has two steps. First, send an authenticated request with the `amount_usd` to credit;
     * the response is `402 Payment Required` with one or more payment challenges (for example
     * separate Tempo and Stripe challenges) in the `WWW-Authenticate` header. Second, retry the
     * request with an `Authorization: Payment ...` credential constructed from the challenge; on
     * success the response includes the credited transaction and a `Payment-Receipt` header.
     *
     * The credited account is never chosen by the request body: the initial request credits the
     * account of the authenticated user, and a paid retry credits the account bound to the verified
     * payment credential. The amount must be within the configured bounds (by default between 5.00
     * and 500.00 USD).
     *
     * Successful paid retries are idempotent — when Rails reaches its duplicate-transaction lookup
     * for an already-recorded payment, it returns the existing transaction with `created: false`
     * instead of crediting the account again. This deduplication applies to successful fulfillment:
     * re-sending the same Stripe credential may instead be rejected by the upstream provider as an
     * idempotent replay and return `402 Payment Required` rather than the existing transaction.
     * > **Warning: the payment credential is bound to a specific Telnyx account ID.** A payment is
     * > captured before the bound account is validated. If the credential names an account that is
     * > missing, suspended, blocked, cancelled, dormant, or ineligible for the tier, the payment is
     * > captured but **no account is credited**. If the credential names a different but eligible
     * > account, that account is credited — the service does not compare it against the payer's
     * > account. There is **no automatic refund**: if the captured payment does not credit the
     * > intended account, contact Telnyx support for remediation.
     */
    fun accountCredit(
        params: MachinePaymentAccountCreditParams
    ): CompletableFuture<MachinePaymentAccountCreditResponse> =
        accountCredit(params, RequestOptions.none())

    /** @see accountCredit */
    fun accountCredit(
        params: MachinePaymentAccountCreditParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MachinePaymentAccountCreditResponse>

    /**
     * A view of [MachinePaymentServiceAsync] that provides access to raw HTTP responses for each
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
        ): MachinePaymentServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /machine-payments/account-credit`, but is otherwise
         * the same as [MachinePaymentServiceAsync.accountCredit].
         */
        fun accountCredit(
            params: MachinePaymentAccountCreditParams
        ): CompletableFuture<HttpResponseFor<MachinePaymentAccountCreditResponse>> =
            accountCredit(params, RequestOptions.none())

        /** @see accountCredit */
        fun accountCredit(
            params: MachinePaymentAccountCreditParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MachinePaymentAccountCreditResponse>>
    }
}
