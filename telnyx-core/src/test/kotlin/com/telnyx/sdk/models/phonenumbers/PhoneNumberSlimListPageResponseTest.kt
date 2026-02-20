// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.phonenumbers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PhoneNumberSlimListPageResponseTest {

    @Test
    fun create() {
        val phoneNumberSlimListPageResponse =
            PhoneNumberSlimListPageResponse.builder()
                .addData(
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
                        .inboundCallScreening(
                            PhoneNumberSlimListResponse.InboundCallScreening.DISABLED
                        )
                        .phoneNumber("+19705555098")
                        .phoneNumberType(PhoneNumberSlimListResponse.PhoneNumberType.LOCAL)
                        .purchasedAt("2019-10-23T18:10:00.000Z")
                        .recordType("phone_number")
                        .status(PhoneNumberSlimListResponse.Status.ACTIVE)
                        .t38FaxGatewayEnabled(true)
                        .updatedAt("2019-10-24T18:10:00.000Z")
                        .build()
                )
                .meta(
                    PaginationMeta.builder()
                        .pageNumber(2L)
                        .totalPages(3L)
                        .pageSize(25L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        assertThat(phoneNumberSlimListPageResponse.data().getOrNull())
            .containsExactly(
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
            )
        assertThat(phoneNumberSlimListPageResponse.meta())
            .contains(
                PaginationMeta.builder()
                    .pageNumber(2L)
                    .totalPages(3L)
                    .pageSize(25L)
                    .totalResults(55L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val phoneNumberSlimListPageResponse =
            PhoneNumberSlimListPageResponse.builder()
                .addData(
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
                        .inboundCallScreening(
                            PhoneNumberSlimListResponse.InboundCallScreening.DISABLED
                        )
                        .phoneNumber("+19705555098")
                        .phoneNumberType(PhoneNumberSlimListResponse.PhoneNumberType.LOCAL)
                        .purchasedAt("2019-10-23T18:10:00.000Z")
                        .recordType("phone_number")
                        .status(PhoneNumberSlimListResponse.Status.ACTIVE)
                        .t38FaxGatewayEnabled(true)
                        .updatedAt("2019-10-24T18:10:00.000Z")
                        .build()
                )
                .meta(
                    PaginationMeta.builder()
                        .pageNumber(2L)
                        .totalPages(3L)
                        .pageSize(25L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        val roundtrippedPhoneNumberSlimListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(phoneNumberSlimListPageResponse),
                jacksonTypeRef<PhoneNumberSlimListPageResponse>(),
            )

        assertThat(roundtrippedPhoneNumberSlimListPageResponse)
            .isEqualTo(phoneNumberSlimListPageResponse)
    }
}
