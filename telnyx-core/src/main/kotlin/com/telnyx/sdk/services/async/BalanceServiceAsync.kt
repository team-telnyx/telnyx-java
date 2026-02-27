// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.balance.BalanceRetrieveParams
import com.telnyx.sdk.models.balance.BalanceRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Billing operations */
interface BalanceServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BalanceServiceAsync

    /** Get user balance details */
    fun retrieve(): CompletableFuture<BalanceRetrieveResponse> =
        retrieve(BalanceRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        params: BalanceRetrieveParams = BalanceRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BalanceRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: BalanceRetrieveParams = BalanceRetrieveParams.none()
    ): CompletableFuture<BalanceRetrieveResponse> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(requestOptions: RequestOptions): CompletableFuture<BalanceRetrieveResponse> =
        retrieve(BalanceRetrieveParams.none(), requestOptions)

    /**
     * A view of [BalanceServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BalanceServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /balance`, but is otherwise the same as
         * [BalanceServiceAsync.retrieve].
         */
        fun retrieve(): CompletableFuture<HttpResponseFor<BalanceRetrieveResponse>> =
            retrieve(BalanceRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            params: BalanceRetrieveParams = BalanceRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BalanceRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: BalanceRetrieveParams = BalanceRetrieveParams.none()
        ): CompletableFuture<HttpResponseFor<BalanceRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<BalanceRetrieveResponse>> =
            retrieve(BalanceRetrieveParams.none(), requestOptions)
    }
}
