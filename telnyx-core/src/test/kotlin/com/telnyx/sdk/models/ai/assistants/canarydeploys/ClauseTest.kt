// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants.canarydeploys

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ClauseTest {

    @Test
    fun create() {
        val clause =
            Clause.builder()
                .attribute("attribute")
                .operator(Clause.Operator.IN)
                .addValue("string")
                .build()

        assertThat(clause.attribute()).isEqualTo("attribute")
        assertThat(clause.operator()).isEqualTo(Clause.Operator.IN)
        assertThat(clause.values()).containsExactly("string")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val clause =
            Clause.builder()
                .attribute("attribute")
                .operator(Clause.Operator.IN)
                .addValue("string")
                .build()

        val roundtrippedClause =
            jsonMapper.readValue(jsonMapper.writeValueAsString(clause), jacksonTypeRef<Clause>())

        assertThat(roundtrippedClause).isEqualTo(clause)
    }
}
