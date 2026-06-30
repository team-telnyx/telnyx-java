// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai.missions.runs

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.ai.missions.runs.events.EventGetEventDetailsParams
import com.telnyx.sdk.models.ai.missions.runs.events.EventGetEventDetailsResponse
import com.telnyx.sdk.models.ai.missions.runs.events.EventListPageAsync
import com.telnyx.sdk.models.ai.missions.runs.events.EventListParams
import com.telnyx.sdk.models.ai.missions.runs.events.EventLogParams
import com.telnyx.sdk.models.ai.missions.runs.events.EventLogResponse
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

    /** List events for a run (paginated) */
    fun list(runId: String, params: EventListParams): CompletableFuture<EventListPageAsync> =
        list(runId, params, RequestOptions.none())

    /** @see list */
    fun list(
        runId: String,
        params: EventListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EventListPageAsync> =
        list(params.toBuilder().runId(runId).build(), requestOptions)

    /** @see list */
    fun list(params: EventListParams): CompletableFuture<EventListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: EventListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EventListPageAsync>

    /** Get details of a specific event */
    fun getEventDetails(
        eventId: String,
        params: EventGetEventDetailsParams,
    ): CompletableFuture<EventGetEventDetailsResponse> =
        getEventDetails(eventId, params, RequestOptions.none())

    /** @see getEventDetails */
    fun getEventDetails(
        eventId: String,
        params: EventGetEventDetailsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EventGetEventDetailsResponse> =
        getEventDetails(params.toBuilder().eventId(eventId).build(), requestOptions)

    /** @see getEventDetails */
    fun getEventDetails(
        params: EventGetEventDetailsParams
    ): CompletableFuture<EventGetEventDetailsResponse> =
        getEventDetails(params, RequestOptions.none())

    /** @see getEventDetails */
    fun getEventDetails(
        params: EventGetEventDetailsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EventGetEventDetailsResponse>

    /** Log an event for a run */
    fun log(runId: String, params: EventLogParams): CompletableFuture<EventLogResponse> =
        log(runId, params, RequestOptions.none())

    /** @see log */
    fun log(
        runId: String,
        params: EventLogParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EventLogResponse> =
        log(params.toBuilder().runId(runId).build(), requestOptions)

    /** @see log */
    fun log(params: EventLogParams): CompletableFuture<EventLogResponse> =
        log(params, RequestOptions.none())

    /** @see log */
    fun log(
        params: EventLogParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EventLogResponse>

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
         * Returns a raw HTTP response for `get /ai/missions/{mission_id}/runs/{run_id}/events`, but
         * is otherwise the same as [EventServiceAsync.list].
         */
        fun list(
            runId: String,
            params: EventListParams,
        ): CompletableFuture<HttpResponseFor<EventListPageAsync>> =
            list(runId, params, RequestOptions.none())

        /** @see list */
        fun list(
            runId: String,
            params: EventListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EventListPageAsync>> =
            list(params.toBuilder().runId(runId).build(), requestOptions)

        /** @see list */
        fun list(params: EventListParams): CompletableFuture<HttpResponseFor<EventListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            params: EventListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EventListPageAsync>>

        /**
         * Returns a raw HTTP response for `get
         * /ai/missions/{mission_id}/runs/{run_id}/events/{event_id}`, but is otherwise the same as
         * [EventServiceAsync.getEventDetails].
         */
        fun getEventDetails(
            eventId: String,
            params: EventGetEventDetailsParams,
        ): CompletableFuture<HttpResponseFor<EventGetEventDetailsResponse>> =
            getEventDetails(eventId, params, RequestOptions.none())

        /** @see getEventDetails */
        fun getEventDetails(
            eventId: String,
            params: EventGetEventDetailsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EventGetEventDetailsResponse>> =
            getEventDetails(params.toBuilder().eventId(eventId).build(), requestOptions)

        /** @see getEventDetails */
        fun getEventDetails(
            params: EventGetEventDetailsParams
        ): CompletableFuture<HttpResponseFor<EventGetEventDetailsResponse>> =
            getEventDetails(params, RequestOptions.none())

        /** @see getEventDetails */
        fun getEventDetails(
            params: EventGetEventDetailsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EventGetEventDetailsResponse>>

        /**
         * Returns a raw HTTP response for `post /ai/missions/{mission_id}/runs/{run_id}/events`,
         * but is otherwise the same as [EventServiceAsync.log].
         */
        fun log(
            runId: String,
            params: EventLogParams,
        ): CompletableFuture<HttpResponseFor<EventLogResponse>> =
            log(runId, params, RequestOptions.none())

        /** @see log */
        fun log(
            runId: String,
            params: EventLogParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EventLogResponse>> =
            log(params.toBuilder().runId(runId).build(), requestOptions)

        /** @see log */
        fun log(params: EventLogParams): CompletableFuture<HttpResponseFor<EventLogResponse>> =
            log(params, RequestOptions.none())

        /** @see log */
        fun log(
            params: EventLogParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EventLogResponse>>
    }
}
