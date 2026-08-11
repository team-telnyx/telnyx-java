// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.tools

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UpdateDynamicVariablesToolParamsTest {

    @Test
    fun create() {
        val updateDynamicVariablesToolParams =
            UpdateDynamicVariablesToolParams.builder()
                .description("Collect caller details into conversation variables.")
                .name("collect_details")
                .addUpdatableVariable(
                    UpdateDynamicVariablesToolParams.UpdatableVariable.builder()
                        .name("customer_name")
                        .description("The caller's full name.")
                        .type("string")
                        .build()
                )
                .build()

        assertThat(updateDynamicVariablesToolParams.description())
            .isEqualTo("Collect caller details into conversation variables.")
        assertThat(updateDynamicVariablesToolParams.name()).isEqualTo("collect_details")
        assertThat(updateDynamicVariablesToolParams.updatableVariables())
            .containsExactly(
                UpdateDynamicVariablesToolParams.UpdatableVariable.builder()
                    .name("customer_name")
                    .description("The caller's full name.")
                    .type("string")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val updateDynamicVariablesToolParams =
            UpdateDynamicVariablesToolParams.builder()
                .description("Collect caller details into conversation variables.")
                .name("collect_details")
                .addUpdatableVariable(
                    UpdateDynamicVariablesToolParams.UpdatableVariable.builder()
                        .name("customer_name")
                        .description("The caller's full name.")
                        .type("string")
                        .build()
                )
                .build()

        val roundtrippedUpdateDynamicVariablesToolParams =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(updateDynamicVariablesToolParams),
                jacksonTypeRef<UpdateDynamicVariablesToolParams>(),
            )

        assertThat(roundtrippedUpdateDynamicVariablesToolParams)
            .isEqualTo(updateDynamicVariablesToolParams)
    }
}
