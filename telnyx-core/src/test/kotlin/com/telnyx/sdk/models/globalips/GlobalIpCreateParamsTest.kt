// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.globalips

import com.telnyx.sdk.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GlobalIpCreateParamsTest {

    @Test
    fun create() {
        GlobalIpCreateParams.builder()
            .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
            .createdAt("2018-02-02T22:25:27.521Z")
            .recordType("sample_record_type")
            .updatedAt("2018-02-02T22:25:27.521Z")
            .description("test interface")
            .ipAddress("198.51.100.1")
            .name("test interface")
            .ports(
                GlobalIpCreateParams.Ports.builder()
                    .putAdditionalProperty("tcp", JsonValue.from("bar"))
                    .putAdditionalProperty("udp", JsonValue.from("bar"))
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            GlobalIpCreateParams.builder()
                .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .createdAt("2018-02-02T22:25:27.521Z")
                .recordType("sample_record_type")
                .updatedAt("2018-02-02T22:25:27.521Z")
                .description("test interface")
                .ipAddress("198.51.100.1")
                .name("test interface")
                .ports(
                    GlobalIpCreateParams.Ports.builder()
                        .putAdditionalProperty("tcp", JsonValue.from("bar"))
                        .putAdditionalProperty("udp", JsonValue.from("bar"))
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.id()).contains("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
        assertThat(body.createdAt()).contains("2018-02-02T22:25:27.521Z")
        assertThat(body.recordType()).contains("sample_record_type")
        assertThat(body.updatedAt()).contains("2018-02-02T22:25:27.521Z")
        assertThat(body.description()).contains("test interface")
        assertThat(body.ipAddress()).contains("198.51.100.1")
        assertThat(body.name()).contains("test interface")
        assertThat(body.ports())
            .contains(
                GlobalIpCreateParams.Ports.builder()
                    .putAdditionalProperty("tcp", JsonValue.from("bar"))
                    .putAdditionalProperty("udp", JsonValue.from("bar"))
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = GlobalIpCreateParams.builder().build()

        val body = params._body()
    }
}
