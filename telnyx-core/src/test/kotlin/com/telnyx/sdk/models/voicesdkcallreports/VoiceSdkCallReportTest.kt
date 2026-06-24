// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.voicesdkcallreports

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VoiceSdkCallReportTest {

    @Test
    fun create() {
        val voiceSdkCallReport =
            VoiceSdkCallReport.builder()
                .callId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .callReportId("call_report_id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .flushReason(
                    VoiceSdkCallReport.FlushReason.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .logsOfVoiceSdkCallReportLogEntries(
                    listOf(
                        VoiceSdkCallReportLogEntry.builder()
                            .context(
                                VoiceSdkCallReportLogEntry.Context.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .level(VoiceSdkCallReportLogEntry.Level.DEBUG)
                            .message("message")
                            .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                )
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .segment(0L)
                .statsOfUnnamedSchemaWithArrayParent0s(
                    listOf(
                        VoiceSdkCallReport.Stats.UnnamedSchemaWithArrayParent0.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                )
                .storedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .summary(
                    VoiceSdkCallReport.Summary.builder()
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
                    VoiceSdkCallReport.VoiceSdkIdDecoded.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .voiceSdkSessionId("voice_sdk_session_id")
                .build()

        assertThat(voiceSdkCallReport.callId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(voiceSdkCallReport.callReportId()).contains("call_report_id")
        assertThat(voiceSdkCallReport.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(voiceSdkCallReport.flushReason())
            .contains(
                VoiceSdkCallReport.FlushReason.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(voiceSdkCallReport.logs())
            .contains(
                VoiceSdkCallReport.Logs.ofVoiceSdkCallReportLogEntries(
                    listOf(
                        VoiceSdkCallReportLogEntry.builder()
                            .context(
                                VoiceSdkCallReportLogEntry.Context.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .level(VoiceSdkCallReportLogEntry.Level.DEBUG)
                            .message("message")
                            .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                )
            )
        assertThat(voiceSdkCallReport.organizationId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(voiceSdkCallReport.segment()).contains(0L)
        assertThat(voiceSdkCallReport.stats())
            .contains(
                VoiceSdkCallReport.Stats.ofUnnamedSchemaWithArrayParent0s(
                    listOf(
                        VoiceSdkCallReport.Stats.UnnamedSchemaWithArrayParent0.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                )
            )
        assertThat(voiceSdkCallReport.storedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(voiceSdkCallReport.summary())
            .contains(
                VoiceSdkCallReport.Summary.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(voiceSdkCallReport.telnyxLegId()).contains("telnyx_leg_id")
        assertThat(voiceSdkCallReport.telnyxSessionId()).contains("telnyx_session_id")
        assertThat(voiceSdkCallReport.userAgent()).contains("user_agent")
        assertThat(voiceSdkCallReport.userId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(voiceSdkCallReport.version()).contains("version")
        assertThat(voiceSdkCallReport.voiceSdkId()).contains("voice_sdk_id")
        assertThat(voiceSdkCallReport.voiceSdkIdDecoded())
            .contains(
                VoiceSdkCallReport.VoiceSdkIdDecoded.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(voiceSdkCallReport.voiceSdkSessionId()).contains("voice_sdk_session_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val voiceSdkCallReport =
            VoiceSdkCallReport.builder()
                .callId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .callReportId("call_report_id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .flushReason(
                    VoiceSdkCallReport.FlushReason.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .logsOfVoiceSdkCallReportLogEntries(
                    listOf(
                        VoiceSdkCallReportLogEntry.builder()
                            .context(
                                VoiceSdkCallReportLogEntry.Context.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .level(VoiceSdkCallReportLogEntry.Level.DEBUG)
                            .message("message")
                            .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                )
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .segment(0L)
                .statsOfUnnamedSchemaWithArrayParent0s(
                    listOf(
                        VoiceSdkCallReport.Stats.UnnamedSchemaWithArrayParent0.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                )
                .storedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .summary(
                    VoiceSdkCallReport.Summary.builder()
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
                    VoiceSdkCallReport.VoiceSdkIdDecoded.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .voiceSdkSessionId("voice_sdk_session_id")
                .build()

        val roundtrippedVoiceSdkCallReport =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(voiceSdkCallReport),
                jacksonTypeRef<VoiceSdkCallReport>(),
            )

        assertThat(roundtrippedVoiceSdkCallReport).isEqualTo(voiceSdkCallReport)
    }
}
