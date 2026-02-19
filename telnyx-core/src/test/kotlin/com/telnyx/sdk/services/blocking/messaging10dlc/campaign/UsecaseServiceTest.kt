// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.messaging10dlc.campaign

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.messaging10dlc.campaign.usecase.UsecaseGetCostParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class UsecaseServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun getCost() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val usecaseService = client.messaging10dlc().campaign().usecase()

        val response =
            usecaseService.getCost(UsecaseGetCostParams.builder().usecase("usecase").build())

        response.validate()
    }
}
