// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.globalipassignments

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GlobalIpAssignmentUpdateParamsTest {

    @Test
    fun create() {
        GlobalIpAssignmentUpdateParams.builder()
            .globalIpAssignmentId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
            .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
            .createdAt("2018-02-02T22:25:27.521Z")
            .recordType("sample_record_type")
            .updatedAt("2018-02-02T22:25:27.521Z")
            .globalIpId("global_ip_id")
            .wireguardPeerId("wireguard_peer_id")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            GlobalIpAssignmentUpdateParams.builder()
                .globalIpAssignmentId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            GlobalIpAssignmentUpdateParams.builder()
                .globalIpAssignmentId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .createdAt("2018-02-02T22:25:27.521Z")
                .recordType("sample_record_type")
                .updatedAt("2018-02-02T22:25:27.521Z")
                .globalIpId("global_ip_id")
                .wireguardPeerId("wireguard_peer_id")
                .build()

        val body = params._body()

        assertThat(body.id()).contains("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
        assertThat(body.createdAt()).contains("2018-02-02T22:25:27.521Z")
        assertThat(body.recordType()).contains("sample_record_type")
        assertThat(body.updatedAt()).contains("2018-02-02T22:25:27.521Z")
        assertThat(body.globalIpId()).contains("global_ip_id")
        assertThat(body.wireguardPeerId()).contains("wireguard_peer_id")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            GlobalIpAssignmentUpdateParams.builder()
                .globalIpAssignmentId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .build()

        val body = params._body()
    }
}
