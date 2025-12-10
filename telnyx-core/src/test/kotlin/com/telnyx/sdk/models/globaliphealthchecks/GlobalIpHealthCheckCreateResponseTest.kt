// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.globaliphealthchecks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GlobalIpHealthCheckCreateResponseTest {

    @Test
    fun create() {
        val globalIpHealthCheckCreateResponse =
            GlobalIpHealthCheckCreateResponse.builder()
                .data(
                    GlobalIpHealthCheckCreateResponse.Data.builder()
                        .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .recordType("sample_record_type")
                        .updatedAt("2018-02-02T22:25:27.521Z")
                        .globalIpId("a836125b-20b6-452e-9c03-2653f09c7ed7")
                        .healthCheckParams(
                            GlobalIpHealthCheckCreateResponse.Data.HealthCheckParams.builder()
                                .putAdditionalProperty("path", JsonValue.from("bar"))
                                .putAdditionalProperty("port", JsonValue.from("bar"))
                                .build()
                        )
                        .healthCheckType("http_status_2xx")
                        .build()
                )
                .build()

        assertThat(globalIpHealthCheckCreateResponse.data())
            .contains(
                GlobalIpHealthCheckCreateResponse.Data.builder()
                    .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .createdAt("2018-02-02T22:25:27.521Z")
                    .recordType("sample_record_type")
                    .updatedAt("2018-02-02T22:25:27.521Z")
                    .globalIpId("a836125b-20b6-452e-9c03-2653f09c7ed7")
                    .healthCheckParams(
                        GlobalIpHealthCheckCreateResponse.Data.HealthCheckParams.builder()
                            .putAdditionalProperty("path", JsonValue.from("bar"))
                            .putAdditionalProperty("port", JsonValue.from("bar"))
                            .build()
                    )
                    .healthCheckType("http_status_2xx")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val globalIpHealthCheckCreateResponse =
            GlobalIpHealthCheckCreateResponse.builder()
                .data(
                    GlobalIpHealthCheckCreateResponse.Data.builder()
                        .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .recordType("sample_record_type")
                        .updatedAt("2018-02-02T22:25:27.521Z")
                        .globalIpId("a836125b-20b6-452e-9c03-2653f09c7ed7")
                        .healthCheckParams(
                            GlobalIpHealthCheckCreateResponse.Data.HealthCheckParams.builder()
                                .putAdditionalProperty("path", JsonValue.from("bar"))
                                .putAdditionalProperty("port", JsonValue.from("bar"))
                                .build()
                        )
                        .healthCheckType("http_status_2xx")
                        .build()
                )
                .build()

        val roundtrippedGlobalIpHealthCheckCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(globalIpHealthCheckCreateResponse),
                jacksonTypeRef<GlobalIpHealthCheckCreateResponse>(),
            )

        assertThat(roundtrippedGlobalIpHealthCheckCreateResponse)
            .isEqualTo(globalIpHealthCheckCreateResponse)
    }
}
