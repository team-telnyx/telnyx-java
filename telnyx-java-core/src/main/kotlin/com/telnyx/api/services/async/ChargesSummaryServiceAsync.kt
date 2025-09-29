// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.chargessummary.ChargesSummaryRetrieveParams
import com.telnyx.api.models.chargessummary.ChargesSummaryRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ChargesSummaryServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ChargesSummaryServiceAsync

    /**
     * Retrieve a summary of monthly charges for a specified date range. The date range cannot
     * exceed 31 days.
     */
    fun retrieve(
        params: ChargesSummaryRetrieveParams
    ): CompletableFuture<ChargesSummaryRetrieveResponse> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ChargesSummaryRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ChargesSummaryRetrieveResponse>

    /**
     * A view of [ChargesSummaryServiceAsync] that provides access to raw HTTP responses for each
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
        ): ChargesSummaryServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /charges_summary`, but is otherwise the same as
         * [ChargesSummaryServiceAsync.retrieve].
         */
        fun retrieve(
            params: ChargesSummaryRetrieveParams
        ): CompletableFuture<HttpResponseFor<ChargesSummaryRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: ChargesSummaryRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ChargesSummaryRetrieveResponse>>
    }
}
