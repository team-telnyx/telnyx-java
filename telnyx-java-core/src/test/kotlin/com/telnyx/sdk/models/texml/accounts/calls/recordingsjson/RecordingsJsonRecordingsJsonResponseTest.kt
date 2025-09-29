// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.texml.accounts.calls.recordingsjson

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RecordingsJsonRecordingsJsonResponseTest {

    @Test
    fun create() {
        val recordingsJsonRecordingsJsonResponse =
            RecordingsJsonRecordingsJsonResponse.builder()
                .accountSid("61bf923e-5e4d-4595-a110-56190ea18a1b")
                .callSid("v3:KBnLO0ZK3DhKM5s7bE9VluaSmKsOchKht_fUYvxcp8ysbmzCCtpkmA")
                .channels(RecordingsJsonRecordingsJsonResponse.Channels._1)
                .conferenceSid("cd5a70f4-759b-4d5e-9c06-88c00f16f3c1")
                .dateCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dateUpdated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .duration("12")
                .errorCode(null)
                .price("0.10")
                .priceUnit("USD")
                .sid("e9cea0be-7dbd-4b98-98b1-c0089d9d43b0")
                .source(RecordingsJsonRecordingsJsonResponse.Source.START_CALL_RECORDING_API)
                .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .track(RecordingsJsonRecordingsJsonResponse.Track.INBOUND)
                .uri(
                    "/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Calls/v3:KBnLO0ZK3DhKM5s7bE9VluaSmKsOchKht_fUYvxcp8ysbmzCCtpkmA/Recordings/b08f0fa1-a32c-4218-b3b5-9cf78941ccac.json"
                )
                .build()

        assertThat(recordingsJsonRecordingsJsonResponse.accountSid())
            .contains("61bf923e-5e4d-4595-a110-56190ea18a1b")
        assertThat(recordingsJsonRecordingsJsonResponse.callSid())
            .contains("v3:KBnLO0ZK3DhKM5s7bE9VluaSmKsOchKht_fUYvxcp8ysbmzCCtpkmA")
        assertThat(recordingsJsonRecordingsJsonResponse.channels())
            .contains(RecordingsJsonRecordingsJsonResponse.Channels._1)
        assertThat(recordingsJsonRecordingsJsonResponse.conferenceSid())
            .contains("cd5a70f4-759b-4d5e-9c06-88c00f16f3c1")
        assertThat(recordingsJsonRecordingsJsonResponse.dateCreated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(recordingsJsonRecordingsJsonResponse.dateUpdated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(recordingsJsonRecordingsJsonResponse.duration()).contains("12")
        assertThat(recordingsJsonRecordingsJsonResponse.errorCode()).isEmpty
        assertThat(recordingsJsonRecordingsJsonResponse.price()).contains("0.10")
        assertThat(recordingsJsonRecordingsJsonResponse.priceUnit()).contains("USD")
        assertThat(recordingsJsonRecordingsJsonResponse.sid())
            .contains("e9cea0be-7dbd-4b98-98b1-c0089d9d43b0")
        assertThat(recordingsJsonRecordingsJsonResponse.source())
            .contains(RecordingsJsonRecordingsJsonResponse.Source.START_CALL_RECORDING_API)
        assertThat(recordingsJsonRecordingsJsonResponse.startTime())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(recordingsJsonRecordingsJsonResponse.track())
            .contains(RecordingsJsonRecordingsJsonResponse.Track.INBOUND)
        assertThat(recordingsJsonRecordingsJsonResponse.uri())
            .contains(
                "/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Calls/v3:KBnLO0ZK3DhKM5s7bE9VluaSmKsOchKht_fUYvxcp8ysbmzCCtpkmA/Recordings/b08f0fa1-a32c-4218-b3b5-9cf78941ccac.json"
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val recordingsJsonRecordingsJsonResponse =
            RecordingsJsonRecordingsJsonResponse.builder()
                .accountSid("61bf923e-5e4d-4595-a110-56190ea18a1b")
                .callSid("v3:KBnLO0ZK3DhKM5s7bE9VluaSmKsOchKht_fUYvxcp8ysbmzCCtpkmA")
                .channels(RecordingsJsonRecordingsJsonResponse.Channels._1)
                .conferenceSid("cd5a70f4-759b-4d5e-9c06-88c00f16f3c1")
                .dateCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dateUpdated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .duration("12")
                .errorCode(null)
                .price("0.10")
                .priceUnit("USD")
                .sid("e9cea0be-7dbd-4b98-98b1-c0089d9d43b0")
                .source(RecordingsJsonRecordingsJsonResponse.Source.START_CALL_RECORDING_API)
                .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .track(RecordingsJsonRecordingsJsonResponse.Track.INBOUND)
                .uri(
                    "/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Calls/v3:KBnLO0ZK3DhKM5s7bE9VluaSmKsOchKht_fUYvxcp8ysbmzCCtpkmA/Recordings/b08f0fa1-a32c-4218-b3b5-9cf78941ccac.json"
                )
                .build()

        val roundtrippedRecordingsJsonRecordingsJsonResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(recordingsJsonRecordingsJsonResponse),
                jacksonTypeRef<RecordingsJsonRecordingsJsonResponse>(),
            )

        assertThat(roundtrippedRecordingsJsonRecordingsJsonResponse)
            .isEqualTo(recordingsJsonRecordingsJsonResponse)
    }
}
