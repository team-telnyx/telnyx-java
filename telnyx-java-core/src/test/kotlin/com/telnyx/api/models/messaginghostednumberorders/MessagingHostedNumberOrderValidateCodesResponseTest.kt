// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.messaginghostednumberorders

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessagingHostedNumberOrderValidateCodesResponseTest {

    @Test
    fun create() {
        val messagingHostedNumberOrderValidateCodesResponse =
            MessagingHostedNumberOrderValidateCodesResponse.builder()
                .data(
                    MessagingHostedNumberOrderValidateCodesResponse.Data.builder()
                        .orderId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .addPhoneNumber(
                            MessagingHostedNumberOrderValidateCodesResponse.Data.PhoneNumber
                                .builder()
                                .phoneNumber("phone_number")
                                .status(
                                    MessagingHostedNumberOrderValidateCodesResponse.Data.PhoneNumber
                                        .Status
                                        .VERIFIED
                                )
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(messagingHostedNumberOrderValidateCodesResponse.data())
            .contains(
                MessagingHostedNumberOrderValidateCodesResponse.Data.builder()
                    .orderId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addPhoneNumber(
                        MessagingHostedNumberOrderValidateCodesResponse.Data.PhoneNumber.builder()
                            .phoneNumber("phone_number")
                            .status(
                                MessagingHostedNumberOrderValidateCodesResponse.Data.PhoneNumber
                                    .Status
                                    .VERIFIED
                            )
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val messagingHostedNumberOrderValidateCodesResponse =
            MessagingHostedNumberOrderValidateCodesResponse.builder()
                .data(
                    MessagingHostedNumberOrderValidateCodesResponse.Data.builder()
                        .orderId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .addPhoneNumber(
                            MessagingHostedNumberOrderValidateCodesResponse.Data.PhoneNumber
                                .builder()
                                .phoneNumber("phone_number")
                                .status(
                                    MessagingHostedNumberOrderValidateCodesResponse.Data.PhoneNumber
                                        .Status
                                        .VERIFIED
                                )
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedMessagingHostedNumberOrderValidateCodesResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(messagingHostedNumberOrderValidateCodesResponse),
                jacksonTypeRef<MessagingHostedNumberOrderValidateCodesResponse>(),
            )

        assertThat(roundtrippedMessagingHostedNumberOrderValidateCodesResponse)
            .isEqualTo(messagingHostedNumberOrderValidateCodesResponse)
    }
}
