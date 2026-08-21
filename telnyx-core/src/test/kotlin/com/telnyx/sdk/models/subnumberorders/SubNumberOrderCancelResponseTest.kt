// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.subnumberorders

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubNumberOrderCancelResponseTest {

    @Test
    fun create() {
        val subNumberOrderCancelResponse =
            SubNumberOrderCancelResponse.builder()
                .data(
                    NumbersSubNumberOrder.builder()
                        .id("12ade33a-21c0-473b-b055-b3c836e1c292")
                        .countryCode("US")
                        .createdAt(OffsetDateTime.parse("2018-01-01T00:00:00.000000Z"))
                        .customerReference("MY REF 001")
                        .isBlockSubNumberOrder(false)
                        .orderRequestId("12ade33a-21c0-473b-b055-b3c836e1c293")
                        .phoneNumberType(NumbersSubNumberOrder.PhoneNumberType.LOCAL)
                        .addPhoneNumber(
                            NumbersSubNumberOrder.PhoneNumber.builder()
                                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .bundleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .countryCode("country_code")
                                .phoneNumber("phone_number")
                                .phoneNumberType("phone_number_type")
                                .recordType("record_type")
                                .addRegulatoryRequirement(
                                    NumbersSubNumberOrder.PhoneNumber.RegulatoryRequirement
                                        .builder()
                                        .fieldType(
                                            NumbersSubNumberOrder.PhoneNumber.RegulatoryRequirement
                                                .FieldType
                                                .ADDRESS
                                        )
                                        .fieldValue("45f45a04-b4be-4592-95b1-9306b9db2b21")
                                        .recordType("phone_number_regulatory_requirement")
                                        .requirementId("8ffb3622-7c6b-4ccc-b65f-7a3dc0099576")
                                        .status(
                                            NumbersSubNumberOrder.PhoneNumber.RegulatoryRequirement
                                                .Status
                                                .APPROVED
                                        )
                                        .build()
                                )
                                .requirementsMet(true)
                                .requirementsStatus("requirements_status")
                                .status("status")
                                .build()
                        )
                        .phoneNumbersCount(1L)
                        .recordType("sub_number_order")
                        .addRegulatoryRequirement(
                            SubNumberOrderRegulatoryRequirement.builder()
                                .fieldType(SubNumberOrderRegulatoryRequirement.FieldType.ADDRESS)
                                .recordType("phone_number_regulatory_requirement")
                                .requirementId("8ffb3622-7c6b-4ccc-b65f-7a3dc0099576")
                                .build()
                        )
                        .requirementsMet(true)
                        .status(NumbersSubNumberOrder.Status.PENDING)
                        .updatedAt(OffsetDateTime.parse("2018-01-01T00:00:00.000000Z"))
                        .userId("d70873cd-7c98-401a-81b6-b1ae08246995")
                        .build()
                )
                .build()

        assertThat(subNumberOrderCancelResponse.data())
            .contains(
                NumbersSubNumberOrder.builder()
                    .id("12ade33a-21c0-473b-b055-b3c836e1c292")
                    .countryCode("US")
                    .createdAt(OffsetDateTime.parse("2018-01-01T00:00:00.000000Z"))
                    .customerReference("MY REF 001")
                    .isBlockSubNumberOrder(false)
                    .orderRequestId("12ade33a-21c0-473b-b055-b3c836e1c293")
                    .phoneNumberType(NumbersSubNumberOrder.PhoneNumberType.LOCAL)
                    .addPhoneNumber(
                        NumbersSubNumberOrder.PhoneNumber.builder()
                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .bundleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .countryCode("country_code")
                            .phoneNumber("phone_number")
                            .phoneNumberType("phone_number_type")
                            .recordType("record_type")
                            .addRegulatoryRequirement(
                                NumbersSubNumberOrder.PhoneNumber.RegulatoryRequirement.builder()
                                    .fieldType(
                                        NumbersSubNumberOrder.PhoneNumber.RegulatoryRequirement
                                            .FieldType
                                            .ADDRESS
                                    )
                                    .fieldValue("45f45a04-b4be-4592-95b1-9306b9db2b21")
                                    .recordType("phone_number_regulatory_requirement")
                                    .requirementId("8ffb3622-7c6b-4ccc-b65f-7a3dc0099576")
                                    .status(
                                        NumbersSubNumberOrder.PhoneNumber.RegulatoryRequirement
                                            .Status
                                            .APPROVED
                                    )
                                    .build()
                            )
                            .requirementsMet(true)
                            .requirementsStatus("requirements_status")
                            .status("status")
                            .build()
                    )
                    .phoneNumbersCount(1L)
                    .recordType("sub_number_order")
                    .addRegulatoryRequirement(
                        SubNumberOrderRegulatoryRequirement.builder()
                            .fieldType(SubNumberOrderRegulatoryRequirement.FieldType.ADDRESS)
                            .recordType("phone_number_regulatory_requirement")
                            .requirementId("8ffb3622-7c6b-4ccc-b65f-7a3dc0099576")
                            .build()
                    )
                    .requirementsMet(true)
                    .status(NumbersSubNumberOrder.Status.PENDING)
                    .updatedAt(OffsetDateTime.parse("2018-01-01T00:00:00.000000Z"))
                    .userId("d70873cd-7c98-401a-81b6-b1ae08246995")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val subNumberOrderCancelResponse =
            SubNumberOrderCancelResponse.builder()
                .data(
                    NumbersSubNumberOrder.builder()
                        .id("12ade33a-21c0-473b-b055-b3c836e1c292")
                        .countryCode("US")
                        .createdAt(OffsetDateTime.parse("2018-01-01T00:00:00.000000Z"))
                        .customerReference("MY REF 001")
                        .isBlockSubNumberOrder(false)
                        .orderRequestId("12ade33a-21c0-473b-b055-b3c836e1c293")
                        .phoneNumberType(NumbersSubNumberOrder.PhoneNumberType.LOCAL)
                        .addPhoneNumber(
                            NumbersSubNumberOrder.PhoneNumber.builder()
                                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .bundleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .countryCode("country_code")
                                .phoneNumber("phone_number")
                                .phoneNumberType("phone_number_type")
                                .recordType("record_type")
                                .addRegulatoryRequirement(
                                    NumbersSubNumberOrder.PhoneNumber.RegulatoryRequirement
                                        .builder()
                                        .fieldType(
                                            NumbersSubNumberOrder.PhoneNumber.RegulatoryRequirement
                                                .FieldType
                                                .ADDRESS
                                        )
                                        .fieldValue("45f45a04-b4be-4592-95b1-9306b9db2b21")
                                        .recordType("phone_number_regulatory_requirement")
                                        .requirementId("8ffb3622-7c6b-4ccc-b65f-7a3dc0099576")
                                        .status(
                                            NumbersSubNumberOrder.PhoneNumber.RegulatoryRequirement
                                                .Status
                                                .APPROVED
                                        )
                                        .build()
                                )
                                .requirementsMet(true)
                                .requirementsStatus("requirements_status")
                                .status("status")
                                .build()
                        )
                        .phoneNumbersCount(1L)
                        .recordType("sub_number_order")
                        .addRegulatoryRequirement(
                            SubNumberOrderRegulatoryRequirement.builder()
                                .fieldType(SubNumberOrderRegulatoryRequirement.FieldType.ADDRESS)
                                .recordType("phone_number_regulatory_requirement")
                                .requirementId("8ffb3622-7c6b-4ccc-b65f-7a3dc0099576")
                                .build()
                        )
                        .requirementsMet(true)
                        .status(NumbersSubNumberOrder.Status.PENDING)
                        .updatedAt(OffsetDateTime.parse("2018-01-01T00:00:00.000000Z"))
                        .userId("d70873cd-7c98-401a-81b6-b1ae08246995")
                        .build()
                )
                .build()

        val roundtrippedSubNumberOrderCancelResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(subNumberOrderCancelResponse),
                jacksonTypeRef<SubNumberOrderCancelResponse>(),
            )

        assertThat(roundtrippedSubNumberOrderCancelResponse).isEqualTo(subNumberOrderCancelResponse)
    }
}
