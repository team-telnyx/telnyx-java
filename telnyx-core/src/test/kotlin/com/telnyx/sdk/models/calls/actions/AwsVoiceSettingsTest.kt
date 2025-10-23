// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.calls.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AwsVoiceSettingsTest {

    @Test
    fun create() {
        val awsVoiceSettings = AwsVoiceSettings.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val awsVoiceSettings = AwsVoiceSettings.builder().build()

        val roundtrippedAwsVoiceSettings =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(awsVoiceSettings),
                jacksonTypeRef<AwsVoiceSettings>(),
            )

        assertThat(roundtrippedAwsVoiceSettings).isEqualTo(awsVoiceSettings)
    }
}
