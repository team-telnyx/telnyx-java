// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailinboxes.messages.labels

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.emailinboxes.threads.InboundEmailAddress
import com.telnyx.sdk.models.emailinboxes.threads.ThreadMessage
import com.telnyx.sdk.models.webhooks.InboundMessage
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LabelCreateResponseTest {

    @Test
    fun create() {
        val labelCreateResponse =
            LabelCreateResponse.builder()
                .data(
                    InboundMessage.builder()
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
                        .status("received")
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

        assertThat(labelCreateResponse.data())
            .isEqualTo(
                InboundMessage.builder()
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
                    .status("received")
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
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val labelCreateResponse =
            LabelCreateResponse.builder()
                .data(
                    InboundMessage.builder()
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
                        .status("received")
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

        val roundtrippedLabelCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(labelCreateResponse),
                jacksonTypeRef<LabelCreateResponse>(),
            )

        assertThat(roundtrippedLabelCreateResponse).isEqualTo(labelCreateResponse)
    }
}
