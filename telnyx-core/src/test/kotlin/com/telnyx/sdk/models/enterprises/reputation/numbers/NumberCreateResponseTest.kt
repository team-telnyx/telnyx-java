// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.enterprises.reputation.numbers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NumberCreateResponseTest {

    @Test
    fun create() {
        val numberCreateResponse =
            NumberCreateResponse.builder()
                .addData(
                    NumberCreateResponse.Data.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .enterpriseId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .phoneNumber("+16035551234")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .meta(
                    NumberCreateResponse.Meta.builder()
                        .pageNumber(0L)
                        .pageSize(0L)
                        .totalPages(0L)
                        .totalResults(0L)
                        .build()
                )
                .build()

        assertThat(numberCreateResponse.data().getOrNull())
            .containsExactly(
                NumberCreateResponse.Data.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .enterpriseId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .phoneNumber("+16035551234")
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(numberCreateResponse.meta())
            .contains(
                NumberCreateResponse.Meta.builder()
                    .pageNumber(0L)
                    .pageSize(0L)
                    .totalPages(0L)
                    .totalResults(0L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val numberCreateResponse =
            NumberCreateResponse.builder()
                .addData(
                    NumberCreateResponse.Data.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .enterpriseId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .phoneNumber("+16035551234")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .meta(
                    NumberCreateResponse.Meta.builder()
                        .pageNumber(0L)
                        .pageSize(0L)
                        .totalPages(0L)
                        .totalResults(0L)
                        .build()
                )
                .build()

        val roundtrippedNumberCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(numberCreateResponse),
                jacksonTypeRef<NumberCreateResponse>(),
            )

        assertThat(roundtrippedNumberCreateResponse).isEqualTo(numberCreateResponse)
    }
}
