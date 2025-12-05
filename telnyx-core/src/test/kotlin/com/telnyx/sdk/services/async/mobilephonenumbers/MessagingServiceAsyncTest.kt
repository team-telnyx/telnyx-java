// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.mobilephonenumbers

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.mobilephonenumbers.messaging.MessagingListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class MessagingServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val messagingServiceAsync = client.mobilePhoneNumbers().messaging()

        val messagingFuture = messagingServiceAsync.retrieve("id")

        val messaging = messagingFuture.get()
        messaging.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val messagingServiceAsync = client.mobilePhoneNumbers().messaging()

        val messagingsFuture =
            messagingServiceAsync.list(
                MessagingListParams.builder()
                    .page(MessagingListParams.Page.builder().number(1L).size(1L).build())
                    .build()
            )

        val messagings = messagingsFuture.get()
        messagings.validate()
    }
}
