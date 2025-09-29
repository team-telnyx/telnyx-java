// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.legacy.reporting.batchdetailrecords.voice

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VoiceRetrieveResponseTest {

    @Test
    fun create() {
        val voiceRetrieveResponse =
            VoiceRetrieveResponse.builder()
                .data(
                    VoiceRetrieveResponse.Data.builder()
                        .id("123e4567-e89b-12d3-a456-426614174000")
                        .addCallType(0)
                        .addConnection(123L)
                        .addConnection(456L)
                        .createdAt("2024-02-12T14:00:00Z")
                        .endTime("2024-02-12T23:59:59Z")
                        .addFilter(
                            VoiceRetrieveResponse.Data.Filter.builder()
                                .billingGroup("adfaa016-f921-4b6c-97bb-e4c1dad231c5")
                                .cld("+13129457420")
                                .cldFilter(VoiceRetrieveResponse.Data.Filter.CldFilter.CONTAINS)
                                .cli("+13129457420")
                                .cliFilter(VoiceRetrieveResponse.Data.Filter.CliFilter.CONTAINS)
                                .filterType(VoiceRetrieveResponse.Data.Filter.FilterType.AND)
                                .tagsList("tag1")
                                .build()
                        )
                        .addManagedAccount("f47ac10b-58cc-4372-a567-0e02b2c3d479")
                        .addManagedAccount("6ba7b810-9dad-11d1-80b4-00c04fd430c8")
                        .recordType("cdr_detailed_report")
                        .addRecordType(1)
                        .addRecordType(2)
                        .reportName("My Report")
                        .reportUrl("report_url")
                        .retry(0)
                        .source("source")
                        .startTime("2024-02-01T00:00:00Z")
                        .status(1)
                        .timezone("timezone")
                        .updatedAt("2024-02-12T14:05:00Z")
                        .build()
                )
                .build()

        assertThat(voiceRetrieveResponse.data())
            .contains(
                VoiceRetrieveResponse.Data.builder()
                    .id("123e4567-e89b-12d3-a456-426614174000")
                    .addCallType(0)
                    .addConnection(123L)
                    .addConnection(456L)
                    .createdAt("2024-02-12T14:00:00Z")
                    .endTime("2024-02-12T23:59:59Z")
                    .addFilter(
                        VoiceRetrieveResponse.Data.Filter.builder()
                            .billingGroup("adfaa016-f921-4b6c-97bb-e4c1dad231c5")
                            .cld("+13129457420")
                            .cldFilter(VoiceRetrieveResponse.Data.Filter.CldFilter.CONTAINS)
                            .cli("+13129457420")
                            .cliFilter(VoiceRetrieveResponse.Data.Filter.CliFilter.CONTAINS)
                            .filterType(VoiceRetrieveResponse.Data.Filter.FilterType.AND)
                            .tagsList("tag1")
                            .build()
                    )
                    .addManagedAccount("f47ac10b-58cc-4372-a567-0e02b2c3d479")
                    .addManagedAccount("6ba7b810-9dad-11d1-80b4-00c04fd430c8")
                    .recordType("cdr_detailed_report")
                    .addRecordType(1)
                    .addRecordType(2)
                    .reportName("My Report")
                    .reportUrl("report_url")
                    .retry(0)
                    .source("source")
                    .startTime("2024-02-01T00:00:00Z")
                    .status(1)
                    .timezone("timezone")
                    .updatedAt("2024-02-12T14:05:00Z")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val voiceRetrieveResponse =
            VoiceRetrieveResponse.builder()
                .data(
                    VoiceRetrieveResponse.Data.builder()
                        .id("123e4567-e89b-12d3-a456-426614174000")
                        .addCallType(0)
                        .addConnection(123L)
                        .addConnection(456L)
                        .createdAt("2024-02-12T14:00:00Z")
                        .endTime("2024-02-12T23:59:59Z")
                        .addFilter(
                            VoiceRetrieveResponse.Data.Filter.builder()
                                .billingGroup("adfaa016-f921-4b6c-97bb-e4c1dad231c5")
                                .cld("+13129457420")
                                .cldFilter(VoiceRetrieveResponse.Data.Filter.CldFilter.CONTAINS)
                                .cli("+13129457420")
                                .cliFilter(VoiceRetrieveResponse.Data.Filter.CliFilter.CONTAINS)
                                .filterType(VoiceRetrieveResponse.Data.Filter.FilterType.AND)
                                .tagsList("tag1")
                                .build()
                        )
                        .addManagedAccount("f47ac10b-58cc-4372-a567-0e02b2c3d479")
                        .addManagedAccount("6ba7b810-9dad-11d1-80b4-00c04fd430c8")
                        .recordType("cdr_detailed_report")
                        .addRecordType(1)
                        .addRecordType(2)
                        .reportName("My Report")
                        .reportUrl("report_url")
                        .retry(0)
                        .source("source")
                        .startTime("2024-02-01T00:00:00Z")
                        .status(1)
                        .timezone("timezone")
                        .updatedAt("2024-02-12T14:05:00Z")
                        .build()
                )
                .build()

        val roundtrippedVoiceRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(voiceRetrieveResponse),
                jacksonTypeRef<VoiceRetrieveResponse>(),
            )

        assertThat(roundtrippedVoiceRetrieveResponse).isEqualTo(voiceRetrieveResponse)
    }
}
