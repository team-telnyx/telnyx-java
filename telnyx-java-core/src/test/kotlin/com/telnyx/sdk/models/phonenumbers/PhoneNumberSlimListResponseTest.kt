// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.phonenumbers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PhoneNumberSlimListResponseTest {

    @Test
    fun create() {
        val phoneNumberSlimListResponse =
            PhoneNumberSlimListResponse.builder()
                .id("1293384261075731499")
                .billingGroupId("86f58db9-0fe3-4adc-9d1f-46e66e6e9323")
                .callForwardingEnabled(true)
                .callRecordingEnabled(true)
                .callerIdNameEnabled(true)
                .cnamListingEnabled(true)
                .connectionId("1293384261075731499")
                .countryIsoAlpha2("US")
                .createdAt("2019-10-23T18:10:00.000Z")
                .customerReference("customer-reference")
                .emergencyAddressId("1315261609962112019")
                .emergencyEnabled(true)
                .emergencyStatus(PhoneNumberSlimListResponse.EmergencyStatus.ACTIVE)
                .externalPin("1234")
                .hdVoiceEnabled(true)
                .inboundCallScreening(PhoneNumberSlimListResponse.InboundCallScreening.DISABLED)
                .phoneNumber("+19705555098")
                .phoneNumberType(PhoneNumberSlimListResponse.PhoneNumberType.LOCAL)
                .purchasedAt("2019-10-23T18:10:00.000Z")
                .recordType("phone_number")
                .status(PhoneNumberSlimListResponse.Status.ACTIVE)
                .t38FaxGatewayEnabled(true)
                .updatedAt("2019-10-24T18:10:00.000Z")
                .build()

        assertThat(phoneNumberSlimListResponse.id()).contains("1293384261075731499")
        assertThat(phoneNumberSlimListResponse.billingGroupId())
            .contains("86f58db9-0fe3-4adc-9d1f-46e66e6e9323")
        assertThat(phoneNumberSlimListResponse.callForwardingEnabled()).contains(true)
        assertThat(phoneNumberSlimListResponse.callRecordingEnabled()).contains(true)
        assertThat(phoneNumberSlimListResponse.callerIdNameEnabled()).contains(true)
        assertThat(phoneNumberSlimListResponse.cnamListingEnabled()).contains(true)
        assertThat(phoneNumberSlimListResponse.connectionId()).contains("1293384261075731499")
        assertThat(phoneNumberSlimListResponse.countryIsoAlpha2()).contains("US")
        assertThat(phoneNumberSlimListResponse.createdAt()).contains("2019-10-23T18:10:00.000Z")
        assertThat(phoneNumberSlimListResponse.customerReference()).contains("customer-reference")
        assertThat(phoneNumberSlimListResponse.emergencyAddressId()).contains("1315261609962112019")
        assertThat(phoneNumberSlimListResponse.emergencyEnabled()).contains(true)
        assertThat(phoneNumberSlimListResponse.emergencyStatus())
            .contains(PhoneNumberSlimListResponse.EmergencyStatus.ACTIVE)
        assertThat(phoneNumberSlimListResponse.externalPin()).contains("1234")
        assertThat(phoneNumberSlimListResponse.hdVoiceEnabled()).contains(true)
        assertThat(phoneNumberSlimListResponse.inboundCallScreening())
            .contains(PhoneNumberSlimListResponse.InboundCallScreening.DISABLED)
        assertThat(phoneNumberSlimListResponse.phoneNumber()).contains("+19705555098")
        assertThat(phoneNumberSlimListResponse.phoneNumberType())
            .contains(PhoneNumberSlimListResponse.PhoneNumberType.LOCAL)
        assertThat(phoneNumberSlimListResponse.purchasedAt()).contains("2019-10-23T18:10:00.000Z")
        assertThat(phoneNumberSlimListResponse.recordType()).contains("phone_number")
        assertThat(phoneNumberSlimListResponse.status())
            .contains(PhoneNumberSlimListResponse.Status.ACTIVE)
        assertThat(phoneNumberSlimListResponse.t38FaxGatewayEnabled()).contains(true)
        assertThat(phoneNumberSlimListResponse.updatedAt()).contains("2019-10-24T18:10:00.000Z")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val phoneNumberSlimListResponse =
            PhoneNumberSlimListResponse.builder()
                .id("1293384261075731499")
                .billingGroupId("86f58db9-0fe3-4adc-9d1f-46e66e6e9323")
                .callForwardingEnabled(true)
                .callRecordingEnabled(true)
                .callerIdNameEnabled(true)
                .cnamListingEnabled(true)
                .connectionId("1293384261075731499")
                .countryIsoAlpha2("US")
                .createdAt("2019-10-23T18:10:00.000Z")
                .customerReference("customer-reference")
                .emergencyAddressId("1315261609962112019")
                .emergencyEnabled(true)
                .emergencyStatus(PhoneNumberSlimListResponse.EmergencyStatus.ACTIVE)
                .externalPin("1234")
                .hdVoiceEnabled(true)
                .inboundCallScreening(PhoneNumberSlimListResponse.InboundCallScreening.DISABLED)
                .phoneNumber("+19705555098")
                .phoneNumberType(PhoneNumberSlimListResponse.PhoneNumberType.LOCAL)
                .purchasedAt("2019-10-23T18:10:00.000Z")
                .recordType("phone_number")
                .status(PhoneNumberSlimListResponse.Status.ACTIVE)
                .t38FaxGatewayEnabled(true)
                .updatedAt("2019-10-24T18:10:00.000Z")
                .build()

        val roundtrippedPhoneNumberSlimListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(phoneNumberSlimListResponse),
                jacksonTypeRef<PhoneNumberSlimListResponse>(),
            )

        assertThat(roundtrippedPhoneNumberSlimListResponse).isEqualTo(phoneNumberSlimListResponse)
    }
}
