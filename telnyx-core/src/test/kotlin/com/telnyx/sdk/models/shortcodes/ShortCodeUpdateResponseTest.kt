// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.shortcodes

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.ShortCode
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ShortCodeUpdateResponseTest {

    @Test
    fun create() {
        val shortCodeUpdateResponse =
            ShortCodeUpdateResponse.builder()
                .data(
                    ShortCode.builder()
                        .messagingProfileId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                        .id("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                        .countryCode("US")
                        .createdAt(OffsetDateTime.parse("2019-01-23T18:10:02.574Z"))
                        .recordType(ShortCode.RecordType.SHORT_CODE)
                        .shortCode("12345")
                        .addTag("test_customer")
                        .updatedAt(OffsetDateTime.parse("2019-01-23T18:10:02.574Z"))
                        .build()
                )
                .build()

        assertThat(shortCodeUpdateResponse.data())
            .contains(
                ShortCode.builder()
                    .messagingProfileId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                    .id("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                    .countryCode("US")
                    .createdAt(OffsetDateTime.parse("2019-01-23T18:10:02.574Z"))
                    .recordType(ShortCode.RecordType.SHORT_CODE)
                    .shortCode("12345")
                    .addTag("test_customer")
                    .updatedAt(OffsetDateTime.parse("2019-01-23T18:10:02.574Z"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val shortCodeUpdateResponse =
            ShortCodeUpdateResponse.builder()
                .data(
                    ShortCode.builder()
                        .messagingProfileId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                        .id("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                        .countryCode("US")
                        .createdAt(OffsetDateTime.parse("2019-01-23T18:10:02.574Z"))
                        .recordType(ShortCode.RecordType.SHORT_CODE)
                        .shortCode("12345")
                        .addTag("test_customer")
                        .updatedAt(OffsetDateTime.parse("2019-01-23T18:10:02.574Z"))
                        .build()
                )
                .build()

        val roundtrippedShortCodeUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(shortCodeUpdateResponse),
                jacksonTypeRef<ShortCodeUpdateResponse>(),
            )

        assertThat(roundtrippedShortCodeUpdateResponse).isEqualTo(shortCodeUpdateResponse)
    }
}
