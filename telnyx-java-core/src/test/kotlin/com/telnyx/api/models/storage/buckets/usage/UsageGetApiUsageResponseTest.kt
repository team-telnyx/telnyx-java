// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.storage.buckets.usage

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
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
                                .bytesReceived(0L)
                                .bytesSent(0L)
                                .category(
                                    UsageGetApiUsageResponse.Data.Category.InnerCategory.LIST_BUCKET
                                )
                                .ops(0L)
                                .successfulOps(0L)
                                .build()
                        )
                        .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .total(
                            UsageGetApiUsageResponse.Data.Total.builder()
                                .bytesReceived(0L)
                                .bytesSent(0L)
                                .ops(0L)
                                .successfulOps(0L)
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
                            .bytesReceived(0L)
                            .bytesSent(0L)
                            .category(
                                UsageGetApiUsageResponse.Data.Category.InnerCategory.LIST_BUCKET
                            )
                            .ops(0L)
                            .successfulOps(0L)
                            .build()
                    )
                    .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .total(
                        UsageGetApiUsageResponse.Data.Total.builder()
                            .bytesReceived(0L)
                            .bytesSent(0L)
                            .ops(0L)
                            .successfulOps(0L)
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
                                .bytesReceived(0L)
                                .bytesSent(0L)
                                .category(
                                    UsageGetApiUsageResponse.Data.Category.InnerCategory.LIST_BUCKET
                                )
                                .ops(0L)
                                .successfulOps(0L)
                                .build()
                        )
                        .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .total(
                            UsageGetApiUsageResponse.Data.Total.builder()
                                .bytesReceived(0L)
                                .bytesSent(0L)
                                .ops(0L)
                                .successfulOps(0L)
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
