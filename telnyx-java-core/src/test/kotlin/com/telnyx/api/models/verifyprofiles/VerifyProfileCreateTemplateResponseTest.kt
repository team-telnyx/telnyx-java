// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.verifyprofiles

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VerifyProfileCreateTemplateResponseTest {

    @Test
    fun create() {
        val verifyProfileCreateTemplateResponse =
            VerifyProfileCreateTemplateResponse.builder()
                .data(
                    VerifyProfileCreateTemplateResponse.Data.builder()
                        .id("0abb5b4f-459f-445a-bfcd-488998b7572d")
                        .text("Your {{app_name}} verification code is: {{code}}.")
                        .build()
                )
                .build()

        assertThat(verifyProfileCreateTemplateResponse.data())
            .contains(
                VerifyProfileCreateTemplateResponse.Data.builder()
                    .id("0abb5b4f-459f-445a-bfcd-488998b7572d")
                    .text("Your {{app_name}} verification code is: {{code}}.")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val verifyProfileCreateTemplateResponse =
            VerifyProfileCreateTemplateResponse.builder()
                .data(
                    VerifyProfileCreateTemplateResponse.Data.builder()
                        .id("0abb5b4f-459f-445a-bfcd-488998b7572d")
                        .text("Your {{app_name}} verification code is: {{code}}.")
                        .build()
                )
                .build()

        val roundtrippedVerifyProfileCreateTemplateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(verifyProfileCreateTemplateResponse),
                jacksonTypeRef<VerifyProfileCreateTemplateResponse>(),
            )

        assertThat(roundtrippedVerifyProfileCreateTemplateResponse)
            .isEqualTo(verifyProfileCreateTemplateResponse)
    }
}
