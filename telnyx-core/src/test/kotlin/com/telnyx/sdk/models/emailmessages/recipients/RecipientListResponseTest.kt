// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailmessages.recipients

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RecipientListResponseTest {

    @Test
    fun create() {
        val recipientListResponse =
            RecipientListResponse.builder()
                .addData(
                    EmailRecipient.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .address("dev@stainless.com")
                        .billable(true)
                        .kind(EmailRecipient.Kind.TO)
                        .messageId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .recordType(EmailRecipient.RecordType.EMAIL_RECIPIENT)
                        .status(EmailRecipient.Status.QUEUED)
                        .deliveredAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .failedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .sentAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .smtpCode(0L)
                        .smtpResponse("smtp_response")
                        .build()
                )
                .meta(
                    RecipientListResponse.Meta.builder()
                        .pageSize(1L)
                        .pageCursor("page_cursor")
                        .build()
                )
                .build()

        assertThat(recipientListResponse.data())
            .containsExactly(
                EmailRecipient.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .address("dev@stainless.com")
                    .billable(true)
                    .kind(EmailRecipient.Kind.TO)
                    .messageId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .recordType(EmailRecipient.RecordType.EMAIL_RECIPIENT)
                    .status(EmailRecipient.Status.QUEUED)
                    .deliveredAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .failedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .sentAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .smtpCode(0L)
                    .smtpResponse("smtp_response")
                    .build()
            )
        assertThat(recipientListResponse.meta())
            .isEqualTo(
                RecipientListResponse.Meta.builder().pageSize(1L).pageCursor("page_cursor").build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val recipientListResponse =
            RecipientListResponse.builder()
                .addData(
                    EmailRecipient.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .address("dev@stainless.com")
                        .billable(true)
                        .kind(EmailRecipient.Kind.TO)
                        .messageId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .recordType(EmailRecipient.RecordType.EMAIL_RECIPIENT)
                        .status(EmailRecipient.Status.QUEUED)
                        .deliveredAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .failedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .sentAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .smtpCode(0L)
                        .smtpResponse("smtp_response")
                        .build()
                )
                .meta(
                    RecipientListResponse.Meta.builder()
                        .pageSize(1L)
                        .pageCursor("page_cursor")
                        .build()
                )
                .build()

        val roundtrippedRecipientListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(recipientListResponse),
                jacksonTypeRef<RecipientListResponse>(),
            )

        assertThat(roundtrippedRecipientListResponse).isEqualTo(recipientListResponse)
    }
}
