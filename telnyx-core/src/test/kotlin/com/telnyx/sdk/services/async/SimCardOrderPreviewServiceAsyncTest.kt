// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.simcardorderpreview.SimCardOrderPreviewPreviewParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SimCardOrderPreviewServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun preview() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val simCardOrderPreviewServiceAsync = client.simCardOrderPreview()

        val responseFuture =
            simCardOrderPreviewServiceAsync.preview(
                SimCardOrderPreviewPreviewParams.builder()
                    .addressId("1293384261075731499")
                    .quantity(21L)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
