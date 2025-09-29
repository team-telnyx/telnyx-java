// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.porting

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.porting.events.EventListParams
import com.telnyx.sdk.models.porting.events.EventListResponse
import com.telnyx.sdk.models.porting.events.EventRepublishParams
import com.telnyx.sdk.models.porting.events.EventRetrieveParams
import com.telnyx.sdk.models.porting.events.EventRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface EventServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EventServiceAsync

    /** Show a specific porting event. */
    fun retrieve(id: String): CompletableFuture<EventRetrieveResponse> =
        retrieve(id, EventRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: EventRetrieveParams = EventRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EventRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: EventRetrieveParams = EventRetrieveParams.none(),
    ): CompletableFuture<EventRetrieveResponse> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: EventRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EventRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: EventRetrieveParams): CompletableFuture<EventRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<EventRetrieveResponse> =
        retrieve(id, EventRetrieveParams.none(), requestOptions)

    /** Returns a list of all porting events. */
    fun list(): CompletableFuture<EventListResponse> = list(EventListParams.none())

    /** @see list */
    fun list(
        params: EventListParams = EventListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EventListResponse>

    /** @see list */
    fun list(
        params: EventListParams = EventListParams.none()
    ): CompletableFuture<EventListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<EventListResponse> =
        list(EventListParams.none(), requestOptions)

    /** Republish a specific porting event. */
    fun republish(id: String): CompletableFuture<Void?> = republish(id, EventRepublishParams.none())

    /** @see republish */
    fun republish(
        id: String,
        params: EventRepublishParams = EventRepublishParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = republish(params.toBuilder().id(id).build(), requestOptions)

    /** @see republish */
    fun republish(
        id: String,
        params: EventRepublishParams = EventRepublishParams.none(),
    ): CompletableFuture<Void?> = republish(id, params, RequestOptions.none())

    /** @see republish */
    fun republish(
        params: EventRepublishParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see republish */
    fun republish(params: EventRepublishParams): CompletableFuture<Void?> =
        republish(params, RequestOptions.none())

    /** @see republish */
    fun republish(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        republish(id, EventRepublishParams.none(), requestOptions)

    /** A view of [EventServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EventServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /porting/events/{id}`, but is otherwise the same as
         * [EventServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<EventRetrieveResponse>> =
            retrieve(id, EventRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: EventRetrieveParams = EventRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EventRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: EventRetrieveParams = EventRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<EventRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: EventRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EventRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: EventRetrieveParams
        ): CompletableFuture<HttpResponseFor<EventRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EventRetrieveResponse>> =
            retrieve(id, EventRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /porting/events`, but is otherwise the same as
         * [EventServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<EventListResponse>> =
            list(EventListParams.none())

        /** @see list */
        fun list(
            params: EventListParams = EventListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EventListResponse>>

        /** @see list */
        fun list(
            params: EventListParams = EventListParams.none()
        ): CompletableFuture<HttpResponseFor<EventListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<EventListResponse>> =
            list(EventListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /porting/events/{id}/republish`, but is otherwise
         * the same as [EventServiceAsync.republish].
         */
        fun republish(id: String): CompletableFuture<HttpResponse> =
            republish(id, EventRepublishParams.none())

        /** @see republish */
        fun republish(
            id: String,
            params: EventRepublishParams = EventRepublishParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            republish(params.toBuilder().id(id).build(), requestOptions)

        /** @see republish */
        fun republish(
            id: String,
            params: EventRepublishParams = EventRepublishParams.none(),
        ): CompletableFuture<HttpResponse> = republish(id, params, RequestOptions.none())

        /** @see republish */
        fun republish(
            params: EventRepublishParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see republish */
        fun republish(params: EventRepublishParams): CompletableFuture<HttpResponse> =
            republish(params, RequestOptions.none())

        /** @see republish */
        fun republish(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            republish(id, EventRepublishParams.none(), requestOptions)
    }
}
