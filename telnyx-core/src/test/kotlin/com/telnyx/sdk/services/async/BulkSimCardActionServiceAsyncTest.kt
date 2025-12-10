// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.bulksimcardactions.BulkSimCardActionListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class BulkSimCardActionServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val bulkSimCardActionServiceAsync = client.bulkSimCardActions()

        val bulkSimCardActionFuture =
            bulkSimCardActionServiceAsync.retrieve("6a09cdc3-8948-47f0-aa62-74ac943d6c58")

        val bulkSimCardAction = bulkSimCardActionFuture.get()
        bulkSimCardAction.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val bulkSimCardActionServiceAsync = client.bulkSimCardActions()

        val bulkSimCardActionsFuture =
            bulkSimCardActionServiceAsync.list(
                BulkSimCardActionListParams.builder()
                    .filterActionType(
                        BulkSimCardActionListParams.FilterActionType.BULK_SET_PUBLIC_IPS
                    )
                    .pageNumber(1L)
                    .pageSize(1L)
                    .build()
            )

        val bulkSimCardActions = bulkSimCardActionsFuture.get()
        bulkSimCardActions.validate()
    }
}
