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

        assertThat(emailBlockRetrieveEventsResponse.id())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(emailBlockRetrieveEventsResponse.actor()).isEqualTo("actor")
        assertThat(emailBlockRetrieveEventsResponse.eventType())
            .isEqualTo(EmailBlockRetrieveEventsResponse.EventType.CREATED)
        assertThat(emailBlockRetrieveEventsResponse.occurredAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(emailBlockRetrieveEventsResponse.reason()).isEqualTo("reason")
        assertThat(emailBlockRetrieveEventsResponse.recordType())
            .isEqualTo(EmailBlockRetrieveEventsResponse.RecordType.EMAIL_BLOCK_EVENT)
        assertThat(emailBlockRetrieveEventsResponse.source()).isEqualTo("source")
        assertThat(emailBlockRetrieveEventsResponse.meta())
            .contains(
                EmailBlockRetrieveEventsResponse.Meta.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val emailBlockRetrieveEventsResponse =
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

        val roundtrippedEmailBlockRetrieveEventsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(emailBlockRetrieveEventsResponse),
                jacksonTypeRef<EmailBlockRetrieveEventsResponse>(),
            )

        assertThat(roundtrippedEmailBlockRetrieveEventsResponse)
            .isEqualTo(emailBlockRetrieveEventsResponse)
    }
}
