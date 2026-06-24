// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class ExpressionTest {

    @Test
    fun ofComparison() {
        val comparison =
            ComparisonExpression.builder()
                .left(JsonValue.from(mapOf("name" to "user_age", "type" to "variable")))
                .op(ComparisonExpression.Op.GTE)
                .right(JsonValue.from(mapOf("type" to "number_literal", "value" to 18)))
                .build()

        val expression = Expression.ofComparison(comparison)

        assertThat(expression.comparison()).contains(comparison)
        assertThat(expression.boolOp()).isEmpty
        assertThat(expression.arithmetic()).isEmpty
        assertThat(expression.variable()).isEmpty
        assertThat(expression.stringLiteral()).isEmpty
        assertThat(expression.numberLiteral()).isEmpty
        assertThat(expression.boolLiteral()).isEmpty
    }

    @Test
    fun ofComparisonRoundtrip() {
        val jsonMapper = jsonMapper()
        val expression =
            Expression.ofComparison(
                ComparisonExpression.builder()
                    .left(JsonValue.from(mapOf("name" to "user_age", "type" to "variable")))
                    .op(ComparisonExpression.Op.GTE)
                    .right(JsonValue.from(mapOf("type" to "number_literal", "value" to 18)))
                    .build()
            )

        val roundtrippedExpression =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(expression),
                jacksonTypeRef<Expression>(),
            )

        assertThat(roundtrippedExpression).isEqualTo(expression)
    }

    @Test
    fun ofBoolOp() {
        val boolOp =
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

        val expression = Expression.ofBoolOp(boolOp)

        assertThat(expression.comparison()).isEmpty
        assertThat(expression.boolOp()).contains(boolOp)
        assertThat(expression.arithmetic()).isEmpty
        assertThat(expression.variable()).isEmpty
        assertThat(expression.stringLiteral()).isEmpty
        assertThat(expression.numberLiteral()).isEmpty
        assertThat(expression.boolLiteral()).isEmpty
    }

    @Test
    fun ofBoolOpRoundtrip() {
        val jsonMapper = jsonMapper()
        val expression =
            Expression.ofBoolOp(
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
            )

        val roundtrippedExpression =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(expression),
                jacksonTypeRef<Expression>(),
            )

        assertThat(roundtrippedExpression).isEqualTo(expression)
    }

    @Test
    fun ofArithmetic() {
        val arithmetic =
            ArithmeticExpression.builder()
                .left(JsonValue.from(mapOf("name" to "cart_total", "type" to "variable")))
                .op(ArithmeticExpression.Op.PLUS)
                .right(JsonValue.from(mapOf("name" to "shipping_cost", "type" to "variable")))
                .build()

        val expression = Expression.ofArithmetic(arithmetic)

        assertThat(expression.comparison()).isEmpty
        assertThat(expression.boolOp()).isEmpty
        assertThat(expression.arithmetic()).contains(arithmetic)
        assertThat(expression.variable()).isEmpty
        assertThat(expression.stringLiteral()).isEmpty
        assertThat(expression.numberLiteral()).isEmpty
        assertThat(expression.boolLiteral()).isEmpty
    }

    @Test
    fun ofArithmeticRoundtrip() {
        val jsonMapper = jsonMapper()
        val expression =
            Expression.ofArithmetic(
                ArithmeticExpression.builder()
                    .left(JsonValue.from(mapOf("name" to "cart_total", "type" to "variable")))
                    .op(ArithmeticExpression.Op.PLUS)
                    .right(JsonValue.from(mapOf("name" to "shipping_cost", "type" to "variable")))
                    .build()
            )

        val roundtrippedExpression =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(expression),
                jacksonTypeRef<Expression>(),
            )

        assertThat(roundtrippedExpression).isEqualTo(expression)
    }

    @Test
    fun ofVariable() {
        val variable = Expression.Variable.builder().name("user_age").build()

        val expression = Expression.ofVariable(variable)

        assertThat(expression.comparison()).isEmpty
        assertThat(expression.boolOp()).isEmpty
        assertThat(expression.arithmetic()).isEmpty
        assertThat(expression.variable()).contains(variable)
        assertThat(expression.stringLiteral()).isEmpty
        assertThat(expression.numberLiteral()).isEmpty
        assertThat(expression.boolLiteral()).isEmpty
    }

    @Test
    fun ofVariableRoundtrip() {
        val jsonMapper = jsonMapper()
        val expression =
            Expression.ofVariable(Expression.Variable.builder().name("user_age").build())

        val roundtrippedExpression =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(expression),
                jacksonTypeRef<Expression>(),
            )

        assertThat(roundtrippedExpression).isEqualTo(expression)
    }

    @Test
    fun ofStringLiteral() {
        val stringLiteral = Expression.StringLiteral.builder().value("gold").build()

        val expression = Expression.ofStringLiteral(stringLiteral)

        assertThat(expression.comparison()).isEmpty
        assertThat(expression.boolOp()).isEmpty
        assertThat(expression.arithmetic()).isEmpty
        assertThat(expression.variable()).isEmpty
        assertThat(expression.stringLiteral()).contains(stringLiteral)
        assertThat(expression.numberLiteral()).isEmpty
        assertThat(expression.boolLiteral()).isEmpty
    }

    @Test
    fun ofStringLiteralRoundtrip() {
        val jsonMapper = jsonMapper()
        val expression =
            Expression.ofStringLiteral(Expression.StringLiteral.builder().value("gold").build())

        val roundtrippedExpression =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(expression),
                jacksonTypeRef<Expression>(),
            )

        assertThat(roundtrippedExpression).isEqualTo(expression)
    }

    @Test
    fun ofNumberLiteral() {
        val numberLiteral = Expression.NumberLiteral.builder().value(18.0).build()

        val expression = Expression.ofNumberLiteral(numberLiteral)

        assertThat(expression.comparison()).isEmpty
        assertThat(expression.boolOp()).isEmpty
        assertThat(expression.arithmetic()).isEmpty
        assertThat(expression.variable()).isEmpty
        assertThat(expression.stringLiteral()).isEmpty
        assertThat(expression.numberLiteral()).contains(numberLiteral)
        assertThat(expression.boolLiteral()).isEmpty
    }

    @Test
    fun ofNumberLiteralRoundtrip() {
        val jsonMapper = jsonMapper()
        val expression =
            Expression.ofNumberLiteral(Expression.NumberLiteral.builder().value(18.0).build())

        val roundtrippedExpression =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(expression),
                jacksonTypeRef<Expression>(),
            )

        assertThat(roundtrippedExpression).isEqualTo(expression)
    }

    @Test
    fun ofBoolLiteral() {
        val boolLiteral = Expression.BoolLiteral.builder().value(true).build()

        val expression = Expression.ofBoolLiteral(boolLiteral)

        assertThat(expression.comparison()).isEmpty
        assertThat(expression.boolOp()).isEmpty
        assertThat(expression.arithmetic()).isEmpty
        assertThat(expression.variable()).isEmpty
        assertThat(expression.stringLiteral()).isEmpty
        assertThat(expression.numberLiteral()).isEmpty
        assertThat(expression.boolLiteral()).contains(boolLiteral)
    }

    @Test
    fun ofBoolLiteralRoundtrip() {
        val jsonMapper = jsonMapper()
        val expression =
            Expression.ofBoolLiteral(Expression.BoolLiteral.builder().value(true).build())

        val roundtrippedExpression =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(expression),
                jacksonTypeRef<Expression>(),
            )

        assertThat(roundtrippedExpression).isEqualTo(expression)
    }

    enum class IncompatibleJsonShapeTestCase(val value: JsonValue) {
        BOOLEAN(JsonValue.from(false)),
        STRING(JsonValue.from("invalid")),
        INTEGER(JsonValue.from(-1)),
        FLOAT(JsonValue.from(3.14)),
        ARRAY(JsonValue.from(listOf("invalid", "array"))),
    }

    @ParameterizedTest
    @EnumSource
    fun incompatibleJsonShapeDeserializesToUnknown(testCase: IncompatibleJsonShapeTestCase) {
        val expression = jsonMapper().convertValue(testCase.value, jacksonTypeRef<Expression>())

        val e = assertThrows<TelnyxInvalidDataException> { expression.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
