// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.conversations

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.ai.assistants.tests.testsuites.runs.Meta
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConversationRetrieveConversationsInsightsResponseTest {

    @Test
    fun create() {
        val conversationRetrieveConversationsInsightsResponse =
            ConversationRetrieveConversationsInsightsResponse.builder()
                .addData(
                    ConversationRetrieveConversationsInsightsResponse.Data.builder()
                        .id("id")
                        .addConversationInsight(
                            ConversationRetrieveConversationsInsightsResponse.Data
                                .ConversationInsight
                                .builder()
                                .insightId("insight_id")
                                .result("result")
                                .build()
                        )
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .status(
                            ConversationRetrieveConversationsInsightsResponse.Data.Status.PENDING
                        )
                        .build()
                )
                .meta(
                    Meta.builder()
                        .pageNumber(0L)
                        .pageSize(0L)
                        .totalPages(0L)
                        .totalResults(0L)
                        .build()
                )
                .build()

        assertThat(conversationRetrieveConversationsInsightsResponse.data())
            .containsExactly(
                ConversationRetrieveConversationsInsightsResponse.Data.builder()
                    .id("id")
                    .addConversationInsight(
                        ConversationRetrieveConversationsInsightsResponse.Data.ConversationInsight
                            .builder()
                            .insightId("insight_id")
                            .result("result")
                            .build()
                    )
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .status(ConversationRetrieveConversationsInsightsResponse.Data.Status.PENDING)
                    .build()
            )
        assertThat(conversationRetrieveConversationsInsightsResponse.meta())
            .isEqualTo(
                Meta.builder().pageNumber(0L).pageSize(0L).totalPages(0L).totalResults(0L).build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val conversationRetrieveConversationsInsightsResponse =
            ConversationRetrieveConversationsInsightsResponse.builder()
                .addData(
                    ConversationRetrieveConversationsInsightsResponse.Data.builder()
                        .id("id")
                        .addConversationInsight(
                            ConversationRetrieveConversationsInsightsResponse.Data
                                .ConversationInsight
                                .builder()
                                .insightId("insight_id")
                                .result("result")
                                .build()
                        )
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .status(
                            ConversationRetrieveConversationsInsightsResponse.Data.Status.PENDING
                        )
                        .build()
                )
                .meta(
                    Meta.builder()
                        .pageNumber(0L)
                        .pageSize(0L)
                        .totalPages(0L)
                        .totalResults(0L)
                        .build()
                )
                .build()

        val roundtrippedConversationRetrieveConversationsInsightsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(conversationRetrieveConversationsInsightsResponse),
                jacksonTypeRef<ConversationRetrieveConversationsInsightsResponse>(),
            )

        assertThat(roundtrippedConversationRetrieveConversationsInsightsResponse)
            .isEqualTo(conversationRetrieveConversationsInsightsResponse)
    }
}
