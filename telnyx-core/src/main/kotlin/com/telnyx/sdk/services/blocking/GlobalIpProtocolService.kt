// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.globalipprotocols.GlobalIpProtocolListParams
import com.telnyx.sdk.models.globalipprotocols.GlobalIpProtocolListResponse
import java.util.function.Consumer

/** Global IPs */
interface GlobalIpProtocolService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): GlobalIpProtocolService

    /** List all Global IP Protocols */
    fun list(): GlobalIpProtocolListResponse = list(GlobalIpProtocolListParams.none())

    /** @see list */
    fun list(
        params: GlobalIpProtocolListParams = GlobalIpProtocolListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GlobalIpProtocolListResponse

    /** @see list */
    fun list(
        params: GlobalIpProtocolListParams = GlobalIpProtocolListParams.none()
    ): GlobalIpProtocolListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): GlobalIpProtocolListResponse =
        list(GlobalIpProtocolListParams.none(), requestOptions)

    /**
     * A view of [GlobalIpProtocolService] that provides access to raw HTTP responses for each
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
        ): GlobalIpProtocolService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /global_ip_protocols`, but is otherwise the same as
         * [GlobalIpProtocolService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<GlobalIpProtocolListResponse> =
            list(GlobalIpProtocolListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: GlobalIpProtocolListParams = GlobalIpProtocolListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GlobalIpProtocolListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: GlobalIpProtocolListParams = GlobalIpProtocolListParams.none()
        ): HttpResponseFor<GlobalIpProtocolListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<GlobalIpProtocolListResponse> =
            list(GlobalIpProtocolListParams.none(), requestOptions)
    }
}
