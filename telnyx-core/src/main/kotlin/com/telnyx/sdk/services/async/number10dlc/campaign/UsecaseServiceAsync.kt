// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.number10dlc.campaign

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.number10dlc.campaign.usecase.UsecaseRetrieveCostParams
import com.telnyx.sdk.models.number10dlc.campaign.usecase.UsecaseRetrieveCostResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface UsecaseServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): UsecaseServiceAsync

    /** Get Campaign Cost */
    fun retrieveCost(
        params: UsecaseRetrieveCostParams
    ): CompletableFuture<UsecaseRetrieveCostResponse> = retrieveCost(params, RequestOptions.none())

    /** @see retrieveCost */
    fun retrieveCost(
        params: UsecaseRetrieveCostParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UsecaseRetrieveCostResponse>

    /**
     * A view of [UsecaseServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): UsecaseServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /10dlc/campaign/usecase/cost`, but is otherwise the
         * same as [UsecaseServiceAsync.retrieveCost].
         */
        fun retrieveCost(
            params: UsecaseRetrieveCostParams
        ): CompletableFuture<HttpResponseFor<UsecaseRetrieveCostResponse>> =
            retrieveCost(params, RequestOptions.none())

        /** @see retrieveCost */
        fun retrieveCost(
            params: UsecaseRetrieveCostParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UsecaseRetrieveCostResponse>>
    }
}
