// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.number10dlc.brand

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.number10dlc.brand.externalvetting.ExternalVettingExternalVettingParams
import com.telnyx.sdk.models.number10dlc.brand.externalvetting.ExternalVettingUpdateExternalVettingParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ExternalVettingServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun externalVetting() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val externalVettingServiceAsync = client.number10dlc().brand().externalVetting()

        val responseFuture =
            externalVettingServiceAsync.externalVetting(
                ExternalVettingExternalVettingParams.builder()
                    .brandId("brandId")
                    .evpId("evpId")
                    .vettingClass("vettingClass")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveExternalVetting() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val externalVettingServiceAsync = client.number10dlc().brand().externalVetting()

        val responseFuture = externalVettingServiceAsync.retrieveExternalVetting("brandId")

        val response = responseFuture.get()
        response.forEach { it.validate() }
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun updateExternalVetting() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val externalVettingServiceAsync = client.number10dlc().brand().externalVetting()

        val responseFuture =
            externalVettingServiceAsync.updateExternalVetting(
                ExternalVettingUpdateExternalVettingParams.builder()
                    .brandId("brandId")
                    .evpId("evpId")
                    .vettingId("vettingId")
                    .vettingToken("vettingToken")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
