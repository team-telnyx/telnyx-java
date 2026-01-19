// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.calls.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class LoopcountTest {

    @Test
    fun ofString() {
        val string = "string"

        val loopcount = Loopcount.ofString(string)

        assertThat(loopcount.string()).contains(string)
        assertThat(loopcount.integer()).isEmpty
    }

    @Test
    fun ofStringRoundtrip() {
        val jsonMapper = jsonMapper()
        val loopcount = Loopcount.ofString("string")

        val roundtrippedLoopcount =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(loopcount),
                jacksonTypeRef<Loopcount>(),
            )

        assertThat(roundtrippedLoopcount).isEqualTo(loopcount)
    }

    @Test
    fun ofInteger() {
        val integer = 0L

        val loopcount = Loopcount.ofInteger(integer)

        assertThat(loopcount.string()).isEmpty
        assertThat(loopcount.integer()).contains(integer)
    }

    @Test
    @Disabled("Known stainless issue with union primitive type serialization")
    fun ofIntegerRoundtrip() {
        val jsonMapper = jsonMapper()
        val loopcount = Loopcount.ofInteger(0L)

        val roundtrippedLoopcount =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(loopcount),
                jacksonTypeRef<Loopcount>(),
            )

        assertThat(roundtrippedLoopcount).isEqualTo(loopcount)
    }

    enum class IncompatibleJsonShapeTestCase(val value: JsonValue) {
        BOOLEAN(JsonValue.from(false)),
        FLOAT(JsonValue.from(3.14)),
        OBJECT(JsonValue.from(mapOf("invalid" to "object"))),
        ARRAY(JsonValue.from(listOf("invalid", "array"))),
    }

    @ParameterizedTest
    @EnumSource
    fun incompatibleJsonShapeDeserializesToUnknown(testCase: IncompatibleJsonShapeTestCase) {
        val loopcount = jsonMapper().convertValue(testCase.value, jacksonTypeRef<Loopcount>())

        val e = assertThrows<TelnyxInvalidDataException> { loopcount.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
