// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ShortCodeTest {

    @Test
    fun create() {
        val shortCode =
            ShortCode.builder()
                .messagingProfileId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                .id("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                .countryCode("US")
                .createdAt(OffsetDateTime.parse("2019-01-23T18:10:02.574Z"))
                .recordType(ShortCode.RecordType.SHORT_CODE)
                .shortCode("12345")
                .updatedAt(OffsetDateTime.parse("2019-01-23T18:10:02.574Z"))
                .build()

        assertThat(shortCode.messagingProfileId()).contains("3fa85f64-5717-4562-b3fc-2c963f66afa6")
        assertThat(shortCode.id()).contains("3fa85f64-5717-4562-b3fc-2c963f66afa6")
        assertThat(shortCode.countryCode()).contains("US")
        assertThat(shortCode.createdAt()).contains(OffsetDateTime.parse("2019-01-23T18:10:02.574Z"))
        assertThat(shortCode.recordType()).contains(ShortCode.RecordType.SHORT_CODE)
        assertThat(shortCode.shortCode()).contains("12345")
        assertThat(shortCode.updatedAt()).contains(OffsetDateTime.parse("2019-01-23T18:10:02.574Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val shortCode =
            ShortCode.builder()
                .messagingProfileId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                .id("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                .countryCode("US")
                .createdAt(OffsetDateTime.parse("2019-01-23T18:10:02.574Z"))
                .recordType(ShortCode.RecordType.SHORT_CODE)
                .shortCode("12345")
                .updatedAt(OffsetDateTime.parse("2019-01-23T18:10:02.574Z"))
                .build()

        val roundtrippedShortCode =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(shortCode),
                jacksonTypeRef<ShortCode>(),
            )

        assertThat(roundtrippedShortCode).isEqualTo(shortCode)
    }
}
