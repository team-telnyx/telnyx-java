// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.roomcompositions.RoomCompositionCreateParams
import com.telnyx.sdk.models.roomcompositions.RoomCompositionCreateResponse
import com.telnyx.sdk.models.roomcompositions.RoomCompositionDeleteParams
import com.telnyx.sdk.models.roomcompositions.RoomCompositionListPage
import com.telnyx.sdk.models.roomcompositions.RoomCompositionListParams
import com.telnyx.sdk.models.roomcompositions.RoomCompositionRetrieveParams
import com.telnyx.sdk.models.roomcompositions.RoomCompositionRetrieveResponse
import java.util.function.Consumer

interface RoomCompositionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RoomCompositionService

    /** Asynchronously create a room composition. */
    fun create(): RoomCompositionCreateResponse = create(RoomCompositionCreateParams.none())

    /** @see create */
    fun create(
        params: RoomCompositionCreateParams = RoomCompositionCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RoomCompositionCreateResponse

    /** @see create */
    fun create(
        params: RoomCompositionCreateParams = RoomCompositionCreateParams.none()
    ): RoomCompositionCreateResponse = create(params, RequestOptions.none())

    /** @see create */
    fun create(requestOptions: RequestOptions): RoomCompositionCreateResponse =
        create(RoomCompositionCreateParams.none(), requestOptions)

    /** View a room composition. */
    fun retrieve(roomCompositionId: String): RoomCompositionRetrieveResponse =
        retrieve(roomCompositionId, RoomCompositionRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        roomCompositionId: String,
        params: RoomCompositionRetrieveParams = RoomCompositionRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RoomCompositionRetrieveResponse =
        retrieve(params.toBuilder().roomCompositionId(roomCompositionId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        roomCompositionId: String,
        params: RoomCompositionRetrieveParams = RoomCompositionRetrieveParams.none(),
    ): RoomCompositionRetrieveResponse = retrieve(roomCompositionId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: RoomCompositionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RoomCompositionRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: RoomCompositionRetrieveParams): RoomCompositionRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        roomCompositionId: String,
        requestOptions: RequestOptions,
    ): RoomCompositionRetrieveResponse =
        retrieve(roomCompositionId, RoomCompositionRetrieveParams.none(), requestOptions)

    /** View a list of room compositions. */
    fun list(): RoomCompositionListPage = list(RoomCompositionListParams.none())

    /** @see list */
    fun list(
        params: RoomCompositionListParams = RoomCompositionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RoomCompositionListPage

    /** @see list */
    fun list(
        params: RoomCompositionListParams = RoomCompositionListParams.none()
    ): RoomCompositionListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): RoomCompositionListPage =
        list(RoomCompositionListParams.none(), requestOptions)

    /** Synchronously delete a room composition. */
    fun delete(roomCompositionId: String) =
        delete(roomCompositionId, RoomCompositionDeleteParams.none())

    /** @see delete */
    fun delete(
        roomCompositionId: String,
        params: RoomCompositionDeleteParams = RoomCompositionDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().roomCompositionId(roomCompositionId).build(), requestOptions)

    /** @see delete */
    fun delete(
        roomCompositionId: String,
        params: RoomCompositionDeleteParams = RoomCompositionDeleteParams.none(),
    ) = delete(roomCompositionId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: RoomCompositionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    fun delete(params: RoomCompositionDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(roomCompositionId: String, requestOptions: RequestOptions) =
        delete(roomCompositionId, RoomCompositionDeleteParams.none(), requestOptions)

    /**
     * A view of [RoomCompositionService] that provides access to raw HTTP responses for each
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
        ): RoomCompositionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /room_compositions`, but is otherwise the same as
         * [RoomCompositionService.create].
         */
        @MustBeClosed
        fun create(): HttpResponseFor<RoomCompositionCreateResponse> =
            create(RoomCompositionCreateParams.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: RoomCompositionCreateParams = RoomCompositionCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RoomCompositionCreateResponse>

        /** @see create */
        @MustBeClosed
        fun create(
            params: RoomCompositionCreateParams = RoomCompositionCreateParams.none()
        ): HttpResponseFor<RoomCompositionCreateResponse> = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(requestOptions: RequestOptions): HttpResponseFor<RoomCompositionCreateResponse> =
            create(RoomCompositionCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /room_compositions/{room_composition_id}`, but is
         * otherwise the same as [RoomCompositionService.retrieve].
         */
        @MustBeClosed
        fun retrieve(roomCompositionId: String): HttpResponseFor<RoomCompositionRetrieveResponse> =
            retrieve(roomCompositionId, RoomCompositionRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            roomCompositionId: String,
            params: RoomCompositionRetrieveParams = RoomCompositionRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RoomCompositionRetrieveResponse> =
            retrieve(
                params.toBuilder().roomCompositionId(roomCompositionId).build(),
                requestOptions,
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            roomCompositionId: String,
            params: RoomCompositionRetrieveParams = RoomCompositionRetrieveParams.none(),
        ): HttpResponseFor<RoomCompositionRetrieveResponse> =
            retrieve(roomCompositionId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: RoomCompositionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RoomCompositionRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: RoomCompositionRetrieveParams
        ): HttpResponseFor<RoomCompositionRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            roomCompositionId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RoomCompositionRetrieveResponse> =
            retrieve(roomCompositionId, RoomCompositionRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /room_compositions`, but is otherwise the same as
         * [RoomCompositionService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<RoomCompositionListPage> =
            list(RoomCompositionListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: RoomCompositionListParams = RoomCompositionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RoomCompositionListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: RoomCompositionListParams = RoomCompositionListParams.none()
        ): HttpResponseFor<RoomCompositionListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<RoomCompositionListPage> =
            list(RoomCompositionListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /room_compositions/{room_composition_id}`, but is
         * otherwise the same as [RoomCompositionService.delete].
         */
        @MustBeClosed
        fun delete(roomCompositionId: String): HttpResponse =
            delete(roomCompositionId, RoomCompositionDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            roomCompositionId: String,
            params: RoomCompositionDeleteParams = RoomCompositionDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            delete(params.toBuilder().roomCompositionId(roomCompositionId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            roomCompositionId: String,
            params: RoomCompositionDeleteParams = RoomCompositionDeleteParams.none(),
        ): HttpResponse = delete(roomCompositionId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: RoomCompositionDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: RoomCompositionDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(roomCompositionId: String, requestOptions: RequestOptions): HttpResponse =
            delete(roomCompositionId, RoomCompositionDeleteParams.none(), requestOptions)
    }
}
