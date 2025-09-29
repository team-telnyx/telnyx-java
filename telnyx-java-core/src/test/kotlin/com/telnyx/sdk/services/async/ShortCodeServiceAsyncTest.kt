// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.shortcodes.ShortCodeListParams
import com.telnyx.sdk.models.shortcodes.ShortCodeUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ShortCodeServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val shortCodeServiceAsync = client.shortCodes()

        val shortCodeFuture = shortCodeServiceAsync.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val shortCode = shortCodeFuture.get()
        shortCode.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val shortCodeServiceAsync = client.shortCodes()

        val shortCodeFuture =
            shortCodeServiceAsync.update(
                ShortCodeUpdateParams.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .messagingProfileId("abc85f64-5717-4562-b3fc-2c9600000000")
                    .build()
            )

        val shortCode = shortCodeFuture.get()
        shortCode.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val shortCodeServiceAsync = client.shortCodes()

        val shortCodesFuture =
            shortCodeServiceAsync.list(
                ShortCodeListParams.builder()
                    .filter(
                        ShortCodeListParams.Filter.builder()
                            .messagingProfileId("messaging_profile_id")
                            .build()
                    )
                    .page(ShortCodeListParams.Page.builder().number(1L).size(1L).build())
                    .build()
            )

        val shortCodes = shortCodesFuture.get()
        shortCodes.validate()
    }
}
