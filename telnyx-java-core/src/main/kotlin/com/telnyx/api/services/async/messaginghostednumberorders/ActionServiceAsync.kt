// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async.messaginghostednumberorders

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.messaginghostednumberorders.actions.ActionUploadFileParams
import com.telnyx.api.models.messaginghostednumberorders.actions.ActionUploadFileResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ActionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ActionServiceAsync

    /** Upload file required for a messaging hosted number order */
    fun uploadFile(id: String): CompletableFuture<ActionUploadFileResponse> =
        uploadFile(id, ActionUploadFileParams.none())

    /** @see uploadFile */
    fun uploadFile(
        id: String,
        params: ActionUploadFileParams = ActionUploadFileParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionUploadFileResponse> =
        uploadFile(params.toBuilder().id(id).build(), requestOptions)

    /** @see uploadFile */
    fun uploadFile(
        id: String,
        params: ActionUploadFileParams = ActionUploadFileParams.none(),
    ): CompletableFuture<ActionUploadFileResponse> = uploadFile(id, params, RequestOptions.none())

    /** @see uploadFile */
    fun uploadFile(
        params: ActionUploadFileParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionUploadFileResponse>

    /** @see uploadFile */
    fun uploadFile(params: ActionUploadFileParams): CompletableFuture<ActionUploadFileResponse> =
        uploadFile(params, RequestOptions.none())

    /** @see uploadFile */
    fun uploadFile(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ActionUploadFileResponse> =
        uploadFile(id, ActionUploadFileParams.none(), requestOptions)

    /**
     * A view of [ActionServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ActionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /messaging_hosted_number_orders/{id}/actions/file_upload`, but is otherwise the same as
         * [ActionServiceAsync.uploadFile].
         */
        fun uploadFile(id: String): CompletableFuture<HttpResponseFor<ActionUploadFileResponse>> =
            uploadFile(id, ActionUploadFileParams.none())

        /** @see uploadFile */
        fun uploadFile(
            id: String,
            params: ActionUploadFileParams = ActionUploadFileParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionUploadFileResponse>> =
            uploadFile(params.toBuilder().id(id).build(), requestOptions)

        /** @see uploadFile */
        fun uploadFile(
            id: String,
            params: ActionUploadFileParams = ActionUploadFileParams.none(),
        ): CompletableFuture<HttpResponseFor<ActionUploadFileResponse>> =
            uploadFile(id, params, RequestOptions.none())

        /** @see uploadFile */
        fun uploadFile(
            params: ActionUploadFileParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionUploadFileResponse>>

        /** @see uploadFile */
        fun uploadFile(
            params: ActionUploadFileParams
        ): CompletableFuture<HttpResponseFor<ActionUploadFileResponse>> =
            uploadFile(params, RequestOptions.none())

        /** @see uploadFile */
        fun uploadFile(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ActionUploadFileResponse>> =
            uploadFile(id, ActionUploadFileParams.none(), requestOptions)
    }
}
