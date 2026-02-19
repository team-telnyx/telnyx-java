// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CountryCoverageServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val countryCoverageService = client.countryCoverage()

        val countryCoverage = countryCoverageService.retrieve()

        countryCoverage.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveCountry() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val countryCoverageService = client.countryCoverage()

        val response = countryCoverageService.retrieveCountry("US")

        response.validate()
    }
}
