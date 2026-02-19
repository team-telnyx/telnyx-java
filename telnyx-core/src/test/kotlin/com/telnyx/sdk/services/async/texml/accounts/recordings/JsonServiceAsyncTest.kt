// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.texml.accounts.recordings

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.texml.accounts.recordings.json.JsonDeleteRecordingSidJsonParams
import com.telnyx.sdk.models.texml.accounts.recordings.json.JsonRetrieveRecordingSidJsonParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class JsonServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun deleteRecordingSidJson() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val jsonServiceAsync = client.texml().accounts().recordings().json()

        val future =
            jsonServiceAsync.deleteRecordingSidJson(
                JsonDeleteRecordingSidJsonParams.builder()
                    .accountSid("account_sid")
                    .recordingSid("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .build()
            )

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveRecordingSidJson() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val jsonServiceAsync = client.texml().accounts().recordings().json()

        val texmlGetCallRecordingResponseBodyFuture =
            jsonServiceAsync.retrieveRecordingSidJson(
                JsonRetrieveRecordingSidJsonParams.builder()
                    .accountSid("account_sid")
                    .recordingSid("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .build()
            )

        val texmlGetCallRecordingResponseBody = texmlGetCallRecordingResponseBodyFuture.get()
        texmlGetCallRecordingResponseBody.validate()
    }
}
