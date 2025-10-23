// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.globaliplatency.GlobalIpLatencyRetrieveParams
import com.telnyx.sdk.models.globaliplatency.GlobalIpLatencyRetrieveResponse
import java.util.function.Consumer

interface GlobalIpLatencyService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): GlobalIpLatencyService

    /** Global IP Latency Metrics */
    fun retrieve(): GlobalIpLatencyRetrieveResponse = retrieve(GlobalIpLatencyRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        params: GlobalIpLatencyRetrieveParams = GlobalIpLatencyRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GlobalIpLatencyRetrieveResponse

    /** @see retrieve */
    fun retrieve(
        params: GlobalIpLatencyRetrieveParams = GlobalIpLatencyRetrieveParams.none()
    ): GlobalIpLatencyRetrieveResponse = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(requestOptions: RequestOptions): GlobalIpLatencyRetrieveResponse =
        retrieve(GlobalIpLatencyRetrieveParams.none(), requestOptions)

    /**
     * A view of [GlobalIpLatencyService] that provides access to raw HTTP responses for each
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
        ): GlobalIpLatencyService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /global_ip_latency`, but is otherwise the same as
         * [GlobalIpLatencyService.retrieve].
         */
        @MustBeClosed
        fun retrieve(): HttpResponseFor<GlobalIpLatencyRetrieveResponse> =
            retrieve(GlobalIpLatencyRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: GlobalIpLatencyRetrieveParams = GlobalIpLatencyRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GlobalIpLatencyRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: GlobalIpLatencyRetrieveParams = GlobalIpLatencyRetrieveParams.none()
        ): HttpResponseFor<GlobalIpLatencyRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            requestOptions: RequestOptions
        ): HttpResponseFor<GlobalIpLatencyRetrieveResponse> =
            retrieve(GlobalIpLatencyRetrieveParams.none(), requestOptions)
    }
}
