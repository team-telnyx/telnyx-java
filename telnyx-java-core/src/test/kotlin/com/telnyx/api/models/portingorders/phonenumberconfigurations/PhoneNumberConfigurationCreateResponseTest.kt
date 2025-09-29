// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.portingorders.phonenumberconfigurations

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PhoneNumberConfigurationCreateResponseTest {

    @Test
    fun create() {
        val phoneNumberConfigurationCreateResponse =
            PhoneNumberConfigurationCreateResponse.builder()
                .addData(
                    PhoneNumberConfigurationCreateResponse.Data.builder()
                        .id("eef3340b-8903-4466-b445-89b697315a3a")
                        .createdAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                        .portingPhoneNumberId("f1486bae-f067-460c-ad43-73a92848f902")
                        .recordType("porting_phone_number_configuration")
                        .updatedAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                        .userBundleId("daa4308e-742f-4867-97f2-3073db13319a")
                        .build()
                )
                .build()

        assertThat(phoneNumberConfigurationCreateResponse.data().getOrNull())
            .containsExactly(
                PhoneNumberConfigurationCreateResponse.Data.builder()
                    .id("eef3340b-8903-4466-b445-89b697315a3a")
                    .createdAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                    .portingPhoneNumberId("f1486bae-f067-460c-ad43-73a92848f902")
                    .recordType("porting_phone_number_configuration")
                    .updatedAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                    .userBundleId("daa4308e-742f-4867-97f2-3073db13319a")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val phoneNumberConfigurationCreateResponse =
            PhoneNumberConfigurationCreateResponse.builder()
                .addData(
                    PhoneNumberConfigurationCreateResponse.Data.builder()
                        .id("eef3340b-8903-4466-b445-89b697315a3a")
                        .createdAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                        .portingPhoneNumberId("f1486bae-f067-460c-ad43-73a92848f902")
                        .recordType("porting_phone_number_configuration")
                        .updatedAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                        .userBundleId("daa4308e-742f-4867-97f2-3073db13319a")
                        .build()
                )
                .build()

        val roundtrippedPhoneNumberConfigurationCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(phoneNumberConfigurationCreateResponse),
                jacksonTypeRef<PhoneNumberConfigurationCreateResponse>(),
            )

        assertThat(roundtrippedPhoneNumberConfigurationCreateResponse)
            .isEqualTo(phoneNumberConfigurationCreateResponse)
    }
}
