// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.texml.accounts.transcriptions.json

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TexmlRecordingTranscriptionTest {

    @Test
    fun create() {
        val texmlRecordingTranscription =
            TexmlRecordingTranscription.builder()
                .accountSid("61bf923e-5e4d-4595-a110-56190ea18a1b")
                .apiVersion("2010-04-01")
                .callSid("v3:KBnLO0ZK3DhKM5s7bE9VluaSmKsOchKht_fUYvxcp8ysbmzCCtpkmA")
                .dateCreated(OffsetDateTime.parse("2023-08-11T19:12:11Z"))
                .dateUpdated(OffsetDateTime.parse("2023-08-11T19:12:11Z"))
                .duration("12")
                .recordingSid("e9cea0be-7dbd-4b98-98b1-c0089d9d43b0")
                .sid("e9cea0be-7dbd-4b98-98b1-c0089d9d43b0")
                .status(TexmlRecordingTranscription.Status.COMPLETED)
                .transcriptionText("Good morning, how may I help you?")
                .uri(
                    "/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Transcriptions/b08f0fa1-a32c-4218-b3b5-9cf78941ccac.json"
                )
                .build()

        assertThat(texmlRecordingTranscription.accountSid())
            .contains("61bf923e-5e4d-4595-a110-56190ea18a1b")
        assertThat(texmlRecordingTranscription.apiVersion()).contains("2010-04-01")
        assertThat(texmlRecordingTranscription.callSid())
            .contains("v3:KBnLO0ZK3DhKM5s7bE9VluaSmKsOchKht_fUYvxcp8ysbmzCCtpkmA")
        assertThat(texmlRecordingTranscription.dateCreated())
            .contains(OffsetDateTime.parse("2023-08-11T19:12:11Z"))
        assertThat(texmlRecordingTranscription.dateUpdated())
            .contains(OffsetDateTime.parse("2023-08-11T19:12:11Z"))
        assertThat(texmlRecordingTranscription.duration()).contains("12")
        assertThat(texmlRecordingTranscription.recordingSid())
            .contains("e9cea0be-7dbd-4b98-98b1-c0089d9d43b0")
        assertThat(texmlRecordingTranscription.sid())
            .contains("e9cea0be-7dbd-4b98-98b1-c0089d9d43b0")
        assertThat(texmlRecordingTranscription.status())
            .contains(TexmlRecordingTranscription.Status.COMPLETED)
        assertThat(texmlRecordingTranscription.transcriptionText())
            .contains("Good morning, how may I help you?")
        assertThat(texmlRecordingTranscription.uri())
            .contains(
                "/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Transcriptions/b08f0fa1-a32c-4218-b3b5-9cf78941ccac.json"
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val texmlRecordingTranscription =
            TexmlRecordingTranscription.builder()
                .accountSid("61bf923e-5e4d-4595-a110-56190ea18a1b")
                .apiVersion("2010-04-01")
                .callSid("v3:KBnLO0ZK3DhKM5s7bE9VluaSmKsOchKht_fUYvxcp8ysbmzCCtpkmA")
                .dateCreated(OffsetDateTime.parse("2023-08-11T19:12:11Z"))
                .dateUpdated(OffsetDateTime.parse("2023-08-11T19:12:11Z"))
                .duration("12")
                .recordingSid("e9cea0be-7dbd-4b98-98b1-c0089d9d43b0")
                .sid("e9cea0be-7dbd-4b98-98b1-c0089d9d43b0")
                .status(TexmlRecordingTranscription.Status.COMPLETED)
                .transcriptionText("Good morning, how may I help you?")
                .uri(
                    "/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Transcriptions/b08f0fa1-a32c-4218-b3b5-9cf78941ccac.json"
                )
                .build()

        val roundtrippedTexmlRecordingTranscription =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(texmlRecordingTranscription),
                jacksonTypeRef<TexmlRecordingTranscription>(),
            )

        assertThat(roundtrippedTexmlRecordingTranscription).isEqualTo(texmlRecordingTranscription)
    }
}
