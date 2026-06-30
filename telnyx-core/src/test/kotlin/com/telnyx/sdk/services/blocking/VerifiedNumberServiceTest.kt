// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.verifiednumbers.VerifiedNumberCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class VerifiedNumberServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val verifiedNumberService = client.verifiedNumbers()

        val verifiedNumber =
            verifiedNumberService.create(
                VerifiedNumberCreateParams.builder()
                    .phoneNumber("+15551234567")
                    .verificationMethod(VerifiedNumberCreateParams.VerificationMethod.SMS)
                    .extension("ww243w1")
                    .build()
            )

        verifiedNumber.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val verifiedNumberService = client.verifiedNumbers()

        val verifiedNumberDataWrapper = verifiedNumberService.retrieve("+15551234567")

        verifiedNumberDataWrapper.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val verifiedNumberService = client.verifiedNumbers()

        val page = verifiedNumberService.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val verifiedNumberService = client.verifiedNumbers()

        val verifiedNumberDataWrapper = verifiedNumberService.delete("+15551234567")

        verifiedNumberDataWrapper.validate()
    }
}
