// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.globalips

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GlobalIpRetrieveResponseTest {

    @Test
    fun create() {
        val globalIpRetrieveResponse =
            GlobalIpRetrieveResponse.builder()
                .data(
                    GlobalIpRetrieveResponse.Data.builder()
                        .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .recordType("sample_record_type")
                        .updatedAt("2018-02-02T22:25:27.521Z")
                        .description("test interface")
                        .ipAddress("198.51.100.1")
                        .name("test interface")
                        .ports(
                            GlobalIpRetrieveResponse.Data.Ports.builder()
                                .putAdditionalProperty("tcp", JsonValue.from("bar"))
                                .putAdditionalProperty("udp", JsonValue.from("bar"))
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(globalIpRetrieveResponse.data())
            .contains(
                GlobalIpRetrieveResponse.Data.builder()
                    .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .createdAt("2018-02-02T22:25:27.521Z")
                    .recordType("sample_record_type")
                    .updatedAt("2018-02-02T22:25:27.521Z")
                    .description("test interface")
                    .ipAddress("198.51.100.1")
                    .name("test interface")
                    .ports(
                        GlobalIpRetrieveResponse.Data.Ports.builder()
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
        val globalIpRetrieveResponse =
            GlobalIpRetrieveResponse.builder()
                .data(
                    GlobalIpRetrieveResponse.Data.builder()
                        .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .recordType("sample_record_type")
                        .updatedAt("2018-02-02T22:25:27.521Z")
                        .description("test interface")
                        .ipAddress("198.51.100.1")
                        .name("test interface")
                        .ports(
                            GlobalIpRetrieveResponse.Data.Ports.builder()
                                .putAdditionalProperty("tcp", JsonValue.from("bar"))
                                .putAdditionalProperty("udp", JsonValue.from("bar"))
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedGlobalIpRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(globalIpRetrieveResponse),
                jacksonTypeRef<GlobalIpRetrieveResponse>(),
            )

        assertThat(roundtrippedGlobalIpRetrieveResponse).isEqualTo(globalIpRetrieveResponse)
    }
}
