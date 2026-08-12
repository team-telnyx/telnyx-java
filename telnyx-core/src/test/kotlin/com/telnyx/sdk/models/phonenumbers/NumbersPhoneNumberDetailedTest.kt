// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.phonenumbers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NumbersPhoneNumberDetailedTest {

    @Test
    fun create() {
        val numbersPhoneNumberDetailed =
            NumbersPhoneNumberDetailed.builder()
                .id("1293384261075731499")
                .countryIsoAlpha2("US")
                .createdAt(OffsetDateTime.parse("2019-10-23T18:10:00.000Z"))
                .deletionLockEnabled(false)
                .externalPin("1234")
                .phoneNumber("+19705555098")
                .phoneNumberType(NumbersPhoneNumberDetailed.PhoneNumberType.LOCAL)
                .purchasedAt("2019-10-23T18:10:00.000Z")
                .recordType("phone_number")
                .status(NumbersPhoneNumberDetailed.Status.ACTIVE)
                .addTag("tag_1")
                .addTag("tag_2")
                .activatedAt(OffsetDateTime.parse("2019-10-23T18:10:00.000Z"))
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
                .emergencyStatus(NumbersPhoneNumberDetailed.EmergencyStatus.ACTIVE)
                .hdVoiceEnabled(true)
                .inboundCallScreening(NumbersPhoneNumberDetailed.InboundCallScreening.DISABLED)
                .messagingProfileId("abc85f64-5717-4562-b3fc-2c9600000000")
                .messagingProfileName("regional-customers")
                .sourceType(NumbersPhoneNumberDetailed.SourceType.NUMBER_ORDER)
                .t38FaxGatewayEnabled(true)
                .updatedAt("2019-10-24T18:10:00.000Z")
                .build()

        assertThat(numbersPhoneNumberDetailed.id()).isEqualTo("1293384261075731499")
        assertThat(numbersPhoneNumberDetailed.countryIsoAlpha2()).isEqualTo("US")
        assertThat(numbersPhoneNumberDetailed.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-10-23T18:10:00.000Z"))
        assertThat(numbersPhoneNumberDetailed.deletionLockEnabled()).isEqualTo(false)
        assertThat(numbersPhoneNumberDetailed.externalPin()).contains("1234")
        assertThat(numbersPhoneNumberDetailed.phoneNumber()).isEqualTo("+19705555098")
        assertThat(numbersPhoneNumberDetailed.phoneNumberType())
            .isEqualTo(NumbersPhoneNumberDetailed.PhoneNumberType.LOCAL)
        assertThat(numbersPhoneNumberDetailed.purchasedAt()).isEqualTo("2019-10-23T18:10:00.000Z")
        assertThat(numbersPhoneNumberDetailed.recordType()).isEqualTo("phone_number")
        assertThat(numbersPhoneNumberDetailed.status())
            .isEqualTo(NumbersPhoneNumberDetailed.Status.ACTIVE)
        assertThat(numbersPhoneNumberDetailed.tags()).containsExactly("tag_1", "tag_2")
        assertThat(numbersPhoneNumberDetailed.activatedAt())
            .contains(OffsetDateTime.parse("2019-10-23T18:10:00.000Z"))
        assertThat(numbersPhoneNumberDetailed.billingGroupId())
            .contains("86f58db9-0fe3-4adc-9d1f-46e66e6e9323")
        assertThat(numbersPhoneNumberDetailed.callForwardingEnabled()).contains(true)
        assertThat(numbersPhoneNumberDetailed.callRecordingEnabled()).contains(true)
        assertThat(numbersPhoneNumberDetailed.callerIdNameEnabled()).contains(true)
        assertThat(numbersPhoneNumberDetailed.cnamListingEnabled()).contains(true)
        assertThat(numbersPhoneNumberDetailed.connectionId()).contains("1293384261075731499")
        assertThat(numbersPhoneNumberDetailed.connectionName()).contains("connection-name")
        assertThat(numbersPhoneNumberDetailed.customerReference()).contains("customer-reference")
        assertThat(numbersPhoneNumberDetailed.emergencyAddressId()).contains("1315261609962112019")
        assertThat(numbersPhoneNumberDetailed.emergencyEnabled()).contains(true)
        assertThat(numbersPhoneNumberDetailed.emergencyStatus())
            .contains(NumbersPhoneNumberDetailed.EmergencyStatus.ACTIVE)
        assertThat(numbersPhoneNumberDetailed.hdVoiceEnabled()).contains(true)
        assertThat(numbersPhoneNumberDetailed.inboundCallScreening())
            .contains(NumbersPhoneNumberDetailed.InboundCallScreening.DISABLED)
        assertThat(numbersPhoneNumberDetailed.messagingProfileId())
            .contains("abc85f64-5717-4562-b3fc-2c9600000000")
        assertThat(numbersPhoneNumberDetailed.messagingProfileName()).contains("regional-customers")
        assertThat(numbersPhoneNumberDetailed.sourceType())
            .contains(NumbersPhoneNumberDetailed.SourceType.NUMBER_ORDER)
        assertThat(numbersPhoneNumberDetailed.t38FaxGatewayEnabled()).contains(true)
        assertThat(numbersPhoneNumberDetailed.updatedAt()).contains("2019-10-24T18:10:00.000Z")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val numbersPhoneNumberDetailed =
            NumbersPhoneNumberDetailed.builder()
                .id("1293384261075731499")
                .countryIsoAlpha2("US")
                .createdAt(OffsetDateTime.parse("2019-10-23T18:10:00.000Z"))
                .deletionLockEnabled(false)
                .externalPin("1234")
                .phoneNumber("+19705555098")
                .phoneNumberType(NumbersPhoneNumberDetailed.PhoneNumberType.LOCAL)
                .purchasedAt("2019-10-23T18:10:00.000Z")
                .recordType("phone_number")
                .status(NumbersPhoneNumberDetailed.Status.ACTIVE)
                .addTag("tag_1")
                .addTag("tag_2")
                .activatedAt(OffsetDateTime.parse("2019-10-23T18:10:00.000Z"))
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
                .emergencyStatus(NumbersPhoneNumberDetailed.EmergencyStatus.ACTIVE)
                .hdVoiceEnabled(true)
                .inboundCallScreening(NumbersPhoneNumberDetailed.InboundCallScreening.DISABLED)
                .messagingProfileId("abc85f64-5717-4562-b3fc-2c9600000000")
                .messagingProfileName("regional-customers")
                .sourceType(NumbersPhoneNumberDetailed.SourceType.NUMBER_ORDER)
                .t38FaxGatewayEnabled(true)
                .updatedAt("2019-10-24T18:10:00.000Z")
                .build()

        val roundtrippedNumbersPhoneNumberDetailed =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(numbersPhoneNumberDetailed),
                jacksonTypeRef<NumbersPhoneNumberDetailed>(),
            )

        assertThat(roundtrippedNumbersPhoneNumberDetailed).isEqualTo(numbersPhoneNumberDetailed)
    }
}
