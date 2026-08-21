// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.emailthreads.EmailThreadRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class EmailThreadServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val emailThreadServiceAsync = client.emailThreads()

        val emailThreadFuture =
            emailThreadServiceAsync.retrieve(
                EmailThreadRetrieveParams.builder()
                    .threadId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .inboxId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .pageAfter("page[after]")
                    .pageSize(1L)
                    .build()
            )

        val emailThread = emailThreadFuture.get()
        emailThread.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val emailThreadServiceAsync = client.emailThreads()

        val pageFuture = emailThreadServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }
}
