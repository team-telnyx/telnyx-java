// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.texml.accounts.transcriptions.json

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class JsonRetrieveRecordingTranscriptionSidJsonResponseTest {

    @Test
    fun create() {
        val jsonRetrieveRecordingTranscriptionSidJsonResponse =
            JsonRetrieveRecordingTranscriptionSidJsonResponse.builder()
                .accountSid("61bf923e-5e4d-4595-a110-56190ea18a1b")
                .apiVersion("2010-04-01")
                .callSid("v3:KBnLO0ZK3DhKM5s7bE9VluaSmKsOchKht_fUYvxcp8ysbmzCCtpkmA")
                .dateCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dateUpdated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .duration("12")
                .recordingSid("e9cea0be-7dbd-4b98-98b1-c0089d9d43b0")
                .sid("e9cea0be-7dbd-4b98-98b1-c0089d9d43b0")
                .status(JsonRetrieveRecordingTranscriptionSidJsonResponse.Status.COMPLETED)
                .transcriptionText("Good morning, how may I help you?")
                .uri(
                    "/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Transcriptions/b08f0fa1-a32c-4218-b3b5-9cf78941ccac.json"
                )
                .build()

        assertThat(jsonRetrieveRecordingTranscriptionSidJsonResponse.accountSid())
            .contains("61bf923e-5e4d-4595-a110-56190ea18a1b")
        assertThat(jsonRetrieveRecordingTranscriptionSidJsonResponse.apiVersion())
            .contains("2010-04-01")
        assertThat(jsonRetrieveRecordingTranscriptionSidJsonResponse.callSid())
            .contains("v3:KBnLO0ZK3DhKM5s7bE9VluaSmKsOchKht_fUYvxcp8ysbmzCCtpkmA")
        assertThat(jsonRetrieveRecordingTranscriptionSidJsonResponse.dateCreated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(jsonRetrieveRecordingTranscriptionSidJsonResponse.dateUpdated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(jsonRetrieveRecordingTranscriptionSidJsonResponse.duration()).contains("12")
        assertThat(jsonRetrieveRecordingTranscriptionSidJsonResponse.recordingSid())
            .contains("e9cea0be-7dbd-4b98-98b1-c0089d9d43b0")
        assertThat(jsonRetrieveRecordingTranscriptionSidJsonResponse.sid())
            .contains("e9cea0be-7dbd-4b98-98b1-c0089d9d43b0")
        assertThat(jsonRetrieveRecordingTranscriptionSidJsonResponse.status())
            .contains(JsonRetrieveRecordingTranscriptionSidJsonResponse.Status.COMPLETED)
        assertThat(jsonRetrieveRecordingTranscriptionSidJsonResponse.transcriptionText())
            .contains("Good morning, how may I help you?")
        assertThat(jsonRetrieveRecordingTranscriptionSidJsonResponse.uri())
            .contains(
                "/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Transcriptions/b08f0fa1-a32c-4218-b3b5-9cf78941ccac.json"
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val jsonRetrieveRecordingTranscriptionSidJsonResponse =
            JsonRetrieveRecordingTranscriptionSidJsonResponse.builder()
                .accountSid("61bf923e-5e4d-4595-a110-56190ea18a1b")
                .apiVersion("2010-04-01")
                .callSid("v3:KBnLO0ZK3DhKM5s7bE9VluaSmKsOchKht_fUYvxcp8ysbmzCCtpkmA")
                .dateCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dateUpdated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .duration("12")
                .recordingSid("e9cea0be-7dbd-4b98-98b1-c0089d9d43b0")
                .sid("e9cea0be-7dbd-4b98-98b1-c0089d9d43b0")
                .status(JsonRetrieveRecordingTranscriptionSidJsonResponse.Status.COMPLETED)
                .transcriptionText("Good morning, how may I help you?")
                .uri(
                    "/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Transcriptions/b08f0fa1-a32c-4218-b3b5-9cf78941ccac.json"
                )
                .build()

        val roundtrippedJsonRetrieveRecordingTranscriptionSidJsonResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(jsonRetrieveRecordingTranscriptionSidJsonResponse),
                jacksonTypeRef<JsonRetrieveRecordingTranscriptionSidJsonResponse>(),
            )

        assertThat(roundtrippedJsonRetrieveRecordingTranscriptionSidJsonResponse)
            .isEqualTo(jsonRetrieveRecordingTranscriptionSidJsonResponse)
    }
}
