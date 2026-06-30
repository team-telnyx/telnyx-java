// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.messaging10dlc.campaign

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.messaging10dlc.campaign.usecase.UsecaseGetCostParams
import com.telnyx.sdk.models.messaging10dlc.campaign.usecase.UsecaseGetCostResponse
import java.util.function.Consumer

/** Campaign operations */
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
    fun getCost(params: UsecaseGetCostParams): UsecaseGetCostResponse =
        getCost(params, RequestOptions.none())

    /** @see getCost */
    fun getCost(
        params: UsecaseGetCostParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UsecaseGetCostResponse

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
         * same as [UsecaseService.getCost].
         */
        @MustBeClosed
        fun getCost(params: UsecaseGetCostParams): HttpResponseFor<UsecaseGetCostResponse> =
            getCost(params, RequestOptions.none())

        /** @see getCost */
        @MustBeClosed
        fun getCost(
            params: UsecaseGetCostParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UsecaseGetCostResponse>
    }
}
