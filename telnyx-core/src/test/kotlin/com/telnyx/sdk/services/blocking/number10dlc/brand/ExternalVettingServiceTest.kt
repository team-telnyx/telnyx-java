// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.number10dlc.brand

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.number10dlc.brand.externalvetting.ExternalVettingExternalVettingParams
import com.telnyx.sdk.models.number10dlc.brand.externalvetting.ExternalVettingUpdateExternalVettingParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ExternalVettingServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun externalVetting() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val externalVettingService = client.number10dlc().brand().externalVetting()

        val response =
            externalVettingService.externalVetting(
                ExternalVettingExternalVettingParams.builder()
                    .brandId("brandId")
                    .evpId("evpId")
                    .vettingClass("vettingClass")
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveExternalVetting() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val externalVettingService = client.number10dlc().brand().externalVetting()

        val response = externalVettingService.retrieveExternalVetting("brandId")

        response.forEach { it.validate() }
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun updateExternalVetting() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val externalVettingService = client.number10dlc().brand().externalVetting()

        val response =
            externalVettingService.updateExternalVetting(
                ExternalVettingUpdateExternalVettingParams.builder()
                    .brandId("brandId")
                    .evpId("evpId")
                    .vettingId("vettingId")
                    .vettingToken("vettingToken")
                    .build()
            )

        response.validate()
    }
}
