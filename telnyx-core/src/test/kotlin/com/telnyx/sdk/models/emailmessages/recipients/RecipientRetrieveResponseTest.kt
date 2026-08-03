// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailmessages.recipients

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RecipientRetrieveResponseTest {

    @Test
    fun create() {
        val recipientRetrieveResponse =
            RecipientRetrieveResponse.builder()
                .data(
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
                .build()

        assertThat(recipientRetrieveResponse.data())
            .isEqualTo(
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
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val recipientRetrieveResponse =
            RecipientRetrieveResponse.builder()
                .data(
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
                .build()

        val roundtrippedRecipientRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(recipientRetrieveResponse),
                jacksonTypeRef<RecipientRetrieveResponse>(),
            )

        assertThat(roundtrippedRecipientRetrieveResponse).isEqualTo(recipientRetrieveResponse)
    }
}
