// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.virtualcrossconnectscoverage.VirtualCrossConnectsCoverageListPageAsync
import com.telnyx.sdk.models.virtualcrossconnectscoverage.VirtualCrossConnectsCoverageListParams
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
    fun list(): CompletableFuture<VirtualCrossConnectsCoverageListPageAsync> =
        list(VirtualCrossConnectsCoverageListParams.none())

    /** @see list */
    fun list(
        params: VirtualCrossConnectsCoverageListParams =
            VirtualCrossConnectsCoverageListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VirtualCrossConnectsCoverageListPageAsync>

    /** @see list */
    fun list(
        params: VirtualCrossConnectsCoverageListParams =
            VirtualCrossConnectsCoverageListParams.none()
    ): CompletableFuture<VirtualCrossConnectsCoverageListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        requestOptions: RequestOptions
    ): CompletableFuture<VirtualCrossConnectsCoverageListPageAsync> =
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
        fun list(): CompletableFuture<HttpResponseFor<VirtualCrossConnectsCoverageListPageAsync>> =
            list(VirtualCrossConnectsCoverageListParams.none())

        /** @see list */
        fun list(
            params: VirtualCrossConnectsCoverageListParams =
                VirtualCrossConnectsCoverageListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VirtualCrossConnectsCoverageListPageAsync>>

        /** @see list */
        fun list(
            params: VirtualCrossConnectsCoverageListParams =
                VirtualCrossConnectsCoverageListParams.none()
        ): CompletableFuture<HttpResponseFor<VirtualCrossConnectsCoverageListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<VirtualCrossConnectsCoverageListPageAsync>> =
            list(VirtualCrossConnectsCoverageListParams.none(), requestOptions)
    }
}
