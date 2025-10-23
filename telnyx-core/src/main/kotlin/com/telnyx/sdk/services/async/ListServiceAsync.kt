// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.list.ListRetrieveAllParams
import com.telnyx.sdk.models.list.ListRetrieveAllResponse
import com.telnyx.sdk.models.list.ListRetrieveByZoneParams
import com.telnyx.sdk.models.list.ListRetrieveByZoneResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ListServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ListServiceAsync

    /** Retrieve a list of all phone numbers using Channel Billing, grouped by Zone. */
    fun retrieveAll(): CompletableFuture<ListRetrieveAllResponse> =
        retrieveAll(ListRetrieveAllParams.none())

    /** @see retrieveAll */
    fun retrieveAll(
        params: ListRetrieveAllParams = ListRetrieveAllParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ListRetrieveAllResponse>

    /** @see retrieveAll */
    fun retrieveAll(
        params: ListRetrieveAllParams = ListRetrieveAllParams.none()
    ): CompletableFuture<ListRetrieveAllResponse> = retrieveAll(params, RequestOptions.none())

    /** @see retrieveAll */
    fun retrieveAll(requestOptions: RequestOptions): CompletableFuture<ListRetrieveAllResponse> =
        retrieveAll(ListRetrieveAllParams.none(), requestOptions)

    /** Retrieve a list of phone numbers using Channel Billing for a specific Zone. */
    fun retrieveByZone(channelZoneId: String): CompletableFuture<ListRetrieveByZoneResponse> =
        retrieveByZone(channelZoneId, ListRetrieveByZoneParams.none())

    /** @see retrieveByZone */
    fun retrieveByZone(
        channelZoneId: String,
        params: ListRetrieveByZoneParams = ListRetrieveByZoneParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ListRetrieveByZoneResponse> =
        retrieveByZone(params.toBuilder().channelZoneId(channelZoneId).build(), requestOptions)

    /** @see retrieveByZone */
    fun retrieveByZone(
        channelZoneId: String,
        params: ListRetrieveByZoneParams = ListRetrieveByZoneParams.none(),
    ): CompletableFuture<ListRetrieveByZoneResponse> =
        retrieveByZone(channelZoneId, params, RequestOptions.none())

    /** @see retrieveByZone */
    fun retrieveByZone(
        params: ListRetrieveByZoneParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ListRetrieveByZoneResponse>

    /** @see retrieveByZone */
    fun retrieveByZone(
        params: ListRetrieveByZoneParams
    ): CompletableFuture<ListRetrieveByZoneResponse> = retrieveByZone(params, RequestOptions.none())

    /** @see retrieveByZone */
    fun retrieveByZone(
        channelZoneId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ListRetrieveByZoneResponse> =
        retrieveByZone(channelZoneId, ListRetrieveByZoneParams.none(), requestOptions)

    /** A view of [ListServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ListServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /list`, but is otherwise the same as
         * [ListServiceAsync.retrieveAll].
         */
        fun retrieveAll(): CompletableFuture<HttpResponseFor<ListRetrieveAllResponse>> =
            retrieveAll(ListRetrieveAllParams.none())

        /** @see retrieveAll */
        fun retrieveAll(
            params: ListRetrieveAllParams = ListRetrieveAllParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ListRetrieveAllResponse>>

        /** @see retrieveAll */
        fun retrieveAll(
            params: ListRetrieveAllParams = ListRetrieveAllParams.none()
        ): CompletableFuture<HttpResponseFor<ListRetrieveAllResponse>> =
            retrieveAll(params, RequestOptions.none())

        /** @see retrieveAll */
        fun retrieveAll(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ListRetrieveAllResponse>> =
            retrieveAll(ListRetrieveAllParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /list/{channel_zone_id}`, but is otherwise the same
         * as [ListServiceAsync.retrieveByZone].
         */
        fun retrieveByZone(
            channelZoneId: String
        ): CompletableFuture<HttpResponseFor<ListRetrieveByZoneResponse>> =
            retrieveByZone(channelZoneId, ListRetrieveByZoneParams.none())

        /** @see retrieveByZone */
        fun retrieveByZone(
            channelZoneId: String,
            params: ListRetrieveByZoneParams = ListRetrieveByZoneParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ListRetrieveByZoneResponse>> =
            retrieveByZone(params.toBuilder().channelZoneId(channelZoneId).build(), requestOptions)

        /** @see retrieveByZone */
        fun retrieveByZone(
            channelZoneId: String,
            params: ListRetrieveByZoneParams = ListRetrieveByZoneParams.none(),
        ): CompletableFuture<HttpResponseFor<ListRetrieveByZoneResponse>> =
            retrieveByZone(channelZoneId, params, RequestOptions.none())

        /** @see retrieveByZone */
        fun retrieveByZone(
            params: ListRetrieveByZoneParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ListRetrieveByZoneResponse>>

        /** @see retrieveByZone */
        fun retrieveByZone(
            params: ListRetrieveByZoneParams
        ): CompletableFuture<HttpResponseFor<ListRetrieveByZoneResponse>> =
            retrieveByZone(params, RequestOptions.none())

        /** @see retrieveByZone */
        fun retrieveByZone(
            channelZoneId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ListRetrieveByZoneResponse>> =
            retrieveByZone(channelZoneId, ListRetrieveByZoneParams.none(), requestOptions)
    }
}
