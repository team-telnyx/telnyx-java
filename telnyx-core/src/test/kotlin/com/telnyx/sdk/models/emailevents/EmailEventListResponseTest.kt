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
                .addData(
                    EmailEventListResponse.Data.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .emailId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .occurredAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .recordType(EmailEventListResponse.Data.RecordType.EMAIL_EVENT)
                        .type(EmailEventType.QUEUED)
                        .email(
                            EmailEventListResponse.Data.Email.builder()
                                .addCc(EmailAddress.builder().email("email").name("name").build())
                                .from(EmailAddress.builder().email("email").name("name").build())
                                .subject("subject")
                                .addTo(EmailAddress.builder().email("email").name("name").build())
                                .build()
                        )
                        .payload(
                            EmailEventListResponse.Data.Payload.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .build()
                )
                .meta(
                    EmailEventListResponse.Meta.builder()
                        .pageSize(1L)
                        .timeRange(
                            TimeRange.builder()
                                .from(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .to(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .build()
                        )
                        .pageCursor("page_cursor")
                        .build()
                )
                .build()

        assertThat(emailEventListResponse.data())
            .containsExactly(
                EmailEventListResponse.Data.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .emailId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .occurredAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .recordType(EmailEventListResponse.Data.RecordType.EMAIL_EVENT)
                    .type(EmailEventType.QUEUED)
                    .email(
                        EmailEventListResponse.Data.Email.builder()
                            .addCc(EmailAddress.builder().email("email").name("name").build())
                            .from(EmailAddress.builder().email("email").name("name").build())
                            .subject("subject")
                            .addTo(EmailAddress.builder().email("email").name("name").build())
                            .build()
                    )
                    .payload(
                        EmailEventListResponse.Data.Payload.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .build()
            )
        assertThat(emailEventListResponse.meta())
            .isEqualTo(
                EmailEventListResponse.Meta.builder()
                    .pageSize(1L)
                    .timeRange(
                        TimeRange.builder()
                            .from(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .to(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .pageCursor("page_cursor")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val emailEventListResponse =
            EmailEventListResponse.builder()
                .addData(
                    EmailEventListResponse.Data.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .emailId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .occurredAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .recordType(EmailEventListResponse.Data.RecordType.EMAIL_EVENT)
                        .type(EmailEventType.QUEUED)
                        .email(
                            EmailEventListResponse.Data.Email.builder()
                                .addCc(EmailAddress.builder().email("email").name("name").build())
                                .from(EmailAddress.builder().email("email").name("name").build())
                                .subject("subject")
                                .addTo(EmailAddress.builder().email("email").name("name").build())
                                .build()
                        )
                        .payload(
                            EmailEventListResponse.Data.Payload.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .build()
                )
                .meta(
                    EmailEventListResponse.Meta.builder()
                        .pageSize(1L)
                        .timeRange(
                            TimeRange.builder()
                                .from(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .to(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .build()
                        )
                        .pageCursor("page_cursor")
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
