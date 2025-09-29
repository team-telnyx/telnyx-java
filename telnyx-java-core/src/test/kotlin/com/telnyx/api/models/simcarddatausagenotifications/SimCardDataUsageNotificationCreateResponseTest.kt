// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.simcarddatausagenotifications

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SimCardDataUsageNotificationCreateResponseTest {

    @Test
    fun create() {
        val simCardDataUsageNotificationCreateResponse =
            SimCardDataUsageNotificationCreateResponse.builder()
                .data(
                    SimCardDataUsageNotification.builder()
                        .id("79228acc-3f08-4e70-ac68-cb5aae8b537a")
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .recordType("sim_card_data_usage_notification")
                        .simCardId("b34c1683-cd85-4493-b9a5-315eb4bc5e19")
                        .threshold(
                            SimCardDataUsageNotification.Threshold.builder()
                                .amount("2048.0")
                                .unit(SimCardDataUsageNotification.Threshold.Unit.MB)
                                .build()
                        )
                        .updatedAt("2018-02-02T22:25:27.521Z")
                        .build()
                )
                .build()

        assertThat(simCardDataUsageNotificationCreateResponse.data())
            .contains(
                SimCardDataUsageNotification.builder()
                    .id("79228acc-3f08-4e70-ac68-cb5aae8b537a")
                    .createdAt("2018-02-02T22:25:27.521Z")
                    .recordType("sim_card_data_usage_notification")
                    .simCardId("b34c1683-cd85-4493-b9a5-315eb4bc5e19")
                    .threshold(
                        SimCardDataUsageNotification.Threshold.builder()
                            .amount("2048.0")
                            .unit(SimCardDataUsageNotification.Threshold.Unit.MB)
                            .build()
                    )
                    .updatedAt("2018-02-02T22:25:27.521Z")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val simCardDataUsageNotificationCreateResponse =
            SimCardDataUsageNotificationCreateResponse.builder()
                .data(
                    SimCardDataUsageNotification.builder()
                        .id("79228acc-3f08-4e70-ac68-cb5aae8b537a")
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .recordType("sim_card_data_usage_notification")
                        .simCardId("b34c1683-cd85-4493-b9a5-315eb4bc5e19")
                        .threshold(
                            SimCardDataUsageNotification.Threshold.builder()
                                .amount("2048.0")
                                .unit(SimCardDataUsageNotification.Threshold.Unit.MB)
                                .build()
                        )
                        .updatedAt("2018-02-02T22:25:27.521Z")
                        .build()
                )
                .build()

        val roundtrippedSimCardDataUsageNotificationCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(simCardDataUsageNotificationCreateResponse),
                jacksonTypeRef<SimCardDataUsageNotificationCreateResponse>(),
            )

        assertThat(roundtrippedSimCardDataUsageNotificationCreateResponse)
            .isEqualTo(simCardDataUsageNotificationCreateResponse)
    }
}
