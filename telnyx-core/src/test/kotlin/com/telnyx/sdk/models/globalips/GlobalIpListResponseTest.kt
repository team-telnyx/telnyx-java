// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.globalips

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GlobalIpListResponseTest {

    @Test
    fun create() {
        val globalIpListResponse =
            GlobalIpListResponse.builder()
                .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .createdAt("2018-02-02T22:25:27.521Z")
                .recordType("sample_record_type")
                .updatedAt("2018-02-02T22:25:27.521Z")
                .description("test interface")
                .ipAddress("198.51.100.1")
                .name("test interface")
                .ports(
                    GlobalIpListResponse.Ports.builder()
                        .putAdditionalProperty("tcp", JsonValue.from("bar"))
                        .putAdditionalProperty("udp", JsonValue.from("bar"))
                        .build()
                )
                .build()

        assertThat(globalIpListResponse.id()).contains("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
        assertThat(globalIpListResponse.createdAt()).contains("2018-02-02T22:25:27.521Z")
        assertThat(globalIpListResponse.recordType()).contains("sample_record_type")
        assertThat(globalIpListResponse.updatedAt()).contains("2018-02-02T22:25:27.521Z")
        assertThat(globalIpListResponse.description()).contains("test interface")
        assertThat(globalIpListResponse.ipAddress()).contains("198.51.100.1")
        assertThat(globalIpListResponse.name()).contains("test interface")
        assertThat(globalIpListResponse.ports())
            .contains(
                GlobalIpListResponse.Ports.builder()
                    .putAdditionalProperty("tcp", JsonValue.from("bar"))
                    .putAdditionalProperty("udp", JsonValue.from("bar"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val globalIpListResponse =
            GlobalIpListResponse.builder()
                .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .createdAt("2018-02-02T22:25:27.521Z")
                .recordType("sample_record_type")
                .updatedAt("2018-02-02T22:25:27.521Z")
                .description("test interface")
                .ipAddress("198.51.100.1")
                .name("test interface")
                .ports(
                    GlobalIpListResponse.Ports.builder()
                        .putAdditionalProperty("tcp", JsonValue.from("bar"))
                        .putAdditionalProperty("udp", JsonValue.from("bar"))
                        .build()
                )
                .build()

        val roundtrippedGlobalIpListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(globalIpListResponse),
                jacksonTypeRef<GlobalIpListResponse>(),
            )

        assertThat(roundtrippedGlobalIpListResponse).isEqualTo(globalIpListResponse)
    }
}
