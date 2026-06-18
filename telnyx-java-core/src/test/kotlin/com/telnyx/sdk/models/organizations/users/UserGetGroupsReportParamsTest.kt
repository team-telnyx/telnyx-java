// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.organizations.users

import com.telnyx.sdk.core.http.Headers
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserGetGroupsReportParamsTest {

    @Test
    fun create() {
        UserGetGroupsReportParams.builder()
            .accept(UserGetGroupsReportParams.Accept.APPLICATION_JSON)
            .build()
    }

    @Test
    fun headers() {
        val params =
            UserGetGroupsReportParams.builder()
                .accept(UserGetGroupsReportParams.Accept.APPLICATION_JSON)
                .build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().put("Accept", "application/json").build())
    }

    @Test
    fun headersWithoutOptionalFields() {
        val params = UserGetGroupsReportParams.builder().build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }
}
