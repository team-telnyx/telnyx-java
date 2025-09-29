// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CountryCoverageServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val countryCoverageServiceAsync = client.countryCoverage()

        val countryCoverageFuture = countryCoverageServiceAsync.retrieve()

        val countryCoverage = countryCoverageFuture.get()
        countryCoverage.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveCountry() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val countryCoverageServiceAsync = client.countryCoverage()

        val responseFuture = countryCoverageServiceAsync.retrieveCountry("US")

        val response = responseFuture.get()
        response.validate()
    }
}
