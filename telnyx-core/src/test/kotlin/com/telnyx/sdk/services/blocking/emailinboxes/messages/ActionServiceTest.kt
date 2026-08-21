// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.emailinboxes.messages

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.emailinboxes.messages.actions.ActionForwardParams
import com.telnyx.sdk.models.emailinboxes.messages.actions.ActionReplyAllParams
import com.telnyx.sdk.models.emailinboxes.messages.actions.ActionReplyParams
import com.telnyx.sdk.models.emailinboxes.messages.actions.InboxActionEmailAddressInput
import com.telnyx.sdk.models.emailinboxes.messages.actions.ReplyEmailInboxMessageRequest
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ActionServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun forward() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val actionService = client.emailInboxes().messages().actions()

        val emailMessageResponse =
            actionService.forward(
                ActionForwardParams.builder()
                    .inboxId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .messageId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .to("new@example.com")
                    .bccOfRecipientList(
                        listOf(InboxActionEmailAddressInput.ofString("blind@example.com"))
                    )
                    .ccOfRecipientList(
                        listOf(
                            InboxActionEmailAddressInput.ofRecipientAddress(
                                InboxActionEmailAddressInput.InboxRecipientAddress.builder()
                                    .email("copy@example.com")
                                    .name("name")
                                    .build()
                            )
                        )
                    )
                    .html("html")
                    .text("FYI")
                    .build()
            )

        emailMessageResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun reply() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val actionService = client.emailInboxes().messages().actions()

        val emailMessageResponse =
            actionService.reply(
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
            )

        emailMessageResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun replyAll() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val actionService = client.emailInboxes().messages().actions()

        val emailMessageResponse =
            actionService.replyAll(
                ActionReplyAllParams.builder()
                    .inboxId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .messageId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .replyEmailInboxMessageRequest(
                        ReplyEmailInboxMessageRequest.builder()
                            .html("P")
                            .text("Everyone, please review.")
                            .build()
                    )
                    .build()
            )

        emailMessageResponse.validate()
    }
}
