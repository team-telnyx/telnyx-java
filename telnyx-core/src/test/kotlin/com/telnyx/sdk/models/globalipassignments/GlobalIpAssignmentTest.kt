// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.globalipassignments

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.networks.InterfaceStatus
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GlobalIpAssignmentTest {

    @Test
    fun create() {
        val globalIpAssignment =
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

        assertThat(globalIpAssignment.id()).contains("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
        assertThat(globalIpAssignment.createdAt()).contains("2018-02-02T22:25:27.521Z")
        assertThat(globalIpAssignment.recordType()).contains("global_ip_assignment")
        assertThat(globalIpAssignment.updatedAt()).contains("2018-02-02T22:25:27.521Z")
        assertThat(globalIpAssignment.globalIpId()).contains("a836125b-20b6-452e-9c03-2653f09c7ed7")
        assertThat(globalIpAssignment.isAnnounced()).contains(true)
        assertThat(globalIpAssignment.isConnected()).contains(true)
        assertThat(globalIpAssignment.isInMaintenance()).contains(true)
        assertThat(globalIpAssignment.status()).contains(InterfaceStatus.PROVISIONED)
        assertThat(globalIpAssignment.wireguardPeerId())
            .contains("e66c496d-4a85-423b-8b2a-8e63fac20320")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val globalIpAssignment =
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

        val roundtrippedGlobalIpAssignment =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(globalIpAssignment),
                jacksonTypeRef<GlobalIpAssignment>(),
            )

        assertThat(roundtrippedGlobalIpAssignment).isEqualTo(globalIpAssignment)
    }
}
