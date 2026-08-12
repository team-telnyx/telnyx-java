// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.websearch.WebSearchContentsParams
import com.telnyx.sdk.models.websearch.WebSearchContentsResponse
import com.telnyx.sdk.models.websearch.WebSearchCreateParams
import com.telnyx.sdk.models.websearch.WebSearchCreateResponse
import com.telnyx.sdk.services.blocking.websearch.ResearchService
import java.util.function.Consumer

interface WebSearchService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): WebSearchService

    /** Deep research with citations and async task polling. */
    fun research(): ResearchService

    /**
     * Performs a real-time web search and returns structured, LLM-ready JSON results with titles,
     * URLs, descriptions, and snippets. Supports filtering by domain, country, safe search,
     * freshness, and live crawl.
     *
     * **Note:** `include_domains` and `exclude_domains` cannot be used in the same request. Use one
     * or the other.
     */
    fun create(params: WebSearchCreateParams): WebSearchCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: WebSearchCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WebSearchCreateResponse

    /**
     * Retrieves clean HTML or Markdown content from a list of URLs. Supports up to 20 URLs per
     * request (public API limit). Specify which formats to return: `html`, `markdown`, `metadata`.
     */
    fun contents(params: WebSearchContentsParams): WebSearchContentsResponse =
        contents(params, RequestOptions.none())

    /** @see contents */
    fun contents(
        params: WebSearchContentsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WebSearchContentsResponse

    /** A view of [WebSearchService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): WebSearchService.WithRawResponse

        /** Deep research with citations and async task polling. */
        fun research(): ResearchService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /web_search`, but is otherwise the same as
         * [WebSearchService.create].
         */
        @MustBeClosed
        fun create(params: WebSearchCreateParams): HttpResponseFor<WebSearchCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: WebSearchCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WebSearchCreateResponse>

        /**
         * Returns a raw HTTP response for `post /web_search/contents`, but is otherwise the same as
         * [WebSearchService.contents].
         */
        @MustBeClosed
        fun contents(params: WebSearchContentsParams): HttpResponseFor<WebSearchContentsResponse> =
            contents(params, RequestOptions.none())

        /** @see contents */
        @MustBeClosed
        fun contents(
            params: WebSearchContentsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WebSearchContentsResponse>
    }
}
