// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.documentlinks.DocumentLinkListPage
import com.telnyx.sdk.models.documentlinks.DocumentLinkListParams
import java.util.function.Consumer

/** Documents */
interface DocumentLinkService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DocumentLinkService

    /** List all documents links ordered by created_at descending. */
    fun list(): DocumentLinkListPage = list(DocumentLinkListParams.none())

    /** @see list */
    fun list(
        params: DocumentLinkListParams = DocumentLinkListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DocumentLinkListPage

    /** @see list */
    fun list(params: DocumentLinkListParams = DocumentLinkListParams.none()): DocumentLinkListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): DocumentLinkListPage =
        list(DocumentLinkListParams.none(), requestOptions)

    /**
     * A view of [DocumentLinkService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DocumentLinkService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /document_links`, but is otherwise the same as
         * [DocumentLinkService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<DocumentLinkListPage> = list(DocumentLinkListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: DocumentLinkListParams = DocumentLinkListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DocumentLinkListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: DocumentLinkListParams = DocumentLinkListParams.none()
        ): HttpResponseFor<DocumentLinkListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<DocumentLinkListPage> =
            list(DocumentLinkListParams.none(), requestOptions)
    }
}
