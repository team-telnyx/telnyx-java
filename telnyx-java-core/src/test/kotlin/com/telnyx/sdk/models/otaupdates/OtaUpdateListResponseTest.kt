// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.otaupdates

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OtaUpdateListResponseTest {

    @Test
    fun create() {
        val otaUpdateListResponse =
            OtaUpdateListResponse.builder()
                .addData(
                    OtaUpdateListResponse.Data.builder()
                        .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .recordType("ota_update")
                        .simCardId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .status(OtaUpdateListResponse.Data.Status.IN_PROGRESS)
                        .type(OtaUpdateListResponse.Data.Type.SIM_CARD_NETWORK_PREFERENCES)
                        .updatedAt("2018-02-02T22:25:27.521Z")
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

        assertThat(otaUpdateListResponse.data().getOrNull())
            .containsExactly(
                OtaUpdateListResponse.Data.builder()
                    .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .createdAt("2018-02-02T22:25:27.521Z")
                    .recordType("ota_update")
                    .simCardId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .status(OtaUpdateListResponse.Data.Status.IN_PROGRESS)
                    .type(OtaUpdateListResponse.Data.Type.SIM_CARD_NETWORK_PREFERENCES)
                    .updatedAt("2018-02-02T22:25:27.521Z")
                    .build()
            )
        assertThat(otaUpdateListResponse.meta())
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
        val otaUpdateListResponse =
            OtaUpdateListResponse.builder()
                .addData(
                    OtaUpdateListResponse.Data.builder()
                        .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .recordType("ota_update")
                        .simCardId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .status(OtaUpdateListResponse.Data.Status.IN_PROGRESS)
                        .type(OtaUpdateListResponse.Data.Type.SIM_CARD_NETWORK_PREFERENCES)
                        .updatedAt("2018-02-02T22:25:27.521Z")
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

        val roundtrippedOtaUpdateListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(otaUpdateListResponse),
                jacksonTypeRef<OtaUpdateListResponse>(),
            )

        assertThat(roundtrippedOtaUpdateListResponse).isEqualTo(otaUpdateListResponse)
    }
}
