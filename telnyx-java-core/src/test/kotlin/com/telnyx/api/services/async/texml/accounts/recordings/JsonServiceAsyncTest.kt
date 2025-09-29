// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async.texml.accounts.recordings

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.api.models.texml.accounts.recordings.json.JsonDeleteRecordingSidJsonParams
import com.telnyx.api.models.texml.accounts.recordings.json.JsonRetrieveRecordingSidJsonParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class JsonServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun deleteRecordingSidJson() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
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
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
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
