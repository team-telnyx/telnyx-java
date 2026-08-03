// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.emailinboxes

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.models.emailinboxes.drafts.EmailDraftRequest
import com.telnyx.sdk.models.emailinboxes.messages.MessageDraftsParams
import com.telnyx.sdk.models.emailinboxes.messages.MessageListParams
import com.telnyx.sdk.models.emailinboxes.messages.MessageUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class MessageServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val messageServiceAsync = client.emailInboxes().messages()

        val messageFuture =
            messageServiceAsync.update(
                MessageUpdateParams.builder()
                    .inboxId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .messageId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .readAt(MessageUpdateParams.ReadAt.UnionMember0.TRUE)
                    .build()
            )

        val message = messageFuture.get()
        message.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val messageServiceAsync = client.emailInboxes().messages()

        val messagesFuture =
            messageServiceAsync.list(
                MessageListParams.builder()
                    .inboxId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .filterFrom("filter[from]")
                    .filterLabel("filter[label]")
                    .filterRead(true)
                    .filterReceivedAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .filterReceivedBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .filterSearch("filter[search]")
                    .filterSubject("filter[subject]")
                    .filterUnread(true)
                    .pageAfter("page[after]")
                    .pageSize(1L)
                    .build()
            )

        val messages = messagesFuture.get()
        messages.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun drafts() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val messageServiceAsync = client.emailInboxes().messages()

        val emailDraftResponseFuture =
            messageServiceAsync.drafts(
                MessageDraftsParams.builder()
                    .inboxId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .messageId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .emailDraftRequest(
                        EmailDraftRequest.builder()
                            .addAttachment(JsonValue.from(mapOf<String, Any>()))
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
                            .metadata(JsonValue.from(mapOf<String, Any>()))
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

        val emailDraftResponse = emailDraftResponseFuture.get()
        emailDraftResponse.validate()
    }
}
