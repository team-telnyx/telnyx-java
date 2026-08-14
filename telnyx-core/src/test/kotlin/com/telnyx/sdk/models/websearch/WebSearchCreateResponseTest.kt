// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.websearch

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WebSearchCreateResponseTest {

    @Test
    fun create() {
        val webSearchCreateResponse =
            WebSearchCreateResponse.builder()
                .data(
                    WebSearchCreateResponse.Data.builder()
                        .results(
                            WebSearchCreateResponse.Data.Results.builder()
                                .addWeb(
                                    WebSearchResult.builder()
                                        .description("description")
                                        .addSnippet("string")
                                        .title("title")
                                        .url("https://example.com")
                                        .faviconUrl("https://example.com")
                                        .thumbnailUrl("https://example.com")
                                        .build()
                                )
                                .addNews(
                                    WebSearchResult.builder()
                                        .description("description")
                                        .addSnippet("string")
                                        .title("title")
                                        .url("https://example.com")
                                        .faviconUrl("https://example.com")
                                        .thumbnailUrl("https://example.com")
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(webSearchCreateResponse.data())
            .contains(
                WebSearchCreateResponse.Data.builder()
                    .results(
                        WebSearchCreateResponse.Data.Results.builder()
                            .addWeb(
                                WebSearchResult.builder()
                                    .description("description")
                                    .addSnippet("string")
                                    .title("title")
                                    .url("https://example.com")
                                    .faviconUrl("https://example.com")
                                    .thumbnailUrl("https://example.com")
                                    .build()
                            )
                            .addNews(
                                WebSearchResult.builder()
                                    .description("description")
                                    .addSnippet("string")
                                    .title("title")
                                    .url("https://example.com")
                                    .faviconUrl("https://example.com")
                                    .thumbnailUrl("https://example.com")
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val webSearchCreateResponse =
            WebSearchCreateResponse.builder()
                .data(
                    WebSearchCreateResponse.Data.builder()
                        .results(
                            WebSearchCreateResponse.Data.Results.builder()
                                .addWeb(
                                    WebSearchResult.builder()
                                        .description("description")
                                        .addSnippet("string")
                                        .title("title")
                                        .url("https://example.com")
                                        .faviconUrl("https://example.com")
                                        .thumbnailUrl("https://example.com")
                                        .build()
                                )
                                .addNews(
                                    WebSearchResult.builder()
                                        .description("description")
                                        .addSnippet("string")
                                        .title("title")
                                        .url("https://example.com")
                                        .faviconUrl("https://example.com")
                                        .thumbnailUrl("https://example.com")
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedWebSearchCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(webSearchCreateResponse),
                jacksonTypeRef<WebSearchCreateResponse>(),
            )

        assertThat(roundtrippedWebSearchCreateResponse).isEqualTo(webSearchCreateResponse)
    }
}
