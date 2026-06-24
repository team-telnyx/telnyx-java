// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.globalips

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GlobalIpTest {

    @Test
    fun create() {
        val globalIp =
            GlobalIp.builder()
                .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .createdAt("2018-02-02T22:25:27.521Z")
                .recordType("sample_record_type")
                .updatedAt("2018-02-02T22:25:27.521Z")
                .description("test interface")
                .ipAddress("198.51.100.1")
                .name("test interface")
                .ports(
                    GlobalIp.Ports.builder()
                        .putAdditionalProperty("tcp", JsonValue.from("bar"))
                        .putAdditionalProperty("udp", JsonValue.from("bar"))
                        .build()
                )
                .build()

        assertThat(globalIp.id()).contains("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
        assertThat(globalIp.createdAt()).contains("2018-02-02T22:25:27.521Z")
        assertThat(globalIp.recordType()).contains("sample_record_type")
        assertThat(globalIp.updatedAt()).contains("2018-02-02T22:25:27.521Z")
        assertThat(globalIp.description()).contains("test interface")
        assertThat(globalIp.ipAddress()).contains("198.51.100.1")
        assertThat(globalIp.name()).contains("test interface")
        assertThat(globalIp.ports())
            .contains(
                GlobalIp.Ports.builder()
                    .putAdditionalProperty("tcp", JsonValue.from("bar"))
                    .putAdditionalProperty("udp", JsonValue.from("bar"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val globalIp =
            GlobalIp.builder()
                .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .createdAt("2018-02-02T22:25:27.521Z")
                .recordType("sample_record_type")
                .updatedAt("2018-02-02T22:25:27.521Z")
                .description("test interface")
                .ipAddress("198.51.100.1")
                .name("test interface")
                .ports(
                    GlobalIp.Ports.builder()
                        .putAdditionalProperty("tcp", JsonValue.from("bar"))
                        .putAdditionalProperty("udp", JsonValue.from("bar"))
                        .build()
                )
                .build()

        val roundtrippedGlobalIp =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(globalIp),
                jacksonTypeRef<GlobalIp>(),
            )

        assertThat(roundtrippedGlobalIp).isEqualTo(globalIp)
    }
}
