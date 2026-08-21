// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailevents

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.emailinboxes.drafts.EmailAddress
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmailEventListPageResponseTest {

    @Test
    fun create() {
        val emailEventListPageResponse =
            EmailEventListPageResponse.builder()
                .addData(
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
                )
                .meta(
                    EmailEventListPageResponse.Meta.builder()
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

        assertThat(emailEventListPageResponse.data())
            .containsExactly(
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
            )
        assertThat(emailEventListPageResponse.meta())
            .isEqualTo(
                EmailEventListPageResponse.Meta.builder()
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
        val emailEventListPageResponse =
            EmailEventListPageResponse.builder()
                .addData(
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
                )
                .meta(
                    EmailEventListPageResponse.Meta.builder()
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

        val roundtrippedEmailEventListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(emailEventListPageResponse),
                jacksonTypeRef<EmailEventListPageResponse>(),
            )

        assertThat(roundtrippedEmailEventListPageResponse).isEqualTo(emailEventListPageResponse)
    }
}
