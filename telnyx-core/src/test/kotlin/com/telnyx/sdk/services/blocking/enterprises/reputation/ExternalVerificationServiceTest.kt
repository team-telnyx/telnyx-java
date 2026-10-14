// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.enterprises.reputation

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.enterprises.reputation.externalverification.ExternalVerificationCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ExternalVerificationServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val externalVerificationService = client.enterprises().reputation().externalVerification()

        val externalVerificationWrapped =
            externalVerificationService.create(
                ExternalVerificationCreateParams.builder()
                    .enterpriseId("4a6192a4-573d-446d-b3ce-aff9117272a6")
                    .addDocumentId("2a7e8337-e803-4057-a4ae-26c40eb0bc6c")
                    .addPhoneNumber("+13125550142")
                    .build()
            )

        externalVerificationWrapped.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val externalVerificationService = client.enterprises().reputation().externalVerification()

        val externalVerificationWrapped =
            externalVerificationService.list("4a6192a4-573d-446d-b3ce-aff9117272a6")

        externalVerificationWrapped.validate()
    }
}
