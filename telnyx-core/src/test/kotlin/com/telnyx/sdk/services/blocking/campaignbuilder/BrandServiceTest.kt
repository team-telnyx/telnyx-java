// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.campaignbuilder

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.campaignbuilder.brand.BrandQualifyByUsecaseParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class BrandServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun qualifyByUsecase() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val brandService = client.campaignBuilder().brand()

        val response =
            brandService.qualifyByUsecase(
                BrandQualifyByUsecaseParams.builder().brandId("brandId").usecase("usecase").build()
            )

        response.validate()
    }
}
