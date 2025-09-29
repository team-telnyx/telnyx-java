// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class RecordingTranscriptionServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val recordingTranscriptionService = client.recordingTranscriptions()

        val recordingTranscription =
            recordingTranscriptionService.retrieve("6a09cdc3-8948-47f0-aa62-74ac943d6c58")

        recordingTranscription.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val recordingTranscriptionService = client.recordingTranscriptions()

        val recordingTranscriptions = recordingTranscriptionService.list()

        recordingTranscriptions.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val recordingTranscriptionService = client.recordingTranscriptions()

        val recordingTranscription =
            recordingTranscriptionService.delete("6a09cdc3-8948-47f0-aa62-74ac943d6c58")

        recordingTranscription.validate()
    }
}
