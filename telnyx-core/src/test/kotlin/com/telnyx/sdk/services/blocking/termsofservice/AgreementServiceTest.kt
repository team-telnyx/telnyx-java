// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.termsofservice

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AgreementServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val agreementService = client.termsOfService().agreements()

        val tosAgreementWrapped = agreementService.retrieve("550e8400-e29b-41d4-a716-446655440000")

        tosAgreementWrapped.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val agreementService = client.termsOfService().agreements()

        val page = agreementService.list()

        page.response().validate()
    }
}
