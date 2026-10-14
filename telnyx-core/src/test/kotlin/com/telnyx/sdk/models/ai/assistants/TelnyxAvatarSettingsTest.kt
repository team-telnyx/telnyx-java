// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.ai.avatars.AvatarId
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TelnyxAvatarSettingsTest {

    @Test
    fun create() {
        val telnyxAvatarSettings =
            TelnyxAvatarSettings.builder()
                .avatarId(AvatarId.ELENA)
                .backgroundId(TelnyxAvatarSettings.BackgroundId.OFFICE)
                .model(TelnyxAvatarSettings.Model.FOXTROT_1)
                .build()

        assertThat(telnyxAvatarSettings.avatarId()).isEqualTo(AvatarId.ELENA)
        assertThat(telnyxAvatarSettings.backgroundId())
            .isEqualTo(TelnyxAvatarSettings.BackgroundId.OFFICE)
        assertThat(telnyxAvatarSettings.model()).isEqualTo(TelnyxAvatarSettings.Model.FOXTROT_1)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val telnyxAvatarSettings =
            TelnyxAvatarSettings.builder()
                .avatarId(AvatarId.ELENA)
                .backgroundId(TelnyxAvatarSettings.BackgroundId.OFFICE)
                .model(TelnyxAvatarSettings.Model.FOXTROT_1)
                .build()

        val roundtrippedTelnyxAvatarSettings =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(telnyxAvatarSettings),
                jacksonTypeRef<TelnyxAvatarSettings>(),
            )

        assertThat(roundtrippedTelnyxAvatarSettings).isEqualTo(telnyxAvatarSettings)
    }
}
