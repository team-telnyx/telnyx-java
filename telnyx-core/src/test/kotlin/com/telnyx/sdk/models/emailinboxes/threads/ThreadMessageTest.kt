// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailinboxes.threads

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ThreadMessageTest {

    @Test
    fun create() {
        val threadMessage =
            ThreadMessage.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addAttachment(
                    ThreadMessage.Attachment.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .addBcc(
                    InboundEmailAddress.builder().email("dev@stainless.com").name("name").build()
                )
                .addCc(
                    InboundEmailAddress.builder().email("dev@stainless.com").name("name").build()
                )
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .direction(ThreadMessage.Direction.INBOUND)
                .from(InboundEmailAddress.builder().email("dev@stainless.com").name("name").build())
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
                    InboundEmailAddress.builder().email("dev@stainless.com").name("name").build()
                )
                .sentAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status("status")
                .subject("subject")
                .textBodyUrl("https://example.com")
                .threadId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addTo(
                    InboundEmailAddress.builder().email("dev@stainless.com").name("name").build()
                )
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(threadMessage.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(threadMessage.attachments())
            .containsExactly(
                ThreadMessage.Attachment.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(threadMessage.bcc())
            .containsExactly(
                InboundEmailAddress.builder().email("dev@stainless.com").name("name").build()
            )
        assertThat(threadMessage.cc())
            .containsExactly(
                InboundEmailAddress.builder().email("dev@stainless.com").name("name").build()
            )
        assertThat(threadMessage.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(threadMessage.direction()).isEqualTo(ThreadMessage.Direction.INBOUND)
        assertThat(threadMessage.from())
            .isEqualTo(
                InboundEmailAddress.builder().email("dev@stainless.com").name("name").build()
            )
        assertThat(threadMessage.hasQuotedText()).isEqualTo(true)
        assertThat(threadMessage.headers())
            .isEqualTo(
                ThreadMessage.Headers.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(threadMessage.htmlBodyUrl()).contains("https://example.com")
        assertThat(threadMessage.inReplyTo()).contains("in_reply_to")
        assertThat(threadMessage.inboxId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(threadMessage.inlineFiles())
            .containsExactly(
                ThreadMessage.InlineFile.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(threadMessage.labels()).containsExactly("string")
        assertThat(threadMessage.messageId()).contains("message_id")
        assertThat(threadMessage.readAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(threadMessage.receivedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(threadMessage.recordType()).isEqualTo(ThreadMessage.RecordType.EMAIL_MESSAGE)
        assertThat(threadMessage.references()).containsExactly("string")
        assertThat(threadMessage.replyText()).contains("reply_text")
        assertThat(threadMessage.replyTo())
            .containsExactly(
                InboundEmailAddress.builder().email("dev@stainless.com").name("name").build()
            )
        assertThat(threadMessage.sentAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(threadMessage.status()).isEqualTo("status")
        assertThat(threadMessage.subject()).contains("subject")
        assertThat(threadMessage.textBodyUrl()).contains("https://example.com")
        assertThat(threadMessage.threadId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(threadMessage.to())
            .containsExactly(
                InboundEmailAddress.builder().email("dev@stainless.com").name("name").build()
            )
        assertThat(threadMessage.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val threadMessage =
            ThreadMessage.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addAttachment(
                    ThreadMessage.Attachment.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .addBcc(
                    InboundEmailAddress.builder().email("dev@stainless.com").name("name").build()
                )
                .addCc(
                    InboundEmailAddress.builder().email("dev@stainless.com").name("name").build()
                )
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .direction(ThreadMessage.Direction.INBOUND)
                .from(InboundEmailAddress.builder().email("dev@stainless.com").name("name").build())
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
                    InboundEmailAddress.builder().email("dev@stainless.com").name("name").build()
                )
                .sentAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status("status")
                .subject("subject")
                .textBodyUrl("https://example.com")
                .threadId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addTo(
                    InboundEmailAddress.builder().email("dev@stainless.com").name("name").build()
                )
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedThreadMessage =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(threadMessage),
                jacksonTypeRef<ThreadMessage>(),
            )

        assertThat(roundtrippedThreadMessage).isEqualTo(threadMessage)
    }
}
