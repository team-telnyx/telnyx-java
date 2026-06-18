// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.conversations.messages

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessageListParamsTest {

    @Test
    fun create() {
        MessageListParams.builder()
            .conversationId("conversation_id")
            .pageNumber(1L)
            .pageSize(1L)
            .build()
    }

    @Test
    fun pathParams() {
        val params = MessageListParams.builder().conversationId("conversation_id").build()

        assertThat(params._pathParam(0)).isEqualTo("conversation_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            MessageListParams.builder()
                .conversationId("conversation_id")
                .pageNumber(1L)
                .pageSize(1L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder().put("page[number]", "1").put("page[size]", "1").build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = MessageListParams.builder().conversationId("conversation_id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
