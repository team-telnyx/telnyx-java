// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.verifyprofiles

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VerifyProfileUpdateTemplateResponseTest {

    @Test
    fun create() {
        val verifyProfileUpdateTemplateResponse =
            VerifyProfileUpdateTemplateResponse.builder()
                .data(
                    VerifyProfileMessageTemplateResponse.builder()
                        .id("0abb5b4f-459f-445a-bfcd-488998b7572d")
                        .text("Your {{app_name}} verification code is: {{code}}.")
                        .build()
                )
                .build()

        assertThat(verifyProfileUpdateTemplateResponse.data())
            .contains(
                VerifyProfileMessageTemplateResponse.builder()
                    .id("0abb5b4f-459f-445a-bfcd-488998b7572d")
                    .text("Your {{app_name}} verification code is: {{code}}.")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val verifyProfileUpdateTemplateResponse =
            VerifyProfileUpdateTemplateResponse.builder()
                .data(
                    VerifyProfileMessageTemplateResponse.builder()
                        .id("0abb5b4f-459f-445a-bfcd-488998b7572d")
                        .text("Your {{app_name}} verification code is: {{code}}.")
                        .build()
                )
                .build()

        val roundtrippedVerifyProfileUpdateTemplateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(verifyProfileUpdateTemplateResponse),
                jacksonTypeRef<VerifyProfileUpdateTemplateResponse>(),
            )

        assertThat(roundtrippedVerifyProfileUpdateTemplateResponse)
            .isEqualTo(verifyProfileUpdateTemplateResponse)
    }
}
