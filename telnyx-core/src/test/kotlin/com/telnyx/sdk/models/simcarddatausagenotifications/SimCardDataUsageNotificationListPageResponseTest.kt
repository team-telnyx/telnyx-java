// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.simcarddatausagenotifications

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SimCardDataUsageNotificationListPageResponseTest {

    @Test
    fun create() {
        val simCardDataUsageNotificationListPageResponse =
            SimCardDataUsageNotificationListPageResponse.builder()
                .addData(
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
                .meta(
                    PaginationMeta.builder()
                        .pageNumber(2L)
                        .totalPages(3L)
                        .pageSize(25L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        assertThat(simCardDataUsageNotificationListPageResponse.data().getOrNull())
            .containsExactly(
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
        assertThat(simCardDataUsageNotificationListPageResponse.meta())
            .contains(
                PaginationMeta.builder()
                    .pageNumber(2L)
                    .totalPages(3L)
                    .pageSize(25L)
                    .totalResults(55L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val simCardDataUsageNotificationListPageResponse =
            SimCardDataUsageNotificationListPageResponse.builder()
                .addData(
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
                .meta(
                    PaginationMeta.builder()
                        .pageNumber(2L)
                        .totalPages(3L)
                        .pageSize(25L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        val roundtrippedSimCardDataUsageNotificationListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(simCardDataUsageNotificationListPageResponse),
                jacksonTypeRef<SimCardDataUsageNotificationListPageResponse>(),
            )

        assertThat(roundtrippedSimCardDataUsageNotificationListPageResponse)
            .isEqualTo(simCardDataUsageNotificationListPageResponse)
    }
}
