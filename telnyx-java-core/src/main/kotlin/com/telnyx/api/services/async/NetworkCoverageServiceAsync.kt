// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.networkcoverage.NetworkCoverageListParams
import com.telnyx.api.models.networkcoverage.NetworkCoverageListResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface NetworkCoverageServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): NetworkCoverageServiceAsync

    /** List all locations and the interfaces that region supports */
    fun list(): CompletableFuture<NetworkCoverageListResponse> =
        list(NetworkCoverageListParams.none())

    /** @see list */
    fun list(
        params: NetworkCoverageListParams = NetworkCoverageListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NetworkCoverageListResponse>

    /** @see list */
    fun list(
        params: NetworkCoverageListParams = NetworkCoverageListParams.none()
    ): CompletableFuture<NetworkCoverageListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<NetworkCoverageListResponse> =
        list(NetworkCoverageListParams.none(), requestOptions)

    /**
     * A view of [NetworkCoverageServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): NetworkCoverageServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /network_coverage`, but is otherwise the same as
         * [NetworkCoverageServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<NetworkCoverageListResponse>> =
            list(NetworkCoverageListParams.none())

        /** @see list */
        fun list(
            params: NetworkCoverageListParams = NetworkCoverageListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NetworkCoverageListResponse>>

        /** @see list */
        fun list(
            params: NetworkCoverageListParams = NetworkCoverageListParams.none()
        ): CompletableFuture<HttpResponseFor<NetworkCoverageListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<NetworkCoverageListResponse>> =
            list(NetworkCoverageListParams.none(), requestOptions)
    }
}
