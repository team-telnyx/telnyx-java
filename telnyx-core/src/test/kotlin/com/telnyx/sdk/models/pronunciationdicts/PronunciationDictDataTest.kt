// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.pronunciationdicts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PronunciationDictDataTest {

    @Test
    fun create() {
        val pronunciationDictData =
            PronunciationDictData.builder()
                .id("c215a3e1-be41-4701-97e8-1d3c22f9a5b7")
                .createdAt(OffsetDateTime.parse("2026-03-25T12:00:00.000Z"))
                .addItem(
                    PronunciationDictAliasItem.builder()
                        .alias("tel-nicks")
                        .text("Telnyx")
                        .type(PronunciationDictAliasItem.Type.ALIAS)
                        .build()
                )
                .name("Brand Names")
                .recordType(PronunciationDictData.RecordType.PRONUNCIATION_DICT)
                .updatedAt(OffsetDateTime.parse("2026-03-25T12:00:00.000Z"))
                .version(1L)
                .build()

        assertThat(pronunciationDictData.id()).contains("c215a3e1-be41-4701-97e8-1d3c22f9a5b7")
        assertThat(pronunciationDictData.createdAt())
            .contains(OffsetDateTime.parse("2026-03-25T12:00:00.000Z"))
        assertThat(pronunciationDictData.items().getOrNull())
            .containsExactly(
                PronunciationDictData.Item.ofAlias(
                    PronunciationDictAliasItem.builder()
                        .alias("tel-nicks")
                        .text("Telnyx")
                        .type(PronunciationDictAliasItem.Type.ALIAS)
                        .build()
                )
            )
        assertThat(pronunciationDictData.name()).contains("Brand Names")
        assertThat(pronunciationDictData.recordType())
            .contains(PronunciationDictData.RecordType.PRONUNCIATION_DICT)
        assertThat(pronunciationDictData.updatedAt())
            .contains(OffsetDateTime.parse("2026-03-25T12:00:00.000Z"))
        assertThat(pronunciationDictData.version()).contains(1L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val pronunciationDictData =
            PronunciationDictData.builder()
                .id("c215a3e1-be41-4701-97e8-1d3c22f9a5b7")
                .createdAt(OffsetDateTime.parse("2026-03-25T12:00:00.000Z"))
                .addItem(
                    PronunciationDictAliasItem.builder()
                        .alias("tel-nicks")
                        .text("Telnyx")
                        .type(PronunciationDictAliasItem.Type.ALIAS)
                        .build()
                )
                .name("Brand Names")
                .recordType(PronunciationDictData.RecordType.PRONUNCIATION_DICT)
                .updatedAt(OffsetDateTime.parse("2026-03-25T12:00:00.000Z"))
                .version(1L)
                .build()

        val roundtrippedPronunciationDictData =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(pronunciationDictData),
                jacksonTypeRef<PronunciationDictData>(),
            )

        assertThat(roundtrippedPronunciationDictData).isEqualTo(pronunciationDictData)
    }
}
