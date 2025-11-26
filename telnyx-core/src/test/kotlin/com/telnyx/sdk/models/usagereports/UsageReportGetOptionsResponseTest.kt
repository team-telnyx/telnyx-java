// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.usagereports

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
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
                        .productDimensions(listOf("mnc", "mcc", "sim_card_id", "sim_group_name"))
                        .productMetrics(
                            listOf(
                                "uplink_data_bytes",
                                "downlink_data",
                                "downlink_data_bytes",
                                "uplink_data",
                                "data_cost",
                            )
                        )
                        .addRecordType(
                            UsageReportGetOptionsResponse.Data.RecordType.builder()
                                .productDimensions(listOf("direction", "currency", "message_type"))
                                .addProductMetric("cost")
                                .addProductMetric("billed_sec")
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
                    .productDimensions(listOf("mnc", "mcc", "sim_card_id", "sim_group_name"))
                    .productMetrics(
                        listOf(
                            "uplink_data_bytes",
                            "downlink_data",
                            "downlink_data_bytes",
                            "uplink_data",
                            "data_cost",
                        )
                    )
                    .addRecordType(
                        UsageReportGetOptionsResponse.Data.RecordType.builder()
                            .productDimensions(listOf("direction", "currency", "message_type"))
                            .addProductMetric("cost")
                            .addProductMetric("billed_sec")
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
                        .productDimensions(listOf("mnc", "mcc", "sim_card_id", "sim_group_name"))
                        .productMetrics(
                            listOf(
                                "uplink_data_bytes",
                                "downlink_data",
                                "downlink_data_bytes",
                                "uplink_data",
                                "data_cost",
                            )
                        )
                        .addRecordType(
                            UsageReportGetOptionsResponse.Data.RecordType.builder()
                                .productDimensions(listOf("direction", "currency", "message_type"))
                                .addProductMetric("cost")
                                .addProductMetric("billed_sec")
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
