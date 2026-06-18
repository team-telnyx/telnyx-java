// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.voicesdkcallreports

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VoiceSdkCallReportListResponseTest {

    @Test
    fun create() {
        val voiceSdkCallReportListResponse =
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
                                VoiceSdkCallReportListResponse.Logs.VoiceSdkCallReportLogEntry.Level
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
                        VoiceSdkCallReportListResponse.Stats.UnnamedSchemaWithArrayParent4.builder()
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

        assertThat(voiceSdkCallReportListResponse.callId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(voiceSdkCallReportListResponse.callReportId()).contains("call_report_id")
        assertThat(voiceSdkCallReportListResponse.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(voiceSdkCallReportListResponse.flushReason())
            .contains(
                VoiceSdkCallReportListResponse.FlushReason.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(voiceSdkCallReportListResponse.logs())
            .contains(
                VoiceSdkCallReportListResponse.Logs.ofVoiceSdkCallReportLogEntries(
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
                                VoiceSdkCallReportListResponse.Logs.VoiceSdkCallReportLogEntry.Level
                                    .DEBUG
                            )
                            .message("message")
                            .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                )
            )
        assertThat(voiceSdkCallReportListResponse.organizationId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(voiceSdkCallReportListResponse.segment()).contains(0L)
        assertThat(voiceSdkCallReportListResponse.stats())
            .contains(
                VoiceSdkCallReportListResponse.Stats.ofUnnamedSchemaWithArrayParent4s(
                    listOf(
                        VoiceSdkCallReportListResponse.Stats.UnnamedSchemaWithArrayParent4.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                )
            )
        assertThat(voiceSdkCallReportListResponse.storedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(voiceSdkCallReportListResponse.summary())
            .contains(
                VoiceSdkCallReportListResponse.Summary.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(voiceSdkCallReportListResponse.telnyxLegId()).contains("telnyx_leg_id")
        assertThat(voiceSdkCallReportListResponse.telnyxSessionId()).contains("telnyx_session_id")
        assertThat(voiceSdkCallReportListResponse.userAgent()).contains("user_agent")
        assertThat(voiceSdkCallReportListResponse.userId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(voiceSdkCallReportListResponse.version()).contains("version")
        assertThat(voiceSdkCallReportListResponse.voiceSdkId()).contains("voice_sdk_id")
        assertThat(voiceSdkCallReportListResponse.voiceSdkIdDecoded())
            .contains(
                VoiceSdkCallReportListResponse.VoiceSdkIdDecoded.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(voiceSdkCallReportListResponse.voiceSdkSessionId())
            .contains("voice_sdk_session_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val voiceSdkCallReportListResponse =
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
                                VoiceSdkCallReportListResponse.Logs.VoiceSdkCallReportLogEntry.Level
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
                        VoiceSdkCallReportListResponse.Stats.UnnamedSchemaWithArrayParent4.builder()
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

        val roundtrippedVoiceSdkCallReportListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(voiceSdkCallReportListResponse),
                jacksonTypeRef<VoiceSdkCallReportListResponse>(),
            )

        assertThat(roundtrippedVoiceSdkCallReportListResponse)
            .isEqualTo(voiceSdkCallReportListResponse)
    }
}
