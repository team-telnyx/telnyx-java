// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailinboxes.messages.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class InboxActionEmailAddressInputTest {

    @Test
    fun ofString() {
        val string = "J!Q0Ok0bzJb7@pro.z\$"

        val inboxActionEmailAddressInput = InboxActionEmailAddressInput.ofString(string)

        assertThat(inboxActionEmailAddressInput.string()).contains(string)
        assertThat(inboxActionEmailAddressInput.unionMember1()).isEmpty
    }

    @Test
    fun ofStringRoundtrip() {
        val jsonMapper = jsonMapper()
        val inboxActionEmailAddressInput =
            InboxActionEmailAddressInput.ofString("J!Q0Ok0bzJb7@pro.z\$")

        val roundtrippedInboxActionEmailAddressInput =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(inboxActionEmailAddressInput),
                jacksonTypeRef<InboxActionEmailAddressInput>(),
            )

        assertThat(jsonMapper.writeValueAsString(roundtrippedInboxActionEmailAddressInput))
            .isEqualTo(jsonMapper.writeValueAsString(inboxActionEmailAddressInput))
    }

    @Test
    fun ofUnionMember1() {
        val unionMember1 =
            InboxActionEmailAddressInput.UnionMember1.builder()
                .email("J!Q0Ok0bzJb7@pro.z\$")
                .name("name")
                .build()

        val inboxActionEmailAddressInput = InboxActionEmailAddressInput.ofUnionMember1(unionMember1)

        assertThat(inboxActionEmailAddressInput.string()).isEmpty
        assertThat(inboxActionEmailAddressInput.unionMember1()).contains(unionMember1)
    }

    @Test
    fun ofUnionMember1Roundtrip() {
        val jsonMapper = jsonMapper()
        val inboxActionEmailAddressInput =
            InboxActionEmailAddressInput.ofUnionMember1(
                InboxActionEmailAddressInput.UnionMember1.builder()
                    .email("J!Q0Ok0bzJb7@pro.z\$")
                    .name("name")
                    .build()
            )

        val roundtrippedInboxActionEmailAddressInput =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(inboxActionEmailAddressInput),
                jacksonTypeRef<InboxActionEmailAddressInput>(),
            )

        assertThat(jsonMapper.writeValueAsString(roundtrippedInboxActionEmailAddressInput))
            .isEqualTo(jsonMapper.writeValueAsString(inboxActionEmailAddressInput))
    }

    enum class IncompatibleJsonShapeTestCase(val value: JsonValue) {
        BOOLEAN(JsonValue.from(false)),
        INTEGER(JsonValue.from(-1)),
        FLOAT(JsonValue.from(3.14)),
        ARRAY(JsonValue.from(listOf("invalid", "array"))),
    }

    @ParameterizedTest
    @EnumSource
    fun incompatibleJsonShapeDeserializesToUnknown(testCase: IncompatibleJsonShapeTestCase) {
        val inboxActionEmailAddressInput =
            jsonMapper()
                .convertValue(testCase.value, jacksonTypeRef<InboxActionEmailAddressInput>())

        val e = assertThrows<TelnyxInvalidDataException> { inboxActionEmailAddressInput.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
