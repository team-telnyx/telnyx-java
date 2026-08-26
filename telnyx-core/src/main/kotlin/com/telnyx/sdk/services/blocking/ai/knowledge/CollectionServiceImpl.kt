// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai.knowledge

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
import com.telnyx.sdk.core.http.parseable
import com.telnyx.sdk.core.prepare
import com.telnyx.sdk.models.ai.knowledge.collections.CollectionRetrieveDocumentsParams
import com.telnyx.sdk.models.ai.knowledge.collections.CollectionRetrieveDocumentsResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/**
 * Create and manage logical collections of your Telnyx data, tune retrieval settings, manage
 * sources, and run collection-scoped semantic search.
 */
class CollectionServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    CollectionService {

    private val withRawResponse: CollectionService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CollectionService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CollectionService =
        CollectionServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieveDocuments(
        params: CollectionRetrieveDocumentsParams,
        requestOptions: RequestOptions,
    ): CollectionRetrieveDocumentsResponse =
        // get /ai/knowledge/collections/{slug}/documents
        withRawResponse().retrieveDocuments(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CollectionService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CollectionService.WithRawResponse =
            CollectionServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveDocumentsHandler: Handler<CollectionRetrieveDocumentsResponse> =
            jsonHandler<CollectionRetrieveDocumentsResponse>(clientOptions.jsonMapper)

        override fun retrieveDocuments(
            params: CollectionRetrieveDocumentsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CollectionRetrieveDocumentsResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("slug", params.slug().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "ai",
                        "knowledge",
                        "collections",
                        params._pathParam(0),
                        "documents",
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveDocumentsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
