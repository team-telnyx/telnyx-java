// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.legacy.reporting.batchdetailrecords

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.legacy.reporting.batchdetailrecords.speechtotext.SpeechToTextCreateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SpeechToTextServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val speechToTextService = client.legacy().reporting().batchDetailRecords().speechToText()

        val speechToText =
            speechToTextService.create(
                SpeechToTextCreateParams.builder()
                    .endDate(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
                    .startDate(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
                    .build()
            )

        speechToText.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val speechToTextService = client.legacy().reporting().batchDetailRecords().speechToText()

        val speechToText = speechToTextService.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        speechToText.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val speechToTextService = client.legacy().reporting().batchDetailRecords().speechToText()

        val speechToTexts = speechToTextService.list()

        speechToTexts.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val speechToTextService = client.legacy().reporting().batchDetailRecords().speechToText()

        val speechToText = speechToTextService.delete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        speechToText.validate()
    }
}
