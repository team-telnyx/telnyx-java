// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.globalipallowedports.GlobalIpAllowedPortListParams
import com.telnyx.sdk.models.globalipallowedports.GlobalIpAllowedPortListResponse
import java.util.function.Consumer

/** Global IPs */
interface GlobalIpAllowedPortService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): GlobalIpAllowedPortService

    /** List all Global IP Allowed Ports */
    fun list(): GlobalIpAllowedPortListResponse = list(GlobalIpAllowedPortListParams.none())

    /** @see list */
    fun list(
        params: GlobalIpAllowedPortListParams = GlobalIpAllowedPortListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GlobalIpAllowedPortListResponse

    /** @see list */
    fun list(
        params: GlobalIpAllowedPortListParams = GlobalIpAllowedPortListParams.none()
    ): GlobalIpAllowedPortListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): GlobalIpAllowedPortListResponse =
        list(GlobalIpAllowedPortListParams.none(), requestOptions)

    /**
     * A view of [GlobalIpAllowedPortService] that provides access to raw HTTP responses for each
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
        ): GlobalIpAllowedPortService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /global_ip_allowed_ports`, but is otherwise the same
         * as [GlobalIpAllowedPortService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<GlobalIpAllowedPortListResponse> =
            list(GlobalIpAllowedPortListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: GlobalIpAllowedPortListParams = GlobalIpAllowedPortListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GlobalIpAllowedPortListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: GlobalIpAllowedPortListParams = GlobalIpAllowedPortListParams.none()
        ): HttpResponseFor<GlobalIpAllowedPortListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<GlobalIpAllowedPortListResponse> =
            list(GlobalIpAllowedPortListParams.none(), requestOptions)
    }
}
