// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.porting.PortingListUkCarriersParams
import com.telnyx.sdk.models.porting.PortingListUkCarriersResponse
import com.telnyx.sdk.services.blocking.porting.EventService
import com.telnyx.sdk.services.blocking.porting.LoaConfigurationService
import com.telnyx.sdk.services.blocking.porting.ReportService
import java.util.function.Consumer

interface PortingService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PortingService

    fun events(): EventService

    fun reports(): ReportService

    fun loaConfigurations(): LoaConfigurationService

    /** List available carriers in the UK. */
    fun listUkCarriers(): PortingListUkCarriersResponse =
        listUkCarriers(PortingListUkCarriersParams.none())

    /** @see listUkCarriers */
    fun listUkCarriers(
        params: PortingListUkCarriersParams = PortingListUkCarriersParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PortingListUkCarriersResponse

    /** @see listUkCarriers */
    fun listUkCarriers(
        params: PortingListUkCarriersParams = PortingListUkCarriersParams.none()
    ): PortingListUkCarriersResponse = listUkCarriers(params, RequestOptions.none())

    /** @see listUkCarriers */
    fun listUkCarriers(requestOptions: RequestOptions): PortingListUkCarriersResponse =
        listUkCarriers(PortingListUkCarriersParams.none(), requestOptions)

    /** A view of [PortingService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): PortingService.WithRawResponse

        fun events(): EventService.WithRawResponse

        fun reports(): ReportService.WithRawResponse

        fun loaConfigurations(): LoaConfigurationService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /porting/uk_carriers`, but is otherwise the same as
         * [PortingService.listUkCarriers].
         */
        @MustBeClosed
        fun listUkCarriers(): HttpResponseFor<PortingListUkCarriersResponse> =
            listUkCarriers(PortingListUkCarriersParams.none())

        /** @see listUkCarriers */
        @MustBeClosed
        fun listUkCarriers(
            params: PortingListUkCarriersParams = PortingListUkCarriersParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PortingListUkCarriersResponse>

        /** @see listUkCarriers */
        @MustBeClosed
        fun listUkCarriers(
            params: PortingListUkCarriersParams = PortingListUkCarriersParams.none()
        ): HttpResponseFor<PortingListUkCarriersResponse> =
            listUkCarriers(params, RequestOptions.none())

        /** @see listUkCarriers */
        @MustBeClosed
        fun listUkCarriers(
            requestOptions: RequestOptions
        ): HttpResponseFor<PortingListUkCarriersResponse> =
            listUkCarriers(PortingListUkCarriersParams.none(), requestOptions)
    }
}
