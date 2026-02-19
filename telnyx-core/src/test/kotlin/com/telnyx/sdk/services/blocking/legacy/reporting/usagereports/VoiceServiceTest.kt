// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.legacy.reporting.usagereports

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.legacy.reporting.usagereports.voice.VoiceCreateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class VoiceServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val voiceService = client.legacy().reporting().usageReports().voice()

        val voice =
            voiceService.create(
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

        voice.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val voiceService = client.legacy().reporting().usageReports().voice()

        val voice = voiceService.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        voice.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val voiceService = client.legacy().reporting().usageReports().voice()

        val page = voiceService.list()

        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val voiceService = client.legacy().reporting().usageReports().voice()

        val voice = voiceService.delete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        voice.validate()
    }
}
