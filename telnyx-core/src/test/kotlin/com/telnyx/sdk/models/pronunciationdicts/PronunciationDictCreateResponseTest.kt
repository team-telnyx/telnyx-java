// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.pronunciationdicts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PronunciationDictCreateResponseTest {

    @Test
    fun create() {
        val pronunciationDictCreateResponse =
            PronunciationDictCreateResponse.builder()
                .data(
                    PronunciationDictCreateResponse.Data.builder()
                        .id("c215a3e1-be41-4701-97e8-1d3c22f9a5b7")
                        .createdAt(OffsetDateTime.parse("2026-03-25T12:00:00.000Z"))
                        .addItem(
                            PronunciationDictCreateResponse.Data.Item.Alias.builder()
                                .alias("tel-nicks")
                                .text("Telnyx")
                                .build()
                        )
                        .name("Brand Names")
                        .recordType(
                            PronunciationDictCreateResponse.Data.RecordType.PRONUNCIATION_DICT
                        )
                        .updatedAt(OffsetDateTime.parse("2026-03-25T12:00:00.000Z"))
                        .version(1L)
                        .build()
                )
                .build()

        assertThat(pronunciationDictCreateResponse.data())
            .contains(
                PronunciationDictCreateResponse.Data.builder()
                    .id("c215a3e1-be41-4701-97e8-1d3c22f9a5b7")
                    .createdAt(OffsetDateTime.parse("2026-03-25T12:00:00.000Z"))
                    .addItem(
                        PronunciationDictCreateResponse.Data.Item.Alias.builder()
                            .alias("tel-nicks")
                            .text("Telnyx")
                            .build()
                    )
                    .name("Brand Names")
                    .recordType(PronunciationDictCreateResponse.Data.RecordType.PRONUNCIATION_DICT)
                    .updatedAt(OffsetDateTime.parse("2026-03-25T12:00:00.000Z"))
                    .version(1L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val pronunciationDictCreateResponse =
            PronunciationDictCreateResponse.builder()
                .data(
                    PronunciationDictCreateResponse.Data.builder()
                        .id("c215a3e1-be41-4701-97e8-1d3c22f9a5b7")
                        .createdAt(OffsetDateTime.parse("2026-03-25T12:00:00.000Z"))
                        .addItem(
                            PronunciationDictCreateResponse.Data.Item.Alias.builder()
                                .alias("tel-nicks")
                                .text("Telnyx")
                                .build()
                        )
                        .name("Brand Names")
                        .recordType(
                            PronunciationDictCreateResponse.Data.RecordType.PRONUNCIATION_DICT
                        )
                        .updatedAt(OffsetDateTime.parse("2026-03-25T12:00:00.000Z"))
                        .version(1L)
                        .build()
                )
                .build()

        val roundtrippedPronunciationDictCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(pronunciationDictCreateResponse),
                jacksonTypeRef<PronunciationDictCreateResponse>(),
            )

        assertThat(roundtrippedPronunciationDictCreateResponse)
            .isEqualTo(pronunciationDictCreateResponse)
    }
}
