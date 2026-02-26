// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.payment.PaymentCreateStoredPaymentTransactionParams
import com.telnyx.sdk.models.payment.PaymentCreateStoredPaymentTransactionResponse
import com.telnyx.sdk.services.blocking.payment.AutoRechargePrefService
import java.util.function.Consumer

interface PaymentService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PaymentService

    fun autoRechargePrefs(): AutoRechargePrefService

    /** Create a stored payment transaction */
    fun createStoredPaymentTransaction(
        params: PaymentCreateStoredPaymentTransactionParams
    ): PaymentCreateStoredPaymentTransactionResponse =
        createStoredPaymentTransaction(params, RequestOptions.none())

    /** @see createStoredPaymentTransaction */
    fun createStoredPaymentTransaction(
        params: PaymentCreateStoredPaymentTransactionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaymentCreateStoredPaymentTransactionResponse

    /** A view of [PaymentService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): PaymentService.WithRawResponse

        fun autoRechargePrefs(): AutoRechargePrefService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v2/payment/stored_payment_transactions`, but is
         * otherwise the same as [PaymentService.createStoredPaymentTransaction].
         */
        @MustBeClosed
        fun createStoredPaymentTransaction(
            params: PaymentCreateStoredPaymentTransactionParams
        ): HttpResponseFor<PaymentCreateStoredPaymentTransactionResponse> =
            createStoredPaymentTransaction(params, RequestOptions.none())

        /** @see createStoredPaymentTransaction */
        @MustBeClosed
        fun createStoredPaymentTransaction(
            params: PaymentCreateStoredPaymentTransactionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PaymentCreateStoredPaymentTransactionResponse>
    }
}
