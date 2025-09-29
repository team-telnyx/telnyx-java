// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.requirementgroups

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RequirementGroupCreateParamsTest {

    @Test
    fun create() {
        RequirementGroupCreateParams.builder()
            .action(RequirementGroupCreateParams.Action.ORDERING)
            .countryCode("US")
            .phoneNumberType(RequirementGroupCreateParams.PhoneNumberType.LOCAL)
            .customerReference("My Requirement Group")
            .addRegulatoryRequirement(
                RequirementGroupCreateParams.RegulatoryRequirement.builder()
                    .fieldValue("field_value")
                    .requirementId("requirement_id")
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            RequirementGroupCreateParams.builder()
                .action(RequirementGroupCreateParams.Action.ORDERING)
                .countryCode("US")
                .phoneNumberType(RequirementGroupCreateParams.PhoneNumberType.LOCAL)
                .customerReference("My Requirement Group")
                .addRegulatoryRequirement(
                    RequirementGroupCreateParams.RegulatoryRequirement.builder()
                        .fieldValue("field_value")
                        .requirementId("requirement_id")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.action()).isEqualTo(RequirementGroupCreateParams.Action.ORDERING)
        assertThat(body.countryCode()).isEqualTo("US")
        assertThat(body.phoneNumberType())
            .isEqualTo(RequirementGroupCreateParams.PhoneNumberType.LOCAL)
        assertThat(body.customerReference()).contains("My Requirement Group")
        assertThat(body.regulatoryRequirements().getOrNull())
            .containsExactly(
                RequirementGroupCreateParams.RegulatoryRequirement.builder()
                    .fieldValue("field_value")
                    .requirementId("requirement_id")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            RequirementGroupCreateParams.builder()
                .action(RequirementGroupCreateParams.Action.ORDERING)
                .countryCode("US")
                .phoneNumberType(RequirementGroupCreateParams.PhoneNumberType.LOCAL)
                .build()

        val body = params._body()

        assertThat(body.action()).isEqualTo(RequirementGroupCreateParams.Action.ORDERING)
        assertThat(body.countryCode()).isEqualTo("US")
        assertThat(body.phoneNumberType())
            .isEqualTo(RequirementGroupCreateParams.PhoneNumberType.LOCAL)
    }
}
