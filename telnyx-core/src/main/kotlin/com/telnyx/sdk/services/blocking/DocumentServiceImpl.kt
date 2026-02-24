// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.handlers.errorBodyHandler
import com.telnyx.sdk.core.handlers.errorHandler
import com.telnyx.sdk.core.handlers.jsonHandler
import com.telnyx.sdk.core.http.HttpMethod
import com.telnyx.sdk.core.http.HttpRequest
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponse.Handler
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.core.http.json
import com.telnyx.sdk.core.http.parseable
import com.telnyx.sdk.core.prepare
import com.telnyx.sdk.models.documents.DocumentDeleteParams
import com.telnyx.sdk.models.documents.DocumentDeleteResponse
import com.telnyx.sdk.models.documents.DocumentDownloadParams
import com.telnyx.sdk.models.documents.DocumentGenerateDownloadLinkParams
import com.telnyx.sdk.models.documents.DocumentGenerateDownloadLinkResponse
import com.telnyx.sdk.models.documents.DocumentListPage
import com.telnyx.sdk.models.documents.DocumentListPageResponse
import com.telnyx.sdk.models.documents.DocumentListParams
import com.telnyx.sdk.models.documents.DocumentRetrieveParams
import com.telnyx.sdk.models.documents.DocumentRetrieveResponse
import com.telnyx.sdk.models.documents.DocumentUpdateParams
import com.telnyx.sdk.models.documents.DocumentUpdateResponse
import com.telnyx.sdk.models.documents.DocumentUploadJsonParams
import com.telnyx.sdk.models.documents.DocumentUploadJsonResponse
import com.telnyx.sdk.models.documents.DocumentUploadParams
import com.telnyx.sdk.models.documents.DocumentUploadResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class DocumentServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    DocumentService {

    private val withRawResponse: DocumentService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): DocumentService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): DocumentService =
        DocumentServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: DocumentRetrieveParams,
        requestOptions: RequestOptions,
    ): DocumentRetrieveResponse =
        // get /documents/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: DocumentUpdateParams,
        requestOptions: RequestOptions,
    ): DocumentUpdateResponse =
        // patch /documents/{id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: DocumentListParams,
        requestOptions: RequestOptions,
    ): DocumentListPage =
        // get /documents
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: DocumentDeleteParams,
        requestOptions: RequestOptions,
    ): DocumentDeleteResponse =
        // delete /documents/{id}
        withRawResponse().delete(params, requestOptions).parse()

    override fun download(
        params: DocumentDownloadParams,
        requestOptions: RequestOptions,
    ): HttpResponse =
        // get /documents/{id}/download
        withRawResponse().download(params, requestOptions)

    override fun generateDownloadLink(
        params: DocumentGenerateDownloadLinkParams,
        requestOptions: RequestOptions,
    ): DocumentGenerateDownloadLinkResponse =
        // get /documents/{id}/download_link
        withRawResponse().generateDownloadLink(params, requestOptions).parse()

    override fun upload(
        params: DocumentUploadParams,
        requestOptions: RequestOptions,
    ): DocumentUploadResponse =
        // post /documents?content-type=multipart
        withRawResponse().upload(params, requestOptions).parse()

    override fun uploadJson(
        params: DocumentUploadJsonParams,
        requestOptions: RequestOptions,
    ): DocumentUploadJsonResponse =
        // post /documents
        withRawResponse().uploadJson(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DocumentService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DocumentService.WithRawResponse =
            DocumentServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<DocumentRetrieveResponse> =
            jsonHandler<DocumentRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: DocumentRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DocumentRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("documents", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateHandler: Handler<DocumentUpdateResponse> =
            jsonHandler<DocumentUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: DocumentUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DocumentUpdateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("documentId", params.documentId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("documents", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<DocumentListPageResponse> =
            jsonHandler<DocumentListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: DocumentListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DocumentListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("documents")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        DocumentListPage.builder()
                            .service(DocumentServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<DocumentDeleteResponse> =
            jsonHandler<DocumentDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: DocumentDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DocumentDeleteResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("documents", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { deleteHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        override fun download(
            params: DocumentDownloadParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("documents", params._pathParam(0), "download")
                    .putHeader("Accept", "application/octet-stream")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response)
        }

        private val generateDownloadLinkHandler: Handler<DocumentGenerateDownloadLinkResponse> =
            jsonHandler<DocumentGenerateDownloadLinkResponse>(clientOptions.jsonMapper)

        override fun generateDownloadLink(
            params: DocumentGenerateDownloadLinkParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DocumentGenerateDownloadLinkResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("documents", params._pathParam(0), "download_link")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { generateDownloadLinkHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val uploadHandler: Handler<DocumentUploadResponse> =
            jsonHandler<DocumentUploadResponse>(clientOptions.jsonMapper)

        override fun upload(
            params: DocumentUploadParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DocumentUploadResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("documents")
                    .putQueryParam("content-type", "multipart")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { uploadHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val uploadJsonHandler: Handler<DocumentUploadJsonResponse> =
            jsonHandler<DocumentUploadJsonResponse>(clientOptions.jsonMapper)

        override fun uploadJson(
            params: DocumentUploadJsonParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DocumentUploadJsonResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("documents")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { uploadJsonHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
