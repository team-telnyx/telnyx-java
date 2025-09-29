// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking.campaign

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClient
import com.telnyx.api.models.campaign.usecase.UsecaseGetCostParams
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
        val usecaseService = client.campaign().usecase()

        val response =
            usecaseService.getCost(UsecaseGetCostParams.builder().usecase("usecase").build())

        response.validate()
    }
}
