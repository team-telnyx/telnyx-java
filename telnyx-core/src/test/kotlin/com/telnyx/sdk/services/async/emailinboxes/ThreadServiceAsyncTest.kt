// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.emailinboxes

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.emailinboxes.threads.ThreadListParams
import com.telnyx.sdk.models.emailinboxes.threads.ThreadRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ThreadServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val threadServiceAsync = client.emailInboxes().threads()

        val threadFuture =
            threadServiceAsync.retrieve(
                ThreadRetrieveParams.builder()
                    .inboxId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .threadId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .pageAfter("page[after]")
                    .pageSize(1L)
                    .build()
            )

        val thread = threadFuture.get()
        thread.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val threadServiceAsync = client.emailInboxes().threads()

        val inboundThreadListResponseFuture =
            threadServiceAsync.list(
                ThreadListParams.builder()
                    .inboxId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .filterLabel("filter[label]")
                    .pageAfter("page[after]")
                    .pageSize(1L)
                    .build()
            )

        val inboundThreadListResponse = inboundThreadListResponseFuture.get()
        inboundThreadListResponse.validate()
    }
}
