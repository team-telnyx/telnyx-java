// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.globalipassignments

import com.telnyx.api.models.networks.InterfaceStatus
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GlobalIpAssignmentUpdateParamsTest {

    @Test
    fun create() {
        GlobalIpAssignmentUpdateParams.builder()
            .pathId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
            .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
            .createdAt("2018-02-02T22:25:27.521Z")
            .recordType("sample_record_type")
            .updatedAt("2018-02-02T22:25:27.521Z")
            .globalIpId("a836125b-20b6-452e-9c03-2653f09c7ed7")
            .isAnnounced(true)
            .isConnected(true)
            .isInMaintenance(true)
            .status(InterfaceStatus.PROVISIONED)
            .wireguardPeerId("e66c496d-4a85-423b-8b2a-8e63fac20320")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            GlobalIpAssignmentUpdateParams.builder()
                .pathId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            GlobalIpAssignmentUpdateParams.builder()
                .pathId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .createdAt("2018-02-02T22:25:27.521Z")
                .recordType("sample_record_type")
                .updatedAt("2018-02-02T22:25:27.521Z")
                .globalIpId("a836125b-20b6-452e-9c03-2653f09c7ed7")
                .isAnnounced(true)
                .isConnected(true)
                .isInMaintenance(true)
                .status(InterfaceStatus.PROVISIONED)
                .wireguardPeerId("e66c496d-4a85-423b-8b2a-8e63fac20320")
                .build()

        val body = params._body()

        assertThat(body.id()).contains("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
        assertThat(body.createdAt()).contains("2018-02-02T22:25:27.521Z")
        assertThat(body.recordType()).contains("sample_record_type")
        assertThat(body.updatedAt()).contains("2018-02-02T22:25:27.521Z")
        assertThat(body.globalIpId()).contains("a836125b-20b6-452e-9c03-2653f09c7ed7")
        assertThat(body.isAnnounced()).contains(true)
        assertThat(body.isConnected()).contains(true)
        assertThat(body.isInMaintenance()).contains(true)
        assertThat(body.status()).contains(InterfaceStatus.PROVISIONED)
        assertThat(body.wireguardPeerId()).contains("e66c496d-4a85-423b-8b2a-8e63fac20320")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            GlobalIpAssignmentUpdateParams.builder()
                .pathId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .build()

        val body = params._body()
    }
}
