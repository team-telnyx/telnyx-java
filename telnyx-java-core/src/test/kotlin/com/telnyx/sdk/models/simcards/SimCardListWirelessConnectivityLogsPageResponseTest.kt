// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.simcards

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SimCardListWirelessConnectivityLogsPageResponseTest {

    @Test
    fun create() {
        val simCardListWirelessConnectivityLogsPageResponse =
            SimCardListWirelessConnectivityLogsPageResponse.builder()
                .addData(
                    SimCardListWirelessConnectivityLogsResponse.builder()
                        .id(137509451L)
                        .apn("data00.telnyx")
                        .cellId("311210-6813")
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .imei("490154203237518")
                        .imsi("081932214823362973")
                        .ipv4("192.168.0.0")
                        .ipv6("2001:cdba:0000:0000:0000:0000:3257:9652")
                        .lastSeen("2018-02-02T22:25:27.521Z")
                        .logType(SimCardListWirelessConnectivityLogsResponse.LogType.REGISTRATION)
                        .mobileCountryCode("310")
                        .mobileNetworkCode("410")
                        .radioAccessTechnology("LTE")
                        .recordType("wireless_connectivity_log")
                        .simCardId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .startTime("2018-02-02T22:25:27.521Z")
                        .state("provisioned")
                        .stopTime("2018-02-02T22:25:27.521Z")
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

        assertThat(simCardListWirelessConnectivityLogsPageResponse.data().getOrNull())
            .containsExactly(
                SimCardListWirelessConnectivityLogsResponse.builder()
                    .id(137509451L)
                    .apn("data00.telnyx")
                    .cellId("311210-6813")
                    .createdAt("2018-02-02T22:25:27.521Z")
                    .imei("490154203237518")
                    .imsi("081932214823362973")
                    .ipv4("192.168.0.0")
                    .ipv6("2001:cdba:0000:0000:0000:0000:3257:9652")
                    .lastSeen("2018-02-02T22:25:27.521Z")
                    .logType(SimCardListWirelessConnectivityLogsResponse.LogType.REGISTRATION)
                    .mobileCountryCode("310")
                    .mobileNetworkCode("410")
                    .radioAccessTechnology("LTE")
                    .recordType("wireless_connectivity_log")
                    .simCardId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .startTime("2018-02-02T22:25:27.521Z")
                    .state("provisioned")
                    .stopTime("2018-02-02T22:25:27.521Z")
                    .build()
            )
        assertThat(simCardListWirelessConnectivityLogsPageResponse.meta())
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
        val simCardListWirelessConnectivityLogsPageResponse =
            SimCardListWirelessConnectivityLogsPageResponse.builder()
                .addData(
                    SimCardListWirelessConnectivityLogsResponse.builder()
                        .id(137509451L)
                        .apn("data00.telnyx")
                        .cellId("311210-6813")
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .imei("490154203237518")
                        .imsi("081932214823362973")
                        .ipv4("192.168.0.0")
                        .ipv6("2001:cdba:0000:0000:0000:0000:3257:9652")
                        .lastSeen("2018-02-02T22:25:27.521Z")
                        .logType(SimCardListWirelessConnectivityLogsResponse.LogType.REGISTRATION)
                        .mobileCountryCode("310")
                        .mobileNetworkCode("410")
                        .radioAccessTechnology("LTE")
                        .recordType("wireless_connectivity_log")
                        .simCardId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .startTime("2018-02-02T22:25:27.521Z")
                        .state("provisioned")
                        .stopTime("2018-02-02T22:25:27.521Z")
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

        val roundtrippedSimCardListWirelessConnectivityLogsPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(simCardListWirelessConnectivityLogsPageResponse),
                jacksonTypeRef<SimCardListWirelessConnectivityLogsPageResponse>(),
            )

        assertThat(roundtrippedSimCardListWirelessConnectivityLogsPageResponse)
            .isEqualTo(simCardListWirelessConnectivityLogsPageResponse)
    }
}
