// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.rooms

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.rooms.sessions.SessionList0Params
import com.telnyx.sdk.models.rooms.sessions.SessionList0Response
import com.telnyx.sdk.models.rooms.sessions.SessionList1Params
import com.telnyx.sdk.models.rooms.sessions.SessionList1Response
import com.telnyx.sdk.models.rooms.sessions.SessionRetrieveParams
import com.telnyx.sdk.models.rooms.sessions.SessionRetrieveParticipantsParams
import com.telnyx.sdk.models.rooms.sessions.SessionRetrieveParticipantsResponse
import com.telnyx.sdk.models.rooms.sessions.SessionRetrieveResponse
import com.telnyx.sdk.services.blocking.rooms.sessions.ActionService
import java.util.function.Consumer

interface SessionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SessionService

    fun actions(): ActionService

    /** View a room session. */
    fun retrieve(roomSessionId: String): SessionRetrieveResponse =
        retrieve(roomSessionId, SessionRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        roomSessionId: String,
        params: SessionRetrieveParams = SessionRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SessionRetrieveResponse =
        retrieve(params.toBuilder().roomSessionId(roomSessionId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        roomSessionId: String,
        params: SessionRetrieveParams = SessionRetrieveParams.none(),
    ): SessionRetrieveResponse = retrieve(roomSessionId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: SessionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SessionRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: SessionRetrieveParams): SessionRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(roomSessionId: String, requestOptions: RequestOptions): SessionRetrieveResponse =
        retrieve(roomSessionId, SessionRetrieveParams.none(), requestOptions)

    /** View a list of room sessions. */
    fun list0(): SessionList0Response = list0(SessionList0Params.none())

    /** @see list0 */
    fun list0(
        params: SessionList0Params = SessionList0Params.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SessionList0Response

    /** @see list0 */
    fun list0(params: SessionList0Params = SessionList0Params.none()): SessionList0Response =
        list0(params, RequestOptions.none())

    /** @see list0 */
    fun list0(requestOptions: RequestOptions): SessionList0Response =
        list0(SessionList0Params.none(), requestOptions)

    /** View a list of room sessions. */
    fun list1(roomId: String): SessionList1Response = list1(roomId, SessionList1Params.none())

    /** @see list1 */
    fun list1(
        roomId: String,
        params: SessionList1Params = SessionList1Params.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SessionList1Response = list1(params.toBuilder().roomId(roomId).build(), requestOptions)

    /** @see list1 */
    fun list1(
        roomId: String,
        params: SessionList1Params = SessionList1Params.none(),
    ): SessionList1Response = list1(roomId, params, RequestOptions.none())

    /** @see list1 */
    fun list1(
        params: SessionList1Params,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SessionList1Response

    /** @see list1 */
    fun list1(params: SessionList1Params): SessionList1Response =
        list1(params, RequestOptions.none())

    /** @see list1 */
    fun list1(roomId: String, requestOptions: RequestOptions): SessionList1Response =
        list1(roomId, SessionList1Params.none(), requestOptions)

    /** View a list of room participants. */
    fun retrieveParticipants(roomSessionId: String): SessionRetrieveParticipantsResponse =
        retrieveParticipants(roomSessionId, SessionRetrieveParticipantsParams.none())

    /** @see retrieveParticipants */
    fun retrieveParticipants(
        roomSessionId: String,
        params: SessionRetrieveParticipantsParams = SessionRetrieveParticipantsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SessionRetrieveParticipantsResponse =
        retrieveParticipants(
            params.toBuilder().roomSessionId(roomSessionId).build(),
            requestOptions,
        )

    /** @see retrieveParticipants */
    fun retrieveParticipants(
        roomSessionId: String,
        params: SessionRetrieveParticipantsParams = SessionRetrieveParticipantsParams.none(),
    ): SessionRetrieveParticipantsResponse =
        retrieveParticipants(roomSessionId, params, RequestOptions.none())

    /** @see retrieveParticipants */
    fun retrieveParticipants(
        params: SessionRetrieveParticipantsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SessionRetrieveParticipantsResponse

    /** @see retrieveParticipants */
    fun retrieveParticipants(
        params: SessionRetrieveParticipantsParams
    ): SessionRetrieveParticipantsResponse = retrieveParticipants(params, RequestOptions.none())

    /** @see retrieveParticipants */
    fun retrieveParticipants(
        roomSessionId: String,
        requestOptions: RequestOptions,
    ): SessionRetrieveParticipantsResponse =
        retrieveParticipants(
            roomSessionId,
            SessionRetrieveParticipantsParams.none(),
            requestOptions,
        )

    /** A view of [SessionService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): SessionService.WithRawResponse

        fun actions(): ActionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /room_sessions/{room_session_id}`, but is otherwise
         * the same as [SessionService.retrieve].
         */
        @MustBeClosed
        fun retrieve(roomSessionId: String): HttpResponseFor<SessionRetrieveResponse> =
            retrieve(roomSessionId, SessionRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            roomSessionId: String,
            params: SessionRetrieveParams = SessionRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SessionRetrieveResponse> =
            retrieve(params.toBuilder().roomSessionId(roomSessionId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            roomSessionId: String,
            params: SessionRetrieveParams = SessionRetrieveParams.none(),
        ): HttpResponseFor<SessionRetrieveResponse> =
            retrieve(roomSessionId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: SessionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SessionRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: SessionRetrieveParams): HttpResponseFor<SessionRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            roomSessionId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SessionRetrieveResponse> =
            retrieve(roomSessionId, SessionRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /room_sessions`, but is otherwise the same as
         * [SessionService.list0].
         */
        @MustBeClosed
        fun list0(): HttpResponseFor<SessionList0Response> = list0(SessionList0Params.none())

        /** @see list0 */
        @MustBeClosed
        fun list0(
            params: SessionList0Params = SessionList0Params.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SessionList0Response>

        /** @see list0 */
        @MustBeClosed
        fun list0(
            params: SessionList0Params = SessionList0Params.none()
        ): HttpResponseFor<SessionList0Response> = list0(params, RequestOptions.none())

        /** @see list0 */
        @MustBeClosed
        fun list0(requestOptions: RequestOptions): HttpResponseFor<SessionList0Response> =
            list0(SessionList0Params.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /rooms/{room_id}/sessions`, but is otherwise the
         * same as [SessionService.list1].
         */
        @MustBeClosed
        fun list1(roomId: String): HttpResponseFor<SessionList1Response> =
            list1(roomId, SessionList1Params.none())

        /** @see list1 */
        @MustBeClosed
        fun list1(
            roomId: String,
            params: SessionList1Params = SessionList1Params.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SessionList1Response> =
            list1(params.toBuilder().roomId(roomId).build(), requestOptions)

        /** @see list1 */
        @MustBeClosed
        fun list1(
            roomId: String,
            params: SessionList1Params = SessionList1Params.none(),
        ): HttpResponseFor<SessionList1Response> = list1(roomId, params, RequestOptions.none())

        /** @see list1 */
        @MustBeClosed
        fun list1(
            params: SessionList1Params,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SessionList1Response>

        /** @see list1 */
        @MustBeClosed
        fun list1(params: SessionList1Params): HttpResponseFor<SessionList1Response> =
            list1(params, RequestOptions.none())

        /** @see list1 */
        @MustBeClosed
        fun list1(
            roomId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SessionList1Response> =
            list1(roomId, SessionList1Params.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /room_sessions/{room_session_id}/participants`, but
         * is otherwise the same as [SessionService.retrieveParticipants].
         */
        @MustBeClosed
        fun retrieveParticipants(
            roomSessionId: String
        ): HttpResponseFor<SessionRetrieveParticipantsResponse> =
            retrieveParticipants(roomSessionId, SessionRetrieveParticipantsParams.none())

        /** @see retrieveParticipants */
        @MustBeClosed
        fun retrieveParticipants(
            roomSessionId: String,
            params: SessionRetrieveParticipantsParams = SessionRetrieveParticipantsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SessionRetrieveParticipantsResponse> =
            retrieveParticipants(
                params.toBuilder().roomSessionId(roomSessionId).build(),
                requestOptions,
            )

        /** @see retrieveParticipants */
        @MustBeClosed
        fun retrieveParticipants(
            roomSessionId: String,
            params: SessionRetrieveParticipantsParams = SessionRetrieveParticipantsParams.none(),
        ): HttpResponseFor<SessionRetrieveParticipantsResponse> =
            retrieveParticipants(roomSessionId, params, RequestOptions.none())

        /** @see retrieveParticipants */
        @MustBeClosed
        fun retrieveParticipants(
            params: SessionRetrieveParticipantsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SessionRetrieveParticipantsResponse>

        /** @see retrieveParticipants */
        @MustBeClosed
        fun retrieveParticipants(
            params: SessionRetrieveParticipantsParams
        ): HttpResponseFor<SessionRetrieveParticipantsResponse> =
            retrieveParticipants(params, RequestOptions.none())

        /** @see retrieveParticipants */
        @MustBeClosed
        fun retrieveParticipants(
            roomSessionId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SessionRetrieveParticipantsResponse> =
            retrieveParticipants(
                roomSessionId,
                SessionRetrieveParticipantsParams.none(),
                requestOptions,
            )
    }
}
