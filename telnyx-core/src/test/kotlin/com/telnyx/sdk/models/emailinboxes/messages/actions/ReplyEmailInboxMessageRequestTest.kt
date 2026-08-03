// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailinboxes.messages.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ReplyEmailInboxMessageRequestTest {

    @Test
    fun create() {
        val replyEmailInboxMessageRequest =
            ReplyEmailInboxMessageRequest.builder().html("P").text("P").build()

        assertThat(replyEmailInboxMessageRequest.html()).contains("P")
        assertThat(replyEmailInboxMessageRequest.text()).contains("P")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val replyEmailInboxMessageRequest =
            ReplyEmailInboxMessageRequest.builder().html("P").text("P").build()

        val roundtrippedReplyEmailInboxMessageRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(replyEmailInboxMessageRequest),
                jacksonTypeRef<ReplyEmailInboxMessageRequest>(),
            )

        assertThat(roundtrippedReplyEmailInboxMessageRequest)
            .isEqualTo(replyEmailInboxMessageRequest)
    }
}
