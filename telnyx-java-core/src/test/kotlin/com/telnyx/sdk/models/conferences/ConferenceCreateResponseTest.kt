// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.conferences

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConferenceCreateResponseTest {

    @Test
    fun create() {
        val conferenceCreateResponse =
            ConferenceCreateResponse.builder()
                .data(
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
                )
                .build()

        assertThat(conferenceCreateResponse.data())
            .contains(
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val conferenceCreateResponse =
            ConferenceCreateResponse.builder()
                .data(
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
                )
                .build()

        val roundtrippedConferenceCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(conferenceCreateResponse),
                jacksonTypeRef<ConferenceCreateResponse>(),
            )

        assertThat(roundtrippedConferenceCreateResponse).isEqualTo(conferenceCreateResponse)
    }
}
