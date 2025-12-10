// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.number10dlc.campaign

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.number10dlc.campaign.usecase.UsecaseRetrieveCostParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class UsecaseServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveCost() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val usecaseServiceAsync = client.number10dlc().campaign().usecase()

        val responseFuture =
            usecaseServiceAsync.retrieveCost(
                UsecaseRetrieveCostParams.builder().usecase("usecase").build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
