// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.globaliphealthchecktypes

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GlobalIpHealthCheckTypeListResponseTest {

    @Test
    fun create() {
        val globalIpHealthCheckTypeListResponse =
            GlobalIpHealthCheckTypeListResponse.builder()
                .addData(
                    GlobalIpHealthCheckTypeListResponse.Data.builder()
                        .healthCheckParams(
                            GlobalIpHealthCheckTypeListResponse.Data.HealthCheckParams.builder()
                                .putAdditionalProperty("health_check_params", JsonValue.from("bar"))
                                .build()
                        )
                        .healthCheckType("http_status_2xx")
                        .recordType("global_ip_health_check_type")
                        .build()
                )
                .build()

        assertThat(globalIpHealthCheckTypeListResponse.data().getOrNull())
            .containsExactly(
                GlobalIpHealthCheckTypeListResponse.Data.builder()
                    .healthCheckParams(
                        GlobalIpHealthCheckTypeListResponse.Data.HealthCheckParams.builder()
                            .putAdditionalProperty("health_check_params", JsonValue.from("bar"))
                            .build()
                    )
                    .healthCheckType("http_status_2xx")
                    .recordType("global_ip_health_check_type")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val globalIpHealthCheckTypeListResponse =
            GlobalIpHealthCheckTypeListResponse.builder()
                .addData(
                    GlobalIpHealthCheckTypeListResponse.Data.builder()
                        .healthCheckParams(
                            GlobalIpHealthCheckTypeListResponse.Data.HealthCheckParams.builder()
                                .putAdditionalProperty("health_check_params", JsonValue.from("bar"))
                                .build()
                        )
                        .healthCheckType("http_status_2xx")
                        .recordType("global_ip_health_check_type")
                        .build()
                )
                .build()

        val roundtrippedGlobalIpHealthCheckTypeListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(globalIpHealthCheckTypeListResponse),
                jacksonTypeRef<GlobalIpHealthCheckTypeListResponse>(),
            )

        assertThat(roundtrippedGlobalIpHealthCheckTypeListResponse)
            .isEqualTo(globalIpHealthCheckTypeListResponse)
    }
}
