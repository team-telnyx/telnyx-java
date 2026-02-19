// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class MessagingUrlDomainServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val messagingUrlDomainServiceAsync = client.messagingUrlDomains()

        val pageFuture = messagingUrlDomainServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }
}
