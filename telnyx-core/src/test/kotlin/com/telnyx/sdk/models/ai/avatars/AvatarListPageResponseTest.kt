// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.avatars

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AvatarListPageResponseTest {

    @Test
    fun create() {
        val avatarListPageResponse =
            AvatarListPageResponse.builder()
                .addData(
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
                .meta(
                    AvatarListPageResponse.Meta.builder()
                        .pageNumber(1L)
                        .pageSize(20L)
                        .totalPages(1L)
                        .totalResults(1L)
                        .build()
                )
                .build()

        assertThat(avatarListPageResponse.data())
            .containsExactly(
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
        assertThat(avatarListPageResponse.meta())
            .isEqualTo(
                AvatarListPageResponse.Meta.builder()
                    .pageNumber(1L)
                    .pageSize(20L)
                    .totalPages(1L)
                    .totalResults(1L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val avatarListPageResponse =
            AvatarListPageResponse.builder()
                .addData(
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
                .meta(
                    AvatarListPageResponse.Meta.builder()
                        .pageNumber(1L)
                        .pageSize(20L)
                        .totalPages(1L)
                        .totalResults(1L)
                        .build()
                )
                .build()

        val roundtrippedAvatarListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(avatarListPageResponse),
                jacksonTypeRef<AvatarListPageResponse>(),
            )

        assertThat(roundtrippedAvatarListPageResponse).isEqualTo(avatarListPageResponse)
    }
}
