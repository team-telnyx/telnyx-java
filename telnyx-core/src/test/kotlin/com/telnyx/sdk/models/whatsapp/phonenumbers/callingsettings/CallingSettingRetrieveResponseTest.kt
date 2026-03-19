// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.whatsapp.phonenumbers.callingsettings

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CallingSettingRetrieveResponseTest {

    @Test
    fun create() {
        val callingSettingRetrieveResponse =
            CallingSettingRetrieveResponse.builder()
                .data(
                    CallingSettingRetrieveResponse.Data.builder()
                        .enabled(true)
                        .phoneNumber("phone_number")
                        .recordType("whatsapp_calling_settings")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        assertThat(callingSettingRetrieveResponse.data())
            .contains(
                CallingSettingRetrieveResponse.Data.builder()
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
        val callingSettingRetrieveResponse =
            CallingSettingRetrieveResponse.builder()
                .data(
                    CallingSettingRetrieveResponse.Data.builder()
                        .enabled(true)
                        .phoneNumber("phone_number")
                        .recordType("whatsapp_calling_settings")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        val roundtrippedCallingSettingRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(callingSettingRetrieveResponse),
                jacksonTypeRef<CallingSettingRetrieveResponse>(),
            )

        assertThat(roundtrippedCallingSettingRetrieveResponse)
            .isEqualTo(callingSettingRetrieveResponse)
    }
}
