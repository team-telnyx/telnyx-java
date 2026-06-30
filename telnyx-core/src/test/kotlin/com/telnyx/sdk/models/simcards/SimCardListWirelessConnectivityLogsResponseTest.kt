// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.simcards

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SimCardListWirelessConnectivityLogsResponseTest {

    @Test
    fun create() {
        val simCardListWirelessConnectivityLogsResponse =
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

        assertThat(simCardListWirelessConnectivityLogsResponse.id()).contains(137509451L)
        assertThat(simCardListWirelessConnectivityLogsResponse.apn()).contains("data00.telnyx")
        assertThat(simCardListWirelessConnectivityLogsResponse.cellId()).contains("311210-6813")
        assertThat(simCardListWirelessConnectivityLogsResponse.createdAt())
            .contains("2018-02-02T22:25:27.521Z")
        assertThat(simCardListWirelessConnectivityLogsResponse.imei()).contains("490154203237518")
        assertThat(simCardListWirelessConnectivityLogsResponse.imsi())
            .contains("081932214823362973")
        assertThat(simCardListWirelessConnectivityLogsResponse.ipv4()).contains("192.168.0.0")
        assertThat(simCardListWirelessConnectivityLogsResponse.ipv6())
            .contains("2001:cdba:0000:0000:0000:0000:3257:9652")
        assertThat(simCardListWirelessConnectivityLogsResponse.lastSeen())
            .contains("2018-02-02T22:25:27.521Z")
        assertThat(simCardListWirelessConnectivityLogsResponse.logType())
            .contains(SimCardListWirelessConnectivityLogsResponse.LogType.REGISTRATION)
        assertThat(simCardListWirelessConnectivityLogsResponse.mobileCountryCode()).contains("310")
        assertThat(simCardListWirelessConnectivityLogsResponse.mobileNetworkCode()).contains("410")
        assertThat(simCardListWirelessConnectivityLogsResponse.radioAccessTechnology())
            .contains("LTE")
        assertThat(simCardListWirelessConnectivityLogsResponse.recordType())
            .contains("wireless_connectivity_log")
        assertThat(simCardListWirelessConnectivityLogsResponse.simCardId())
            .contains("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
        assertThat(simCardListWirelessConnectivityLogsResponse.startTime())
            .contains("2018-02-02T22:25:27.521Z")
        assertThat(simCardListWirelessConnectivityLogsResponse.state()).contains("provisioned")
        assertThat(simCardListWirelessConnectivityLogsResponse.stopTime())
            .contains("2018-02-02T22:25:27.521Z")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val simCardListWirelessConnectivityLogsResponse =
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

        val roundtrippedSimCardListWirelessConnectivityLogsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(simCardListWirelessConnectivityLogsResponse),
                jacksonTypeRef<SimCardListWirelessConnectivityLogsResponse>(),
            )

        assertThat(roundtrippedSimCardListWirelessConnectivityLogsResponse)
            .isEqualTo(simCardListWirelessConnectivityLogsResponse)
    }
}
