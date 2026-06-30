// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CountryCoverageServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val countryCoverageServiceAsync = client.countryCoverage()

        val countryCoverageFuture = countryCoverageServiceAsync.retrieve()

        val countryCoverage = countryCoverageFuture.get()
        countryCoverage.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveCountry() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val countryCoverageServiceAsync = client.countryCoverage()

        val responseFuture = countryCoverageServiceAsync.retrieveCountry("US")

        val response = responseFuture.get()
        response.validate()
    }
}
