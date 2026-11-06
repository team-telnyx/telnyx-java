// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.calendarconnections

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.calendarconnections.meetings.MeetingListParams
import com.telnyx.sdk.models.calendarconnections.meetings.MeetingListResponse
import com.telnyx.sdk.models.calendarconnections.meetings.MeetingUpdateParams
import com.telnyx.sdk.models.calendarconnections.meetings.MeetingUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Connect calendars and manage automatic meeting joins. */
interface MeetingServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MeetingServiceAsync

    /**
     * Set an individual meeting override: true opts in, false opts out, null follows the connection
     * policy. A supported meeting link is required. Changes re-evaluate the meeting immediately;
     * poll the linked session for its final lifecycle outcome.
     */
    fun update(
        meetingId: String,
        params: MeetingUpdateParams,
    ): CompletableFuture<MeetingUpdateResponse> = update(meetingId, params, RequestOptions.none())

    /** @see update */
    fun update(
        meetingId: String,
        params: MeetingUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MeetingUpdateResponse> =
        update(params.toBuilder().meetingId(meetingId).build(), requestOptions)

    /** @see update */
    fun update(params: MeetingUpdateParams): CompletableFuture<MeetingUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: MeetingUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MeetingUpdateResponse>

    /**
     * List tracked meetings in a window. Defaults from now through seven days from now. from must
     * not exceed to and the window must not exceed 31 days. bot_will_join is the effective policy
     * decision; check session_id and the linked session status for actual attendance.
     */
    fun list(id: String): CompletableFuture<MeetingListResponse> =
        list(id, MeetingListParams.none())

    /** @see list */
    fun list(
        id: String,
        params: MeetingListParams = MeetingListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MeetingListResponse> =
        list(params.toBuilder().id(id).build(), requestOptions)

    /** @see list */
    fun list(
        id: String,
        params: MeetingListParams = MeetingListParams.none(),
    ): CompletableFuture<MeetingListResponse> = list(id, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: MeetingListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MeetingListResponse>

    /** @see list */
    fun list(params: MeetingListParams): CompletableFuture<MeetingListResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(id: String, requestOptions: RequestOptions): CompletableFuture<MeetingListResponse> =
        list(id, MeetingListParams.none(), requestOptions)

    /**
     * A view of [MeetingServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MeetingServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `patch /calendar_connections/{id}/meetings/{meeting_id}`,
         * but is otherwise the same as [MeetingServiceAsync.update].
         */
        fun update(
            meetingId: String,
            params: MeetingUpdateParams,
        ): CompletableFuture<HttpResponseFor<MeetingUpdateResponse>> =
            update(meetingId, params, RequestOptions.none())

        /** @see update */
        fun update(
            meetingId: String,
            params: MeetingUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MeetingUpdateResponse>> =
            update(params.toBuilder().meetingId(meetingId).build(), requestOptions)

        /** @see update */
        fun update(
            params: MeetingUpdateParams
        ): CompletableFuture<HttpResponseFor<MeetingUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: MeetingUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MeetingUpdateResponse>>

        /**
         * Returns a raw HTTP response for `get /calendar_connections/{id}/meetings`, but is
         * otherwise the same as [MeetingServiceAsync.list].
         */
        fun list(id: String): CompletableFuture<HttpResponseFor<MeetingListResponse>> =
            list(id, MeetingListParams.none())

        /** @see list */
        fun list(
            id: String,
            params: MeetingListParams = MeetingListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MeetingListResponse>> =
            list(params.toBuilder().id(id).build(), requestOptions)

        /** @see list */
        fun list(
            id: String,
            params: MeetingListParams = MeetingListParams.none(),
        ): CompletableFuture<HttpResponseFor<MeetingListResponse>> =
            list(id, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: MeetingListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MeetingListResponse>>

        /** @see list */
        fun list(
            params: MeetingListParams
        ): CompletableFuture<HttpResponseFor<MeetingListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MeetingListResponse>> =
            list(id, MeetingListParams.none(), requestOptions)
    }
}
