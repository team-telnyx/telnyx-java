// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.tools

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.ai.assistants.tests.testsuites.runs.Meta
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ToolListPageResponseTest {

    @Test
    fun create() {
        val toolListPageResponse =
            ToolListPageResponse.builder()
                .addData(
                    ToolListResponse.builder()
                        .id("id")
                        .toolDefinition(
                            ToolListResponse.ToolDefinition.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .type("type")
                        .createdAt("created_at")
                        .displayName("display_name")
                        .timeoutMs(0L)
                        .build()
                )
                .meta(
                    Meta.builder()
                        .pageNumber(0L)
                        .pageSize(0L)
                        .totalPages(0L)
                        .totalResults(0L)
                        .build()
                )
                .build()

        assertThat(toolListPageResponse.data())
            .containsExactly(
                ToolListResponse.builder()
                    .id("id")
                    .toolDefinition(
                        ToolListResponse.ToolDefinition.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .type("type")
                    .createdAt("created_at")
                    .displayName("display_name")
                    .timeoutMs(0L)
                    .build()
            )
        assertThat(toolListPageResponse.meta())
            .isEqualTo(
                Meta.builder().pageNumber(0L).pageSize(0L).totalPages(0L).totalResults(0L).build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val toolListPageResponse =
            ToolListPageResponse.builder()
                .addData(
                    ToolListResponse.builder()
                        .id("id")
                        .toolDefinition(
                            ToolListResponse.ToolDefinition.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .type("type")
                        .createdAt("created_at")
                        .displayName("display_name")
                        .timeoutMs(0L)
                        .build()
                )
                .meta(
                    Meta.builder()
                        .pageNumber(0L)
                        .pageSize(0L)
                        .totalPages(0L)
                        .totalResults(0L)
                        .build()
                )
                .build()

        val roundtrippedToolListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(toolListPageResponse),
                jacksonTypeRef<ToolListPageResponse>(),
            )

        assertThat(roundtrippedToolListPageResponse).isEqualTo(toolListPageResponse)
    }
}
