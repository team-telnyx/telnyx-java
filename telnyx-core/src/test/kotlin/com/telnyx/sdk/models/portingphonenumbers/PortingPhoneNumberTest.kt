// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.portingphonenumbers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PortingPhoneNumberTest {

    @Test
    fun create() {
        val portingPhoneNumber =
            PortingPhoneNumber.builder()
                .activationStatus(PortingOrderActivationStatus.ACTIVE)
                .phoneNumber("13035550987")
                .phoneNumberType(PortingPhoneNumber.PhoneNumberType.LOCAL)
                .portabilityStatus(PortingPhoneNumber.PortabilityStatus.CONFIRMED)
                .portingOrderId("f1486bae-f067-460c-ad43-73a92848f902")
                .portingOrderStatus(PortingPhoneNumber.PortingOrderStatus.IN_PROCESS)
                .recordType("porting_phone_number")
                .requirementsStatus(PortingPhoneNumber.RequirementsStatus.APPROVED)
                .supportKey("sr_a12345")
                .build()

        assertThat(portingPhoneNumber.activationStatus())
            .contains(PortingOrderActivationStatus.ACTIVE)
        assertThat(portingPhoneNumber.phoneNumber()).contains("13035550987")
        assertThat(portingPhoneNumber.phoneNumberType())
            .contains(PortingPhoneNumber.PhoneNumberType.LOCAL)
        assertThat(portingPhoneNumber.portabilityStatus())
            .contains(PortingPhoneNumber.PortabilityStatus.CONFIRMED)
        assertThat(portingPhoneNumber.portingOrderId())
            .contains("f1486bae-f067-460c-ad43-73a92848f902")
        assertThat(portingPhoneNumber.portingOrderStatus())
            .contains(PortingPhoneNumber.PortingOrderStatus.IN_PROCESS)
        assertThat(portingPhoneNumber.recordType()).contains("porting_phone_number")
        assertThat(portingPhoneNumber.requirementsStatus())
            .contains(PortingPhoneNumber.RequirementsStatus.APPROVED)
        assertThat(portingPhoneNumber.supportKey()).contains("sr_a12345")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val portingPhoneNumber =
            PortingPhoneNumber.builder()
                .activationStatus(PortingOrderActivationStatus.ACTIVE)
                .phoneNumber("13035550987")
                .phoneNumberType(PortingPhoneNumber.PhoneNumberType.LOCAL)
                .portabilityStatus(PortingPhoneNumber.PortabilityStatus.CONFIRMED)
                .portingOrderId("f1486bae-f067-460c-ad43-73a92848f902")
                .portingOrderStatus(PortingPhoneNumber.PortingOrderStatus.IN_PROCESS)
                .recordType("porting_phone_number")
                .requirementsStatus(PortingPhoneNumber.RequirementsStatus.APPROVED)
                .supportKey("sr_a12345")
                .build()

        val roundtrippedPortingPhoneNumber =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(portingPhoneNumber),
                jacksonTypeRef<PortingPhoneNumber>(),
            )

        assertThat(roundtrippedPortingPhoneNumber).isEqualTo(portingPhoneNumber)
    }
}
