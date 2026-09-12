// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.x402.creditaccount

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.x402.creditaccount.payments.PaymentListPageAsync
import com.telnyx.sdk.models.x402.creditaccount.payments.PaymentListParams
import com.telnyx.sdk.models.x402.creditaccount.payments.PaymentRetrieveParams
import com.telnyx.sdk.models.x402.creditaccount.payments.PaymentRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/**
 * Operations for x402 cryptocurrency payment transactions. Fund your Telnyx account using USDC
 * stablecoin payments via the x402 protocol.
 */
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

    /**
     * Returns a single x402 payment transaction by ID. The transaction must belong to the
     * authenticated user; organization sub-users must have read permission on transactions. Returns
     * 404 if the transaction does not exist or belongs to another user.
     */
    fun retrieve(id: String): CompletableFuture<PaymentRetrieveResponse> =
        retrieve(id, PaymentRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: PaymentRetrieveParams = PaymentRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PaymentRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: PaymentRetrieveParams = PaymentRetrieveParams.none(),
    ): CompletableFuture<PaymentRetrieveResponse> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: PaymentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PaymentRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: PaymentRetrieveParams): CompletableFuture<PaymentRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<PaymentRetrieveResponse> =
        retrieve(id, PaymentRetrieveParams.none(), requestOptions)

    /**
     * Returns a paginated list of the authenticated user's x402 payment transactions, newest first.
     * Organization sub-users must have read permission on transactions; without it the list is
     * empty.
     */
    fun list(): CompletableFuture<PaymentListPageAsync> = list(PaymentListParams.none())

    /** @see list */
    fun list(
        params: PaymentListParams = PaymentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PaymentListPageAsync>

    /** @see list */
    fun list(
        params: PaymentListParams = PaymentListParams.none()
    ): CompletableFuture<PaymentListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<PaymentListPageAsync> =
        list(PaymentListParams.none(), requestOptions)

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

        /**
         * Returns a raw HTTP response for `get /v2/x402/credit_account/payments/{id}`, but is
         * otherwise the same as [PaymentServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<PaymentRetrieveResponse>> =
            retrieve(id, PaymentRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: PaymentRetrieveParams = PaymentRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PaymentRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: PaymentRetrieveParams = PaymentRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<PaymentRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: PaymentRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PaymentRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: PaymentRetrieveParams
        ): CompletableFuture<HttpResponseFor<PaymentRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PaymentRetrieveResponse>> =
            retrieve(id, PaymentRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v2/x402/credit_account/payments`, but is otherwise
         * the same as [PaymentServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<PaymentListPageAsync>> =
            list(PaymentListParams.none())

        /** @see list */
        fun list(
            params: PaymentListParams = PaymentListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PaymentListPageAsync>>

        /** @see list */
        fun list(
            params: PaymentListParams = PaymentListParams.none()
        ): CompletableFuture<HttpResponseFor<PaymentListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<PaymentListPageAsync>> =
            list(PaymentListParams.none(), requestOptions)
    }
}
