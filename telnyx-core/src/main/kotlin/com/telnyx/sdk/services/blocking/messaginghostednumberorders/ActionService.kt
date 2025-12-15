// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.messaginghostednumberorders

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.messaginghostednumberorders.actions.ActionUploadFileParams
import com.telnyx.sdk.models.messaginghostednumberorders.actions.ActionUploadFileResponse
import java.util.function.Consumer

interface ActionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ActionService

    /** Upload hosted number document */
    fun uploadFile(id: String): ActionUploadFileResponse =
        uploadFile(id, ActionUploadFileParams.none())

    /** @see uploadFile */
    fun uploadFile(
        id: String,
        params: ActionUploadFileParams = ActionUploadFileParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionUploadFileResponse = uploadFile(params.toBuilder().id(id).build(), requestOptions)

    /** @see uploadFile */
    fun uploadFile(
        id: String,
        params: ActionUploadFileParams = ActionUploadFileParams.none(),
    ): ActionUploadFileResponse = uploadFile(id, params, RequestOptions.none())

    /** @see uploadFile */
    fun uploadFile(
        params: ActionUploadFileParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionUploadFileResponse

    /** @see uploadFile */
    fun uploadFile(params: ActionUploadFileParams): ActionUploadFileResponse =
        uploadFile(params, RequestOptions.none())

    /** @see uploadFile */
    fun uploadFile(id: String, requestOptions: RequestOptions): ActionUploadFileResponse =
        uploadFile(id, ActionUploadFileParams.none(), requestOptions)

    /** A view of [ActionService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ActionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /messaging_hosted_number_orders/{id}/actions/file_upload`, but is otherwise the same as
         * [ActionService.uploadFile].
         */
        @MustBeClosed
        fun uploadFile(id: String): HttpResponseFor<ActionUploadFileResponse> =
            uploadFile(id, ActionUploadFileParams.none())

        /** @see uploadFile */
        @MustBeClosed
        fun uploadFile(
            id: String,
            params: ActionUploadFileParams = ActionUploadFileParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionUploadFileResponse> =
            uploadFile(params.toBuilder().id(id).build(), requestOptions)

        /** @see uploadFile */
        @MustBeClosed
        fun uploadFile(
            id: String,
            params: ActionUploadFileParams = ActionUploadFileParams.none(),
        ): HttpResponseFor<ActionUploadFileResponse> = uploadFile(id, params, RequestOptions.none())

        /** @see uploadFile */
        @MustBeClosed
        fun uploadFile(
            params: ActionUploadFileParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionUploadFileResponse>

        /** @see uploadFile */
        @MustBeClosed
        fun uploadFile(params: ActionUploadFileParams): HttpResponseFor<ActionUploadFileResponse> =
            uploadFile(params, RequestOptions.none())

        /** @see uploadFile */
        @MustBeClosed
        fun uploadFile(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ActionUploadFileResponse> =
            uploadFile(id, ActionUploadFileParams.none(), requestOptions)
    }
}
