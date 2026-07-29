// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailthreads

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.emailinboxes.threads.EmailPaginationMeta
import com.telnyx.sdk.models.emailinboxes.threads.InboundEmailAddress
import com.telnyx.sdk.models.emailinboxes.threads.InboundThread
import com.telnyx.sdk.models.emailinboxes.threads.InboundThreadDetail
import com.telnyx.sdk.models.emailinboxes.threads.ThreadMessage
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmailThreadRetrieveResponseTest {

    @Test
    fun create() {
        val emailThreadRetrieveResponse =
            EmailThreadRetrieveResponse.builder()
                .data(
                    InboundThreadDetail.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .inboxId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .addLabel("string")
                        .lastMessageAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .lastMessageId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .messageCount(1L)
                        .preview("preview")
                        .recordType(InboundThread.RecordType.EMAIL_THREAD)
                        .subject("subject")
                        .unreadCount(0L)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .addMessage(
                            ThreadMessage.builder()
                                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .addAttachment(
                                    ThreadMessage.Attachment.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                                        .build()
                                )
                                .addBcc(
                                    InboundEmailAddress.builder()
                                        .email("dev@stainless.com")
                                        .name("name")
                                        .build()
                                )
                                .addCc(
                                    InboundEmailAddress.builder()
                                        .email("dev@stainless.com")
                                        .name("name")
                                        .build()
                                )
                                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .direction(ThreadMessage.Direction.INBOUND)
                                .from(
                                    InboundEmailAddress.builder()
                                        .email("dev@stainless.com")
                                        .name("name")
                                        .build()
                                )
                                .hasQuotedText(true)
                                .headers(
                                    ThreadMessage.Headers.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                                        .build()
                                )
                                .htmlBodyUrl("https://example.com")
                                .inReplyTo("in_reply_to")
                                .inboxId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .addInlineFile(
                                    ThreadMessage.InlineFile.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                                        .build()
                                )
                                .addLabel("string")
                                .messageId("message_id")
                                .readAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .receivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .recordType(ThreadMessage.RecordType.EMAIL_MESSAGE)
                                .addReference("string")
                                .replyText("reply_text")
                                .addReplyTo(
                                    InboundEmailAddress.builder()
                                        .email("dev@stainless.com")
                                        .name("name")
                                        .build()
                                )
                                .sentAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .status("status")
                                .subject("subject")
                                .textBodyUrl("https://example.com")
                                .threadId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .addTo(
                                    InboundEmailAddress.builder()
                                        .email("dev@stainless.com")
                                        .name("name")
                                        .build()
                                )
                                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .build()
                        )
                        .build()
                )
                .meta(EmailPaginationMeta.builder().pageSize(1L).pageCursor("page_cursor").build())
                .build()

        assertThat(emailThreadRetrieveResponse.data())
            .isEqualTo(
                InboundThreadDetail.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .inboxId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addLabel("string")
                    .lastMessageAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .lastMessageId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .messageCount(1L)
                    .preview("preview")
                    .recordType(InboundThread.RecordType.EMAIL_THREAD)
                    .subject("subject")
                    .unreadCount(0L)
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .addMessage(
                        ThreadMessage.builder()
                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .addAttachment(
                                ThreadMessage.Attachment.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .addBcc(
                                InboundEmailAddress.builder()
                                    .email("dev@stainless.com")
                                    .name("name")
                                    .build()
                            )
                            .addCc(
                                InboundEmailAddress.builder()
                                    .email("dev@stainless.com")
                                    .name("name")
                                    .build()
                            )
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .direction(ThreadMessage.Direction.INBOUND)
                            .from(
                                InboundEmailAddress.builder()
                                    .email("dev@stainless.com")
                                    .name("name")
                                    .build()
                            )
                            .hasQuotedText(true)
                            .headers(
                                ThreadMessage.Headers.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .htmlBodyUrl("https://example.com")
                            .inReplyTo("in_reply_to")
                            .inboxId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .addInlineFile(
                                ThreadMessage.InlineFile.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .addLabel("string")
                            .messageId("message_id")
                            .readAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .receivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .recordType(ThreadMessage.RecordType.EMAIL_MESSAGE)
                            .addReference("string")
                            .replyText("reply_text")
                            .addReplyTo(
                                InboundEmailAddress.builder()
                                    .email("dev@stainless.com")
                                    .name("name")
                                    .build()
                            )
                            .sentAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .status("status")
                            .subject("subject")
                            .textBodyUrl("https://example.com")
                            .threadId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .addTo(
                                InboundEmailAddress.builder()
                                    .email("dev@stainless.com")
                                    .name("name")
                                    .build()
                            )
                            .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .build()
            )
        assertThat(emailThreadRetrieveResponse.meta())
            .isEqualTo(EmailPaginationMeta.builder().pageSize(1L).pageCursor("page_cursor").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val emailThreadRetrieveResponse =
            EmailThreadRetrieveResponse.builder()
                .data(
                    InboundThreadDetail.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .inboxId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .addLabel("string")
                        .lastMessageAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .lastMessageId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .messageCount(1L)
                        .preview("preview")
                        .recordType(InboundThread.RecordType.EMAIL_THREAD)
                        .subject("subject")
                        .unreadCount(0L)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .addMessage(
                            ThreadMessage.builder()
                                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .addAttachment(
                                    ThreadMessage.Attachment.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                                        .build()
                                )
                                .addBcc(
                                    InboundEmailAddress.builder()
                                        .email("dev@stainless.com")
                                        .name("name")
                                        .build()
                                )
                                .addCc(
                                    InboundEmailAddress.builder()
                                        .email("dev@stainless.com")
                                        .name("name")
                                        .build()
                                )
                                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .direction(ThreadMessage.Direction.INBOUND)
                                .from(
                                    InboundEmailAddress.builder()
                                        .email("dev@stainless.com")
                                        .name("name")
                                        .build()
                                )
                                .hasQuotedText(true)
                                .headers(
                                    ThreadMessage.Headers.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                                        .build()
                                )
                                .htmlBodyUrl("https://example.com")
                                .inReplyTo("in_reply_to")
                                .inboxId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .addInlineFile(
                                    ThreadMessage.InlineFile.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                                        .build()
                                )
                                .addLabel("string")
                                .messageId("message_id")
                                .readAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .receivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .recordType(ThreadMessage.RecordType.EMAIL_MESSAGE)
                                .addReference("string")
                                .replyText("reply_text")
                                .addReplyTo(
                                    InboundEmailAddress.builder()
                                        .email("dev@stainless.com")
                                        .name("name")
                                        .build()
                                )
                                .sentAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .status("status")
                                .subject("subject")
                                .textBodyUrl("https://example.com")
                                .threadId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .addTo(
                                    InboundEmailAddress.builder()
                                        .email("dev@stainless.com")
                                        .name("name")
                                        .build()
                                )
                                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .build()
                        )
                        .build()
                )
                .meta(EmailPaginationMeta.builder().pageSize(1L).pageCursor("page_cursor").build())
                .build()

        val roundtrippedEmailThreadRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(emailThreadRetrieveResponse),
                jacksonTypeRef<EmailThreadRetrieveResponse>(),
            )

        assertThat(roundtrippedEmailThreadRetrieveResponse).isEqualTo(emailThreadRetrieveResponse)
    }
}
