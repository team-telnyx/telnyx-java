// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailevents

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.emailinboxes.drafts.EmailAddress
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmailEventListResponseTest {

    @Test
    fun create() {
        val emailEventListResponse =
            EmailEventListResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .emailId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .occurredAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .recordType(EmailEventListResponse.RecordType.EMAIL_EVENT)
                .type(EmailEventType.QUEUED)
                .email(
                    EmailEventListResponse.Email.builder()
                        .addCc(EmailAddress.builder().email("email").name("name").build())
                        .from(EmailAddress.builder().email("email").name("name").build())
                        .subject("subject")
                        .addTo(EmailAddress.builder().email("email").name("name").build())
                        .build()
                )
                .payload(
                    EmailEventListResponse.Payload.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .build()

        assertThat(emailEventListResponse.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(emailEventListResponse.emailId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(emailEventListResponse.occurredAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(emailEventListResponse.recordType())
            .isEqualTo(EmailEventListResponse.RecordType.EMAIL_EVENT)
        assertThat(emailEventListResponse.type()).isEqualTo(EmailEventType.QUEUED)
        assertThat(emailEventListResponse.email())
            .contains(
                EmailEventListResponse.Email.builder()
                    .addCc(EmailAddress.builder().email("email").name("name").build())
                    .from(EmailAddress.builder().email("email").name("name").build())
                    .subject("subject")
                    .addTo(EmailAddress.builder().email("email").name("name").build())
                    .build()
            )
        assertThat(emailEventListResponse.payload())
            .contains(
                EmailEventListResponse.Payload.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val emailEventListResponse =
            EmailEventListResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .emailId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .occurredAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .recordType(EmailEventListResponse.RecordType.EMAIL_EVENT)
                .type(EmailEventType.QUEUED)
                .email(
                    EmailEventListResponse.Email.builder()
                        .addCc(EmailAddress.builder().email("email").name("name").build())
                        .from(EmailAddress.builder().email("email").name("name").build())
                        .subject("subject")
                        .addTo(EmailAddress.builder().email("email").name("name").build())
                        .build()
                )
                .payload(
                    EmailEventListResponse.Payload.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .build()

        val roundtrippedEmailEventListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(emailEventListResponse),
                jacksonTypeRef<EmailEventListResponse>(),
            )

        assertThat(roundtrippedEmailEventListResponse).isEqualTo(emailEventListResponse)
    }
}
