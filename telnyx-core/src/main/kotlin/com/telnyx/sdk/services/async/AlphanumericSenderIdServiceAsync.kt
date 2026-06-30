// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.alphanumericsenderids.AlphanumericSenderIdCreateParams
import com.telnyx.sdk.models.alphanumericsenderids.AlphanumericSenderIdCreateResponse
import com.telnyx.sdk.models.alphanumericsenderids.AlphanumericSenderIdDeleteParams
import com.telnyx.sdk.models.alphanumericsenderids.AlphanumericSenderIdDeleteResponse
import com.telnyx.sdk.models.alphanumericsenderids.AlphanumericSenderIdListPageAsync
import com.telnyx.sdk.models.alphanumericsenderids.AlphanumericSenderIdListParams
import com.telnyx.sdk.models.alphanumericsenderids.AlphanumericSenderIdRetrieveParams
import com.telnyx.sdk.models.alphanumericsenderids.AlphanumericSenderIdRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface AlphanumericSenderIdServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AlphanumericSenderIdServiceAsync

    /** Create a new alphanumeric sender ID associated with a messaging profile. */
    fun create(
        params: AlphanumericSenderIdCreateParams
    ): CompletableFuture<AlphanumericSenderIdCreateResponse> = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: AlphanumericSenderIdCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AlphanumericSenderIdCreateResponse>

    /** Retrieve a specific alphanumeric sender ID. */
    fun retrieve(id: String): CompletableFuture<AlphanumericSenderIdRetrieveResponse> =
        retrieve(id, AlphanumericSenderIdRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: AlphanumericSenderIdRetrieveParams = AlphanumericSenderIdRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AlphanumericSenderIdRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: AlphanumericSenderIdRetrieveParams = AlphanumericSenderIdRetrieveParams.none(),
    ): CompletableFuture<AlphanumericSenderIdRetrieveResponse> =
        retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: AlphanumericSenderIdRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AlphanumericSenderIdRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: AlphanumericSenderIdRetrieveParams
    ): CompletableFuture<AlphanumericSenderIdRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<AlphanumericSenderIdRetrieveResponse> =
        retrieve(id, AlphanumericSenderIdRetrieveParams.none(), requestOptions)

    /** List all alphanumeric sender IDs for the authenticated user. */
    fun list(): CompletableFuture<AlphanumericSenderIdListPageAsync> =
        list(AlphanumericSenderIdListParams.none())

    /** @see list */
    fun list(
        params: AlphanumericSenderIdListParams = AlphanumericSenderIdListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AlphanumericSenderIdListPageAsync>

    /** @see list */
    fun list(
        params: AlphanumericSenderIdListParams = AlphanumericSenderIdListParams.none()
    ): CompletableFuture<AlphanumericSenderIdListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<AlphanumericSenderIdListPageAsync> =
        list(AlphanumericSenderIdListParams.none(), requestOptions)

    /** Delete an alphanumeric sender ID and disassociate it from its messaging profile. */
    fun delete(id: String): CompletableFuture<AlphanumericSenderIdDeleteResponse> =
        delete(id, AlphanumericSenderIdDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: AlphanumericSenderIdDeleteParams = AlphanumericSenderIdDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AlphanumericSenderIdDeleteResponse> =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: AlphanumericSenderIdDeleteParams = AlphanumericSenderIdDeleteParams.none(),
    ): CompletableFuture<AlphanumericSenderIdDeleteResponse> =
        delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: AlphanumericSenderIdDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AlphanumericSenderIdDeleteResponse>

    /** @see delete */
    fun delete(
        params: AlphanumericSenderIdDeleteParams
    ): CompletableFuture<AlphanumericSenderIdDeleteResponse> = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<AlphanumericSenderIdDeleteResponse> =
        delete(id, AlphanumericSenderIdDeleteParams.none(), requestOptions)

    /**
     * A view of [AlphanumericSenderIdServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AlphanumericSenderIdServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /alphanumeric_sender_ids`, but is otherwise the
         * same as [AlphanumericSenderIdServiceAsync.create].
         */
        fun create(
            params: AlphanumericSenderIdCreateParams
        ): CompletableFuture<HttpResponseFor<AlphanumericSenderIdCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: AlphanumericSenderIdCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AlphanumericSenderIdCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /alphanumeric_sender_ids/{id}`, but is otherwise the
         * same as [AlphanumericSenderIdServiceAsync.retrieve].
         */
        fun retrieve(
            id: String
        ): CompletableFuture<HttpResponseFor<AlphanumericSenderIdRetrieveResponse>> =
            retrieve(id, AlphanumericSenderIdRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: AlphanumericSenderIdRetrieveParams = AlphanumericSenderIdRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AlphanumericSenderIdRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: AlphanumericSenderIdRetrieveParams = AlphanumericSenderIdRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<AlphanumericSenderIdRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: AlphanumericSenderIdRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AlphanumericSenderIdRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: AlphanumericSenderIdRetrieveParams
        ): CompletableFuture<HttpResponseFor<AlphanumericSenderIdRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AlphanumericSenderIdRetrieveResponse>> =
            retrieve(id, AlphanumericSenderIdRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /alphanumeric_sender_ids`, but is otherwise the same
         * as [AlphanumericSenderIdServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<AlphanumericSenderIdListPageAsync>> =
            list(AlphanumericSenderIdListParams.none())

        /** @see list */
        fun list(
            params: AlphanumericSenderIdListParams = AlphanumericSenderIdListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AlphanumericSenderIdListPageAsync>>

        /** @see list */
        fun list(
            params: AlphanumericSenderIdListParams = AlphanumericSenderIdListParams.none()
        ): CompletableFuture<HttpResponseFor<AlphanumericSenderIdListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<AlphanumericSenderIdListPageAsync>> =
            list(AlphanumericSenderIdListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /alphanumeric_sender_ids/{id}`, but is otherwise
         * the same as [AlphanumericSenderIdServiceAsync.delete].
         */
        fun delete(
            id: String
        ): CompletableFuture<HttpResponseFor<AlphanumericSenderIdDeleteResponse>> =
            delete(id, AlphanumericSenderIdDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: AlphanumericSenderIdDeleteParams = AlphanumericSenderIdDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AlphanumericSenderIdDeleteResponse>> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: AlphanumericSenderIdDeleteParams = AlphanumericSenderIdDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<AlphanumericSenderIdDeleteResponse>> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: AlphanumericSenderIdDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AlphanumericSenderIdDeleteResponse>>

        /** @see delete */
        fun delete(
            params: AlphanumericSenderIdDeleteParams
        ): CompletableFuture<HttpResponseFor<AlphanumericSenderIdDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AlphanumericSenderIdDeleteResponse>> =
            delete(id, AlphanumericSenderIdDeleteParams.none(), requestOptions)
    }
}
