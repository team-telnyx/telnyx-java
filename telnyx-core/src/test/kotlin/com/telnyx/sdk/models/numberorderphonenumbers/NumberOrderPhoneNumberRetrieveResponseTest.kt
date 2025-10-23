// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.numberorderphonenumbers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.SubNumberOrderRegulatoryRequirementWithValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NumberOrderPhoneNumberRetrieveResponseTest {

    @Test
    fun create() {
        val numberOrderPhoneNumberRetrieveResponse =
            NumberOrderPhoneNumberRetrieveResponse.builder()
                .data(
                    NumberOrderPhoneNumber.builder()
                        .id("dc8e4d67-33a0-4cbb-af74-7b58f05bd494")
                        .bundleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .countryCode("US")
                        .deadline(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .isBlockNumber(false)
                        .locality("San Francisco")
                        .orderRequestId("dc8e4d67-33a0-4cbb-af74-7b58f05bd495")
                        .phoneNumber("+19705555098")
                        .phoneNumberType(NumberOrderPhoneNumber.PhoneNumberType.LOCAL)
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
                        .requirementsStatus(NumberOrderPhoneNumber.RequirementsStatus.PENDING)
                        .status(NumberOrderPhoneNumber.Status.PENDING)
                        .subNumberOrderId("dc8e4d67-33a0-4cbb-af74-7b58f05bd496")
                        .build()
                )
                .build()

        assertThat(numberOrderPhoneNumberRetrieveResponse.data())
            .contains(
                NumberOrderPhoneNumber.builder()
                    .id("dc8e4d67-33a0-4cbb-af74-7b58f05bd494")
                    .bundleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .countryCode("US")
                    .deadline(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .isBlockNumber(false)
                    .locality("San Francisco")
                    .orderRequestId("dc8e4d67-33a0-4cbb-af74-7b58f05bd495")
                    .phoneNumber("+19705555098")
                    .phoneNumberType(NumberOrderPhoneNumber.PhoneNumberType.LOCAL)
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
                    .requirementsStatus(NumberOrderPhoneNumber.RequirementsStatus.PENDING)
                    .status(NumberOrderPhoneNumber.Status.PENDING)
                    .subNumberOrderId("dc8e4d67-33a0-4cbb-af74-7b58f05bd496")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val numberOrderPhoneNumberRetrieveResponse =
            NumberOrderPhoneNumberRetrieveResponse.builder()
                .data(
                    NumberOrderPhoneNumber.builder()
                        .id("dc8e4d67-33a0-4cbb-af74-7b58f05bd494")
                        .bundleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .countryCode("US")
                        .deadline(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .isBlockNumber(false)
                        .locality("San Francisco")
                        .orderRequestId("dc8e4d67-33a0-4cbb-af74-7b58f05bd495")
                        .phoneNumber("+19705555098")
                        .phoneNumberType(NumberOrderPhoneNumber.PhoneNumberType.LOCAL)
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
                        .requirementsStatus(NumberOrderPhoneNumber.RequirementsStatus.PENDING)
                        .status(NumberOrderPhoneNumber.Status.PENDING)
                        .subNumberOrderId("dc8e4d67-33a0-4cbb-af74-7b58f05bd496")
                        .build()
                )
                .build()

        val roundtrippedNumberOrderPhoneNumberRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(numberOrderPhoneNumberRetrieveResponse),
                jacksonTypeRef<NumberOrderPhoneNumberRetrieveResponse>(),
            )

        assertThat(roundtrippedNumberOrderPhoneNumberRetrieveResponse)
            .isEqualTo(numberOrderPhoneNumberRetrieveResponse)
    }
}
