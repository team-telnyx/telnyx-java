// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.conversations.conversationinsights

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConversationInsightRetrieveAggregatesResponseTest {

    @Test
    fun create() {
        val conversationInsightRetrieveAggregatesResponse =
            ConversationInsightRetrieveAggregatesResponse.builder()
                .addData(
                    ConversationInsightRetrieveAggregatesResponse.Data.builder()
                        .recordCount(0L)
                        .build()
                )
                .build()

        assertThat(conversationInsightRetrieveAggregatesResponse.data())
            .containsExactly(
                ConversationInsightRetrieveAggregatesResponse.Data.builder().recordCount(0L).build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val conversationInsightRetrieveAggregatesResponse =
            ConversationInsightRetrieveAggregatesResponse.builder()
                .addData(
                    ConversationInsightRetrieveAggregatesResponse.Data.builder()
                        .recordCount(0L)
                        .build()
                )
                .build()

        val roundtrippedConversationInsightRetrieveAggregatesResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(conversationInsightRetrieveAggregatesResponse),
                jacksonTypeRef<ConversationInsightRetrieveAggregatesResponse>(),
            )

        assertThat(roundtrippedConversationInsightRetrieveAggregatesResponse)
            .isEqualTo(conversationInsightRetrieveAggregatesResponse)
    }
}
