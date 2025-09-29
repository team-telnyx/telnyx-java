// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.legacy.reporting.batchdetailrecords.voice

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VoiceListResponseTest {

    @Test
    fun create() {
        val voiceListResponse =
            VoiceListResponse.builder()
                .addData(
                    VoiceListResponse.Data.builder()
                        .id("123e4567-e89b-12d3-a456-426614174000")
                        .addCallType(0)
                        .addConnection(123L)
                        .addConnection(456L)
                        .createdAt("2024-02-12T14:00:00Z")
                        .endTime("2024-02-12T23:59:59Z")
                        .addFilter(
                            VoiceListResponse.Data.Filter.builder()
                                .billingGroup("adfaa016-f921-4b6c-97bb-e4c1dad231c5")
                                .cld("+13129457420")
                                .cldFilter(VoiceListResponse.Data.Filter.CldFilter.CONTAINS)
                                .cli("+13129457420")
                                .cliFilter(VoiceListResponse.Data.Filter.CliFilter.CONTAINS)
                                .filterType(VoiceListResponse.Data.Filter.FilterType.AND)
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
                .meta(
                    VoiceListResponse.Meta.builder()
                        .pageNumber(2)
                        .pageSize(25)
                        .totalPages(3)
                        .totalResults(55)
                        .build()
                )
                .build()

        assertThat(voiceListResponse.data().getOrNull())
            .containsExactly(
                VoiceListResponse.Data.builder()
                    .id("123e4567-e89b-12d3-a456-426614174000")
                    .addCallType(0)
                    .addConnection(123L)
                    .addConnection(456L)
                    .createdAt("2024-02-12T14:00:00Z")
                    .endTime("2024-02-12T23:59:59Z")
                    .addFilter(
                        VoiceListResponse.Data.Filter.builder()
                            .billingGroup("adfaa016-f921-4b6c-97bb-e4c1dad231c5")
                            .cld("+13129457420")
                            .cldFilter(VoiceListResponse.Data.Filter.CldFilter.CONTAINS)
                            .cli("+13129457420")
                            .cliFilter(VoiceListResponse.Data.Filter.CliFilter.CONTAINS)
                            .filterType(VoiceListResponse.Data.Filter.FilterType.AND)
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
        assertThat(voiceListResponse.meta())
            .contains(
                VoiceListResponse.Meta.builder()
                    .pageNumber(2)
                    .pageSize(25)
                    .totalPages(3)
                    .totalResults(55)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val voiceListResponse =
            VoiceListResponse.builder()
                .addData(
                    VoiceListResponse.Data.builder()
                        .id("123e4567-e89b-12d3-a456-426614174000")
                        .addCallType(0)
                        .addConnection(123L)
                        .addConnection(456L)
                        .createdAt("2024-02-12T14:00:00Z")
                        .endTime("2024-02-12T23:59:59Z")
                        .addFilter(
                            VoiceListResponse.Data.Filter.builder()
                                .billingGroup("adfaa016-f921-4b6c-97bb-e4c1dad231c5")
                                .cld("+13129457420")
                                .cldFilter(VoiceListResponse.Data.Filter.CldFilter.CONTAINS)
                                .cli("+13129457420")
                                .cliFilter(VoiceListResponse.Data.Filter.CliFilter.CONTAINS)
                                .filterType(VoiceListResponse.Data.Filter.FilterType.AND)
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
                .meta(
                    VoiceListResponse.Meta.builder()
                        .pageNumber(2)
                        .pageSize(25)
                        .totalPages(3)
                        .totalResults(55)
                        .build()
                )
                .build()

        val roundtrippedVoiceListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(voiceListResponse),
                jacksonTypeRef<VoiceListResponse>(),
            )

        assertThat(roundtrippedVoiceListResponse).isEqualTo(voiceListResponse)
    }
}
