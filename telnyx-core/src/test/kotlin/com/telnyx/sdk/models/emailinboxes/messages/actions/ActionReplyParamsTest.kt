// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailinboxes.messages.actions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionReplyParamsTest {

    @Test
    fun create() {
        ActionReplyParams.builder()
            .inboxId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .messageId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .replyEmailInboxMessageRequest(
                ReplyEmailInboxMessageRequest.builder()
                    .html("P")
                    .text("Thanks for the update.")
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ActionReplyParams.builder()
                .inboxId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .messageId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .replyEmailInboxMessageRequest(ReplyEmailInboxMessageRequest.builder().build())
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(params._pathParam(1)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ActionReplyParams.builder()
                .inboxId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .messageId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .replyEmailInboxMessageRequest(
                    ReplyEmailInboxMessageRequest.builder()
                        .html("P")
                        .text("Thanks for the update.")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                ReplyEmailInboxMessageRequest.builder()
                    .html("P")
                    .text("Thanks for the update.")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ActionReplyParams.builder()
                .inboxId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .messageId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .replyEmailInboxMessageRequest(ReplyEmailInboxMessageRequest.builder().build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(ReplyEmailInboxMessageRequest.builder().build())
    }
}
