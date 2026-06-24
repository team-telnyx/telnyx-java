// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.texml.accounts.calls.recordingsjson

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TexmlCreateCallRecordingResponseBodyTest {

    @Test
    fun create() {
        val texmlCreateCallRecordingResponseBody =
            TexmlCreateCallRecordingResponseBody.builder()
                .accountSid("61bf923e-5e4d-4595-a110-56190ea18a1b")
                .callSid("v3:KBnLO0ZK3DhKM5s7bE9VluaSmKsOchKht_fUYvxcp8ysbmzCCtpkmA")
                .channels(TwimlRecordingChannels.CHANNEL_1)
                .conferenceSid("cd5a70f4-759b-4d5e-9c06-88c00f16f3c1")
                .dateCreated(OffsetDateTime.parse("2023-08-11T19:12:11Z"))
                .dateUpdated(OffsetDateTime.parse("2023-08-11T19:12:11Z"))
                .duration("12")
                .errorCode(null)
                .price("0.10")
                .priceUnit("USD")
                .sid("e9cea0be-7dbd-4b98-98b1-c0089d9d43b0")
                .source(RecordingSource.START_CALL_RECORDING_API)
                .startTime(OffsetDateTime.parse("2023-08-11T19:12:11Z"))
                .track(TexmlCreateCallRecordingResponseBody.Track.INBOUND)
                .uri(
                    "/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Calls/v3:KBnLO0ZK3DhKM5s7bE9VluaSmKsOchKht_fUYvxcp8ysbmzCCtpkmA/Recordings/b08f0fa1-a32c-4218-b3b5-9cf78941ccac.json"
                )
                .build()

        assertThat(texmlCreateCallRecordingResponseBody.accountSid())
            .contains("61bf923e-5e4d-4595-a110-56190ea18a1b")
        assertThat(texmlCreateCallRecordingResponseBody.callSid())
            .contains("v3:KBnLO0ZK3DhKM5s7bE9VluaSmKsOchKht_fUYvxcp8ysbmzCCtpkmA")
        assertThat(texmlCreateCallRecordingResponseBody.channels())
            .contains(TwimlRecordingChannels.CHANNEL_1)
        assertThat(texmlCreateCallRecordingResponseBody.conferenceSid())
            .contains("cd5a70f4-759b-4d5e-9c06-88c00f16f3c1")
        assertThat(texmlCreateCallRecordingResponseBody.dateCreated())
            .contains(OffsetDateTime.parse("2023-08-11T19:12:11Z"))
        assertThat(texmlCreateCallRecordingResponseBody.dateUpdated())
            .contains(OffsetDateTime.parse("2023-08-11T19:12:11Z"))
        assertThat(texmlCreateCallRecordingResponseBody.duration()).contains("12")
        assertThat(texmlCreateCallRecordingResponseBody.errorCode()).isEmpty
        assertThat(texmlCreateCallRecordingResponseBody.price()).contains("0.10")
        assertThat(texmlCreateCallRecordingResponseBody.priceUnit()).contains("USD")
        assertThat(texmlCreateCallRecordingResponseBody.sid())
            .contains("e9cea0be-7dbd-4b98-98b1-c0089d9d43b0")
        assertThat(texmlCreateCallRecordingResponseBody.source())
            .contains(RecordingSource.START_CALL_RECORDING_API)
        assertThat(texmlCreateCallRecordingResponseBody.startTime())
            .contains(OffsetDateTime.parse("2023-08-11T19:12:11Z"))
        assertThat(texmlCreateCallRecordingResponseBody.track())
            .contains(TexmlCreateCallRecordingResponseBody.Track.INBOUND)
        assertThat(texmlCreateCallRecordingResponseBody.uri())
            .contains(
                "/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Calls/v3:KBnLO0ZK3DhKM5s7bE9VluaSmKsOchKht_fUYvxcp8ysbmzCCtpkmA/Recordings/b08f0fa1-a32c-4218-b3b5-9cf78941ccac.json"
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val texmlCreateCallRecordingResponseBody =
            TexmlCreateCallRecordingResponseBody.builder()
                .accountSid("61bf923e-5e4d-4595-a110-56190ea18a1b")
                .callSid("v3:KBnLO0ZK3DhKM5s7bE9VluaSmKsOchKht_fUYvxcp8ysbmzCCtpkmA")
                .channels(TwimlRecordingChannels.CHANNEL_1)
                .conferenceSid("cd5a70f4-759b-4d5e-9c06-88c00f16f3c1")
                .dateCreated(OffsetDateTime.parse("2023-08-11T19:12:11Z"))
                .dateUpdated(OffsetDateTime.parse("2023-08-11T19:12:11Z"))
                .duration("12")
                .errorCode(null)
                .price("0.10")
                .priceUnit("USD")
                .sid("e9cea0be-7dbd-4b98-98b1-c0089d9d43b0")
                .source(RecordingSource.START_CALL_RECORDING_API)
                .startTime(OffsetDateTime.parse("2023-08-11T19:12:11Z"))
                .track(TexmlCreateCallRecordingResponseBody.Track.INBOUND)
                .uri(
                    "/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Calls/v3:KBnLO0ZK3DhKM5s7bE9VluaSmKsOchKht_fUYvxcp8ysbmzCCtpkmA/Recordings/b08f0fa1-a32c-4218-b3b5-9cf78941ccac.json"
                )
                .build()

        val roundtrippedTexmlCreateCallRecordingResponseBody =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(texmlCreateCallRecordingResponseBody),
                jacksonTypeRef<TexmlCreateCallRecordingResponseBody>(),
            )

        assertThat(roundtrippedTexmlCreateCallRecordingResponseBody)
            .isEqualTo(texmlCreateCallRecordingResponseBody)
    }
}
