// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.conversations.insights

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.ai.assistants.tests.testsuites.runs.Meta
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InsightListPageResponseTest {

    @Test
    fun create() {
        val insightListPageResponse =
            InsightListPageResponse.builder()
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

        assertThat(insightListPageResponse.data())
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
        assertThat(insightListPageResponse.meta())
            .isEqualTo(
                Meta.builder().pageNumber(0L).pageSize(0L).totalPages(0L).totalResults(0L).build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val insightListPageResponse =
            InsightListPageResponse.builder()
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

        val roundtrippedInsightListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(insightListPageResponse),
                jacksonTypeRef<InsightListPageResponse>(),
            )

        assertThat(roundtrippedInsightListPageResponse).isEqualTo(insightListPageResponse)
    }
}
