// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.botsignup.BotSignupCreateParams
import com.telnyx.sdk.models.botsignup.BotSignupResendMagicLinkParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BotSignupServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val botSignupServiceAsync = client.botSignup()

        val successResponseFuture =
            botSignupServiceAsync.create(
                BotSignupCreateParams.builder()
                    .botChallengeAnswer("35")
                    .botChallengeNonce("c6feda4e-6501-4db9-a21f-665e5b4ce2ba")
                    .privacyPolicyUrl("https://telnyx.com/privacy-policy")
                    .termsAndConditionsUrl("https://telnyx.com/terms-and-conditions-of-service")
                    .termsOfService(BotSignupCreateParams.TermsOfService.TRUE)
                    .email("agent-owner@example.com")
                    .termsAndConditionsEuUrl(
                        "https://telnyx.com/terms-and-conditions-of-service-eu"
                    )
                    .termsOfServiceEu(BotSignupCreateParams.TermsOfServiceEu.TRUE)
                    .build()
            )

        val successResponse = successResponseFuture.get()
        successResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun resendMagicLink() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val botSignupServiceAsync = client.botSignup()

        val successResponseFuture =
            botSignupServiceAsync.resendMagicLink(
                BotSignupResendMagicLinkParams.builder().email("agent-owner@example.com").build()
            )

        val successResponse = successResponseFuture.get()
        successResponse.validate()
    }
}
