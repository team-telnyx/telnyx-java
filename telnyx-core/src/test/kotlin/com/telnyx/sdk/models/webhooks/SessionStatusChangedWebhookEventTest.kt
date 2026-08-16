// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SessionStatusChangedWebhookEventTest {

    @Test
    fun create() {
        val sessionStatusChangedWebhookEvent =
            SessionStatusChangedWebhookEvent.builder()
                .id("whdel_9f2c...")
                .data(
                    SessionStatusChangedWebhookEvent.Data.builder()
                        .recording(true)
                        .sessionId("mtgsess_9b2f...")
                        .status("status")
                        .statusDetail("status_detail")
                        .build()
                )
                .event(SessionStatusChangedWebhookEvent.Event.SESSION_STATUS_CHANGED)
                .occurredAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .version("1")
                .build()

        assertThat(sessionStatusChangedWebhookEvent.id()).isEqualTo("whdel_9f2c...")
        assertThat(sessionStatusChangedWebhookEvent.data())
            .isEqualTo(
                SessionStatusChangedWebhookEvent.Data.builder()
                    .recording(true)
                    .sessionId("mtgsess_9b2f...")
                    .status("status")
                    .statusDetail("status_detail")
                    .build()
            )
        assertThat(sessionStatusChangedWebhookEvent.event())
            .isEqualTo(SessionStatusChangedWebhookEvent.Event.SESSION_STATUS_CHANGED)
        assertThat(sessionStatusChangedWebhookEvent.occurredAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(sessionStatusChangedWebhookEvent.version()).isEqualTo("1")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val sessionStatusChangedWebhookEvent =
            SessionStatusChangedWebhookEvent.builder()
                .id("whdel_9f2c...")
                .data(
                    SessionStatusChangedWebhookEvent.Data.builder()
                        .recording(true)
                        .sessionId("mtgsess_9b2f...")
                        .status("status")
                        .statusDetail("status_detail")
                        .build()
                )
                .event(SessionStatusChangedWebhookEvent.Event.SESSION_STATUS_CHANGED)
                .occurredAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .version("1")
                .build()

        val roundtrippedSessionStatusChangedWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(sessionStatusChangedWebhookEvent),
                jacksonTypeRef<SessionStatusChangedWebhookEvent>(),
            )

        assertThat(roundtrippedSessionStatusChangedWebhookEvent)
            .isEqualTo(sessionStatusChangedWebhookEvent)
    }
}
