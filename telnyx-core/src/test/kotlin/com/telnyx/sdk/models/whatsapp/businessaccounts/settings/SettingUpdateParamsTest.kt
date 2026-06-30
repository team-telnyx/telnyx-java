// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.whatsapp.businessaccounts.settings

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SettingUpdateParamsTest {

    @Test
    fun create() {
        SettingUpdateParams.builder()
            .id("id")
            .name("name")
            .timezone("America/New_York")
            .webhookEnabled(true)
            .addWebhookEvent("string")
            .webhookFailoverUrl("webhook_failover_url")
            .webhookUrl("webhook_url")
            .build()
    }

    @Test
    fun pathParams() {
        val params = SettingUpdateParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            SettingUpdateParams.builder()
                .id("id")
                .name("name")
                .timezone("America/New_York")
                .webhookEnabled(true)
                .addWebhookEvent("string")
                .webhookFailoverUrl("webhook_failover_url")
                .webhookUrl("webhook_url")
                .build()

        val body = params._body()

        assertThat(body.name()).contains("name")
        assertThat(body.timezone()).contains("America/New_York")
        assertThat(body.webhookEnabled()).contains(true)
        assertThat(body.webhookEvents().getOrNull()).containsExactly("string")
        assertThat(body.webhookFailoverUrl()).contains("webhook_failover_url")
        assertThat(body.webhookUrl()).contains("webhook_url")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = SettingUpdateParams.builder().id("id").build()

        val body = params._body()
    }
}
