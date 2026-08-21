// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.emailinboxes.messages

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.emailinboxes.messages.actions.ActionForwardParams
import com.telnyx.sdk.models.emailinboxes.messages.actions.ActionReplyAllParams
import com.telnyx.sdk.models.emailinboxes.messages.actions.ActionReplyParams
import com.telnyx.sdk.models.emailinboxes.messages.actions.InboxActionEmailAddressInput
import com.telnyx.sdk.models.emailinboxes.messages.actions.ReplyEmailInboxMessageRequest
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ActionServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun forward() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val actionServiceAsync = client.emailInboxes().messages().actions()

        val emailMessageResponseFuture =
            actionServiceAsync.forward(
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

        val emailMessageResponse = emailMessageResponseFuture.get()
        emailMessageResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun reply() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val actionServiceAsync = client.emailInboxes().messages().actions()

        val emailMessageResponseFuture =
            actionServiceAsync.reply(
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

        val emailMessageResponse = emailMessageResponseFuture.get()
        emailMessageResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun replyAll() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val actionServiceAsync = client.emailInboxes().messages().actions()

        val emailMessageResponseFuture =
            actionServiceAsync.replyAll(
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

        val emailMessageResponse = emailMessageResponseFuture.get()
        emailMessageResponse.validate()
    }
}
