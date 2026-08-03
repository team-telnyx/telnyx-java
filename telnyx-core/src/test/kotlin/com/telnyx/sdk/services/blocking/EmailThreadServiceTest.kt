// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.emailthreads.EmailThreadListParams
import com.telnyx.sdk.models.emailthreads.EmailThreadRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class EmailThreadServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val emailThreadService = client.emailThreads()

        val emailThread =
            emailThreadService.retrieve(
                EmailThreadRetrieveParams.builder()
                    .threadId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .inboxId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .pageAfter("page[after]")
                    .pageSize(1L)
                    .build()
            )

        emailThread.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val emailThreadService = client.emailThreads()

        val inboundThreadListResponse =
            emailThreadService.list(
                EmailThreadListParams.builder()
                    .addFilterInboxId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .filterLabel("filter[label]")
                    .pageAfter("page[after]")
                    .pageSize(1L)
                    .build()
            )

        inboundThreadListResponse.validate()
    }
}
