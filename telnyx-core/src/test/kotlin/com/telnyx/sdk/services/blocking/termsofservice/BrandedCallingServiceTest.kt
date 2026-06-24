// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.termsofservice

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BrandedCallingServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun agree() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val brandedCallingService = client.termsOfService().brandedCalling()

        val tosAgreementWrapped = brandedCallingService.agree()

        tosAgreementWrapped.validate()
    }
}
