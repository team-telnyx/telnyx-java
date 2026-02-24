// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class RecordingTranscriptionServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val recordingTranscriptionServiceAsync = client.recordingTranscriptions()

        val recordingTranscriptionFuture =
            recordingTranscriptionServiceAsync.retrieve("6a09cdc3-8948-47f0-aa62-74ac943d6c58")

        val recordingTranscription = recordingTranscriptionFuture.get()
        recordingTranscription.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val recordingTranscriptionServiceAsync = client.recordingTranscriptions()

        val recordingTranscriptionsFuture = recordingTranscriptionServiceAsync.list()

        val recordingTranscriptions = recordingTranscriptionsFuture.get()
        recordingTranscriptions.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val recordingTranscriptionServiceAsync = client.recordingTranscriptions()

        val recordingTranscriptionFuture =
            recordingTranscriptionServiceAsync.delete("6a09cdc3-8948-47f0-aa62-74ac943d6c58")

        val recordingTranscription = recordingTranscriptionFuture.get()
        recordingTranscription.validate()
    }
}
