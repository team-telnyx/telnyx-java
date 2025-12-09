// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.number10dlc.campaign

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.number10dlc.campaign.usecase.UsecaseGetCostParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class UsecaseServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun getCost() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val usecaseService = client.number10dlc().campaign().usecase()

        val response =
            usecaseService.getCost(UsecaseGetCostParams.builder().usecase("usecase").build())

        response.validate()
    }
}
