// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.texml.accounts.calls.recordings

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RecordingRecordingSidJsonResponseTest {

    @Test
    fun create() {
        val recordingRecordingSidJsonResponse =
            RecordingRecordingSidJsonResponse.builder()
                .accountSid("61bf923e-5e4d-4595-a110-56190ea18a1b")
                .callSid("v3:KBnLO0ZK3DhKM5s7bE9VluaSmKsOchKht_fUYvxcp8ysbmzCCtpkmA")
                .channels(RecordingRecordingSidJsonResponse.Channels._1)
                .conferenceSid("cd5a70f4-759b-4d5e-9c06-88c00f16f3c1")
                .dateCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dateUpdated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .duration("12")
                .errorCode(null)
                .price("0.10")
                .priceUnit("USD")
                .sid("e9cea0be-7dbd-4b98-98b1-c0089d9d43b0")
                .source(RecordingRecordingSidJsonResponse.Source.START_CALL_RECORDING_API)
                .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .track(RecordingRecordingSidJsonResponse.Track.INBOUND)
                .uri(
                    "/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Calls/v3:KBnLO0ZK3DhKM5s7bE9VluaSmKsOchKht_fUYvxcp8ysbmzCCtpkmA/Recordings/b08f0fa1-a32c-4218-b3b5-9cf78941ccac.json"
                )
                .build()

        assertThat(recordingRecordingSidJsonResponse.accountSid())
            .contains("61bf923e-5e4d-4595-a110-56190ea18a1b")
        assertThat(recordingRecordingSidJsonResponse.callSid())
            .contains("v3:KBnLO0ZK3DhKM5s7bE9VluaSmKsOchKht_fUYvxcp8ysbmzCCtpkmA")
        assertThat(recordingRecordingSidJsonResponse.channels())
            .contains(RecordingRecordingSidJsonResponse.Channels._1)
        assertThat(recordingRecordingSidJsonResponse.conferenceSid())
            .contains("cd5a70f4-759b-4d5e-9c06-88c00f16f3c1")
        assertThat(recordingRecordingSidJsonResponse.dateCreated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(recordingRecordingSidJsonResponse.dateUpdated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(recordingRecordingSidJsonResponse.duration()).contains("12")
        assertThat(recordingRecordingSidJsonResponse.errorCode()).isEmpty
        assertThat(recordingRecordingSidJsonResponse.price()).contains("0.10")
        assertThat(recordingRecordingSidJsonResponse.priceUnit()).contains("USD")
        assertThat(recordingRecordingSidJsonResponse.sid())
            .contains("e9cea0be-7dbd-4b98-98b1-c0089d9d43b0")
        assertThat(recordingRecordingSidJsonResponse.source())
            .contains(RecordingRecordingSidJsonResponse.Source.START_CALL_RECORDING_API)
        assertThat(recordingRecordingSidJsonResponse.startTime())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(recordingRecordingSidJsonResponse.track())
            .contains(RecordingRecordingSidJsonResponse.Track.INBOUND)
        assertThat(recordingRecordingSidJsonResponse.uri())
            .contains(
                "/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Calls/v3:KBnLO0ZK3DhKM5s7bE9VluaSmKsOchKht_fUYvxcp8ysbmzCCtpkmA/Recordings/b08f0fa1-a32c-4218-b3b5-9cf78941ccac.json"
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val recordingRecordingSidJsonResponse =
            RecordingRecordingSidJsonResponse.builder()
                .accountSid("61bf923e-5e4d-4595-a110-56190ea18a1b")
                .callSid("v3:KBnLO0ZK3DhKM5s7bE9VluaSmKsOchKht_fUYvxcp8ysbmzCCtpkmA")
                .channels(RecordingRecordingSidJsonResponse.Channels._1)
                .conferenceSid("cd5a70f4-759b-4d5e-9c06-88c00f16f3c1")
                .dateCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dateUpdated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .duration("12")
                .errorCode(null)
                .price("0.10")
                .priceUnit("USD")
                .sid("e9cea0be-7dbd-4b98-98b1-c0089d9d43b0")
                .source(RecordingRecordingSidJsonResponse.Source.START_CALL_RECORDING_API)
                .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .track(RecordingRecordingSidJsonResponse.Track.INBOUND)
                .uri(
                    "/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Calls/v3:KBnLO0ZK3DhKM5s7bE9VluaSmKsOchKht_fUYvxcp8ysbmzCCtpkmA/Recordings/b08f0fa1-a32c-4218-b3b5-9cf78941ccac.json"
                )
                .build()

        val roundtrippedRecordingRecordingSidJsonResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(recordingRecordingSidJsonResponse),
                jacksonTypeRef<RecordingRecordingSidJsonResponse>(),
            )

        assertThat(roundtrippedRecordingRecordingSidJsonResponse)
            .isEqualTo(recordingRecordingSidJsonResponse)
    }
}
