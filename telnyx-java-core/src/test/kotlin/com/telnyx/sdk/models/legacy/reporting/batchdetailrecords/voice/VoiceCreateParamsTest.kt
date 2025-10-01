// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.legacy.reporting.batchdetailrecords.voice

import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VoiceCreateParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertThat(body.endTime()).isEqualTo(OffsetDateTime.parse("2024-02-12T23:59:59Z"))
        assertThat(body.startTime()).isEqualTo(OffsetDateTime.parse("2024-02-01T00:00:00Z"))
        assertThat(body.callTypes().getOrNull()).containsExactly(1, 2)
        assertThat(body.connections().getOrNull()).containsExactly(123L, 456L)
        assertThat(body.fields().getOrNull())
            .containsExactly("call_leg_id", "start_time", "end_time")
        assertThat(body.filters().getOrNull())
            .containsExactly(
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
        assertThat(body.includeAllMetadata()).contains(true)
        assertThat(body.managedAccounts().getOrNull())
            .containsExactly(
                "f47ac10b-58cc-4372-a567-0e02b2c3d479",
                "6ba7b810-9dad-11d1-80b4-00c04fd430c8",
            )
        assertThat(body.recordTypes().getOrNull()).containsExactly(1, 2)
        assertThat(body.reportName()).contains("My CDR Report")
        assertThat(body.selectAllManagedAccounts()).contains(false)
        assertThat(body.source()).contains("calls")
        assertThat(body.timezone()).contains("UTC")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            VoiceCreateParams.builder()
                .endTime(OffsetDateTime.parse("2024-02-12T23:59:59Z"))
                .startTime(OffsetDateTime.parse("2024-02-01T00:00:00Z"))
                .build()

        val body = params._body()

        assertThat(body.endTime()).isEqualTo(OffsetDateTime.parse("2024-02-12T23:59:59Z"))
        assertThat(body.startTime()).isEqualTo(OffsetDateTime.parse("2024-02-01T00:00:00Z"))
    }
}
