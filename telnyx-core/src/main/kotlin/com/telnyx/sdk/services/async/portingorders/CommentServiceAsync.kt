// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.portingorders

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.portingorders.comments.CommentCreateParams
import com.telnyx.sdk.models.portingorders.comments.CommentCreateResponse
import com.telnyx.sdk.models.portingorders.comments.CommentListPageAsync
import com.telnyx.sdk.models.portingorders.comments.CommentListParams
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

    /** Creates a new comment for a porting order. */
    fun create(id: String): CompletableFuture<CommentCreateResponse> =
        create(id, CommentCreateParams.none())

    /** @see create */
    fun create(
        id: String,
        params: CommentCreateParams = CommentCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CommentCreateResponse> =
        create(params.toBuilder().id(id).build(), requestOptions)

    /** @see create */
    fun create(
        id: String,
        params: CommentCreateParams = CommentCreateParams.none(),
    ): CompletableFuture<CommentCreateResponse> = create(id, params, RequestOptions.none())

    /** @see create */
    fun create(
        params: CommentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CommentCreateResponse>

    /** @see create */
    fun create(params: CommentCreateParams): CompletableFuture<CommentCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CommentCreateResponse> =
        create(id, CommentCreateParams.none(), requestOptions)

    /** Returns a list of all comments of a porting order. */
    fun list(id: String): CompletableFuture<CommentListPageAsync> =
        list(id, CommentListParams.none())

    /** @see list */
    fun list(
        id: String,
        params: CommentListParams = CommentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CommentListPageAsync> =
        list(params.toBuilder().id(id).build(), requestOptions)

    /** @see list */
    fun list(
        id: String,
        params: CommentListParams = CommentListParams.none(),
    ): CompletableFuture<CommentListPageAsync> = list(id, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: CommentListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CommentListPageAsync>

    /** @see list */
    fun list(params: CommentListParams): CompletableFuture<CommentListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(id: String, requestOptions: RequestOptions): CompletableFuture<CommentListPageAsync> =
        list(id, CommentListParams.none(), requestOptions)

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
         * Returns a raw HTTP response for `post /porting_orders/{id}/comments`, but is otherwise
         * the same as [CommentServiceAsync.create].
         */
        fun create(id: String): CompletableFuture<HttpResponseFor<CommentCreateResponse>> =
            create(id, CommentCreateParams.none())

        /** @see create */
        fun create(
            id: String,
            params: CommentCreateParams = CommentCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CommentCreateResponse>> =
            create(params.toBuilder().id(id).build(), requestOptions)

        /** @see create */
        fun create(
            id: String,
            params: CommentCreateParams = CommentCreateParams.none(),
        ): CompletableFuture<HttpResponseFor<CommentCreateResponse>> =
            create(id, params, RequestOptions.none())

        /** @see create */
        fun create(
            params: CommentCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CommentCreateResponse>>

        /** @see create */
        fun create(
            params: CommentCreateParams
        ): CompletableFuture<HttpResponseFor<CommentCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CommentCreateResponse>> =
            create(id, CommentCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /porting_orders/{id}/comments`, but is otherwise the
         * same as [CommentServiceAsync.list].
         */
        fun list(id: String): CompletableFuture<HttpResponseFor<CommentListPageAsync>> =
            list(id, CommentListParams.none())

        /** @see list */
        fun list(
            id: String,
            params: CommentListParams = CommentListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CommentListPageAsync>> =
            list(params.toBuilder().id(id).build(), requestOptions)

        /** @see list */
        fun list(
            id: String,
            params: CommentListParams = CommentListParams.none(),
        ): CompletableFuture<HttpResponseFor<CommentListPageAsync>> =
            list(id, params, RequestOptions.none())

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
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CommentListPageAsync>> =
            list(id, CommentListParams.none(), requestOptions)
    }
}
