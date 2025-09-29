// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking.portouts

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.portouts.comments.CommentCreateParams
import com.telnyx.api.models.portouts.comments.CommentCreateResponse
import com.telnyx.api.models.portouts.comments.CommentListParams
import com.telnyx.api.models.portouts.comments.CommentListResponse
import java.util.function.Consumer

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

    /** Creates a comment on a portout request. */
    fun create(id: String): CommentCreateResponse = create(id, CommentCreateParams.none())

    /** @see create */
    fun create(
        id: String,
        params: CommentCreateParams = CommentCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CommentCreateResponse = create(params.toBuilder().id(id).build(), requestOptions)

    /** @see create */
    fun create(
        id: String,
        params: CommentCreateParams = CommentCreateParams.none(),
    ): CommentCreateResponse = create(id, params, RequestOptions.none())

    /** @see create */
    fun create(
        params: CommentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CommentCreateResponse

    /** @see create */
    fun create(params: CommentCreateParams): CommentCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(id: String, requestOptions: RequestOptions): CommentCreateResponse =
        create(id, CommentCreateParams.none(), requestOptions)

    /** Returns a list of comments for a portout request. */
    fun list(id: String): CommentListResponse = list(id, CommentListParams.none())

    /** @see list */
    fun list(
        id: String,
        params: CommentListParams = CommentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CommentListResponse = list(params.toBuilder().id(id).build(), requestOptions)

    /** @see list */
    fun list(
        id: String,
        params: CommentListParams = CommentListParams.none(),
    ): CommentListResponse = list(id, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: CommentListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CommentListResponse

    /** @see list */
    fun list(params: CommentListParams): CommentListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(id: String, requestOptions: RequestOptions): CommentListResponse =
        list(id, CommentListParams.none(), requestOptions)

    /** A view of [CommentService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): CommentService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /portouts/{id}/comments`, but is otherwise the same
         * as [CommentService.create].
         */
        @MustBeClosed
        fun create(id: String): HttpResponseFor<CommentCreateResponse> =
            create(id, CommentCreateParams.none())

        /** @see create */
        @MustBeClosed
        fun create(
            id: String,
            params: CommentCreateParams = CommentCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CommentCreateResponse> =
            create(params.toBuilder().id(id).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(
            id: String,
            params: CommentCreateParams = CommentCreateParams.none(),
        ): HttpResponseFor<CommentCreateResponse> = create(id, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: CommentCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CommentCreateResponse>

        /** @see create */
        @MustBeClosed
        fun create(params: CommentCreateParams): HttpResponseFor<CommentCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CommentCreateResponse> =
            create(id, CommentCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /portouts/{id}/comments`, but is otherwise the same
         * as [CommentService.list].
         */
        @MustBeClosed
        fun list(id: String): HttpResponseFor<CommentListResponse> =
            list(id, CommentListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            id: String,
            params: CommentListParams = CommentListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CommentListResponse> =
            list(params.toBuilder().id(id).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            id: String,
            params: CommentListParams = CommentListParams.none(),
        ): HttpResponseFor<CommentListResponse> = list(id, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: CommentListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CommentListResponse>

        /** @see list */
        @MustBeClosed
        fun list(params: CommentListParams): HttpResponseFor<CommentListResponse> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(id: String, requestOptions: RequestOptions): HttpResponseFor<CommentListResponse> =
            list(id, CommentListParams.none(), requestOptions)
    }
}
