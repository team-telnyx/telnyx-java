// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.chargesbreakdown.ChargesBreakdownRetrieveParams
import com.telnyx.api.models.chargesbreakdown.ChargesBreakdownRetrieveResponse
import java.util.function.Consumer

interface ChargesBreakdownService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ChargesBreakdownService

    /**
     * Retrieve a detailed breakdown of monthly charges for phone numbers in a specified date range.
     * The date range cannot exceed 31 days.
     */
    fun retrieve(params: ChargesBreakdownRetrieveParams): ChargesBreakdownRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ChargesBreakdownRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ChargesBreakdownRetrieveResponse

    /**
     * A view of [ChargesBreakdownService] that provides access to raw HTTP responses for each
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
        ): ChargesBreakdownService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /charges_breakdown`, but is otherwise the same as
         * [ChargesBreakdownService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: ChargesBreakdownRetrieveParams
        ): HttpResponseFor<ChargesBreakdownRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: ChargesBreakdownRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ChargesBreakdownRetrieveResponse>
    }
}
