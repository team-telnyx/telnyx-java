// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.texml.accounts.transcriptions

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.texml.accounts.transcriptions.json.JsonDeleteRecordingTranscriptionSidJsonParams
import com.telnyx.sdk.models.texml.accounts.transcriptions.json.JsonRetrieveRecordingTranscriptionSidJsonParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class JsonServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun deleteRecordingTranscriptionSidJson() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val jsonService = client.texml().accounts().transcriptions().json()

        jsonService.deleteRecordingTranscriptionSidJson(
            JsonDeleteRecordingTranscriptionSidJsonParams.builder()
                .accountSid("account_sid")
                .recordingTranscriptionSid("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .build()
        )
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveRecordingTranscriptionSidJson() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val jsonService = client.texml().accounts().transcriptions().json()

        val response =
            jsonService.retrieveRecordingTranscriptionSidJson(
                JsonRetrieveRecordingTranscriptionSidJsonParams.builder()
                    .accountSid("account_sid")
                    .recordingTranscriptionSid("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .build()
            )

        response.validate()
    }
}
