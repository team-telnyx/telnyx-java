// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.meetingsessions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MeetingSessionRetrieveEventsResponseTest {

    @Test
    fun create() {
        val meetingSessionRetrieveEventsResponse =
            MeetingSessionRetrieveEventsResponse.builder()
                .addData(
                    MeetingSessionRetrieveEventsResponse.Data.builder()
                        .occurredAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .payload(
                            MeetingSessionRetrieveEventsResponse.Data.Payload.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .seq(0L)
                        .type("type")
                        .build()
                )
                .build()

        assertThat(meetingSessionRetrieveEventsResponse.data())
            .containsExactly(
                MeetingSessionRetrieveEventsResponse.Data.builder()
                    .occurredAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .payload(
                        MeetingSessionRetrieveEventsResponse.Data.Payload.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .seq(0L)
                    .type("type")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val meetingSessionRetrieveEventsResponse =
            MeetingSessionRetrieveEventsResponse.builder()
                .addData(
                    MeetingSessionRetrieveEventsResponse.Data.builder()
                        .occurredAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .payload(
                            MeetingSessionRetrieveEventsResponse.Data.Payload.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .seq(0L)
                        .type("type")
                        .build()
                )
                .build()

        val roundtrippedMeetingSessionRetrieveEventsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(meetingSessionRetrieveEventsResponse),
                jacksonTypeRef<MeetingSessionRetrieveEventsResponse>(),
            )

        assertThat(roundtrippedMeetingSessionRetrieveEventsResponse)
            .isEqualTo(meetingSessionRetrieveEventsResponse)
    }
}
