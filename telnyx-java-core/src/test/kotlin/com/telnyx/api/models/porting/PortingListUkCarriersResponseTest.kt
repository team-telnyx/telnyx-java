// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.porting

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PortingListUkCarriersResponseTest {

    @Test
    fun create() {
        val portingListUkCarriersResponse =
            PortingListUkCarriersResponse.builder()
                .addData(
                    PortingListUkCarriersResponse.Data.builder()
                        .id("96dfa9e4-c753-4fd3-97cd-42d66f26cf0c")
                        .addAlternativeCupid("895")
                        .createdAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                        .cupid("895")
                        .name("Telnyx UK Limited")
                        .recordType("porting_uk_carrier")
                        .updatedAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                        .build()
                )
                .build()

        assertThat(portingListUkCarriersResponse.data().getOrNull())
            .containsExactly(
                PortingListUkCarriersResponse.Data.builder()
                    .id("96dfa9e4-c753-4fd3-97cd-42d66f26cf0c")
                    .addAlternativeCupid("895")
                    .createdAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                    .cupid("895")
                    .name("Telnyx UK Limited")
                    .recordType("porting_uk_carrier")
                    .updatedAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val portingListUkCarriersResponse =
            PortingListUkCarriersResponse.builder()
                .addData(
                    PortingListUkCarriersResponse.Data.builder()
                        .id("96dfa9e4-c753-4fd3-97cd-42d66f26cf0c")
                        .addAlternativeCupid("895")
                        .createdAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                        .cupid("895")
                        .name("Telnyx UK Limited")
                        .recordType("porting_uk_carrier")
                        .updatedAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                        .build()
                )
                .build()

        val roundtrippedPortingListUkCarriersResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(portingListUkCarriersResponse),
                jacksonTypeRef<PortingListUkCarriersResponse>(),
            )

        assertThat(roundtrippedPortingListUkCarriersResponse)
            .isEqualTo(portingListUkCarriersResponse)
    }
}
