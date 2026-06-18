// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.globalips

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GlobalIpDeleteResponseTest {

    @Test
    fun create() {
        val globalIpDeleteResponse =
            GlobalIpDeleteResponse.builder()
                .data(
                    GlobalIpDeleteResponse.Data.builder()
                        .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .recordType("sample_record_type")
                        .updatedAt("2018-02-02T22:25:27.521Z")
                        .description("test interface")
                        .ipAddress("198.51.100.1")
                        .name("test interface")
                        .ports(
                            GlobalIpDeleteResponse.Data.Ports.builder()
                                .putAdditionalProperty("tcp", JsonValue.from("bar"))
                                .putAdditionalProperty("udp", JsonValue.from("bar"))
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(globalIpDeleteResponse.data())
            .contains(
                GlobalIpDeleteResponse.Data.builder()
                    .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .createdAt("2018-02-02T22:25:27.521Z")
                    .recordType("sample_record_type")
                    .updatedAt("2018-02-02T22:25:27.521Z")
                    .description("test interface")
                    .ipAddress("198.51.100.1")
                    .name("test interface")
                    .ports(
                        GlobalIpDeleteResponse.Data.Ports.builder()
                            .putAdditionalProperty("tcp", JsonValue.from("bar"))
                            .putAdditionalProperty("udp", JsonValue.from("bar"))
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val globalIpDeleteResponse =
            GlobalIpDeleteResponse.builder()
                .data(
                    GlobalIpDeleteResponse.Data.builder()
                        .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .recordType("sample_record_type")
                        .updatedAt("2018-02-02T22:25:27.521Z")
                        .description("test interface")
                        .ipAddress("198.51.100.1")
                        .name("test interface")
                        .ports(
                            GlobalIpDeleteResponse.Data.Ports.builder()
                                .putAdditionalProperty("tcp", JsonValue.from("bar"))
                                .putAdditionalProperty("udp", JsonValue.from("bar"))
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedGlobalIpDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(globalIpDeleteResponse),
                jacksonTypeRef<GlobalIpDeleteResponse>(),
            )

        assertThat(roundtrippedGlobalIpDeleteResponse).isEqualTo(globalIpDeleteResponse)
    }
}
