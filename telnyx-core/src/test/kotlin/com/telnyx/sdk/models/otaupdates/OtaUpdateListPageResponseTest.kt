// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.otaupdates

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OtaUpdateListPageResponseTest {

    @Test
    fun create() {
        val otaUpdateListPageResponse =
            OtaUpdateListPageResponse.builder()
                .addData(
                    OtaUpdateListResponse.builder()
                        .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .recordType("ota_update")
                        .simCardId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .status(OtaUpdateListResponse.Status.IN_PROGRESS)
                        .type(OtaUpdateListResponse.Type.SIM_CARD_NETWORK_PREFERENCES)
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

        assertThat(otaUpdateListPageResponse.data().getOrNull())
            .containsExactly(
                OtaUpdateListResponse.builder()
                    .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .createdAt("2018-02-02T22:25:27.521Z")
                    .recordType("ota_update")
                    .simCardId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .status(OtaUpdateListResponse.Status.IN_PROGRESS)
                    .type(OtaUpdateListResponse.Type.SIM_CARD_NETWORK_PREFERENCES)
                    .updatedAt("2018-02-02T22:25:27.521Z")
                    .build()
            )
        assertThat(otaUpdateListPageResponse.meta())
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
        val otaUpdateListPageResponse =
            OtaUpdateListPageResponse.builder()
                .addData(
                    OtaUpdateListResponse.builder()
                        .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .recordType("ota_update")
                        .simCardId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .status(OtaUpdateListResponse.Status.IN_PROGRESS)
                        .type(OtaUpdateListResponse.Type.SIM_CARD_NETWORK_PREFERENCES)
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

        val roundtrippedOtaUpdateListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(otaUpdateListPageResponse),
                jacksonTypeRef<OtaUpdateListPageResponse>(),
            )

        assertThat(roundtrippedOtaUpdateListPageResponse).isEqualTo(otaUpdateListPageResponse)
    }
}
