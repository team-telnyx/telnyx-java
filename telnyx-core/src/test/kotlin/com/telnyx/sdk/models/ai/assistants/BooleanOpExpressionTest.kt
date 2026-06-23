// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BooleanOpExpressionTest {

    @Test
    fun create() {
        val booleanOpExpression =
            BooleanOpExpression.builder()
                .op(BooleanOpExpression.Op.AND)
                .addVariableOperand("is_premium")
                .addOperand(
                    ComparisonExpression.builder()
                        .left(JsonValue.from(mapOf("name" to "user_age", "type" to "variable")))
                        .op(ComparisonExpression.Op.GTE)
                        .right(JsonValue.from(mapOf("type" to "number_literal", "value" to 18)))
                        .build()
                )
                .build()

        assertThat(booleanOpExpression.op()).isEqualTo(BooleanOpExpression.Op.AND)
        assertThat(booleanOpExpression.operands())
            .containsExactly(
                Expression.ofVariable(Expression.Variable.builder().name("is_premium").build()),
                Expression.ofComparison(
                    ComparisonExpression.builder()
                        .left(JsonValue.from(mapOf("name" to "user_age", "type" to "variable")))
                        .op(ComparisonExpression.Op.GTE)
                        .right(JsonValue.from(mapOf("type" to "number_literal", "value" to 18)))
                        .build()
                ),
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val booleanOpExpression =
            BooleanOpExpression.builder()
                .op(BooleanOpExpression.Op.AND)
                .addVariableOperand("is_premium")
                .addOperand(
                    ComparisonExpression.builder()
                        .left(JsonValue.from(mapOf("name" to "user_age", "type" to "variable")))
                        .op(ComparisonExpression.Op.GTE)
                        .right(JsonValue.from(mapOf("type" to "number_literal", "value" to 18)))
                        .build()
                )
                .build()

        val roundtrippedBooleanOpExpression =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(booleanOpExpression),
                jacksonTypeRef<BooleanOpExpression>(),
            )

        assertThat(roundtrippedBooleanOpExpression).isEqualTo(booleanOpExpression)
    }
}
