// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.campaign

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.campaign.usecase.UsecaseGetCostParams
import com.telnyx.sdk.models.campaign.usecase.UsecaseGetCostResponse
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
    fun getCost(params: UsecaseGetCostParams): CompletableFuture<UsecaseGetCostResponse> =
        getCost(params, RequestOptions.none())

    /** @see getCost */
    fun getCost(
        params: UsecaseGetCostParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UsecaseGetCostResponse>

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
         * same as [UsecaseServiceAsync.getCost].
         */
        fun getCost(
            params: UsecaseGetCostParams
        ): CompletableFuture<HttpResponseFor<UsecaseGetCostResponse>> =
            getCost(params, RequestOptions.none())

        /** @see getCost */
        fun getCost(
            params: UsecaseGetCostParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UsecaseGetCostResponse>>
    }
}
