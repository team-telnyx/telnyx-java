// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messaginghostednumberorders

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessagingHostedNumberOrderCreateVerificationCodesResponseTest {

    @Test
    fun create() {
        val messagingHostedNumberOrderCreateVerificationCodesResponse =
            MessagingHostedNumberOrderCreateVerificationCodesResponse.builder()
                .addData(
                    MessagingHostedNumberOrderCreateVerificationCodesResponse.Data.builder()
                        .phoneNumber("phone_number")
                        .error("error")
                        .type(
                            MessagingHostedNumberOrderCreateVerificationCodesResponse.Data.Type.SMS
                        )
                        .verificationCodeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()

        assertThat(messagingHostedNumberOrderCreateVerificationCodesResponse.data())
            .containsExactly(
                MessagingHostedNumberOrderCreateVerificationCodesResponse.Data.builder()
                    .phoneNumber("phone_number")
                    .error("error")
                    .type(MessagingHostedNumberOrderCreateVerificationCodesResponse.Data.Type.SMS)
                    .verificationCodeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val messagingHostedNumberOrderCreateVerificationCodesResponse =
            MessagingHostedNumberOrderCreateVerificationCodesResponse.builder()
                .addData(
                    MessagingHostedNumberOrderCreateVerificationCodesResponse.Data.builder()
                        .phoneNumber("phone_number")
                        .error("error")
                        .type(
                            MessagingHostedNumberOrderCreateVerificationCodesResponse.Data.Type.SMS
                        )
                        .verificationCodeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()

        val roundtrippedMessagingHostedNumberOrderCreateVerificationCodesResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(
                    messagingHostedNumberOrderCreateVerificationCodesResponse
                ),
                jacksonTypeRef<MessagingHostedNumberOrderCreateVerificationCodesResponse>(),
            )

        assertThat(roundtrippedMessagingHostedNumberOrderCreateVerificationCodesResponse)
            .isEqualTo(messagingHostedNumberOrderCreateVerificationCodesResponse)
    }
}
