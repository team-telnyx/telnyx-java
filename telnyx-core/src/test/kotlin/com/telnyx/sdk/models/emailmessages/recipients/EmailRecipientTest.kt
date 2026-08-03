// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailmessages.recipients

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmailRecipientTest {

    @Test
    fun create() {
        val emailRecipient =
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

        assertThat(emailRecipient.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(emailRecipient.address()).contains("dev@stainless.com")
        assertThat(emailRecipient.billable()).isEqualTo(true)
        assertThat(emailRecipient.kind()).isEqualTo(EmailRecipient.Kind.TO)
        assertThat(emailRecipient.messageId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(emailRecipient.recordType()).isEqualTo(EmailRecipient.RecordType.EMAIL_RECIPIENT)
        assertThat(emailRecipient.status()).isEqualTo(EmailRecipient.Status.QUEUED)
        assertThat(emailRecipient.deliveredAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(emailRecipient.failedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(emailRecipient.sentAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(emailRecipient.smtpCode()).contains(0L)
        assertThat(emailRecipient.smtpResponse()).contains("smtp_response")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val emailRecipient =
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

        val roundtrippedEmailRecipient =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(emailRecipient),
                jacksonTypeRef<EmailRecipient>(),
            )

        assertThat(roundtrippedEmailRecipient).isEqualTo(emailRecipient)
    }
}
