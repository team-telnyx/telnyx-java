// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking.portouts

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponse
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.portouts.events.EventListParams
import com.telnyx.api.models.portouts.events.EventListResponse
import com.telnyx.api.models.portouts.events.EventRepublishParams
import com.telnyx.api.models.portouts.events.EventRetrieveParams
import com.telnyx.api.models.portouts.events.EventRetrieveResponse
import java.util.function.Consumer

interface EventService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EventService

    /** Show a specific port-out event. */
    fun retrieve(id: String): EventRetrieveResponse = retrieve(id, EventRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: EventRetrieveParams = EventRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EventRetrieveResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: EventRetrieveParams = EventRetrieveParams.none(),
    ): EventRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: EventRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EventRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: EventRetrieveParams): EventRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): EventRetrieveResponse =
        retrieve(id, EventRetrieveParams.none(), requestOptions)

    /** Returns a list of all port-out events. */
    fun list(): EventListResponse = list(EventListParams.none())

    /** @see list */
    fun list(
        params: EventListParams = EventListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EventListResponse

    /** @see list */
    fun list(params: EventListParams = EventListParams.none()): EventListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): EventListResponse =
        list(EventListParams.none(), requestOptions)

    /** Republish a specific port-out event. */
    fun republish(id: String) = republish(id, EventRepublishParams.none())

    /** @see republish */
    fun republish(
        id: String,
        params: EventRepublishParams = EventRepublishParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = republish(params.toBuilder().id(id).build(), requestOptions)

    /** @see republish */
    fun republish(id: String, params: EventRepublishParams = EventRepublishParams.none()) =
        republish(id, params, RequestOptions.none())

    /** @see republish */
    fun republish(
        params: EventRepublishParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see republish */
    fun republish(params: EventRepublishParams) = republish(params, RequestOptions.none())

    /** @see republish */
    fun republish(id: String, requestOptions: RequestOptions) =
        republish(id, EventRepublishParams.none(), requestOptions)

    /** A view of [EventService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): EventService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /portouts/events/{id}`, but is otherwise the same as
         * [EventService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<EventRetrieveResponse> =
            retrieve(id, EventRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: EventRetrieveParams = EventRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EventRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: EventRetrieveParams = EventRetrieveParams.none(),
        ): HttpResponseFor<EventRetrieveResponse> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: EventRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EventRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: EventRetrieveParams): HttpResponseFor<EventRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EventRetrieveResponse> =
            retrieve(id, EventRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /portouts/events`, but is otherwise the same as
         * [EventService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<EventListResponse> = list(EventListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: EventListParams = EventListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EventListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: EventListParams = EventListParams.none()
        ): HttpResponseFor<EventListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<EventListResponse> =
            list(EventListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /portouts/events/{id}/republish`, but is otherwise
         * the same as [EventService.republish].
         */
        @MustBeClosed
        fun republish(id: String): HttpResponse = republish(id, EventRepublishParams.none())

        /** @see republish */
        @MustBeClosed
        fun republish(
            id: String,
            params: EventRepublishParams = EventRepublishParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = republish(params.toBuilder().id(id).build(), requestOptions)

        /** @see republish */
        @MustBeClosed
        fun republish(
            id: String,
            params: EventRepublishParams = EventRepublishParams.none(),
        ): HttpResponse = republish(id, params, RequestOptions.none())

        /** @see republish */
        @MustBeClosed
        fun republish(
            params: EventRepublishParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see republish */
        @MustBeClosed
        fun republish(params: EventRepublishParams): HttpResponse =
            republish(params, RequestOptions.none())

        /** @see republish */
        @MustBeClosed
        fun republish(id: String, requestOptions: RequestOptions): HttpResponse =
            republish(id, EventRepublishParams.none(), requestOptions)
    }
}
