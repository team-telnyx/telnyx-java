// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.messaging10dlc.campaignbuilder

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.messaging10dlc.campaignbuilder.brand.BrandQualifyByUsecaseParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BrandServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun qualifyByUsecase() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val brandService = client.messaging10dlc().campaignBuilder().brand()

        val response =
            brandService.qualifyByUsecase(
                BrandQualifyByUsecaseParams.builder().brandId("brandId").usecase("usecase").build()
            )

        response.validate()
    }
}
