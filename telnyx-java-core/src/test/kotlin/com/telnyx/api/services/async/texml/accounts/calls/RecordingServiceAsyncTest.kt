// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async.texml.accounts.calls

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.api.models.texml.accounts.calls.recordings.RecordingRecordingSidJsonParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class RecordingServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun recordingSidJson() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
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
