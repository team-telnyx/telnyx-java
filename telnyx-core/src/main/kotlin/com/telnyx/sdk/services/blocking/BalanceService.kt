// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.balance.BalanceRetrieveParams
import com.telnyx.sdk.models.balance.BalanceRetrieveResponse
import java.util.function.Consumer

interface BalanceService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BalanceService

    /** Get user balance details */
    fun retrieve(): BalanceRetrieveResponse = retrieve(BalanceRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        params: BalanceRetrieveParams = BalanceRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BalanceRetrieveResponse

    /** @see retrieve */
    fun retrieve(
        params: BalanceRetrieveParams = BalanceRetrieveParams.none()
    ): BalanceRetrieveResponse = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(requestOptions: RequestOptions): BalanceRetrieveResponse =
        retrieve(BalanceRetrieveParams.none(), requestOptions)

    /** A view of [BalanceService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): BalanceService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /balance`, but is otherwise the same as
         * [BalanceService.retrieve].
         */
        @MustBeClosed
        fun retrieve(): HttpResponseFor<BalanceRetrieveResponse> =
            retrieve(BalanceRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: BalanceRetrieveParams = BalanceRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BalanceRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: BalanceRetrieveParams = BalanceRetrieveParams.none()
        ): HttpResponseFor<BalanceRetrieveResponse> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(requestOptions: RequestOptions): HttpResponseFor<BalanceRetrieveResponse> =
            retrieve(BalanceRetrieveParams.none(), requestOptions)
    }
}
