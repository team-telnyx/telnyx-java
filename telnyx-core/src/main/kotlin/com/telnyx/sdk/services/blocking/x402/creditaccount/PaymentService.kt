// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.x402.creditaccount

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.x402.creditaccount.payments.PaymentListPage
import com.telnyx.sdk.models.x402.creditaccount.payments.PaymentListParams
import com.telnyx.sdk.models.x402.creditaccount.payments.PaymentRetrieveParams
import com.telnyx.sdk.models.x402.creditaccount.payments.PaymentRetrieveResponse
import java.util.function.Consumer

/**
 * Operations for x402 cryptocurrency payment transactions. Fund your Telnyx account using USDC
 * stablecoin payments via the x402 protocol.
 */
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

    /**
     * Returns a single x402 payment transaction by ID. The transaction must belong to the
     * authenticated user; organization sub-users must have read permission on transactions. Returns
     * 404 if the transaction does not exist or belongs to another user.
     */
    fun retrieve(id: String): PaymentRetrieveResponse = retrieve(id, PaymentRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: PaymentRetrieveParams = PaymentRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaymentRetrieveResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: PaymentRetrieveParams = PaymentRetrieveParams.none(),
    ): PaymentRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: PaymentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaymentRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: PaymentRetrieveParams): PaymentRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): PaymentRetrieveResponse =
        retrieve(id, PaymentRetrieveParams.none(), requestOptions)

    /**
     * Returns a paginated list of the authenticated user's x402 payment transactions, newest first.
     * Organization sub-users must have read permission on transactions; without it the list is
     * empty.
     */
    fun list(): PaymentListPage = list(PaymentListParams.none())

    /** @see list */
    fun list(
        params: PaymentListParams = PaymentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaymentListPage

    /** @see list */
    fun list(params: PaymentListParams = PaymentListParams.none()): PaymentListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): PaymentListPage =
        list(PaymentListParams.none(), requestOptions)

    /** A view of [PaymentService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): PaymentService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v2/x402/credit_account/payments/{id}`, but is
         * otherwise the same as [PaymentService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<PaymentRetrieveResponse> =
            retrieve(id, PaymentRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: PaymentRetrieveParams = PaymentRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PaymentRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: PaymentRetrieveParams = PaymentRetrieveParams.none(),
        ): HttpResponseFor<PaymentRetrieveResponse> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: PaymentRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PaymentRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: PaymentRetrieveParams): HttpResponseFor<PaymentRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PaymentRetrieveResponse> =
            retrieve(id, PaymentRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v2/x402/credit_account/payments`, but is otherwise
         * the same as [PaymentService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<PaymentListPage> = list(PaymentListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: PaymentListParams = PaymentListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PaymentListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: PaymentListParams = PaymentListParams.none()
        ): HttpResponseFor<PaymentListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<PaymentListPage> =
            list(PaymentListParams.none(), requestOptions)
    }
}
