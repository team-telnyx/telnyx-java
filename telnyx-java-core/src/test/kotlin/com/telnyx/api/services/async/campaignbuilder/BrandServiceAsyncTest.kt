// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async.campaignbuilder

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.api.models.campaignbuilder.brand.BrandQualifyByUsecaseParams
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
        val brandServiceAsync = client.campaignBuilder().brand()

        val responseFuture =
            brandServiceAsync.qualifyByUsecase(
                BrandQualifyByUsecaseParams.builder().brandId("brandId").usecase("usecase").build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
