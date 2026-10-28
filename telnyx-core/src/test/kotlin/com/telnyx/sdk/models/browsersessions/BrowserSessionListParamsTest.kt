// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.browsersessions

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BrowserSessionListParamsTest {

    @Test
    fun create() {
        BrowserSessionListParams.builder()
            .status(BrowserSessionListParams.Status.PROVISIONING)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            BrowserSessionListParams.builder()
                .status(BrowserSessionListParams.Status.PROVISIONING)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("status", "provisioning").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = BrowserSessionListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
