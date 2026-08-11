// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.whatsapp.userdata

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserDataUpdateParamsTest {

    @Test
    fun create() {
        UserDataUpdateParams.builder()
            .webhookFailoverUrl("https://example.com")
            .webhookUrl("https://example.com")
            .build()
    }

    @Test
    fun body() {
        val params =
            UserDataUpdateParams.builder()
                .webhookFailoverUrl("https://example.com")
                .webhookUrl("https://example.com")
                .build()

        val body = params._body()

        assertThat(body.webhookFailoverUrl()).contains("https://example.com")
        assertThat(body.webhookUrl()).contains("https://example.com")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = UserDataUpdateParams.builder().build()

        val body = params._body()
    }
}
