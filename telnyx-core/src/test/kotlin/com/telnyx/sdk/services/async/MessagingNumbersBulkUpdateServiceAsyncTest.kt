// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.messagingnumbersbulkupdates.MessagingNumbersBulkUpdateCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class MessagingNumbersBulkUpdateServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val messagingNumbersBulkUpdateServiceAsync = client.messagingNumbersBulkUpdates()

        val messagingNumbersBulkUpdateFuture =
            messagingNumbersBulkUpdateServiceAsync.create(
                MessagingNumbersBulkUpdateCreateParams.builder()
                    .messagingProfileId("00000000-0000-0000-0000-000000000000")
                    .numbers(listOf("+18880000000", "+18880000001", "+18880000002"))
                    .assignOnly(true)
                    .build()
            )

        val messagingNumbersBulkUpdate = messagingNumbersBulkUpdateFuture.get()
        messagingNumbersBulkUpdate.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val messagingNumbersBulkUpdateServiceAsync = client.messagingNumbersBulkUpdates()

        val messagingNumbersBulkUpdateFuture =
            messagingNumbersBulkUpdateServiceAsync.retrieve("order_id")

        val messagingNumbersBulkUpdate = messagingNumbersBulkUpdateFuture.get()
        messagingNumbersBulkUpdate.validate()
    }
}
