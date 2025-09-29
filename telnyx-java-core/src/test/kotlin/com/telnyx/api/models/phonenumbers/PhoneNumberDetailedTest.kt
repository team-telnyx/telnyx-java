// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.phonenumbers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PhoneNumberDetailedTest {

    @Test
    fun create() {
        val phoneNumberDetailed =
            PhoneNumberDetailed.builder()
                .id("1293384261075731499")
                .billingGroupId("86f58db9-0fe3-4adc-9d1f-46e66e6e9323")
                .callForwardingEnabled(true)
                .callRecordingEnabled(true)
                .callerIdNameEnabled(true)
                .cnamListingEnabled(true)
                .connectionId("1293384261075731499")
                .connectionName("connection-name")
                .countryIsoAlpha2("US")
                .createdAt("2019-10-23T18:10:00.000Z")
                .customerReference("customer-reference")
                .deletionLockEnabled(false)
                .emergencyAddressId("1315261609962112019")
                .emergencyEnabled(true)
                .emergencyStatus(PhoneNumberDetailed.EmergencyStatus.ACTIVE)
                .externalPin("1234")
                .inboundCallScreening(PhoneNumberDetailed.InboundCallScreening.DISABLED)
                .messagingProfileId("abc85f64-5717-4562-b3fc-2c9600000000")
                .messagingProfileName("regional-customers")
                .phoneNumber("+19705555098")
                .phoneNumberType(PhoneNumberDetailed.PhoneNumberType.LOCAL)
                .purchasedAt("2019-10-23T18:10:00.000Z")
                .recordType("phone_number")
                .sourceType(PhoneNumberDetailed.SourceType.NUMBER_ORDER)
                .status(PhoneNumberDetailed.Status.ACTIVE)
                .t38FaxGatewayEnabled(true)
                .addTag("tag_1")
                .addTag("tag_2")
                .build()

        assertThat(phoneNumberDetailed.id()).contains("1293384261075731499")
        assertThat(phoneNumberDetailed.billingGroupId())
            .contains("86f58db9-0fe3-4adc-9d1f-46e66e6e9323")
        assertThat(phoneNumberDetailed.callForwardingEnabled()).contains(true)
        assertThat(phoneNumberDetailed.callRecordingEnabled()).contains(true)
        assertThat(phoneNumberDetailed.callerIdNameEnabled()).contains(true)
        assertThat(phoneNumberDetailed.cnamListingEnabled()).contains(true)
        assertThat(phoneNumberDetailed.connectionId()).contains("1293384261075731499")
        assertThat(phoneNumberDetailed.connectionName()).contains("connection-name")
        assertThat(phoneNumberDetailed.countryIsoAlpha2()).contains("US")
        assertThat(phoneNumberDetailed.createdAt()).contains("2019-10-23T18:10:00.000Z")
        assertThat(phoneNumberDetailed.customerReference()).contains("customer-reference")
        assertThat(phoneNumberDetailed.deletionLockEnabled()).contains(false)
        assertThat(phoneNumberDetailed.emergencyAddressId()).contains("1315261609962112019")
        assertThat(phoneNumberDetailed.emergencyEnabled()).contains(true)
        assertThat(phoneNumberDetailed.emergencyStatus())
            .contains(PhoneNumberDetailed.EmergencyStatus.ACTIVE)
        assertThat(phoneNumberDetailed.externalPin()).contains("1234")
        assertThat(phoneNumberDetailed.inboundCallScreening())
            .contains(PhoneNumberDetailed.InboundCallScreening.DISABLED)
        assertThat(phoneNumberDetailed.messagingProfileId())
            .contains("abc85f64-5717-4562-b3fc-2c9600000000")
        assertThat(phoneNumberDetailed.messagingProfileName()).contains("regional-customers")
        assertThat(phoneNumberDetailed.phoneNumber()).contains("+19705555098")
        assertThat(phoneNumberDetailed.phoneNumberType())
            .contains(PhoneNumberDetailed.PhoneNumberType.LOCAL)
        assertThat(phoneNumberDetailed.purchasedAt()).contains("2019-10-23T18:10:00.000Z")
        assertThat(phoneNumberDetailed.recordType()).contains("phone_number")
        assertThat(phoneNumberDetailed.sourceType())
            .contains(PhoneNumberDetailed.SourceType.NUMBER_ORDER)
        assertThat(phoneNumberDetailed.status()).contains(PhoneNumberDetailed.Status.ACTIVE)
        assertThat(phoneNumberDetailed.t38FaxGatewayEnabled()).contains(true)
        assertThat(phoneNumberDetailed.tags().getOrNull()).containsExactly("tag_1", "tag_2")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val phoneNumberDetailed =
            PhoneNumberDetailed.builder()
                .id("1293384261075731499")
                .billingGroupId("86f58db9-0fe3-4adc-9d1f-46e66e6e9323")
                .callForwardingEnabled(true)
                .callRecordingEnabled(true)
                .callerIdNameEnabled(true)
                .cnamListingEnabled(true)
                .connectionId("1293384261075731499")
                .connectionName("connection-name")
                .countryIsoAlpha2("US")
                .createdAt("2019-10-23T18:10:00.000Z")
                .customerReference("customer-reference")
                .deletionLockEnabled(false)
                .emergencyAddressId("1315261609962112019")
                .emergencyEnabled(true)
                .emergencyStatus(PhoneNumberDetailed.EmergencyStatus.ACTIVE)
                .externalPin("1234")
                .inboundCallScreening(PhoneNumberDetailed.InboundCallScreening.DISABLED)
                .messagingProfileId("abc85f64-5717-4562-b3fc-2c9600000000")
                .messagingProfileName("regional-customers")
                .phoneNumber("+19705555098")
                .phoneNumberType(PhoneNumberDetailed.PhoneNumberType.LOCAL)
                .purchasedAt("2019-10-23T18:10:00.000Z")
                .recordType("phone_number")
                .sourceType(PhoneNumberDetailed.SourceType.NUMBER_ORDER)
                .status(PhoneNumberDetailed.Status.ACTIVE)
                .t38FaxGatewayEnabled(true)
                .addTag("tag_1")
                .addTag("tag_2")
                .build()

        val roundtrippedPhoneNumberDetailed =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(phoneNumberDetailed),
                jacksonTypeRef<PhoneNumberDetailed>(),
            )

        assertThat(roundtrippedPhoneNumberDetailed).isEqualTo(phoneNumberDetailed)
    }
}
