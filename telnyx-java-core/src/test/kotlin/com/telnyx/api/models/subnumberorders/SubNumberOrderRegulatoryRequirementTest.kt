// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.subnumberorders

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubNumberOrderRegulatoryRequirementTest {

    @Test
    fun create() {
        val subNumberOrderRegulatoryRequirement =
            SubNumberOrderRegulatoryRequirement.builder()
                .fieldType(SubNumberOrderRegulatoryRequirement.FieldType.ADDRESS)
                .recordType("phone_number_regulatory_requirement")
                .requirementId("8ffb3622-7c6b-4ccc-b65f-7a3dc0099576")
                .build()

        assertThat(subNumberOrderRegulatoryRequirement.fieldType())
            .contains(SubNumberOrderRegulatoryRequirement.FieldType.ADDRESS)
        assertThat(subNumberOrderRegulatoryRequirement.recordType())
            .contains("phone_number_regulatory_requirement")
        assertThat(subNumberOrderRegulatoryRequirement.requirementId())
            .contains("8ffb3622-7c6b-4ccc-b65f-7a3dc0099576")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val subNumberOrderRegulatoryRequirement =
            SubNumberOrderRegulatoryRequirement.builder()
                .fieldType(SubNumberOrderRegulatoryRequirement.FieldType.ADDRESS)
                .recordType("phone_number_regulatory_requirement")
                .requirementId("8ffb3622-7c6b-4ccc-b65f-7a3dc0099576")
                .build()

        val roundtrippedSubNumberOrderRegulatoryRequirement =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(subNumberOrderRegulatoryRequirement),
                jacksonTypeRef<SubNumberOrderRegulatoryRequirement>(),
            )

        assertThat(roundtrippedSubNumberOrderRegulatoryRequirement)
            .isEqualTo(subNumberOrderRegulatoryRequirement)
    }
}
