// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.websearch

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WebSearchContentsResponseTest {

    @Test
    fun create() {
        val webSearchContentsResponse =
            WebSearchContentsResponse.builder()
                .data(
                    WebSearchContentsResponse.Data.builder()
                        .addResult(
                            WebSearchContentsResponse.Data.Result.builder()
                                .url("https://example.com")
                                .html("html")
                                .markdown("markdown")
                                .metadata(
                                    WebSearchContentsResponse.Data.Result.Metadata.builder()
                                        .faviconUrl("https://example.com")
                                        .siteName("site_name")
                                        .build()
                                )
                                .title("title")
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(webSearchContentsResponse.data())
            .contains(
                WebSearchContentsResponse.Data.builder()
                    .addResult(
                        WebSearchContentsResponse.Data.Result.builder()
                            .url("https://example.com")
                            .html("html")
                            .markdown("markdown")
                            .metadata(
                                WebSearchContentsResponse.Data.Result.Metadata.builder()
                                    .faviconUrl("https://example.com")
                                    .siteName("site_name")
                                    .build()
                            )
                            .title("title")
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val webSearchContentsResponse =
            WebSearchContentsResponse.builder()
                .data(
                    WebSearchContentsResponse.Data.builder()
                        .addResult(
                            WebSearchContentsResponse.Data.Result.builder()
                                .url("https://example.com")
                                .html("html")
                                .markdown("markdown")
                                .metadata(
                                    WebSearchContentsResponse.Data.Result.Metadata.builder()
                                        .faviconUrl("https://example.com")
                                        .siteName("site_name")
                                        .build()
                                )
                                .title("title")
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedWebSearchContentsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(webSearchContentsResponse),
                jacksonTypeRef<WebSearchContentsResponse>(),
            )

        assertThat(roundtrippedWebSearchContentsResponse).isEqualTo(webSearchContentsResponse)
    }
}
