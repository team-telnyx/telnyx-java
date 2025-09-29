// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async.legacy.reporting.batchdetailrecords

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.api.models.legacy.reporting.batchdetailrecords.speechtotext.SpeechToTextCreateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SpeechToTextServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val speechToTextServiceAsync =
            client.legacy().reporting().batchDetailRecords().speechToText()

        val speechToTextFuture =
            speechToTextServiceAsync.create(
                SpeechToTextCreateParams.builder()
                    .endDate(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
                    .startDate(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
                    .build()
            )

        val speechToText = speechToTextFuture.get()
        speechToText.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val speechToTextServiceAsync =
            client.legacy().reporting().batchDetailRecords().speechToText()

        val speechToTextFuture =
            speechToTextServiceAsync.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val speechToText = speechToTextFuture.get()
        speechToText.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val speechToTextServiceAsync =
            client.legacy().reporting().batchDetailRecords().speechToText()

        val speechToTextsFuture = speechToTextServiceAsync.list()

        val speechToTexts = speechToTextsFuture.get()
        speechToTexts.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val speechToTextServiceAsync =
            client.legacy().reporting().batchDetailRecords().speechToText()

        val speechToTextFuture =
            speechToTextServiceAsync.delete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val speechToText = speechToTextFuture.get()
        speechToText.validate()
    }
}
