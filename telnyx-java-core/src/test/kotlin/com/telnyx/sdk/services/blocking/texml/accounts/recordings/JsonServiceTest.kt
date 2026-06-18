// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.texml.accounts.recordings

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.texml.accounts.recordings.json.JsonDeleteRecordingSidJsonParams
import com.telnyx.sdk.models.texml.accounts.recordings.json.JsonRetrieveRecordingSidJsonParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class JsonServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun deleteRecordingSidJson() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val jsonService = client.texml().accounts().recordings().json()

        jsonService.deleteRecordingSidJson(
            JsonDeleteRecordingSidJsonParams.builder()
                .accountSid("account_sid")
                .recordingSid("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveRecordingSidJson() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val jsonService = client.texml().accounts().recordings().json()

        val texmlGetCallRecordingResponseBody =
            jsonService.retrieveRecordingSidJson(
                JsonRetrieveRecordingSidJsonParams.builder()
                    .accountSid("account_sid")
                    .recordingSid("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .build()
            )

        texmlGetCallRecordingResponseBody.validate()
    }
}
