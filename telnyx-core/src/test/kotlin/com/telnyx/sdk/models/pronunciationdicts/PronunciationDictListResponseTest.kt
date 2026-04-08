// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.pronunciationdicts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PronunciationDictListResponseTest {

    @Test
    fun create() {
        val pronunciationDictListResponse =
            PronunciationDictListResponse.builder()
                .id("c215a3e1-be41-4701-97e8-1d3c22f9a5b7")
                .createdAt(OffsetDateTime.parse("2026-03-25T12:00:00.000Z"))
                .addItem(
                    PronunciationDictListResponse.Item.Alias.builder()
                        .alias("tel-nicks")
                        .text("Telnyx")
                        .build()
                )
                .name("Brand Names")
                .recordType(PronunciationDictListResponse.RecordType.PRONUNCIATION_DICT)
                .updatedAt(OffsetDateTime.parse("2026-03-25T12:00:00.000Z"))
                .version(1L)
                .build()

        assertThat(pronunciationDictListResponse.id())
            .contains("c215a3e1-be41-4701-97e8-1d3c22f9a5b7")
        assertThat(pronunciationDictListResponse.createdAt())
            .contains(OffsetDateTime.parse("2026-03-25T12:00:00.000Z"))
        assertThat(pronunciationDictListResponse.items().getOrNull())
            .containsExactly(
                PronunciationDictListResponse.Item.ofAlias(
                    PronunciationDictListResponse.Item.Alias.builder()
                        .alias("tel-nicks")
                        .text("Telnyx")
                        .build()
                )
            )
        assertThat(pronunciationDictListResponse.name()).contains("Brand Names")
        assertThat(pronunciationDictListResponse.recordType())
            .contains(PronunciationDictListResponse.RecordType.PRONUNCIATION_DICT)
        assertThat(pronunciationDictListResponse.updatedAt())
            .contains(OffsetDateTime.parse("2026-03-25T12:00:00.000Z"))
        assertThat(pronunciationDictListResponse.version()).contains(1L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val pronunciationDictListResponse =
            PronunciationDictListResponse.builder()
                .id("c215a3e1-be41-4701-97e8-1d3c22f9a5b7")
                .createdAt(OffsetDateTime.parse("2026-03-25T12:00:00.000Z"))
                .addItem(
                    PronunciationDictListResponse.Item.Alias.builder()
                        .alias("tel-nicks")
                        .text("Telnyx")
                        .build()
                )
                .name("Brand Names")
                .recordType(PronunciationDictListResponse.RecordType.PRONUNCIATION_DICT)
                .updatedAt(OffsetDateTime.parse("2026-03-25T12:00:00.000Z"))
                .version(1L)
                .build()

        val roundtrippedPronunciationDictListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(pronunciationDictListResponse),
                jacksonTypeRef<PronunciationDictListResponse>(),
            )

        assertThat(roundtrippedPronunciationDictListResponse)
            .isEqualTo(pronunciationDictListResponse)
    }
}
