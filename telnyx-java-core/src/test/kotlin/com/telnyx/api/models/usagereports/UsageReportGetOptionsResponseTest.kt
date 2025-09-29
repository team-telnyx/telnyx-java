// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.usagereports

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UsageReportGetOptionsResponseTest {

    @Test
    fun create() {
        val usageReportGetOptionsResponse =
            UsageReportGetOptionsResponse.builder()
                .addData(
                    UsageReportGetOptionsResponse.Data.builder()
                        .product("wireless")
                        .addProductDimension("string")
                        .addProductMetric("string")
                        .addRecordType(
                            UsageReportGetOptionsResponse.Data.RecordType.builder()
                                .addProductDimension("string")
                                .addProductMetric("string")
                                .recordType("conversation_event")
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(usageReportGetOptionsResponse.data().getOrNull())
            .containsExactly(
                UsageReportGetOptionsResponse.Data.builder()
                    .product("wireless")
                    .addProductDimension("string")
                    .addProductMetric("string")
                    .addRecordType(
                        UsageReportGetOptionsResponse.Data.RecordType.builder()
                            .addProductDimension("string")
                            .addProductMetric("string")
                            .recordType("conversation_event")
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val usageReportGetOptionsResponse =
            UsageReportGetOptionsResponse.builder()
                .addData(
                    UsageReportGetOptionsResponse.Data.builder()
                        .product("wireless")
                        .addProductDimension("string")
                        .addProductMetric("string")
                        .addRecordType(
                            UsageReportGetOptionsResponse.Data.RecordType.builder()
                                .addProductDimension("string")
                                .addProductMetric("string")
                                .recordType("conversation_event")
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedUsageReportGetOptionsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(usageReportGetOptionsResponse),
                jacksonTypeRef<UsageReportGetOptionsResponse>(),
            )

        assertThat(roundtrippedUsageReportGetOptionsResponse)
            .isEqualTo(usageReportGetOptionsResponse)
    }
}
