// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.ai.conversations.insightgroups

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import com.telnyx.api.models.ai.conversations.insights.InsightTemplate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InsightTemplateGroupDetailTest {

    @Test
    fun create() {
        val insightTemplateGroupDetail =
            InsightTemplateGroupDetail.builder()
                .data(
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
                )
                .build()

        assertThat(insightTemplateGroupDetail.data())
            .isEqualTo(
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val insightTemplateGroupDetail =
            InsightTemplateGroupDetail.builder()
                .data(
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
                )
                .build()

        val roundtrippedInsightTemplateGroupDetail =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(insightTemplateGroupDetail),
                jacksonTypeRef<InsightTemplateGroupDetail>(),
            )

        assertThat(roundtrippedInsightTemplateGroupDetail).isEqualTo(insightTemplateGroupDetail)
    }
}
