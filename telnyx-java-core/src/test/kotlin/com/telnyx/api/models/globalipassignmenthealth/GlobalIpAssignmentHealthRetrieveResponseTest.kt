// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.globalipassignmenthealth

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GlobalIpAssignmentHealthRetrieveResponseTest {

    @Test
    fun create() {
        val globalIpAssignmentHealthRetrieveResponse =
            GlobalIpAssignmentHealthRetrieveResponse.builder()
                .addData(
                    GlobalIpAssignmentHealthRetrieveResponse.Data.builder()
                        .globalIp(
                            GlobalIpAssignmentHealthRetrieveResponse.Data.GlobalIp.builder()
                                .id("a836125b-20b6-452e-9c03-2653f09c7ed7")
                                .ipAddress("ip_address")
                                .build()
                        )
                        .globalIpAssignment(
                            GlobalIpAssignmentHealthRetrieveResponse.Data.GlobalIpAssignment
                                .builder()
                                .id("a836125b-20b6-452e-9c03-2653f09c7ed7")
                                .wireguardPeer(
                                    GlobalIpAssignmentHealthRetrieveResponse.Data.GlobalIpAssignment
                                        .WireguardPeer
                                        .builder()
                                        .ipAddress("73.47.1.23")
                                        .name("Wireguard Peer 1")
                                        .build()
                                )
                                .wireguardPeerId("e66c496d-4a85-423b-8b2a-8e63fac20320")
                                .build()
                        )
                        .health(
                            GlobalIpAssignmentHealthRetrieveResponse.Data.Health.builder()
                                .fail(0.0)
                                .pass(100.0)
                                .build()
                        )
                        .timestamp(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                        .build()
                )
                .build()

        assertThat(globalIpAssignmentHealthRetrieveResponse.data().getOrNull())
            .containsExactly(
                GlobalIpAssignmentHealthRetrieveResponse.Data.builder()
                    .globalIp(
                        GlobalIpAssignmentHealthRetrieveResponse.Data.GlobalIp.builder()
                            .id("a836125b-20b6-452e-9c03-2653f09c7ed7")
                            .ipAddress("ip_address")
                            .build()
                    )
                    .globalIpAssignment(
                        GlobalIpAssignmentHealthRetrieveResponse.Data.GlobalIpAssignment.builder()
                            .id("a836125b-20b6-452e-9c03-2653f09c7ed7")
                            .wireguardPeer(
                                GlobalIpAssignmentHealthRetrieveResponse.Data.GlobalIpAssignment
                                    .WireguardPeer
                                    .builder()
                                    .ipAddress("73.47.1.23")
                                    .name("Wireguard Peer 1")
                                    .build()
                            )
                            .wireguardPeerId("e66c496d-4a85-423b-8b2a-8e63fac20320")
                            .build()
                    )
                    .health(
                        GlobalIpAssignmentHealthRetrieveResponse.Data.Health.builder()
                            .fail(0.0)
                            .pass(100.0)
                            .build()
                    )
                    .timestamp(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val globalIpAssignmentHealthRetrieveResponse =
            GlobalIpAssignmentHealthRetrieveResponse.builder()
                .addData(
                    GlobalIpAssignmentHealthRetrieveResponse.Data.builder()
                        .globalIp(
                            GlobalIpAssignmentHealthRetrieveResponse.Data.GlobalIp.builder()
                                .id("a836125b-20b6-452e-9c03-2653f09c7ed7")
                                .ipAddress("ip_address")
                                .build()
                        )
                        .globalIpAssignment(
                            GlobalIpAssignmentHealthRetrieveResponse.Data.GlobalIpAssignment
                                .builder()
                                .id("a836125b-20b6-452e-9c03-2653f09c7ed7")
                                .wireguardPeer(
                                    GlobalIpAssignmentHealthRetrieveResponse.Data.GlobalIpAssignment
                                        .WireguardPeer
                                        .builder()
                                        .ipAddress("73.47.1.23")
                                        .name("Wireguard Peer 1")
                                        .build()
                                )
                                .wireguardPeerId("e66c496d-4a85-423b-8b2a-8e63fac20320")
                                .build()
                        )
                        .health(
                            GlobalIpAssignmentHealthRetrieveResponse.Data.Health.builder()
                                .fail(0.0)
                                .pass(100.0)
                                .build()
                        )
                        .timestamp(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                        .build()
                )
                .build()

        val roundtrippedGlobalIpAssignmentHealthRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(globalIpAssignmentHealthRetrieveResponse),
                jacksonTypeRef<GlobalIpAssignmentHealthRetrieveResponse>(),
            )

        assertThat(roundtrippedGlobalIpAssignmentHealthRetrieveResponse)
            .isEqualTo(globalIpAssignmentHealthRetrieveResponse)
    }
}
