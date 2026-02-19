// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.legacy.reporting.batchdetailrecords

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.legacy.reporting.batchdetailrecords.Filter
import com.telnyx.sdk.models.legacy.reporting.batchdetailrecords.voice.VoiceCreateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class VoiceServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val voiceServiceAsync = client.legacy().reporting().batchDetailRecords().voice()

        val voiceFuture =
            voiceServiceAsync.create(
                VoiceCreateParams.builder()
                    .endTime(OffsetDateTime.parse("2024-02-12T23:59:59Z"))
                    .startTime(OffsetDateTime.parse("2024-02-01T00:00:00Z"))
                    .addCallType(1)
                    .addCallType(2)
                    .addConnection(123L)
                    .addConnection(456L)
                    .fields(listOf("call_leg_id", "start_time", "end_time"))
                    .addFilter(
                        Filter.builder()
                            .billingGroup("adfaa016-f921-4b6c-97bb-e4c1dad231c5")
                            .cld("+13129457420")
                            .cldFilter(Filter.CldFilter.CONTAINS)
                            .cli("+13129457420")
                            .cliFilter(Filter.CliFilter.CONTAINS)
                            .filterType(Filter.FilterType.AND)
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

        val voice = voiceFuture.get()
        voice.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val voiceServiceAsync = client.legacy().reporting().batchDetailRecords().voice()

        val voiceFuture = voiceServiceAsync.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val voice = voiceFuture.get()
        voice.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val voiceServiceAsync = client.legacy().reporting().batchDetailRecords().voice()

        val voicesFuture = voiceServiceAsync.list()

        val voices = voicesFuture.get()
        voices.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val voiceServiceAsync = client.legacy().reporting().batchDetailRecords().voice()

        val voiceFuture = voiceServiceAsync.delete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val voice = voiceFuture.get()
        voice.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveFields() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val voiceServiceAsync = client.legacy().reporting().batchDetailRecords().voice()

        val responseFuture = voiceServiceAsync.retrieveFields()

        val response = responseFuture.get()
        response.validate()
    }
}
