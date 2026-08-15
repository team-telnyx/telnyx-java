// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.websearch

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WebSearchContentsParamsTest {

    @Test
    fun create() {
        WebSearchContentsParams.builder()
            .addUrl("https://en.wikipedia.org/wiki/Artificial_intelligence")
            .crawlTimeout(10L)
            .addFormat(WebSearchContentsParams.Format.MARKDOWN)
            .addFormat(WebSearchContentsParams.Format.METADATA)
            .maxAge(null)
            .build()
    }

    @Test
    fun body() {
        val params =
            WebSearchContentsParams.builder()
                .addUrl("https://en.wikipedia.org/wiki/Artificial_intelligence")
                .crawlTimeout(10L)
                .addFormat(WebSearchContentsParams.Format.MARKDOWN)
                .addFormat(WebSearchContentsParams.Format.METADATA)
                .maxAge(null)
                .build()

        val body = params._body()

        assertThat(body.urls())
            .containsExactly("https://en.wikipedia.org/wiki/Artificial_intelligence")
        assertThat(body.crawlTimeout()).contains(10L)
        assertThat(body.formats().getOrNull())
            .containsExactly(
                WebSearchContentsParams.Format.MARKDOWN,
                WebSearchContentsParams.Format.METADATA,
            )
        assertThat(body.maxAge()).isEmpty
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            WebSearchContentsParams.builder()
                .addUrl("https://en.wikipedia.org/wiki/Artificial_intelligence")
                .build()

        val body = params._body()

        assertThat(body.urls())
            .containsExactly("https://en.wikipedia.org/wiki/Artificial_intelligence")
    }
}
