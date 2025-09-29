// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async.legacy.reporting.usagereports

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.api.models.legacy.reporting.usagereports.voice.VoiceCreateParams
import com.telnyx.api.models.legacy.reporting.usagereports.voice.VoiceListParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class VoiceServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val voiceServiceAsync = client.legacy().reporting().usageReports().voice()

        val voiceFuture =
            voiceServiceAsync.create(
                VoiceCreateParams.builder()
                    .endTime(OffsetDateTime.parse("2024-02-01T00:00:00Z"))
                    .startTime(OffsetDateTime.parse("2024-02-01T00:00:00Z"))
                    .aggregationType(0)
                    .addConnection(123L)
                    .addConnection(456L)
                    .addManagedAccount("f47ac10b-58cc-4372-a567-0e02b2c3d479")
                    .addManagedAccount("6ba7b810-9dad-11d1-80b4-00c04fd430c8")
                    .productBreakdown(0)
                    .selectAllManagedAccounts(false)
                    .build()
            )

        val voice = voiceFuture.get()
        voice.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val voiceServiceAsync = client.legacy().reporting().usageReports().voice()

        val voiceFuture = voiceServiceAsync.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val voice = voiceFuture.get()
        voice.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val voiceServiceAsync = client.legacy().reporting().usageReports().voice()

        val voicesFuture =
            voiceServiceAsync.list(VoiceListParams.builder().page(1).perPage(1).build())

        val voices = voicesFuture.get()
        voices.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val voiceServiceAsync = client.legacy().reporting().usageReports().voice()

        val voiceFuture = voiceServiceAsync.delete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val voice = voiceFuture.get()
        voice.validate()
    }
}
