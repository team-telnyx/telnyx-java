// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.texml.accounts.calls.recordingsjson

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.texml.accounts.TexmlGetCallRecordingResponseBody
import com.telnyx.sdk.models.texml.accounts.TexmlRecordingSubresourcesUris
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RecordingsJsonRetrieveRecordingsJsonResponseTest {

    @Test
    fun create() {
        val recordingsJsonRetrieveRecordingsJsonResponse =
            RecordingsJsonRetrieveRecordingsJsonResponse.builder()
                .end(19L)
                .firstPageUri("https://example.com")
                .nextPageUri(
                    "/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Calls.json?Page=1&PageSize=1"
                )
                .page(0L)
                .pageSize(20L)
                .previousPageUri("https://example.com")
                .addRecording(
                    TexmlGetCallRecordingResponseBody.builder()
                        .accountSid("61bf923e-5e4d-4595-a110-56190ea18a1b")
                        .callSid("v3:KBnLO0ZK3DhKM5s7bE9VluaSmKsOchKht_fUYvxcp8ysbmzCCtpkmA")
                        .channels(TexmlGetCallRecordingResponseBody.Channels.CHANNEL_1)
                        .conferenceSid("cd5a70f4-759b-4d5e-9c06-88c00f16f3c1")
                        .dateCreated(OffsetDateTime.parse("2023-08-11T19:12:11Z"))
                        .dateUpdated(OffsetDateTime.parse("2023-08-11T19:12:11Z"))
                        .duration("12")
                        .errorCode(null)
                        .mediaUrl("http://recordings.com/mp3/filename.mp3")
                        .sid("e9cea0be-7dbd-4b98-98b1-c0089d9d43b0")
                        .source(TexmlGetCallRecordingResponseBody.Source.START_CALL_RECORDING_API)
                        .startTime(OffsetDateTime.parse("2023-08-11T19:12:11Z"))
                        .status(TexmlGetCallRecordingResponseBody.Status.PAUSED)
                        .subresourcesUris(
                            TexmlRecordingSubresourcesUris.builder()
                                .transcriptions("https://example.com")
                                .build()
                        )
                        .uri(
                            "/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Recordings/b08f0fa1-a32c-4218-b3b5-9cf78941ccac.json"
                        )
                        .build()
                )
                .start(0L)
                .uri(
                    "/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Recordings.json?Page=0&PageSize=1"
                )
                .build()

        assertThat(recordingsJsonRetrieveRecordingsJsonResponse.end()).contains(19L)
        assertThat(recordingsJsonRetrieveRecordingsJsonResponse.firstPageUri())
            .contains("https://example.com")
        assertThat(recordingsJsonRetrieveRecordingsJsonResponse.nextPageUri())
            .contains(
                "/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Calls.json?Page=1&PageSize=1"
            )
        assertThat(recordingsJsonRetrieveRecordingsJsonResponse.page()).contains(0L)
        assertThat(recordingsJsonRetrieveRecordingsJsonResponse.pageSize()).contains(20L)
        assertThat(recordingsJsonRetrieveRecordingsJsonResponse.previousPageUri())
            .contains("https://example.com")
        assertThat(recordingsJsonRetrieveRecordingsJsonResponse.recordings().getOrNull())
            .containsExactly(
                TexmlGetCallRecordingResponseBody.builder()
                    .accountSid("61bf923e-5e4d-4595-a110-56190ea18a1b")
                    .callSid("v3:KBnLO0ZK3DhKM5s7bE9VluaSmKsOchKht_fUYvxcp8ysbmzCCtpkmA")
                    .channels(TexmlGetCallRecordingResponseBody.Channels.CHANNEL_1)
                    .conferenceSid("cd5a70f4-759b-4d5e-9c06-88c00f16f3c1")
                    .dateCreated(OffsetDateTime.parse("2023-08-11T19:12:11Z"))
                    .dateUpdated(OffsetDateTime.parse("2023-08-11T19:12:11Z"))
                    .duration("12")
                    .errorCode(null)
                    .mediaUrl("http://recordings.com/mp3/filename.mp3")
                    .sid("e9cea0be-7dbd-4b98-98b1-c0089d9d43b0")
                    .source(TexmlGetCallRecordingResponseBody.Source.START_CALL_RECORDING_API)
                    .startTime(OffsetDateTime.parse("2023-08-11T19:12:11Z"))
                    .status(TexmlGetCallRecordingResponseBody.Status.PAUSED)
                    .subresourcesUris(
                        TexmlRecordingSubresourcesUris.builder()
                            .transcriptions("https://example.com")
                            .build()
                    )
                    .uri(
                        "/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Recordings/b08f0fa1-a32c-4218-b3b5-9cf78941ccac.json"
                    )
                    .build()
            )
        assertThat(recordingsJsonRetrieveRecordingsJsonResponse.start()).contains(0L)
        assertThat(recordingsJsonRetrieveRecordingsJsonResponse.uri())
            .contains(
                "/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Recordings.json?Page=0&PageSize=1"
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val recordingsJsonRetrieveRecordingsJsonResponse =
            RecordingsJsonRetrieveRecordingsJsonResponse.builder()
                .end(19L)
                .firstPageUri("https://example.com")
                .nextPageUri(
                    "/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Calls.json?Page=1&PageSize=1"
                )
                .page(0L)
                .pageSize(20L)
                .previousPageUri("https://example.com")
                .addRecording(
                    TexmlGetCallRecordingResponseBody.builder()
                        .accountSid("61bf923e-5e4d-4595-a110-56190ea18a1b")
                        .callSid("v3:KBnLO0ZK3DhKM5s7bE9VluaSmKsOchKht_fUYvxcp8ysbmzCCtpkmA")
                        .channels(TexmlGetCallRecordingResponseBody.Channels.CHANNEL_1)
                        .conferenceSid("cd5a70f4-759b-4d5e-9c06-88c00f16f3c1")
                        .dateCreated(OffsetDateTime.parse("2023-08-11T19:12:11Z"))
                        .dateUpdated(OffsetDateTime.parse("2023-08-11T19:12:11Z"))
                        .duration("12")
                        .errorCode(null)
                        .mediaUrl("http://recordings.com/mp3/filename.mp3")
                        .sid("e9cea0be-7dbd-4b98-98b1-c0089d9d43b0")
                        .source(TexmlGetCallRecordingResponseBody.Source.START_CALL_RECORDING_API)
                        .startTime(OffsetDateTime.parse("2023-08-11T19:12:11Z"))
                        .status(TexmlGetCallRecordingResponseBody.Status.PAUSED)
                        .subresourcesUris(
                            TexmlRecordingSubresourcesUris.builder()
                                .transcriptions("https://example.com")
                                .build()
                        )
                        .uri(
                            "/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Recordings/b08f0fa1-a32c-4218-b3b5-9cf78941ccac.json"
                        )
                        .build()
                )
                .start(0L)
                .uri(
                    "/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Recordings.json?Page=0&PageSize=1"
                )
                .build()

        val roundtrippedRecordingsJsonRetrieveRecordingsJsonResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(recordingsJsonRetrieveRecordingsJsonResponse),
                jacksonTypeRef<RecordingsJsonRetrieveRecordingsJsonResponse>(),
            )

        assertThat(roundtrippedRecordingsJsonRetrieveRecordingsJsonResponse)
            .isEqualTo(recordingsJsonRetrieveRecordingsJsonResponse)
    }
}
