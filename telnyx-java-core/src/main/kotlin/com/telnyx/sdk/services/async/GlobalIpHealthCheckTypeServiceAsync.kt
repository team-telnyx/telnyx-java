// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.globaliphealthchecktypes.GlobalIpHealthCheckTypeListParams
import com.telnyx.sdk.models.globaliphealthchecktypes.GlobalIpHealthCheckTypeListResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface GlobalIpHealthCheckTypeServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): GlobalIpHealthCheckTypeServiceAsync

    /** List all Global IP Health check types. */
    fun list(): CompletableFuture<GlobalIpHealthCheckTypeListResponse> =
        list(GlobalIpHealthCheckTypeListParams.none())

    /** @see list */
    fun list(
        params: GlobalIpHealthCheckTypeListParams = GlobalIpHealthCheckTypeListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<GlobalIpHealthCheckTypeListResponse>

    /** @see list */
    fun list(
        params: GlobalIpHealthCheckTypeListParams = GlobalIpHealthCheckTypeListParams.none()
    ): CompletableFuture<GlobalIpHealthCheckTypeListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(
        requestOptions: RequestOptions
    ): CompletableFuture<GlobalIpHealthCheckTypeListResponse> =
        list(GlobalIpHealthCheckTypeListParams.none(), requestOptions)

    /**
     * A view of [GlobalIpHealthCheckTypeServiceAsync] that provides access to raw HTTP responses
     * for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): GlobalIpHealthCheckTypeServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /global_ip_health_check_types`, but is otherwise the
         * same as [GlobalIpHealthCheckTypeServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<GlobalIpHealthCheckTypeListResponse>> =
            list(GlobalIpHealthCheckTypeListParams.none())

        /** @see list */
        fun list(
            params: GlobalIpHealthCheckTypeListParams = GlobalIpHealthCheckTypeListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<GlobalIpHealthCheckTypeListResponse>>

        /** @see list */
        fun list(
            params: GlobalIpHealthCheckTypeListParams = GlobalIpHealthCheckTypeListParams.none()
        ): CompletableFuture<HttpResponseFor<GlobalIpHealthCheckTypeListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<GlobalIpHealthCheckTypeListResponse>> =
            list(GlobalIpHealthCheckTypeListParams.none(), requestOptions)
    }
}
