// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.emailmessages

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.emailmessages.recipients.RecipientRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class RecipientServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val recipientServiceAsync = client.emailMessages().recipients()

        val recipientFuture =
            recipientServiceAsync.retrieve(
                RecipientRetrieveParams.builder()
                    .emailId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .recipientId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val recipient = recipientFuture.get()
        recipient.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val recipientServiceAsync = client.emailMessages().recipients()

        val pageFuture = recipientServiceAsync.list("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val page = pageFuture.get()
        page.response().validate()
    }
}
