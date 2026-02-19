// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.seti.SetiRetrieveBlackBoxTestResultsParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SetiServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveBlackBoxTestResults() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val setiServiceAsync = client.seti()

        val responseFuture =
            setiServiceAsync.retrieveBlackBoxTestResults(
                SetiRetrieveBlackBoxTestResultsParams.builder()
                    .filter(
                        SetiRetrieveBlackBoxTestResultsParams.Filter.builder()
                            .product("product")
                            .build()
                    )
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
