// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.storage.buckets.usage

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UsageGetApiUsageResponseTest {

    @Test
    fun create() {
        val usageGetApiUsageResponse =
            UsageGetApiUsageResponse.builder()
                .addData(
                    UsageGetApiUsageResponse.Data.builder()
                        .addCategory(
                            UsageGetApiUsageResponse.Data.Category.builder()
                                .bytesReceived(123456L)
                                .bytesSent(123456L)
                                .category(
                                    UsageGetApiUsageResponse.Data.Category.InnerCategory.PUT_OBJ
                                )
                                .ops(123456L)
                                .successfulOps(123456L)
                                .build()
                        )
                        .timestamp(OffsetDateTime.parse("2020-01-01T00:00:00Z"))
                        .total(
                            UsageGetApiUsageResponse.Data.Total.builder()
                                .bytesReceived(123456L)
                                .bytesSent(123456L)
                                .ops(123456L)
                                .successfulOps(123456L)
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(usageGetApiUsageResponse.data().getOrNull())
            .containsExactly(
                UsageGetApiUsageResponse.Data.builder()
                    .addCategory(
                        UsageGetApiUsageResponse.Data.Category.builder()
                            .bytesReceived(123456L)
                            .bytesSent(123456L)
                            .category(UsageGetApiUsageResponse.Data.Category.InnerCategory.PUT_OBJ)
                            .ops(123456L)
                            .successfulOps(123456L)
                            .build()
                    )
                    .timestamp(OffsetDateTime.parse("2020-01-01T00:00:00Z"))
                    .total(
                        UsageGetApiUsageResponse.Data.Total.builder()
                            .bytesReceived(123456L)
                            .bytesSent(123456L)
                            .ops(123456L)
                            .successfulOps(123456L)
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val usageGetApiUsageResponse =
            UsageGetApiUsageResponse.builder()
                .addData(
                    UsageGetApiUsageResponse.Data.builder()
                        .addCategory(
                            UsageGetApiUsageResponse.Data.Category.builder()
                                .bytesReceived(123456L)
                                .bytesSent(123456L)
                                .category(
                                    UsageGetApiUsageResponse.Data.Category.InnerCategory.PUT_OBJ
                                )
                                .ops(123456L)
                                .successfulOps(123456L)
                                .build()
                        )
                        .timestamp(OffsetDateTime.parse("2020-01-01T00:00:00Z"))
                        .total(
                            UsageGetApiUsageResponse.Data.Total.builder()
                                .bytesReceived(123456L)
                                .bytesSent(123456L)
                                .ops(123456L)
                                .successfulOps(123456L)
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedUsageGetApiUsageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(usageGetApiUsageResponse),
                jacksonTypeRef<UsageGetApiUsageResponse>(),
            )

        assertThat(roundtrippedUsageGetApiUsageResponse).isEqualTo(usageGetApiUsageResponse)
    }
}
