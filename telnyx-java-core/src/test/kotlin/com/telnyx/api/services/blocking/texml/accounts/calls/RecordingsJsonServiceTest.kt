// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking.texml.accounts.calls

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClient
import com.telnyx.api.models.texml.accounts.calls.recordingsjson.RecordingsJsonRecordingsJsonParams
import com.telnyx.api.models.texml.accounts.calls.recordingsjson.RecordingsJsonRetrieveRecordingsJsonParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class RecordingsJsonServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun recordingsJson() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val recordingsJsonService = client.texml().accounts().calls().recordingsJson()

        val response =
            recordingsJsonService.recordingsJson(
                RecordingsJsonRecordingsJsonParams.builder()
                    .accountSid("account_sid")
                    .callSid("call_sid")
                    .playBeep(false)
                    .recordingChannels(RecordingsJsonRecordingsJsonParams.RecordingChannels.SINGLE)
                    .recordingStatusCallback("http://webhook.com/callback")
                    .recordingStatusCallbackEvent("in-progress completed absent")
                    .recordingStatusCallbackMethod(
                        RecordingsJsonRecordingsJsonParams.RecordingStatusCallbackMethod.GET
                    )
                    .recordingTrack(RecordingsJsonRecordingsJsonParams.RecordingTrack.INBOUND)
                    .sendRecordingUrl(false)
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveRecordingsJson() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val recordingsJsonService = client.texml().accounts().calls().recordingsJson()

        val response =
            recordingsJsonService.retrieveRecordingsJson(
                RecordingsJsonRetrieveRecordingsJsonParams.builder()
                    .accountSid("account_sid")
                    .callSid("call_sid")
                    .build()
            )

        response.validate()
    }
}
