// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.handlers.errorBodyHandler
import com.telnyx.api.core.handlers.errorHandler
import com.telnyx.api.core.handlers.jsonHandler
import com.telnyx.api.core.http.HttpMethod
import com.telnyx.api.core.http.HttpRequest
import com.telnyx.api.core.http.HttpResponse
import com.telnyx.api.core.http.HttpResponse.Handler
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.core.http.parseable
import com.telnyx.api.core.prepare
import com.telnyx.api.models.documentlinks.DocumentLinkListParams
import com.telnyx.api.models.documentlinks.DocumentLinkListResponse
import java.util.function.Consumer

class DocumentLinkServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    DocumentLinkService {

    private val withRawResponse: DocumentLinkService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): DocumentLinkService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): DocumentLinkService =
        DocumentLinkServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: DocumentLinkListParams,
        requestOptions: RequestOptions,
    ): DocumentLinkListResponse =
        // get /document_links
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DocumentLinkService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DocumentLinkService.WithRawResponse =
            DocumentLinkServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<DocumentLinkListResponse> =
            jsonHandler<DocumentLinkListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: DocumentLinkListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DocumentLinkListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("document_links")
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
            }
        }
    }
}
