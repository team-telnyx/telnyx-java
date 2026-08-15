// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.websearch

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WebSearchCreateParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertThat(body.query()).isEqualTo("latest AI agent frameworks")
        assertThat(body.count()).contains(10L)
        assertThat(body.country()).contains("US")
        assertThat(body.excludeDomains().getOrNull()).containsExactly("pinterest.com")
        assertThat(body.freshness()).contains("week")
        assertThat(body.includeDomains().getOrNull()).containsExactly("arxiv.org", "github.com")
        assertThat(body.livecrawl()).contains(false)
        assertThat(body.safesearch()).contains(WebSearchCreateParams.Safesearch.MODERATE)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = WebSearchCreateParams.builder().query("latest AI agent frameworks").build()

        val body = params._body()

        assertThat(body.query()).isEqualTo("latest AI agent frameworks")
    }
}
