// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.simcardorderpreview.SimCardOrderPreviewPreviewParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SimCardOrderPreviewServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun preview() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val simCardOrderPreviewService = client.simCardOrderPreview()

        val response =
            simCardOrderPreviewService.preview(
                SimCardOrderPreviewPreviewParams.builder()
                    .addressId("1293384261075731499")
                    .quantity(21L)
                    .build()
            )

        response.validate()
    }
}
