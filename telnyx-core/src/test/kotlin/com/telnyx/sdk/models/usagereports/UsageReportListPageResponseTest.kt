// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.usagereports

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UsageReportListPageResponseTest {

    @Test
    fun create() {
        val usageReportListPageResponse =
            UsageReportListPageResponse.builder()
                .addData(
                    UsageReportListResponse.builder()
                        .putAdditionalProperty("product", JsonValue.from("bar"))
                        .putAdditionalProperty("cost", JsonValue.from("bar"))
                        .putAdditionalProperty("parts", JsonValue.from("bar"))
                        .putAdditionalProperty("count", JsonValue.from("bar"))
                        .putAdditionalProperty("customer_carrier_fee", JsonValue.from("bar"))
                        .putAdditionalProperty("product_name", JsonValue.from("bar"))
                        .putAdditionalProperty("country_iso", JsonValue.from("bar"))
                        .putAdditionalProperty("direction", JsonValue.from("bar"))
                        .build()
                )
                .addData(
                    UsageReportListResponse.builder()
                        .putAdditionalProperty("product", JsonValue.from("bar"))
                        .putAdditionalProperty("cost", JsonValue.from("bar"))
                        .putAdditionalProperty("parts", JsonValue.from("bar"))
                        .putAdditionalProperty("count", JsonValue.from("bar"))
                        .putAdditionalProperty("customer_carrier_fee", JsonValue.from("bar"))
                        .putAdditionalProperty("product_name", JsonValue.from("bar"))
                        .putAdditionalProperty("country_iso", JsonValue.from("bar"))
                        .putAdditionalProperty("direction", JsonValue.from("bar"))
                        .build()
                )
                .meta(
                    UsageReportListPageResponse.Meta.builder()
                        .pageNumber(1L)
                        .totalPages(5L)
                        .pageSize(20L)
                        .totalResults(100L)
                        .build()
                )
                .build()

        assertThat(usageReportListPageResponse.data().getOrNull())
            .containsExactly(
                UsageReportListResponse.builder()
                    .putAdditionalProperty("product", JsonValue.from("bar"))
                    .putAdditionalProperty("cost", JsonValue.from("bar"))
                    .putAdditionalProperty("parts", JsonValue.from("bar"))
                    .putAdditionalProperty("count", JsonValue.from("bar"))
                    .putAdditionalProperty("customer_carrier_fee", JsonValue.from("bar"))
                    .putAdditionalProperty("product_name", JsonValue.from("bar"))
                    .putAdditionalProperty("country_iso", JsonValue.from("bar"))
                    .putAdditionalProperty("direction", JsonValue.from("bar"))
                    .build(),
                UsageReportListResponse.builder()
                    .putAdditionalProperty("product", JsonValue.from("bar"))
                    .putAdditionalProperty("cost", JsonValue.from("bar"))
                    .putAdditionalProperty("parts", JsonValue.from("bar"))
                    .putAdditionalProperty("count", JsonValue.from("bar"))
                    .putAdditionalProperty("customer_carrier_fee", JsonValue.from("bar"))
                    .putAdditionalProperty("product_name", JsonValue.from("bar"))
                    .putAdditionalProperty("country_iso", JsonValue.from("bar"))
                    .putAdditionalProperty("direction", JsonValue.from("bar"))
                    .build(),
            )
        assertThat(usageReportListPageResponse.meta())
            .contains(
                UsageReportListPageResponse.Meta.builder()
                    .pageNumber(1L)
                    .totalPages(5L)
                    .pageSize(20L)
                    .totalResults(100L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val usageReportListPageResponse =
            UsageReportListPageResponse.builder()
                .addData(
                    UsageReportListResponse.builder()
                        .putAdditionalProperty("product", JsonValue.from("bar"))
                        .putAdditionalProperty("cost", JsonValue.from("bar"))
                        .putAdditionalProperty("parts", JsonValue.from("bar"))
                        .putAdditionalProperty("count", JsonValue.from("bar"))
                        .putAdditionalProperty("customer_carrier_fee", JsonValue.from("bar"))
                        .putAdditionalProperty("product_name", JsonValue.from("bar"))
                        .putAdditionalProperty("country_iso", JsonValue.from("bar"))
                        .putAdditionalProperty("direction", JsonValue.from("bar"))
                        .build()
                )
                .addData(
                    UsageReportListResponse.builder()
                        .putAdditionalProperty("product", JsonValue.from("bar"))
                        .putAdditionalProperty("cost", JsonValue.from("bar"))
                        .putAdditionalProperty("parts", JsonValue.from("bar"))
                        .putAdditionalProperty("count", JsonValue.from("bar"))
                        .putAdditionalProperty("customer_carrier_fee", JsonValue.from("bar"))
                        .putAdditionalProperty("product_name", JsonValue.from("bar"))
                        .putAdditionalProperty("country_iso", JsonValue.from("bar"))
                        .putAdditionalProperty("direction", JsonValue.from("bar"))
                        .build()
                )
                .meta(
                    UsageReportListPageResponse.Meta.builder()
                        .pageNumber(1L)
                        .totalPages(5L)
                        .pageSize(20L)
                        .totalResults(100L)
                        .build()
                )
                .build()

        val roundtrippedUsageReportListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(usageReportListPageResponse),
                jacksonTypeRef<UsageReportListPageResponse>(),
            )

        assertThat(roundtrippedUsageReportListPageResponse).isEqualTo(usageReportListPageResponse)
    }
}
