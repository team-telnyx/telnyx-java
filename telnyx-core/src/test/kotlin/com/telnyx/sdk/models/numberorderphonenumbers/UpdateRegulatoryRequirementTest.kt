// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.numberorderphonenumbers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UpdateRegulatoryRequirementTest {

    @Test
    fun create() {
        val updateRegulatoryRequirement =
            UpdateRegulatoryRequirement.builder()
                .fieldValue("45f45a04-b4be-4592-95b1-9306b9db2b21")
                .requirementId("8ffb3622-7c6b-4ccc-b65f-7a3dc0099576")
                .build()

        assertThat(updateRegulatoryRequirement.fieldValue())
            .contains("45f45a04-b4be-4592-95b1-9306b9db2b21")
        assertThat(updateRegulatoryRequirement.requirementId())
            .contains("8ffb3622-7c6b-4ccc-b65f-7a3dc0099576")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val updateRegulatoryRequirement =
            UpdateRegulatoryRequirement.builder()
                .fieldValue("45f45a04-b4be-4592-95b1-9306b9db2b21")
                .requirementId("8ffb3622-7c6b-4ccc-b65f-7a3dc0099576")
                .build()

        val roundtrippedUpdateRegulatoryRequirement =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(updateRegulatoryRequirement),
                jacksonTypeRef<UpdateRegulatoryRequirement>(),
            )

        assertThat(roundtrippedUpdateRegulatoryRequirement).isEqualTo(updateRegulatoryRequirement)
    }
}
