// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.texml.accounts.calls

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.texml.accounts.calls.recordingsjson.RecordingsJsonRecordingsJsonParams
import com.telnyx.sdk.models.texml.accounts.calls.recordingsjson.RecordingsJsonRetrieveRecordingsJsonParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class RecordingsJsonServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun recordingsJson() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val recordingsJsonServiceAsync = client.texml().accounts().calls().recordingsJson()

        val responseFuture =
            recordingsJsonServiceAsync.recordingsJson(
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

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveRecordingsJson() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val recordingsJsonServiceAsync = client.texml().accounts().calls().recordingsJson()

        val responseFuture =
            recordingsJsonServiceAsync.retrieveRecordingsJson(
                RecordingsJsonRetrieveRecordingsJsonParams.builder()
                    .accountSid("account_sid")
                    .callSid("call_sid")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
