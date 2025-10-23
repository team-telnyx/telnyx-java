// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.usagereports

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UsageReportListResponseTest {

    @Test
    fun create() {
        val usageReportListResponse =
            UsageReportListResponse.builder()
                .addData(
                    UsageReportListResponse.Data.builder()
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
                    UsageReportListResponse.Data.builder()
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
                    UsageReportListResponse.Meta.builder()
                        .pageNumber(0L)
                        .pageSize(0L)
                        .totalPages(0L)
                        .totalResults(0L)
                        .build()
                )
                .build()

        assertThat(usageReportListResponse.data().getOrNull())
            .containsExactly(
                UsageReportListResponse.Data.builder()
                    .putAdditionalProperty("product", JsonValue.from("bar"))
                    .putAdditionalProperty("cost", JsonValue.from("bar"))
                    .putAdditionalProperty("parts", JsonValue.from("bar"))
                    .putAdditionalProperty("count", JsonValue.from("bar"))
                    .putAdditionalProperty("customer_carrier_fee", JsonValue.from("bar"))
                    .putAdditionalProperty("product_name", JsonValue.from("bar"))
                    .putAdditionalProperty("country_iso", JsonValue.from("bar"))
                    .putAdditionalProperty("direction", JsonValue.from("bar"))
                    .build(),
                UsageReportListResponse.Data.builder()
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
        assertThat(usageReportListResponse.meta())
            .contains(
                UsageReportListResponse.Meta.builder()
                    .pageNumber(0L)
                    .pageSize(0L)
                    .totalPages(0L)
                    .totalResults(0L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val usageReportListResponse =
            UsageReportListResponse.builder()
                .addData(
                    UsageReportListResponse.Data.builder()
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
                    UsageReportListResponse.Data.builder()
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
                    UsageReportListResponse.Meta.builder()
                        .pageNumber(0L)
                        .pageSize(0L)
                        .totalPages(0L)
                        .totalResults(0L)
                        .build()
                )
                .build()

        val roundtrippedUsageReportListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(usageReportListResponse),
                jacksonTypeRef<UsageReportListResponse>(),
            )

        assertThat(roundtrippedUsageReportListResponse).isEqualTo(usageReportListResponse)
    }
}
