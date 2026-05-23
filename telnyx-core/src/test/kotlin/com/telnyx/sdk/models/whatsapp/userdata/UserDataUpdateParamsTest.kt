// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.whatsapp.userdata

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserDataUpdateParamsTest {

    @Test
    fun create() {
        UserDataUpdateParams.builder()
            .webhookFailoverUrl("webhook_failover_url")
            .webhookUrl("webhook_url")
            .build()
    }

    @Test
    fun body() {
        val params =
            UserDataUpdateParams.builder()
                .webhookFailoverUrl("webhook_failover_url")
                .webhookUrl("webhook_url")
                .build()

        val body = params._body()

        assertThat(body.webhookFailoverUrl()).contains("webhook_failover_url")
        assertThat(body.webhookUrl()).contains("webhook_url")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = UserDataUpdateParams.builder().build()

        val body = params._body()
    }
}
