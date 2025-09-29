// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.legacy.reporting.batchdetailrecords

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.legacy.reporting.batchdetailrecords.voice.VoiceCreateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class VoiceServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val voiceService = client.legacy().reporting().batchDetailRecords().voice()

        val voice =
            voiceService.create(
                VoiceCreateParams.builder()
                    .endTime(OffsetDateTime.parse("2024-02-12T23:59:59Z"))
                    .startTime(OffsetDateTime.parse("2024-02-01T00:00:00Z"))
                    .addCallType(1)
                    .addCallType(2)
                    .addConnection(123L)
                    .addConnection(456L)
                    .fields(listOf("call_leg_id", "start_time", "end_time"))
                    .addFilter(
                        VoiceCreateParams.Filter.builder()
                            .billingGroup("adfaa016-f921-4b6c-97bb-e4c1dad231c5")
                            .cld("+13129457420")
                            .cldFilter(VoiceCreateParams.Filter.CldFilter.CONTAINS)
                            .cli("+13129457420")
                            .cliFilter(VoiceCreateParams.Filter.CliFilter.CONTAINS)
                            .filterType(VoiceCreateParams.Filter.FilterType.AND)
                            .tagsList("tag1")
                            .build()
                    )
                    .includeAllMetadata(true)
                    .addManagedAccount("f47ac10b-58cc-4372-a567-0e02b2c3d479")
                    .addManagedAccount("6ba7b810-9dad-11d1-80b4-00c04fd430c8")
                    .addRecordType(1)
                    .addRecordType(2)
                    .reportName("My CDR Report")
                    .selectAllManagedAccounts(false)
                    .source("calls")
                    .timezone("UTC")
                    .build()
            )

        voice.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val voiceService = client.legacy().reporting().batchDetailRecords().voice()

        val voice = voiceService.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        voice.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val voiceService = client.legacy().reporting().batchDetailRecords().voice()

        val voices = voiceService.list()

        voices.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val voiceService = client.legacy().reporting().batchDetailRecords().voice()

        val voice = voiceService.delete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        voice.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveFields() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val voiceService = client.legacy().reporting().batchDetailRecords().voice()

        val response = voiceService.retrieveFields()

        response.validate()
    }
}
