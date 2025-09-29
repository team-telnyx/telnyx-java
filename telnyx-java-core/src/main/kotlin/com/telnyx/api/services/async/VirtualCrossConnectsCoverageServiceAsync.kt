// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.virtualcrossconnectscoverage.VirtualCrossConnectsCoverageListParams
import com.telnyx.api.models.virtualcrossconnectscoverage.VirtualCrossConnectsCoverageListResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface VirtualCrossConnectsCoverageServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): VirtualCrossConnectsCoverageServiceAsync

    /**
     * List Virtual Cross Connects Cloud Coverage.<br /><br />This endpoint shows which cloud
     * regions are available for the `location_code` your Virtual Cross Connect will be provisioned
     * in.
     */
    fun list(): CompletableFuture<VirtualCrossConnectsCoverageListResponse> =
        list(VirtualCrossConnectsCoverageListParams.none())

    /** @see list */
    fun list(
        params: VirtualCrossConnectsCoverageListParams =
            VirtualCrossConnectsCoverageListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VirtualCrossConnectsCoverageListResponse>

    /** @see list */
    fun list(
        params: VirtualCrossConnectsCoverageListParams =
            VirtualCrossConnectsCoverageListParams.none()
    ): CompletableFuture<VirtualCrossConnectsCoverageListResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        requestOptions: RequestOptions
    ): CompletableFuture<VirtualCrossConnectsCoverageListResponse> =
        list(VirtualCrossConnectsCoverageListParams.none(), requestOptions)

    /**
     * A view of [VirtualCrossConnectsCoverageServiceAsync] that provides access to raw HTTP
     * responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): VirtualCrossConnectsCoverageServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /virtual_cross_connects_coverage`, but is otherwise
         * the same as [VirtualCrossConnectsCoverageServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<VirtualCrossConnectsCoverageListResponse>> =
            list(VirtualCrossConnectsCoverageListParams.none())

        /** @see list */
        fun list(
            params: VirtualCrossConnectsCoverageListParams =
                VirtualCrossConnectsCoverageListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VirtualCrossConnectsCoverageListResponse>>

        /** @see list */
        fun list(
            params: VirtualCrossConnectsCoverageListParams =
                VirtualCrossConnectsCoverageListParams.none()
        ): CompletableFuture<HttpResponseFor<VirtualCrossConnectsCoverageListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<VirtualCrossConnectsCoverageListResponse>> =
            list(VirtualCrossConnectsCoverageListParams.none(), requestOptions)
    }
}
