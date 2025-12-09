// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.shortcodes

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.ShortCode
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ShortCodeListResponseTest {

    @Test
    fun create() {
        val shortCodeListResponse =
            ShortCodeListResponse.builder()
                .addData(
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
                .meta(
                    ShortCodeListResponse.Meta.builder()
                        .pageNumber(2L)
                        .pageSize(25L)
                        .totalPages(3L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        assertThat(shortCodeListResponse.data().getOrNull())
            .containsExactly(
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
        assertThat(shortCodeListResponse.meta())
            .contains(
                ShortCodeListResponse.Meta.builder()
                    .pageNumber(2L)
                    .pageSize(25L)
                    .totalPages(3L)
                    .totalResults(55L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val shortCodeListResponse =
            ShortCodeListResponse.builder()
                .addData(
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
                .meta(
                    ShortCodeListResponse.Meta.builder()
                        .pageNumber(2L)
                        .pageSize(25L)
                        .totalPages(3L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        val roundtrippedShortCodeListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(shortCodeListResponse),
                jacksonTypeRef<ShortCodeListResponse>(),
            )

        assertThat(roundtrippedShortCodeListResponse).isEqualTo(shortCodeListResponse)
    }
}
