// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.comments.CommentCreateParams
import com.telnyx.api.models.comments.CommentCreateResponse
import com.telnyx.api.models.comments.CommentListParams
import com.telnyx.api.models.comments.CommentListResponse
import com.telnyx.api.models.comments.CommentMarkAsReadParams
import com.telnyx.api.models.comments.CommentMarkAsReadResponse
import com.telnyx.api.models.comments.CommentRetrieveParams
import com.telnyx.api.models.comments.CommentRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface CommentServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CommentServiceAsync

    /** Create a comment */
    fun create(): CompletableFuture<CommentCreateResponse> = create(CommentCreateParams.none())

    /** @see create */
    fun create(
        params: CommentCreateParams = CommentCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CommentCreateResponse>

    /** @see create */
    fun create(
        params: CommentCreateParams = CommentCreateParams.none()
    ): CompletableFuture<CommentCreateResponse> = create(params, RequestOptions.none())

    /** @see create */
    fun create(requestOptions: RequestOptions): CompletableFuture<CommentCreateResponse> =
        create(CommentCreateParams.none(), requestOptions)

    /** Retrieve a comment */
    fun retrieve(id: String): CompletableFuture<CommentRetrieveResponse> =
        retrieve(id, CommentRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: CommentRetrieveParams = CommentRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CommentRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: CommentRetrieveParams = CommentRetrieveParams.none(),
    ): CompletableFuture<CommentRetrieveResponse> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: CommentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CommentRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: CommentRetrieveParams): CompletableFuture<CommentRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CommentRetrieveResponse> =
        retrieve(id, CommentRetrieveParams.none(), requestOptions)

    /** Retrieve all comments */
    fun list(): CompletableFuture<CommentListResponse> = list(CommentListParams.none())

    /** @see list */
    fun list(
        params: CommentListParams = CommentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CommentListResponse>

    /** @see list */
    fun list(
        params: CommentListParams = CommentListParams.none()
    ): CompletableFuture<CommentListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<CommentListResponse> =
        list(CommentListParams.none(), requestOptions)

    /** Mark a comment as read */
    fun markAsRead(id: String): CompletableFuture<CommentMarkAsReadResponse> =
        markAsRead(id, CommentMarkAsReadParams.none())

    /** @see markAsRead */
    fun markAsRead(
        id: String,
        params: CommentMarkAsReadParams = CommentMarkAsReadParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CommentMarkAsReadResponse> =
        markAsRead(params.toBuilder().id(id).build(), requestOptions)

    /** @see markAsRead */
    fun markAsRead(
        id: String,
        params: CommentMarkAsReadParams = CommentMarkAsReadParams.none(),
    ): CompletableFuture<CommentMarkAsReadResponse> = markAsRead(id, params, RequestOptions.none())

    /** @see markAsRead */
    fun markAsRead(
        params: CommentMarkAsReadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CommentMarkAsReadResponse>

    /** @see markAsRead */
    fun markAsRead(params: CommentMarkAsReadParams): CompletableFuture<CommentMarkAsReadResponse> =
        markAsRead(params, RequestOptions.none())

    /** @see markAsRead */
    fun markAsRead(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CommentMarkAsReadResponse> =
        markAsRead(id, CommentMarkAsReadParams.none(), requestOptions)

    /**
     * A view of [CommentServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CommentServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /comments`, but is otherwise the same as
         * [CommentServiceAsync.create].
         */
        fun create(): CompletableFuture<HttpResponseFor<CommentCreateResponse>> =
            create(CommentCreateParams.none())

        /** @see create */
        fun create(
            params: CommentCreateParams = CommentCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CommentCreateResponse>>

        /** @see create */
        fun create(
            params: CommentCreateParams = CommentCreateParams.none()
        ): CompletableFuture<HttpResponseFor<CommentCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CommentCreateResponse>> =
            create(CommentCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /comments/{id}`, but is otherwise the same as
         * [CommentServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<CommentRetrieveResponse>> =
            retrieve(id, CommentRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: CommentRetrieveParams = CommentRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CommentRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: CommentRetrieveParams = CommentRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<CommentRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: CommentRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CommentRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: CommentRetrieveParams
        ): CompletableFuture<HttpResponseFor<CommentRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CommentRetrieveResponse>> =
            retrieve(id, CommentRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /comments`, but is otherwise the same as
         * [CommentServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<CommentListResponse>> =
            list(CommentListParams.none())

        /** @see list */
        fun list(
            params: CommentListParams = CommentListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CommentListResponse>>

        /** @see list */
        fun list(
            params: CommentListParams = CommentListParams.none()
        ): CompletableFuture<HttpResponseFor<CommentListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CommentListResponse>> =
            list(CommentListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /comments/{id}/read`, but is otherwise the same as
         * [CommentServiceAsync.markAsRead].
         */
        fun markAsRead(id: String): CompletableFuture<HttpResponseFor<CommentMarkAsReadResponse>> =
            markAsRead(id, CommentMarkAsReadParams.none())

        /** @see markAsRead */
        fun markAsRead(
            id: String,
            params: CommentMarkAsReadParams = CommentMarkAsReadParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CommentMarkAsReadResponse>> =
            markAsRead(params.toBuilder().id(id).build(), requestOptions)

        /** @see markAsRead */
        fun markAsRead(
            id: String,
            params: CommentMarkAsReadParams = CommentMarkAsReadParams.none(),
        ): CompletableFuture<HttpResponseFor<CommentMarkAsReadResponse>> =
            markAsRead(id, params, RequestOptions.none())

        /** @see markAsRead */
        fun markAsRead(
            params: CommentMarkAsReadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CommentMarkAsReadResponse>>

        /** @see markAsRead */
        fun markAsRead(
            params: CommentMarkAsReadParams
        ): CompletableFuture<HttpResponseFor<CommentMarkAsReadResponse>> =
            markAsRead(params, RequestOptions.none())

        /** @see markAsRead */
        fun markAsRead(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CommentMarkAsReadResponse>> =
            markAsRead(id, CommentMarkAsReadParams.none(), requestOptions)
    }
}
