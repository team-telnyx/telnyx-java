// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.globalipprotocols.GlobalIpProtocolListParams
import com.telnyx.sdk.models.globalipprotocols.GlobalIpProtocolListResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Global IPs */
interface GlobalIpProtocolServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): GlobalIpProtocolServiceAsync

    /** List all Global IP Protocols */
    fun list(): CompletableFuture<GlobalIpProtocolListResponse> =
        list(GlobalIpProtocolListParams.none())

    /** @see list */
    fun list(
        params: GlobalIpProtocolListParams = GlobalIpProtocolListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<GlobalIpProtocolListResponse>

    /** @see list */
    fun list(
        params: GlobalIpProtocolListParams = GlobalIpProtocolListParams.none()
    ): CompletableFuture<GlobalIpProtocolListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<GlobalIpProtocolListResponse> =
        list(GlobalIpProtocolListParams.none(), requestOptions)

    /**
     * A view of [GlobalIpProtocolServiceAsync] that provides access to raw HTTP responses for each
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
        ): GlobalIpProtocolServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /global_ip_protocols`, but is otherwise the same as
         * [GlobalIpProtocolServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<GlobalIpProtocolListResponse>> =
            list(GlobalIpProtocolListParams.none())

        /** @see list */
        fun list(
            params: GlobalIpProtocolListParams = GlobalIpProtocolListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<GlobalIpProtocolListResponse>>

        /** @see list */
        fun list(
            params: GlobalIpProtocolListParams = GlobalIpProtocolListParams.none()
        ): CompletableFuture<HttpResponseFor<GlobalIpProtocolListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<GlobalIpProtocolListResponse>> =
            list(GlobalIpProtocolListParams.none(), requestOptions)
    }
}
