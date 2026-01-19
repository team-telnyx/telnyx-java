// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.usagereports

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UsageReportListResponseTest {

    @Test
    fun create() {
        val usageReportListResponse =
            UsageReportListResponse.builder()
                .putAdditionalProperty("foo", JsonValue.from("bar"))
                .build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val usageReportListResponse =
            UsageReportListResponse.builder()
                .putAdditionalProperty("foo", JsonValue.from("bar"))
                .build()

        val roundtrippedUsageReportListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(usageReportListResponse),
                jacksonTypeRef<UsageReportListResponse>(),
            )

        assertThat(roundtrippedUsageReportListResponse).isEqualTo(usageReportListResponse)
    }
}
