// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.messaging10dlc.campaignbuilder

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.messaging10dlc.campaignbuilder.brand.BrandQualifyByUsecaseParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BrandServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun qualifyByUsecase() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val brandServiceAsync = client.messaging10dlc().campaignBuilder().brand()

        val responseFuture =
            brandServiceAsync.qualifyByUsecase(
                BrandQualifyByUsecaseParams.builder().brandId("brandId").usecase("usecase").build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
