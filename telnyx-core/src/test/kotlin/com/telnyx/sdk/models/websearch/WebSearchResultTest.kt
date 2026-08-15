// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.websearch

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WebSearchResultTest {

    @Test
    fun create() {
        val webSearchResult =
            WebSearchResult.builder()
                .description("description")
                .addSnippet("string")
                .title("title")
                .url("https://example.com")
                .faviconUrl("https://example.com")
                .thumbnailUrl("https://example.com")
                .build()

        assertThat(webSearchResult.description()).isEqualTo("description")
        assertThat(webSearchResult.snippets()).containsExactly("string")
        assertThat(webSearchResult.title()).isEqualTo("title")
        assertThat(webSearchResult.url()).isEqualTo("https://example.com")
        assertThat(webSearchResult.faviconUrl()).contains("https://example.com")
        assertThat(webSearchResult.thumbnailUrl()).contains("https://example.com")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val webSearchResult =
            WebSearchResult.builder()
                .description("description")
                .addSnippet("string")
                .title("title")
                .url("https://example.com")
                .faviconUrl("https://example.com")
                .thumbnailUrl("https://example.com")
                .build()

        val roundtrippedWebSearchResult =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(webSearchResult),
                jacksonTypeRef<WebSearchResult>(),
            )

        assertThat(roundtrippedWebSearchResult).isEqualTo(webSearchResult)
    }
}
