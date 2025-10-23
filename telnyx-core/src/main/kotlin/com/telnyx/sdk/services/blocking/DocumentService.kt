// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.documents.DocumentDeleteParams
import com.telnyx.sdk.models.documents.DocumentDeleteResponse
import com.telnyx.sdk.models.documents.DocumentDownloadParams
import com.telnyx.sdk.models.documents.DocumentGenerateDownloadLinkParams
import com.telnyx.sdk.models.documents.DocumentGenerateDownloadLinkResponse
import com.telnyx.sdk.models.documents.DocumentListParams
import com.telnyx.sdk.models.documents.DocumentListResponse
import com.telnyx.sdk.models.documents.DocumentRetrieveParams
import com.telnyx.sdk.models.documents.DocumentRetrieveResponse
import com.telnyx.sdk.models.documents.DocumentUpdateParams
import com.telnyx.sdk.models.documents.DocumentUpdateResponse
import com.telnyx.sdk.models.documents.DocumentUploadJsonParams
import com.telnyx.sdk.models.documents.DocumentUploadJsonResponse
import com.telnyx.sdk.models.documents.DocumentUploadParams
import com.telnyx.sdk.models.documents.DocumentUploadResponse
import java.util.function.Consumer

interface DocumentService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DocumentService

    /** Retrieve a document. */
    fun retrieve(id: String): DocumentRetrieveResponse = retrieve(id, DocumentRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: DocumentRetrieveParams = DocumentRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DocumentRetrieveResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: DocumentRetrieveParams = DocumentRetrieveParams.none(),
    ): DocumentRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: DocumentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DocumentRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: DocumentRetrieveParams): DocumentRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): DocumentRetrieveResponse =
        retrieve(id, DocumentRetrieveParams.none(), requestOptions)

    /** Update a document. */
    fun update(pathId: String, params: DocumentUpdateParams): DocumentUpdateResponse =
        update(pathId, params, RequestOptions.none())

    /** @see update */
    fun update(
        pathId: String,
        params: DocumentUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DocumentUpdateResponse = update(params.toBuilder().pathId(pathId).build(), requestOptions)

    /** @see update */
    fun update(params: DocumentUpdateParams): DocumentUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: DocumentUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DocumentUpdateResponse

    /** List all documents ordered by created_at descending. */
    fun list(): DocumentListResponse = list(DocumentListParams.none())

    /** @see list */
    fun list(
        params: DocumentListParams = DocumentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DocumentListResponse

    /** @see list */
    fun list(params: DocumentListParams = DocumentListParams.none()): DocumentListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): DocumentListResponse =
        list(DocumentListParams.none(), requestOptions)

    /**
     * Delete a document.<br /><br />A document can only be deleted if it's not linked to a service.
     * If it is linked to a service, it must be unlinked prior to deleting.
     */
    fun delete(id: String): DocumentDeleteResponse = delete(id, DocumentDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: DocumentDeleteParams = DocumentDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DocumentDeleteResponse = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: DocumentDeleteParams = DocumentDeleteParams.none(),
    ): DocumentDeleteResponse = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: DocumentDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DocumentDeleteResponse

    /** @see delete */
    fun delete(params: DocumentDeleteParams): DocumentDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): DocumentDeleteResponse =
        delete(id, DocumentDeleteParams.none(), requestOptions)

    /** Download a document. */
    @MustBeClosed
    fun download(id: String): HttpResponse = download(id, DocumentDownloadParams.none())

    /** @see download */
    @MustBeClosed
    fun download(
        id: String,
        params: DocumentDownloadParams = DocumentDownloadParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse = download(params.toBuilder().id(id).build(), requestOptions)

    /** @see download */
    @MustBeClosed
    fun download(
        id: String,
        params: DocumentDownloadParams = DocumentDownloadParams.none(),
    ): HttpResponse = download(id, params, RequestOptions.none())

    /** @see download */
    @MustBeClosed
    fun download(
        params: DocumentDownloadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** @see download */
    @MustBeClosed
    fun download(params: DocumentDownloadParams): HttpResponse =
        download(params, RequestOptions.none())

    /** @see download */
    @MustBeClosed
    fun download(id: String, requestOptions: RequestOptions): HttpResponse =
        download(id, DocumentDownloadParams.none(), requestOptions)

    /**
     * Generates a temporary pre-signed URL that can be used to download the document directly from
     * the storage backend without authentication.
     */
    fun generateDownloadLink(id: String): DocumentGenerateDownloadLinkResponse =
        generateDownloadLink(id, DocumentGenerateDownloadLinkParams.none())

    /** @see generateDownloadLink */
    fun generateDownloadLink(
        id: String,
        params: DocumentGenerateDownloadLinkParams = DocumentGenerateDownloadLinkParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DocumentGenerateDownloadLinkResponse =
        generateDownloadLink(params.toBuilder().id(id).build(), requestOptions)

    /** @see generateDownloadLink */
    fun generateDownloadLink(
        id: String,
        params: DocumentGenerateDownloadLinkParams = DocumentGenerateDownloadLinkParams.none(),
    ): DocumentGenerateDownloadLinkResponse =
        generateDownloadLink(id, params, RequestOptions.none())

    /** @see generateDownloadLink */
    fun generateDownloadLink(
        params: DocumentGenerateDownloadLinkParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DocumentGenerateDownloadLinkResponse

    /** @see generateDownloadLink */
    fun generateDownloadLink(
        params: DocumentGenerateDownloadLinkParams
    ): DocumentGenerateDownloadLinkResponse = generateDownloadLink(params, RequestOptions.none())

    /** @see generateDownloadLink */
    fun generateDownloadLink(
        id: String,
        requestOptions: RequestOptions,
    ): DocumentGenerateDownloadLinkResponse =
        generateDownloadLink(id, DocumentGenerateDownloadLinkParams.none(), requestOptions)

    /**
     * Upload a document.<br /><br />Uploaded files must be linked to a service within 30 minutes or
     * they will be automatically deleted.
     */
    fun upload(params: DocumentUploadParams): DocumentUploadResponse =
        upload(params, RequestOptions.none())

    /** @see upload */
    fun upload(
        params: DocumentUploadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DocumentUploadResponse

    /**
     * Upload a document.<br /><br />Uploaded files must be linked to a service within 30 minutes or
     * they will be automatically deleted.
     */
    fun uploadJson(params: DocumentUploadJsonParams): DocumentUploadJsonResponse =
        uploadJson(params, RequestOptions.none())

    /** @see uploadJson */
    fun uploadJson(
        params: DocumentUploadJsonParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DocumentUploadJsonResponse

    /** A view of [DocumentService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): DocumentService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /documents/{id}`, but is otherwise the same as
         * [DocumentService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<DocumentRetrieveResponse> =
            retrieve(id, DocumentRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: DocumentRetrieveParams = DocumentRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DocumentRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: DocumentRetrieveParams = DocumentRetrieveParams.none(),
        ): HttpResponseFor<DocumentRetrieveResponse> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: DocumentRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DocumentRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: DocumentRetrieveParams): HttpResponseFor<DocumentRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DocumentRetrieveResponse> =
            retrieve(id, DocumentRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /documents/{id}`, but is otherwise the same as
         * [DocumentService.update].
         */
        @MustBeClosed
        fun update(
            pathId: String,
            params: DocumentUpdateParams,
        ): HttpResponseFor<DocumentUpdateResponse> = update(pathId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            pathId: String,
            params: DocumentUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DocumentUpdateResponse> =
            update(params.toBuilder().pathId(pathId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: DocumentUpdateParams): HttpResponseFor<DocumentUpdateResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: DocumentUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DocumentUpdateResponse>

        /**
         * Returns a raw HTTP response for `get /documents`, but is otherwise the same as
         * [DocumentService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<DocumentListResponse> = list(DocumentListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: DocumentListParams = DocumentListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DocumentListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: DocumentListParams = DocumentListParams.none()
        ): HttpResponseFor<DocumentListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<DocumentListResponse> =
            list(DocumentListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /documents/{id}`, but is otherwise the same as
         * [DocumentService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponseFor<DocumentDeleteResponse> =
            delete(id, DocumentDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: DocumentDeleteParams = DocumentDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DocumentDeleteResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: DocumentDeleteParams = DocumentDeleteParams.none(),
        ): HttpResponseFor<DocumentDeleteResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: DocumentDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DocumentDeleteResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(params: DocumentDeleteParams): HttpResponseFor<DocumentDeleteResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DocumentDeleteResponse> =
            delete(id, DocumentDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /documents/{id}/download`, but is otherwise the same
         * as [DocumentService.download].
         */
        @MustBeClosed
        fun download(id: String): HttpResponse = download(id, DocumentDownloadParams.none())

        /** @see download */
        @MustBeClosed
        fun download(
            id: String,
            params: DocumentDownloadParams = DocumentDownloadParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = download(params.toBuilder().id(id).build(), requestOptions)

        /** @see download */
        @MustBeClosed
        fun download(
            id: String,
            params: DocumentDownloadParams = DocumentDownloadParams.none(),
        ): HttpResponse = download(id, params, RequestOptions.none())

        /** @see download */
        @MustBeClosed
        fun download(
            params: DocumentDownloadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see download */
        @MustBeClosed
        fun download(params: DocumentDownloadParams): HttpResponse =
            download(params, RequestOptions.none())

        /** @see download */
        @MustBeClosed
        fun download(id: String, requestOptions: RequestOptions): HttpResponse =
            download(id, DocumentDownloadParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /documents/{id}/download_link`, but is otherwise the
         * same as [DocumentService.generateDownloadLink].
         */
        @MustBeClosed
        fun generateDownloadLink(
            id: String
        ): HttpResponseFor<DocumentGenerateDownloadLinkResponse> =
            generateDownloadLink(id, DocumentGenerateDownloadLinkParams.none())

        /** @see generateDownloadLink */
        @MustBeClosed
        fun generateDownloadLink(
            id: String,
            params: DocumentGenerateDownloadLinkParams = DocumentGenerateDownloadLinkParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DocumentGenerateDownloadLinkResponse> =
            generateDownloadLink(params.toBuilder().id(id).build(), requestOptions)

        /** @see generateDownloadLink */
        @MustBeClosed
        fun generateDownloadLink(
            id: String,
            params: DocumentGenerateDownloadLinkParams = DocumentGenerateDownloadLinkParams.none(),
        ): HttpResponseFor<DocumentGenerateDownloadLinkResponse> =
            generateDownloadLink(id, params, RequestOptions.none())

        /** @see generateDownloadLink */
        @MustBeClosed
        fun generateDownloadLink(
            params: DocumentGenerateDownloadLinkParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DocumentGenerateDownloadLinkResponse>

        /** @see generateDownloadLink */
        @MustBeClosed
        fun generateDownloadLink(
            params: DocumentGenerateDownloadLinkParams
        ): HttpResponseFor<DocumentGenerateDownloadLinkResponse> =
            generateDownloadLink(params, RequestOptions.none())

        /** @see generateDownloadLink */
        @MustBeClosed
        fun generateDownloadLink(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DocumentGenerateDownloadLinkResponse> =
            generateDownloadLink(id, DocumentGenerateDownloadLinkParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /documents?content-type=multipart`, but is
         * otherwise the same as [DocumentService.upload].
         */
        @MustBeClosed
        fun upload(params: DocumentUploadParams): HttpResponseFor<DocumentUploadResponse> =
            upload(params, RequestOptions.none())

        /** @see upload */
        @MustBeClosed
        fun upload(
            params: DocumentUploadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DocumentUploadResponse>

        /**
         * Returns a raw HTTP response for `post /documents`, but is otherwise the same as
         * [DocumentService.uploadJson].
         */
        @MustBeClosed
        fun uploadJson(
            params: DocumentUploadJsonParams
        ): HttpResponseFor<DocumentUploadJsonResponse> = uploadJson(params, RequestOptions.none())

        /** @see uploadJson */
        @MustBeClosed
        fun uploadJson(
            params: DocumentUploadJsonParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DocumentUploadJsonResponse>
    }
}
