// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking.verifications

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ByPhoneNumberServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val byPhoneNumberService = client.verifications().byPhoneNumber()

        val byPhoneNumbers = byPhoneNumberService.list("+13035551234")

        byPhoneNumbers.validate()
    }
}
