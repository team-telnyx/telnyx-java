// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.avatars

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AvatarTest {

    @Test
    fun create() {
        val avatar =
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

        assertThat(avatar.id()).isEqualTo("avatar_0123456789abcdef0123456789abcdef")
        assertThat(avatar.avatarType()).isEqualTo(AvatarType.STOCK)
        assertThat(avatar.imageUrl()).isEqualTo("https://example.com/avatar.png")
        assertThat(avatar.name()).isEqualTo("Customer portrait")
        assertThat(avatar.contentType()).contains(Avatar.ContentType.IMAGE_JPEG)
        assertThat(avatar.createdAt()).contains(OffsetDateTime.parse("2026-10-13T14:00:00Z"))
        assertThat(avatar.heightPx()).contains(1080L)
        assertThat(avatar.imageUrlExpiresAt())
            .contains(OffsetDateTime.parse("2026-10-13T15:00:00Z"))
        assertThat(avatar.sizeBytes()).contains(248512L)
        assertThat(avatar.suggestedVoiceId())
            .contains("Telnyx.Ultra.db6b0ed5-d5d3-463d-ae85-518a07d3c2b4")
        assertThat(avatar.updatedAt()).contains(OffsetDateTime.parse("2026-10-13T14:00:00Z"))
        assertThat(avatar.widthPx()).contains(1920L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val avatar =
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

        val roundtrippedAvatar =
            jsonMapper.readValue(jsonMapper.writeValueAsString(avatar), jacksonTypeRef<Avatar>())

        assertThat(roundtrippedAvatar).isEqualTo(avatar)
    }
}
