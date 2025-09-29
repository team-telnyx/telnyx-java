// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async.texml.accounts.transcriptions

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.api.models.texml.accounts.transcriptions.json.JsonDeleteRecordingTranscriptionSidJsonParams
import com.telnyx.api.models.texml.accounts.transcriptions.json.JsonRetrieveRecordingTranscriptionSidJsonParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class JsonServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun deleteRecordingTranscriptionSidJson() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val jsonServiceAsync = client.texml().accounts().transcriptions().json()

        val future =
            jsonServiceAsync.deleteRecordingTranscriptionSidJson(
                JsonDeleteRecordingTranscriptionSidJsonParams.builder()
                    .accountSid("account_sid")
                    .recordingTranscriptionSid("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .build()
            )

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveRecordingTranscriptionSidJson() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val jsonServiceAsync = client.texml().accounts().transcriptions().json()

        val responseFuture =
            jsonServiceAsync.retrieveRecordingTranscriptionSidJson(
                JsonRetrieveRecordingTranscriptionSidJsonParams.builder()
                    .accountSid("account_sid")
                    .recordingTranscriptionSid("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
