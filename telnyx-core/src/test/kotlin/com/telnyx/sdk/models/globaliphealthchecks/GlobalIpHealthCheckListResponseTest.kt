// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.globaliphealthchecks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GlobalIpHealthCheckListResponseTest {

    @Test
    fun create() {
        val globalIpHealthCheckListResponse =
            GlobalIpHealthCheckListResponse.builder()
                .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .createdAt("2018-02-02T22:25:27.521Z")
                .recordType("sample_record_type")
                .updatedAt("2018-02-02T22:25:27.521Z")
                .globalIpId("a836125b-20b6-452e-9c03-2653f09c7ed7")
                .healthCheckParams(
                    GlobalIpHealthCheckListResponse.HealthCheckParams.builder()
                        .putAdditionalProperty("path", JsonValue.from("bar"))
                        .putAdditionalProperty("port", JsonValue.from("bar"))
                        .build()
                )
                .healthCheckType("http_status_2xx")
                .build()

        assertThat(globalIpHealthCheckListResponse.id())
            .contains("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
        assertThat(globalIpHealthCheckListResponse.createdAt()).contains("2018-02-02T22:25:27.521Z")
        assertThat(globalIpHealthCheckListResponse.recordType()).contains("sample_record_type")
        assertThat(globalIpHealthCheckListResponse.updatedAt()).contains("2018-02-02T22:25:27.521Z")
        assertThat(globalIpHealthCheckListResponse.globalIpId())
            .contains("a836125b-20b6-452e-9c03-2653f09c7ed7")
        assertThat(globalIpHealthCheckListResponse.healthCheckParams())
            .contains(
                GlobalIpHealthCheckListResponse.HealthCheckParams.builder()
                    .putAdditionalProperty("path", JsonValue.from("bar"))
                    .putAdditionalProperty("port", JsonValue.from("bar"))
                    .build()
            )
        assertThat(globalIpHealthCheckListResponse.healthCheckType()).contains("http_status_2xx")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val globalIpHealthCheckListResponse =
            GlobalIpHealthCheckListResponse.builder()
                .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .createdAt("2018-02-02T22:25:27.521Z")
                .recordType("sample_record_type")
                .updatedAt("2018-02-02T22:25:27.521Z")
                .globalIpId("a836125b-20b6-452e-9c03-2653f09c7ed7")
                .healthCheckParams(
                    GlobalIpHealthCheckListResponse.HealthCheckParams.builder()
                        .putAdditionalProperty("path", JsonValue.from("bar"))
                        .putAdditionalProperty("port", JsonValue.from("bar"))
                        .build()
                )
                .healthCheckType("http_status_2xx")
                .build()

        val roundtrippedGlobalIpHealthCheckListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(globalIpHealthCheckListResponse),
                jacksonTypeRef<GlobalIpHealthCheckListResponse>(),
            )

        assertThat(roundtrippedGlobalIpHealthCheckListResponse)
            .isEqualTo(globalIpHealthCheckListResponse)
    }
}
