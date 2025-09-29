// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.globalipusage.GlobalIpUsageRetrieveParams
import com.telnyx.api.models.globalipusage.GlobalIpUsageRetrieveResponse
import java.util.function.Consumer

interface GlobalIpUsageService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): GlobalIpUsageService

    /** Global IP Usage Metrics */
    fun retrieve(): GlobalIpUsageRetrieveResponse = retrieve(GlobalIpUsageRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        params: GlobalIpUsageRetrieveParams = GlobalIpUsageRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GlobalIpUsageRetrieveResponse

    /** @see retrieve */
    fun retrieve(
        params: GlobalIpUsageRetrieveParams = GlobalIpUsageRetrieveParams.none()
    ): GlobalIpUsageRetrieveResponse = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(requestOptions: RequestOptions): GlobalIpUsageRetrieveResponse =
        retrieve(GlobalIpUsageRetrieveParams.none(), requestOptions)

    /**
     * A view of [GlobalIpUsageService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): GlobalIpUsageService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /global_ip_usage`, but is otherwise the same as
         * [GlobalIpUsageService.retrieve].
         */
        @MustBeClosed
        fun retrieve(): HttpResponseFor<GlobalIpUsageRetrieveResponse> =
            retrieve(GlobalIpUsageRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: GlobalIpUsageRetrieveParams = GlobalIpUsageRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GlobalIpUsageRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: GlobalIpUsageRetrieveParams = GlobalIpUsageRetrieveParams.none()
        ): HttpResponseFor<GlobalIpUsageRetrieveResponse> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            requestOptions: RequestOptions
        ): HttpResponseFor<GlobalIpUsageRetrieveResponse> =
            retrieve(GlobalIpUsageRetrieveParams.none(), requestOptions)
    }
}
