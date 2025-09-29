// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.messaginghostednumberorders

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessagingHostedNumberOrderCheckEligibilityResponseTest {

    @Test
    fun create() {
        val messagingHostedNumberOrderCheckEligibilityResponse =
            MessagingHostedNumberOrderCheckEligibilityResponse.builder()
                .addPhoneNumber(
                    MessagingHostedNumberOrderCheckEligibilityResponse.PhoneNumber.builder()
                        .detail("detail")
                        .eligible(true)
                        .eligibleStatus(
                            MessagingHostedNumberOrderCheckEligibilityResponse.PhoneNumber
                                .EligibleStatus
                                .NUMBER_CAN_NOT_BE_REPEATED
                        )
                        .phoneNumber("phone_number")
                        .build()
                )
                .build()

        assertThat(messagingHostedNumberOrderCheckEligibilityResponse.phoneNumbers().getOrNull())
            .containsExactly(
                MessagingHostedNumberOrderCheckEligibilityResponse.PhoneNumber.builder()
                    .detail("detail")
                    .eligible(true)
                    .eligibleStatus(
                        MessagingHostedNumberOrderCheckEligibilityResponse.PhoneNumber
                            .EligibleStatus
                            .NUMBER_CAN_NOT_BE_REPEATED
                    )
                    .phoneNumber("phone_number")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val messagingHostedNumberOrderCheckEligibilityResponse =
            MessagingHostedNumberOrderCheckEligibilityResponse.builder()
                .addPhoneNumber(
                    MessagingHostedNumberOrderCheckEligibilityResponse.PhoneNumber.builder()
                        .detail("detail")
                        .eligible(true)
                        .eligibleStatus(
                            MessagingHostedNumberOrderCheckEligibilityResponse.PhoneNumber
                                .EligibleStatus
                                .NUMBER_CAN_NOT_BE_REPEATED
                        )
                        .phoneNumber("phone_number")
                        .build()
                )
                .build()

        val roundtrippedMessagingHostedNumberOrderCheckEligibilityResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(messagingHostedNumberOrderCheckEligibilityResponse),
                jacksonTypeRef<MessagingHostedNumberOrderCheckEligibilityResponse>(),
            )

        assertThat(roundtrippedMessagingHostedNumberOrderCheckEligibilityResponse)
            .isEqualTo(messagingHostedNumberOrderCheckEligibilityResponse)
    }
}
