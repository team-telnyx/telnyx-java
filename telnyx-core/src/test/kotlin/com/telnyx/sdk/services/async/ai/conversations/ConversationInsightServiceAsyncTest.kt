// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai.conversations

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.ai.conversations.conversationinsights.ConversationInsightRetrieveAggregatesParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ConversationInsightServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveAggregates() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val conversationInsightServiceAsync = client.ai().conversations().conversationInsights()

        val responseFuture =
            conversationInsightServiceAsync.retrieveAggregates(
                ConversationInsightRetrieveAggregatesParams.builder()
                    .createdAt("created_at")
                    .addGroupBy("string")
                    .insightId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .metadata(
                        ConversationInsightRetrieveAggregatesParams.Metadata.builder()
                            .assistantId("assistant_id")
                            .build()
                    )
                    .addShow("string")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
