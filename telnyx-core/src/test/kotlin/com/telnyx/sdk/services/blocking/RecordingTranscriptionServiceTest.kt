// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class RecordingTranscriptionServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val recordingTranscriptionService = client.recordingTranscriptions()

        val recordingTranscription =
            recordingTranscriptionService.retrieve("6a09cdc3-8948-47f0-aa62-74ac943d6c58")

        recordingTranscription.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val recordingTranscriptionService = client.recordingTranscriptions()

        val recordingTranscriptions = recordingTranscriptionService.list()

        recordingTranscriptions.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val recordingTranscriptionService = client.recordingTranscriptions()

        val recordingTranscription =
            recordingTranscriptionService.delete("6a09cdc3-8948-47f0-aa62-74ac943d6c58")

        recordingTranscription.validate()
    }
}
