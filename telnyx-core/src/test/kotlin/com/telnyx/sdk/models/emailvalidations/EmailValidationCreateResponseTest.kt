// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailvalidations

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmailValidationCreateResponseTest {

    @Test
    fun create() {
        val emailValidationCreateResponse =
            EmailValidationCreateResponse.builder()
                .data(
                    EmailValidationCreateResponse.Data.builder()
                        .checks(
                            EmailValidationCreateResponse.Data.Checks.builder()
                                .disposable(
                                    EmailValidationCheck.builder()
                                        .pass(true)
                                        .details("details")
                                        .build()
                                )
                                .mx(
                                    EmailValidationCheck.builder()
                                        .pass(true)
                                        .details("details")
                                        .build()
                                )
                                .roleBased(
                                    EmailValidationCheck.builder()
                                        .pass(true)
                                        .details("details")
                                        .build()
                                )
                                .syntax(
                                    EmailValidationCheck.builder()
                                        .pass(true)
                                        .details("details")
                                        .build()
                                )
                                .typo(
                                    EmailValidationCreateResponse.Data.Checks.Typo.builder()
                                        .pass(true)
                                        .details("details")
                                        .suggestion("suggestion")
                                        .build()
                                )
                                .build()
                        )
                        .email("email")
                        .recordType(EmailValidationCreateResponse.Data.RecordType.EMAIL_VALIDATION)
                        .riskScore(0.0f)
                        .valid(true)
                        .didYouMean("did_you_mean")
                        .build()
                )
                .build()

        assertThat(emailValidationCreateResponse.data())
            .isEqualTo(
                EmailValidationCreateResponse.Data.builder()
                    .checks(
                        EmailValidationCreateResponse.Data.Checks.builder()
                            .disposable(
                                EmailValidationCheck.builder().pass(true).details("details").build()
                            )
                            .mx(
                                EmailValidationCheck.builder().pass(true).details("details").build()
                            )
                            .roleBased(
                                EmailValidationCheck.builder().pass(true).details("details").build()
                            )
                            .syntax(
                                EmailValidationCheck.builder().pass(true).details("details").build()
                            )
                            .typo(
                                EmailValidationCreateResponse.Data.Checks.Typo.builder()
                                    .pass(true)
                                    .details("details")
                                    .suggestion("suggestion")
                                    .build()
                            )
                            .build()
                    )
                    .email("email")
                    .recordType(EmailValidationCreateResponse.Data.RecordType.EMAIL_VALIDATION)
                    .riskScore(0.0f)
                    .valid(true)
                    .didYouMean("did_you_mean")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val emailValidationCreateResponse =
            EmailValidationCreateResponse.builder()
                .data(
                    EmailValidationCreateResponse.Data.builder()
                        .checks(
                            EmailValidationCreateResponse.Data.Checks.builder()
                                .disposable(
                                    EmailValidationCheck.builder()
                                        .pass(true)
                                        .details("details")
                                        .build()
                                )
                                .mx(
                                    EmailValidationCheck.builder()
                                        .pass(true)
                                        .details("details")
                                        .build()
                                )
                                .roleBased(
                                    EmailValidationCheck.builder()
                                        .pass(true)
                                        .details("details")
                                        .build()
                                )
                                .syntax(
                                    EmailValidationCheck.builder()
                                        .pass(true)
                                        .details("details")
                                        .build()
                                )
                                .typo(
                                    EmailValidationCreateResponse.Data.Checks.Typo.builder()
                                        .pass(true)
                                        .details("details")
                                        .suggestion("suggestion")
                                        .build()
                                )
                                .build()
                        )
                        .email("email")
                        .recordType(EmailValidationCreateResponse.Data.RecordType.EMAIL_VALIDATION)
                        .riskScore(0.0f)
                        .valid(true)
                        .didYouMean("did_you_mean")
                        .build()
                )
                .build()

        val roundtrippedEmailValidationCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(emailValidationCreateResponse),
                jacksonTypeRef<EmailValidationCreateResponse>(),
            )

        assertThat(roundtrippedEmailValidationCreateResponse)
            .isEqualTo(emailValidationCreateResponse)
    }
}
