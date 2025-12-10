// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.documentlinks.DocumentLinkListPageAsync
import com.telnyx.sdk.models.documentlinks.DocumentLinkListParams
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
    fun list(): CompletableFuture<DocumentLinkListPageAsync> = list(DocumentLinkListParams.none())

    /** @see list */
    fun list(
        params: DocumentLinkListParams = DocumentLinkListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DocumentLinkListPageAsync>

    /** @see list */
    fun list(
        params: DocumentLinkListParams = DocumentLinkListParams.none()
    ): CompletableFuture<DocumentLinkListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<DocumentLinkListPageAsync> =
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
        fun list(): CompletableFuture<HttpResponseFor<DocumentLinkListPageAsync>> =
            list(DocumentLinkListParams.none())

        /** @see list */
        fun list(
            params: DocumentLinkListParams = DocumentLinkListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DocumentLinkListPageAsync>>

        /** @see list */
        fun list(
            params: DocumentLinkListParams = DocumentLinkListParams.none()
        ): CompletableFuture<HttpResponseFor<DocumentLinkListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<DocumentLinkListPageAsync>> =
            list(DocumentLinkListParams.none(), requestOptions)
    }
}
