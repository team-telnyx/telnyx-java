// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

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
import com.telnyx.sdk.services.async.meetingsessions.ActionServiceAsync
import com.telnyx.sdk.services.async.meetingsessions.ArtifactServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface MeetingSessionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MeetingSessionServiceAsync

    /** Send real-time speech and chat actions to an active meeting session. */
    fun actions(): ActionServiceAsync

    /** Create and retrieve asynchronous summaries and action-item artifacts. */
    fun artifacts(): ArtifactServiceAsync

    /**
     * Creates a meeting session and returns 201, or 200 for a replay. Use a unique
     * `idempotency_key` per intended join and reuse the same key and request on retries. Reusing a
     * key with a different join configuration or meeting URL can return 409 invalid_state. Always
     * retry with the original request. The session can pass through joining and
     * waiting_for_admission before active. Optional `camera_image` input is write-only and applies
     * when no assistant avatar takes precedence. An ignored URL is not fetched. An effective URL
     * source is resolved before bot creation; the source URL and image bytes are not returned in
     * the session response. Treat signed URLs as credentials. With `assistant.avatar: true`, the
     * assistant is read before the bot is created: an assistant without a Telnyx avatar configured
     * is rejected with 400 `invalid_request` (message prefix `assistant_avatar_not_configured:`),
     * an unknown assistant with 400 `invalid_request` (prefix `assistant_not_found:`), and a failed
     * lookup with 503 `assistant_lookup_unavailable`; no bot is created in any of these cases.
     */
    fun create(params: MeetingSessionCreateParams): CompletableFuture<MeetingSessionResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: MeetingSessionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MeetingSessionResponse>

    /**
     * Retrieves a single meeting session by ID. A session that does not exist or that belongs to a
     * different account both return 404.
     */
    fun retrieve(id: String): CompletableFuture<MeetingSessionResponse> =
        retrieve(id, MeetingSessionRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: MeetingSessionRetrieveParams = MeetingSessionRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MeetingSessionResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: MeetingSessionRetrieveParams = MeetingSessionRetrieveParams.none(),
    ): CompletableFuture<MeetingSessionResponse> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: MeetingSessionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MeetingSessionResponse>

    /** @see retrieve */
    fun retrieve(params: MeetingSessionRetrieveParams): CompletableFuture<MeetingSessionResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<MeetingSessionResponse> =
        retrieve(id, MeetingSessionRetrieveParams.none(), requestOptions)

    /**
     * Updates mutable properties of a meeting session. Only sessions in the scheduled state can be
     * updated; any other state returns 409 with the invalid_state error code. All request fields
     * are optional, and an empty object is a valid no-op update. Calendar-controlled Google Meet
     * and Teams sessions return 409 calendar_managed; change the event instead. A conflicting
     * pending edit returns 409 edit_in_progress. On a timeout or 503, read the session and retry
     * the same changes.
     */
    fun update(id: String): CompletableFuture<MeetingSessionResponse> =
        update(id, MeetingSessionUpdateParams.none())

    /** @see update */
    fun update(
        id: String,
        params: MeetingSessionUpdateParams = MeetingSessionUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MeetingSessionResponse> =
        update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        id: String,
        params: MeetingSessionUpdateParams = MeetingSessionUpdateParams.none(),
    ): CompletableFuture<MeetingSessionResponse> = update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: MeetingSessionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MeetingSessionResponse>

    /** @see update */
    fun update(params: MeetingSessionUpdateParams): CompletableFuture<MeetingSessionResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<MeetingSessionResponse> =
        update(id, MeetingSessionUpdateParams.none(), requestOptions)

    /**
     * Returns a list of meeting sessions, optionally filtered by status. List items omit
     * assistant.dynamic_variables and recording_export. Some items include
     * remote_state_observed_at; retrieve the individual session for current state.
     */
    fun list(): CompletableFuture<MeetingSessionListResponse> =
        list(MeetingSessionListParams.none())

    /** @see list */
    fun list(
        params: MeetingSessionListParams = MeetingSessionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MeetingSessionListResponse>

    /** @see list */
    fun list(
        params: MeetingSessionListParams = MeetingSessionListParams.none()
    ): CompletableFuture<MeetingSessionListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<MeetingSessionListResponse> =
        list(MeetingSessionListParams.none(), requestOptions)

    /**
     * Stops a meeting session without deleting its persisted record. Scheduled bots are cancelled,
     * while bots that are joining or active are asked to leave. The persisted meeting session
     * record remains available. A successful response can report leaving while departure is
     * pending. Poll until ended, failed, or admission_denied. Exported Storage objects are
     * unaffected.
     */
    fun delete(id: String): CompletableFuture<MeetingSessionResponse> =
        delete(id, MeetingSessionDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: MeetingSessionDeleteParams = MeetingSessionDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MeetingSessionResponse> =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: MeetingSessionDeleteParams = MeetingSessionDeleteParams.none(),
    ): CompletableFuture<MeetingSessionResponse> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: MeetingSessionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MeetingSessionResponse>

    /** @see delete */
    fun delete(params: MeetingSessionDeleteParams): CompletableFuture<MeetingSessionResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<MeetingSessionResponse> =
        delete(id, MeetingSessionDeleteParams.none(), requestOptions)

    /**
     * Irreversibly requests deletion of the aggregate recording media for the session. The
     * operation retains the Telnyx-local Meeting session, transcript segments, events, artifacts,
     * and usage records. It is separate from `DELETE /meeting_sessions/{id}`, which stops or
     * cancels participation without deleting the persisted session. A missing/foreign session
     * returns 404; a deletion request whose outcome is unknown returns 502. Customer Storage
     * exports do not support this operation (422 unsupported_capability); delete the exported
     * object through Storage instead. Stopping a session does not delete an exported object.
     */
    fun deleteRecordingMedia(
        id: String
    ): CompletableFuture<MeetingSessionDeleteRecordingMediaResponse> =
        deleteRecordingMedia(id, MeetingSessionDeleteRecordingMediaParams.none())

    /** @see deleteRecordingMedia */
    fun deleteRecordingMedia(
        id: String,
        params: MeetingSessionDeleteRecordingMediaParams =
            MeetingSessionDeleteRecordingMediaParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MeetingSessionDeleteRecordingMediaResponse> =
        deleteRecordingMedia(params.toBuilder().id(id).build(), requestOptions)

    /** @see deleteRecordingMedia */
    fun deleteRecordingMedia(
        id: String,
        params: MeetingSessionDeleteRecordingMediaParams =
            MeetingSessionDeleteRecordingMediaParams.none(),
    ): CompletableFuture<MeetingSessionDeleteRecordingMediaResponse> =
        deleteRecordingMedia(id, params, RequestOptions.none())

    /** @see deleteRecordingMedia */
    fun deleteRecordingMedia(
        params: MeetingSessionDeleteRecordingMediaParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MeetingSessionDeleteRecordingMediaResponse>

    /** @see deleteRecordingMedia */
    fun deleteRecordingMedia(
        params: MeetingSessionDeleteRecordingMediaParams
    ): CompletableFuture<MeetingSessionDeleteRecordingMediaResponse> =
        deleteRecordingMedia(params, RequestOptions.none())

    /** @see deleteRecordingMedia */
    fun deleteRecordingMedia(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<MeetingSessionDeleteRecordingMediaResponse> =
        deleteRecordingMedia(id, MeetingSessionDeleteRecordingMediaParams.none(), requestOptions)

    /**
     * Returns stored events ordered by ascending `seq`. To continue, pass the last returned item's
     * `seq` as `after`. An empty page means no later stored events existed at read time; this
     * operation returns no separate next-page cursor. Default `limit` is 100 and maximum is 1,000.
     */
    fun retrieveEvents(id: String): CompletableFuture<MeetingSessionRetrieveEventsResponse> =
        retrieveEvents(id, MeetingSessionRetrieveEventsParams.none())

    /** @see retrieveEvents */
    fun retrieveEvents(
        id: String,
        params: MeetingSessionRetrieveEventsParams = MeetingSessionRetrieveEventsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MeetingSessionRetrieveEventsResponse> =
        retrieveEvents(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieveEvents */
    fun retrieveEvents(
        id: String,
        params: MeetingSessionRetrieveEventsParams = MeetingSessionRetrieveEventsParams.none(),
    ): CompletableFuture<MeetingSessionRetrieveEventsResponse> =
        retrieveEvents(id, params, RequestOptions.none())

    /** @see retrieveEvents */
    fun retrieveEvents(
        params: MeetingSessionRetrieveEventsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MeetingSessionRetrieveEventsResponse>

    /** @see retrieveEvents */
    fun retrieveEvents(
        params: MeetingSessionRetrieveEventsParams
    ): CompletableFuture<MeetingSessionRetrieveEventsResponse> =
        retrieveEvents(params, RequestOptions.none())

    /** @see retrieveEvents */
    fun retrieveEvents(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<MeetingSessionRetrieveEventsResponse> =
        retrieveEvents(id, MeetingSessionRetrieveEventsParams.none(), requestOptions)

    /**
     * Retrieve recording export status. Customer Storage exports include recording_export with the
     * bucket, region, key and pending/exported/failed status, or null when no reference is
     * available. The data array is empty for these exports. Download or share the object using the
     * Storage API once its status is exported. Zoom recordings and existing Google Meet or Teams
     * recordings held by the Meeting service continue returning temporary download links in data
     * through this same endpoint and session ID. Those recordings do not require Storage setup or
     * migration. Refresh this endpoint when a link expires. Select the download method from the
     * returned fields, not the platform alone.
     */
    fun retrieveRecordings(
        id: String
    ): CompletableFuture<MeetingSessionRetrieveRecordingsResponse> =
        retrieveRecordings(id, MeetingSessionRetrieveRecordingsParams.none())

    /** @see retrieveRecordings */
    fun retrieveRecordings(
        id: String,
        params: MeetingSessionRetrieveRecordingsParams =
            MeetingSessionRetrieveRecordingsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MeetingSessionRetrieveRecordingsResponse> =
        retrieveRecordings(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieveRecordings */
    fun retrieveRecordings(
        id: String,
        params: MeetingSessionRetrieveRecordingsParams =
            MeetingSessionRetrieveRecordingsParams.none(),
    ): CompletableFuture<MeetingSessionRetrieveRecordingsResponse> =
        retrieveRecordings(id, params, RequestOptions.none())

    /** @see retrieveRecordings */
    fun retrieveRecordings(
        params: MeetingSessionRetrieveRecordingsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MeetingSessionRetrieveRecordingsResponse>

    /** @see retrieveRecordings */
    fun retrieveRecordings(
        params: MeetingSessionRetrieveRecordingsParams
    ): CompletableFuture<MeetingSessionRetrieveRecordingsResponse> =
        retrieveRecordings(params, RequestOptions.none())

    /** @see retrieveRecordings */
    fun retrieveRecordings(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<MeetingSessionRetrieveRecordingsResponse> =
        retrieveRecordings(id, MeetingSessionRetrieveRecordingsParams.none(), requestOptions)

    /**
     * Returns transcript segments ordered by ascending seq. Default limit is 100, maximum 1000.
     * Continue with after=meta.next_after. On an empty page, meta.next_after preserves a positive
     * supplied after cursor, or is null when no positive cursor was supplied. wait_seconds holds an
     * empty read for up to 25 seconds; a timeout still returns 200.
     */
    fun retrieveTranscript(
        id: String
    ): CompletableFuture<MeetingSessionRetrieveTranscriptResponse> =
        retrieveTranscript(id, MeetingSessionRetrieveTranscriptParams.none())

    /** @see retrieveTranscript */
    fun retrieveTranscript(
        id: String,
        params: MeetingSessionRetrieveTranscriptParams =
            MeetingSessionRetrieveTranscriptParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MeetingSessionRetrieveTranscriptResponse> =
        retrieveTranscript(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieveTranscript */
    fun retrieveTranscript(
        id: String,
        params: MeetingSessionRetrieveTranscriptParams =
            MeetingSessionRetrieveTranscriptParams.none(),
    ): CompletableFuture<MeetingSessionRetrieveTranscriptResponse> =
        retrieveTranscript(id, params, RequestOptions.none())

    /** @see retrieveTranscript */
    fun retrieveTranscript(
        params: MeetingSessionRetrieveTranscriptParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MeetingSessionRetrieveTranscriptResponse>

    /** @see retrieveTranscript */
    fun retrieveTranscript(
        params: MeetingSessionRetrieveTranscriptParams
    ): CompletableFuture<MeetingSessionRetrieveTranscriptResponse> =
        retrieveTranscript(params, RequestOptions.none())

    /** @see retrieveTranscript */
    fun retrieveTranscript(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<MeetingSessionRetrieveTranscriptResponse> =
        retrieveTranscript(id, MeetingSessionRetrieveTranscriptParams.none(), requestOptions)

    /**
     * A view of [MeetingSessionServiceAsync] that provides access to raw HTTP responses for each
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
        ): MeetingSessionServiceAsync.WithRawResponse

        /** Send real-time speech and chat actions to an active meeting session. */
        fun actions(): ActionServiceAsync.WithRawResponse

        /** Create and retrieve asynchronous summaries and action-item artifacts. */
        fun artifacts(): ArtifactServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /meeting_sessions`, but is otherwise the same as
         * [MeetingSessionServiceAsync.create].
         */
        fun create(
            params: MeetingSessionCreateParams
        ): CompletableFuture<HttpResponseFor<MeetingSessionResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: MeetingSessionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MeetingSessionResponse>>

        /**
         * Returns a raw HTTP response for `get /meeting_sessions/{id}`, but is otherwise the same
         * as [MeetingSessionServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<MeetingSessionResponse>> =
            retrieve(id, MeetingSessionRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: MeetingSessionRetrieveParams = MeetingSessionRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MeetingSessionResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: MeetingSessionRetrieveParams = MeetingSessionRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<MeetingSessionResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: MeetingSessionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MeetingSessionResponse>>

        /** @see retrieve */
        fun retrieve(
            params: MeetingSessionRetrieveParams
        ): CompletableFuture<HttpResponseFor<MeetingSessionResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MeetingSessionResponse>> =
            retrieve(id, MeetingSessionRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /meeting_sessions/{id}`, but is otherwise the same
         * as [MeetingSessionServiceAsync.update].
         */
        fun update(id: String): CompletableFuture<HttpResponseFor<MeetingSessionResponse>> =
            update(id, MeetingSessionUpdateParams.none())

        /** @see update */
        fun update(
            id: String,
            params: MeetingSessionUpdateParams = MeetingSessionUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MeetingSessionResponse>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        fun update(
            id: String,
            params: MeetingSessionUpdateParams = MeetingSessionUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<MeetingSessionResponse>> =
            update(id, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: MeetingSessionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MeetingSessionResponse>>

        /** @see update */
        fun update(
            params: MeetingSessionUpdateParams
        ): CompletableFuture<HttpResponseFor<MeetingSessionResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MeetingSessionResponse>> =
            update(id, MeetingSessionUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /meeting_sessions`, but is otherwise the same as
         * [MeetingSessionServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<MeetingSessionListResponse>> =
            list(MeetingSessionListParams.none())

        /** @see list */
        fun list(
            params: MeetingSessionListParams = MeetingSessionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MeetingSessionListResponse>>

        /** @see list */
        fun list(
            params: MeetingSessionListParams = MeetingSessionListParams.none()
        ): CompletableFuture<HttpResponseFor<MeetingSessionListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<MeetingSessionListResponse>> =
            list(MeetingSessionListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /meeting_sessions/{id}`, but is otherwise the
         * same as [MeetingSessionServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponseFor<MeetingSessionResponse>> =
            delete(id, MeetingSessionDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: MeetingSessionDeleteParams = MeetingSessionDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MeetingSessionResponse>> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: MeetingSessionDeleteParams = MeetingSessionDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<MeetingSessionResponse>> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: MeetingSessionDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MeetingSessionResponse>>

        /** @see delete */
        fun delete(
            params: MeetingSessionDeleteParams
        ): CompletableFuture<HttpResponseFor<MeetingSessionResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MeetingSessionResponse>> =
            delete(id, MeetingSessionDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /meeting_sessions/{id}/recording_media`, but is
         * otherwise the same as [MeetingSessionServiceAsync.deleteRecordingMedia].
         */
        fun deleteRecordingMedia(
            id: String
        ): CompletableFuture<HttpResponseFor<MeetingSessionDeleteRecordingMediaResponse>> =
            deleteRecordingMedia(id, MeetingSessionDeleteRecordingMediaParams.none())

        /** @see deleteRecordingMedia */
        fun deleteRecordingMedia(
            id: String,
            params: MeetingSessionDeleteRecordingMediaParams =
                MeetingSessionDeleteRecordingMediaParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MeetingSessionDeleteRecordingMediaResponse>> =
            deleteRecordingMedia(params.toBuilder().id(id).build(), requestOptions)

        /** @see deleteRecordingMedia */
        fun deleteRecordingMedia(
            id: String,
            params: MeetingSessionDeleteRecordingMediaParams =
                MeetingSessionDeleteRecordingMediaParams.none(),
        ): CompletableFuture<HttpResponseFor<MeetingSessionDeleteRecordingMediaResponse>> =
            deleteRecordingMedia(id, params, RequestOptions.none())

        /** @see deleteRecordingMedia */
        fun deleteRecordingMedia(
            params: MeetingSessionDeleteRecordingMediaParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MeetingSessionDeleteRecordingMediaResponse>>

        /** @see deleteRecordingMedia */
        fun deleteRecordingMedia(
            params: MeetingSessionDeleteRecordingMediaParams
        ): CompletableFuture<HttpResponseFor<MeetingSessionDeleteRecordingMediaResponse>> =
            deleteRecordingMedia(params, RequestOptions.none())

        /** @see deleteRecordingMedia */
        fun deleteRecordingMedia(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MeetingSessionDeleteRecordingMediaResponse>> =
            deleteRecordingMedia(
                id,
                MeetingSessionDeleteRecordingMediaParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /meeting_sessions/{id}/events`, but is otherwise the
         * same as [MeetingSessionServiceAsync.retrieveEvents].
         */
        fun retrieveEvents(
            id: String
        ): CompletableFuture<HttpResponseFor<MeetingSessionRetrieveEventsResponse>> =
            retrieveEvents(id, MeetingSessionRetrieveEventsParams.none())

        /** @see retrieveEvents */
        fun retrieveEvents(
            id: String,
            params: MeetingSessionRetrieveEventsParams = MeetingSessionRetrieveEventsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MeetingSessionRetrieveEventsResponse>> =
            retrieveEvents(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieveEvents */
        fun retrieveEvents(
            id: String,
            params: MeetingSessionRetrieveEventsParams = MeetingSessionRetrieveEventsParams.none(),
        ): CompletableFuture<HttpResponseFor<MeetingSessionRetrieveEventsResponse>> =
            retrieveEvents(id, params, RequestOptions.none())

        /** @see retrieveEvents */
        fun retrieveEvents(
            params: MeetingSessionRetrieveEventsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MeetingSessionRetrieveEventsResponse>>

        /** @see retrieveEvents */
        fun retrieveEvents(
            params: MeetingSessionRetrieveEventsParams
        ): CompletableFuture<HttpResponseFor<MeetingSessionRetrieveEventsResponse>> =
            retrieveEvents(params, RequestOptions.none())

        /** @see retrieveEvents */
        fun retrieveEvents(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MeetingSessionRetrieveEventsResponse>> =
            retrieveEvents(id, MeetingSessionRetrieveEventsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /meeting_sessions/{id}/recordings`, but is otherwise
         * the same as [MeetingSessionServiceAsync.retrieveRecordings].
         */
        fun retrieveRecordings(
            id: String
        ): CompletableFuture<HttpResponseFor<MeetingSessionRetrieveRecordingsResponse>> =
            retrieveRecordings(id, MeetingSessionRetrieveRecordingsParams.none())

        /** @see retrieveRecordings */
        fun retrieveRecordings(
            id: String,
            params: MeetingSessionRetrieveRecordingsParams =
                MeetingSessionRetrieveRecordingsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MeetingSessionRetrieveRecordingsResponse>> =
            retrieveRecordings(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieveRecordings */
        fun retrieveRecordings(
            id: String,
            params: MeetingSessionRetrieveRecordingsParams =
                MeetingSessionRetrieveRecordingsParams.none(),
        ): CompletableFuture<HttpResponseFor<MeetingSessionRetrieveRecordingsResponse>> =
            retrieveRecordings(id, params, RequestOptions.none())

        /** @see retrieveRecordings */
        fun retrieveRecordings(
            params: MeetingSessionRetrieveRecordingsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MeetingSessionRetrieveRecordingsResponse>>

        /** @see retrieveRecordings */
        fun retrieveRecordings(
            params: MeetingSessionRetrieveRecordingsParams
        ): CompletableFuture<HttpResponseFor<MeetingSessionRetrieveRecordingsResponse>> =
            retrieveRecordings(params, RequestOptions.none())

        /** @see retrieveRecordings */
        fun retrieveRecordings(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MeetingSessionRetrieveRecordingsResponse>> =
            retrieveRecordings(id, MeetingSessionRetrieveRecordingsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /meeting_sessions/{id}/transcript`, but is otherwise
         * the same as [MeetingSessionServiceAsync.retrieveTranscript].
         */
        fun retrieveTranscript(
            id: String
        ): CompletableFuture<HttpResponseFor<MeetingSessionRetrieveTranscriptResponse>> =
            retrieveTranscript(id, MeetingSessionRetrieveTranscriptParams.none())

        /** @see retrieveTranscript */
        fun retrieveTranscript(
            id: String,
            params: MeetingSessionRetrieveTranscriptParams =
                MeetingSessionRetrieveTranscriptParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MeetingSessionRetrieveTranscriptResponse>> =
            retrieveTranscript(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieveTranscript */
        fun retrieveTranscript(
            id: String,
            params: MeetingSessionRetrieveTranscriptParams =
                MeetingSessionRetrieveTranscriptParams.none(),
        ): CompletableFuture<HttpResponseFor<MeetingSessionRetrieveTranscriptResponse>> =
            retrieveTranscript(id, params, RequestOptions.none())

        /** @see retrieveTranscript */
        fun retrieveTranscript(
            params: MeetingSessionRetrieveTranscriptParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MeetingSessionRetrieveTranscriptResponse>>

        /** @see retrieveTranscript */
        fun retrieveTranscript(
            params: MeetingSessionRetrieveTranscriptParams
        ): CompletableFuture<HttpResponseFor<MeetingSessionRetrieveTranscriptResponse>> =
            retrieveTranscript(params, RequestOptions.none())

        /** @see retrieveTranscript */
        fun retrieveTranscript(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MeetingSessionRetrieveTranscriptResponse>> =
            retrieveTranscript(id, MeetingSessionRetrieveTranscriptParams.none(), requestOptions)
    }
}
