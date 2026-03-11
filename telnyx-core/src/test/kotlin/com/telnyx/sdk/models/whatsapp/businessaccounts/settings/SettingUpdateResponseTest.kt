// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.whatsapp.businessaccounts.settings

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SettingUpdateResponseTest {

    @Test
    fun create() {
        val settingUpdateResponse =
            SettingUpdateResponse.builder()
                .data(
                    SettingUpdateResponse.Data.builder()
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
                )
                .build()

        assertThat(settingUpdateResponse.data())
            .contains(
                SettingUpdateResponse.Data.builder()
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val settingUpdateResponse =
            SettingUpdateResponse.builder()
                .data(
                    SettingUpdateResponse.Data.builder()
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
                )
                .build()

        val roundtrippedSettingUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(settingUpdateResponse),
                jacksonTypeRef<SettingUpdateResponse>(),
            )

        assertThat(roundtrippedSettingUpdateResponse).isEqualTo(settingUpdateResponse)
    }
}
