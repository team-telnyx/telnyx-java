// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.messaging10dlc.brand

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.messaging10dlc.brand.externalvetting.ExternalVettingImportsParams
import com.telnyx.sdk.models.messaging10dlc.brand.externalvetting.ExternalVettingOrderParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ExternalVettingServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val externalVettingService = client.messaging10dlc().brand().externalVetting()

        val externalVettings = externalVettingService.list("brandId")

        externalVettings.forEach { it.validate() }
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun imports() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val externalVettingService = client.messaging10dlc().brand().externalVetting()

        val response =
            externalVettingService.imports(
                ExternalVettingImportsParams.builder()
                    .brandId("brandId")
                    .evpId("evpId")
                    .vettingId("vettingId")
                    .vettingToken("vettingToken")
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun order() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val externalVettingService = client.messaging10dlc().brand().externalVetting()

        val response =
            externalVettingService.order(
                ExternalVettingOrderParams.builder()
                    .brandId("brandId")
                    .evpId("evpId")
                    .vettingClass("vettingClass")
                    .build()
            )

        response.validate()
    }
}
