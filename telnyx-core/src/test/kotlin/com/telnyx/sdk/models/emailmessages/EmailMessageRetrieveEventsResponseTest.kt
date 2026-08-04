// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailmessages

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.emailevents.EmailEventType
import com.telnyx.sdk.models.emailinboxes.threads.EmailPaginationMeta
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmailMessageRetrieveEventsResponseTest {

    @Test
    fun create() {
        val emailMessageRetrieveEventsResponse =
            EmailMessageRetrieveEventsResponse.builder()
                .addData(
                    MessageEvent.builder()
                        .occurredAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .type(EmailEventType.QUEUED)
                        .payload(
                            MessageEvent.Payload.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .build()
                )
                .meta(EmailPaginationMeta.builder().pageSize(1L).pageCursor("page_cursor").build())
                .build()

        assertThat(emailMessageRetrieveEventsResponse.data())
            .containsExactly(
                MessageEvent.builder()
                    .occurredAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .type(EmailEventType.QUEUED)
                    .payload(
                        MessageEvent.Payload.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .build()
            )
        assertThat(emailMessageRetrieveEventsResponse.meta())
            .isEqualTo(EmailPaginationMeta.builder().pageSize(1L).pageCursor("page_cursor").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val emailMessageRetrieveEventsResponse =
            EmailMessageRetrieveEventsResponse.builder()
                .addData(
                    MessageEvent.builder()
                        .occurredAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .type(EmailEventType.QUEUED)
                        .payload(
                            MessageEvent.Payload.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .build()
                )
                .meta(EmailPaginationMeta.builder().pageSize(1L).pageCursor("page_cursor").build())
                .build()

        val roundtrippedEmailMessageRetrieveEventsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(emailMessageRetrieveEventsResponse),
                jacksonTypeRef<EmailMessageRetrieveEventsResponse>(),
            )

        assertThat(roundtrippedEmailMessageRetrieveEventsResponse)
            .isEqualTo(emailMessageRetrieveEventsResponse)
    }
}
