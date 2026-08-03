// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailmessages

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmailMessageDeleteAllParamsTest {

    @Test
    fun create() {
        EmailMessageDeleteAllParams.builder().address("dev@stainless.com").build()
    }

    @Test
    fun queryParams() {
        val params = EmailMessageDeleteAllParams.builder().address("dev@stainless.com").build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("address", "dev@stainless.com").build())
    }
}
