// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.comments.CommentCreateParams
import com.telnyx.sdk.models.comments.CommentCreateResponse
import com.telnyx.sdk.models.comments.CommentListParams
import com.telnyx.sdk.models.comments.CommentListResponse
import com.telnyx.sdk.models.comments.CommentMarkAsReadParams
import com.telnyx.sdk.models.comments.CommentMarkAsReadResponse
import com.telnyx.sdk.models.comments.CommentRetrieveParams
import com.telnyx.sdk.models.comments.CommentRetrieveResponse
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

    /** Create a comment */
    fun create(): CommentCreateResponse = create(CommentCreateParams.none())

    /** @see create */
    fun create(
        params: CommentCreateParams = CommentCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CommentCreateResponse

    /** @see create */
    fun create(params: CommentCreateParams = CommentCreateParams.none()): CommentCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(requestOptions: RequestOptions): CommentCreateResponse =
        create(CommentCreateParams.none(), requestOptions)

    /** Retrieve a comment */
    fun retrieve(id: String): CommentRetrieveResponse = retrieve(id, CommentRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: CommentRetrieveParams = CommentRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CommentRetrieveResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: CommentRetrieveParams = CommentRetrieveParams.none(),
    ): CommentRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: CommentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CommentRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: CommentRetrieveParams): CommentRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): CommentRetrieveResponse =
        retrieve(id, CommentRetrieveParams.none(), requestOptions)

    /** Retrieve all comments */
    fun list(): CommentListResponse = list(CommentListParams.none())

    /** @see list */
    fun list(
        params: CommentListParams = CommentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CommentListResponse

    /** @see list */
    fun list(params: CommentListParams = CommentListParams.none()): CommentListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CommentListResponse =
        list(CommentListParams.none(), requestOptions)

    /** Mark a comment as read */
    fun markAsRead(id: String): CommentMarkAsReadResponse =
        markAsRead(id, CommentMarkAsReadParams.none())

    /** @see markAsRead */
    fun markAsRead(
        id: String,
        params: CommentMarkAsReadParams = CommentMarkAsReadParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CommentMarkAsReadResponse = markAsRead(params.toBuilder().id(id).build(), requestOptions)

    /** @see markAsRead */
    fun markAsRead(
        id: String,
        params: CommentMarkAsReadParams = CommentMarkAsReadParams.none(),
    ): CommentMarkAsReadResponse = markAsRead(id, params, RequestOptions.none())

    /** @see markAsRead */
    fun markAsRead(
        params: CommentMarkAsReadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CommentMarkAsReadResponse

    /** @see markAsRead */
    fun markAsRead(params: CommentMarkAsReadParams): CommentMarkAsReadResponse =
        markAsRead(params, RequestOptions.none())

    /** @see markAsRead */
    fun markAsRead(id: String, requestOptions: RequestOptions): CommentMarkAsReadResponse =
        markAsRead(id, CommentMarkAsReadParams.none(), requestOptions)

    /** A view of [CommentService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): CommentService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /comments`, but is otherwise the same as
         * [CommentService.create].
         */
        @MustBeClosed
        fun create(): HttpResponseFor<CommentCreateResponse> = create(CommentCreateParams.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: CommentCreateParams = CommentCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CommentCreateResponse>

        /** @see create */
        @MustBeClosed
        fun create(
            params: CommentCreateParams = CommentCreateParams.none()
        ): HttpResponseFor<CommentCreateResponse> = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(requestOptions: RequestOptions): HttpResponseFor<CommentCreateResponse> =
            create(CommentCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /comments/{id}`, but is otherwise the same as
         * [CommentService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<CommentRetrieveResponse> =
            retrieve(id, CommentRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: CommentRetrieveParams = CommentRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CommentRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: CommentRetrieveParams = CommentRetrieveParams.none(),
        ): HttpResponseFor<CommentRetrieveResponse> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: CommentRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CommentRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: CommentRetrieveParams): HttpResponseFor<CommentRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CommentRetrieveResponse> =
            retrieve(id, CommentRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /comments`, but is otherwise the same as
         * [CommentService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<CommentListResponse> = list(CommentListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: CommentListParams = CommentListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CommentListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: CommentListParams = CommentListParams.none()
        ): HttpResponseFor<CommentListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<CommentListResponse> =
            list(CommentListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /comments/{id}/read`, but is otherwise the same as
         * [CommentService.markAsRead].
         */
        @MustBeClosed
        fun markAsRead(id: String): HttpResponseFor<CommentMarkAsReadResponse> =
            markAsRead(id, CommentMarkAsReadParams.none())

        /** @see markAsRead */
        @MustBeClosed
        fun markAsRead(
            id: String,
            params: CommentMarkAsReadParams = CommentMarkAsReadParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CommentMarkAsReadResponse> =
            markAsRead(params.toBuilder().id(id).build(), requestOptions)

        /** @see markAsRead */
        @MustBeClosed
        fun markAsRead(
            id: String,
            params: CommentMarkAsReadParams = CommentMarkAsReadParams.none(),
        ): HttpResponseFor<CommentMarkAsReadResponse> =
            markAsRead(id, params, RequestOptions.none())

        /** @see markAsRead */
        @MustBeClosed
        fun markAsRead(
            params: CommentMarkAsReadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CommentMarkAsReadResponse>

        /** @see markAsRead */
        @MustBeClosed
        fun markAsRead(
            params: CommentMarkAsReadParams
        ): HttpResponseFor<CommentMarkAsReadResponse> = markAsRead(params, RequestOptions.none())

        /** @see markAsRead */
        @MustBeClosed
        fun markAsRead(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CommentMarkAsReadResponse> =
            markAsRead(id, CommentMarkAsReadParams.none(), requestOptions)
    }
}
