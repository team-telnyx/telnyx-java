// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.portingorders

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import com.telnyx.api.models.authenticationproviders.PaginationMeta
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PortingOrderRetrieveAllowedFocWindowsResponseTest {

    @Test
    fun create() {
        val portingOrderRetrieveAllowedFocWindowsResponse =
            PortingOrderRetrieveAllowedFocWindowsResponse.builder()
                .addData(
                    PortingOrderRetrieveAllowedFocWindowsResponse.Data.builder()
                        .endedAt(OffsetDateTime.parse("2021-03-19T10:07:15.527Z"))
                        .recordType("porting_order")
                        .startedAt(OffsetDateTime.parse("2021-03-19T10:07:15.527Z"))
                        .build()
                )
                .meta(
                    PaginationMeta.builder()
                        .pageNumber(2L)
                        .pageSize(25L)
                        .totalPages(3L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        assertThat(portingOrderRetrieveAllowedFocWindowsResponse.data().getOrNull())
            .containsExactly(
                PortingOrderRetrieveAllowedFocWindowsResponse.Data.builder()
                    .endedAt(OffsetDateTime.parse("2021-03-19T10:07:15.527Z"))
                    .recordType("porting_order")
                    .startedAt(OffsetDateTime.parse("2021-03-19T10:07:15.527Z"))
                    .build()
            )
        assertThat(portingOrderRetrieveAllowedFocWindowsResponse.meta())
            .contains(
                PaginationMeta.builder()
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
        val portingOrderRetrieveAllowedFocWindowsResponse =
            PortingOrderRetrieveAllowedFocWindowsResponse.builder()
                .addData(
                    PortingOrderRetrieveAllowedFocWindowsResponse.Data.builder()
                        .endedAt(OffsetDateTime.parse("2021-03-19T10:07:15.527Z"))
                        .recordType("porting_order")
                        .startedAt(OffsetDateTime.parse("2021-03-19T10:07:15.527Z"))
                        .build()
                )
                .meta(
                    PaginationMeta.builder()
                        .pageNumber(2L)
                        .pageSize(25L)
                        .totalPages(3L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        val roundtrippedPortingOrderRetrieveAllowedFocWindowsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(portingOrderRetrieveAllowedFocWindowsResponse),
                jacksonTypeRef<PortingOrderRetrieveAllowedFocWindowsResponse>(),
            )

        assertThat(roundtrippedPortingOrderRetrieveAllowedFocWindowsResponse)
            .isEqualTo(portingOrderRetrieveAllowedFocWindowsResponse)
    }
}
