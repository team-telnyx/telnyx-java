// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.botchallenge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BotChallengeCreateResponseTest {

    @Test
    fun create() {
        val botChallengeCreateResponse =
            BotChallengeCreateResponse.builder()
                .data(
                    BotChallengeCreateResponse.Data.builder()
                        .challengeType(BotChallengeCreateResponse.Data.ChallengeType.MATH)
                        .nonce("c6feda4e-6501-4db9-a21f-665e5b4ce2ba")
                        .privacyPolicyUrl("https://telnyx.com/privacy-policy")
                        .problem(
                            "W#hAt iS f!Ve tImEs sEvEn? Round to 0 decimal places. Omit units."
                        )
                        .termsAndConditionsUrl("https://telnyx.com/terms-and-conditions-of-service")
                        .precision(0L)
                        .build()
                )
                .build()

        assertThat(botChallengeCreateResponse.data())
            .isEqualTo(
                BotChallengeCreateResponse.Data.builder()
                    .challengeType(BotChallengeCreateResponse.Data.ChallengeType.MATH)
                    .nonce("c6feda4e-6501-4db9-a21f-665e5b4ce2ba")
                    .privacyPolicyUrl("https://telnyx.com/privacy-policy")
                    .problem("W#hAt iS f!Ve tImEs sEvEn? Round to 0 decimal places. Omit units.")
                    .termsAndConditionsUrl("https://telnyx.com/terms-and-conditions-of-service")
                    .precision(0L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val botChallengeCreateResponse =
            BotChallengeCreateResponse.builder()
                .data(
                    BotChallengeCreateResponse.Data.builder()
                        .challengeType(BotChallengeCreateResponse.Data.ChallengeType.MATH)
                        .nonce("c6feda4e-6501-4db9-a21f-665e5b4ce2ba")
                        .privacyPolicyUrl("https://telnyx.com/privacy-policy")
                        .problem(
                            "W#hAt iS f!Ve tImEs sEvEn? Round to 0 decimal places. Omit units."
                        )
                        .termsAndConditionsUrl("https://telnyx.com/terms-and-conditions-of-service")
                        .precision(0L)
                        .build()
                )
                .build()

        val roundtrippedBotChallengeCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(botChallengeCreateResponse),
                jacksonTypeRef<BotChallengeCreateResponse>(),
            )

        assertThat(roundtrippedBotChallengeCreateResponse).isEqualTo(botChallengeCreateResponse)
    }
}
