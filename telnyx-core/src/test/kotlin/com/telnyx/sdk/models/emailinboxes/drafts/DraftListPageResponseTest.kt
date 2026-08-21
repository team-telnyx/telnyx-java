// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailinboxes.drafts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.emailinboxes.threads.EmailPaginationMeta
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DraftListPageResponseTest {

    @Test
    fun create() {
        val draftListPageResponse =
            DraftListPageResponse.builder()
                .addData(
                    EmailDraft.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .inboxId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .recordType(EmailDraft.RecordType.EMAIL_DRAFT)
                        .status(EmailDraft.Status.DRAFT)
                        .addAttachment(
                            EmailDraft.Attachment.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
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
                        .metadata(
                            EmailDraft.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
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
                )
                .meta(EmailPaginationMeta.builder().pageSize(1L).pageCursor("page_cursor").build())
                .build()

        assertThat(draftListPageResponse.data())
            .containsExactly(
                EmailDraft.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .inboxId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .recordType(EmailDraft.RecordType.EMAIL_DRAFT)
                    .status(EmailDraft.Status.DRAFT)
                    .addAttachment(
                        EmailDraft.Attachment.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
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
                    .metadata(
                        EmailDraft.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
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
            )
        assertThat(draftListPageResponse.meta())
            .isEqualTo(EmailPaginationMeta.builder().pageSize(1L).pageCursor("page_cursor").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val draftListPageResponse =
            DraftListPageResponse.builder()
                .addData(
                    EmailDraft.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .inboxId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .recordType(EmailDraft.RecordType.EMAIL_DRAFT)
                        .status(EmailDraft.Status.DRAFT)
                        .addAttachment(
                            EmailDraft.Attachment.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
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
                        .metadata(
                            EmailDraft.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
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
                )
                .meta(EmailPaginationMeta.builder().pageSize(1L).pageCursor("page_cursor").build())
                .build()

        val roundtrippedDraftListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(draftListPageResponse),
                jacksonTypeRef<DraftListPageResponse>(),
            )

        assertThat(roundtrippedDraftListPageResponse).isEqualTo(draftListPageResponse)
    }
}
