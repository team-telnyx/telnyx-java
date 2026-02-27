// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.payment.PaymentCreateStoredPaymentTransactionParams
import com.telnyx.sdk.models.payment.PaymentCreateStoredPaymentTransactionResponse
import com.telnyx.sdk.services.async.payment.AutoRechargePrefServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Operations for managing stored payment transactions. */
interface PaymentServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PaymentServiceAsync

    /** V2 Auto Recharge Preferences API */
    fun autoRechargePrefs(): AutoRechargePrefServiceAsync

    /** Create a stored payment transaction */
    fun createStoredPaymentTransaction(
        params: PaymentCreateStoredPaymentTransactionParams
    ): CompletableFuture<PaymentCreateStoredPaymentTransactionResponse> =
        createStoredPaymentTransaction(params, RequestOptions.none())

    /** @see createStoredPaymentTransaction */
    fun createStoredPaymentTransaction(
        params: PaymentCreateStoredPaymentTransactionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PaymentCreateStoredPaymentTransactionResponse>

    /**
     * A view of [PaymentServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PaymentServiceAsync.WithRawResponse

        /** V2 Auto Recharge Preferences API */
        fun autoRechargePrefs(): AutoRechargePrefServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v2/payment/stored_payment_transactions`, but is
         * otherwise the same as [PaymentServiceAsync.createStoredPaymentTransaction].
         */
        fun createStoredPaymentTransaction(
            params: PaymentCreateStoredPaymentTransactionParams
        ): CompletableFuture<HttpResponseFor<PaymentCreateStoredPaymentTransactionResponse>> =
            createStoredPaymentTransaction(params, RequestOptions.none())

        /** @see createStoredPaymentTransaction */
        fun createStoredPaymentTransaction(
            params: PaymentCreateStoredPaymentTransactionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PaymentCreateStoredPaymentTransactionResponse>>
    }
}
