// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InsightSettingsTest {

    @Test
    fun create() {
        val insightSettings = InsightSettings.builder().insightGroupId("insight_group_id").build()

        assertThat(insightSettings.insightGroupId()).contains("insight_group_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val insightSettings = InsightSettings.builder().insightGroupId("insight_group_id").build()

        val roundtrippedInsightSettings =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(insightSettings),
                jacksonTypeRef<InsightSettings>(),
            )

        assertThat(roundtrippedInsightSettings).isEqualTo(insightSettings)
    }
}
