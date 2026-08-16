// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.meetingsessions.MeetingSessionCreateParams
import com.telnyx.sdk.models.meetingsessions.MeetingSessionDeleteParams
import com.telnyx.sdk.models.meetingsessions.MeetingSessionDeleteRecordingMediaParams
import com.telnyx.sdk.models.meetingsessions.MeetingSessionDeleteRecordingMediaResponse
import com.telnyx.sdk.models.meetingsessions.MeetingSessionListParams
import com.telnyx.sdk.models.meetingsessions.MeetingSessionListResponse
import com.telnyx.sdk.models.meetingsessions.MeetingSessionResponse
import com.telnyx.sdk.models.meetingsessions.MeetingSessionRetrieveEventsParams
import com.telnyx.sdk.models.meetingsessions.MeetingSessionRetrieveEventsResponse
import com.telnyx.sdk.models.meetingsessions.MeetingSessionRetrieveParams
import com.telnyx.sdk.models.meetingsessions.MeetingSessionRetrieveRecordingsParams
import com.telnyx.sdk.models.meetingsessions.MeetingSessionRetrieveRecordingsResponse
import com.telnyx.sdk.models.meetingsessions.MeetingSessionRetrieveTranscriptParams
import com.telnyx.sdk.models.meetingsessions.MeetingSessionRetrieveTranscriptResponse
import com.telnyx.sdk.models.meetingsessions.MeetingSessionUpdateParams
import com.telnyx.sdk.services.blocking.meetingsessions.ActionService
import com.telnyx.sdk.services.blocking.meetingsessions.ArtifactService
import java.util.function.Consumer

interface MeetingSessionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MeetingSessionService

    /** Send real-time speech and chat actions to an active meeting session. */
    fun actions(): ActionService

    /** Create and retrieve asynchronous summaries and action-item artifacts. */
    fun artifacts(): ArtifactService

    /**
     * Creates a new meeting session. When an idempotency_key is supplied in the request body,
     * replay lookup is scoped to the authenticated account and compares only the key; the request
     * payload is not fingerprinted or compared. If a session with that key already exists for the
     * account, the existing session is replayed (200); otherwise a new session is created (201).
     * Supports bring-your-own-key (BYOK) configuration. The session may enter asynchronous states
     * (e.g. joining, waiting_for_admission) before becoming active. Optional `camera_image` input
     * is write-only and applies only when no Avatar or Assistant webpage output takes precedence.
     * An ignored URL is not fetched. An effective URL source is resolved before bot creation;
     * neither the source URL nor image bytes are persisted, returned, or logged. Treat signed URLs
     * as credentials.
     */
    fun create(params: MeetingSessionCreateParams): MeetingSessionResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: MeetingSessionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MeetingSessionResponse

    /**
     * Retrieves a single meeting session by ID. A session that does not exist or that belongs to a
     * different account both return 404.
     */
    fun retrieve(id: String): MeetingSessionResponse =
        retrieve(id, MeetingSessionRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: MeetingSessionRetrieveParams = MeetingSessionRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MeetingSessionResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: MeetingSessionRetrieveParams = MeetingSessionRetrieveParams.none(),
    ): MeetingSessionResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: MeetingSessionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MeetingSessionResponse

    /** @see retrieve */
    fun retrieve(params: MeetingSessionRetrieveParams): MeetingSessionResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): MeetingSessionResponse =
        retrieve(id, MeetingSessionRetrieveParams.none(), requestOptions)

    /**
     * Updates mutable properties of a meeting session. Only sessions in the scheduled state can be
     * updated; any other state returns 409 with the invalid_state error code. All request fields
     * are optional, and an empty object is a valid no-op update.
     */
    fun update(id: String): MeetingSessionResponse = update(id, MeetingSessionUpdateParams.none())

    /** @see update */
    fun update(
        id: String,
        params: MeetingSessionUpdateParams = MeetingSessionUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MeetingSessionResponse = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        id: String,
        params: MeetingSessionUpdateParams = MeetingSessionUpdateParams.none(),
    ): MeetingSessionResponse = update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: MeetingSessionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MeetingSessionResponse

    /** @see update */
    fun update(params: MeetingSessionUpdateParams): MeetingSessionResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(id: String, requestOptions: RequestOptions): MeetingSessionResponse =
        update(id, MeetingSessionUpdateParams.none(), requestOptions)

    /** Returns a list of meeting sessions, optionally filtered by status. */
    fun list(): MeetingSessionListResponse = list(MeetingSessionListParams.none())

    /** @see list */
    fun list(
        params: MeetingSessionListParams = MeetingSessionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MeetingSessionListResponse

    /** @see list */
    fun list(
        params: MeetingSessionListParams = MeetingSessionListParams.none()
    ): MeetingSessionListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): MeetingSessionListResponse =
        list(MeetingSessionListParams.none(), requestOptions)

    /**
     * Stops a meeting session without deleting its persisted record. Scheduled bots are cancelled,
     * while bots that are joining or active are asked to leave. The persisted meeting session
     * record remains available.
     */
    fun delete(id: String): MeetingSessionResponse = delete(id, MeetingSessionDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: MeetingSessionDeleteParams = MeetingSessionDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MeetingSessionResponse = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: MeetingSessionDeleteParams = MeetingSessionDeleteParams.none(),
    ): MeetingSessionResponse = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: MeetingSessionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MeetingSessionResponse

    /** @see delete */
    fun delete(params: MeetingSessionDeleteParams): MeetingSessionResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): MeetingSessionResponse =
        delete(id, MeetingSessionDeleteParams.none(), requestOptions)

    /**
     * **Not yet available in production** — this route is not currently routed on api.telnyx.com
     * and returns a generic 404; it is documented ahead of rollout. Irreversibly requests deletion
     * of provider-hosted aggregate recording media under the provider contract. The operation
     * retains the Telnyx-local Meeting session, transcript segments, events, artifacts, and usage
     * records. It is separate from `DELETE /meeting_sessions/{id}`, which stops or cancels
     * participation without deleting the persisted session. A missing/foreign session returns 404;
     * provider deletion failures return 502.
     */
    fun deleteRecordingMedia(id: String): MeetingSessionDeleteRecordingMediaResponse =
        deleteRecordingMedia(id, MeetingSessionDeleteRecordingMediaParams.none())

    /** @see deleteRecordingMedia */
    fun deleteRecordingMedia(
        id: String,
        params: MeetingSessionDeleteRecordingMediaParams =
            MeetingSessionDeleteRecordingMediaParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MeetingSessionDeleteRecordingMediaResponse =
        deleteRecordingMedia(params.toBuilder().id(id).build(), requestOptions)

    /** @see deleteRecordingMedia */
    fun deleteRecordingMedia(
        id: String,
        params: MeetingSessionDeleteRecordingMediaParams =
            MeetingSessionDeleteRecordingMediaParams.none(),
    ): MeetingSessionDeleteRecordingMediaResponse =
        deleteRecordingMedia(id, params, RequestOptions.none())

    /** @see deleteRecordingMedia */
    fun deleteRecordingMedia(
        params: MeetingSessionDeleteRecordingMediaParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MeetingSessionDeleteRecordingMediaResponse

    /** @see deleteRecordingMedia */
    fun deleteRecordingMedia(
        params: MeetingSessionDeleteRecordingMediaParams
    ): MeetingSessionDeleteRecordingMediaResponse =
        deleteRecordingMedia(params, RequestOptions.none())

    /** @see deleteRecordingMedia */
    fun deleteRecordingMedia(
        id: String,
        requestOptions: RequestOptions,
    ): MeetingSessionDeleteRecordingMediaResponse =
        deleteRecordingMedia(id, MeetingSessionDeleteRecordingMediaParams.none(), requestOptions)

    /**
     * Returns stored events ordered by ascending `seq`. To continue, pass the last returned item's
     * `seq` as `after`. An empty page means no later stored events existed at read time; this
     * operation returns no separate next-page cursor. Default `limit` is 100 and maximum is 1,000.
     */
    fun retrieveEvents(id: String): MeetingSessionRetrieveEventsResponse =
        retrieveEvents(id, MeetingSessionRetrieveEventsParams.none())

    /** @see retrieveEvents */
    fun retrieveEvents(
        id: String,
        params: MeetingSessionRetrieveEventsParams = MeetingSessionRetrieveEventsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MeetingSessionRetrieveEventsResponse =
        retrieveEvents(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieveEvents */
    fun retrieveEvents(
        id: String,
        params: MeetingSessionRetrieveEventsParams = MeetingSessionRetrieveEventsParams.none(),
    ): MeetingSessionRetrieveEventsResponse = retrieveEvents(id, params, RequestOptions.none())

    /** @see retrieveEvents */
    fun retrieveEvents(
        params: MeetingSessionRetrieveEventsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MeetingSessionRetrieveEventsResponse

    /** @see retrieveEvents */
    fun retrieveEvents(
        params: MeetingSessionRetrieveEventsParams
    ): MeetingSessionRetrieveEventsResponse = retrieveEvents(params, RequestOptions.none())

    /** @see retrieveEvents */
    fun retrieveEvents(
        id: String,
        requestOptions: RequestOptions,
    ): MeetingSessionRetrieveEventsResponse =
        retrieveEvents(id, MeetingSessionRetrieveEventsParams.none(), requestOptions)

    /** Returns recordings for a meeting session. */
    fun retrieveRecordings(id: String): MeetingSessionRetrieveRecordingsResponse =
        retrieveRecordings(id, MeetingSessionRetrieveRecordingsParams.none())

    /** @see retrieveRecordings */
    fun retrieveRecordings(
        id: String,
        params: MeetingSessionRetrieveRecordingsParams =
            MeetingSessionRetrieveRecordingsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MeetingSessionRetrieveRecordingsResponse =
        retrieveRecordings(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieveRecordings */
    fun retrieveRecordings(
        id: String,
        params: MeetingSessionRetrieveRecordingsParams =
            MeetingSessionRetrieveRecordingsParams.none(),
    ): MeetingSessionRetrieveRecordingsResponse =
        retrieveRecordings(id, params, RequestOptions.none())

    /** @see retrieveRecordings */
    fun retrieveRecordings(
        params: MeetingSessionRetrieveRecordingsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MeetingSessionRetrieveRecordingsResponse

    /** @see retrieveRecordings */
    fun retrieveRecordings(
        params: MeetingSessionRetrieveRecordingsParams
    ): MeetingSessionRetrieveRecordingsResponse = retrieveRecordings(params, RequestOptions.none())

    /** @see retrieveRecordings */
    fun retrieveRecordings(
        id: String,
        requestOptions: RequestOptions,
    ): MeetingSessionRetrieveRecordingsResponse =
        retrieveRecordings(id, MeetingSessionRetrieveRecordingsParams.none(), requestOptions)

    /**
     * Returns transcript segments ordered by ascending `seq`. Default `limit` is 100 and maximum is
     * 1,000. Continue with `after=meta.next_after`. A long-poll timeout returns 200 with empty
     * `data` and `meta.next_after: null`; retain the cursor supplied to that request because null
     * is not a replacement cursor.
     */
    fun retrieveTranscript(id: String): MeetingSessionRetrieveTranscriptResponse =
        retrieveTranscript(id, MeetingSessionRetrieveTranscriptParams.none())

    /** @see retrieveTranscript */
    fun retrieveTranscript(
        id: String,
        params: MeetingSessionRetrieveTranscriptParams =
            MeetingSessionRetrieveTranscriptParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MeetingSessionRetrieveTranscriptResponse =
        retrieveTranscript(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieveTranscript */
    fun retrieveTranscript(
        id: String,
        params: MeetingSessionRetrieveTranscriptParams =
            MeetingSessionRetrieveTranscriptParams.none(),
    ): MeetingSessionRetrieveTranscriptResponse =
        retrieveTranscript(id, params, RequestOptions.none())

    /** @see retrieveTranscript */
    fun retrieveTranscript(
        params: MeetingSessionRetrieveTranscriptParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MeetingSessionRetrieveTranscriptResponse

    /** @see retrieveTranscript */
    fun retrieveTranscript(
        params: MeetingSessionRetrieveTranscriptParams
    ): MeetingSessionRetrieveTranscriptResponse = retrieveTranscript(params, RequestOptions.none())

    /** @see retrieveTranscript */
    fun retrieveTranscript(
        id: String,
        requestOptions: RequestOptions,
    ): MeetingSessionRetrieveTranscriptResponse =
        retrieveTranscript(id, MeetingSessionRetrieveTranscriptParams.none(), requestOptions)

    /**
     * A view of [MeetingSessionService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MeetingSessionService.WithRawResponse

        /** Send real-time speech and chat actions to an active meeting session. */
        fun actions(): ActionService.WithRawResponse

        /** Create and retrieve asynchronous summaries and action-item artifacts. */
        fun artifacts(): ArtifactService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /meeting_sessions`, but is otherwise the same as
         * [MeetingSessionService.create].
         */
        @MustBeClosed
        fun create(params: MeetingSessionCreateParams): HttpResponseFor<MeetingSessionResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: MeetingSessionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MeetingSessionResponse>

        /**
         * Returns a raw HTTP response for `get /meeting_sessions/{id}`, but is otherwise the same
         * as [MeetingSessionService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<MeetingSessionResponse> =
            retrieve(id, MeetingSessionRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: MeetingSessionRetrieveParams = MeetingSessionRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MeetingSessionResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: MeetingSessionRetrieveParams = MeetingSessionRetrieveParams.none(),
        ): HttpResponseFor<MeetingSessionResponse> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: MeetingSessionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MeetingSessionResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: MeetingSessionRetrieveParams
        ): HttpResponseFor<MeetingSessionResponse> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MeetingSessionResponse> =
            retrieve(id, MeetingSessionRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /meeting_sessions/{id}`, but is otherwise the same
         * as [MeetingSessionService.update].
         */
        @MustBeClosed
        fun update(id: String): HttpResponseFor<MeetingSessionResponse> =
            update(id, MeetingSessionUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: MeetingSessionUpdateParams = MeetingSessionUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MeetingSessionResponse> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: MeetingSessionUpdateParams = MeetingSessionUpdateParams.none(),
        ): HttpResponseFor<MeetingSessionResponse> = update(id, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: MeetingSessionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MeetingSessionResponse>

        /** @see update */
        @MustBeClosed
        fun update(params: MeetingSessionUpdateParams): HttpResponseFor<MeetingSessionResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MeetingSessionResponse> =
            update(id, MeetingSessionUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /meeting_sessions`, but is otherwise the same as
         * [MeetingSessionService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<MeetingSessionListResponse> =
            list(MeetingSessionListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: MeetingSessionListParams = MeetingSessionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MeetingSessionListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: MeetingSessionListParams = MeetingSessionListParams.none()
        ): HttpResponseFor<MeetingSessionListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<MeetingSessionListResponse> =
            list(MeetingSessionListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /meeting_sessions/{id}`, but is otherwise the
         * same as [MeetingSessionService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponseFor<MeetingSessionResponse> =
            delete(id, MeetingSessionDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: MeetingSessionDeleteParams = MeetingSessionDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MeetingSessionResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: MeetingSessionDeleteParams = MeetingSessionDeleteParams.none(),
        ): HttpResponseFor<MeetingSessionResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: MeetingSessionDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MeetingSessionResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(params: MeetingSessionDeleteParams): HttpResponseFor<MeetingSessionResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MeetingSessionResponse> =
            delete(id, MeetingSessionDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /meeting_sessions/{id}/recording_media`, but is
         * otherwise the same as [MeetingSessionService.deleteRecordingMedia].
         */
        @MustBeClosed
        fun deleteRecordingMedia(
            id: String
        ): HttpResponseFor<MeetingSessionDeleteRecordingMediaResponse> =
            deleteRecordingMedia(id, MeetingSessionDeleteRecordingMediaParams.none())

        /** @see deleteRecordingMedia */
        @MustBeClosed
        fun deleteRecordingMedia(
            id: String,
            params: MeetingSessionDeleteRecordingMediaParams =
                MeetingSessionDeleteRecordingMediaParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MeetingSessionDeleteRecordingMediaResponse> =
            deleteRecordingMedia(params.toBuilder().id(id).build(), requestOptions)

        /** @see deleteRecordingMedia */
        @MustBeClosed
        fun deleteRecordingMedia(
            id: String,
            params: MeetingSessionDeleteRecordingMediaParams =
                MeetingSessionDeleteRecordingMediaParams.none(),
        ): HttpResponseFor<MeetingSessionDeleteRecordingMediaResponse> =
            deleteRecordingMedia(id, params, RequestOptions.none())

        /** @see deleteRecordingMedia */
        @MustBeClosed
        fun deleteRecordingMedia(
            params: MeetingSessionDeleteRecordingMediaParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MeetingSessionDeleteRecordingMediaResponse>

        /** @see deleteRecordingMedia */
        @MustBeClosed
        fun deleteRecordingMedia(
            params: MeetingSessionDeleteRecordingMediaParams
        ): HttpResponseFor<MeetingSessionDeleteRecordingMediaResponse> =
            deleteRecordingMedia(params, RequestOptions.none())

        /** @see deleteRecordingMedia */
        @MustBeClosed
        fun deleteRecordingMedia(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MeetingSessionDeleteRecordingMediaResponse> =
            deleteRecordingMedia(
                id,
                MeetingSessionDeleteRecordingMediaParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /meeting_sessions/{id}/events`, but is otherwise the
         * same as [MeetingSessionService.retrieveEvents].
         */
        @MustBeClosed
        fun retrieveEvents(id: String): HttpResponseFor<MeetingSessionRetrieveEventsResponse> =
            retrieveEvents(id, MeetingSessionRetrieveEventsParams.none())

        /** @see retrieveEvents */
        @MustBeClosed
        fun retrieveEvents(
            id: String,
            params: MeetingSessionRetrieveEventsParams = MeetingSessionRetrieveEventsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MeetingSessionRetrieveEventsResponse> =
            retrieveEvents(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieveEvents */
        @MustBeClosed
        fun retrieveEvents(
            id: String,
            params: MeetingSessionRetrieveEventsParams = MeetingSessionRetrieveEventsParams.none(),
        ): HttpResponseFor<MeetingSessionRetrieveEventsResponse> =
            retrieveEvents(id, params, RequestOptions.none())

        /** @see retrieveEvents */
        @MustBeClosed
        fun retrieveEvents(
            params: MeetingSessionRetrieveEventsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MeetingSessionRetrieveEventsResponse>

        /** @see retrieveEvents */
        @MustBeClosed
        fun retrieveEvents(
            params: MeetingSessionRetrieveEventsParams
        ): HttpResponseFor<MeetingSessionRetrieveEventsResponse> =
            retrieveEvents(params, RequestOptions.none())

        /** @see retrieveEvents */
        @MustBeClosed
        fun retrieveEvents(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MeetingSessionRetrieveEventsResponse> =
            retrieveEvents(id, MeetingSessionRetrieveEventsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /meeting_sessions/{id}/recordings`, but is otherwise
         * the same as [MeetingSessionService.retrieveRecordings].
         */
        @MustBeClosed
        fun retrieveRecordings(
            id: String
        ): HttpResponseFor<MeetingSessionRetrieveRecordingsResponse> =
            retrieveRecordings(id, MeetingSessionRetrieveRecordingsParams.none())

        /** @see retrieveRecordings */
        @MustBeClosed
        fun retrieveRecordings(
            id: String,
            params: MeetingSessionRetrieveRecordingsParams =
                MeetingSessionRetrieveRecordingsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MeetingSessionRetrieveRecordingsResponse> =
            retrieveRecordings(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieveRecordings */
        @MustBeClosed
        fun retrieveRecordings(
            id: String,
            params: MeetingSessionRetrieveRecordingsParams =
                MeetingSessionRetrieveRecordingsParams.none(),
        ): HttpResponseFor<MeetingSessionRetrieveRecordingsResponse> =
            retrieveRecordings(id, params, RequestOptions.none())

        /** @see retrieveRecordings */
        @MustBeClosed
        fun retrieveRecordings(
            params: MeetingSessionRetrieveRecordingsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MeetingSessionRetrieveRecordingsResponse>

        /** @see retrieveRecordings */
        @MustBeClosed
        fun retrieveRecordings(
            params: MeetingSessionRetrieveRecordingsParams
        ): HttpResponseFor<MeetingSessionRetrieveRecordingsResponse> =
            retrieveRecordings(params, RequestOptions.none())

        /** @see retrieveRecordings */
        @MustBeClosed
        fun retrieveRecordings(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MeetingSessionRetrieveRecordingsResponse> =
            retrieveRecordings(id, MeetingSessionRetrieveRecordingsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /meeting_sessions/{id}/transcript`, but is otherwise
         * the same as [MeetingSessionService.retrieveTranscript].
         */
        @MustBeClosed
        fun retrieveTranscript(
            id: String
        ): HttpResponseFor<MeetingSessionRetrieveTranscriptResponse> =
            retrieveTranscript(id, MeetingSessionRetrieveTranscriptParams.none())

        /** @see retrieveTranscript */
        @MustBeClosed
        fun retrieveTranscript(
            id: String,
            params: MeetingSessionRetrieveTranscriptParams =
                MeetingSessionRetrieveTranscriptParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MeetingSessionRetrieveTranscriptResponse> =
            retrieveTranscript(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieveTranscript */
        @MustBeClosed
        fun retrieveTranscript(
            id: String,
            params: MeetingSessionRetrieveTranscriptParams =
                MeetingSessionRetrieveTranscriptParams.none(),
        ): HttpResponseFor<MeetingSessionRetrieveTranscriptResponse> =
            retrieveTranscript(id, params, RequestOptions.none())

        /** @see retrieveTranscript */
        @MustBeClosed
        fun retrieveTranscript(
            params: MeetingSessionRetrieveTranscriptParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MeetingSessionRetrieveTranscriptResponse>

        /** @see retrieveTranscript */
        @MustBeClosed
        fun retrieveTranscript(
            params: MeetingSessionRetrieveTranscriptParams
        ): HttpResponseFor<MeetingSessionRetrieveTranscriptResponse> =
            retrieveTranscript(params, RequestOptions.none())

        /** @see retrieveTranscript */
        @MustBeClosed
        fun retrieveTranscript(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MeetingSessionRetrieveTranscriptResponse> =
            retrieveTranscript(id, MeetingSessionRetrieveTranscriptParams.none(), requestOptions)
    }
}
