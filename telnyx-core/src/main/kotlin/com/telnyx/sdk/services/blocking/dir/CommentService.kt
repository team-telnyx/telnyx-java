// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.dir

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.dir.comments.CommentCreateParams
import com.telnyx.sdk.models.dir.comments.CommentCreateResponse
import com.telnyx.sdk.models.dir.comments.CommentListPage
import com.telnyx.sdk.models.dir.comments.CommentListParams
import java.util.function.Consumer

/** Read messages from the Telnyx vetting team and reply with clarifying information. */
interface CommentService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CommentService

    /**
     * Post a customer comment on a DIR (for example, to respond to reviewer notes). Send only
     * `content` (1–5000 chars) and an optional `parent_comment_id`; the server sets the comment
     * type, visibility, and author automatically. The enterprise is resolved server-side from the
     * DIR id.
     */
    fun create(dirId: String, params: CommentCreateParams): CommentCreateResponse =
        create(dirId, params, RequestOptions.none())

    /** @see create */
    fun create(
        dirId: String,
        params: CommentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CommentCreateResponse = create(params.toBuilder().dirId(dirId).build(), requestOptions)

    /** @see create */
    fun create(params: CommentCreateParams): CommentCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: CommentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CommentCreateResponse

    /** List the comments on a DIR. The enterprise is resolved server-side from the DIR id. */
    fun list(dirId: String): CommentListPage = list(dirId, CommentListParams.none())

    /** @see list */
    fun list(
        dirId: String,
        params: CommentListParams = CommentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CommentListPage = list(params.toBuilder().dirId(dirId).build(), requestOptions)

    /** @see list */
    fun list(dirId: String, params: CommentListParams = CommentListParams.none()): CommentListPage =
        list(dirId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: CommentListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CommentListPage

    /** @see list */
    fun list(params: CommentListParams): CommentListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(dirId: String, requestOptions: RequestOptions): CommentListPage =
        list(dirId, CommentListParams.none(), requestOptions)

    /** A view of [CommentService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): CommentService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /dir/{dir_id}/comments`, but is otherwise the same
         * as [CommentService.create].
         */
        @MustBeClosed
        fun create(
            dirId: String,
            params: CommentCreateParams,
        ): HttpResponseFor<CommentCreateResponse> = create(dirId, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            dirId: String,
            params: CommentCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CommentCreateResponse> =
            create(params.toBuilder().dirId(dirId).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(params: CommentCreateParams): HttpResponseFor<CommentCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: CommentCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CommentCreateResponse>

        /**
         * Returns a raw HTTP response for `get /dir/{dir_id}/comments`, but is otherwise the same
         * as [CommentService.list].
         */
        @MustBeClosed
        fun list(dirId: String): HttpResponseFor<CommentListPage> =
            list(dirId, CommentListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            dirId: String,
            params: CommentListParams = CommentListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CommentListPage> =
            list(params.toBuilder().dirId(dirId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            dirId: String,
            params: CommentListParams = CommentListParams.none(),
        ): HttpResponseFor<CommentListPage> = list(dirId, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: CommentListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CommentListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: CommentListParams): HttpResponseFor<CommentListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(dirId: String, requestOptions: RequestOptions): HttpResponseFor<CommentListPage> =
            list(dirId, CommentListParams.none(), requestOptions)
    }
}
