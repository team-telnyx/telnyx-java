// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.shortcodes.ShortCodeListParams
import com.telnyx.sdk.models.shortcodes.ShortCodeUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ShortCodeServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val shortCodeService = client.shortCodes()

        val shortCode = shortCodeService.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        shortCode.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val shortCodeService = client.shortCodes()

        val shortCode =
            shortCodeService.update(
                ShortCodeUpdateParams.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .messagingProfileId("abc85f64-5717-4562-b3fc-2c9600000000")
                    .build()
            )

        shortCode.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val shortCodeService = client.shortCodes()

        val shortCodes =
            shortCodeService.list(
                ShortCodeListParams.builder()
                    .filter(
                        ShortCodeListParams.Filter.builder()
                            .messagingProfileId("messaging_profile_id")
                            .build()
                    )
                    .page(ShortCodeListParams.Page.builder().number(1L).size(1L).build())
                    .build()
            )

        shortCodes.validate()
    }
}
