// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.requirementgroups

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RequirementGroupUpdateParamsTest {

    @Test
    fun create() {
        RequirementGroupUpdateParams.builder()
            .id("id")
            .customerReference("0002")
            .addRegulatoryRequirement(
                RequirementGroupUpdateParams.RegulatoryRequirement.builder()
                    .fieldValue("new requirement value")
                    .requirementId("53970723-fbff-4f46-a975-f62be6c1a585")
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params = RequirementGroupUpdateParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            RequirementGroupUpdateParams.builder()
                .id("id")
                .customerReference("0002")
                .addRegulatoryRequirement(
                    RequirementGroupUpdateParams.RegulatoryRequirement.builder()
                        .fieldValue("new requirement value")
                        .requirementId("53970723-fbff-4f46-a975-f62be6c1a585")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.customerReference()).contains("0002")
        assertThat(body.regulatoryRequirements().getOrNull())
            .containsExactly(
                RequirementGroupUpdateParams.RegulatoryRequirement.builder()
                    .fieldValue("new requirement value")
                    .requirementId("53970723-fbff-4f46-a975-f62be6c1a585")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = RequirementGroupUpdateParams.builder().id("id").build()

        val body = params._body()
    }
}
