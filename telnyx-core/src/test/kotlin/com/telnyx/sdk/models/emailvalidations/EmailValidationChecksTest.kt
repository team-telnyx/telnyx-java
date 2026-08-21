// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailvalidations

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmailValidationChecksTest {

    @Test
    fun create() {
        val emailValidationChecks =
            EmailValidationChecks.builder()
                .disposable(EmailValidationCheck.builder().pass(true).details("details").build())
                .mx(EmailValidationCheck.builder().pass(true).details("details").build())
                .roleBased(EmailValidationCheck.builder().pass(true).details("details").build())
                .syntax(EmailValidationCheck.builder().pass(true).details("details").build())
                .typo(
                    EmailValidationChecks.Typo.builder()
                        .pass(true)
                        .details("details")
                        .suggestion("suggestion")
                        .build()
                )
                .build()

        assertThat(emailValidationChecks.disposable())
            .isEqualTo(EmailValidationCheck.builder().pass(true).details("details").build())
        assertThat(emailValidationChecks.mx())
            .isEqualTo(EmailValidationCheck.builder().pass(true).details("details").build())
        assertThat(emailValidationChecks.roleBased())
            .isEqualTo(EmailValidationCheck.builder().pass(true).details("details").build())
        assertThat(emailValidationChecks.syntax())
            .isEqualTo(EmailValidationCheck.builder().pass(true).details("details").build())
        assertThat(emailValidationChecks.typo())
            .isEqualTo(
                EmailValidationChecks.Typo.builder()
                    .pass(true)
                    .details("details")
                    .suggestion("suggestion")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val emailValidationChecks =
            EmailValidationChecks.builder()
                .disposable(EmailValidationCheck.builder().pass(true).details("details").build())
                .mx(EmailValidationCheck.builder().pass(true).details("details").build())
                .roleBased(EmailValidationCheck.builder().pass(true).details("details").build())
                .syntax(EmailValidationCheck.builder().pass(true).details("details").build())
                .typo(
                    EmailValidationChecks.Typo.builder()
                        .pass(true)
                        .details("details")
                        .suggestion("suggestion")
                        .build()
                )
                .build()

        val roundtrippedEmailValidationChecks =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(emailValidationChecks),
                jacksonTypeRef<EmailValidationChecks>(),
            )

        assertThat(roundtrippedEmailValidationChecks).isEqualTo(emailValidationChecks)
    }
}
