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
import com.telnyx.sdk.core.http.json
import com.telnyx.sdk.core.http.parseable
import com.telnyx.sdk.core.prepare
import com.telnyx.sdk.models.websearch.WebSearchContentsParams
import com.telnyx.sdk.models.websearch.WebSearchContentsResponse
import com.telnyx.sdk.models.websearch.WebSearchCreateParams
import com.telnyx.sdk.models.websearch.WebSearchCreateResponse
import com.telnyx.sdk.services.blocking.websearch.ResearchService
import com.telnyx.sdk.services.blocking.websearch.ResearchServiceImpl
import java.util.function.Consumer

class WebSearchServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    WebSearchService {

    private val withRawResponse: WebSearchService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val research: ResearchService by lazy { ResearchServiceImpl(clientOptions) }

    override fun withRawResponse(): WebSearchService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): WebSearchService =
        WebSearchServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Deep research with citations and async task polling. */
    override fun research(): ResearchService = research

    override fun create(
        params: WebSearchCreateParams,
        requestOptions: RequestOptions,
    ): WebSearchCreateResponse =
        // post /web_search
        withRawResponse().create(params, requestOptions).parse()

    override fun contents(
        params: WebSearchContentsParams,
        requestOptions: RequestOptions,
    ): WebSearchContentsResponse =
        // post /web_search/contents
        withRawResponse().contents(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        WebSearchService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val research: ResearchService.WithRawResponse by lazy {
            ResearchServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): WebSearchService.WithRawResponse =
            WebSearchServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Deep research with citations and async task polling. */
        override fun research(): ResearchService.WithRawResponse = research

        private val createHandler: Handler<WebSearchCreateResponse> =
            jsonHandler<WebSearchCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: WebSearchCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<WebSearchCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("web_search")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val contentsHandler: Handler<WebSearchContentsResponse> =
            jsonHandler<WebSearchContentsResponse>(clientOptions.jsonMapper)

        override fun contents(
            params: WebSearchContentsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<WebSearchContentsResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("web_search", "contents")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
