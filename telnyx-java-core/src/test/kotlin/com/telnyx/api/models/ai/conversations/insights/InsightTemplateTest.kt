// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.ai.conversations.insights

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InsightTemplateTest {

    @Test
    fun create() {
        val insightTemplate =
            InsightTemplate.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .instructions("instructions")
                .insightType(InsightTemplate.InsightType.CUSTOM)
                .jsonSchema("string")
                .name("name")
                .webhook("webhook")
                .build()

        assertThat(insightTemplate.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(insightTemplate.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(insightTemplate.instructions()).isEqualTo("instructions")
        assertThat(insightTemplate.insightType()).contains(InsightTemplate.InsightType.CUSTOM)
        assertThat(insightTemplate.jsonSchema())
            .contains(InsightTemplate.JsonSchema.ofString("string"))
        assertThat(insightTemplate.name()).contains("name")
        assertThat(insightTemplate.webhook()).contains("webhook")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val insightTemplate =
            InsightTemplate.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .instructions("instructions")
                .insightType(InsightTemplate.InsightType.CUSTOM)
                .jsonSchema("string")
                .name("name")
                .webhook("webhook")
                .build()

        val roundtrippedInsightTemplate =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(insightTemplate),
                jacksonTypeRef<InsightTemplate>(),
            )

        assertThat(roundtrippedInsightTemplate).isEqualTo(insightTemplate)
    }
}
