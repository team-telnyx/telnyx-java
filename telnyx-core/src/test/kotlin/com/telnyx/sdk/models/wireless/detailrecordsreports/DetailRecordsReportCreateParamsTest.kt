// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.wireless.detailrecordsreports

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DetailRecordsReportCreateParamsTest {

    @Test
    fun create() {
        DetailRecordsReportCreateParams.builder()
            .endTime("2018-02-02T22:25:27.521Z")
            .startTime("2018-02-02T22:25:27.521Z")
            .build()
    }

    @Test
    fun body() {
        val params =
            DetailRecordsReportCreateParams.builder()
                .endTime("2018-02-02T22:25:27.521Z")
                .startTime("2018-02-02T22:25:27.521Z")
                .build()

        val body = params._body()

        assertThat(body.endTime()).contains("2018-02-02T22:25:27.521Z")
        assertThat(body.startTime()).contains("2018-02-02T22:25:27.521Z")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = DetailRecordsReportCreateParams.builder().build()

        val body = params._body()
    }
}
