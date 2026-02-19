// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.simcardorderpreview.SimCardOrderPreviewPreviewParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SimCardOrderPreviewServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun preview() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
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
