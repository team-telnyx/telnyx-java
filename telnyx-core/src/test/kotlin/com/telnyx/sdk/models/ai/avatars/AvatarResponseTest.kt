// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.avatars

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AvatarResponseTest {

    @Test
    fun create() {
        val avatarResponse =
            AvatarResponse.builder()
                .data(
                    Avatar.builder()
                        .id("avatar_0123456789abcdef0123456789abcdef")
                        .avatarType(AvatarType.STOCK)
                        .imageUrl("https://example.com/avatar.png")
                        .name("Customer portrait")
                        .contentType(Avatar.ContentType.IMAGE_JPEG)
                        .createdAt(OffsetDateTime.parse("2026-10-13T14:00:00Z"))
                        .heightPx(1080L)
                        .imageUrlExpiresAt(OffsetDateTime.parse("2026-10-13T15:00:00Z"))
                        .sizeBytes(248512L)
                        .suggestedVoiceId("Telnyx.Ultra.db6b0ed5-d5d3-463d-ae85-518a07d3c2b4")
                        .updatedAt(OffsetDateTime.parse("2026-10-13T14:00:00Z"))
                        .widthPx(1920L)
                        .build()
                )
                .build()

        assertThat(avatarResponse.data())
            .isEqualTo(
                Avatar.builder()
                    .id("avatar_0123456789abcdef0123456789abcdef")
                    .avatarType(AvatarType.STOCK)
                    .imageUrl("https://example.com/avatar.png")
                    .name("Customer portrait")
                    .contentType(Avatar.ContentType.IMAGE_JPEG)
                    .createdAt(OffsetDateTime.parse("2026-10-13T14:00:00Z"))
                    .heightPx(1080L)
                    .imageUrlExpiresAt(OffsetDateTime.parse("2026-10-13T15:00:00Z"))
                    .sizeBytes(248512L)
                    .suggestedVoiceId("Telnyx.Ultra.db6b0ed5-d5d3-463d-ae85-518a07d3c2b4")
                    .updatedAt(OffsetDateTime.parse("2026-10-13T14:00:00Z"))
                    .widthPx(1920L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val avatarResponse =
            AvatarResponse.builder()
                .data(
                    Avatar.builder()
                        .id("avatar_0123456789abcdef0123456789abcdef")
                        .avatarType(AvatarType.STOCK)
                        .imageUrl("https://example.com/avatar.png")
                        .name("Customer portrait")
                        .contentType(Avatar.ContentType.IMAGE_JPEG)
                        .createdAt(OffsetDateTime.parse("2026-10-13T14:00:00Z"))
                        .heightPx(1080L)
                        .imageUrlExpiresAt(OffsetDateTime.parse("2026-10-13T15:00:00Z"))
                        .sizeBytes(248512L)
                        .suggestedVoiceId("Telnyx.Ultra.db6b0ed5-d5d3-463d-ae85-518a07d3c2b4")
                        .updatedAt(OffsetDateTime.parse("2026-10-13T14:00:00Z"))
                        .widthPx(1920L)
                        .build()
                )
                .build()

        val roundtrippedAvatarResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(avatarResponse),
                jacksonTypeRef<AvatarResponse>(),
            )

        assertThat(roundtrippedAvatarResponse).isEqualTo(avatarResponse)
    }
}
