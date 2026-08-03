// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailmessages

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import com.telnyx.sdk.models.emailinboxes.drafts.EmailAddress
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class EmailAddressInputTest {

    @Test
    fun ofString() {
        val string = "string"

        val emailAddressInput = EmailAddressInput.ofString(string)

        assertThat(emailAddressInput.string()).contains(string)
        assertThat(emailAddressInput.emailAddress()).isEmpty
    }

    @Test
    fun ofStringRoundtrip() {
        val jsonMapper = jsonMapper()
        val emailAddressInput = EmailAddressInput.ofString("string")

        val roundtrippedEmailAddressInput =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(emailAddressInput),
                jacksonTypeRef<EmailAddressInput>(),
            )

        assertThat(jsonMapper.writeValueAsString(roundtrippedEmailAddressInput))
            .isEqualTo(jsonMapper.writeValueAsString(emailAddressInput))
    }

    @Test
    fun ofEmailAddress() {
        val emailAddress = EmailAddress.builder().email("email").name("name").build()

        val emailAddressInput = EmailAddressInput.ofEmailAddress(emailAddress)

        assertThat(emailAddressInput.string()).isEmpty
        assertThat(emailAddressInput.emailAddress()).contains(emailAddress)
    }

    @Test
    fun ofEmailAddressRoundtrip() {
        val jsonMapper = jsonMapper()
        val emailAddressInput =
            EmailAddressInput.ofEmailAddress(
                EmailAddress.builder().email("email").name("name").build()
            )

        val roundtrippedEmailAddressInput =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(emailAddressInput),
                jacksonTypeRef<EmailAddressInput>(),
            )

        assertThat(jsonMapper.writeValueAsString(roundtrippedEmailAddressInput))
            .isEqualTo(jsonMapper.writeValueAsString(emailAddressInput))
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
        val emailAddressInput =
            jsonMapper().convertValue(testCase.value, jacksonTypeRef<EmailAddressInput>())

        val e = assertThrows<TelnyxInvalidDataException> { emailAddressInput.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
