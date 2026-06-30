// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.otaupdates

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OtaUpdateRetrieveResponseTest {

    @Test
    fun create() {
        val otaUpdateRetrieveResponse =
            OtaUpdateRetrieveResponse.builder()
                .data(
                    OtaUpdateRetrieveResponse.Data.builder()
                        .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .recordType("ota_update")
                        .settings(
                            OtaUpdateRetrieveResponse.Data.Settings.builder()
                                .addMobileNetworkOperatorsPreference(
                                    OtaUpdateRetrieveResponse.Data.Settings
                                        .MobileNetworkOperatorsPreference
                                        .builder()
                                        .mobileNetworkOperatorId(
                                            "6a09cdc3-8948-47f0-aa62-74ac943d6c58"
                                        )
                                        .mobileNetworkOperatorName("AT&T Mobility (USACG)")
                                        .priority(0L)
                                        .build()
                                )
                                .build()
                        )
                        .simCardId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .status(OtaUpdateRetrieveResponse.Data.Status.IN_PROGRESS)
                        .type(OtaUpdateRetrieveResponse.Data.Type.SIM_CARD_NETWORK_PREFERENCES)
                        .updatedAt("2018-02-02T22:25:27.521Z")
                        .build()
                )
                .build()

        assertThat(otaUpdateRetrieveResponse.data())
            .contains(
                OtaUpdateRetrieveResponse.Data.builder()
                    .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .createdAt("2018-02-02T22:25:27.521Z")
                    .recordType("ota_update")
                    .settings(
                        OtaUpdateRetrieveResponse.Data.Settings.builder()
                            .addMobileNetworkOperatorsPreference(
                                OtaUpdateRetrieveResponse.Data.Settings
                                    .MobileNetworkOperatorsPreference
                                    .builder()
                                    .mobileNetworkOperatorId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                                    .mobileNetworkOperatorName("AT&T Mobility (USACG)")
                                    .priority(0L)
                                    .build()
                            )
                            .build()
                    )
                    .simCardId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .status(OtaUpdateRetrieveResponse.Data.Status.IN_PROGRESS)
                    .type(OtaUpdateRetrieveResponse.Data.Type.SIM_CARD_NETWORK_PREFERENCES)
                    .updatedAt("2018-02-02T22:25:27.521Z")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val otaUpdateRetrieveResponse =
            OtaUpdateRetrieveResponse.builder()
                .data(
                    OtaUpdateRetrieveResponse.Data.builder()
                        .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .recordType("ota_update")
                        .settings(
                            OtaUpdateRetrieveResponse.Data.Settings.builder()
                                .addMobileNetworkOperatorsPreference(
                                    OtaUpdateRetrieveResponse.Data.Settings
                                        .MobileNetworkOperatorsPreference
                                        .builder()
                                        .mobileNetworkOperatorId(
                                            "6a09cdc3-8948-47f0-aa62-74ac943d6c58"
                                        )
                                        .mobileNetworkOperatorName("AT&T Mobility (USACG)")
                                        .priority(0L)
                                        .build()
                                )
                                .build()
                        )
                        .simCardId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .status(OtaUpdateRetrieveResponse.Data.Status.IN_PROGRESS)
                        .type(OtaUpdateRetrieveResponse.Data.Type.SIM_CARD_NETWORK_PREFERENCES)
                        .updatedAt("2018-02-02T22:25:27.521Z")
                        .build()
                )
                .build()

        val roundtrippedOtaUpdateRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(otaUpdateRetrieveResponse),
                jacksonTypeRef<OtaUpdateRetrieveResponse>(),
            )

        assertThat(roundtrippedOtaUpdateRetrieveResponse).isEqualTo(otaUpdateRetrieveResponse)
    }
}
