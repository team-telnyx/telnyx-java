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

internal class InboxActionRecipientInputTest {

    @Test
    fun ofString() {
        val string = "J!Q0Ok0bzJb7@pro.z\$"

        val inboxActionRecipientInput = InboxActionRecipientInput.ofString(string)

        assertThat(inboxActionRecipientInput.string()).contains(string)
        assertThat(inboxActionRecipientInput.recipientAddress()).isEmpty
        assertThat(inboxActionRecipientInput.recipientList()).isEmpty
    }

    @Test
    fun ofStringRoundtrip() {
        val jsonMapper = jsonMapper()
        val inboxActionRecipientInput = InboxActionRecipientInput.ofString("J!Q0Ok0bzJb7@pro.z\$")

        val roundtrippedInboxActionRecipientInput =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(inboxActionRecipientInput),
                jacksonTypeRef<InboxActionRecipientInput>(),
            )

        assertThat(jsonMapper.writeValueAsString(roundtrippedInboxActionRecipientInput))
            .isEqualTo(jsonMapper.writeValueAsString(inboxActionRecipientInput))
    }

    @Test
    fun ofRecipientAddress() {
        val recipientAddress =
            InboxActionRecipientInput.InboxRecipientAddress.builder()
                .email("J!Q0Ok0bzJb7@pro.z\$")
                .name("name")
                .build()

        val inboxActionRecipientInput =
            InboxActionRecipientInput.ofRecipientAddress(recipientAddress)

        assertThat(inboxActionRecipientInput.string()).isEmpty
        assertThat(inboxActionRecipientInput.recipientAddress()).contains(recipientAddress)
        assertThat(inboxActionRecipientInput.recipientList()).isEmpty
    }

    @Test
    fun ofRecipientAddressRoundtrip() {
        val jsonMapper = jsonMapper()
        val inboxActionRecipientInput =
            InboxActionRecipientInput.ofRecipientAddress(
                InboxActionRecipientInput.InboxRecipientAddress.builder()
                    .email("J!Q0Ok0bzJb7@pro.z\$")
                    .name("name")
                    .build()
            )

        val roundtrippedInboxActionRecipientInput =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(inboxActionRecipientInput),
                jacksonTypeRef<InboxActionRecipientInput>(),
            )

        assertThat(jsonMapper.writeValueAsString(roundtrippedInboxActionRecipientInput))
            .isEqualTo(jsonMapper.writeValueAsString(inboxActionRecipientInput))
    }

    @Test
    fun ofRecipientList() {
        val recipientList = listOf(InboxActionEmailAddressInput.ofString("J!Q0Ok0bzJb7@pro.z\$"))

        val inboxActionRecipientInput = InboxActionRecipientInput.ofRecipientList(recipientList)

        assertThat(inboxActionRecipientInput.string()).isEmpty
        assertThat(inboxActionRecipientInput.recipientAddress()).isEmpty
        assertThat(inboxActionRecipientInput.recipientList()).contains(recipientList)
    }

    @Test
    fun ofRecipientListRoundtrip() {
        val jsonMapper = jsonMapper()
        val inboxActionRecipientInput =
            InboxActionRecipientInput.ofRecipientList(
                listOf(InboxActionEmailAddressInput.ofString("J!Q0Ok0bzJb7@pro.z\$"))
            )

        val roundtrippedInboxActionRecipientInput =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(inboxActionRecipientInput),
                jacksonTypeRef<InboxActionRecipientInput>(),
            )

        assertThat(jsonMapper.writeValueAsString(roundtrippedInboxActionRecipientInput))
            .isEqualTo(jsonMapper.writeValueAsString(inboxActionRecipientInput))
    }

    enum class IncompatibleJsonShapeTestCase(val value: JsonValue) {
        BOOLEAN(JsonValue.from(false)),
        INTEGER(JsonValue.from(-1)),
        FLOAT(JsonValue.from(3.14)),
    }

    @ParameterizedTest
    @EnumSource
    fun incompatibleJsonShapeDeserializesToUnknown(testCase: IncompatibleJsonShapeTestCase) {
        val inboxActionRecipientInput =
            jsonMapper().convertValue(testCase.value, jacksonTypeRef<InboxActionRecipientInput>())

        val e = assertThrows<TelnyxInvalidDataException> { inboxActionRecipientInput.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
