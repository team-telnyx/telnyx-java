// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ArithmeticExpressionTest {

    @Test
    fun create() {
        val arithmeticExpression =
            ArithmeticExpression.builder()
                .left(JsonValue.from(mapOf("name" to "cart_total", "type" to "variable")))
                .op(ArithmeticExpression.Op.PLUS)
                .right(JsonValue.from(mapOf("name" to "shipping_cost", "type" to "variable")))
                .build()

        assertThat(arithmeticExpression._left())
            .isEqualTo(JsonValue.from(mapOf("name" to "cart_total", "type" to "variable")))
        assertThat(arithmeticExpression.op()).isEqualTo(ArithmeticExpression.Op.PLUS)
        assertThat(arithmeticExpression._right())
            .isEqualTo(JsonValue.from(mapOf("name" to "shipping_cost", "type" to "variable")))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val arithmeticExpression =
            ArithmeticExpression.builder()
                .left(JsonValue.from(mapOf("name" to "cart_total", "type" to "variable")))
                .op(ArithmeticExpression.Op.PLUS)
                .right(JsonValue.from(mapOf("name" to "shipping_cost", "type" to "variable")))
                .build()

        val roundtrippedArithmeticExpression =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(arithmeticExpression),
                jacksonTypeRef<ArithmeticExpression>(),
            )

        assertThat(roundtrippedArithmeticExpression).isEqualTo(arithmeticExpression)
    }
}
