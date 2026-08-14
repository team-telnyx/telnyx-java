// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.websearch.WebSearchContentsParams
import com.telnyx.sdk.models.websearch.WebSearchCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class WebSearchServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val webSearchService = client.webSearch()

        val webSearch =
            webSearchService.create(
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

        webSearch.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun contents() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val webSearchService = client.webSearch()

        val response =
            webSearchService.contents(
                WebSearchContentsParams.builder()
                    .addUrl("https://en.wikipedia.org/wiki/Artificial_intelligence")
                    .crawlTimeout(10L)
                    .addFormat(WebSearchContentsParams.Format.MARKDOWN)
                    .addFormat(WebSearchContentsParams.Format.METADATA)
                    .maxAge(null)
                    .build()
            )

        response.validate()
    }
}
