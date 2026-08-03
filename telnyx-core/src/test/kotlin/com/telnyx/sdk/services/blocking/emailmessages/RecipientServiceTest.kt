// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.emailmessages

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.emailmessages.recipients.RecipientListParams
import com.telnyx.sdk.models.emailmessages.recipients.RecipientRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class RecipientServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val recipientService = client.emailMessages().recipients()

        val recipient =
            recipientService.retrieve(
                RecipientRetrieveParams.builder()
                    .emailId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .recipientId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        recipient.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val recipientService = client.emailMessages().recipients()

        val recipients =
            recipientService.list(
                RecipientListParams.builder()
                    .emailId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .kind(RecipientListParams.Kind.TO)
                    .pageCursor("page_cursor")
                    .pageSize(1L)
                    .status(RecipientListParams.Status.QUEUED)
                    .build()
            )

        recipients.validate()
    }
}
