// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.emailinboxes

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.emailinboxes.threads.ThreadListParams
import com.telnyx.sdk.models.emailinboxes.threads.ThreadRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ThreadServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val threadService = client.emailInboxes().threads()

        val thread =
            threadService.retrieve(
                ThreadRetrieveParams.builder()
                    .inboxId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .threadId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .pageAfter("page[after]")
                    .pageSize(1L)
                    .build()
            )

        thread.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val threadService = client.emailInboxes().threads()

        val inboundThreadListResponse =
            threadService.list(
                ThreadListParams.builder()
                    .inboxId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .filterLabel("filter[label]")
                    .pageAfter("page[after]")
                    .pageSize(1L)
                    .build()
            )

        inboundThreadListResponse.validate()
    }
}
