// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.verifications

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ByPhoneNumberServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val byPhoneNumberService = client.verifications().byPhoneNumber()

        val byPhoneNumbers = byPhoneNumberService.list("+13035551234")

        byPhoneNumbers.validate()
    }
}
