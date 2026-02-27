// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.portingorders

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.portingorders.comments.CommentCreateParams
import com.telnyx.sdk.models.portingorders.comments.CommentCreateResponse
import com.telnyx.sdk.models.portingorders.comments.CommentListPage
import com.telnyx.sdk.models.portingorders.comments.CommentListParams
import java.util.function.Consumer

/** Endpoints related to porting orders management. */
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

    /** Creates a new comment for a porting order. */
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

    /** Returns a list of all comments of a porting order. */
    fun list(id: String): CommentListPage = list(id, CommentListParams.none())

    /** @see list */
    fun list(
        id: String,
        params: CommentListParams = CommentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CommentListPage = list(params.toBuilder().id(id).build(), requestOptions)

    /** @see list */
    fun list(id: String, params: CommentListParams = CommentListParams.none()): CommentListPage =
        list(id, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: CommentListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CommentListPage

    /** @see list */
    fun list(params: CommentListParams): CommentListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(id: String, requestOptions: RequestOptions): CommentListPage =
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
         * Returns a raw HTTP response for `post /porting_orders/{id}/comments`, but is otherwise
         * the same as [CommentService.create].
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
         * Returns a raw HTTP response for `get /porting_orders/{id}/comments`, but is otherwise the
         * same as [CommentService.list].
         */
        @MustBeClosed
        fun list(id: String): HttpResponseFor<CommentListPage> = list(id, CommentListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            id: String,
            params: CommentListParams = CommentListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CommentListPage> =
            list(params.toBuilder().id(id).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            id: String,
            params: CommentListParams = CommentListParams.none(),
        ): HttpResponseFor<CommentListPage> = list(id, params, RequestOptions.none())

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
        fun list(id: String, requestOptions: RequestOptions): HttpResponseFor<CommentListPage> =
            list(id, CommentListParams.none(), requestOptions)
    }
}
