// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailinboxes.drafts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.emailevents.EmailEventType
import com.telnyx.sdk.models.emailmessages.MessageEvent
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmailMessageTest {

    @Test
    fun create() {
        val emailMessage =
            EmailMessage.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addAttachment(
                    EmailMessage.Attachment.builder()
                        .contentId("content_id")
                        .contentType("content_type")
                        .disposition("disposition")
                        .filename("filename")
                        .sha256("sha256")
                        .sizeBytes(0L)
                        .url("https://example.com")
                        .build()
                )
                .addBcc(EmailAddress.builder().email("email").name("name").build())
                .addCc(EmailAddress.builder().email("email").name("name").build())
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addEvent(
                    MessageEvent.builder()
                        .occurredAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .type(EmailEventType.QUEUED)
                        .payload(
                            MessageEvent.Payload.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .build()
                )
                .from(EmailAddress.builder().email("email").name("name").build())
                .recordType(EmailMessage.RecordType.EMAIL_MESSAGE)
                .replyTo("reply_to")
                .status(EmailMessage.Status.QUEUED)
                .subject("subject")
                .templateId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .templateVariables(
                    EmailMessage.TemplateVariables.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .addTo(EmailAddress.builder().email("email").name("name").build())
                .inlineCss(true)
                .recipientStatuses(
                    EmailMessage.RecipientStatuses.builder()
                        .putAdditionalProperty("delivered", JsonValue.from(998))
                        .putAdditionalProperty("bounced", JsonValue.from(2))
                        .build()
                )
                .sandbox(true)
                .scheduledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(emailMessage.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(emailMessage.attachments())
            .containsExactly(
                EmailMessage.Attachment.builder()
                    .contentId("content_id")
                    .contentType("content_type")
                    .disposition("disposition")
                    .filename("filename")
                    .sha256("sha256")
                    .sizeBytes(0L)
                    .url("https://example.com")
                    .build()
            )
        assertThat(emailMessage.bcc())
            .containsExactly(EmailAddress.builder().email("email").name("name").build())
        assertThat(emailMessage.cc())
            .containsExactly(EmailAddress.builder().email("email").name("name").build())
        assertThat(emailMessage.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(emailMessage.events())
            .containsExactly(
                MessageEvent.builder()
                    .occurredAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .type(EmailEventType.QUEUED)
                    .payload(
                        MessageEvent.Payload.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .build()
            )
        assertThat(emailMessage.from())
            .isEqualTo(EmailAddress.builder().email("email").name("name").build())
        assertThat(emailMessage.recordType()).isEqualTo(EmailMessage.RecordType.EMAIL_MESSAGE)
        assertThat(emailMessage.replyTo()).contains("reply_to")
        assertThat(emailMessage.status()).isEqualTo(EmailMessage.Status.QUEUED)
        assertThat(emailMessage.subject()).isEqualTo("subject")
        assertThat(emailMessage.templateId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(emailMessage.templateVariables())
            .isEqualTo(
                EmailMessage.TemplateVariables.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(emailMessage.to())
            .containsExactly(EmailAddress.builder().email("email").name("name").build())
        assertThat(emailMessage.inlineCss()).contains(true)
        assertThat(emailMessage.recipientStatuses())
            .contains(
                EmailMessage.RecipientStatuses.builder()
                    .putAdditionalProperty("delivered", JsonValue.from(998))
                    .putAdditionalProperty("bounced", JsonValue.from(2))
                    .build()
            )
        assertThat(emailMessage.sandbox()).contains(true)
        assertThat(emailMessage.scheduledAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val emailMessage =
            EmailMessage.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addAttachment(
                    EmailMessage.Attachment.builder()
                        .contentId("content_id")
                        .contentType("content_type")
                        .disposition("disposition")
                        .filename("filename")
                        .sha256("sha256")
                        .sizeBytes(0L)
                        .url("https://example.com")
                        .build()
                )
                .addBcc(EmailAddress.builder().email("email").name("name").build())
                .addCc(EmailAddress.builder().email("email").name("name").build())
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addEvent(
                    MessageEvent.builder()
                        .occurredAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .type(EmailEventType.QUEUED)
                        .payload(
                            MessageEvent.Payload.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .build()
                )
                .from(EmailAddress.builder().email("email").name("name").build())
                .recordType(EmailMessage.RecordType.EMAIL_MESSAGE)
                .replyTo("reply_to")
                .status(EmailMessage.Status.QUEUED)
                .subject("subject")
                .templateId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .templateVariables(
                    EmailMessage.TemplateVariables.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .addTo(EmailAddress.builder().email("email").name("name").build())
                .inlineCss(true)
                .recipientStatuses(
                    EmailMessage.RecipientStatuses.builder()
                        .putAdditionalProperty("delivered", JsonValue.from(998))
                        .putAdditionalProperty("bounced", JsonValue.from(2))
                        .build()
                )
                .sandbox(true)
                .scheduledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedEmailMessage =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(emailMessage),
                jacksonTypeRef<EmailMessage>(),
            )

        assertThat(roundtrippedEmailMessage).isEqualTo(emailMessage)
    }
}
