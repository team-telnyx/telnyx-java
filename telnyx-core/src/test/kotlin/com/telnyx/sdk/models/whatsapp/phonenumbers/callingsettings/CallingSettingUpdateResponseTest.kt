// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.whatsapp.phonenumbers.callingsettings

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CallingSettingUpdateResponseTest {

    @Test
    fun create() {
        val callingSettingUpdateResponse =
            CallingSettingUpdateResponse.builder()
                .data(
                    CallingSettingUpdateResponse.Data.builder()
                        .enabled(true)
                        .phoneNumber("phone_number")
                        .recordType("whatsapp_calling_settings")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        assertThat(callingSettingUpdateResponse.data())
            .contains(
                CallingSettingUpdateResponse.Data.builder()
                    .enabled(true)
                    .phoneNumber("phone_number")
                    .recordType("whatsapp_calling_settings")
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val callingSettingUpdateResponse =
            CallingSettingUpdateResponse.builder()
                .data(
                    CallingSettingUpdateResponse.Data.builder()
                        .enabled(true)
                        .phoneNumber("phone_number")
                        .recordType("whatsapp_calling_settings")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        val roundtrippedCallingSettingUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(callingSettingUpdateResponse),
                jacksonTypeRef<CallingSettingUpdateResponse>(),
            )

        assertThat(roundtrippedCallingSettingUpdateResponse).isEqualTo(callingSettingUpdateResponse)
    }
}
