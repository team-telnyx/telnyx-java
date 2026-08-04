// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.emailinboxes.threads

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.emailinboxes.messages.labels.LabelMutationRequest
import com.telnyx.sdk.models.emailinboxes.threads.labels.LabelCreateParams
import com.telnyx.sdk.models.emailinboxes.threads.labels.LabelDeleteAllParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class LabelServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val labelServiceAsync = client.emailInboxes().threads().labels()

        val labelFuture =
            labelServiceAsync.create(
                LabelCreateParams.builder()
                    .inboxId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .threadId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .labelMutationRequest(
                        LabelMutationRequest.builder().addLabel("needs_review").build()
                    )
                    .build()
            )

        val label = labelFuture.get()
        label.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deleteAll() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val labelServiceAsync = client.emailInboxes().threads().labels()

        val responseFuture =
            labelServiceAsync.deleteAll(
                LabelDeleteAllParams.builder()
                    .inboxId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .threadId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .labelMutationRequest(
                        LabelMutationRequest.builder().addLabel("needs_review").build()
                    )
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
