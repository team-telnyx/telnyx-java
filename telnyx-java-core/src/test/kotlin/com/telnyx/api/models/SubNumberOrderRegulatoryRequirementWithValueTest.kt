// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubNumberOrderRegulatoryRequirementWithValueTest {

    @Test
    fun create() {
        val subNumberOrderRegulatoryRequirementWithValue =
            SubNumberOrderRegulatoryRequirementWithValue.builder()
                .fieldType(SubNumberOrderRegulatoryRequirementWithValue.FieldType.ADDRESS)
                .fieldValue("45f45a04-b4be-4592-95b1-9306b9db2b21")
                .recordType("phone_number_regulatory_requirement")
                .requirementId("8ffb3622-7c6b-4ccc-b65f-7a3dc0099576")
                .build()

        assertThat(subNumberOrderRegulatoryRequirementWithValue.fieldType())
            .contains(SubNumberOrderRegulatoryRequirementWithValue.FieldType.ADDRESS)
        assertThat(subNumberOrderRegulatoryRequirementWithValue.fieldValue())
            .contains("45f45a04-b4be-4592-95b1-9306b9db2b21")
        assertThat(subNumberOrderRegulatoryRequirementWithValue.recordType())
            .contains("phone_number_regulatory_requirement")
        assertThat(subNumberOrderRegulatoryRequirementWithValue.requirementId())
            .contains("8ffb3622-7c6b-4ccc-b65f-7a3dc0099576")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val subNumberOrderRegulatoryRequirementWithValue =
            SubNumberOrderRegulatoryRequirementWithValue.builder()
                .fieldType(SubNumberOrderRegulatoryRequirementWithValue.FieldType.ADDRESS)
                .fieldValue("45f45a04-b4be-4592-95b1-9306b9db2b21")
                .recordType("phone_number_regulatory_requirement")
                .requirementId("8ffb3622-7c6b-4ccc-b65f-7a3dc0099576")
                .build()

        val roundtrippedSubNumberOrderRegulatoryRequirementWithValue =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(subNumberOrderRegulatoryRequirementWithValue),
                jacksonTypeRef<SubNumberOrderRegulatoryRequirementWithValue>(),
            )

        assertThat(roundtrippedSubNumberOrderRegulatoryRequirementWithValue)
            .isEqualTo(subNumberOrderRegulatoryRequirementWithValue)
    }
}
