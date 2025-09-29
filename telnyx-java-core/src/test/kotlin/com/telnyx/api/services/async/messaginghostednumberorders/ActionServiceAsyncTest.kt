// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async.messaginghostednumberorders

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.api.models.messaginghostednumberorders.actions.ActionUploadFileParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ActionServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun uploadFile() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
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
