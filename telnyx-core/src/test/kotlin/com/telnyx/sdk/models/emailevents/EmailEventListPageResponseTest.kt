// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailevents

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
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
                        .canonicalEventType("email.delivered")
                        .eventType("email.delivered")
                        .occurredAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .payload(
                            EmailEventListResponse.Payload.builder()
                                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .occurredAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .status(EmailEventListResponse.Payload.Status.QUEUED)
                                .bcc(EmailEventListResponse.Payload.Bcc.UnionMember1.REDACTED)
                                .cc(
                                    EmailWebhookRecipient.builder()
                                        .email("dev@stainless.com")
                                        .kind(EmailWebhookRecipient.Kind.TO)
                                        .name("name")
                                        .build()
                                )
                                .from(
                                    EmailEventListResponse.Payload.From.builder()
                                        .email("dev@stainless.com")
                                        .name("name")
                                        .build()
                                )
                                .recipientId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .subject("subject")
                                .to(
                                    EmailWebhookRecipient.builder()
                                        .email("dev@stainless.com")
                                        .kind(EmailWebhookRecipient.Kind.TO)
                                        .name("name")
                                        .build()
                                )
                                .build()
                        )
                        .recipientId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
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
                    .canonicalEventType("email.delivered")
                    .eventType("email.delivered")
                    .occurredAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .payload(
                        EmailEventListResponse.Payload.builder()
                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .occurredAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .status(EmailEventListResponse.Payload.Status.QUEUED)
                            .bcc(EmailEventListResponse.Payload.Bcc.UnionMember1.REDACTED)
                            .cc(
                                EmailWebhookRecipient.builder()
                                    .email("dev@stainless.com")
                                    .kind(EmailWebhookRecipient.Kind.TO)
                                    .name("name")
                                    .build()
                            )
                            .from(
                                EmailEventListResponse.Payload.From.builder()
                                    .email("dev@stainless.com")
                                    .name("name")
                                    .build()
                            )
                            .recipientId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .subject("subject")
                            .to(
                                EmailWebhookRecipient.builder()
                                    .email("dev@stainless.com")
                                    .kind(EmailWebhookRecipient.Kind.TO)
                                    .name("name")
                                    .build()
                            )
                            .build()
                    )
                    .recipientId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
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
                        .canonicalEventType("email.delivered")
                        .eventType("email.delivered")
                        .occurredAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .payload(
                            EmailEventListResponse.Payload.builder()
                                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .occurredAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .status(EmailEventListResponse.Payload.Status.QUEUED)
                                .bcc(EmailEventListResponse.Payload.Bcc.UnionMember1.REDACTED)
                                .cc(
                                    EmailWebhookRecipient.builder()
                                        .email("dev@stainless.com")
                                        .kind(EmailWebhookRecipient.Kind.TO)
                                        .name("name")
                                        .build()
                                )
                                .from(
                                    EmailEventListResponse.Payload.From.builder()
                                        .email("dev@stainless.com")
                                        .name("name")
                                        .build()
                                )
                                .recipientId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .subject("subject")
                                .to(
                                    EmailWebhookRecipient.builder()
                                        .email("dev@stainless.com")
                                        .kind(EmailWebhookRecipient.Kind.TO)
                                        .name("name")
                                        .build()
                                )
                                .build()
                        )
                        .recipientId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
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
