// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.numberorderphonenumbers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NumberOrderPhoneNumberUpdateRequirementGroupResponseTest {

    @Test
    fun create() {
        val numberOrderPhoneNumberUpdateRequirementGroupResponse =
            NumberOrderPhoneNumberUpdateRequirementGroupResponse.builder()
                .data(
                    NumberOrderPhoneNumberUpdateRequirementGroupResponse.Data.builder()
                        .id("613d517a-0432-4bae-a785-c11033bd0985")
                        .bundleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .countryCode("AT")
                        .deadline(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .isBlockNumber(false)
                        .locality("AUSTRIA")
                        .orderRequestId("a11d58fe-88a4-494a-b752-8dea411993c6")
                        .phoneNumber("+43800300238")
                        .phoneNumberType("toll_free")
                        .recordType("number_order_phone_number")
                        .addRegulatoryRequirement(
                            NumberOrderPhoneNumberUpdateRequirementGroupResponse.Data
                                .RegulatoryRequirement
                                .builder()
                                .fieldType("textual")
                                .fieldValue("1234567890")
                                .requirementId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .status("pending-approval")
                                .build()
                        )
                        .requirementsMet(false)
                        .requirementsStatus("requirement-info-under-review")
                        .status("pending")
                        .subNumberOrderId("f826ed66-b27c-4340-9dc0-57dc3459f1bd")
                        .build()
                )
                .build()

        assertThat(numberOrderPhoneNumberUpdateRequirementGroupResponse.data())
            .contains(
                NumberOrderPhoneNumberUpdateRequirementGroupResponse.Data.builder()
                    .id("613d517a-0432-4bae-a785-c11033bd0985")
                    .bundleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .countryCode("AT")
                    .deadline(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .isBlockNumber(false)
                    .locality("AUSTRIA")
                    .orderRequestId("a11d58fe-88a4-494a-b752-8dea411993c6")
                    .phoneNumber("+43800300238")
                    .phoneNumberType("toll_free")
                    .recordType("number_order_phone_number")
                    .addRegulatoryRequirement(
                        NumberOrderPhoneNumberUpdateRequirementGroupResponse.Data
                            .RegulatoryRequirement
                            .builder()
                            .fieldType("textual")
                            .fieldValue("1234567890")
                            .requirementId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .status("pending-approval")
                            .build()
                    )
                    .requirementsMet(false)
                    .requirementsStatus("requirement-info-under-review")
                    .status("pending")
                    .subNumberOrderId("f826ed66-b27c-4340-9dc0-57dc3459f1bd")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val numberOrderPhoneNumberUpdateRequirementGroupResponse =
            NumberOrderPhoneNumberUpdateRequirementGroupResponse.builder()
                .data(
                    NumberOrderPhoneNumberUpdateRequirementGroupResponse.Data.builder()
                        .id("613d517a-0432-4bae-a785-c11033bd0985")
                        .bundleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .countryCode("AT")
                        .deadline(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .isBlockNumber(false)
                        .locality("AUSTRIA")
                        .orderRequestId("a11d58fe-88a4-494a-b752-8dea411993c6")
                        .phoneNumber("+43800300238")
                        .phoneNumberType("toll_free")
                        .recordType("number_order_phone_number")
                        .addRegulatoryRequirement(
                            NumberOrderPhoneNumberUpdateRequirementGroupResponse.Data
                                .RegulatoryRequirement
                                .builder()
                                .fieldType("textual")
                                .fieldValue("1234567890")
                                .requirementId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .status("pending-approval")
                                .build()
                        )
                        .requirementsMet(false)
                        .requirementsStatus("requirement-info-under-review")
                        .status("pending")
                        .subNumberOrderId("f826ed66-b27c-4340-9dc0-57dc3459f1bd")
                        .build()
                )
                .build()

        val roundtrippedNumberOrderPhoneNumberUpdateRequirementGroupResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(numberOrderPhoneNumberUpdateRequirementGroupResponse),
                jacksonTypeRef<NumberOrderPhoneNumberUpdateRequirementGroupResponse>(),
            )

        assertThat(roundtrippedNumberOrderPhoneNumberUpdateRequirementGroupResponse)
            .isEqualTo(numberOrderPhoneNumberUpdateRequirementGroupResponse)
    }
}
