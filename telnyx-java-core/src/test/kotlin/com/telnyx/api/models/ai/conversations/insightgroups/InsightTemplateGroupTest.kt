// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.ai.conversations.insightgroups

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import com.telnyx.api.models.ai.conversations.insights.InsightTemplate
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InsightTemplateGroupTest {

    @Test
    fun create() {
        val insightTemplateGroup =
            InsightTemplateGroup.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .name("name")
                .description("description")
                .addInsight(
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
                .webhook("webhook")
                .build()

        assertThat(insightTemplateGroup.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(insightTemplateGroup.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(insightTemplateGroup.name()).isEqualTo("name")
        assertThat(insightTemplateGroup.description()).contains("description")
        assertThat(insightTemplateGroup.insights().getOrNull())
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
        assertThat(insightTemplateGroup.webhook()).contains("webhook")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val insightTemplateGroup =
            InsightTemplateGroup.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .name("name")
                .description("description")
                .addInsight(
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
                .webhook("webhook")
                .build()

        val roundtrippedInsightTemplateGroup =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(insightTemplateGroup),
                jacksonTypeRef<InsightTemplateGroup>(),
            )

        assertThat(roundtrippedInsightTemplateGroup).isEqualTo(insightTemplateGroup)
    }
}
