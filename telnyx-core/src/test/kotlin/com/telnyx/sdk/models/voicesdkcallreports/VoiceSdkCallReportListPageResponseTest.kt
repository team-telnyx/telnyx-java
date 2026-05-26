// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.voicesdkcallreports

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VoiceSdkCallReportListPageResponseTest {

    @Test
    fun create() {
        val voiceSdkCallReportListPageResponse =
            VoiceSdkCallReportListPageResponse.builder()
                .addData(
                    VoiceSdkCallReportListResponse.builder()
                        .callId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .callReportId("call_report_id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .flushReason(
                            VoiceSdkCallReportListResponse.FlushReason.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .logsOfVoiceSdkCallReportLogEntries(
                            listOf(
                                VoiceSdkCallReportListResponse.Logs.VoiceSdkCallReportLogEntry
                                    .builder()
                                    .context(
                                        VoiceSdkCallReportListResponse.Logs
                                            .VoiceSdkCallReportLogEntry
                                            .Context
                                            .builder()
                                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                                            .build()
                                    )
                                    .level(
                                        VoiceSdkCallReportListResponse.Logs
                                            .VoiceSdkCallReportLogEntry
                                            .Level
                                            .DEBUG
                                    )
                                    .message("message")
                                    .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .build()
                            )
                        )
                        .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .segment(0L)
                        .statsOfUnnamedSchemaWithArrayParent4s(
                            listOf(
                                VoiceSdkCallReportListResponse.Stats.UnnamedSchemaWithArrayParent4
                                    .builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                        )
                        .storedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .summary(
                            VoiceSdkCallReportListResponse.Summary.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .telnyxLegId("telnyx_leg_id")
                        .telnyxSessionId("telnyx_session_id")
                        .userAgent("user_agent")
                        .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .version("version")
                        .voiceSdkId("voice_sdk_id")
                        .voiceSdkIdDecoded(
                            VoiceSdkCallReportListResponse.VoiceSdkIdDecoded.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .voiceSdkSessionId("voice_sdk_session_id")
                        .build()
                )
                .meta(
                    VoiceSdkCallReportListPageResponse.Meta.builder()
                        .pageNumber(1L)
                        .pageSize(20L)
                        .totalPages(1L)
                        .totalResults(1L)
                        .build()
                )
                .build()

        assertThat(voiceSdkCallReportListPageResponse.data())
            .containsExactly(
                VoiceSdkCallReportListResponse.builder()
                    .callId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .callReportId("call_report_id")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .flushReason(
                        VoiceSdkCallReportListResponse.FlushReason.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .logsOfVoiceSdkCallReportLogEntries(
                        listOf(
                            VoiceSdkCallReportListResponse.Logs.VoiceSdkCallReportLogEntry.builder()
                                .context(
                                    VoiceSdkCallReportListResponse.Logs.VoiceSdkCallReportLogEntry
                                        .Context
                                        .builder()
                                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                                        .build()
                                )
                                .level(
                                    VoiceSdkCallReportListResponse.Logs.VoiceSdkCallReportLogEntry
                                        .Level
                                        .DEBUG
                                )
                                .message("message")
                                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .build()
                        )
                    )
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .segment(0L)
                    .statsOfUnnamedSchemaWithArrayParent4s(
                        listOf(
                            VoiceSdkCallReportListResponse.Stats.UnnamedSchemaWithArrayParent4
                                .builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                    )
                    .storedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .summary(
                        VoiceSdkCallReportListResponse.Summary.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .telnyxLegId("telnyx_leg_id")
                    .telnyxSessionId("telnyx_session_id")
                    .userAgent("user_agent")
                    .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .version("version")
                    .voiceSdkId("voice_sdk_id")
                    .voiceSdkIdDecoded(
                        VoiceSdkCallReportListResponse.VoiceSdkIdDecoded.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .voiceSdkSessionId("voice_sdk_session_id")
                    .build()
            )
        assertThat(voiceSdkCallReportListPageResponse.meta())
            .isEqualTo(
                VoiceSdkCallReportListPageResponse.Meta.builder()
                    .pageNumber(1L)
                    .pageSize(20L)
                    .totalPages(1L)
                    .totalResults(1L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val voiceSdkCallReportListPageResponse =
            VoiceSdkCallReportListPageResponse.builder()
                .addData(
                    VoiceSdkCallReportListResponse.builder()
                        .callId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .callReportId("call_report_id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .flushReason(
                            VoiceSdkCallReportListResponse.FlushReason.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .logsOfVoiceSdkCallReportLogEntries(
                            listOf(
                                VoiceSdkCallReportListResponse.Logs.VoiceSdkCallReportLogEntry
                                    .builder()
                                    .context(
                                        VoiceSdkCallReportListResponse.Logs
                                            .VoiceSdkCallReportLogEntry
                                            .Context
                                            .builder()
                                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                                            .build()
                                    )
                                    .level(
                                        VoiceSdkCallReportListResponse.Logs
                                            .VoiceSdkCallReportLogEntry
                                            .Level
                                            .DEBUG
                                    )
                                    .message("message")
                                    .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .build()
                            )
                        )
                        .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .segment(0L)
                        .statsOfUnnamedSchemaWithArrayParent4s(
                            listOf(
                                VoiceSdkCallReportListResponse.Stats.UnnamedSchemaWithArrayParent4
                                    .builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                        )
                        .storedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .summary(
                            VoiceSdkCallReportListResponse.Summary.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .telnyxLegId("telnyx_leg_id")
                        .telnyxSessionId("telnyx_session_id")
                        .userAgent("user_agent")
                        .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .version("version")
                        .voiceSdkId("voice_sdk_id")
                        .voiceSdkIdDecoded(
                            VoiceSdkCallReportListResponse.VoiceSdkIdDecoded.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .voiceSdkSessionId("voice_sdk_session_id")
                        .build()
                )
                .meta(
                    VoiceSdkCallReportListPageResponse.Meta.builder()
                        .pageNumber(1L)
                        .pageSize(20L)
                        .totalPages(1L)
                        .totalResults(1L)
                        .build()
                )
                .build()

        val roundtrippedVoiceSdkCallReportListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(voiceSdkCallReportListPageResponse),
                jacksonTypeRef<VoiceSdkCallReportListPageResponse>(),
            )

        assertThat(roundtrippedVoiceSdkCallReportListPageResponse)
            .isEqualTo(voiceSdkCallReportListPageResponse)
    }
}
