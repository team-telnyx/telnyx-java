// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.botsignup

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BotSignupCreateParamsTest {

    @Test
    fun create() {
        BotSignupCreateParams.builder()
            .botChallengeAnswer("35")
            .botChallengeNonce("c6feda4e-6501-4db9-a21f-665e5b4ce2ba")
            .privacyPolicyUrl("https://telnyx.com/privacy-policy")
            .termsAndConditionsUrl("https://telnyx.com/terms-and-conditions-of-service")
            .termsOfService(BotSignupCreateParams.TermsOfService.TRUE)
            .email("agent-owner@example.com")
            .termsAndConditionsEuUrl("https://telnyx.com/terms-and-conditions-of-service-eu")
            .termsOfServiceEu(BotSignupCreateParams.TermsOfServiceEu.TRUE)
            .build()
    }

    @Test
    fun body() {
        val params =
            BotSignupCreateParams.builder()
                .botChallengeAnswer("35")
                .botChallengeNonce("c6feda4e-6501-4db9-a21f-665e5b4ce2ba")
                .privacyPolicyUrl("https://telnyx.com/privacy-policy")
                .termsAndConditionsUrl("https://telnyx.com/terms-and-conditions-of-service")
                .termsOfService(BotSignupCreateParams.TermsOfService.TRUE)
                .email("agent-owner@example.com")
                .termsAndConditionsEuUrl("https://telnyx.com/terms-and-conditions-of-service-eu")
                .termsOfServiceEu(BotSignupCreateParams.TermsOfServiceEu.TRUE)
                .build()

        val body = params._body()

        assertThat(body.botChallengeAnswer()).isEqualTo("35")
        assertThat(body.botChallengeNonce()).isEqualTo("c6feda4e-6501-4db9-a21f-665e5b4ce2ba")
        assertThat(body.privacyPolicyUrl()).isEqualTo("https://telnyx.com/privacy-policy")
        assertThat(body.termsAndConditionsUrl())
            .isEqualTo("https://telnyx.com/terms-and-conditions-of-service")
        assertThat(body.termsOfService()).isEqualTo(BotSignupCreateParams.TermsOfService.TRUE)
        assertThat(body.email()).contains("agent-owner@example.com")
        assertThat(body.termsAndConditionsEuUrl())
            .contains("https://telnyx.com/terms-and-conditions-of-service-eu")
        assertThat(body.termsOfServiceEu()).contains(BotSignupCreateParams.TermsOfServiceEu.TRUE)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            BotSignupCreateParams.builder()
                .botChallengeAnswer("35")
                .botChallengeNonce("c6feda4e-6501-4db9-a21f-665e5b4ce2ba")
                .privacyPolicyUrl("https://telnyx.com/privacy-policy")
                .termsAndConditionsUrl("https://telnyx.com/terms-and-conditions-of-service")
                .termsOfService(BotSignupCreateParams.TermsOfService.TRUE)
                .build()

        val body = params._body()

        assertThat(body.botChallengeAnswer()).isEqualTo("35")
        assertThat(body.botChallengeNonce()).isEqualTo("c6feda4e-6501-4db9-a21f-665e5b4ce2ba")
        assertThat(body.privacyPolicyUrl()).isEqualTo("https://telnyx.com/privacy-policy")
        assertThat(body.termsAndConditionsUrl())
            .isEqualTo("https://telnyx.com/terms-and-conditions-of-service")
        assertThat(body.termsOfService()).isEqualTo(BotSignupCreateParams.TermsOfService.TRUE)
    }
}
