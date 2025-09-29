// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async.storage.migrations

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ActionServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun stop() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val actionServiceAsync = client.storage().migrations().actions()

        val responseFuture = actionServiceAsync.stop("")

        val response = responseFuture.get()
        response.validate()
    }
}
