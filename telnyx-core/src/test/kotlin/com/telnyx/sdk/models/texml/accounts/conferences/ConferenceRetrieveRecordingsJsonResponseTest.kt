// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.texml.accounts.conferences

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.texml.accounts.TexmlGetCallRecordingResponseBody
import com.telnyx.sdk.models.texml.accounts.TexmlRecordingSubresourcesUris
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConferenceRetrieveRecordingsJsonResponseTest {

    @Test
    fun create() {
        val conferenceRetrieveRecordingsJsonResponse =
            ConferenceRetrieveRecordingsJsonResponse.builder()
                .end(19L)
                .firstPageUri(
                    "/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Recordings.json?Page=0&PageSize=1"
                )
                .nextPageUri(
                    "/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Calls.json?Page=1&PageSize=1"
                )
                .page(0L)
                .pageSize(20L)
                .previousPageUri(
                    "/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Recordings.json?Page=0&PageSize=1"
                )
                .addRecording(
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
                )
                .start(0L)
                .uri(
                    "/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Recordings.json?Page=0&PageSize=1"
                )
                .build()

        assertThat(conferenceRetrieveRecordingsJsonResponse.end()).contains(19L)
        assertThat(conferenceRetrieveRecordingsJsonResponse.firstPageUri())
            .contains(
                "/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Recordings.json?Page=0&PageSize=1"
            )
        assertThat(conferenceRetrieveRecordingsJsonResponse.nextPageUri())
            .contains(
                "/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Calls.json?Page=1&PageSize=1"
            )
        assertThat(conferenceRetrieveRecordingsJsonResponse.page()).contains(0L)
        assertThat(conferenceRetrieveRecordingsJsonResponse.pageSize()).contains(20L)
        assertThat(conferenceRetrieveRecordingsJsonResponse.previousPageUri())
            .contains(
                "/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Recordings.json?Page=0&PageSize=1"
            )
        assertThat(conferenceRetrieveRecordingsJsonResponse.recordings().getOrNull())
            .containsExactly(
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
            )
        assertThat(conferenceRetrieveRecordingsJsonResponse.start()).contains(0L)
        assertThat(conferenceRetrieveRecordingsJsonResponse.uri())
            .contains(
                "/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Recordings.json?Page=0&PageSize=1"
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val conferenceRetrieveRecordingsJsonResponse =
            ConferenceRetrieveRecordingsJsonResponse.builder()
                .end(19L)
                .firstPageUri(
                    "/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Recordings.json?Page=0&PageSize=1"
                )
                .nextPageUri(
                    "/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Calls.json?Page=1&PageSize=1"
                )
                .page(0L)
                .pageSize(20L)
                .previousPageUri(
                    "/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Recordings.json?Page=0&PageSize=1"
                )
                .addRecording(
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
                )
                .start(0L)
                .uri(
                    "/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Recordings.json?Page=0&PageSize=1"
                )
                .build()

        val roundtrippedConferenceRetrieveRecordingsJsonResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(conferenceRetrieveRecordingsJsonResponse),
                jacksonTypeRef<ConferenceRetrieveRecordingsJsonResponse>(),
            )

        assertThat(roundtrippedConferenceRetrieveRecordingsJsonResponse)
            .isEqualTo(conferenceRetrieveRecordingsJsonResponse)
    }
}
