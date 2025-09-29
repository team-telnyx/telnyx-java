// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.globalipassignmentsusage

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GlobalIpAssignmentsUsageRetrieveResponseTest {

    @Test
    fun create() {
        val globalIpAssignmentsUsageRetrieveResponse =
            GlobalIpAssignmentsUsageRetrieveResponse.builder()
                .addData(
                    GlobalIpAssignmentsUsageRetrieveResponse.Data.builder()
                        .globalIp(
                            GlobalIpAssignmentsUsageRetrieveResponse.Data.GlobalIp.builder()
                                .id("a836125b-20b6-452e-9c03-2653f09c7ed7")
                                .ipAddress("64.1.4.130")
                                .build()
                        )
                        .globalIpAssignment(
                            GlobalIpAssignmentsUsageRetrieveResponse.Data.GlobalIpAssignment
                                .builder()
                                .id("a836125b-20b6-452e-9c03-2653f09c7ed7")
                                .wireguardPeer(
                                    GlobalIpAssignmentsUsageRetrieveResponse.Data.GlobalIpAssignment
                                        .WireguardPeer
                                        .builder()
                                        .ipAddress("172.1.0.1")
                                        .name("Wireguard Peer 1")
                                        .build()
                                )
                                .wireguardPeerId("e66c496d-4a85-423b-8b2a-8e63fac20320")
                                .build()
                        )
                        .received(
                            GlobalIpAssignmentsUsageRetrieveResponse.Data.Received.builder()
                                .amount(100000.0)
                                .unit("B")
                                .build()
                        )
                        .timestamp(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                        .transmitted(
                            GlobalIpAssignmentsUsageRetrieveResponse.Data.Transmitted.builder()
                                .amount(100000.0)
                                .unit("B")
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(globalIpAssignmentsUsageRetrieveResponse.data().getOrNull())
            .containsExactly(
                GlobalIpAssignmentsUsageRetrieveResponse.Data.builder()
                    .globalIp(
                        GlobalIpAssignmentsUsageRetrieveResponse.Data.GlobalIp.builder()
                            .id("a836125b-20b6-452e-9c03-2653f09c7ed7")
                            .ipAddress("64.1.4.130")
                            .build()
                    )
                    .globalIpAssignment(
                        GlobalIpAssignmentsUsageRetrieveResponse.Data.GlobalIpAssignment.builder()
                            .id("a836125b-20b6-452e-9c03-2653f09c7ed7")
                            .wireguardPeer(
                                GlobalIpAssignmentsUsageRetrieveResponse.Data.GlobalIpAssignment
                                    .WireguardPeer
                                    .builder()
                                    .ipAddress("172.1.0.1")
                                    .name("Wireguard Peer 1")
                                    .build()
                            )
                            .wireguardPeerId("e66c496d-4a85-423b-8b2a-8e63fac20320")
                            .build()
                    )
                    .received(
                        GlobalIpAssignmentsUsageRetrieveResponse.Data.Received.builder()
                            .amount(100000.0)
                            .unit("B")
                            .build()
                    )
                    .timestamp(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                    .transmitted(
                        GlobalIpAssignmentsUsageRetrieveResponse.Data.Transmitted.builder()
                            .amount(100000.0)
                            .unit("B")
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val globalIpAssignmentsUsageRetrieveResponse =
            GlobalIpAssignmentsUsageRetrieveResponse.builder()
                .addData(
                    GlobalIpAssignmentsUsageRetrieveResponse.Data.builder()
                        .globalIp(
                            GlobalIpAssignmentsUsageRetrieveResponse.Data.GlobalIp.builder()
                                .id("a836125b-20b6-452e-9c03-2653f09c7ed7")
                                .ipAddress("64.1.4.130")
                                .build()
                        )
                        .globalIpAssignment(
                            GlobalIpAssignmentsUsageRetrieveResponse.Data.GlobalIpAssignment
                                .builder()
                                .id("a836125b-20b6-452e-9c03-2653f09c7ed7")
                                .wireguardPeer(
                                    GlobalIpAssignmentsUsageRetrieveResponse.Data.GlobalIpAssignment
                                        .WireguardPeer
                                        .builder()
                                        .ipAddress("172.1.0.1")
                                        .name("Wireguard Peer 1")
                                        .build()
                                )
                                .wireguardPeerId("e66c496d-4a85-423b-8b2a-8e63fac20320")
                                .build()
                        )
                        .received(
                            GlobalIpAssignmentsUsageRetrieveResponse.Data.Received.builder()
                                .amount(100000.0)
                                .unit("B")
                                .build()
                        )
                        .timestamp(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                        .transmitted(
                            GlobalIpAssignmentsUsageRetrieveResponse.Data.Transmitted.builder()
                                .amount(100000.0)
                                .unit("B")
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedGlobalIpAssignmentsUsageRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(globalIpAssignmentsUsageRetrieveResponse),
                jacksonTypeRef<GlobalIpAssignmentsUsageRetrieveResponse>(),
            )

        assertThat(roundtrippedGlobalIpAssignmentsUsageRetrieveResponse)
            .isEqualTo(globalIpAssignmentsUsageRetrieveResponse)
    }
}
