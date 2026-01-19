// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.rooms

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.rooms.sessions.SessionList0PageAsync
import com.telnyx.sdk.models.rooms.sessions.SessionList0Params
import com.telnyx.sdk.models.rooms.sessions.SessionList1PageAsync
import com.telnyx.sdk.models.rooms.sessions.SessionList1Params
import com.telnyx.sdk.models.rooms.sessions.SessionRetrieveParams
import com.telnyx.sdk.models.rooms.sessions.SessionRetrieveParticipantsPageAsync
import com.telnyx.sdk.models.rooms.sessions.SessionRetrieveParticipantsParams
import com.telnyx.sdk.models.rooms.sessions.SessionRetrieveResponse
import com.telnyx.sdk.services.async.rooms.sessions.ActionServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface SessionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SessionServiceAsync

    fun actions(): ActionServiceAsync

    /** View a room session. */
    fun retrieve(roomSessionId: String): CompletableFuture<SessionRetrieveResponse> =
        retrieve(roomSessionId, SessionRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        roomSessionId: String,
        params: SessionRetrieveParams = SessionRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SessionRetrieveResponse> =
        retrieve(params.toBuilder().roomSessionId(roomSessionId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        roomSessionId: String,
        params: SessionRetrieveParams = SessionRetrieveParams.none(),
    ): CompletableFuture<SessionRetrieveResponse> =
        retrieve(roomSessionId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: SessionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SessionRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: SessionRetrieveParams): CompletableFuture<SessionRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        roomSessionId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<SessionRetrieveResponse> =
        retrieve(roomSessionId, SessionRetrieveParams.none(), requestOptions)

    /** View a list of room sessions. */
    fun list0(): CompletableFuture<SessionList0PageAsync> = list0(SessionList0Params.none())

    /** @see list0 */
    fun list0(
        params: SessionList0Params = SessionList0Params.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SessionList0PageAsync>

    /** @see list0 */
    fun list0(
        params: SessionList0Params = SessionList0Params.none()
    ): CompletableFuture<SessionList0PageAsync> = list0(params, RequestOptions.none())

    /** @see list0 */
    fun list0(requestOptions: RequestOptions): CompletableFuture<SessionList0PageAsync> =
        list0(SessionList0Params.none(), requestOptions)

    /** View a list of room sessions. */
    fun list1(roomId: String): CompletableFuture<SessionList1PageAsync> =
        list1(roomId, SessionList1Params.none())

    /** @see list1 */
    fun list1(
        roomId: String,
        params: SessionList1Params = SessionList1Params.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SessionList1PageAsync> =
        list1(params.toBuilder().roomId(roomId).build(), requestOptions)

    /** @see list1 */
    fun list1(
        roomId: String,
        params: SessionList1Params = SessionList1Params.none(),
    ): CompletableFuture<SessionList1PageAsync> = list1(roomId, params, RequestOptions.none())

    /** @see list1 */
    fun list1(
        params: SessionList1Params,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SessionList1PageAsync>

    /** @see list1 */
    fun list1(params: SessionList1Params): CompletableFuture<SessionList1PageAsync> =
        list1(params, RequestOptions.none())

    /** @see list1 */
    fun list1(
        roomId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<SessionList1PageAsync> =
        list1(roomId, SessionList1Params.none(), requestOptions)

    /** View a list of room participants. */
    fun retrieveParticipants(
        roomSessionId: String
    ): CompletableFuture<SessionRetrieveParticipantsPageAsync> =
        retrieveParticipants(roomSessionId, SessionRetrieveParticipantsParams.none())

    /** @see retrieveParticipants */
    fun retrieveParticipants(
        roomSessionId: String,
        params: SessionRetrieveParticipantsParams = SessionRetrieveParticipantsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SessionRetrieveParticipantsPageAsync> =
        retrieveParticipants(
            params.toBuilder().roomSessionId(roomSessionId).build(),
            requestOptions,
        )

    /** @see retrieveParticipants */
    fun retrieveParticipants(
        roomSessionId: String,
        params: SessionRetrieveParticipantsParams = SessionRetrieveParticipantsParams.none(),
    ): CompletableFuture<SessionRetrieveParticipantsPageAsync> =
        retrieveParticipants(roomSessionId, params, RequestOptions.none())

    /** @see retrieveParticipants */
    fun retrieveParticipants(
        params: SessionRetrieveParticipantsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SessionRetrieveParticipantsPageAsync>

    /** @see retrieveParticipants */
    fun retrieveParticipants(
        params: SessionRetrieveParticipantsParams
    ): CompletableFuture<SessionRetrieveParticipantsPageAsync> =
        retrieveParticipants(params, RequestOptions.none())

    /** @see retrieveParticipants */
    fun retrieveParticipants(
        roomSessionId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<SessionRetrieveParticipantsPageAsync> =
        retrieveParticipants(
            roomSessionId,
            SessionRetrieveParticipantsParams.none(),
            requestOptions,
        )

    /**
     * A view of [SessionServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SessionServiceAsync.WithRawResponse

        fun actions(): ActionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /room_sessions/{room_session_id}`, but is otherwise
         * the same as [SessionServiceAsync.retrieve].
         */
        fun retrieve(
            roomSessionId: String
        ): CompletableFuture<HttpResponseFor<SessionRetrieveResponse>> =
            retrieve(roomSessionId, SessionRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            roomSessionId: String,
            params: SessionRetrieveParams = SessionRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SessionRetrieveResponse>> =
            retrieve(params.toBuilder().roomSessionId(roomSessionId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            roomSessionId: String,
            params: SessionRetrieveParams = SessionRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<SessionRetrieveResponse>> =
            retrieve(roomSessionId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: SessionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SessionRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: SessionRetrieveParams
        ): CompletableFuture<HttpResponseFor<SessionRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            roomSessionId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SessionRetrieveResponse>> =
            retrieve(roomSessionId, SessionRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /room_sessions`, but is otherwise the same as
         * [SessionServiceAsync.list0].
         */
        fun list0(): CompletableFuture<HttpResponseFor<SessionList0PageAsync>> =
            list0(SessionList0Params.none())

        /** @see list0 */
        fun list0(
            params: SessionList0Params = SessionList0Params.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SessionList0PageAsync>>

        /** @see list0 */
        fun list0(
            params: SessionList0Params = SessionList0Params.none()
        ): CompletableFuture<HttpResponseFor<SessionList0PageAsync>> =
            list0(params, RequestOptions.none())

        /** @see list0 */
        fun list0(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<SessionList0PageAsync>> =
            list0(SessionList0Params.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /rooms/{room_id}/sessions`, but is otherwise the
         * same as [SessionServiceAsync.list1].
         */
        fun list1(roomId: String): CompletableFuture<HttpResponseFor<SessionList1PageAsync>> =
            list1(roomId, SessionList1Params.none())

        /** @see list1 */
        fun list1(
            roomId: String,
            params: SessionList1Params = SessionList1Params.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SessionList1PageAsync>> =
            list1(params.toBuilder().roomId(roomId).build(), requestOptions)

        /** @see list1 */
        fun list1(
            roomId: String,
            params: SessionList1Params = SessionList1Params.none(),
        ): CompletableFuture<HttpResponseFor<SessionList1PageAsync>> =
            list1(roomId, params, RequestOptions.none())

        /** @see list1 */
        fun list1(
            params: SessionList1Params,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SessionList1PageAsync>>

        /** @see list1 */
        fun list1(
            params: SessionList1Params
        ): CompletableFuture<HttpResponseFor<SessionList1PageAsync>> =
            list1(params, RequestOptions.none())

        /** @see list1 */
        fun list1(
            roomId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SessionList1PageAsync>> =
            list1(roomId, SessionList1Params.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /room_sessions/{room_session_id}/participants`, but
         * is otherwise the same as [SessionServiceAsync.retrieveParticipants].
         */
        fun retrieveParticipants(
            roomSessionId: String
        ): CompletableFuture<HttpResponseFor<SessionRetrieveParticipantsPageAsync>> =
            retrieveParticipants(roomSessionId, SessionRetrieveParticipantsParams.none())

        /** @see retrieveParticipants */
        fun retrieveParticipants(
            roomSessionId: String,
            params: SessionRetrieveParticipantsParams = SessionRetrieveParticipantsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SessionRetrieveParticipantsPageAsync>> =
            retrieveParticipants(
                params.toBuilder().roomSessionId(roomSessionId).build(),
                requestOptions,
            )

        /** @see retrieveParticipants */
        fun retrieveParticipants(
            roomSessionId: String,
            params: SessionRetrieveParticipantsParams = SessionRetrieveParticipantsParams.none(),
        ): CompletableFuture<HttpResponseFor<SessionRetrieveParticipantsPageAsync>> =
            retrieveParticipants(roomSessionId, params, RequestOptions.none())

        /** @see retrieveParticipants */
        fun retrieveParticipants(
            params: SessionRetrieveParticipantsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SessionRetrieveParticipantsPageAsync>>

        /** @see retrieveParticipants */
        fun retrieveParticipants(
            params: SessionRetrieveParticipantsParams
        ): CompletableFuture<HttpResponseFor<SessionRetrieveParticipantsPageAsync>> =
            retrieveParticipants(params, RequestOptions.none())

        /** @see retrieveParticipants */
        fun retrieveParticipants(
            roomSessionId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SessionRetrieveParticipantsPageAsync>> =
            retrieveParticipants(
                roomSessionId,
                SessionRetrieveParticipantsParams.none(),
                requestOptions,
            )
    }
}
