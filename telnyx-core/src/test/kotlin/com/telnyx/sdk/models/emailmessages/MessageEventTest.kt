// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailmessages

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.emailevents.EmailEventType
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessageEventTest {

    @Test
    fun create() {
        val messageEvent =
            MessageEvent.builder()
                .occurredAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .type(EmailEventType.QUEUED)
                .payload(
                    MessageEvent.Payload.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .build()

        assertThat(messageEvent.occurredAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(messageEvent.type()).isEqualTo(EmailEventType.QUEUED)
        assertThat(messageEvent.payload())
            .contains(
                MessageEvent.Payload.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val messageEvent =
            MessageEvent.builder()
                .occurredAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .type(EmailEventType.QUEUED)
                .payload(
                    MessageEvent.Payload.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .build()

        val roundtrippedMessageEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(messageEvent),
                jacksonTypeRef<MessageEvent>(),
            )

        assertThat(roundtrippedMessageEvent).isEqualTo(messageEvent)
    }
}
