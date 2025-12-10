// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.number10dlc.campaignbuilder

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.number10dlc.campaignbuilder.brand.BrandQualifyByUsecaseParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class BrandServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun qualifyByUsecase() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val brandServiceAsync = client.number10dlc().campaignBuilder().brand()

        val responseFuture =
            brandServiceAsync.qualifyByUsecase(
                BrandQualifyByUsecaseParams.builder().brandId("brandId").usecase("usecase").build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
