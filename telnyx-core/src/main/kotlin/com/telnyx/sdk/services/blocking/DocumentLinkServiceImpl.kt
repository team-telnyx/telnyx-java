// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.handlers.errorBodyHandler
import com.telnyx.sdk.core.handlers.errorHandler
import com.telnyx.sdk.core.handlers.jsonHandler
import com.telnyx.sdk.core.http.HttpMethod
import com.telnyx.sdk.core.http.HttpRequest
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponse.Handler
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.core.http.parseable
import com.telnyx.sdk.core.prepare
import com.telnyx.sdk.models.documentlinks.DocumentLinkListPage
import com.telnyx.sdk.models.documentlinks.DocumentLinkListPageResponse
import com.telnyx.sdk.models.documentlinks.DocumentLinkListParams
import java.util.function.Consumer

/** Documents */
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
    ): DocumentLinkListPage =
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

        private val listHandler: Handler<DocumentLinkListPageResponse> =
            jsonHandler<DocumentLinkListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: DocumentLinkListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DocumentLinkListPage> {
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
                    .let {
                        DocumentLinkListPage.builder()
                            .service(DocumentLinkServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
