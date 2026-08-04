// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.emailmessages

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.emailmessages.recipients.RecipientListParams
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

        val recipientsFuture =
            recipientServiceAsync.list(
                RecipientListParams.builder()
                    .emailId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .kind(RecipientListParams.Kind.TO)
                    .pageCursor("page_cursor")
                    .pageSize(1L)
                    .status(RecipientListParams.Status.QUEUED)
                    .build()
            )

        val recipients = recipientsFuture.get()
        recipients.validate()
    }
}
