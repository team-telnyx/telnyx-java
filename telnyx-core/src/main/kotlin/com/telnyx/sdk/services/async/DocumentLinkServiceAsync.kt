// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.documentlinks.DocumentLinkListParams
import com.telnyx.sdk.models.documentlinks.DocumentLinkListResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface DocumentLinkServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DocumentLinkServiceAsync

    /** List all documents links ordered by created_at descending. */
    fun list(): CompletableFuture<DocumentLinkListResponse> = list(DocumentLinkListParams.none())

    /** @see list */
    fun list(
        params: DocumentLinkListParams = DocumentLinkListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DocumentLinkListResponse>

    /** @see list */
    fun list(
        params: DocumentLinkListParams = DocumentLinkListParams.none()
    ): CompletableFuture<DocumentLinkListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<DocumentLinkListResponse> =
        list(DocumentLinkListParams.none(), requestOptions)

    /**
     * A view of [DocumentLinkServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DocumentLinkServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /document_links`, but is otherwise the same as
         * [DocumentLinkServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<DocumentLinkListResponse>> =
            list(DocumentLinkListParams.none())

        /** @see list */
        fun list(
            params: DocumentLinkListParams = DocumentLinkListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DocumentLinkListResponse>>

        /** @see list */
        fun list(
            params: DocumentLinkListParams = DocumentLinkListParams.none()
        ): CompletableFuture<HttpResponseFor<DocumentLinkListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<DocumentLinkListResponse>> =
            list(DocumentLinkListParams.none(), requestOptions)
    }
}
