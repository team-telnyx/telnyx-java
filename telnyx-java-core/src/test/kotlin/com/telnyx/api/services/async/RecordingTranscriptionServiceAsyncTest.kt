// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class RecordingTranscriptionServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val recordingTranscriptionServiceAsync = client.recordingTranscriptions()

        val recordingTranscriptionFuture =
            recordingTranscriptionServiceAsync.retrieve("6a09cdc3-8948-47f0-aa62-74ac943d6c58")

        val recordingTranscription = recordingTranscriptionFuture.get()
        recordingTranscription.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val recordingTranscriptionServiceAsync = client.recordingTranscriptions()

        val recordingTranscriptionsFuture = recordingTranscriptionServiceAsync.list()

        val recordingTranscriptions = recordingTranscriptionsFuture.get()
        recordingTranscriptions.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val recordingTranscriptionServiceAsync = client.recordingTranscriptions()

        val recordingTranscriptionFuture =
            recordingTranscriptionServiceAsync.delete("6a09cdc3-8948-47f0-aa62-74ac943d6c58")

        val recordingTranscription = recordingTranscriptionFuture.get()
        recordingTranscription.validate()
    }
}
