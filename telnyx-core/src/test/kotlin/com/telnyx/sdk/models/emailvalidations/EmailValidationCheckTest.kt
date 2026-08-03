// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailvalidations

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmailValidationCheckTest {

    @Test
    fun create() {
        val emailValidationCheck =
            EmailValidationCheck.builder().pass(true).details("details").build()

        assertThat(emailValidationCheck.pass()).isEqualTo(true)
        assertThat(emailValidationCheck.details()).contains("details")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val emailValidationCheck =
            EmailValidationCheck.builder().pass(true).details("details").build()

        val roundtrippedEmailValidationCheck =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(emailValidationCheck),
                jacksonTypeRef<EmailValidationCheck>(),
            )

        assertThat(roundtrippedEmailValidationCheck).isEqualTo(emailValidationCheck)
    }
}
