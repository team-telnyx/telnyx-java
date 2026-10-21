// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.texml.accounts.transcriptions

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.texml.accounts.transcriptions.json.JsonDeleteRecordingTranscriptionSidJsonParams
import com.telnyx.sdk.models.texml.accounts.transcriptions.json.JsonRetrieveRecordingTranscriptionSidJsonParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class JsonServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun deleteRecordingTranscriptionSidJson() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val jsonServiceAsync = client.texml().accounts().transcriptions().json()

        val future =
            jsonServiceAsync.deleteRecordingTranscriptionSidJson(
                JsonDeleteRecordingTranscriptionSidJsonParams.builder()
                    .accountSid("f5586561-8ff0-4291-a51b-c7dfe4139ff9")
                    .recordingTranscriptionSid("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .build()
            )

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveRecordingTranscriptionSidJson() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val jsonServiceAsync = client.texml().accounts().transcriptions().json()

        val texmlRecordingTranscriptionFuture =
            jsonServiceAsync.retrieveRecordingTranscriptionSidJson(
                JsonRetrieveRecordingTranscriptionSidJsonParams.builder()
                    .accountSid("f5586561-8ff0-4291-a51b-c7dfe4139ff9")
                    .recordingTranscriptionSid("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .build()
            )

        val texmlRecordingTranscription = texmlRecordingTranscriptionFuture.get()
        texmlRecordingTranscription.validate()
    }
}
