// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.porting.PortingListUkCarriersParams
import com.telnyx.sdk.models.porting.PortingListUkCarriersResponse
import com.telnyx.sdk.services.async.porting.EventServiceAsync
import com.telnyx.sdk.services.async.porting.LoaConfigurationServiceAsync
import com.telnyx.sdk.services.async.porting.ReportServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Endpoints related to porting orders management. */
interface PortingServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PortingServiceAsync

    /** Endpoints related to porting orders management. */
    fun events(): EventServiceAsync

    /** Endpoints related to porting orders management. */
    fun reports(): ReportServiceAsync

    /** Endpoints related to porting orders management. */
    fun loaConfigurations(): LoaConfigurationServiceAsync

    /** List available carriers in the UK. */
    fun listUkCarriers(): CompletableFuture<PortingListUkCarriersResponse> =
        listUkCarriers(PortingListUkCarriersParams.none())

    /** @see listUkCarriers */
    fun listUkCarriers(
        params: PortingListUkCarriersParams = PortingListUkCarriersParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PortingListUkCarriersResponse>

    /** @see listUkCarriers */
    fun listUkCarriers(
        params: PortingListUkCarriersParams = PortingListUkCarriersParams.none()
    ): CompletableFuture<PortingListUkCarriersResponse> =
        listUkCarriers(params, RequestOptions.none())

    /** @see listUkCarriers */
    fun listUkCarriers(
        requestOptions: RequestOptions
    ): CompletableFuture<PortingListUkCarriersResponse> =
        listUkCarriers(PortingListUkCarriersParams.none(), requestOptions)

    /**
     * A view of [PortingServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PortingServiceAsync.WithRawResponse

        /** Endpoints related to porting orders management. */
        fun events(): EventServiceAsync.WithRawResponse

        /** Endpoints related to porting orders management. */
        fun reports(): ReportServiceAsync.WithRawResponse

        /** Endpoints related to porting orders management. */
        fun loaConfigurations(): LoaConfigurationServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /porting/uk_carriers`, but is otherwise the same as
         * [PortingServiceAsync.listUkCarriers].
         */
        fun listUkCarriers(): CompletableFuture<HttpResponseFor<PortingListUkCarriersResponse>> =
            listUkCarriers(PortingListUkCarriersParams.none())

        /** @see listUkCarriers */
        fun listUkCarriers(
            params: PortingListUkCarriersParams = PortingListUkCarriersParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PortingListUkCarriersResponse>>

        /** @see listUkCarriers */
        fun listUkCarriers(
            params: PortingListUkCarriersParams = PortingListUkCarriersParams.none()
        ): CompletableFuture<HttpResponseFor<PortingListUkCarriersResponse>> =
            listUkCarriers(params, RequestOptions.none())

        /** @see listUkCarriers */
        fun listUkCarriers(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<PortingListUkCarriersResponse>> =
            listUkCarriers(PortingListUkCarriersParams.none(), requestOptions)
    }
}
