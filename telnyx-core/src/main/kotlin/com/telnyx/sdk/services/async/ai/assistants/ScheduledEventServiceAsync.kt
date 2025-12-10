// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai.assistants

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.ai.assistants.scheduledevents.ScheduledEventCreateParams
import com.telnyx.sdk.models.ai.assistants.scheduledevents.ScheduledEventDeleteParams
import com.telnyx.sdk.models.ai.assistants.scheduledevents.ScheduledEventListParams
import com.telnyx.sdk.models.ai.assistants.scheduledevents.ScheduledEventListResponse
import com.telnyx.sdk.models.ai.assistants.scheduledevents.ScheduledEventResponse
import com.telnyx.sdk.models.ai.assistants.scheduledevents.ScheduledEventRetrieveParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ScheduledEventServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ScheduledEventServiceAsync

    /** Create a scheduled event for an assistant */
    fun create(
        assistantId: String,
        params: ScheduledEventCreateParams,
    ): CompletableFuture<ScheduledEventResponse> =
        create(assistantId, params, RequestOptions.none())

    /** @see create */
    fun create(
        assistantId: String,
        params: ScheduledEventCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ScheduledEventResponse> =
        create(params.toBuilder().assistantId(assistantId).build(), requestOptions)

    /** @see create */
    fun create(params: ScheduledEventCreateParams): CompletableFuture<ScheduledEventResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ScheduledEventCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ScheduledEventResponse>

    /** Retrieve a scheduled event by event ID */
    fun retrieve(
        eventId: String,
        params: ScheduledEventRetrieveParams,
    ): CompletableFuture<ScheduledEventResponse> = retrieve(eventId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        eventId: String,
        params: ScheduledEventRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ScheduledEventResponse> =
        retrieve(params.toBuilder().eventId(eventId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: ScheduledEventRetrieveParams): CompletableFuture<ScheduledEventResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ScheduledEventRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ScheduledEventResponse>

    /** Get scheduled events for an assistant with pagination and filtering */
    fun list(assistantId: String): CompletableFuture<ScheduledEventListResponse> =
        list(assistantId, ScheduledEventListParams.none())

    /** @see list */
    fun list(
        assistantId: String,
        params: ScheduledEventListParams = ScheduledEventListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ScheduledEventListResponse> =
        list(params.toBuilder().assistantId(assistantId).build(), requestOptions)

    /** @see list */
    fun list(
        assistantId: String,
        params: ScheduledEventListParams = ScheduledEventListParams.none(),
    ): CompletableFuture<ScheduledEventListResponse> =
        list(assistantId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: ScheduledEventListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ScheduledEventListResponse>

    /** @see list */
    fun list(params: ScheduledEventListParams): CompletableFuture<ScheduledEventListResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        assistantId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ScheduledEventListResponse> =
        list(assistantId, ScheduledEventListParams.none(), requestOptions)

    /**
     * If the event is pending, this will cancel the event. Otherwise, this will simply remove the
     * record of the event.
     */
    fun delete(eventId: String, params: ScheduledEventDeleteParams): CompletableFuture<Void?> =
        delete(eventId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        eventId: String,
        params: ScheduledEventDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().eventId(eventId).build(), requestOptions)

    /** @see delete */
    fun delete(params: ScheduledEventDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: ScheduledEventDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * A view of [ScheduledEventServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ScheduledEventServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /ai/assistants/{assistant_id}/scheduled_events`,
         * but is otherwise the same as [ScheduledEventServiceAsync.create].
         */
        fun create(
            assistantId: String,
            params: ScheduledEventCreateParams,
        ): CompletableFuture<HttpResponseFor<ScheduledEventResponse>> =
            create(assistantId, params, RequestOptions.none())

        /** @see create */
        fun create(
            assistantId: String,
            params: ScheduledEventCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ScheduledEventResponse>> =
            create(params.toBuilder().assistantId(assistantId).build(), requestOptions)

        /** @see create */
        fun create(
            params: ScheduledEventCreateParams
        ): CompletableFuture<HttpResponseFor<ScheduledEventResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: ScheduledEventCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ScheduledEventResponse>>

        /**
         * Returns a raw HTTP response for `get
         * /ai/assistants/{assistant_id}/scheduled_events/{event_id}`, but is otherwise the same as
         * [ScheduledEventServiceAsync.retrieve].
         */
        fun retrieve(
            eventId: String,
            params: ScheduledEventRetrieveParams,
        ): CompletableFuture<HttpResponseFor<ScheduledEventResponse>> =
            retrieve(eventId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            eventId: String,
            params: ScheduledEventRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ScheduledEventResponse>> =
            retrieve(params.toBuilder().eventId(eventId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            params: ScheduledEventRetrieveParams
        ): CompletableFuture<HttpResponseFor<ScheduledEventResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: ScheduledEventRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ScheduledEventResponse>>

        /**
         * Returns a raw HTTP response for `get /ai/assistants/{assistant_id}/scheduled_events`, but
         * is otherwise the same as [ScheduledEventServiceAsync.list].
         */
        fun list(
            assistantId: String
        ): CompletableFuture<HttpResponseFor<ScheduledEventListResponse>> =
            list(assistantId, ScheduledEventListParams.none())

        /** @see list */
        fun list(
            assistantId: String,
            params: ScheduledEventListParams = ScheduledEventListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ScheduledEventListResponse>> =
            list(params.toBuilder().assistantId(assistantId).build(), requestOptions)

        /** @see list */
        fun list(
            assistantId: String,
            params: ScheduledEventListParams = ScheduledEventListParams.none(),
        ): CompletableFuture<HttpResponseFor<ScheduledEventListResponse>> =
            list(assistantId, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: ScheduledEventListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ScheduledEventListResponse>>

        /** @see list */
        fun list(
            params: ScheduledEventListParams
        ): CompletableFuture<HttpResponseFor<ScheduledEventListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            assistantId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ScheduledEventListResponse>> =
            list(assistantId, ScheduledEventListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /ai/assistants/{assistant_id}/scheduled_events/{event_id}`, but is otherwise the same as
         * [ScheduledEventServiceAsync.delete].
         */
        fun delete(
            eventId: String,
            params: ScheduledEventDeleteParams,
        ): CompletableFuture<HttpResponse> = delete(eventId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            eventId: String,
            params: ScheduledEventDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().eventId(eventId).build(), requestOptions)

        /** @see delete */
        fun delete(params: ScheduledEventDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: ScheduledEventDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
