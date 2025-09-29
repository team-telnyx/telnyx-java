// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.globalipusage.GlobalIpUsageRetrieveParams
import com.telnyx.api.models.globalipusage.GlobalIpUsageRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface GlobalIpUsageServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): GlobalIpUsageServiceAsync

    /** Global IP Usage Metrics */
    fun retrieve(): CompletableFuture<GlobalIpUsageRetrieveResponse> =
        retrieve(GlobalIpUsageRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        params: GlobalIpUsageRetrieveParams = GlobalIpUsageRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<GlobalIpUsageRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: GlobalIpUsageRetrieveParams = GlobalIpUsageRetrieveParams.none()
    ): CompletableFuture<GlobalIpUsageRetrieveResponse> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(requestOptions: RequestOptions): CompletableFuture<GlobalIpUsageRetrieveResponse> =
        retrieve(GlobalIpUsageRetrieveParams.none(), requestOptions)

    /**
     * A view of [GlobalIpUsageServiceAsync] that provides access to raw HTTP responses for each
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
        ): GlobalIpUsageServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /global_ip_usage`, but is otherwise the same as
         * [GlobalIpUsageServiceAsync.retrieve].
         */
        fun retrieve(): CompletableFuture<HttpResponseFor<GlobalIpUsageRetrieveResponse>> =
            retrieve(GlobalIpUsageRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            params: GlobalIpUsageRetrieveParams = GlobalIpUsageRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<GlobalIpUsageRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: GlobalIpUsageRetrieveParams = GlobalIpUsageRetrieveParams.none()
        ): CompletableFuture<HttpResponseFor<GlobalIpUsageRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<GlobalIpUsageRetrieveResponse>> =
            retrieve(GlobalIpUsageRetrieveParams.none(), requestOptions)
    }
}
