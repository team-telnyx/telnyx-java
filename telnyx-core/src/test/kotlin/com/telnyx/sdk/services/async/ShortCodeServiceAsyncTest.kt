// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.shortcodes.ShortCodeUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ShortCodeServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val shortCodeServiceAsync = client.shortCodes()

        val shortCodeFuture = shortCodeServiceAsync.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val shortCode = shortCodeFuture.get()
        shortCode.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val shortCodeServiceAsync = client.shortCodes()

        val shortCodeFuture =
            shortCodeServiceAsync.update(
                ShortCodeUpdateParams.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .messagingProfileId("abc85f64-5717-4562-b3fc-2c9600000000")
                    .addTag("test_customer")
                    .build()
            )

        val shortCode = shortCodeFuture.get()
        shortCode.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val shortCodeServiceAsync = client.shortCodes()

        val pageFuture = shortCodeServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }
}
