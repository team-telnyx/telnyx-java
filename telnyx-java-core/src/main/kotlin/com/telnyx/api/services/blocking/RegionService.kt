// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.regions.RegionListParams
import com.telnyx.api.models.regions.RegionListResponse
import java.util.function.Consumer

interface RegionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RegionService

    /** List all regions and the interfaces that region supports */
    fun list(): RegionListResponse = list(RegionListParams.none())

    /** @see list */
    fun list(
        params: RegionListParams = RegionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RegionListResponse

    /** @see list */
    fun list(params: RegionListParams = RegionListParams.none()): RegionListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): RegionListResponse =
        list(RegionListParams.none(), requestOptions)

    /** A view of [RegionService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): RegionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /regions`, but is otherwise the same as
         * [RegionService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<RegionListResponse> = list(RegionListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: RegionListParams = RegionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RegionListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: RegionListParams = RegionListParams.none()
        ): HttpResponseFor<RegionListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<RegionListResponse> =
            list(RegionListParams.none(), requestOptions)
    }
}
