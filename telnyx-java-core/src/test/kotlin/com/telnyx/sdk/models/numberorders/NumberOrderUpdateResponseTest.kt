// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.numberorders

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.SubNumberOrderRegulatoryRequirementWithValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NumberOrderUpdateResponseTest {

    @Test
    fun create() {
        val numberOrderUpdateResponse =
            NumberOrderUpdateResponse.builder()
                .data(
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
                                            SubNumberOrderRegulatoryRequirementWithValue.FieldType
                                                .ADDRESS
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
                )
                .build()

        assertThat(numberOrderUpdateResponse.data())
            .contains(
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
                                        SubNumberOrderRegulatoryRequirementWithValue.FieldType
                                            .ADDRESS
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val numberOrderUpdateResponse =
            NumberOrderUpdateResponse.builder()
                .data(
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
                                            SubNumberOrderRegulatoryRequirementWithValue.FieldType
                                                .ADDRESS
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
                )
                .build()

        val roundtrippedNumberOrderUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(numberOrderUpdateResponse),
                jacksonTypeRef<NumberOrderUpdateResponse>(),
            )

        assertThat(roundtrippedNumberOrderUpdateResponse).isEqualTo(numberOrderUpdateResponse)
    }
}
