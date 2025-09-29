// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.portingorders

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PortingOrderRequirementTest {

    @Test
    fun create() {
        val portingOrderRequirement =
            PortingOrderRequirement.builder()
                .fieldType(PortingOrderRequirement.FieldType.DOCUMENT)
                .fieldValue("9787fb5f-cbe5-4de4-b765-3303774ee9fe")
                .recordType("porting_requirement")
                .requirementTypeId("59b0762a-b274-4f76-ac32-4d5cf0272e66")
                .build()

        assertThat(portingOrderRequirement.fieldType())
            .contains(PortingOrderRequirement.FieldType.DOCUMENT)
        assertThat(portingOrderRequirement.fieldValue())
            .contains("9787fb5f-cbe5-4de4-b765-3303774ee9fe")
        assertThat(portingOrderRequirement.recordType()).contains("porting_requirement")
        assertThat(portingOrderRequirement.requirementTypeId())
            .contains("59b0762a-b274-4f76-ac32-4d5cf0272e66")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val portingOrderRequirement =
            PortingOrderRequirement.builder()
                .fieldType(PortingOrderRequirement.FieldType.DOCUMENT)
                .fieldValue("9787fb5f-cbe5-4de4-b765-3303774ee9fe")
                .recordType("porting_requirement")
                .requirementTypeId("59b0762a-b274-4f76-ac32-4d5cf0272e66")
                .build()

        val roundtrippedPortingOrderRequirement =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(portingOrderRequirement),
                jacksonTypeRef<PortingOrderRequirement>(),
            )

        assertThat(roundtrippedPortingOrderRequirement).isEqualTo(portingOrderRequirement)
    }
}
