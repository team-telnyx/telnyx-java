// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.seti.SetiRetrieveBlackBoxTestResultsParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SetiServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveBlackBoxTestResults() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val setiService = client.seti()

        val response =
            setiService.retrieveBlackBoxTestResults(
                SetiRetrieveBlackBoxTestResultsParams.builder()
                    .filter(
                        SetiRetrieveBlackBoxTestResultsParams.Filter.builder()
                            .product("product")
                            .build()
                    )
                    .build()
            )

        response.validate()
    }
}
