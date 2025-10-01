// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.messaginghostednumberorders

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.messaginghostednumberorders.actions.ActionUploadFileParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ActionServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun uploadFile() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val actionService = client.messagingHostedNumberOrders().actions()

        val response =
            actionService.uploadFile(
                ActionUploadFileParams.builder()
                    .id("id")
                    .bill("some content".byteInputStream())
                    .loa("some content".byteInputStream())
                    .build()
            )

        response.validate()
    }
}
