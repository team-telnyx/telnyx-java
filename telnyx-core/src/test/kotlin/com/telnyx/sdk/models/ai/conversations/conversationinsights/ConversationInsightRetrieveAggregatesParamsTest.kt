// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.conversations.conversationinsights

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConversationInsightRetrieveAggregatesParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun queryParams() {
        val params =
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

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("created_at", "created_at")
                    .put("group_by", listOf("string").joinToString(","))
                    .put("insight_id", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("metadata[assistant_id]", "assistant_id")
                    .put("show", listOf("string").joinToString(","))
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ConversationInsightRetrieveAggregatesParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
