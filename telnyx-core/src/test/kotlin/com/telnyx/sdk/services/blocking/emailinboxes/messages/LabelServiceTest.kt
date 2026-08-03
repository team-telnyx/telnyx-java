// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.emailinboxes.messages

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.emailinboxes.messages.labels.LabelCreateParams
import com.telnyx.sdk.models.emailinboxes.messages.labels.LabelDeleteAllParams
import com.telnyx.sdk.models.emailinboxes.messages.labels.LabelMutationRequest
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class LabelServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val labelService = client.emailInboxes().messages().labels()

        val label =
            labelService.create(
                LabelCreateParams.builder()
                    .inboxId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .messageId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .labelMutationRequest(
                        LabelMutationRequest.builder().addLabel("spam").addLabel("urgent").build()
                    )
                    .build()
            )

        label.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deleteAll() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val labelService = client.emailInboxes().messages().labels()

        val response =
            labelService.deleteAll(
                LabelDeleteAllParams.builder()
                    .inboxId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .messageId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .labelMutationRequest(LabelMutationRequest.builder().addLabel("spam").build())
                    .build()
            )

        response.validate()
    }
}
