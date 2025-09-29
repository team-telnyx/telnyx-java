// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.wireless.WirelessRetrieveRegionsParams
import com.telnyx.api.models.wireless.WirelessRetrieveRegionsResponse
import com.telnyx.api.services.async.wireless.DetailRecordsReportServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface WirelessServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): WirelessServiceAsync

    fun detailRecordsReports(): DetailRecordsReportServiceAsync

    /** Retrieve all wireless regions for the given product. */
    fun retrieveRegions(
        params: WirelessRetrieveRegionsParams
    ): CompletableFuture<WirelessRetrieveRegionsResponse> =
        retrieveRegions(params, RequestOptions.none())

    /** @see retrieveRegions */
    fun retrieveRegions(
        params: WirelessRetrieveRegionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WirelessRetrieveRegionsResponse>

    /**
     * A view of [WirelessServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): WirelessServiceAsync.WithRawResponse

        fun detailRecordsReports(): DetailRecordsReportServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /wireless/regions`, but is otherwise the same as
         * [WirelessServiceAsync.retrieveRegions].
         */
        fun retrieveRegions(
            params: WirelessRetrieveRegionsParams
        ): CompletableFuture<HttpResponseFor<WirelessRetrieveRegionsResponse>> =
            retrieveRegions(params, RequestOptions.none())

        /** @see retrieveRegions */
        fun retrieveRegions(
            params: WirelessRetrieveRegionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WirelessRetrieveRegionsResponse>>
    }
}
