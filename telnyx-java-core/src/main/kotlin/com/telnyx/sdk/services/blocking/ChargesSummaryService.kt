// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.chargessummary.ChargesSummaryRetrieveParams
import com.telnyx.sdk.models.chargessummary.ChargesSummaryRetrieveResponse
import java.util.function.Consumer

interface ChargesSummaryService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ChargesSummaryService

    /**
     * Retrieve a summary of monthly charges for a specified date range. The date range cannot
     * exceed 31 days.
     */
    fun retrieve(params: ChargesSummaryRetrieveParams): ChargesSummaryRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ChargesSummaryRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ChargesSummaryRetrieveResponse

    /**
     * A view of [ChargesSummaryService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ChargesSummaryService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /charges_summary`, but is otherwise the same as
         * [ChargesSummaryService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: ChargesSummaryRetrieveParams
        ): HttpResponseFor<ChargesSummaryRetrieveResponse> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: ChargesSummaryRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ChargesSummaryRetrieveResponse>
    }
}
