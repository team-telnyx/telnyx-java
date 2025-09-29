// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.globaliphealthchecks

import com.telnyx.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GlobalIpHealthCheckCreateParamsTest {

    @Test
    fun create() {
        GlobalIpHealthCheckCreateParams.builder()
            .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
            .createdAt("2018-02-02T22:25:27.521Z")
            .recordType("sample_record_type")
            .updatedAt("2018-02-02T22:25:27.521Z")
            .globalIpId("a836125b-20b6-452e-9c03-2653f09c7ed7")
            .healthCheckParams(
                GlobalIpHealthCheckCreateParams.HealthCheckParams.builder()
                    .putAdditionalProperty("path", JsonValue.from("bar"))
                    .putAdditionalProperty("port", JsonValue.from("bar"))
                    .build()
            )
            .healthCheckType("http_status_2xx")
            .build()
    }

    @Test
    fun body() {
        val params =
            GlobalIpHealthCheckCreateParams.builder()
                .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .createdAt("2018-02-02T22:25:27.521Z")
                .recordType("sample_record_type")
                .updatedAt("2018-02-02T22:25:27.521Z")
                .globalIpId("a836125b-20b6-452e-9c03-2653f09c7ed7")
                .healthCheckParams(
                    GlobalIpHealthCheckCreateParams.HealthCheckParams.builder()
                        .putAdditionalProperty("path", JsonValue.from("bar"))
                        .putAdditionalProperty("port", JsonValue.from("bar"))
                        .build()
                )
                .healthCheckType("http_status_2xx")
                .build()

        val body = params._body()

        assertThat(body.id()).contains("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
        assertThat(body.createdAt()).contains("2018-02-02T22:25:27.521Z")
        assertThat(body.recordType()).contains("sample_record_type")
        assertThat(body.updatedAt()).contains("2018-02-02T22:25:27.521Z")
        assertThat(body.globalIpId()).contains("a836125b-20b6-452e-9c03-2653f09c7ed7")
        assertThat(body.healthCheckParams())
            .contains(
                GlobalIpHealthCheckCreateParams.HealthCheckParams.builder()
                    .putAdditionalProperty("path", JsonValue.from("bar"))
                    .putAdditionalProperty("port", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.healthCheckType()).contains("http_status_2xx")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = GlobalIpHealthCheckCreateParams.builder().build()

        val body = params._body()
    }
}
