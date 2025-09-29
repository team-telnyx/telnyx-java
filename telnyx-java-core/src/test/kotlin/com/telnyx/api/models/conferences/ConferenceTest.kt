// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.conferences

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConferenceTest {

    @Test
    fun create() {
        val conference =
            Conference.builder()
                .id("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                .createdAt("2019-01-23T18:10:02.574Z")
                .expiresAt("2019-01-23T18:10:02.574Z")
                .name("All hands meeting")
                .recordType(Conference.RecordType.CONFERENCE)
                .connectionId("3fa85f64-9191-4567-b3fc-2c963f66afa6")
                .endReason(Conference.EndReason.ALL_LEFT)
                .endedBy(
                    Conference.EndedBy.builder()
                        .callControlId(
                            "v2:T02llQxIyaRkhfRKxgAP8nY511EhFLizdvdUKJiSw8d6A9BborherQczRrZvZakpWxBlpw48KyZQ=="
                        )
                        .callSessionId("428c31b6-abf3-3bc1-b7f4-5013ef9657c1")
                        .build()
                )
                .region("sv1")
                .status(Conference.Status.COMPLETED)
                .updatedAt("2019-01-23T18:10:02.574Z")
                .build()

        assertThat(conference.id()).isEqualTo("3fa85f64-5717-4562-b3fc-2c963f66afa6")
        assertThat(conference.createdAt()).isEqualTo("2019-01-23T18:10:02.574Z")
        assertThat(conference.expiresAt()).isEqualTo("2019-01-23T18:10:02.574Z")
        assertThat(conference.name()).isEqualTo("All hands meeting")
        assertThat(conference.recordType()).isEqualTo(Conference.RecordType.CONFERENCE)
        assertThat(conference.connectionId()).contains("3fa85f64-9191-4567-b3fc-2c963f66afa6")
        assertThat(conference.endReason()).contains(Conference.EndReason.ALL_LEFT)
        assertThat(conference.endedBy())
            .contains(
                Conference.EndedBy.builder()
                    .callControlId(
                        "v2:T02llQxIyaRkhfRKxgAP8nY511EhFLizdvdUKJiSw8d6A9BborherQczRrZvZakpWxBlpw48KyZQ=="
                    )
                    .callSessionId("428c31b6-abf3-3bc1-b7f4-5013ef9657c1")
                    .build()
            )
        assertThat(conference.region()).contains("sv1")
        assertThat(conference.status()).contains(Conference.Status.COMPLETED)
        assertThat(conference.updatedAt()).contains("2019-01-23T18:10:02.574Z")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val conference =
            Conference.builder()
                .id("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                .createdAt("2019-01-23T18:10:02.574Z")
                .expiresAt("2019-01-23T18:10:02.574Z")
                .name("All hands meeting")
                .recordType(Conference.RecordType.CONFERENCE)
                .connectionId("3fa85f64-9191-4567-b3fc-2c963f66afa6")
                .endReason(Conference.EndReason.ALL_LEFT)
                .endedBy(
                    Conference.EndedBy.builder()
                        .callControlId(
                            "v2:T02llQxIyaRkhfRKxgAP8nY511EhFLizdvdUKJiSw8d6A9BborherQczRrZvZakpWxBlpw48KyZQ=="
                        )
                        .callSessionId("428c31b6-abf3-3bc1-b7f4-5013ef9657c1")
                        .build()
                )
                .region("sv1")
                .status(Conference.Status.COMPLETED)
                .updatedAt("2019-01-23T18:10:02.574Z")
                .build()

        val roundtrippedConference =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(conference),
                jacksonTypeRef<Conference>(),
            )

        assertThat(roundtrippedConference).isEqualTo(conference)
    }
}
