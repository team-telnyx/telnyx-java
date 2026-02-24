// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.phonenumbers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PhoneNumberDetailedTest {

    @Test
    fun create() {
        val phoneNumberDetailed =
            PhoneNumberDetailed.builder()
                .id("1293384261075731499")
                .countryIsoAlpha2("US")
                .createdAt(OffsetDateTime.parse("2019-10-23T18:10:00.000Z"))
                .deletionLockEnabled(false)
                .externalPin("1234")
                .phoneNumber("+19705555098")
                .phoneNumberType(PhoneNumberDetailed.PhoneNumberType.LOCAL)
                .purchasedAt("2019-10-23T18:10:00.000Z")
                .recordType("phone_number")
                .status(PhoneNumberDetailed.Status.ACTIVE)
                .addTag("tag_1")
                .addTag("tag_2")
                .billingGroupId("86f58db9-0fe3-4adc-9d1f-46e66e6e9323")
                .callForwardingEnabled(true)
                .callRecordingEnabled(true)
                .callerIdNameEnabled(true)
                .cnamListingEnabled(true)
                .connectionId("1293384261075731499")
                .connectionName("connection-name")
                .customerReference("customer-reference")
                .emergencyAddressId("1315261609962112019")
                .emergencyEnabled(true)
                .emergencyStatus(PhoneNumberDetailed.EmergencyStatus.ACTIVE)
                .hdVoiceEnabled(true)
                .inboundCallScreening(PhoneNumberDetailed.InboundCallScreening.DISABLED)
                .messagingProfileId("abc85f64-5717-4562-b3fc-2c9600000000")
                .messagingProfileName("regional-customers")
                .sourceType(PhoneNumberDetailed.SourceType.NUMBER_ORDER)
                .t38FaxGatewayEnabled(true)
                .updatedAt("2019-10-24T18:10:00.000Z")
                .build()

        assertThat(phoneNumberDetailed.id()).isEqualTo("1293384261075731499")
        assertThat(phoneNumberDetailed.countryIsoAlpha2()).isEqualTo("US")
        assertThat(phoneNumberDetailed.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-10-23T18:10:00.000Z"))
        assertThat(phoneNumberDetailed.deletionLockEnabled()).isEqualTo(false)
        assertThat(phoneNumberDetailed.externalPin()).contains("1234")
        assertThat(phoneNumberDetailed.phoneNumber()).isEqualTo("+19705555098")
        assertThat(phoneNumberDetailed.phoneNumberType())
            .isEqualTo(PhoneNumberDetailed.PhoneNumberType.LOCAL)
        assertThat(phoneNumberDetailed.purchasedAt()).isEqualTo("2019-10-23T18:10:00.000Z")
        assertThat(phoneNumberDetailed.recordType()).isEqualTo("phone_number")
        assertThat(phoneNumberDetailed.status()).isEqualTo(PhoneNumberDetailed.Status.ACTIVE)
        assertThat(phoneNumberDetailed.tags()).containsExactly("tag_1", "tag_2")
        assertThat(phoneNumberDetailed.billingGroupId())
            .contains("86f58db9-0fe3-4adc-9d1f-46e66e6e9323")
        assertThat(phoneNumberDetailed.callForwardingEnabled()).contains(true)
        assertThat(phoneNumberDetailed.callRecordingEnabled()).contains(true)
        assertThat(phoneNumberDetailed.callerIdNameEnabled()).contains(true)
        assertThat(phoneNumberDetailed.cnamListingEnabled()).contains(true)
        assertThat(phoneNumberDetailed.connectionId()).contains("1293384261075731499")
        assertThat(phoneNumberDetailed.connectionName()).contains("connection-name")
        assertThat(phoneNumberDetailed.customerReference()).contains("customer-reference")
        assertThat(phoneNumberDetailed.emergencyAddressId()).contains("1315261609962112019")
        assertThat(phoneNumberDetailed.emergencyEnabled()).contains(true)
        assertThat(phoneNumberDetailed.emergencyStatus())
            .contains(PhoneNumberDetailed.EmergencyStatus.ACTIVE)
        assertThat(phoneNumberDetailed.hdVoiceEnabled()).contains(true)
        assertThat(phoneNumberDetailed.inboundCallScreening())
            .contains(PhoneNumberDetailed.InboundCallScreening.DISABLED)
        assertThat(phoneNumberDetailed.messagingProfileId())
            .contains("abc85f64-5717-4562-b3fc-2c9600000000")
        assertThat(phoneNumberDetailed.messagingProfileName()).contains("regional-customers")
        assertThat(phoneNumberDetailed.sourceType())
            .contains(PhoneNumberDetailed.SourceType.NUMBER_ORDER)
        assertThat(phoneNumberDetailed.t38FaxGatewayEnabled()).contains(true)
        assertThat(phoneNumberDetailed.updatedAt()).contains("2019-10-24T18:10:00.000Z")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val phoneNumberDetailed =
            PhoneNumberDetailed.builder()
                .id("1293384261075731499")
                .countryIsoAlpha2("US")
                .createdAt(OffsetDateTime.parse("2019-10-23T18:10:00.000Z"))
                .deletionLockEnabled(false)
                .externalPin("1234")
                .phoneNumber("+19705555098")
                .phoneNumberType(PhoneNumberDetailed.PhoneNumberType.LOCAL)
                .purchasedAt("2019-10-23T18:10:00.000Z")
                .recordType("phone_number")
                .status(PhoneNumberDetailed.Status.ACTIVE)
                .addTag("tag_1")
                .addTag("tag_2")
                .billingGroupId("86f58db9-0fe3-4adc-9d1f-46e66e6e9323")
                .callForwardingEnabled(true)
                .callRecordingEnabled(true)
                .callerIdNameEnabled(true)
                .cnamListingEnabled(true)
                .connectionId("1293384261075731499")
                .connectionName("connection-name")
                .customerReference("customer-reference")
                .emergencyAddressId("1315261609962112019")
                .emergencyEnabled(true)
                .emergencyStatus(PhoneNumberDetailed.EmergencyStatus.ACTIVE)
                .hdVoiceEnabled(true)
                .inboundCallScreening(PhoneNumberDetailed.InboundCallScreening.DISABLED)
                .messagingProfileId("abc85f64-5717-4562-b3fc-2c9600000000")
                .messagingProfileName("regional-customers")
                .sourceType(PhoneNumberDetailed.SourceType.NUMBER_ORDER)
                .t38FaxGatewayEnabled(true)
                .updatedAt("2019-10-24T18:10:00.000Z")
                .build()

        val roundtrippedPhoneNumberDetailed =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(phoneNumberDetailed),
                jacksonTypeRef<PhoneNumberDetailed>(),
            )

        assertThat(roundtrippedPhoneNumberDetailed).isEqualTo(phoneNumberDetailed)
    }
}
