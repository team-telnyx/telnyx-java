// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.globalipallowedports.GlobalIpAllowedPortListParams
import com.telnyx.api.models.globalipallowedports.GlobalIpAllowedPortListResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface GlobalIpAllowedPortServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): GlobalIpAllowedPortServiceAsync

    /** List all Global IP Allowed Ports */
    fun list(): CompletableFuture<GlobalIpAllowedPortListResponse> =
        list(GlobalIpAllowedPortListParams.none())

    /** @see list */
    fun list(
        params: GlobalIpAllowedPortListParams = GlobalIpAllowedPortListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<GlobalIpAllowedPortListResponse>

    /** @see list */
    fun list(
        params: GlobalIpAllowedPortListParams = GlobalIpAllowedPortListParams.none()
    ): CompletableFuture<GlobalIpAllowedPortListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<GlobalIpAllowedPortListResponse> =
        list(GlobalIpAllowedPortListParams.none(), requestOptions)

    /**
     * A view of [GlobalIpAllowedPortServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): GlobalIpAllowedPortServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /global_ip_allowed_ports`, but is otherwise the same
         * as [GlobalIpAllowedPortServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<GlobalIpAllowedPortListResponse>> =
            list(GlobalIpAllowedPortListParams.none())

        /** @see list */
        fun list(
            params: GlobalIpAllowedPortListParams = GlobalIpAllowedPortListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<GlobalIpAllowedPortListResponse>>

        /** @see list */
        fun list(
            params: GlobalIpAllowedPortListParams = GlobalIpAllowedPortListParams.none()
        ): CompletableFuture<HttpResponseFor<GlobalIpAllowedPortListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<GlobalIpAllowedPortListResponse>> =
            list(GlobalIpAllowedPortListParams.none(), requestOptions)
    }
}
