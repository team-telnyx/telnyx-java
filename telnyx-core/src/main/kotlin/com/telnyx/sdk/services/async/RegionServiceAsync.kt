// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.regions.RegionListParams
import com.telnyx.sdk.models.regions.RegionListResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Regions */
interface RegionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RegionServiceAsync

    /** List all regions and the interfaces that region supports */
    fun list(): CompletableFuture<RegionListResponse> = list(RegionListParams.none())

    /** @see list */
    fun list(
        params: RegionListParams = RegionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RegionListResponse>

    /** @see list */
    fun list(
        params: RegionListParams = RegionListParams.none()
    ): CompletableFuture<RegionListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<RegionListResponse> =
        list(RegionListParams.none(), requestOptions)

    /**
     * A view of [RegionServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RegionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /regions`, but is otherwise the same as
         * [RegionServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<RegionListResponse>> =
            list(RegionListParams.none())

        /** @see list */
        fun list(
            params: RegionListParams = RegionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RegionListResponse>>

        /** @see list */
        fun list(
            params: RegionListParams = RegionListParams.none()
        ): CompletableFuture<HttpResponseFor<RegionListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<RegionListResponse>> =
            list(RegionListParams.none(), requestOptions)
    }
}
