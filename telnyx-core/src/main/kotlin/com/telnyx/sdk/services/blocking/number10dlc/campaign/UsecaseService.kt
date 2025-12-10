// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.number10dlc.campaign

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.number10dlc.campaign.usecase.UsecaseRetrieveCostParams
import com.telnyx.sdk.models.number10dlc.campaign.usecase.UsecaseRetrieveCostResponse
import java.util.function.Consumer

interface UsecaseService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): UsecaseService

    /** Get Campaign Cost */
    fun retrieveCost(params: UsecaseRetrieveCostParams): UsecaseRetrieveCostResponse =
        retrieveCost(params, RequestOptions.none())

    /** @see retrieveCost */
    fun retrieveCost(
        params: UsecaseRetrieveCostParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UsecaseRetrieveCostResponse

    /** A view of [UsecaseService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): UsecaseService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /10dlc/campaign/usecase/cost`, but is otherwise the
         * same as [UsecaseService.retrieveCost].
         */
        @MustBeClosed
        fun retrieveCost(
            params: UsecaseRetrieveCostParams
        ): HttpResponseFor<UsecaseRetrieveCostResponse> =
            retrieveCost(params, RequestOptions.none())

        /** @see retrieveCost */
        @MustBeClosed
        fun retrieveCost(
            params: UsecaseRetrieveCostParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UsecaseRetrieveCostResponse>
    }
}
