// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.requirementgroups

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RequirementGroupTest {

    @Test
    fun create() {
        val requirementGroup =
            RequirementGroup.builder()
                .id("id")
                .action("action")
                .countryCode("country_code")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .customerReference("customer_reference")
                .phoneNumberType("phone_number_type")
                .recordType("requirement_group")
                .addRegulatoryRequirement(
                    RequirementGroup.RegulatoryRequirement.builder()
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .fieldType("field_type")
                        .fieldValue("field_value")
                        .requirementId("requirement_id")
                        .status(RequirementGroup.RegulatoryRequirement.Status.APPROVED)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .status(RequirementGroup.Status.APPROVED)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(requirementGroup.id()).contains("id")
        assertThat(requirementGroup.action()).contains("action")
        assertThat(requirementGroup.countryCode()).contains("country_code")
        assertThat(requirementGroup.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(requirementGroup.customerReference()).contains("customer_reference")
        assertThat(requirementGroup.phoneNumberType()).contains("phone_number_type")
        assertThat(requirementGroup.recordType()).contains("requirement_group")
        assertThat(requirementGroup.regulatoryRequirements().getOrNull())
            .containsExactly(
                RequirementGroup.RegulatoryRequirement.builder()
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .fieldType("field_type")
                    .fieldValue("field_value")
                    .requirementId("requirement_id")
                    .status(RequirementGroup.RegulatoryRequirement.Status.APPROVED)
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(requirementGroup.status()).contains(RequirementGroup.Status.APPROVED)
        assertThat(requirementGroup.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val requirementGroup =
            RequirementGroup.builder()
                .id("id")
                .action("action")
                .countryCode("country_code")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .customerReference("customer_reference")
                .phoneNumberType("phone_number_type")
                .recordType("requirement_group")
                .addRegulatoryRequirement(
                    RequirementGroup.RegulatoryRequirement.builder()
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .fieldType("field_type")
                        .fieldValue("field_value")
                        .requirementId("requirement_id")
                        .status(RequirementGroup.RegulatoryRequirement.Status.APPROVED)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .status(RequirementGroup.Status.APPROVED)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedRequirementGroup =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(requirementGroup),
                jacksonTypeRef<RequirementGroup>(),
            )

        assertThat(roundtrippedRequirementGroup).isEqualTo(requirementGroup)
    }
}
