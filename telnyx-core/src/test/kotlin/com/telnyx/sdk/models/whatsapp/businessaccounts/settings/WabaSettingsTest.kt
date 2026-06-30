// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.whatsapp.businessaccounts.settings

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WabaSettingsTest {

    @Test
    fun create() {
        val wabaSettings =
            WabaSettings.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .name("name")
                .recordType("whatsapp_business_account_settings")
                .timezone("America/Chicago")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .webhookEnabled(true)
                .addWebhookEvent("string")
                .webhookFailoverUrl("webhook_failover_url")
                .webhookUrl("webhook_url")
                .build()

        assertThat(wabaSettings.id()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(wabaSettings.name()).contains("name")
        assertThat(wabaSettings.recordType()).contains("whatsapp_business_account_settings")
        assertThat(wabaSettings.timezone()).contains("America/Chicago")
        assertThat(wabaSettings.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(wabaSettings.webhookEnabled()).contains(true)
        assertThat(wabaSettings.webhookEvents().getOrNull()).containsExactly("string")
        assertThat(wabaSettings.webhookFailoverUrl()).contains("webhook_failover_url")
        assertThat(wabaSettings.webhookUrl()).contains("webhook_url")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val wabaSettings =
            WabaSettings.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .name("name")
                .recordType("whatsapp_business_account_settings")
                .timezone("America/Chicago")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .webhookEnabled(true)
                .addWebhookEvent("string")
                .webhookFailoverUrl("webhook_failover_url")
                .webhookUrl("webhook_url")
                .build()

        val roundtrippedWabaSettings =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(wabaSettings),
                jacksonTypeRef<WabaSettings>(),
            )

        assertThat(roundtrippedWabaSettings).isEqualTo(wabaSettings)
    }
}
