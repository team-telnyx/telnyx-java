// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.legacy.reporting.usagereports

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UsageReportRetrieveSpeechToTextResponseTest {

    @Test
    fun create() {
        val usageReportRetrieveSpeechToTextResponse =
            UsageReportRetrieveSpeechToTextResponse.builder()
                .data(JsonValue.from(mapOf<String, Any>()))
                .build()

        assertThat(usageReportRetrieveSpeechToTextResponse._data())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val usageReportRetrieveSpeechToTextResponse =
            UsageReportRetrieveSpeechToTextResponse.builder()
                .data(JsonValue.from(mapOf<String, Any>()))
                .build()

        val roundtrippedUsageReportRetrieveSpeechToTextResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(usageReportRetrieveSpeechToTextResponse),
                jacksonTypeRef<UsageReportRetrieveSpeechToTextResponse>(),
            )

        assertThat(roundtrippedUsageReportRetrieveSpeechToTextResponse)
            .isEqualTo(usageReportRetrieveSpeechToTextResponse)
    }
}
