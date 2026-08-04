// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailinboxes.drafts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmailDraftTest {

    @Test
    fun create() {
        val emailDraft =
            EmailDraft.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .inboxId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .recordType(EmailDraft.RecordType.EMAIL_DRAFT)
                .status(EmailDraft.Status.DRAFT)
                .addAttachment(JsonValue.from(mapOf<String, Any>()))
                .addBcc(EmailAddress.builder().email("email").name("name").build())
                .addCc(EmailAddress.builder().email("email").name("name").build())
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .from("from")
                .fromName("from_name")
                .headers(
                    EmailDraft.Headers.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .htmlBody("html_body")
                .addLabel("string")
                .metadata(JsonValue.from(mapOf<String, Any>()))
                .replyTo("reply_to")
                .replyToMessageId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .sentAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .sentMessageId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .subject("subject")
                .addTag("string")
                .textBody("text_body")
                .threadId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addTo(EmailAddress.builder().email("email").name("name").build())
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(emailDraft.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(emailDraft.inboxId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(emailDraft.recordType()).isEqualTo(EmailDraft.RecordType.EMAIL_DRAFT)
        assertThat(emailDraft.status()).isEqualTo(EmailDraft.Status.DRAFT)
        assertThat(emailDraft.attachments().getOrNull())
            .containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(emailDraft.bcc().getOrNull())
            .containsExactly(EmailAddress.builder().email("email").name("name").build())
        assertThat(emailDraft.cc().getOrNull())
            .containsExactly(EmailAddress.builder().email("email").name("name").build())
        assertThat(emailDraft.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(emailDraft.from()).contains("from")
        assertThat(emailDraft.fromName()).contains("from_name")
        assertThat(emailDraft.headers())
            .contains(
                EmailDraft.Headers.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(emailDraft.htmlBody()).contains("html_body")
        assertThat(emailDraft.labels().getOrNull()).containsExactly("string")
        assertThat(emailDraft._metadata()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(emailDraft.replyTo()).contains("reply_to")
        assertThat(emailDraft.replyToMessageId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(emailDraft.sentAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(emailDraft.sentMessageId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(emailDraft.subject()).contains("subject")
        assertThat(emailDraft.tags().getOrNull()).containsExactly("string")
        assertThat(emailDraft.textBody()).contains("text_body")
        assertThat(emailDraft.threadId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(emailDraft.to().getOrNull())
            .containsExactly(EmailAddress.builder().email("email").name("name").build())
        assertThat(emailDraft.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val emailDraft =
            EmailDraft.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .inboxId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .recordType(EmailDraft.RecordType.EMAIL_DRAFT)
                .status(EmailDraft.Status.DRAFT)
                .addAttachment(JsonValue.from(mapOf<String, Any>()))
                .addBcc(EmailAddress.builder().email("email").name("name").build())
                .addCc(EmailAddress.builder().email("email").name("name").build())
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .from("from")
                .fromName("from_name")
                .headers(
                    EmailDraft.Headers.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .htmlBody("html_body")
                .addLabel("string")
                .metadata(JsonValue.from(mapOf<String, Any>()))
                .replyTo("reply_to")
                .replyToMessageId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .sentAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .sentMessageId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .subject("subject")
                .addTag("string")
                .textBody("text_body")
                .threadId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addTo(EmailAddress.builder().email("email").name("name").build())
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedEmailDraft =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(emailDraft),
                jacksonTypeRef<EmailDraft>(),
            )

        assertThat(roundtrippedEmailDraft).isEqualTo(emailDraft)
    }
}
