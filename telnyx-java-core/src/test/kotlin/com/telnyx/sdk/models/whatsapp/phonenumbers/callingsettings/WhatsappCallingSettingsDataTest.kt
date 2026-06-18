// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.whatsapp.phonenumbers.callingsettings

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WhatsappCallingSettingsDataTest {

    @Test
    fun create() {
        val whatsappCallingSettingsData =
            WhatsappCallingSettingsData.builder()
                .enabled(true)
                .phoneNumber("phone_number")
                .recordType("whatsapp_calling_settings")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(whatsappCallingSettingsData.enabled()).contains(true)
        assertThat(whatsappCallingSettingsData.phoneNumber()).contains("phone_number")
        assertThat(whatsappCallingSettingsData.recordType()).contains("whatsapp_calling_settings")
        assertThat(whatsappCallingSettingsData.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val whatsappCallingSettingsData =
            WhatsappCallingSettingsData.builder()
                .enabled(true)
                .phoneNumber("phone_number")
                .recordType("whatsapp_calling_settings")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedWhatsappCallingSettingsData =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(whatsappCallingSettingsData),
                jacksonTypeRef<WhatsappCallingSettingsData>(),
            )

        assertThat(roundtrippedWhatsappCallingSettingsData).isEqualTo(whatsappCallingSettingsData)
    }
}
