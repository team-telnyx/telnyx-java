// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.conversations.insightgroups

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.ai.assistants.tests.testsuites.runs.Meta
import com.telnyx.sdk.models.ai.conversations.insights.InsightTemplate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InsightGroupRetrieveInsightGroupsPageResponseTest {

    @Test
    fun create() {
        val insightGroupRetrieveInsightGroupsPageResponse =
            InsightGroupRetrieveInsightGroupsPageResponse.builder()
                .addData(
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
                .meta(
                    Meta.builder()
                        .pageNumber(0L)
                        .pageSize(0L)
                        .totalPages(0L)
                        .totalResults(0L)
                        .build()
                )
                .build()

        assertThat(insightGroupRetrieveInsightGroupsPageResponse.data())
            .containsExactly(
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
        assertThat(insightGroupRetrieveInsightGroupsPageResponse.meta())
            .isEqualTo(
                Meta.builder().pageNumber(0L).pageSize(0L).totalPages(0L).totalResults(0L).build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val insightGroupRetrieveInsightGroupsPageResponse =
            InsightGroupRetrieveInsightGroupsPageResponse.builder()
                .addData(
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
                .meta(
                    Meta.builder()
                        .pageNumber(0L)
                        .pageSize(0L)
                        .totalPages(0L)
                        .totalResults(0L)
                        .build()
                )
                .build()

        val roundtrippedInsightGroupRetrieveInsightGroupsPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(insightGroupRetrieveInsightGroupsPageResponse),
                jacksonTypeRef<InsightGroupRetrieveInsightGroupsPageResponse>(),
            )

        assertThat(roundtrippedInsightGroupRetrieveInsightGroupsPageResponse)
            .isEqualTo(insightGroupRetrieveInsightGroupsPageResponse)
    }
}
