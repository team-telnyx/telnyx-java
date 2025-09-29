// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.list.ListRetrieveAllParams
import com.telnyx.api.models.list.ListRetrieveAllResponse
import com.telnyx.api.models.list.ListRetrieveByZoneParams
import com.telnyx.api.models.list.ListRetrieveByZoneResponse
import java.util.function.Consumer

interface ListService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ListService

    /** Retrieve a list of all phone numbers using Channel Billing, grouped by Zone. */
    fun retrieveAll(): ListRetrieveAllResponse = retrieveAll(ListRetrieveAllParams.none())

    /** @see retrieveAll */
    fun retrieveAll(
        params: ListRetrieveAllParams = ListRetrieveAllParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ListRetrieveAllResponse

    /** @see retrieveAll */
    fun retrieveAll(
        params: ListRetrieveAllParams = ListRetrieveAllParams.none()
    ): ListRetrieveAllResponse = retrieveAll(params, RequestOptions.none())

    /** @see retrieveAll */
    fun retrieveAll(requestOptions: RequestOptions): ListRetrieveAllResponse =
        retrieveAll(ListRetrieveAllParams.none(), requestOptions)

    /** Retrieve a list of phone numbers using Channel Billing for a specific Zone. */
    fun retrieveByZone(channelZoneId: String): ListRetrieveByZoneResponse =
        retrieveByZone(channelZoneId, ListRetrieveByZoneParams.none())

    /** @see retrieveByZone */
    fun retrieveByZone(
        channelZoneId: String,
        params: ListRetrieveByZoneParams = ListRetrieveByZoneParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ListRetrieveByZoneResponse =
        retrieveByZone(params.toBuilder().channelZoneId(channelZoneId).build(), requestOptions)

    /** @see retrieveByZone */
    fun retrieveByZone(
        channelZoneId: String,
        params: ListRetrieveByZoneParams = ListRetrieveByZoneParams.none(),
    ): ListRetrieveByZoneResponse = retrieveByZone(channelZoneId, params, RequestOptions.none())

    /** @see retrieveByZone */
    fun retrieveByZone(
        params: ListRetrieveByZoneParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ListRetrieveByZoneResponse

    /** @see retrieveByZone */
    fun retrieveByZone(params: ListRetrieveByZoneParams): ListRetrieveByZoneResponse =
        retrieveByZone(params, RequestOptions.none())

    /** @see retrieveByZone */
    fun retrieveByZone(
        channelZoneId: String,
        requestOptions: RequestOptions,
    ): ListRetrieveByZoneResponse =
        retrieveByZone(channelZoneId, ListRetrieveByZoneParams.none(), requestOptions)

    /** A view of [ListService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ListService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /list`, but is otherwise the same as
         * [ListService.retrieveAll].
         */
        @MustBeClosed
        fun retrieveAll(): HttpResponseFor<ListRetrieveAllResponse> =
            retrieveAll(ListRetrieveAllParams.none())

        /** @see retrieveAll */
        @MustBeClosed
        fun retrieveAll(
            params: ListRetrieveAllParams = ListRetrieveAllParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ListRetrieveAllResponse>

        /** @see retrieveAll */
        @MustBeClosed
        fun retrieveAll(
            params: ListRetrieveAllParams = ListRetrieveAllParams.none()
        ): HttpResponseFor<ListRetrieveAllResponse> = retrieveAll(params, RequestOptions.none())

        /** @see retrieveAll */
        @MustBeClosed
        fun retrieveAll(requestOptions: RequestOptions): HttpResponseFor<ListRetrieveAllResponse> =
            retrieveAll(ListRetrieveAllParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /list/{channel_zone_id}`, but is otherwise the same
         * as [ListService.retrieveByZone].
         */
        @MustBeClosed
        fun retrieveByZone(channelZoneId: String): HttpResponseFor<ListRetrieveByZoneResponse> =
            retrieveByZone(channelZoneId, ListRetrieveByZoneParams.none())

        /** @see retrieveByZone */
        @MustBeClosed
        fun retrieveByZone(
            channelZoneId: String,
            params: ListRetrieveByZoneParams = ListRetrieveByZoneParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ListRetrieveByZoneResponse> =
            retrieveByZone(params.toBuilder().channelZoneId(channelZoneId).build(), requestOptions)

        /** @see retrieveByZone */
        @MustBeClosed
        fun retrieveByZone(
            channelZoneId: String,
            params: ListRetrieveByZoneParams = ListRetrieveByZoneParams.none(),
        ): HttpResponseFor<ListRetrieveByZoneResponse> =
            retrieveByZone(channelZoneId, params, RequestOptions.none())

        /** @see retrieveByZone */
        @MustBeClosed
        fun retrieveByZone(
            params: ListRetrieveByZoneParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ListRetrieveByZoneResponse>

        /** @see retrieveByZone */
        @MustBeClosed
        fun retrieveByZone(
            params: ListRetrieveByZoneParams
        ): HttpResponseFor<ListRetrieveByZoneResponse> =
            retrieveByZone(params, RequestOptions.none())

        /** @see retrieveByZone */
        @MustBeClosed
        fun retrieveByZone(
            channelZoneId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ListRetrieveByZoneResponse> =
            retrieveByZone(channelZoneId, ListRetrieveByZoneParams.none(), requestOptions)
    }
}
