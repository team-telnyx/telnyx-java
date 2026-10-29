// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.memory.namespaces.settings

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SummarySettingsTest {

    @Test
    fun create() {
        val summarySettings = SummarySettings.builder().instructions("instructions").build()

        assertThat(summarySettings.instructions()).contains("instructions")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val summarySettings = SummarySettings.builder().instructions("instructions").build()

        val roundtrippedSummarySettings =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(summarySettings),
                jacksonTypeRef<SummarySettings>(),
            )

        assertThat(roundtrippedSummarySettings).isEqualTo(summarySettings)
    }
}
