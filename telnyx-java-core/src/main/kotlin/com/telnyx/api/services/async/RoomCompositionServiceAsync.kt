// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponse
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.roomcompositions.RoomCompositionCreateParams
import com.telnyx.api.models.roomcompositions.RoomCompositionCreateResponse
import com.telnyx.api.models.roomcompositions.RoomCompositionDeleteParams
import com.telnyx.api.models.roomcompositions.RoomCompositionListParams
import com.telnyx.api.models.roomcompositions.RoomCompositionListResponse
import com.telnyx.api.models.roomcompositions.RoomCompositionRetrieveParams
import com.telnyx.api.models.roomcompositions.RoomCompositionRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface RoomCompositionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RoomCompositionServiceAsync

    /** Asynchronously create a room composition. */
    fun create(): CompletableFuture<RoomCompositionCreateResponse> =
        create(RoomCompositionCreateParams.none())

    /** @see create */
    fun create(
        params: RoomCompositionCreateParams = RoomCompositionCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RoomCompositionCreateResponse>

    /** @see create */
    fun create(
        params: RoomCompositionCreateParams = RoomCompositionCreateParams.none()
    ): CompletableFuture<RoomCompositionCreateResponse> = create(params, RequestOptions.none())

    /** @see create */
    fun create(requestOptions: RequestOptions): CompletableFuture<RoomCompositionCreateResponse> =
        create(RoomCompositionCreateParams.none(), requestOptions)

    /** View a room composition. */
    fun retrieve(roomCompositionId: String): CompletableFuture<RoomCompositionRetrieveResponse> =
        retrieve(roomCompositionId, RoomCompositionRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        roomCompositionId: String,
        params: RoomCompositionRetrieveParams = RoomCompositionRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RoomCompositionRetrieveResponse> =
        retrieve(params.toBuilder().roomCompositionId(roomCompositionId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        roomCompositionId: String,
        params: RoomCompositionRetrieveParams = RoomCompositionRetrieveParams.none(),
    ): CompletableFuture<RoomCompositionRetrieveResponse> =
        retrieve(roomCompositionId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: RoomCompositionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RoomCompositionRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: RoomCompositionRetrieveParams
    ): CompletableFuture<RoomCompositionRetrieveResponse> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        roomCompositionId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<RoomCompositionRetrieveResponse> =
        retrieve(roomCompositionId, RoomCompositionRetrieveParams.none(), requestOptions)

    /** View a list of room compositions. */
    fun list(): CompletableFuture<RoomCompositionListResponse> =
        list(RoomCompositionListParams.none())

    /** @see list */
    fun list(
        params: RoomCompositionListParams = RoomCompositionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RoomCompositionListResponse>

    /** @see list */
    fun list(
        params: RoomCompositionListParams = RoomCompositionListParams.none()
    ): CompletableFuture<RoomCompositionListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<RoomCompositionListResponse> =
        list(RoomCompositionListParams.none(), requestOptions)

    /** Synchronously delete a room composition. */
    fun delete(roomCompositionId: String): CompletableFuture<Void?> =
        delete(roomCompositionId, RoomCompositionDeleteParams.none())

    /** @see delete */
    fun delete(
        roomCompositionId: String,
        params: RoomCompositionDeleteParams = RoomCompositionDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().roomCompositionId(roomCompositionId).build(), requestOptions)

    /** @see delete */
    fun delete(
        roomCompositionId: String,
        params: RoomCompositionDeleteParams = RoomCompositionDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(roomCompositionId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: RoomCompositionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: RoomCompositionDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        roomCompositionId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        delete(roomCompositionId, RoomCompositionDeleteParams.none(), requestOptions)

    /**
     * A view of [RoomCompositionServiceAsync] that provides access to raw HTTP responses for each
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
        ): RoomCompositionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /room_compositions`, but is otherwise the same as
         * [RoomCompositionServiceAsync.create].
         */
        fun create(): CompletableFuture<HttpResponseFor<RoomCompositionCreateResponse>> =
            create(RoomCompositionCreateParams.none())

        /** @see create */
        fun create(
            params: RoomCompositionCreateParams = RoomCompositionCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RoomCompositionCreateResponse>>

        /** @see create */
        fun create(
            params: RoomCompositionCreateParams = RoomCompositionCreateParams.none()
        ): CompletableFuture<HttpResponseFor<RoomCompositionCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<RoomCompositionCreateResponse>> =
            create(RoomCompositionCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /room_compositions/{room_composition_id}`, but is
         * otherwise the same as [RoomCompositionServiceAsync.retrieve].
         */
        fun retrieve(
            roomCompositionId: String
        ): CompletableFuture<HttpResponseFor<RoomCompositionRetrieveResponse>> =
            retrieve(roomCompositionId, RoomCompositionRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            roomCompositionId: String,
            params: RoomCompositionRetrieveParams = RoomCompositionRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RoomCompositionRetrieveResponse>> =
            retrieve(
                params.toBuilder().roomCompositionId(roomCompositionId).build(),
                requestOptions,
            )

        /** @see retrieve */
        fun retrieve(
            roomCompositionId: String,
            params: RoomCompositionRetrieveParams = RoomCompositionRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<RoomCompositionRetrieveResponse>> =
            retrieve(roomCompositionId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: RoomCompositionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RoomCompositionRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: RoomCompositionRetrieveParams
        ): CompletableFuture<HttpResponseFor<RoomCompositionRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            roomCompositionId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RoomCompositionRetrieveResponse>> =
            retrieve(roomCompositionId, RoomCompositionRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /room_compositions`, but is otherwise the same as
         * [RoomCompositionServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<RoomCompositionListResponse>> =
            list(RoomCompositionListParams.none())

        /** @see list */
        fun list(
            params: RoomCompositionListParams = RoomCompositionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RoomCompositionListResponse>>

        /** @see list */
        fun list(
            params: RoomCompositionListParams = RoomCompositionListParams.none()
        ): CompletableFuture<HttpResponseFor<RoomCompositionListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<RoomCompositionListResponse>> =
            list(RoomCompositionListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /room_compositions/{room_composition_id}`, but is
         * otherwise the same as [RoomCompositionServiceAsync.delete].
         */
        fun delete(roomCompositionId: String): CompletableFuture<HttpResponse> =
            delete(roomCompositionId, RoomCompositionDeleteParams.none())

        /** @see delete */
        fun delete(
            roomCompositionId: String,
            params: RoomCompositionDeleteParams = RoomCompositionDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().roomCompositionId(roomCompositionId).build(), requestOptions)

        /** @see delete */
        fun delete(
            roomCompositionId: String,
            params: RoomCompositionDeleteParams = RoomCompositionDeleteParams.none(),
        ): CompletableFuture<HttpResponse> =
            delete(roomCompositionId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: RoomCompositionDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: RoomCompositionDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            roomCompositionId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(roomCompositionId, RoomCompositionDeleteParams.none(), requestOptions)
    }
}
