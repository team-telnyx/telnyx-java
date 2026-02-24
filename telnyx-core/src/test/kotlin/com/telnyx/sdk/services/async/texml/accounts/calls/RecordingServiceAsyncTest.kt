// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.texml.accounts.calls

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.texml.accounts.calls.recordings.RecordingRecordingSidJsonParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class RecordingServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun recordingSidJson() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val recordingServiceAsync = client.texml().accounts().calls().recordings()

        val responseFuture =
            recordingServiceAsync.recordingSidJson(
                RecordingRecordingSidJsonParams.builder()
                    .accountSid("account_sid")
                    .callSid("call_sid")
                    .recordingSid("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .status(RecordingRecordingSidJsonParams.Status.PAUSED)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
