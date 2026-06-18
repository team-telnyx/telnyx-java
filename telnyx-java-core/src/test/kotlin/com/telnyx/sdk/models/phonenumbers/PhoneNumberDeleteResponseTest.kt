// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.phonenumbers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PhoneNumberDeleteResponseTest {

    @Test
    fun create() {
        val phoneNumberDeleteResponse =
            PhoneNumberDeleteResponse.builder()
                .data(
                    PhoneNumberDeleteResponse.Data.builder()
                        .id("1293384261075731499")
                        .billingGroupId("86f58db9-0fe3-4adc-9d1f-46e66e6e9323")
                        .callForwardingEnabled(true)
                        .callRecordingEnabled(true)
                        .callerIdNameEnabled(true)
                        .cnamListingEnabled(true)
                        .connectionId("1293384261075731499")
                        .connectionName("connection-name")
                        .createdAt("2019-10-23T18:10:00.000Z")
                        .customerReference("customer-reference")
                        .deletionLockEnabled(false)
                        .emergencyAddressId("1315261609962112019")
                        .emergencyEnabled(true)
                        .externalPin("1234")
                        .hdVoiceEnabled(true)
                        .messagingProfileId("abc85f64-5717-4562-b3fc-2c9600000000")
                        .messagingProfileName("regional-customers")
                        .phoneNumber("+19705555098")
                        .phoneNumberType(PhoneNumberDeleteResponse.Data.PhoneNumberType.LOCAL)
                        .purchasedAt("2019-10-23T18:10:00.000Z")
                        .recordType("phone_number")
                        .status(PhoneNumberDeleteResponse.Data.Status.DELETED)
                        .t38FaxGatewayEnabled(true)
                        .addTag("tag_1")
                        .addTag("tag_2")
                        .updatedAt("2019-10-24T18:10:00.000Z")
                        .build()
                )
                .build()

        assertThat(phoneNumberDeleteResponse.data())
            .contains(
                PhoneNumberDeleteResponse.Data.builder()
                    .id("1293384261075731499")
                    .billingGroupId("86f58db9-0fe3-4adc-9d1f-46e66e6e9323")
                    .callForwardingEnabled(true)
                    .callRecordingEnabled(true)
                    .callerIdNameEnabled(true)
                    .cnamListingEnabled(true)
                    .connectionId("1293384261075731499")
                    .connectionName("connection-name")
                    .createdAt("2019-10-23T18:10:00.000Z")
                    .customerReference("customer-reference")
                    .deletionLockEnabled(false)
                    .emergencyAddressId("1315261609962112019")
                    .emergencyEnabled(true)
                    .externalPin("1234")
                    .hdVoiceEnabled(true)
                    .messagingProfileId("abc85f64-5717-4562-b3fc-2c9600000000")
                    .messagingProfileName("regional-customers")
                    .phoneNumber("+19705555098")
                    .phoneNumberType(PhoneNumberDeleteResponse.Data.PhoneNumberType.LOCAL)
                    .purchasedAt("2019-10-23T18:10:00.000Z")
                    .recordType("phone_number")
                    .status(PhoneNumberDeleteResponse.Data.Status.DELETED)
                    .t38FaxGatewayEnabled(true)
                    .addTag("tag_1")
                    .addTag("tag_2")
                    .updatedAt("2019-10-24T18:10:00.000Z")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val phoneNumberDeleteResponse =
            PhoneNumberDeleteResponse.builder()
                .data(
                    PhoneNumberDeleteResponse.Data.builder()
                        .id("1293384261075731499")
                        .billingGroupId("86f58db9-0fe3-4adc-9d1f-46e66e6e9323")
                        .callForwardingEnabled(true)
                        .callRecordingEnabled(true)
                        .callerIdNameEnabled(true)
                        .cnamListingEnabled(true)
                        .connectionId("1293384261075731499")
                        .connectionName("connection-name")
                        .createdAt("2019-10-23T18:10:00.000Z")
                        .customerReference("customer-reference")
                        .deletionLockEnabled(false)
                        .emergencyAddressId("1315261609962112019")
                        .emergencyEnabled(true)
                        .externalPin("1234")
                        .hdVoiceEnabled(true)
                        .messagingProfileId("abc85f64-5717-4562-b3fc-2c9600000000")
                        .messagingProfileName("regional-customers")
                        .phoneNumber("+19705555098")
                        .phoneNumberType(PhoneNumberDeleteResponse.Data.PhoneNumberType.LOCAL)
                        .purchasedAt("2019-10-23T18:10:00.000Z")
                        .recordType("phone_number")
                        .status(PhoneNumberDeleteResponse.Data.Status.DELETED)
                        .t38FaxGatewayEnabled(true)
                        .addTag("tag_1")
                        .addTag("tag_2")
                        .updatedAt("2019-10-24T18:10:00.000Z")
                        .build()
                )
                .build()

        val roundtrippedPhoneNumberDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(phoneNumberDeleteResponse),
                jacksonTypeRef<PhoneNumberDeleteResponse>(),
            )

        assertThat(roundtrippedPhoneNumberDeleteResponse).isEqualTo(phoneNumberDeleteResponse)
    }
}
