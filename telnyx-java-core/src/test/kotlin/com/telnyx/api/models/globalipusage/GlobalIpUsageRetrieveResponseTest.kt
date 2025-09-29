// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.globalipusage

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GlobalIpUsageRetrieveResponseTest {

    @Test
    fun create() {
        val globalIpUsageRetrieveResponse =
            GlobalIpUsageRetrieveResponse.builder()
                .addData(
                    GlobalIpUsageRetrieveResponse.Data.builder()
                        .globalIp(
                            GlobalIpUsageRetrieveResponse.Data.GlobalIp.builder()
                                .id("a836125b-20b6-452e-9c03-2653f09c7ed7")
                                .ipAddress("64.1.2.130")
                                .build()
                        )
                        .received(
                            GlobalIpUsageRetrieveResponse.Data.Received.builder()
                                .amount(100000.0)
                                .unit("B")
                                .build()
                        )
                        .timestamp(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                        .transmitted(
                            GlobalIpUsageRetrieveResponse.Data.Transmitted.builder()
                                .amount(100000.0)
                                .unit("B")
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(globalIpUsageRetrieveResponse.data().getOrNull())
            .containsExactly(
                GlobalIpUsageRetrieveResponse.Data.builder()
                    .globalIp(
                        GlobalIpUsageRetrieveResponse.Data.GlobalIp.builder()
                            .id("a836125b-20b6-452e-9c03-2653f09c7ed7")
                            .ipAddress("64.1.2.130")
                            .build()
                    )
                    .received(
                        GlobalIpUsageRetrieveResponse.Data.Received.builder()
                            .amount(100000.0)
                            .unit("B")
                            .build()
                    )
                    .timestamp(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                    .transmitted(
                        GlobalIpUsageRetrieveResponse.Data.Transmitted.builder()
                            .amount(100000.0)
                            .unit("B")
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val globalIpUsageRetrieveResponse =
            GlobalIpUsageRetrieveResponse.builder()
                .addData(
                    GlobalIpUsageRetrieveResponse.Data.builder()
                        .globalIp(
                            GlobalIpUsageRetrieveResponse.Data.GlobalIp.builder()
                                .id("a836125b-20b6-452e-9c03-2653f09c7ed7")
                                .ipAddress("64.1.2.130")
                                .build()
                        )
                        .received(
                            GlobalIpUsageRetrieveResponse.Data.Received.builder()
                                .amount(100000.0)
                                .unit("B")
                                .build()
                        )
                        .timestamp(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                        .transmitted(
                            GlobalIpUsageRetrieveResponse.Data.Transmitted.builder()
                                .amount(100000.0)
                                .unit("B")
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedGlobalIpUsageRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(globalIpUsageRetrieveResponse),
                jacksonTypeRef<GlobalIpUsageRetrieveResponse>(),
            )

        assertThat(roundtrippedGlobalIpUsageRetrieveResponse)
            .isEqualTo(globalIpUsageRetrieveResponse)
    }
}
