// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.globaliplatency.GlobalIpLatencyRetrieveParams
import com.telnyx.api.models.globaliplatency.GlobalIpLatencyRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface GlobalIpLatencyServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): GlobalIpLatencyServiceAsync

    /** Global IP Latency Metrics */
    fun retrieve(): CompletableFuture<GlobalIpLatencyRetrieveResponse> =
        retrieve(GlobalIpLatencyRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        params: GlobalIpLatencyRetrieveParams = GlobalIpLatencyRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<GlobalIpLatencyRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: GlobalIpLatencyRetrieveParams = GlobalIpLatencyRetrieveParams.none()
    ): CompletableFuture<GlobalIpLatencyRetrieveResponse> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        requestOptions: RequestOptions
    ): CompletableFuture<GlobalIpLatencyRetrieveResponse> =
        retrieve(GlobalIpLatencyRetrieveParams.none(), requestOptions)

    /**
     * A view of [GlobalIpLatencyServiceAsync] that provides access to raw HTTP responses for each
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
        ): GlobalIpLatencyServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /global_ip_latency`, but is otherwise the same as
         * [GlobalIpLatencyServiceAsync.retrieve].
         */
        fun retrieve(): CompletableFuture<HttpResponseFor<GlobalIpLatencyRetrieveResponse>> =
            retrieve(GlobalIpLatencyRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            params: GlobalIpLatencyRetrieveParams = GlobalIpLatencyRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<GlobalIpLatencyRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: GlobalIpLatencyRetrieveParams = GlobalIpLatencyRetrieveParams.none()
        ): CompletableFuture<HttpResponseFor<GlobalIpLatencyRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<GlobalIpLatencyRetrieveResponse>> =
            retrieve(GlobalIpLatencyRetrieveParams.none(), requestOptions)
    }
}
