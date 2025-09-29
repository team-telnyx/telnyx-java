// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.numberorders

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import com.telnyx.api.models.SubNumberOrderRegulatoryRequirementWithValue
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NumberOrderWithPhoneNumbersTest {

    @Test
    fun create() {
        val numberOrderWithPhoneNumbers =
            NumberOrderWithPhoneNumbers.builder()
                .id("12ade33a-21c0-473b-b055-b3c836e1c292")
                .billingGroupId("abc85f64-5717-4562-b3fc-2c9600")
                .connectionId("346789098765567")
                .createdAt(OffsetDateTime.parse("2018-01-01T00:00:00.000000Z"))
                .customerReference("MY REF 001")
                .messagingProfileId("abc85f64-5717-4562-b3fc-2c9600")
                .addPhoneNumber(
                    PhoneNumber.builder()
                        .id("dc8e4d67-33a0-4cbb-af74-7b58f05bd494")
                        .bundleId("bc8e4d67-33a0-4cbb-af74-7b58f05bd474")
                        .countryCode("US")
                        .countryIsoAlpha2("US")
                        .phoneNumber("+19705555098")
                        .phoneNumberType(PhoneNumber.PhoneNumberType.LOCAL)
                        .recordType("number_order_phone_number")
                        .addRegulatoryRequirement(
                            SubNumberOrderRegulatoryRequirementWithValue.builder()
                                .fieldType(
                                    SubNumberOrderRegulatoryRequirementWithValue.FieldType.ADDRESS
                                )
                                .fieldValue("45f45a04-b4be-4592-95b1-9306b9db2b21")
                                .recordType("phone_number_regulatory_requirement")
                                .requirementId("8ffb3622-7c6b-4ccc-b65f-7a3dc0099576")
                                .build()
                        )
                        .requirementsMet(true)
                        .requirementsStatus(PhoneNumber.RequirementsStatus.PENDING)
                        .status(PhoneNumber.Status.SUCCESS)
                        .build()
                )
                .phoneNumbersCount(1L)
                .recordType("number_order")
                .requirementsMet(true)
                .status(NumberOrderWithPhoneNumbers.Status.PENDING)
                .addSubNumberOrdersId("string")
                .updatedAt(OffsetDateTime.parse("2018-01-01T00:00:00.000000Z"))
                .build()

        assertThat(numberOrderWithPhoneNumbers.id())
            .contains("12ade33a-21c0-473b-b055-b3c836e1c292")
        assertThat(numberOrderWithPhoneNumbers.billingGroupId())
            .contains("abc85f64-5717-4562-b3fc-2c9600")
        assertThat(numberOrderWithPhoneNumbers.connectionId()).contains("346789098765567")
        assertThat(numberOrderWithPhoneNumbers.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T00:00:00.000000Z"))
        assertThat(numberOrderWithPhoneNumbers.customerReference()).contains("MY REF 001")
        assertThat(numberOrderWithPhoneNumbers.messagingProfileId())
            .contains("abc85f64-5717-4562-b3fc-2c9600")
        assertThat(numberOrderWithPhoneNumbers.phoneNumbers().getOrNull())
            .containsExactly(
                PhoneNumber.builder()
                    .id("dc8e4d67-33a0-4cbb-af74-7b58f05bd494")
                    .bundleId("bc8e4d67-33a0-4cbb-af74-7b58f05bd474")
                    .countryCode("US")
                    .countryIsoAlpha2("US")
                    .phoneNumber("+19705555098")
                    .phoneNumberType(PhoneNumber.PhoneNumberType.LOCAL)
                    .recordType("number_order_phone_number")
                    .addRegulatoryRequirement(
                        SubNumberOrderRegulatoryRequirementWithValue.builder()
                            .fieldType(
                                SubNumberOrderRegulatoryRequirementWithValue.FieldType.ADDRESS
                            )
                            .fieldValue("45f45a04-b4be-4592-95b1-9306b9db2b21")
                            .recordType("phone_number_regulatory_requirement")
                            .requirementId("8ffb3622-7c6b-4ccc-b65f-7a3dc0099576")
                            .build()
                    )
                    .requirementsMet(true)
                    .requirementsStatus(PhoneNumber.RequirementsStatus.PENDING)
                    .status(PhoneNumber.Status.SUCCESS)
                    .build()
            )
        assertThat(numberOrderWithPhoneNumbers.phoneNumbersCount()).contains(1L)
        assertThat(numberOrderWithPhoneNumbers.recordType()).contains("number_order")
        assertThat(numberOrderWithPhoneNumbers.requirementsMet()).contains(true)
        assertThat(numberOrderWithPhoneNumbers.status())
            .contains(NumberOrderWithPhoneNumbers.Status.PENDING)
        assertThat(numberOrderWithPhoneNumbers.subNumberOrdersIds().getOrNull())
            .containsExactly("string")
        assertThat(numberOrderWithPhoneNumbers.updatedAt())
            .contains(OffsetDateTime.parse("2018-01-01T00:00:00.000000Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val numberOrderWithPhoneNumbers =
            NumberOrderWithPhoneNumbers.builder()
                .id("12ade33a-21c0-473b-b055-b3c836e1c292")
                .billingGroupId("abc85f64-5717-4562-b3fc-2c9600")
                .connectionId("346789098765567")
                .createdAt(OffsetDateTime.parse("2018-01-01T00:00:00.000000Z"))
                .customerReference("MY REF 001")
                .messagingProfileId("abc85f64-5717-4562-b3fc-2c9600")
                .addPhoneNumber(
                    PhoneNumber.builder()
                        .id("dc8e4d67-33a0-4cbb-af74-7b58f05bd494")
                        .bundleId("bc8e4d67-33a0-4cbb-af74-7b58f05bd474")
                        .countryCode("US")
                        .countryIsoAlpha2("US")
                        .phoneNumber("+19705555098")
                        .phoneNumberType(PhoneNumber.PhoneNumberType.LOCAL)
                        .recordType("number_order_phone_number")
                        .addRegulatoryRequirement(
                            SubNumberOrderRegulatoryRequirementWithValue.builder()
                                .fieldType(
                                    SubNumberOrderRegulatoryRequirementWithValue.FieldType.ADDRESS
                                )
                                .fieldValue("45f45a04-b4be-4592-95b1-9306b9db2b21")
                                .recordType("phone_number_regulatory_requirement")
                                .requirementId("8ffb3622-7c6b-4ccc-b65f-7a3dc0099576")
                                .build()
                        )
                        .requirementsMet(true)
                        .requirementsStatus(PhoneNumber.RequirementsStatus.PENDING)
                        .status(PhoneNumber.Status.SUCCESS)
                        .build()
                )
                .phoneNumbersCount(1L)
                .recordType("number_order")
                .requirementsMet(true)
                .status(NumberOrderWithPhoneNumbers.Status.PENDING)
                .addSubNumberOrdersId("string")
                .updatedAt(OffsetDateTime.parse("2018-01-01T00:00:00.000000Z"))
                .build()

        val roundtrippedNumberOrderWithPhoneNumbers =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(numberOrderWithPhoneNumbers),
                jacksonTypeRef<NumberOrderWithPhoneNumbers>(),
            )

        assertThat(roundtrippedNumberOrderWithPhoneNumbers).isEqualTo(numberOrderWithPhoneNumbers)
    }
}
