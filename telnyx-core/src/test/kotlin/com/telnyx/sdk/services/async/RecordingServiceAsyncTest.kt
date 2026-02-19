// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class RecordingServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val recordingServiceAsync = client.recordings()

        val recordingFuture = recordingServiceAsync.retrieve("recording_id")

        val recording = recordingFuture.get()
        recording.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val recordingServiceAsync = client.recordings()

        val pageFuture = recordingServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val recordingServiceAsync = client.recordings()

        val recordingFuture = recordingServiceAsync.delete("recording_id")

        val recording = recordingFuture.get()
        recording.validate()
    }
}
