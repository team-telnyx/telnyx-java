// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.calls.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CommunityVoiceSettingsTest {

    @Test
    fun create() {
        val communityVoiceSettings =
            CommunityVoiceSettings.builder().apiKeyRef("acme-engine-key").build()

        assertThat(communityVoiceSettings.apiKeyRef()).isEqualTo("acme-engine-key")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val communityVoiceSettings =
            CommunityVoiceSettings.builder().apiKeyRef("acme-engine-key").build()

        val roundtrippedCommunityVoiceSettings =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(communityVoiceSettings),
                jacksonTypeRef<CommunityVoiceSettings>(),
            )

        assertThat(roundtrippedCommunityVoiceSettings).isEqualTo(communityVoiceSettings)
    }
}
