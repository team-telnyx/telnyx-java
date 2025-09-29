// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking.ai.assistants

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.ai.assistants.scheduledevents.ScheduledEventCreateParams
import com.telnyx.api.models.ai.assistants.scheduledevents.ScheduledEventDeleteParams
import com.telnyx.api.models.ai.assistants.scheduledevents.ScheduledEventDeleteResponse
import com.telnyx.api.models.ai.assistants.scheduledevents.ScheduledEventListParams
import com.telnyx.api.models.ai.assistants.scheduledevents.ScheduledEventListResponse
import com.telnyx.api.models.ai.assistants.scheduledevents.ScheduledEventResponse
import com.telnyx.api.models.ai.assistants.scheduledevents.ScheduledEventRetrieveParams
import java.util.function.Consumer

interface ScheduledEventService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ScheduledEventService

    /** Create a scheduled event for an assistant */
    fun create(assistantId: String, params: ScheduledEventCreateParams): ScheduledEventResponse =
        create(assistantId, params, RequestOptions.none())

    /** @see create */
    fun create(
        assistantId: String,
        params: ScheduledEventCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ScheduledEventResponse =
        create(params.toBuilder().assistantId(assistantId).build(), requestOptions)

    /** @see create */
    fun create(params: ScheduledEventCreateParams): ScheduledEventResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ScheduledEventCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ScheduledEventResponse

    /** Retrieve a scheduled event by event ID */
    fun retrieve(eventId: String, params: ScheduledEventRetrieveParams): ScheduledEventResponse =
        retrieve(eventId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        eventId: String,
        params: ScheduledEventRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ScheduledEventResponse =
        retrieve(params.toBuilder().eventId(eventId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: ScheduledEventRetrieveParams): ScheduledEventResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ScheduledEventRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ScheduledEventResponse

    /** Get scheduled events for an assistant with pagination and filtering */
    fun list(assistantId: String): ScheduledEventListResponse =
        list(assistantId, ScheduledEventListParams.none())

    /** @see list */
    fun list(
        assistantId: String,
        params: ScheduledEventListParams = ScheduledEventListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ScheduledEventListResponse =
        list(params.toBuilder().assistantId(assistantId).build(), requestOptions)

    /** @see list */
    fun list(
        assistantId: String,
        params: ScheduledEventListParams = ScheduledEventListParams.none(),
    ): ScheduledEventListResponse = list(assistantId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: ScheduledEventListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ScheduledEventListResponse

    /** @see list */
    fun list(params: ScheduledEventListParams): ScheduledEventListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(assistantId: String, requestOptions: RequestOptions): ScheduledEventListResponse =
        list(assistantId, ScheduledEventListParams.none(), requestOptions)

    /**
     * If the event is pending, this will cancel the event. Otherwise, this will simply remove the
     * record of the event.
     */
    fun delete(eventId: String, params: ScheduledEventDeleteParams): ScheduledEventDeleteResponse =
        delete(eventId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        eventId: String,
        params: ScheduledEventDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ScheduledEventDeleteResponse =
        delete(params.toBuilder().eventId(eventId).build(), requestOptions)

    /** @see delete */
    fun delete(params: ScheduledEventDeleteParams): ScheduledEventDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: ScheduledEventDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ScheduledEventDeleteResponse

    /**
     * A view of [ScheduledEventService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ScheduledEventService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /ai/assistants/{assistant_id}/scheduled_events`,
         * but is otherwise the same as [ScheduledEventService.create].
         */
        @MustBeClosed
        fun create(
            assistantId: String,
            params: ScheduledEventCreateParams,
        ): HttpResponseFor<ScheduledEventResponse> =
            create(assistantId, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            assistantId: String,
            params: ScheduledEventCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ScheduledEventResponse> =
            create(params.toBuilder().assistantId(assistantId).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(params: ScheduledEventCreateParams): HttpResponseFor<ScheduledEventResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: ScheduledEventCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ScheduledEventResponse>

        /**
         * Returns a raw HTTP response for `get
         * /ai/assistants/{assistant_id}/scheduled_events/{event_id}`, but is otherwise the same as
         * [ScheduledEventService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            eventId: String,
            params: ScheduledEventRetrieveParams,
        ): HttpResponseFor<ScheduledEventResponse> =
            retrieve(eventId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            eventId: String,
            params: ScheduledEventRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ScheduledEventResponse> =
            retrieve(params.toBuilder().eventId(eventId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: ScheduledEventRetrieveParams
        ): HttpResponseFor<ScheduledEventResponse> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: ScheduledEventRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ScheduledEventResponse>

        /**
         * Returns a raw HTTP response for `get /ai/assistants/{assistant_id}/scheduled_events`, but
         * is otherwise the same as [ScheduledEventService.list].
         */
        @MustBeClosed
        fun list(assistantId: String): HttpResponseFor<ScheduledEventListResponse> =
            list(assistantId, ScheduledEventListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            assistantId: String,
            params: ScheduledEventListParams = ScheduledEventListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ScheduledEventListResponse> =
            list(params.toBuilder().assistantId(assistantId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            assistantId: String,
            params: ScheduledEventListParams = ScheduledEventListParams.none(),
        ): HttpResponseFor<ScheduledEventListResponse> =
            list(assistantId, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: ScheduledEventListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ScheduledEventListResponse>

        /** @see list */
        @MustBeClosed
        fun list(params: ScheduledEventListParams): HttpResponseFor<ScheduledEventListResponse> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            assistantId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ScheduledEventListResponse> =
            list(assistantId, ScheduledEventListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /ai/assistants/{assistant_id}/scheduled_events/{event_id}`, but is otherwise the same as
         * [ScheduledEventService.delete].
         */
        @MustBeClosed
        fun delete(
            eventId: String,
            params: ScheduledEventDeleteParams,
        ): HttpResponseFor<ScheduledEventDeleteResponse> =
            delete(eventId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            eventId: String,
            params: ScheduledEventDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ScheduledEventDeleteResponse> =
            delete(params.toBuilder().eventId(eventId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: ScheduledEventDeleteParams
        ): HttpResponseFor<ScheduledEventDeleteResponse> = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: ScheduledEventDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ScheduledEventDeleteResponse>
    }
}
