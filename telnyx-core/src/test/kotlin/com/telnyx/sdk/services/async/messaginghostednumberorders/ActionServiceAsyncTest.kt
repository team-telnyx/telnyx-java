// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.messaginghostednumberorders

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.messaginghostednumberorders.actions.ActionUploadFileParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ActionServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun uploadFile() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val actionServiceAsync = client.messagingHostedNumberOrders().actions()

        val responseFuture =
            actionServiceAsync.uploadFile(
                ActionUploadFileParams.builder()
                    .id("id")
                    .bill("some content".byteInputStream())
                    .loa("some content".byteInputStream())
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
