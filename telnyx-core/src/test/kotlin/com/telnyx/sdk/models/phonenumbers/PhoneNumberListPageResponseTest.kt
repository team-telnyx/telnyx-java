// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.phonenumbers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.models.phonenumberblocks.jobs.JobError
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PhoneNumberListPageResponseTest {

    @Test
    fun create() {
        val phoneNumberListPageResponse =
            PhoneNumberListPageResponse.builder()
                .addData(
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
                )
                .meta(
                    PaginationMeta.builder()
                        .pageNumber(2L)
                        .totalPages(3L)
                        .pageSize(25L)
                        .totalResults(55L)
                        .build()
                )
                .addError(
                    JobError.builder()
                        .code("10007")
                        .detail("An unexpected error occured.")
                        .meta(
                            JobError.Meta.builder()
                                .url("https://developers.telnyx.com/docs/overview/errors/10015")
                                .build()
                        )
                        .source(
                            JobError.Source.builder()
                                .parameter("parameter")
                                .pointer("/base")
                                .build()
                        )
                        .title("Unexpected error")
                        .build()
                )
                .build()

        assertThat(phoneNumberListPageResponse.data())
            .containsExactly(
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
            )
        assertThat(phoneNumberListPageResponse.meta())
            .isEqualTo(
                PaginationMeta.builder()
                    .pageNumber(2L)
                    .totalPages(3L)
                    .pageSize(25L)
                    .totalResults(55L)
                    .build()
            )
        assertThat(phoneNumberListPageResponse.errors().getOrNull())
            .containsExactly(
                JobError.builder()
                    .code("10007")
                    .detail("An unexpected error occured.")
                    .meta(
                        JobError.Meta.builder()
                            .url("https://developers.telnyx.com/docs/overview/errors/10015")
                            .build()
                    )
                    .source(
                        JobError.Source.builder().parameter("parameter").pointer("/base").build()
                    )
                    .title("Unexpected error")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val phoneNumberListPageResponse =
            PhoneNumberListPageResponse.builder()
                .addData(
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
                )
                .meta(
                    PaginationMeta.builder()
                        .pageNumber(2L)
                        .totalPages(3L)
                        .pageSize(25L)
                        .totalResults(55L)
                        .build()
                )
                .addError(
                    JobError.builder()
                        .code("10007")
                        .detail("An unexpected error occured.")
                        .meta(
                            JobError.Meta.builder()
                                .url("https://developers.telnyx.com/docs/overview/errors/10015")
                                .build()
                        )
                        .source(
                            JobError.Source.builder()
                                .parameter("parameter")
                                .pointer("/base")
                                .build()
                        )
                        .title("Unexpected error")
                        .build()
                )
                .build()

        val roundtrippedPhoneNumberListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(phoneNumberListPageResponse),
                jacksonTypeRef<PhoneNumberListPageResponse>(),
            )

        assertThat(roundtrippedPhoneNumberListPageResponse).isEqualTo(phoneNumberListPageResponse)
    }
}
