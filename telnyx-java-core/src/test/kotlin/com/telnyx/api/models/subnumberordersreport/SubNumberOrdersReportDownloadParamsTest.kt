// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.subnumberordersreport

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubNumberOrdersReportDownloadParamsTest {

    @Test
    fun create() {
        SubNumberOrdersReportDownloadParams.builder()
            .reportId("12ade33a-21c0-473b-b055-b3c836e1c293")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            SubNumberOrdersReportDownloadParams.builder()
                .reportId("12ade33a-21c0-473b-b055-b3c836e1c293")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("12ade33a-21c0-473b-b055-b3c836e1c293")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
