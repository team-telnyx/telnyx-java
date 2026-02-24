// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messagingprofilemetrics

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessagingProfileMetricListParamsTest {

    @Test
    fun create() {
        MessagingProfileMetricListParams.builder()
            .timeFrame(MessagingProfileMetricListParams.TimeFrame._1H)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            MessagingProfileMetricListParams.builder()
                .timeFrame(MessagingProfileMetricListParams.TimeFrame._1H)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("time_frame", "1h").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = MessagingProfileMetricListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
