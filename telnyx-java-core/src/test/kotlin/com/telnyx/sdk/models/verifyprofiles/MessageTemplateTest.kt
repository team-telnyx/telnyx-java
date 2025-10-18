// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.verifyprofiles

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessageTemplateTest {

    @Test
    fun create() {
        val messageTemplate =
            MessageTemplate.builder()
                .data(
                    VerifyProfileMessageTemplateResponse.builder()
                        .id("0abb5b4f-459f-445a-bfcd-488998b7572d")
                        .text("Your {{app_name}} verification code is: {{code}}.")
                        .build()
                )
                .build()

        assertThat(messageTemplate.data())
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
        val messageTemplate =
            MessageTemplate.builder()
                .data(
                    VerifyProfileMessageTemplateResponse.builder()
                        .id("0abb5b4f-459f-445a-bfcd-488998b7572d")
                        .text("Your {{app_name}} verification code is: {{code}}.")
                        .build()
                )
                .build()

        val roundtrippedMessageTemplate =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(messageTemplate),
                jacksonTypeRef<MessageTemplate>(),
            )

        assertThat(roundtrippedMessageTemplate).isEqualTo(messageTemplate)
    }
}
