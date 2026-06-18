// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class VoiceSdkCallReportServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val voiceSdkCallReportServiceAsync = client.voiceSdkCallReports()

        val voiceSdkCallReportsFuture =
            voiceSdkCallReportServiceAsync.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val voiceSdkCallReports = voiceSdkCallReportsFuture.get()
        voiceSdkCallReports.forEach { it.validate() }
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val voiceSdkCallReportServiceAsync = client.voiceSdkCallReports()

        val pageFuture = voiceSdkCallReportServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }
}
