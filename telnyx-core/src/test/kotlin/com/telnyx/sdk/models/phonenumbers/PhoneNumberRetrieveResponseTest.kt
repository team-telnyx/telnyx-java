// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.phonenumbers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PhoneNumberRetrieveResponseTest {

    @Test
    fun create() {
        val phoneNumberRetrieveResponse =
            PhoneNumberRetrieveResponse.builder()
                .data(
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
                        .inboundCallScreening(PhoneNumberDetailed.InboundCallScreening.DISABLED)
                        .messagingProfileId("abc85f64-5717-4562-b3fc-2c9600000000")
                        .messagingProfileName("regional-customers")
                        .sourceType(PhoneNumberDetailed.SourceType.NUMBER_ORDER)
                        .t38FaxGatewayEnabled(true)
                        .build()
                )
                .build()

        assertThat(phoneNumberRetrieveResponse.data())
            .contains(
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
                    .inboundCallScreening(PhoneNumberDetailed.InboundCallScreening.DISABLED)
                    .messagingProfileId("abc85f64-5717-4562-b3fc-2c9600000000")
                    .messagingProfileName("regional-customers")
                    .sourceType(PhoneNumberDetailed.SourceType.NUMBER_ORDER)
                    .t38FaxGatewayEnabled(true)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val phoneNumberRetrieveResponse =
            PhoneNumberRetrieveResponse.builder()
                .data(
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
                        .inboundCallScreening(PhoneNumberDetailed.InboundCallScreening.DISABLED)
                        .messagingProfileId("abc85f64-5717-4562-b3fc-2c9600000000")
                        .messagingProfileName("regional-customers")
                        .sourceType(PhoneNumberDetailed.SourceType.NUMBER_ORDER)
                        .t38FaxGatewayEnabled(true)
                        .build()
                )
                .build()

        val roundtrippedPhoneNumberRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(phoneNumberRetrieveResponse),
                jacksonTypeRef<PhoneNumberRetrieveResponse>(),
            )

        assertThat(roundtrippedPhoneNumberRetrieveResponse).isEqualTo(phoneNumberRetrieveResponse)
    }
}
