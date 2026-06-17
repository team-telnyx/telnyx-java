// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.whatsapp.userdata

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WhatsappUserDataTest {

    @Test
    fun create() {
        val whatsappUserData =
            WhatsappUserData.builder()
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .recordType("whatsapp_user_data")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .webhookFailoverUrl("webhook_failover_url")
                .webhookUrl("webhook_url")
                .build()

        assertThat(whatsappUserData.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(whatsappUserData.recordType()).contains("whatsapp_user_data")
        assertThat(whatsappUserData.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(whatsappUserData.webhookFailoverUrl()).contains("webhook_failover_url")
        assertThat(whatsappUserData.webhookUrl()).contains("webhook_url")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val whatsappUserData =
            WhatsappUserData.builder()
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .recordType("whatsapp_user_data")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .webhookFailoverUrl("webhook_failover_url")
                .webhookUrl("webhook_url")
                .build()

        val roundtrippedWhatsappUserData =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(whatsappUserData),
                jacksonTypeRef<WhatsappUserData>(),
            )

        assertThat(roundtrippedWhatsappUserData).isEqualTo(whatsappUserData)
    }
}
