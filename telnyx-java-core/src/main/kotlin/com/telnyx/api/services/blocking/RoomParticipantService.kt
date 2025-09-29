// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.roomparticipants.RoomParticipantListParams
import com.telnyx.api.models.roomparticipants.RoomParticipantListResponse
import com.telnyx.api.models.roomparticipants.RoomParticipantRetrieveParams
import com.telnyx.api.models.roomparticipants.RoomParticipantRetrieveResponse
import java.util.function.Consumer

interface RoomParticipantService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RoomParticipantService

    /** View a room participant. */
    fun retrieve(roomParticipantId: String): RoomParticipantRetrieveResponse =
        retrieve(roomParticipantId, RoomParticipantRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        roomParticipantId: String,
        params: RoomParticipantRetrieveParams = RoomParticipantRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RoomParticipantRetrieveResponse =
        retrieve(params.toBuilder().roomParticipantId(roomParticipantId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        roomParticipantId: String,
        params: RoomParticipantRetrieveParams = RoomParticipantRetrieveParams.none(),
    ): RoomParticipantRetrieveResponse = retrieve(roomParticipantId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: RoomParticipantRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RoomParticipantRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: RoomParticipantRetrieveParams): RoomParticipantRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        roomParticipantId: String,
        requestOptions: RequestOptions,
    ): RoomParticipantRetrieveResponse =
        retrieve(roomParticipantId, RoomParticipantRetrieveParams.none(), requestOptions)

    /** View a list of room participants. */
    fun list(): RoomParticipantListResponse = list(RoomParticipantListParams.none())

    /** @see list */
    fun list(
        params: RoomParticipantListParams = RoomParticipantListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RoomParticipantListResponse

    /** @see list */
    fun list(
        params: RoomParticipantListParams = RoomParticipantListParams.none()
    ): RoomParticipantListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): RoomParticipantListResponse =
        list(RoomParticipantListParams.none(), requestOptions)

    /**
     * A view of [RoomParticipantService] that provides access to raw HTTP responses for each
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
        ): RoomParticipantService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /room_participants/{room_participant_id}`, but is
         * otherwise the same as [RoomParticipantService.retrieve].
         */
        @MustBeClosed
        fun retrieve(roomParticipantId: String): HttpResponseFor<RoomParticipantRetrieveResponse> =
            retrieve(roomParticipantId, RoomParticipantRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            roomParticipantId: String,
            params: RoomParticipantRetrieveParams = RoomParticipantRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RoomParticipantRetrieveResponse> =
            retrieve(
                params.toBuilder().roomParticipantId(roomParticipantId).build(),
                requestOptions,
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            roomParticipantId: String,
            params: RoomParticipantRetrieveParams = RoomParticipantRetrieveParams.none(),
        ): HttpResponseFor<RoomParticipantRetrieveResponse> =
            retrieve(roomParticipantId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: RoomParticipantRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RoomParticipantRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: RoomParticipantRetrieveParams
        ): HttpResponseFor<RoomParticipantRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            roomParticipantId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RoomParticipantRetrieveResponse> =
            retrieve(roomParticipantId, RoomParticipantRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /room_participants`, but is otherwise the same as
         * [RoomParticipantService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<RoomParticipantListResponse> =
            list(RoomParticipantListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: RoomParticipantListParams = RoomParticipantListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RoomParticipantListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: RoomParticipantListParams = RoomParticipantListParams.none()
        ): HttpResponseFor<RoomParticipantListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<RoomParticipantListResponse> =
            list(RoomParticipantListParams.none(), requestOptions)
    }
}
