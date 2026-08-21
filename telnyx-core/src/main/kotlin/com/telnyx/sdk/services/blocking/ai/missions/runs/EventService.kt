// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai.missions.runs

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.ai.missions.runs.events.EventGetEventDetailsParams
import com.telnyx.sdk.models.ai.missions.runs.events.EventListPage
import com.telnyx.sdk.models.ai.missions.runs.events.EventListParams
import com.telnyx.sdk.models.ai.missions.runs.events.EventLogParams
import com.telnyx.sdk.models.ai.missions.runs.events.EventResponse
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

    /**
     * Returns a paginated list of events logged for the specified run, filterable by event type,
     * plan step, and agent, so you can reconstruct exactly what happened during execution.
     */
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

    /**
     * Returns the details of a single event logged for the specified run, including its type and
     * payload.
     */
    fun getEventDetails(eventId: String, params: EventGetEventDetailsParams): EventResponse =
        getEventDetails(eventId, params, RequestOptions.none())

    /** @see getEventDetails */
    fun getEventDetails(
        eventId: String,
        params: EventGetEventDetailsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EventResponse = getEventDetails(params.toBuilder().eventId(eventId).build(), requestOptions)

    /** @see getEventDetails */
    fun getEventDetails(params: EventGetEventDetailsParams): EventResponse =
        getEventDetails(params, RequestOptions.none())

    /** @see getEventDetails */
    fun getEventDetails(
        params: EventGetEventDetailsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EventResponse

    /**
     * Logs a new event against the specified run and returns the created event. Events form the
     * run's audit trail and can reference a plan step or agent.
     */
    fun log(runId: String, params: EventLogParams): EventResponse =
        log(runId, params, RequestOptions.none())

    /** @see log */
    fun log(
        runId: String,
        params: EventLogParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EventResponse = log(params.toBuilder().runId(runId).build(), requestOptions)

    /** @see log */
    fun log(params: EventLogParams): EventResponse = log(params, RequestOptions.none())

    /** @see log */
    fun log(
        params: EventLogParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EventResponse

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
        ): HttpResponseFor<EventResponse> = getEventDetails(eventId, params, RequestOptions.none())

        /** @see getEventDetails */
        @MustBeClosed
        fun getEventDetails(
            eventId: String,
            params: EventGetEventDetailsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EventResponse> =
            getEventDetails(params.toBuilder().eventId(eventId).build(), requestOptions)

        /** @see getEventDetails */
        @MustBeClosed
        fun getEventDetails(params: EventGetEventDetailsParams): HttpResponseFor<EventResponse> =
            getEventDetails(params, RequestOptions.none())

        /** @see getEventDetails */
        @MustBeClosed
        fun getEventDetails(
            params: EventGetEventDetailsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EventResponse>

        /**
         * Returns a raw HTTP response for `post /ai/missions/{mission_id}/runs/{run_id}/events`,
         * but is otherwise the same as [EventService.log].
         */
        @MustBeClosed
        fun log(runId: String, params: EventLogParams): HttpResponseFor<EventResponse> =
            log(runId, params, RequestOptions.none())

        /** @see log */
        @MustBeClosed
        fun log(
            runId: String,
            params: EventLogParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EventResponse> =
            log(params.toBuilder().runId(runId).build(), requestOptions)

        /** @see log */
        @MustBeClosed
        fun log(params: EventLogParams): HttpResponseFor<EventResponse> =
            log(params, RequestOptions.none())

        /** @see log */
        @MustBeClosed
        fun log(
            params: EventLogParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EventResponse>
    }
}
