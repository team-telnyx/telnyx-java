// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.ai.conversations.insights

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InsightTemplateDetailTest {

    @Test
    fun create() {
        val insightTemplateDetail =
            InsightTemplateDetail.builder()
                .data(
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
                .build()

        assertThat(insightTemplateDetail.data())
            .isEqualTo(
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
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val insightTemplateDetail =
            InsightTemplateDetail.builder()
                .data(
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
                .build()

        val roundtrippedInsightTemplateDetail =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(insightTemplateDetail),
                jacksonTypeRef<InsightTemplateDetail>(),
            )

        assertThat(roundtrippedInsightTemplateDetail).isEqualTo(insightTemplateDetail)
    }
}
