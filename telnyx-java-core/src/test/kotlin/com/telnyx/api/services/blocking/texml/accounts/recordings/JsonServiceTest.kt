// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking.texml.accounts.recordings

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClient
import com.telnyx.api.models.texml.accounts.recordings.json.JsonDeleteRecordingSidJsonParams
import com.telnyx.api.models.texml.accounts.recordings.json.JsonRetrieveRecordingSidJsonParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class JsonServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun deleteRecordingSidJson() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val jsonService = client.texml().accounts().recordings().json()

        jsonService.deleteRecordingSidJson(
            JsonDeleteRecordingSidJsonParams.builder()
                .accountSid("account_sid")
                .recordingSid("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .build()
        )
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveRecordingSidJson() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
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
