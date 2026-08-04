// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.emailinboxes.threads.InboundEmailAddress
import com.telnyx.sdk.models.emailinboxes.threads.ThreadMessage
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InboundMessageTest {

    @Test
    fun create() {
        val inboundMessage =
            InboundMessage.builder()
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
                .status("received")
                .subject("subject")
                .textBodyUrl("https://example.com")
                .threadId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addTo(
                    InboundEmailAddress.builder().email("dev@stainless.com").name("name").build()
                )
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(inboundMessage.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(inboundMessage.attachments())
            .containsExactly(
                ThreadMessage.Attachment.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(inboundMessage.bcc())
            .containsExactly(
                InboundEmailAddress.builder().email("dev@stainless.com").name("name").build()
            )
        assertThat(inboundMessage.cc())
            .containsExactly(
                InboundEmailAddress.builder().email("dev@stainless.com").name("name").build()
            )
        assertThat(inboundMessage.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(inboundMessage.direction()).isEqualTo(ThreadMessage.Direction.INBOUND)
        assertThat(inboundMessage.from())
            .isEqualTo(
                InboundEmailAddress.builder().email("dev@stainless.com").name("name").build()
            )
        assertThat(inboundMessage.hasQuotedText()).isEqualTo(true)
        assertThat(inboundMessage.headers())
            .isEqualTo(
                ThreadMessage.Headers.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(inboundMessage.htmlBodyUrl()).contains("https://example.com")
        assertThat(inboundMessage.inReplyTo()).contains("in_reply_to")
        assertThat(inboundMessage.inboxId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(inboundMessage.inlineFiles())
            .containsExactly(
                ThreadMessage.InlineFile.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(inboundMessage.labels()).containsExactly("string")
        assertThat(inboundMessage.messageId()).contains("message_id")
        assertThat(inboundMessage.readAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(inboundMessage.receivedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(inboundMessage.recordType()).isEqualTo(ThreadMessage.RecordType.EMAIL_MESSAGE)
        assertThat(inboundMessage.references()).containsExactly("string")
        assertThat(inboundMessage.replyText()).contains("reply_text")
        assertThat(inboundMessage.replyTo())
            .containsExactly(
                InboundEmailAddress.builder().email("dev@stainless.com").name("name").build()
            )
        assertThat(inboundMessage.sentAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(inboundMessage.status()).isEqualTo("received")
        assertThat(inboundMessage.subject()).contains("subject")
        assertThat(inboundMessage.textBodyUrl()).contains("https://example.com")
        assertThat(inboundMessage.threadId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(inboundMessage.to())
            .containsExactly(
                InboundEmailAddress.builder().email("dev@stainless.com").name("name").build()
            )
        assertThat(inboundMessage.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val inboundMessage =
            InboundMessage.builder()
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
                .status("received")
                .subject("subject")
                .textBodyUrl("https://example.com")
                .threadId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addTo(
                    InboundEmailAddress.builder().email("dev@stainless.com").name("name").build()
                )
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedInboundMessage =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(inboundMessage),
                jacksonTypeRef<InboundMessage>(),
            )

        assertThat(roundtrippedInboundMessage).isEqualTo(inboundMessage)
    }
}
