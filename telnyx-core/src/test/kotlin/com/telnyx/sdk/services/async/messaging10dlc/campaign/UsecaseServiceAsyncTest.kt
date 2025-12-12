// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.messaging10dlc.campaign

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.messaging10dlc.campaign.usecase.UsecaseGetCostParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class UsecaseServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun getCost() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val usecaseServiceAsync = client.messaging10dlc().campaign().usecase()

        val responseFuture =
            usecaseServiceAsync.getCost(UsecaseGetCostParams.builder().usecase("usecase").build())

        val response = responseFuture.get()
        response.validate()
    }
}
