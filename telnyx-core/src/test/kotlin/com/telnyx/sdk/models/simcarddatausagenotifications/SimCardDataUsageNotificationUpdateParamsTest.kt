// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.simcarddatausagenotifications

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SimCardDataUsageNotificationUpdateParamsTest {

    @Test
    fun create() {
        SimCardDataUsageNotificationUpdateParams.builder()
            .simCardDataUsageNotificationId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
            .simCardDataUsageNotification(
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
    }

    @Test
    fun pathParams() {
        val params =
            SimCardDataUsageNotificationUpdateParams.builder()
                .simCardDataUsageNotificationId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .simCardDataUsageNotification(SimCardDataUsageNotification.builder().build())
                .build()

        assertThat(params._pathParam(0)).isEqualTo("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            SimCardDataUsageNotificationUpdateParams.builder()
                .simCardDataUsageNotificationId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .simCardDataUsageNotification(
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

        val body = params._body()

        assertThat(body)
            .isEqualTo(
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
    fun bodyWithoutOptionalFields() {
        val params =
            SimCardDataUsageNotificationUpdateParams.builder()
                .simCardDataUsageNotificationId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .simCardDataUsageNotification(SimCardDataUsageNotification.builder().build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(SimCardDataUsageNotification.builder().build())
    }
}
