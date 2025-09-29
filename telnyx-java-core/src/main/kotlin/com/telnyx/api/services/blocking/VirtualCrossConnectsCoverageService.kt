// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.virtualcrossconnectscoverage.VirtualCrossConnectsCoverageListParams
import com.telnyx.api.models.virtualcrossconnectscoverage.VirtualCrossConnectsCoverageListResponse
import java.util.function.Consumer

interface VirtualCrossConnectsCoverageService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): VirtualCrossConnectsCoverageService

    /**
     * List Virtual Cross Connects Cloud Coverage.<br /><br />This endpoint shows which cloud
     * regions are available for the `location_code` your Virtual Cross Connect will be provisioned
     * in.
     */
    fun list(): VirtualCrossConnectsCoverageListResponse =
        list(VirtualCrossConnectsCoverageListParams.none())

    /** @see list */
    fun list(
        params: VirtualCrossConnectsCoverageListParams =
            VirtualCrossConnectsCoverageListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VirtualCrossConnectsCoverageListResponse

    /** @see list */
    fun list(
        params: VirtualCrossConnectsCoverageListParams =
            VirtualCrossConnectsCoverageListParams.none()
    ): VirtualCrossConnectsCoverageListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): VirtualCrossConnectsCoverageListResponse =
        list(VirtualCrossConnectsCoverageListParams.none(), requestOptions)

    /**
     * A view of [VirtualCrossConnectsCoverageService] that provides access to raw HTTP responses
     * for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): VirtualCrossConnectsCoverageService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /virtual_cross_connects_coverage`, but is otherwise
         * the same as [VirtualCrossConnectsCoverageService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<VirtualCrossConnectsCoverageListResponse> =
            list(VirtualCrossConnectsCoverageListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: VirtualCrossConnectsCoverageListParams =
                VirtualCrossConnectsCoverageListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VirtualCrossConnectsCoverageListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: VirtualCrossConnectsCoverageListParams =
                VirtualCrossConnectsCoverageListParams.none()
        ): HttpResponseFor<VirtualCrossConnectsCoverageListResponse> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<VirtualCrossConnectsCoverageListResponse> =
            list(VirtualCrossConnectsCoverageListParams.none(), requestOptions)
    }
}
