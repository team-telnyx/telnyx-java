// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.texml.accounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TexmlGetCallRecordingResponseBodyTest {

    @Test
    fun create() {
        val texmlGetCallRecordingResponseBody =
            TexmlGetCallRecordingResponseBody.builder()
                .accountSid("61bf923e-5e4d-4595-a110-56190ea18a1b")
                .callSid("v3:KBnLO0ZK3DhKM5s7bE9VluaSmKsOchKht_fUYvxcp8ysbmzCCtpkmA")
                .channels(TexmlGetCallRecordingResponseBody.Channels._1)
                .conferenceSid("cd5a70f4-759b-4d5e-9c06-88c00f16f3c1")
                .dateCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dateUpdated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .duration("12")
                .errorCode(null)
                .mediaUrl("http://recordings.com/mp3/filename.mp3")
                .sid("e9cea0be-7dbd-4b98-98b1-c0089d9d43b0")
                .source(TexmlGetCallRecordingResponseBody.Source.START_CALL_RECORDING_API)
                .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(TexmlGetCallRecordingResponseBody.Status.PAUSED)
                .subresourcesUris(
                    TexmlRecordingSubresourcesUris.builder()
                        .transcriptions(
                            "/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Recordings/b08f0fa1-a32c-4218-b3b5-9cf78941ccac/Transcriptions.json"
                        )
                        .build()
                )
                .uri(
                    "/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Recordings/b08f0fa1-a32c-4218-b3b5-9cf78941ccac.json"
                )
                .build()

        assertThat(texmlGetCallRecordingResponseBody.accountSid())
            .contains("61bf923e-5e4d-4595-a110-56190ea18a1b")
        assertThat(texmlGetCallRecordingResponseBody.callSid())
            .contains("v3:KBnLO0ZK3DhKM5s7bE9VluaSmKsOchKht_fUYvxcp8ysbmzCCtpkmA")
        assertThat(texmlGetCallRecordingResponseBody.channels())
            .contains(TexmlGetCallRecordingResponseBody.Channels._1)
        assertThat(texmlGetCallRecordingResponseBody.conferenceSid())
            .contains("cd5a70f4-759b-4d5e-9c06-88c00f16f3c1")
        assertThat(texmlGetCallRecordingResponseBody.dateCreated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(texmlGetCallRecordingResponseBody.dateUpdated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(texmlGetCallRecordingResponseBody.duration()).contains("12")
        assertThat(texmlGetCallRecordingResponseBody.errorCode()).isEmpty
        assertThat(texmlGetCallRecordingResponseBody.mediaUrl())
            .contains("http://recordings.com/mp3/filename.mp3")
        assertThat(texmlGetCallRecordingResponseBody.sid())
            .contains("e9cea0be-7dbd-4b98-98b1-c0089d9d43b0")
        assertThat(texmlGetCallRecordingResponseBody.source())
            .contains(TexmlGetCallRecordingResponseBody.Source.START_CALL_RECORDING_API)
        assertThat(texmlGetCallRecordingResponseBody.startTime())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(texmlGetCallRecordingResponseBody.status())
            .contains(TexmlGetCallRecordingResponseBody.Status.PAUSED)
        assertThat(texmlGetCallRecordingResponseBody.subresourcesUris())
            .contains(
                TexmlRecordingSubresourcesUris.builder()
                    .transcriptions(
                        "/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Recordings/b08f0fa1-a32c-4218-b3b5-9cf78941ccac/Transcriptions.json"
                    )
                    .build()
            )
        assertThat(texmlGetCallRecordingResponseBody.uri())
            .contains(
                "/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Recordings/b08f0fa1-a32c-4218-b3b5-9cf78941ccac.json"
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val texmlGetCallRecordingResponseBody =
            TexmlGetCallRecordingResponseBody.builder()
                .accountSid("61bf923e-5e4d-4595-a110-56190ea18a1b")
                .callSid("v3:KBnLO0ZK3DhKM5s7bE9VluaSmKsOchKht_fUYvxcp8ysbmzCCtpkmA")
                .channels(TexmlGetCallRecordingResponseBody.Channels._1)
                .conferenceSid("cd5a70f4-759b-4d5e-9c06-88c00f16f3c1")
                .dateCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dateUpdated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .duration("12")
                .errorCode(null)
                .mediaUrl("http://recordings.com/mp3/filename.mp3")
                .sid("e9cea0be-7dbd-4b98-98b1-c0089d9d43b0")
                .source(TexmlGetCallRecordingResponseBody.Source.START_CALL_RECORDING_API)
                .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(TexmlGetCallRecordingResponseBody.Status.PAUSED)
                .subresourcesUris(
                    TexmlRecordingSubresourcesUris.builder()
                        .transcriptions(
                            "/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Recordings/b08f0fa1-a32c-4218-b3b5-9cf78941ccac/Transcriptions.json"
                        )
                        .build()
                )
                .uri(
                    "/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Recordings/b08f0fa1-a32c-4218-b3b5-9cf78941ccac.json"
                )
                .build()

        val roundtrippedTexmlGetCallRecordingResponseBody =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(texmlGetCallRecordingResponseBody),
                jacksonTypeRef<TexmlGetCallRecordingResponseBody>(),
            )

        assertThat(roundtrippedTexmlGetCallRecordingResponseBody)
            .isEqualTo(texmlGetCallRecordingResponseBody)
    }
}
