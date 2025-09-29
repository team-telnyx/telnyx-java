// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.ai.assistants

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PrivacySettingsTest {

    @Test
    fun create() {
        val privacySettings = PrivacySettings.builder().dataRetention(true).build()

        assertThat(privacySettings.dataRetention()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val privacySettings = PrivacySettings.builder().dataRetention(true).build()

        val roundtrippedPrivacySettings =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(privacySettings),
                jacksonTypeRef<PrivacySettings>(),
            )

        assertThat(roundtrippedPrivacySettings).isEqualTo(privacySettings)
    }
}
