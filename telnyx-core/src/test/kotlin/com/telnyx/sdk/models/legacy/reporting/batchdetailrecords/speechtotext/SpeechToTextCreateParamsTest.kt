// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.legacy.reporting.batchdetailrecords.speechtotext

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SpeechToTextCreateParamsTest {

    @Test
    fun create() {
        SpeechToTextCreateParams.builder()
            .endDate(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
            .startDate(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
            .build()
    }

    @Test
    fun body() {
        val params =
            SpeechToTextCreateParams.builder()
                .endDate(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
                .startDate(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
                .build()

        val body = params._body()

        assertThat(body.endDate()).isEqualTo(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
        assertThat(body.startDate()).isEqualTo(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
    }
}
