// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CountryCoverageServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val countryCoverageService = client.countryCoverage()

        val countryCoverage = countryCoverageService.retrieve()

        countryCoverage.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveCountry() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val countryCoverageService = client.countryCoverage()

        val response = countryCoverageService.retrieveCountry("US")

        response.validate()
    }
}
