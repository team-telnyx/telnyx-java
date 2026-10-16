// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.whatsapp

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.whatsapp.hostedsignups.HostedSignupCreateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class HostedSignupServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val hostedSignupServiceAsync = client.whatsapp().hostedSignups()

        val hostedSignupFuture =
            hostedSignupServiceAsync.create(
                HostedSignupCreateParams.builder()
                    .appId("123456789012345")
                    .expiresAt(OffsetDateTime.parse("2026-07-09T12:00:00Z"))
                    .signupType(HostedSignupCreateParams.SignupType.COEXISTENCE)
                    .build()
            )

        val hostedSignup = hostedSignupFuture.get()
        hostedSignup.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val hostedSignupServiceAsync = client.whatsapp().hostedSignups()

        val hostedSignupFuture = hostedSignupServiceAsync.retrieve("id")

        val hostedSignup = hostedSignupFuture.get()
        hostedSignup.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val hostedSignupServiceAsync = client.whatsapp().hostedSignups()

        val pageFuture = hostedSignupServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }
}
