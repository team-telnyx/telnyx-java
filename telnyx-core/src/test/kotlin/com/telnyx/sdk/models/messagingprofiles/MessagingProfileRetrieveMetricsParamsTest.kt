// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messagingprofiles

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessagingProfileRetrieveMetricsParamsTest {

    @Test
    fun create() {
        MessagingProfileRetrieveMetricsParams.builder()
            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .timeFrame(MessagingProfileRetrieveMetricsParams.TimeFrame._1H)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            MessagingProfileRetrieveMetricsParams.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            MessagingProfileRetrieveMetricsParams.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .timeFrame(MessagingProfileRetrieveMetricsParams.TimeFrame._1H)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("time_frame", "1h").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            MessagingProfileRetrieveMetricsParams.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
