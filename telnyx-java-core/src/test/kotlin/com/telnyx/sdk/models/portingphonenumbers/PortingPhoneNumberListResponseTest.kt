// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.portingphonenumbers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PortingPhoneNumberListResponseTest {

    @Test
    fun create() {
        val portingPhoneNumberListResponse =
            PortingPhoneNumberListResponse.builder()
                .activationStatus(PortingPhoneNumberListResponse.ActivationStatus.ACTIVE)
                .phoneNumber("13035550987")
                .phoneNumberType(PortingPhoneNumberListResponse.PhoneNumberType.LOCAL)
                .portabilityStatus(PortingPhoneNumberListResponse.PortabilityStatus.CONFIRMED)
                .portingOrderId("f1486bae-f067-460c-ad43-73a92848f902")
                .portingOrderStatus(PortingPhoneNumberListResponse.PortingOrderStatus.IN_PROCESS)
                .recordType("porting_phone_number")
                .requirementsStatus(PortingPhoneNumberListResponse.RequirementsStatus.APPROVED)
                .supportKey("sr_a12345")
                .build()

        assertThat(portingPhoneNumberListResponse.activationStatus())
            .contains(PortingPhoneNumberListResponse.ActivationStatus.ACTIVE)
        assertThat(portingPhoneNumberListResponse.phoneNumber()).contains("13035550987")
        assertThat(portingPhoneNumberListResponse.phoneNumberType())
            .contains(PortingPhoneNumberListResponse.PhoneNumberType.LOCAL)
        assertThat(portingPhoneNumberListResponse.portabilityStatus())
            .contains(PortingPhoneNumberListResponse.PortabilityStatus.CONFIRMED)
        assertThat(portingPhoneNumberListResponse.portingOrderId())
            .contains("f1486bae-f067-460c-ad43-73a92848f902")
        assertThat(portingPhoneNumberListResponse.portingOrderStatus())
            .contains(PortingPhoneNumberListResponse.PortingOrderStatus.IN_PROCESS)
        assertThat(portingPhoneNumberListResponse.recordType()).contains("porting_phone_number")
        assertThat(portingPhoneNumberListResponse.requirementsStatus())
            .contains(PortingPhoneNumberListResponse.RequirementsStatus.APPROVED)
        assertThat(portingPhoneNumberListResponse.supportKey()).contains("sr_a12345")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val portingPhoneNumberListResponse =
            PortingPhoneNumberListResponse.builder()
                .activationStatus(PortingPhoneNumberListResponse.ActivationStatus.ACTIVE)
                .phoneNumber("13035550987")
                .phoneNumberType(PortingPhoneNumberListResponse.PhoneNumberType.LOCAL)
                .portabilityStatus(PortingPhoneNumberListResponse.PortabilityStatus.CONFIRMED)
                .portingOrderId("f1486bae-f067-460c-ad43-73a92848f902")
                .portingOrderStatus(PortingPhoneNumberListResponse.PortingOrderStatus.IN_PROCESS)
                .recordType("porting_phone_number")
                .requirementsStatus(PortingPhoneNumberListResponse.RequirementsStatus.APPROVED)
                .supportKey("sr_a12345")
                .build()

        val roundtrippedPortingPhoneNumberListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(portingPhoneNumberListResponse),
                jacksonTypeRef<PortingPhoneNumberListResponse>(),
            )

        assertThat(roundtrippedPortingPhoneNumberListResponse)
            .isEqualTo(portingPhoneNumberListResponse)
    }
}
