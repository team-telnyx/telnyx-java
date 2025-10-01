// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.texml.accounts.calls

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.texml.accounts.calls.recordings.RecordingRecordingSidJsonParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class RecordingServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun recordingSidJson() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val recordingService = client.texml().accounts().calls().recordings()

        val response =
            recordingService.recordingSidJson(
                RecordingRecordingSidJsonParams.builder()
                    .accountSid("account_sid")
                    .callSid("call_sid")
                    .recordingSid("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .status(RecordingRecordingSidJsonParams.Status.PAUSED)
                    .build()
            )

        response.validate()
    }
}
