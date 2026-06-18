// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.chargesbreakdown.ChargesBreakdownRetrieveParams
import com.telnyx.sdk.models.chargesbreakdown.ChargesBreakdownRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ChargesBreakdownServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ChargesBreakdownServiceAsync

    /**
     * Retrieve a detailed breakdown of monthly charges for phone numbers in a specified date range.
     * The date range cannot exceed 31 days.
     */
    fun retrieve(
        params: ChargesBreakdownRetrieveParams
    ): CompletableFuture<ChargesBreakdownRetrieveResponse> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ChargesBreakdownRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ChargesBreakdownRetrieveResponse>

    /**
     * A view of [ChargesBreakdownServiceAsync] that provides access to raw HTTP responses for each
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
        ): ChargesBreakdownServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /charges_breakdown`, but is otherwise the same as
         * [ChargesBreakdownServiceAsync.retrieve].
         */
        fun retrieve(
            params: ChargesBreakdownRetrieveParams
        ): CompletableFuture<HttpResponseFor<ChargesBreakdownRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: ChargesBreakdownRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ChargesBreakdownRetrieveResponse>>
    }
}
