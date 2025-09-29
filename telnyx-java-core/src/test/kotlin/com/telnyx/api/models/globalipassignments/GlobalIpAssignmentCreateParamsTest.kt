// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.globalipassignments

import com.telnyx.api.models.networks.InterfaceStatus
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GlobalIpAssignmentCreateParamsTest {

    @Test
    fun create() {
        GlobalIpAssignmentCreateParams.builder()
            .globalIpAssignment(
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
    }

    @Test
    fun body() {
        val params =
            GlobalIpAssignmentCreateParams.builder()
                .globalIpAssignment(
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

        val body = params._body()

        assertThat(body)
            .isEqualTo(
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
    fun bodyWithoutOptionalFields() {
        val params =
            GlobalIpAssignmentCreateParams.builder()
                .globalIpAssignment(GlobalIpAssignment.builder().build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(GlobalIpAssignment.builder().build())
    }
}
