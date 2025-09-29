// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.globaliphealthchecks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.JsonValue
import com.telnyx.api.core.jsonMapper
import com.telnyx.api.models.authenticationproviders.PaginationMeta
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GlobalIpHealthCheckListResponseTest {

    @Test
    fun create() {
        val globalIpHealthCheckListResponse =
            GlobalIpHealthCheckListResponse.builder()
                .addData(
                    GlobalIpHealthCheckListResponse.Data.builder()
                        .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .recordType("global_ip_health_check")
                        .updatedAt("2018-02-02T22:25:27.521Z")
                        .globalIpId("a836125b-20b6-452e-9c03-2653f09c7ed7")
                        .healthCheckParams(
                            GlobalIpHealthCheckListResponse.Data.HealthCheckParams.builder()
                                .putAdditionalProperty("path", JsonValue.from("bar"))
                                .putAdditionalProperty("port", JsonValue.from("bar"))
                                .build()
                        )
                        .healthCheckType("http_status_2xx")
                        .build()
                )
                .meta(
                    PaginationMeta.builder()
                        .pageNumber(2L)
                        .pageSize(25L)
                        .totalPages(3L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        assertThat(globalIpHealthCheckListResponse.data().getOrNull())
            .containsExactly(
                GlobalIpHealthCheckListResponse.Data.builder()
                    .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .createdAt("2018-02-02T22:25:27.521Z")
                    .recordType("global_ip_health_check")
                    .updatedAt("2018-02-02T22:25:27.521Z")
                    .globalIpId("a836125b-20b6-452e-9c03-2653f09c7ed7")
                    .healthCheckParams(
                        GlobalIpHealthCheckListResponse.Data.HealthCheckParams.builder()
                            .putAdditionalProperty("path", JsonValue.from("bar"))
                            .putAdditionalProperty("port", JsonValue.from("bar"))
                            .build()
                    )
                    .healthCheckType("http_status_2xx")
                    .build()
            )
        assertThat(globalIpHealthCheckListResponse.meta())
            .contains(
                PaginationMeta.builder()
                    .pageNumber(2L)
                    .pageSize(25L)
                    .totalPages(3L)
                    .totalResults(55L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val globalIpHealthCheckListResponse =
            GlobalIpHealthCheckListResponse.builder()
                .addData(
                    GlobalIpHealthCheckListResponse.Data.builder()
                        .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .recordType("global_ip_health_check")
                        .updatedAt("2018-02-02T22:25:27.521Z")
                        .globalIpId("a836125b-20b6-452e-9c03-2653f09c7ed7")
                        .healthCheckParams(
                            GlobalIpHealthCheckListResponse.Data.HealthCheckParams.builder()
                                .putAdditionalProperty("path", JsonValue.from("bar"))
                                .putAdditionalProperty("port", JsonValue.from("bar"))
                                .build()
                        )
                        .healthCheckType("http_status_2xx")
                        .build()
                )
                .meta(
                    PaginationMeta.builder()
                        .pageNumber(2L)
                        .pageSize(25L)
                        .totalPages(3L)
                        .totalResults(55L)
                        .build()
                )
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
