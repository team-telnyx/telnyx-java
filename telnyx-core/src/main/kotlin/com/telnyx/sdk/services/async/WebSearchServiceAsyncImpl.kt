// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

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
import com.telnyx.sdk.core.http.json
import com.telnyx.sdk.core.http.parseable
import com.telnyx.sdk.core.prepareAsync
import com.telnyx.sdk.models.websearch.WebSearchContentsParams
import com.telnyx.sdk.models.websearch.WebSearchContentsResponse
import com.telnyx.sdk.models.websearch.WebSearchCreateParams
import com.telnyx.sdk.models.websearch.WebSearchCreateResponse
import com.telnyx.sdk.services.async.websearch.ResearchServiceAsync
import com.telnyx.sdk.services.async.websearch.ResearchServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class WebSearchServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    WebSearchServiceAsync {

    private val withRawResponse: WebSearchServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val research: ResearchServiceAsync by lazy { ResearchServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): WebSearchServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): WebSearchServiceAsync =
        WebSearchServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Deep research with citations and async task polling. */
    override fun research(): ResearchServiceAsync = research

    override fun create(
        params: WebSearchCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<WebSearchCreateResponse> =
        // post /web_search
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun contents(
        params: WebSearchContentsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<WebSearchContentsResponse> =
        // post /web_search/contents
        withRawResponse().contents(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        WebSearchServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val research: ResearchServiceAsync.WithRawResponse by lazy {
            ResearchServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): WebSearchServiceAsync.WithRawResponse =
            WebSearchServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Deep research with citations and async task polling. */
        override fun research(): ResearchServiceAsync.WithRawResponse = research

        private val createHandler: Handler<WebSearchCreateResponse> =
            jsonHandler<WebSearchCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: WebSearchCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WebSearchCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("web_search")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val contentsHandler: Handler<WebSearchContentsResponse> =
            jsonHandler<WebSearchContentsResponse>(clientOptions.jsonMapper)

        override fun contents(
            params: WebSearchContentsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WebSearchContentsResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("web_search", "contents")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { contentsHandler.handle(it) }
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
