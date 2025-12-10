// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.number10dlc.brand

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.number10dlc.brand.externalvetting.ExternalVettingImportParams
import com.telnyx.sdk.models.number10dlc.brand.externalvetting.ExternalVettingOrderParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ExternalVettingServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val externalVettingServiceAsync = client.number10dlc().brand().externalVetting()

        val externalVettingsFuture = externalVettingServiceAsync.list("brandId")

        val externalVettings = externalVettingsFuture.get()
        externalVettings.forEach { it.validate() }
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun import_() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val externalVettingServiceAsync = client.number10dlc().brand().externalVetting()

        val responseFuture =
            externalVettingServiceAsync.import_(
                ExternalVettingImportParams.builder()
                    .brandId("brandId")
                    .evpId("evpId")
                    .vettingId("vettingId")
                    .vettingToken("vettingToken")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun order() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val externalVettingServiceAsync = client.number10dlc().brand().externalVetting()

        val responseFuture =
            externalVettingServiceAsync.order(
                ExternalVettingOrderParams.builder()
                    .brandId("brandId")
                    .evpId("evpId")
                    .vettingClass("vettingClass")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
