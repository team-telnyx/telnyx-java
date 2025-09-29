// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.legacy.reporting.usagereports.voice

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VoiceListParamsTest {

    @Test
    fun create() {
        VoiceListParams.builder().page(1).perPage(1).build()
    }

    @Test
    fun queryParams() {
        val params = VoiceListParams.builder().page(1).perPage(1).build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("page", "1").put("per_page", "1").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = VoiceListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
