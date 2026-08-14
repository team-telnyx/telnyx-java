// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.websearch.WebSearchContentsParams
import com.telnyx.sdk.models.websearch.WebSearchContentsResponse
import com.telnyx.sdk.models.websearch.WebSearchCreateParams
import com.telnyx.sdk.models.websearch.WebSearchCreateResponse
import com.telnyx.sdk.services.async.websearch.ResearchServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface WebSearchServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): WebSearchServiceAsync

    /** Deep research with citations and async task polling. */
    fun research(): ResearchServiceAsync

    /**
     * Performs a real-time web search and returns structured, LLM-ready JSON results with titles,
     * URLs, descriptions, and snippets. Supports filtering by domain, country, safe search,
     * freshness, and live crawl.
     *
     * **Note:** `include_domains` and `exclude_domains` cannot be used in the same request. Use one
     * or the other.
     */
    fun create(params: WebSearchCreateParams): CompletableFuture<WebSearchCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: WebSearchCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WebSearchCreateResponse>

    /**
     * Retrieves clean HTML or Markdown content from a list of URLs. Supports up to 20 URLs per
     * request (public API limit). Specify which formats to return: `html`, `markdown`, `metadata`.
     */
    fun contents(params: WebSearchContentsParams): CompletableFuture<WebSearchContentsResponse> =
        contents(params, RequestOptions.none())

    /** @see contents */
    fun contents(
        params: WebSearchContentsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WebSearchContentsResponse>

    /**
     * A view of [WebSearchServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): WebSearchServiceAsync.WithRawResponse

        /** Deep research with citations and async task polling. */
        fun research(): ResearchServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /web_search`, but is otherwise the same as
         * [WebSearchServiceAsync.create].
         */
        fun create(
            params: WebSearchCreateParams
        ): CompletableFuture<HttpResponseFor<WebSearchCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: WebSearchCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WebSearchCreateResponse>>

        /**
         * Returns a raw HTTP response for `post /web_search/contents`, but is otherwise the same as
         * [WebSearchServiceAsync.contents].
         */
        fun contents(
            params: WebSearchContentsParams
        ): CompletableFuture<HttpResponseFor<WebSearchContentsResponse>> =
            contents(params, RequestOptions.none())

        /** @see contents */
        fun contents(
            params: WebSearchContentsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WebSearchContentsResponse>>
    }
}
