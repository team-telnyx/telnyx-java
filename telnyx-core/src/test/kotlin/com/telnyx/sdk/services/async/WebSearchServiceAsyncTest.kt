// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.websearch.WebSearchContentsParams
import com.telnyx.sdk.models.websearch.WebSearchCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class WebSearchServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val webSearchServiceAsync = client.webSearch()

        val webSearchFuture =
            webSearchServiceAsync.create(
                WebSearchCreateParams.builder()
                    .query("latest AI agent frameworks")
                    .count(10L)
                    .country("US")
                    .addExcludeDomain("pinterest.com")
                    .freshness("week")
                    .addIncludeDomain("arxiv.org")
                    .addIncludeDomain("github.com")
                    .livecrawl(false)
                    .safesearch(WebSearchCreateParams.Safesearch.MODERATE)
                    .build()
            )

        val webSearch = webSearchFuture.get()
        webSearch.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun contents() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val webSearchServiceAsync = client.webSearch()

        val responseFuture =
            webSearchServiceAsync.contents(
                WebSearchContentsParams.builder()
                    .addUrl("https://en.wikipedia.org/wiki/Artificial_intelligence")
                    .crawlTimeout(10L)
                    .addFormat(WebSearchContentsParams.Format.MARKDOWN)
                    .addFormat(WebSearchContentsParams.Format.METADATA)
                    .maxAge(null)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
