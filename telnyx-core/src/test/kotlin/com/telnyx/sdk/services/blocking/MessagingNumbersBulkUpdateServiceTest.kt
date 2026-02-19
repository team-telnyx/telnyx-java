// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.messagingnumbersbulkupdates.MessagingNumbersBulkUpdateCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class MessagingNumbersBulkUpdateServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val messagingNumbersBulkUpdateService = client.messagingNumbersBulkUpdates()

        val messagingNumbersBulkUpdate =
            messagingNumbersBulkUpdateService.create(
                MessagingNumbersBulkUpdateCreateParams.builder()
                    .messagingProfileId("00000000-0000-0000-0000-000000000000")
                    .numbers(listOf("+18880000000", "+18880000001", "+18880000002"))
                    .build()
            )

        messagingNumbersBulkUpdate.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val messagingNumbersBulkUpdateService = client.messagingNumbersBulkUpdates()

        val messagingNumbersBulkUpdate = messagingNumbersBulkUpdateService.retrieve("order_id")

        messagingNumbersBulkUpdate.validate()
    }
}
