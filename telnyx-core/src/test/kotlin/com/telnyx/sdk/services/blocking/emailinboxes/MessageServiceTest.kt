// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.emailinboxes

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.models.emailinboxes.drafts.EmailDraftRequest
import com.telnyx.sdk.models.emailinboxes.messages.MessageDraftsParams
import com.telnyx.sdk.models.emailinboxes.messages.MessageUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class MessageServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val messageService = client.emailInboxes().messages()

        val message =
            messageService.update(
                MessageUpdateParams.builder()
                    .inboxId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .messageId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .readAt(MessageUpdateParams.ReadAt.ServerReadTime.TRUE)
                    .build()
            )

        message.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val messageService = client.emailInboxes().messages()

        val page = messageService.list("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun drafts() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val messageService = client.emailInboxes().messages()

        val emailDraftResponse =
            messageService.drafts(
                MessageDraftsParams.builder()
                    .inboxId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .messageId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .emailDraftRequest(
                        EmailDraftRequest.builder()
                            .addAttachment(
                                EmailDraftRequest.Attachment.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .addBcc("string")
                            .addCc("string")
                            .fromEmail("from_email")
                            .fromName("from_name")
                            .headers(
                                EmailDraftRequest.Headers.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .html("html")
                            .htmlBody("html_body")
                            .addLabel("string")
                            .metadata(
                                EmailDraftRequest.Metadata.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .replyTo("reply_to")
                            .subject("subject")
                            .addTag("string")
                            .text("text")
                            .textBody("Thanks for the update — I will review today.")
                            .addTo("string")
                            .build()
                    )
                    .build()
            )

        emailDraftResponse.validate()
    }
}
