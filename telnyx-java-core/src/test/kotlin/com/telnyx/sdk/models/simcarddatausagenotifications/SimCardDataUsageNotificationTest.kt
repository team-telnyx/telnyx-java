// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.simcarddatausagenotifications

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SimCardDataUsageNotificationTest {

    @Test
    fun create() {
        val simCardDataUsageNotification =
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

        assertThat(simCardDataUsageNotification.id())
            .contains("79228acc-3f08-4e70-ac68-cb5aae8b537a")
        assertThat(simCardDataUsageNotification.createdAt()).contains("2018-02-02T22:25:27.521Z")
        assertThat(simCardDataUsageNotification.recordType())
            .contains("sim_card_data_usage_notification")
        assertThat(simCardDataUsageNotification.simCardId())
            .contains("b34c1683-cd85-4493-b9a5-315eb4bc5e19")
        assertThat(simCardDataUsageNotification.threshold())
            .contains(
                SimCardDataUsageNotification.Threshold.builder()
                    .amount("2048.0")
                    .unit(SimCardDataUsageNotification.Threshold.Unit.MB)
                    .build()
            )
        assertThat(simCardDataUsageNotification.updatedAt()).contains("2018-02-02T22:25:27.521Z")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val simCardDataUsageNotification =
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

        val roundtrippedSimCardDataUsageNotification =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(simCardDataUsageNotification),
                jacksonTypeRef<SimCardDataUsageNotification>(),
            )

        assertThat(roundtrippedSimCardDataUsageNotification).isEqualTo(simCardDataUsageNotification)
    }
}
