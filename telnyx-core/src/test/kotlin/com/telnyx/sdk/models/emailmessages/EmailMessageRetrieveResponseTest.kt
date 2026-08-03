// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailmessages

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.emailevents.EmailEventType
import com.telnyx.sdk.models.emailinboxes.drafts.EmailAddress
import com.telnyx.sdk.models.emailinboxes.drafts.EmailMessage
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmailMessageRetrieveResponseTest {

    @Test
    fun create() {
        val emailMessageRetrieveResponse =
            EmailMessageRetrieveResponse.builder()
                .data(
                    EmailMessageRetrieveResponse.Data.builder()
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
                        .htmlBody("html_body")
                        .textBody("text_body")
                        .build()
                )
                .build()

        assertThat(emailMessageRetrieveResponse.data())
            .isEqualTo(
                EmailMessageRetrieveResponse.Data.builder()
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
                    .htmlBody("html_body")
                    .textBody("text_body")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val emailMessageRetrieveResponse =
            EmailMessageRetrieveResponse.builder()
                .data(
                    EmailMessageRetrieveResponse.Data.builder()
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
                        .htmlBody("html_body")
                        .textBody("text_body")
                        .build()
                )
                .build()

        val roundtrippedEmailMessageRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(emailMessageRetrieveResponse),
                jacksonTypeRef<EmailMessageRetrieveResponse>(),
            )

        assertThat(roundtrippedEmailMessageRetrieveResponse).isEqualTo(emailMessageRetrieveResponse)
    }
}
