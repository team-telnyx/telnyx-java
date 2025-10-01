// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.verifyprofiles

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VerifyProfileMessageTemplateResponseTest {

    @Test
    fun create() {
        val verifyProfileMessageTemplateResponse =
            VerifyProfileMessageTemplateResponse.builder()
                .id("0abb5b4f-459f-445a-bfcd-488998b7572d")
                .text("Your {{app_name}} verification code is: {{code}}.")
                .build()

        assertThat(verifyProfileMessageTemplateResponse.id())
            .contains("0abb5b4f-459f-445a-bfcd-488998b7572d")
        assertThat(verifyProfileMessageTemplateResponse.text())
            .contains("Your {{app_name}} verification code is: {{code}}.")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val verifyProfileMessageTemplateResponse =
            VerifyProfileMessageTemplateResponse.builder()
                .id("0abb5b4f-459f-445a-bfcd-488998b7572d")
                .text("Your {{app_name}} verification code is: {{code}}.")
                .build()

        val roundtrippedVerifyProfileMessageTemplateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(verifyProfileMessageTemplateResponse),
                jacksonTypeRef<VerifyProfileMessageTemplateResponse>(),
            )

        assertThat(roundtrippedVerifyProfileMessageTemplateResponse)
            .isEqualTo(verifyProfileMessageTemplateResponse)
    }
}
