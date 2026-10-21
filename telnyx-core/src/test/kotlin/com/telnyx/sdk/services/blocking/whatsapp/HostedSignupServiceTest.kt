// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.whatsapp

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.whatsapp.hostedsignups.HostedSignupCreateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class HostedSignupServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val hostedSignupService = client.whatsapp().hostedSignups()

        val hostedSignup =
            hostedSignupService.create(
                HostedSignupCreateParams.builder()
                    .appId("123456789012345")
                    .expiresAt(OffsetDateTime.parse("2026-07-09T12:00:00Z"))
                    .signupType(HostedSignupCreateParams.SignupType.COEXISTENCE)
                    .build()
            )

        hostedSignup.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val hostedSignupService = client.whatsapp().hostedSignups()

        val hostedSignup = hostedSignupService.retrieve("id")

        hostedSignup.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val hostedSignupService = client.whatsapp().hostedSignups()

        val page = hostedSignupService.list()

        page.response().validate()
    }
}
