// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.subnumberorders

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubNumberOrderUpdateRequirementGroupResponseTest {

    @Test
    fun create() {
        val subNumberOrderUpdateRequirementGroupResponse =
            SubNumberOrderUpdateRequirementGroupResponse.builder()
                .data(
                    SubNumberOrderUpdateRequirementGroupResponse.Data.builder()
                        .id("f826ed66-b27c-4340-9dc0-57dc3459f1bd")
                        .countryCode("AT")
                        .createdAt(OffsetDateTime.parse("2018-01-01T00:00:00.000000Z"))
                        .customerReference("missing")
                        .isBlockSubNumberOrder(false)
                        .orderRequestId("a11d58fe-88a4-494a-b752-8dea411993c6")
                        .phoneNumberType("toll_free")
                        .addPhoneNumber(
                            SubNumberOrderUpdateRequirementGroupResponse.Data.PhoneNumber.builder()
                                .id("613d517a-0432-4bae-a785-c11033bd0985")
                                .bundleId(null)
                                .countryCode("AT")
                                .phoneNumber("+43800300238")
                                .phoneNumberType("toll_free")
                                .recordType("number_order_phone_number")
                                .addRegulatoryRequirement(
                                    SubNumberOrderUpdateRequirementGroupResponse.Data.PhoneNumber
                                        .RegulatoryRequirement
                                        .builder()
                                        .fieldType("textual")
                                        .fieldValue("4804570924")
                                        .requirementId("2708e569-696a-4fc7-9305-5fdb3eb9c7dd")
                                        .status("pending-approval")
                                        .build()
                                )
                                .requirementsMet(false)
                                .requirementsStatus("requirement-info-under-review")
                                .status("pending")
                                .build()
                        )
                        .phoneNumbersCount(1L)
                        .recordType("sub_number_order")
                        .addRegulatoryRequirement(
                            SubNumberOrderUpdateRequirementGroupResponse.Data.RegulatoryRequirement
                                .builder()
                                .fieldType("textual")
                                .recordType("phone_number_regulatory_requirement")
                                .requirementId("2708e569-696a-4fc7-9305-5fdb3eb9c7dd")
                                .build()
                        )
                        .requirementsMet(false)
                        .status("pending")
                        .updatedAt(OffsetDateTime.parse("2018-01-01T00:00:00.000000Z"))
                        .build()
                )
                .build()

        assertThat(subNumberOrderUpdateRequirementGroupResponse.data())
            .contains(
                SubNumberOrderUpdateRequirementGroupResponse.Data.builder()
                    .id("f826ed66-b27c-4340-9dc0-57dc3459f1bd")
                    .countryCode("AT")
                    .createdAt(OffsetDateTime.parse("2018-01-01T00:00:00.000000Z"))
                    .customerReference("missing")
                    .isBlockSubNumberOrder(false)
                    .orderRequestId("a11d58fe-88a4-494a-b752-8dea411993c6")
                    .phoneNumberType("toll_free")
                    .addPhoneNumber(
                        SubNumberOrderUpdateRequirementGroupResponse.Data.PhoneNumber.builder()
                            .id("613d517a-0432-4bae-a785-c11033bd0985")
                            .bundleId(null)
                            .countryCode("AT")
                            .phoneNumber("+43800300238")
                            .phoneNumberType("toll_free")
                            .recordType("number_order_phone_number")
                            .addRegulatoryRequirement(
                                SubNumberOrderUpdateRequirementGroupResponse.Data.PhoneNumber
                                    .RegulatoryRequirement
                                    .builder()
                                    .fieldType("textual")
                                    .fieldValue("4804570924")
                                    .requirementId("2708e569-696a-4fc7-9305-5fdb3eb9c7dd")
                                    .status("pending-approval")
                                    .build()
                            )
                            .requirementsMet(false)
                            .requirementsStatus("requirement-info-under-review")
                            .status("pending")
                            .build()
                    )
                    .phoneNumbersCount(1L)
                    .recordType("sub_number_order")
                    .addRegulatoryRequirement(
                        SubNumberOrderUpdateRequirementGroupResponse.Data.RegulatoryRequirement
                            .builder()
                            .fieldType("textual")
                            .recordType("phone_number_regulatory_requirement")
                            .requirementId("2708e569-696a-4fc7-9305-5fdb3eb9c7dd")
                            .build()
                    )
                    .requirementsMet(false)
                    .status("pending")
                    .updatedAt(OffsetDateTime.parse("2018-01-01T00:00:00.000000Z"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val subNumberOrderUpdateRequirementGroupResponse =
            SubNumberOrderUpdateRequirementGroupResponse.builder()
                .data(
                    SubNumberOrderUpdateRequirementGroupResponse.Data.builder()
                        .id("f826ed66-b27c-4340-9dc0-57dc3459f1bd")
                        .countryCode("AT")
                        .createdAt(OffsetDateTime.parse("2018-01-01T00:00:00.000000Z"))
                        .customerReference("missing")
                        .isBlockSubNumberOrder(false)
                        .orderRequestId("a11d58fe-88a4-494a-b752-8dea411993c6")
                        .phoneNumberType("toll_free")
                        .addPhoneNumber(
                            SubNumberOrderUpdateRequirementGroupResponse.Data.PhoneNumber.builder()
                                .id("613d517a-0432-4bae-a785-c11033bd0985")
                                .bundleId(null)
                                .countryCode("AT")
                                .phoneNumber("+43800300238")
                                .phoneNumberType("toll_free")
                                .recordType("number_order_phone_number")
                                .addRegulatoryRequirement(
                                    SubNumberOrderUpdateRequirementGroupResponse.Data.PhoneNumber
                                        .RegulatoryRequirement
                                        .builder()
                                        .fieldType("textual")
                                        .fieldValue("4804570924")
                                        .requirementId("2708e569-696a-4fc7-9305-5fdb3eb9c7dd")
                                        .status("pending-approval")
                                        .build()
                                )
                                .requirementsMet(false)
                                .requirementsStatus("requirement-info-under-review")
                                .status("pending")
                                .build()
                        )
                        .phoneNumbersCount(1L)
                        .recordType("sub_number_order")
                        .addRegulatoryRequirement(
                            SubNumberOrderUpdateRequirementGroupResponse.Data.RegulatoryRequirement
                                .builder()
                                .fieldType("textual")
                                .recordType("phone_number_regulatory_requirement")
                                .requirementId("2708e569-696a-4fc7-9305-5fdb3eb9c7dd")
                                .build()
                        )
                        .requirementsMet(false)
                        .status("pending")
                        .updatedAt(OffsetDateTime.parse("2018-01-01T00:00:00.000000Z"))
                        .build()
                )
                .build()

        val roundtrippedSubNumberOrderUpdateRequirementGroupResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(subNumberOrderUpdateRequirementGroupResponse),
                jacksonTypeRef<SubNumberOrderUpdateRequirementGroupResponse>(),
            )

        assertThat(roundtrippedSubNumberOrderUpdateRequirementGroupResponse)
            .isEqualTo(subNumberOrderUpdateRequirementGroupResponse)
    }
}
