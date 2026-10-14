// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.ai.avatars.AvatarId
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AvatarSettingsRequestTest {

    @Test
    fun create() {
        val avatarSettingsRequest =
            AvatarSettingsRequest.builder()
                .avatarId(AvatarId.ELENA)
                .backgroundId(AvatarSettingsRequest.BackgroundId.OFFICE)
                .model(AvatarSettingsRequest.Model.FOXTROT_1)
                .build()

        assertThat(avatarSettingsRequest.avatarId()).isEqualTo(AvatarId.ELENA)
        assertThat(avatarSettingsRequest.backgroundId())
            .isEqualTo(AvatarSettingsRequest.BackgroundId.OFFICE)
        assertThat(avatarSettingsRequest.model()).isEqualTo(AvatarSettingsRequest.Model.FOXTROT_1)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val avatarSettingsRequest =
            AvatarSettingsRequest.builder()
                .avatarId(AvatarId.ELENA)
                .backgroundId(AvatarSettingsRequest.BackgroundId.OFFICE)
                .model(AvatarSettingsRequest.Model.FOXTROT_1)
                .build()

        val roundtrippedAvatarSettingsRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(avatarSettingsRequest),
                jacksonTypeRef<AvatarSettingsRequest>(),
            )

        assertThat(roundtrippedAvatarSettingsRequest).isEqualTo(avatarSettingsRequest)
    }
}
