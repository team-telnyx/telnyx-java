// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.simcarddatausagenotifications

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SimCardDataUsageNotificationCreateParamsTest {

    @Test
    fun create() {
        SimCardDataUsageNotificationCreateParams.builder()
            .simCardId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
            .threshold(
                SimCardDataUsageNotificationCreateParams.Threshold.builder()
                    .amount("2048.1")
                    .unit(SimCardDataUsageNotificationCreateParams.Threshold.Unit.MB)
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            SimCardDataUsageNotificationCreateParams.builder()
                .simCardId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .threshold(
                    SimCardDataUsageNotificationCreateParams.Threshold.builder()
                        .amount("2048.1")
                        .unit(SimCardDataUsageNotificationCreateParams.Threshold.Unit.MB)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.simCardId()).isEqualTo("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
        assertThat(body.threshold())
            .isEqualTo(
                SimCardDataUsageNotificationCreateParams.Threshold.builder()
                    .amount("2048.1")
                    .unit(SimCardDataUsageNotificationCreateParams.Threshold.Unit.MB)
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            SimCardDataUsageNotificationCreateParams.builder()
                .simCardId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .threshold(SimCardDataUsageNotificationCreateParams.Threshold.builder().build())
                .build()

        val body = params._body()

        assertThat(body.simCardId()).isEqualTo("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
        assertThat(body.threshold())
            .isEqualTo(SimCardDataUsageNotificationCreateParams.Threshold.builder().build())
    }
}
