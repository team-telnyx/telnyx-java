// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.wireless.WirelessRetrieveRegionsParams
import com.telnyx.api.models.wireless.WirelessRetrieveRegionsResponse
import com.telnyx.api.services.blocking.wireless.DetailRecordsReportService
import java.util.function.Consumer

interface WirelessService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): WirelessService

    fun detailRecordsReports(): DetailRecordsReportService

    /** Retrieve all wireless regions for the given product. */
    fun retrieveRegions(params: WirelessRetrieveRegionsParams): WirelessRetrieveRegionsResponse =
        retrieveRegions(params, RequestOptions.none())

    /** @see retrieveRegions */
    fun retrieveRegions(
        params: WirelessRetrieveRegionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WirelessRetrieveRegionsResponse

    /** A view of [WirelessService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): WirelessService.WithRawResponse

        fun detailRecordsReports(): DetailRecordsReportService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /wireless/regions`, but is otherwise the same as
         * [WirelessService.retrieveRegions].
         */
        @MustBeClosed
        fun retrieveRegions(
            params: WirelessRetrieveRegionsParams
        ): HttpResponseFor<WirelessRetrieveRegionsResponse> =
            retrieveRegions(params, RequestOptions.none())

        /** @see retrieveRegions */
        @MustBeClosed
        fun retrieveRegions(
            params: WirelessRetrieveRegionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WirelessRetrieveRegionsResponse>
    }
}
