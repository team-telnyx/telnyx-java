// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponse
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.documents.DocumentDeleteParams
import com.telnyx.api.models.documents.DocumentDeleteResponse
import com.telnyx.api.models.documents.DocumentDownloadParams
import com.telnyx.api.models.documents.DocumentGenerateDownloadLinkParams
import com.telnyx.api.models.documents.DocumentGenerateDownloadLinkResponse
import com.telnyx.api.models.documents.DocumentListParams
import com.telnyx.api.models.documents.DocumentListResponse
import com.telnyx.api.models.documents.DocumentRetrieveParams
import com.telnyx.api.models.documents.DocumentRetrieveResponse
import com.telnyx.api.models.documents.DocumentUpdateParams
import com.telnyx.api.models.documents.DocumentUpdateResponse
import com.telnyx.api.models.documents.DocumentUploadParams
import com.telnyx.api.models.documents.DocumentUploadResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface DocumentServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DocumentServiceAsync

    /** Retrieve a document. */
    fun retrieve(id: String): CompletableFuture<DocumentRetrieveResponse> =
        retrieve(id, DocumentRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: DocumentRetrieveParams = DocumentRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DocumentRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: DocumentRetrieveParams = DocumentRetrieveParams.none(),
    ): CompletableFuture<DocumentRetrieveResponse> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: DocumentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DocumentRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: DocumentRetrieveParams): CompletableFuture<DocumentRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<DocumentRetrieveResponse> =
        retrieve(id, DocumentRetrieveParams.none(), requestOptions)

    /** Update a document. */
    fun update(
        pathId: String,
        params: DocumentUpdateParams,
    ): CompletableFuture<DocumentUpdateResponse> = update(pathId, params, RequestOptions.none())

    /** @see update */
    fun update(
        pathId: String,
        params: DocumentUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DocumentUpdateResponse> =
        update(params.toBuilder().pathId(pathId).build(), requestOptions)

    /** @see update */
    fun update(params: DocumentUpdateParams): CompletableFuture<DocumentUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: DocumentUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DocumentUpdateResponse>

    /** List all documents ordered by created_at descending. */
    fun list(): CompletableFuture<DocumentListResponse> = list(DocumentListParams.none())

    /** @see list */
    fun list(
        params: DocumentListParams = DocumentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DocumentListResponse>

    /** @see list */
    fun list(
        params: DocumentListParams = DocumentListParams.none()
    ): CompletableFuture<DocumentListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<DocumentListResponse> =
        list(DocumentListParams.none(), requestOptions)

    /**
     * Delete a document.<br /><br />A document can only be deleted if it's not linked to a service.
     * If it is linked to a service, it must be unlinked prior to deleting.
     */
    fun delete(id: String): CompletableFuture<DocumentDeleteResponse> =
        delete(id, DocumentDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: DocumentDeleteParams = DocumentDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DocumentDeleteResponse> =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: DocumentDeleteParams = DocumentDeleteParams.none(),
    ): CompletableFuture<DocumentDeleteResponse> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: DocumentDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DocumentDeleteResponse>

    /** @see delete */
    fun delete(params: DocumentDeleteParams): CompletableFuture<DocumentDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<DocumentDeleteResponse> =
        delete(id, DocumentDeleteParams.none(), requestOptions)

    /** Download a document. */
    fun download(id: String): CompletableFuture<HttpResponse> =
        download(id, DocumentDownloadParams.none())

    /** @see download */
    fun download(
        id: String,
        params: DocumentDownloadParams = DocumentDownloadParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse> = download(params.toBuilder().id(id).build(), requestOptions)

    /** @see download */
    fun download(
        id: String,
        params: DocumentDownloadParams = DocumentDownloadParams.none(),
    ): CompletableFuture<HttpResponse> = download(id, params, RequestOptions.none())

    /** @see download */
    fun download(
        params: DocumentDownloadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /** @see download */
    fun download(params: DocumentDownloadParams): CompletableFuture<HttpResponse> =
        download(params, RequestOptions.none())

    /** @see download */
    fun download(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
        download(id, DocumentDownloadParams.none(), requestOptions)

    /**
     * Generates a temporary pre-signed URL that can be used to download the document directly from
     * the storage backend without authentication.
     */
    fun generateDownloadLink(id: String): CompletableFuture<DocumentGenerateDownloadLinkResponse> =
        generateDownloadLink(id, DocumentGenerateDownloadLinkParams.none())

    /** @see generateDownloadLink */
    fun generateDownloadLink(
        id: String,
        params: DocumentGenerateDownloadLinkParams = DocumentGenerateDownloadLinkParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DocumentGenerateDownloadLinkResponse> =
        generateDownloadLink(params.toBuilder().id(id).build(), requestOptions)

    /** @see generateDownloadLink */
    fun generateDownloadLink(
        id: String,
        params: DocumentGenerateDownloadLinkParams = DocumentGenerateDownloadLinkParams.none(),
    ): CompletableFuture<DocumentGenerateDownloadLinkResponse> =
        generateDownloadLink(id, params, RequestOptions.none())

    /** @see generateDownloadLink */
    fun generateDownloadLink(
        params: DocumentGenerateDownloadLinkParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DocumentGenerateDownloadLinkResponse>

    /** @see generateDownloadLink */
    fun generateDownloadLink(
        params: DocumentGenerateDownloadLinkParams
    ): CompletableFuture<DocumentGenerateDownloadLinkResponse> =
        generateDownloadLink(params, RequestOptions.none())

    /** @see generateDownloadLink */
    fun generateDownloadLink(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<DocumentGenerateDownloadLinkResponse> =
        generateDownloadLink(id, DocumentGenerateDownloadLinkParams.none(), requestOptions)

    /**
     * Upload a document.<br /><br />Uploaded files must be linked to a service within 30 minutes or
     * they will be automatically deleted.
     */
    fun upload(params: DocumentUploadParams): CompletableFuture<DocumentUploadResponse> =
        upload(params, RequestOptions.none())

    /** @see upload */
    fun upload(
        params: DocumentUploadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DocumentUploadResponse>

    /**
     * A view of [DocumentServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DocumentServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /documents/{id}`, but is otherwise the same as
         * [DocumentServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<DocumentRetrieveResponse>> =
            retrieve(id, DocumentRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: DocumentRetrieveParams = DocumentRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DocumentRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: DocumentRetrieveParams = DocumentRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<DocumentRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: DocumentRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DocumentRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: DocumentRetrieveParams
        ): CompletableFuture<HttpResponseFor<DocumentRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DocumentRetrieveResponse>> =
            retrieve(id, DocumentRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /documents/{id}`, but is otherwise the same as
         * [DocumentServiceAsync.update].
         */
        fun update(
            pathId: String,
            params: DocumentUpdateParams,
        ): CompletableFuture<HttpResponseFor<DocumentUpdateResponse>> =
            update(pathId, params, RequestOptions.none())

        /** @see update */
        fun update(
            pathId: String,
            params: DocumentUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DocumentUpdateResponse>> =
            update(params.toBuilder().pathId(pathId).build(), requestOptions)

        /** @see update */
        fun update(
            params: DocumentUpdateParams
        ): CompletableFuture<HttpResponseFor<DocumentUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: DocumentUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DocumentUpdateResponse>>

        /**
         * Returns a raw HTTP response for `get /documents`, but is otherwise the same as
         * [DocumentServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<DocumentListResponse>> =
            list(DocumentListParams.none())

        /** @see list */
        fun list(
            params: DocumentListParams = DocumentListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DocumentListResponse>>

        /** @see list */
        fun list(
            params: DocumentListParams = DocumentListParams.none()
        ): CompletableFuture<HttpResponseFor<DocumentListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<DocumentListResponse>> =
            list(DocumentListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /documents/{id}`, but is otherwise the same as
         * [DocumentServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponseFor<DocumentDeleteResponse>> =
            delete(id, DocumentDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: DocumentDeleteParams = DocumentDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DocumentDeleteResponse>> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: DocumentDeleteParams = DocumentDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<DocumentDeleteResponse>> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: DocumentDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DocumentDeleteResponse>>

        /** @see delete */
        fun delete(
            params: DocumentDeleteParams
        ): CompletableFuture<HttpResponseFor<DocumentDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DocumentDeleteResponse>> =
            delete(id, DocumentDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /documents/{id}/download`, but is otherwise the same
         * as [DocumentServiceAsync.download].
         */
        fun download(id: String): CompletableFuture<HttpResponse> =
            download(id, DocumentDownloadParams.none())

        /** @see download */
        fun download(
            id: String,
            params: DocumentDownloadParams = DocumentDownloadParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            download(params.toBuilder().id(id).build(), requestOptions)

        /** @see download */
        fun download(
            id: String,
            params: DocumentDownloadParams = DocumentDownloadParams.none(),
        ): CompletableFuture<HttpResponse> = download(id, params, RequestOptions.none())

        /** @see download */
        fun download(
            params: DocumentDownloadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see download */
        fun download(params: DocumentDownloadParams): CompletableFuture<HttpResponse> =
            download(params, RequestOptions.none())

        /** @see download */
        fun download(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            download(id, DocumentDownloadParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /documents/{id}/download_link`, but is otherwise the
         * same as [DocumentServiceAsync.generateDownloadLink].
         */
        fun generateDownloadLink(
            id: String
        ): CompletableFuture<HttpResponseFor<DocumentGenerateDownloadLinkResponse>> =
            generateDownloadLink(id, DocumentGenerateDownloadLinkParams.none())

        /** @see generateDownloadLink */
        fun generateDownloadLink(
            id: String,
            params: DocumentGenerateDownloadLinkParams = DocumentGenerateDownloadLinkParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DocumentGenerateDownloadLinkResponse>> =
            generateDownloadLink(params.toBuilder().id(id).build(), requestOptions)

        /** @see generateDownloadLink */
        fun generateDownloadLink(
            id: String,
            params: DocumentGenerateDownloadLinkParams = DocumentGenerateDownloadLinkParams.none(),
        ): CompletableFuture<HttpResponseFor<DocumentGenerateDownloadLinkResponse>> =
            generateDownloadLink(id, params, RequestOptions.none())

        /** @see generateDownloadLink */
        fun generateDownloadLink(
            params: DocumentGenerateDownloadLinkParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DocumentGenerateDownloadLinkResponse>>

        /** @see generateDownloadLink */
        fun generateDownloadLink(
            params: DocumentGenerateDownloadLinkParams
        ): CompletableFuture<HttpResponseFor<DocumentGenerateDownloadLinkResponse>> =
            generateDownloadLink(params, RequestOptions.none())

        /** @see generateDownloadLink */
        fun generateDownloadLink(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DocumentGenerateDownloadLinkResponse>> =
            generateDownloadLink(id, DocumentGenerateDownloadLinkParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /documents`, but is otherwise the same as
         * [DocumentServiceAsync.upload].
         */
        fun upload(
            params: DocumentUploadParams
        ): CompletableFuture<HttpResponseFor<DocumentUploadResponse>> =
            upload(params, RequestOptions.none())

        /** @see upload */
        fun upload(
            params: DocumentUploadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DocumentUploadResponse>>
    }
}
