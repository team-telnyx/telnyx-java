// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.messaging10dlc.brand

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.messaging10dlc.brand.externalvetting.ExternalVettingImportsParams
import com.telnyx.sdk.models.messaging10dlc.brand.externalvetting.ExternalVettingOrderParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ExternalVettingServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val externalVettingServiceAsync = client.messaging10dlc().brand().externalVetting()

        val externalVettingsFuture = externalVettingServiceAsync.list("brandId")

        val externalVettings = externalVettingsFuture.get()
        externalVettings.forEach { it.validate() }
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun imports() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val externalVettingServiceAsync = client.messaging10dlc().brand().externalVetting()

        val responseFuture =
            externalVettingServiceAsync.imports(
                ExternalVettingImportsParams.builder()
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
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val externalVettingServiceAsync = client.messaging10dlc().brand().externalVetting()

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
