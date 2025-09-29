// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClient
import com.telnyx.api.models.bulksimcardactions.BulkSimCardActionListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class BulkSimCardActionServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val bulkSimCardActionService = client.bulkSimCardActions()

        val bulkSimCardAction =
            bulkSimCardActionService.retrieve("6a09cdc3-8948-47f0-aa62-74ac943d6c58")

        bulkSimCardAction.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val bulkSimCardActionService = client.bulkSimCardActions()

        val bulkSimCardActions =
            bulkSimCardActionService.list(
                BulkSimCardActionListParams.builder()
                    .filterActionType(
                        BulkSimCardActionListParams.FilterActionType.BULK_SET_PUBLIC_IPS
                    )
                    .pageNumber(1L)
                    .pageSize(1L)
                    .build()
            )

        bulkSimCardActions.validate()
    }
}
