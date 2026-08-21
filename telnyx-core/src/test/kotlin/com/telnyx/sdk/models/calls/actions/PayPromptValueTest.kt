// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.calls.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class PayPromptValueTest {

    @Test
    fun ofString() {
        val string = "x"

        val payPromptValue = PayPromptValue.ofString(string)

        assertThat(payPromptValue.string()).contains(string)
        assertThat(payPromptValue.list()).isEmpty
    }

    @Test
    fun ofStringRoundtrip() {
        val jsonMapper = jsonMapper()
        val payPromptValue = PayPromptValue.ofString("x")

        val roundtrippedPayPromptValue =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(payPromptValue),
                jacksonTypeRef<PayPromptValue>(),
            )

        assertThat(jsonMapper.writeValueAsString(roundtrippedPayPromptValue))
            .isEqualTo(jsonMapper.writeValueAsString(payPromptValue))
    }

    @Test
    fun ofList() {
        val list =
            listOf(
                PayPromptValue.PayPrompt.builder()
                    .text("Please enter your card number.")
                    .attempt("2 3")
                    .cardType(PayPromptValue.PayPrompt.CardType.AMEX)
                    .errorType(PayPromptValue.PayPrompt.ErrorType.INVALID_CARD_NUMBER)
                    .build()
            )

        val payPromptValue = PayPromptValue.ofList(list)

        assertThat(payPromptValue.string()).isEmpty
        assertThat(payPromptValue.list()).contains(list)
    }

    @Test
    fun ofListRoundtrip() {
        val jsonMapper = jsonMapper()
        val payPromptValue =
            PayPromptValue.ofList(
                listOf(
                    PayPromptValue.PayPrompt.builder()
                        .text("Please enter your card number.")
                        .attempt("2 3")
                        .cardType(PayPromptValue.PayPrompt.CardType.AMEX)
                        .errorType(PayPromptValue.PayPrompt.ErrorType.INVALID_CARD_NUMBER)
                        .build()
                )
            )

        val roundtrippedPayPromptValue =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(payPromptValue),
                jacksonTypeRef<PayPromptValue>(),
            )

        assertThat(jsonMapper.writeValueAsString(roundtrippedPayPromptValue))
            .isEqualTo(jsonMapper.writeValueAsString(payPromptValue))
    }

    enum class IncompatibleJsonShapeTestCase(val value: JsonValue) {
        BOOLEAN(JsonValue.from(false)),
        INTEGER(JsonValue.from(-1)),
        FLOAT(JsonValue.from(3.14)),
        OBJECT(JsonValue.from(mapOf("invalid" to "object"))),
    }

    @ParameterizedTest
    @EnumSource
    fun incompatibleJsonShapeDeserializesToUnknown(testCase: IncompatibleJsonShapeTestCase) {
        val payPromptValue =
            jsonMapper().convertValue(testCase.value, jacksonTypeRef<PayPromptValue>())

        val e = assertThrows<TelnyxInvalidDataException> { payPromptValue.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
