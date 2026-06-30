// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.otaupdates

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OtaUpdateListResponseTest {

    @Test
    fun create() {
        val otaUpdateListResponse =
            OtaUpdateListResponse.builder()
                .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .createdAt("2018-02-02T22:25:27.521Z")
                .recordType("ota_update")
                .simCardId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .status(OtaUpdateListResponse.Status.IN_PROGRESS)
                .type(OtaUpdateListResponse.Type.SIM_CARD_NETWORK_PREFERENCES)
                .updatedAt("2018-02-02T22:25:27.521Z")
                .build()

        assertThat(otaUpdateListResponse.id()).contains("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
        assertThat(otaUpdateListResponse.createdAt()).contains("2018-02-02T22:25:27.521Z")
        assertThat(otaUpdateListResponse.recordType()).contains("ota_update")
        assertThat(otaUpdateListResponse.simCardId())
            .contains("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
        assertThat(otaUpdateListResponse.status())
            .contains(OtaUpdateListResponse.Status.IN_PROGRESS)
        assertThat(otaUpdateListResponse.type())
            .contains(OtaUpdateListResponse.Type.SIM_CARD_NETWORK_PREFERENCES)
        assertThat(otaUpdateListResponse.updatedAt()).contains("2018-02-02T22:25:27.521Z")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val otaUpdateListResponse =
            OtaUpdateListResponse.builder()
                .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .createdAt("2018-02-02T22:25:27.521Z")
                .recordType("ota_update")
                .simCardId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .status(OtaUpdateListResponse.Status.IN_PROGRESS)
                .type(OtaUpdateListResponse.Type.SIM_CARD_NETWORK_PREFERENCES)
                .updatedAt("2018-02-02T22:25:27.521Z")
                .build()

        val roundtrippedOtaUpdateListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(otaUpdateListResponse),
                jacksonTypeRef<OtaUpdateListResponse>(),
            )

        assertThat(roundtrippedOtaUpdateListResponse).isEqualTo(otaUpdateListResponse)
    }
}
