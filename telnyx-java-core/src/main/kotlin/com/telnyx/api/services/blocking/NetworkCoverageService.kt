// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.networkcoverage.NetworkCoverageListParams
import com.telnyx.api.models.networkcoverage.NetworkCoverageListResponse
import java.util.function.Consumer

interface NetworkCoverageService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): NetworkCoverageService

    /** List all locations and the interfaces that region supports */
    fun list(): NetworkCoverageListResponse = list(NetworkCoverageListParams.none())

    /** @see list */
    fun list(
        params: NetworkCoverageListParams = NetworkCoverageListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NetworkCoverageListResponse

    /** @see list */
    fun list(
        params: NetworkCoverageListParams = NetworkCoverageListParams.none()
    ): NetworkCoverageListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): NetworkCoverageListResponse =
        list(NetworkCoverageListParams.none(), requestOptions)

    /**
     * A view of [NetworkCoverageService] that provides access to raw HTTP responses for each
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
        ): NetworkCoverageService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /network_coverage`, but is otherwise the same as
         * [NetworkCoverageService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<NetworkCoverageListResponse> =
            list(NetworkCoverageListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: NetworkCoverageListParams = NetworkCoverageListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NetworkCoverageListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: NetworkCoverageListParams = NetworkCoverageListParams.none()
        ): HttpResponseFor<NetworkCoverageListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<NetworkCoverageListResponse> =
            list(NetworkCoverageListParams.none(), requestOptions)
    }
}
