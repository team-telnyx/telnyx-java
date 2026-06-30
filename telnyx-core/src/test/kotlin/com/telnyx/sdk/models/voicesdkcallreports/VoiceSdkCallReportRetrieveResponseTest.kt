// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.voicesdkcallreports

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VoiceSdkCallReportRetrieveResponseTest {

    @Test
    fun create() {
        val voiceSdkCallReportRetrieveResponse =
            VoiceSdkCallReportRetrieveResponse.builder()
                .callId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .callReportId("call_report_id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .flushReason(
                    VoiceSdkCallReportRetrieveResponse.FlushReason.builder()
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
                        VoiceSdkCallReportRetrieveResponse.Stats.UnnamedSchemaWithArrayParent0
                            .builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                )
                .storedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .summary(
                    VoiceSdkCallReportRetrieveResponse.Summary.builder()
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
                    VoiceSdkCallReportRetrieveResponse.VoiceSdkIdDecoded.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .voiceSdkSessionId("voice_sdk_session_id")
                .build()

        assertThat(voiceSdkCallReportRetrieveResponse.callId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(voiceSdkCallReportRetrieveResponse.callReportId()).contains("call_report_id")
        assertThat(voiceSdkCallReportRetrieveResponse.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(voiceSdkCallReportRetrieveResponse.flushReason())
            .contains(
                VoiceSdkCallReportRetrieveResponse.FlushReason.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(voiceSdkCallReportRetrieveResponse.logs())
            .contains(
                VoiceSdkCallReportRetrieveResponse.Logs.ofVoiceSdkCallReportLogEntries(
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
        assertThat(voiceSdkCallReportRetrieveResponse.organizationId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(voiceSdkCallReportRetrieveResponse.segment()).contains(0L)
        assertThat(voiceSdkCallReportRetrieveResponse.stats())
            .contains(
                VoiceSdkCallReportRetrieveResponse.Stats.ofUnnamedSchemaWithArrayParent0s(
                    listOf(
                        VoiceSdkCallReportRetrieveResponse.Stats.UnnamedSchemaWithArrayParent0
                            .builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                )
            )
        assertThat(voiceSdkCallReportRetrieveResponse.storedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(voiceSdkCallReportRetrieveResponse.summary())
            .contains(
                VoiceSdkCallReportRetrieveResponse.Summary.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(voiceSdkCallReportRetrieveResponse.telnyxLegId()).contains("telnyx_leg_id")
        assertThat(voiceSdkCallReportRetrieveResponse.telnyxSessionId())
            .contains("telnyx_session_id")
        assertThat(voiceSdkCallReportRetrieveResponse.userAgent()).contains("user_agent")
        assertThat(voiceSdkCallReportRetrieveResponse.userId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(voiceSdkCallReportRetrieveResponse.version()).contains("version")
        assertThat(voiceSdkCallReportRetrieveResponse.voiceSdkId()).contains("voice_sdk_id")
        assertThat(voiceSdkCallReportRetrieveResponse.voiceSdkIdDecoded())
            .contains(
                VoiceSdkCallReportRetrieveResponse.VoiceSdkIdDecoded.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(voiceSdkCallReportRetrieveResponse.voiceSdkSessionId())
            .contains("voice_sdk_session_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val voiceSdkCallReportRetrieveResponse =
            VoiceSdkCallReportRetrieveResponse.builder()
                .callId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .callReportId("call_report_id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .flushReason(
                    VoiceSdkCallReportRetrieveResponse.FlushReason.builder()
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
                        VoiceSdkCallReportRetrieveResponse.Stats.UnnamedSchemaWithArrayParent0
                            .builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                )
                .storedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .summary(
                    VoiceSdkCallReportRetrieveResponse.Summary.builder()
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
                    VoiceSdkCallReportRetrieveResponse.VoiceSdkIdDecoded.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .voiceSdkSessionId("voice_sdk_session_id")
                .build()

        val roundtrippedVoiceSdkCallReportRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(voiceSdkCallReportRetrieveResponse),
                jacksonTypeRef<VoiceSdkCallReportRetrieveResponse>(),
            )

        assertThat(roundtrippedVoiceSdkCallReportRetrieveResponse)
            .isEqualTo(voiceSdkCallReportRetrieveResponse)
    }
}
