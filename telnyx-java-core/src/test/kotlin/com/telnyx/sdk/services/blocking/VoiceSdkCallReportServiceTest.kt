// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class VoiceSdkCallReportServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val voiceSdkCallReportService = client.voiceSdkCallReports()

        val voiceSdkCallReports =
            voiceSdkCallReportService.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        voiceSdkCallReports.forEach { it.validate() }
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val voiceSdkCallReportService = client.voiceSdkCallReports()

        val page = voiceSdkCallReportService.list()

        page.response().validate()
    }
}
