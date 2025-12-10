// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.networkcoverage.NetworkCoverageListPageAsync
import com.telnyx.sdk.models.networkcoverage.NetworkCoverageListParams
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
    fun list(): CompletableFuture<NetworkCoverageListPageAsync> =
        list(NetworkCoverageListParams.none())

    /** @see list */
    fun list(
        params: NetworkCoverageListParams = NetworkCoverageListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NetworkCoverageListPageAsync>

    /** @see list */
    fun list(
        params: NetworkCoverageListParams = NetworkCoverageListParams.none()
    ): CompletableFuture<NetworkCoverageListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<NetworkCoverageListPageAsync> =
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
        fun list(): CompletableFuture<HttpResponseFor<NetworkCoverageListPageAsync>> =
            list(NetworkCoverageListParams.none())

        /** @see list */
        fun list(
            params: NetworkCoverageListParams = NetworkCoverageListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NetworkCoverageListPageAsync>>

        /** @see list */
        fun list(
            params: NetworkCoverageListParams = NetworkCoverageListParams.none()
        ): CompletableFuture<HttpResponseFor<NetworkCoverageListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<NetworkCoverageListPageAsync>> =
            list(NetworkCoverageListParams.none(), requestOptions)
    }
}
