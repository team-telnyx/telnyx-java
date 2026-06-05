// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.dir

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.dir.comments.CommentCreateParams
import com.telnyx.sdk.models.dir.comments.CommentCreateResponse
import com.telnyx.sdk.models.dir.comments.CommentListPageAsync
import com.telnyx.sdk.models.dir.comments.CommentListParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Read messages from the Telnyx vetting team and reply with clarifying information. */
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

    /**
     * Post a customer comment on a DIR (for example, to respond to reviewer notes). Send only
     * `content` (1–5000 chars) and an optional `parent_comment_id`; the server sets the comment
     * type, visibility, and author automatically. The enterprise is resolved server-side from the
     * DIR id.
     */
    fun create(
        dirId: String,
        params: CommentCreateParams,
    ): CompletableFuture<CommentCreateResponse> = create(dirId, params, RequestOptions.none())

    /** @see create */
    fun create(
        dirId: String,
        params: CommentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CommentCreateResponse> =
        create(params.toBuilder().dirId(dirId).build(), requestOptions)

    /** @see create */
    fun create(params: CommentCreateParams): CompletableFuture<CommentCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: CommentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CommentCreateResponse>

    /** List the comments on a DIR. The enterprise is resolved server-side from the DIR id. */
    fun list(dirId: String): CompletableFuture<CommentListPageAsync> =
        list(dirId, CommentListParams.none())

    /** @see list */
    fun list(
        dirId: String,
        params: CommentListParams = CommentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CommentListPageAsync> =
        list(params.toBuilder().dirId(dirId).build(), requestOptions)

    /** @see list */
    fun list(
        dirId: String,
        params: CommentListParams = CommentListParams.none(),
    ): CompletableFuture<CommentListPageAsync> = list(dirId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: CommentListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CommentListPageAsync>

    /** @see list */
    fun list(params: CommentListParams): CompletableFuture<CommentListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        dirId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CommentListPageAsync> =
        list(dirId, CommentListParams.none(), requestOptions)

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
         * Returns a raw HTTP response for `post /dir/{dir_id}/comments`, but is otherwise the same
         * as [CommentServiceAsync.create].
         */
        fun create(
            dirId: String,
            params: CommentCreateParams,
        ): CompletableFuture<HttpResponseFor<CommentCreateResponse>> =
            create(dirId, params, RequestOptions.none())

        /** @see create */
        fun create(
            dirId: String,
            params: CommentCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CommentCreateResponse>> =
            create(params.toBuilder().dirId(dirId).build(), requestOptions)

        /** @see create */
        fun create(
            params: CommentCreateParams
        ): CompletableFuture<HttpResponseFor<CommentCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: CommentCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CommentCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /dir/{dir_id}/comments`, but is otherwise the same
         * as [CommentServiceAsync.list].
         */
        fun list(dirId: String): CompletableFuture<HttpResponseFor<CommentListPageAsync>> =
            list(dirId, CommentListParams.none())

        /** @see list */
        fun list(
            dirId: String,
            params: CommentListParams = CommentListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CommentListPageAsync>> =
            list(params.toBuilder().dirId(dirId).build(), requestOptions)

        /** @see list */
        fun list(
            dirId: String,
            params: CommentListParams = CommentListParams.none(),
        ): CompletableFuture<HttpResponseFor<CommentListPageAsync>> =
            list(dirId, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: CommentListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CommentListPageAsync>>

        /** @see list */
        fun list(
            params: CommentListParams
        ): CompletableFuture<HttpResponseFor<CommentListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            dirId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CommentListPageAsync>> =
            list(dirId, CommentListParams.none(), requestOptions)
    }
}
