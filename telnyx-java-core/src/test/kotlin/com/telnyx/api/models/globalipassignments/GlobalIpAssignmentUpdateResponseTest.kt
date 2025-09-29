// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.globalipassignments

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import com.telnyx.api.models.networks.InterfaceStatus
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GlobalIpAssignmentUpdateResponseTest {

    @Test
    fun create() {
        val globalIpAssignmentUpdateResponse =
            GlobalIpAssignmentUpdateResponse.builder()
                .data(
                    GlobalIpAssignment.builder()
                        .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .recordType("global_ip_assignment")
                        .updatedAt("2018-02-02T22:25:27.521Z")
                        .globalIpId("a836125b-20b6-452e-9c03-2653f09c7ed7")
                        .isAnnounced(true)
                        .isConnected(true)
                        .isInMaintenance(true)
                        .status(InterfaceStatus.PROVISIONED)
                        .wireguardPeerId("e66c496d-4a85-423b-8b2a-8e63fac20320")
                        .build()
                )
                .build()

        assertThat(globalIpAssignmentUpdateResponse.data())
            .contains(
                GlobalIpAssignment.builder()
                    .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .createdAt("2018-02-02T22:25:27.521Z")
                    .recordType("global_ip_assignment")
                    .updatedAt("2018-02-02T22:25:27.521Z")
                    .globalIpId("a836125b-20b6-452e-9c03-2653f09c7ed7")
                    .isAnnounced(true)
                    .isConnected(true)
                    .isInMaintenance(true)
                    .status(InterfaceStatus.PROVISIONED)
                    .wireguardPeerId("e66c496d-4a85-423b-8b2a-8e63fac20320")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val globalIpAssignmentUpdateResponse =
            GlobalIpAssignmentUpdateResponse.builder()
                .data(
                    GlobalIpAssignment.builder()
                        .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .recordType("global_ip_assignment")
                        .updatedAt("2018-02-02T22:25:27.521Z")
                        .globalIpId("a836125b-20b6-452e-9c03-2653f09c7ed7")
                        .isAnnounced(true)
                        .isConnected(true)
                        .isInMaintenance(true)
                        .status(InterfaceStatus.PROVISIONED)
                        .wireguardPeerId("e66c496d-4a85-423b-8b2a-8e63fac20320")
                        .build()
                )
                .build()

        val roundtrippedGlobalIpAssignmentUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(globalIpAssignmentUpdateResponse),
                jacksonTypeRef<GlobalIpAssignmentUpdateResponse>(),
            )

        assertThat(roundtrippedGlobalIpAssignmentUpdateResponse)
            .isEqualTo(globalIpAssignmentUpdateResponse)
    }
}
