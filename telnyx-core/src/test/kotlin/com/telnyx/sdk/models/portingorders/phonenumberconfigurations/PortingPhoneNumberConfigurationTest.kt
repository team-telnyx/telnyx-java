// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.portingorders.phonenumberconfigurations

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PortingPhoneNumberConfigurationTest {

    @Test
    fun create() {
        val portingPhoneNumberConfiguration =
            PortingPhoneNumberConfiguration.builder()
                .id("eef3340b-8903-4466-b445-89b697315a3a")
                .createdAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                .portingPhoneNumberId("f1486bae-f067-460c-ad43-73a92848f902")
                .recordType("porting_phone_number_configuration")
                .updatedAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                .userBundleId("daa4308e-742f-4867-97f2-3073db13319a")
                .build()

        assertThat(portingPhoneNumberConfiguration.id())
            .contains("eef3340b-8903-4466-b445-89b697315a3a")
        assertThat(portingPhoneNumberConfiguration.createdAt())
            .contains(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
        assertThat(portingPhoneNumberConfiguration.portingPhoneNumberId())
            .contains("f1486bae-f067-460c-ad43-73a92848f902")
        assertThat(portingPhoneNumberConfiguration.recordType())
            .contains("porting_phone_number_configuration")
        assertThat(portingPhoneNumberConfiguration.updatedAt())
            .contains(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
        assertThat(portingPhoneNumberConfiguration.userBundleId())
            .contains("daa4308e-742f-4867-97f2-3073db13319a")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val portingPhoneNumberConfiguration =
            PortingPhoneNumberConfiguration.builder()
                .id("eef3340b-8903-4466-b445-89b697315a3a")
                .createdAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                .portingPhoneNumberId("f1486bae-f067-460c-ad43-73a92848f902")
                .recordType("porting_phone_number_configuration")
                .updatedAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                .userBundleId("daa4308e-742f-4867-97f2-3073db13319a")
                .build()

        val roundtrippedPortingPhoneNumberConfiguration =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(portingPhoneNumberConfiguration),
                jacksonTypeRef<PortingPhoneNumberConfiguration>(),
            )

        assertThat(roundtrippedPortingPhoneNumberConfiguration)
            .isEqualTo(portingPhoneNumberConfiguration)
    }
}
