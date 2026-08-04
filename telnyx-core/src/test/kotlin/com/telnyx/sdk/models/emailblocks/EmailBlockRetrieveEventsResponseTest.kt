// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailblocks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmailBlockRetrieveEventsResponseTest {

    @Test
    fun create() {
        val emailBlockRetrieveEventsResponse =
            EmailBlockRetrieveEventsResponse.builder()
                .addData(
                    EmailBlockRetrieveEventsResponse.Data.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .actor("actor")
                        .eventType(EmailBlockRetrieveEventsResponse.Data.EventType.CREATED)
                        .occurredAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .reason("reason")
                        .recordType(
                            EmailBlockRetrieveEventsResponse.Data.RecordType.EMAIL_BLOCK_EVENT
                        )
                        .source("source")
                        .meta(
                            EmailBlockRetrieveEventsResponse.Data.Meta.builder()
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

        assertThat(emailBlockRetrieveEventsResponse.data())
            .containsExactly(
                EmailBlockRetrieveEventsResponse.Data.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .actor("actor")
                    .eventType(EmailBlockRetrieveEventsResponse.Data.EventType.CREATED)
                    .occurredAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .reason("reason")
                    .recordType(EmailBlockRetrieveEventsResponse.Data.RecordType.EMAIL_BLOCK_EVENT)
                    .source("source")
                    .meta(
                        EmailBlockRetrieveEventsResponse.Data.Meta.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .build()
            )
        assertThat(emailBlockRetrieveEventsResponse.meta())
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
        val emailBlockRetrieveEventsResponse =
            EmailBlockRetrieveEventsResponse.builder()
                .addData(
                    EmailBlockRetrieveEventsResponse.Data.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .actor("actor")
                        .eventType(EmailBlockRetrieveEventsResponse.Data.EventType.CREATED)
                        .occurredAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .reason("reason")
                        .recordType(
                            EmailBlockRetrieveEventsResponse.Data.RecordType.EMAIL_BLOCK_EVENT
                        )
                        .source("source")
                        .meta(
                            EmailBlockRetrieveEventsResponse.Data.Meta.builder()
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

        val roundtrippedEmailBlockRetrieveEventsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(emailBlockRetrieveEventsResponse),
                jacksonTypeRef<EmailBlockRetrieveEventsResponse>(),
            )

        assertThat(roundtrippedEmailBlockRetrieveEventsResponse)
            .isEqualTo(emailBlockRetrieveEventsResponse)
    }
}
