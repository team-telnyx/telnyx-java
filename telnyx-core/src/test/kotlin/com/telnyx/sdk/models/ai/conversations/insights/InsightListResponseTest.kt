// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.conversations.insights

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.ai.assistants.tests.testsuites.runs.Meta
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InsightListResponseTest {

    @Test
    fun create() {
        val insightListResponse =
            InsightListResponse.builder()
                .addData(
                    InsightTemplate.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .instructions("instructions")
                        .insightType(InsightTemplate.InsightType.CUSTOM)
                        .jsonSchema("string")
                        .name("name")
                        .webhook("webhook")
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

        assertThat(insightListResponse.data())
            .containsExactly(
                InsightTemplate.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .instructions("instructions")
                    .insightType(InsightTemplate.InsightType.CUSTOM)
                    .jsonSchema("string")
                    .name("name")
                    .webhook("webhook")
                    .build()
            )
        assertThat(insightListResponse.meta())
            .isEqualTo(
                Meta.builder().pageNumber(0L).pageSize(0L).totalPages(0L).totalResults(0L).build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val insightListResponse =
            InsightListResponse.builder()
                .addData(
                    InsightTemplate.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .instructions("instructions")
                        .insightType(InsightTemplate.InsightType.CUSTOM)
                        .jsonSchema("string")
                        .name("name")
                        .webhook("webhook")
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

        val roundtrippedInsightListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(insightListResponse),
                jacksonTypeRef<InsightListResponse>(),
            )

        assertThat(roundtrippedInsightListResponse).isEqualTo(insightListResponse)
    }
}
