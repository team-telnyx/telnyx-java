// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.meetingbot.calendar

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CalendarRetrieveOAuthCallbackParamsTest {

    @Test
    fun create() {
        CalendarRetrieveOAuthCallbackParams.builder()
            .code("code")
            .error("error")
            .state("state")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            CalendarRetrieveOAuthCallbackParams.builder()
                .code("code")
                .error("error")
                .state("state")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("code", "code")
                    .put("error", "error")
                    .put("state", "state")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = CalendarRetrieveOAuthCallbackParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
