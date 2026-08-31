// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai.knowledge

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
import com.telnyx.sdk.core.prepareAsync
import com.telnyx.sdk.models.ai.knowledge.collections.CollectionRetrieveDocumentsParams
import com.telnyx.sdk.models.ai.knowledge.collections.CollectionRetrieveDocumentsResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/**
 * Create and manage logical collections of your Telnyx data, tune retrieval settings, manage
 * sources, and run collection-scoped semantic search.
 */
class CollectionServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    CollectionServiceAsync {

    private val withRawResponse: CollectionServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CollectionServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CollectionServiceAsync =
        CollectionServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieveDocuments(
        params: CollectionRetrieveDocumentsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CollectionRetrieveDocumentsResponse> =
        // get /ai/knowledge/collections/{slug}/documents
        withRawResponse().retrieveDocuments(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CollectionServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CollectionServiceAsync.WithRawResponse =
            CollectionServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveDocumentsHandler: Handler<CollectionRetrieveDocumentsResponse> =
            jsonHandler<CollectionRetrieveDocumentsResponse>(clientOptions.jsonMapper)

        override fun retrieveDocuments(
            params: CollectionRetrieveDocumentsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CollectionRetrieveDocumentsResponse>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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
}
