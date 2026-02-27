// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.virtualcrossconnectscoverage.VirtualCrossConnectsCoverageListPage
import com.telnyx.sdk.models.virtualcrossconnectscoverage.VirtualCrossConnectsCoverageListParams
import java.util.function.Consumer

/** Virtual Cross Connect operations */
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
    fun list(): VirtualCrossConnectsCoverageListPage =
        list(VirtualCrossConnectsCoverageListParams.none())

    /** @see list */
    fun list(
        params: VirtualCrossConnectsCoverageListParams =
            VirtualCrossConnectsCoverageListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VirtualCrossConnectsCoverageListPage

    /** @see list */
    fun list(
        params: VirtualCrossConnectsCoverageListParams =
            VirtualCrossConnectsCoverageListParams.none()
    ): VirtualCrossConnectsCoverageListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): VirtualCrossConnectsCoverageListPage =
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
        fun list(): HttpResponseFor<VirtualCrossConnectsCoverageListPage> =
            list(VirtualCrossConnectsCoverageListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: VirtualCrossConnectsCoverageListParams =
                VirtualCrossConnectsCoverageListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VirtualCrossConnectsCoverageListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: VirtualCrossConnectsCoverageListParams =
                VirtualCrossConnectsCoverageListParams.none()
        ): HttpResponseFor<VirtualCrossConnectsCoverageListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<VirtualCrossConnectsCoverageListPage> =
            list(VirtualCrossConnectsCoverageListParams.none(), requestOptions)
    }
}
