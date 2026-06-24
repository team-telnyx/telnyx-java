// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ComparisonExpressionTest {

    @Test
    fun create() {
        val comparisonExpression =
            ComparisonExpression.builder()
                .left(JsonValue.from(mapOf("name" to "user_age", "type" to "variable")))
                .op(ComparisonExpression.Op.GTE)
                .right(JsonValue.from(mapOf("type" to "number_literal", "value" to 18)))
                .build()

        assertThat(comparisonExpression._left())
            .isEqualTo(JsonValue.from(mapOf("name" to "user_age", "type" to "variable")))
        assertThat(comparisonExpression.op()).isEqualTo(ComparisonExpression.Op.GTE)
        assertThat(comparisonExpression._right())
            .isEqualTo(JsonValue.from(mapOf("type" to "number_literal", "value" to 18)))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val comparisonExpression =
            ComparisonExpression.builder()
                .left(JsonValue.from(mapOf("name" to "user_age", "type" to "variable")))
                .op(ComparisonExpression.Op.GTE)
                .right(JsonValue.from(mapOf("type" to "number_literal", "value" to 18)))
                .build()

        val roundtrippedComparisonExpression =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(comparisonExpression),
                jacksonTypeRef<ComparisonExpression>(),
            )

        assertThat(roundtrippedComparisonExpression).isEqualTo(comparisonExpression)
    }
}
