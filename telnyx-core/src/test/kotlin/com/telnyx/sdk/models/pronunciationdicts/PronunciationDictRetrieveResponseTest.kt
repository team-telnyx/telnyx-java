// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.pronunciationdicts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PronunciationDictRetrieveResponseTest {

    @Test
    fun create() {
        val pronunciationDictRetrieveResponse =
            PronunciationDictRetrieveResponse.builder()
                .data(
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
                )
                .build()

        assertThat(pronunciationDictRetrieveResponse.data())
            .contains(
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val pronunciationDictRetrieveResponse =
            PronunciationDictRetrieveResponse.builder()
                .data(
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
                )
                .build()

        val roundtrippedPronunciationDictRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(pronunciationDictRetrieveResponse),
                jacksonTypeRef<PronunciationDictRetrieveResponse>(),
            )

        assertThat(roundtrippedPronunciationDictRetrieveResponse)
            .isEqualTo(pronunciationDictRetrieveResponse)
    }
}
