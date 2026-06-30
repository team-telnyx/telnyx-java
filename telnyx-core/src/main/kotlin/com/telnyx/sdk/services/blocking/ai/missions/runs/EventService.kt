// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai.missions.runs

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.ai.missions.runs.events.EventGetEventDetailsParams
import com.telnyx.sdk.models.ai.missions.runs.events.EventGetEventDetailsResponse
import com.telnyx.sdk.models.ai.missions.runs.events.EventListPage
import com.telnyx.sdk.models.ai.missions.runs.events.EventListParams
import com.telnyx.sdk.models.ai.missions.runs.events.EventLogParams
import com.telnyx.sdk.models.ai.missions.runs.events.EventLogResponse
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

    /** List events for a run (paginated) */
    fun list(runId: String, params: EventListParams): EventListPage =
        list(runId, params, RequestOptions.none())

    /** @see list */
    fun list(
        runId: String,
        params: EventListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EventListPage = list(params.toBuilder().runId(runId).build(), requestOptions)

    /** @see list */
    fun list(params: EventListParams): EventListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: EventListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EventListPage

    /** Get details of a specific event */
    fun getEventDetails(
        eventId: String,
        params: EventGetEventDetailsParams,
    ): EventGetEventDetailsResponse = getEventDetails(eventId, params, RequestOptions.none())

    /** @see getEventDetails */
    fun getEventDetails(
        eventId: String,
        params: EventGetEventDetailsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EventGetEventDetailsResponse =
        getEventDetails(params.toBuilder().eventId(eventId).build(), requestOptions)

    /** @see getEventDetails */
    fun getEventDetails(params: EventGetEventDetailsParams): EventGetEventDetailsResponse =
        getEventDetails(params, RequestOptions.none())

    /** @see getEventDetails */
    fun getEventDetails(
        params: EventGetEventDetailsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EventGetEventDetailsResponse

    /** Log an event for a run */
    fun log(runId: String, params: EventLogParams): EventLogResponse =
        log(runId, params, RequestOptions.none())

    /** @see log */
    fun log(
        runId: String,
        params: EventLogParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EventLogResponse = log(params.toBuilder().runId(runId).build(), requestOptions)

    /** @see log */
    fun log(params: EventLogParams): EventLogResponse = log(params, RequestOptions.none())

    /** @see log */
    fun log(
        params: EventLogParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EventLogResponse

    /** A view of [EventService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): EventService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /ai/missions/{mission_id}/runs/{run_id}/events`, but
         * is otherwise the same as [EventService.list].
         */
        @MustBeClosed
        fun list(runId: String, params: EventListParams): HttpResponseFor<EventListPage> =
            list(runId, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            runId: String,
            params: EventListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EventListPage> =
            list(params.toBuilder().runId(runId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(params: EventListParams): HttpResponseFor<EventListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: EventListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EventListPage>

        /**
         * Returns a raw HTTP response for `get
         * /ai/missions/{mission_id}/runs/{run_id}/events/{event_id}`, but is otherwise the same as
         * [EventService.getEventDetails].
         */
        @MustBeClosed
        fun getEventDetails(
            eventId: String,
            params: EventGetEventDetailsParams,
        ): HttpResponseFor<EventGetEventDetailsResponse> =
            getEventDetails(eventId, params, RequestOptions.none())

        /** @see getEventDetails */
        @MustBeClosed
        fun getEventDetails(
            eventId: String,
            params: EventGetEventDetailsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EventGetEventDetailsResponse> =
            getEventDetails(params.toBuilder().eventId(eventId).build(), requestOptions)

        /** @see getEventDetails */
        @MustBeClosed
        fun getEventDetails(
            params: EventGetEventDetailsParams
        ): HttpResponseFor<EventGetEventDetailsResponse> =
            getEventDetails(params, RequestOptions.none())

        /** @see getEventDetails */
        @MustBeClosed
        fun getEventDetails(
            params: EventGetEventDetailsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EventGetEventDetailsResponse>

        /**
         * Returns a raw HTTP response for `post /ai/missions/{mission_id}/runs/{run_id}/events`,
         * but is otherwise the same as [EventService.log].
         */
        @MustBeClosed
        fun log(runId: String, params: EventLogParams): HttpResponseFor<EventLogResponse> =
            log(runId, params, RequestOptions.none())

        /** @see log */
        @MustBeClosed
        fun log(
            runId: String,
            params: EventLogParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EventLogResponse> =
            log(params.toBuilder().runId(runId).build(), requestOptions)

        /** @see log */
        @MustBeClosed
        fun log(params: EventLogParams): HttpResponseFor<EventLogResponse> =
            log(params, RequestOptions.none())

        /** @see log */
        @MustBeClosed
        fun log(
            params: EventLogParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EventLogResponse>
    }
}
