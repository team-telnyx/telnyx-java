// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailblocks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmailBlockRetrieveEventsPageResponseTest {

    @Test
    fun create() {
        val emailBlockRetrieveEventsPageResponse =
            EmailBlockRetrieveEventsPageResponse.builder()
                .addData(
                    EmailBlockRetrieveEventsResponse.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .actor("actor")
                        .eventType(EmailBlockRetrieveEventsResponse.EventType.CREATED)
                        .occurredAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .reason("reason")
                        .recordType(EmailBlockRetrieveEventsResponse.RecordType.EMAIL_BLOCK_EVENT)
                        .source("source")
                        .meta(
                            EmailBlockRetrieveEventsResponse.Meta.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .build()
                )
                .meta(
                    OffsetMeta.builder()
                        .pageNumber(0L)
                        .pageSize(0L)
                        .totalPages(0L)
                        .totalResults(0L)
                        .build()
                )
                .build()

        assertThat(emailBlockRetrieveEventsPageResponse.data())
            .containsExactly(
                EmailBlockRetrieveEventsResponse.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .actor("actor")
                    .eventType(EmailBlockRetrieveEventsResponse.EventType.CREATED)
                    .occurredAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .reason("reason")
                    .recordType(EmailBlockRetrieveEventsResponse.RecordType.EMAIL_BLOCK_EVENT)
                    .source("source")
                    .meta(
                        EmailBlockRetrieveEventsResponse.Meta.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .build()
            )
        assertThat(emailBlockRetrieveEventsPageResponse.meta())
            .isEqualTo(
                OffsetMeta.builder()
                    .pageNumber(0L)
                    .pageSize(0L)
                    .totalPages(0L)
                    .totalResults(0L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val emailBlockRetrieveEventsPageResponse =
            EmailBlockRetrieveEventsPageResponse.builder()
                .addData(
                    EmailBlockRetrieveEventsResponse.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .actor("actor")
                        .eventType(EmailBlockRetrieveEventsResponse.EventType.CREATED)
                        .occurredAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .reason("reason")
                        .recordType(EmailBlockRetrieveEventsResponse.RecordType.EMAIL_BLOCK_EVENT)
                        .source("source")
                        .meta(
                            EmailBlockRetrieveEventsResponse.Meta.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .build()
                )
                .meta(
                    OffsetMeta.builder()
                        .pageNumber(0L)
                        .pageSize(0L)
                        .totalPages(0L)
                        .totalResults(0L)
                        .build()
                )
                .build()

        val roundtrippedEmailBlockRetrieveEventsPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(emailBlockRetrieveEventsPageResponse),
                jacksonTypeRef<EmailBlockRetrieveEventsPageResponse>(),
            )

        assertThat(roundtrippedEmailBlockRetrieveEventsPageResponse)
            .isEqualTo(emailBlockRetrieveEventsPageResponse)
    }
}
