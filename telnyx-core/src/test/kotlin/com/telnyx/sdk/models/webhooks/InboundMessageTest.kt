// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
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
                    InboundMessage.Attachment.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .addBcc(
                    InboundMessage.Bcc.builder().email("dev@stainless.com").name("name").build()
                )
                .addCc(InboundMessage.Cc.builder().email("dev@stainless.com").name("name").build())
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .direction(InboundMessage.Direction.INBOUND)
                .from(InboundMessage.From.builder().email("dev@stainless.com").name("name").build())
                .hasQuotedText(true)
                .headers(
                    InboundMessage.Headers.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .htmlBodyUrl("https://example.com")
                .inReplyTo("in_reply_to")
                .inboxId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addInlineFile(
                    InboundMessage.InlineFile.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .messageId("message_id")
                .readAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .receivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .recordType(InboundMessage.RecordType.EMAIL_MESSAGE)
                .addReference("string")
                .replyText("reply_text")
                .addReplyTo(
                    InboundMessage.ReplyTo.builder().email("dev@stainless.com").name("name").build()
                )
                .status(InboundMessage.Status.RECEIVED)
                .subject("subject")
                .textBodyUrl("https://example.com")
                .threadId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addTo(InboundMessage.To.builder().email("dev@stainless.com").name("name").build())
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(inboundMessage.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(inboundMessage.attachments())
            .containsExactly(
                InboundMessage.Attachment.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(inboundMessage.bcc())
            .containsExactly(
                InboundMessage.Bcc.builder().email("dev@stainless.com").name("name").build()
            )
        assertThat(inboundMessage.cc())
            .containsExactly(
                InboundMessage.Cc.builder().email("dev@stainless.com").name("name").build()
            )
        assertThat(inboundMessage.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(inboundMessage.direction()).isEqualTo(InboundMessage.Direction.INBOUND)
        assertThat(inboundMessage.from())
            .isEqualTo(
                InboundMessage.From.builder().email("dev@stainless.com").name("name").build()
            )
        assertThat(inboundMessage.hasQuotedText()).isEqualTo(true)
        assertThat(inboundMessage.headers())
            .isEqualTo(
                InboundMessage.Headers.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(inboundMessage.htmlBodyUrl()).contains("https://example.com")
        assertThat(inboundMessage.inReplyTo()).contains("in_reply_to")
        assertThat(inboundMessage.inboxId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(inboundMessage.inlineFiles())
            .containsExactly(
                InboundMessage.InlineFile.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(inboundMessage.messageId()).isEqualTo("message_id")
        assertThat(inboundMessage.readAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(inboundMessage.receivedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(inboundMessage.recordType()).isEqualTo(InboundMessage.RecordType.EMAIL_MESSAGE)
        assertThat(inboundMessage.references()).containsExactly("string")
        assertThat(inboundMessage.replyText()).contains("reply_text")
        assertThat(inboundMessage.replyTo())
            .containsExactly(
                InboundMessage.ReplyTo.builder().email("dev@stainless.com").name("name").build()
            )
        assertThat(inboundMessage.status()).isEqualTo(InboundMessage.Status.RECEIVED)
        assertThat(inboundMessage.subject()).contains("subject")
        assertThat(inboundMessage.textBodyUrl()).contains("https://example.com")
        assertThat(inboundMessage.threadId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(inboundMessage.to())
            .containsExactly(
                InboundMessage.To.builder().email("dev@stainless.com").name("name").build()
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
                    InboundMessage.Attachment.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .addBcc(
                    InboundMessage.Bcc.builder().email("dev@stainless.com").name("name").build()
                )
                .addCc(InboundMessage.Cc.builder().email("dev@stainless.com").name("name").build())
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .direction(InboundMessage.Direction.INBOUND)
                .from(InboundMessage.From.builder().email("dev@stainless.com").name("name").build())
                .hasQuotedText(true)
                .headers(
                    InboundMessage.Headers.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .htmlBodyUrl("https://example.com")
                .inReplyTo("in_reply_to")
                .inboxId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addInlineFile(
                    InboundMessage.InlineFile.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .messageId("message_id")
                .readAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .receivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .recordType(InboundMessage.RecordType.EMAIL_MESSAGE)
                .addReference("string")
                .replyText("reply_text")
                .addReplyTo(
                    InboundMessage.ReplyTo.builder().email("dev@stainless.com").name("name").build()
                )
                .status(InboundMessage.Status.RECEIVED)
                .subject("subject")
                .textBodyUrl("https://example.com")
                .threadId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addTo(InboundMessage.To.builder().email("dev@stainless.com").name("name").build())
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
