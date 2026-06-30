// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.networkcoverage.NetworkCoverageListPage
import com.telnyx.sdk.models.networkcoverage.NetworkCoverageListParams
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
    fun list(): NetworkCoverageListPage = list(NetworkCoverageListParams.none())

    /** @see list */
    fun list(
        params: NetworkCoverageListParams = NetworkCoverageListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NetworkCoverageListPage

    /** @see list */
    fun list(
        params: NetworkCoverageListParams = NetworkCoverageListParams.none()
    ): NetworkCoverageListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): NetworkCoverageListPage =
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
        fun list(): HttpResponseFor<NetworkCoverageListPage> =
            list(NetworkCoverageListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: NetworkCoverageListParams = NetworkCoverageListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NetworkCoverageListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: NetworkCoverageListParams = NetworkCoverageListParams.none()
        ): HttpResponseFor<NetworkCoverageListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<NetworkCoverageListPage> =
            list(NetworkCoverageListParams.none(), requestOptions)
    }
}
