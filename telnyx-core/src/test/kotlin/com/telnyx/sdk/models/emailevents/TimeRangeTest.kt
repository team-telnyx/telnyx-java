// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailevents

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TimeRangeTest {

    @Test
    fun create() {
        val timeRange =
            TimeRange.builder()
                .from(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .to(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(timeRange.from()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(timeRange.to()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val timeRange =
            TimeRange.builder()
                .from(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .to(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedTimeRange =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(timeRange),
                jacksonTypeRef<TimeRange>(),
            )

        assertThat(roundtrippedTimeRange).isEqualTo(timeRange)
    }
}
