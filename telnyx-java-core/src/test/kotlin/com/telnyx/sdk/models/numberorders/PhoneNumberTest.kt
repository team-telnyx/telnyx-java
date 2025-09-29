// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.numberorders

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.SubNumberOrderRegulatoryRequirementWithValue
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PhoneNumberTest {

    @Test
    fun create() {
        val phoneNumber =
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
                        .fieldType(SubNumberOrderRegulatoryRequirementWithValue.FieldType.ADDRESS)
                        .fieldValue("45f45a04-b4be-4592-95b1-9306b9db2b21")
                        .recordType("phone_number_regulatory_requirement")
                        .requirementId("8ffb3622-7c6b-4ccc-b65f-7a3dc0099576")
                        .build()
                )
                .requirementsMet(true)
                .requirementsStatus(PhoneNumber.RequirementsStatus.PENDING)
                .status(PhoneNumber.Status.SUCCESS)
                .build()

        assertThat(phoneNumber.id()).contains("dc8e4d67-33a0-4cbb-af74-7b58f05bd494")
        assertThat(phoneNumber.bundleId()).contains("bc8e4d67-33a0-4cbb-af74-7b58f05bd474")
        assertThat(phoneNumber.countryCode()).contains("US")
        assertThat(phoneNumber.countryIsoAlpha2()).contains("US")
        assertThat(phoneNumber.phoneNumber()).contains("+19705555098")
        assertThat(phoneNumber.phoneNumberType()).contains(PhoneNumber.PhoneNumberType.LOCAL)
        assertThat(phoneNumber.recordType()).contains("number_order_phone_number")
        assertThat(phoneNumber.regulatoryRequirements().getOrNull())
            .containsExactly(
                SubNumberOrderRegulatoryRequirementWithValue.builder()
                    .fieldType(SubNumberOrderRegulatoryRequirementWithValue.FieldType.ADDRESS)
                    .fieldValue("45f45a04-b4be-4592-95b1-9306b9db2b21")
                    .recordType("phone_number_regulatory_requirement")
                    .requirementId("8ffb3622-7c6b-4ccc-b65f-7a3dc0099576")
                    .build()
            )
        assertThat(phoneNumber.requirementsMet()).contains(true)
        assertThat(phoneNumber.requirementsStatus())
            .contains(PhoneNumber.RequirementsStatus.PENDING)
        assertThat(phoneNumber.status()).contains(PhoneNumber.Status.SUCCESS)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val phoneNumber =
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
                        .fieldType(SubNumberOrderRegulatoryRequirementWithValue.FieldType.ADDRESS)
                        .fieldValue("45f45a04-b4be-4592-95b1-9306b9db2b21")
                        .recordType("phone_number_regulatory_requirement")
                        .requirementId("8ffb3622-7c6b-4ccc-b65f-7a3dc0099576")
                        .build()
                )
                .requirementsMet(true)
                .requirementsStatus(PhoneNumber.RequirementsStatus.PENDING)
                .status(PhoneNumber.Status.SUCCESS)
                .build()

        val roundtrippedPhoneNumber =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(phoneNumber),
                jacksonTypeRef<PhoneNumber>(),
            )

        assertThat(roundtrippedPhoneNumber).isEqualTo(phoneNumber)
    }
}
