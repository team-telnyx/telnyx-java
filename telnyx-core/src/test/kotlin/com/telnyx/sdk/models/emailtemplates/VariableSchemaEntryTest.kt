// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailtemplates

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VariableSchemaEntryTest {

    @Test
    fun create() {
        val variableSchemaEntry =
            VariableSchemaEntry.builder().required(true).default_("default").build()

        assertThat(variableSchemaEntry.required()).isEqualTo(true)
        assertThat(variableSchemaEntry.default_()).contains("default")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val variableSchemaEntry =
            VariableSchemaEntry.builder().required(true).default_("default").build()

        val roundtrippedVariableSchemaEntry =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(variableSchemaEntry),
                jacksonTypeRef<VariableSchemaEntry>(),
            )

        assertThat(roundtrippedVariableSchemaEntry).isEqualTo(variableSchemaEntry)
    }
}
