// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.voicesdkcallreports

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VoiceSdkCallReportLogEntryTest {

    @Test
    fun create() {
        val voiceSdkCallReportLogEntry =
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

        assertThat(voiceSdkCallReportLogEntry.context())
            .contains(
                VoiceSdkCallReportLogEntry.Context.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(voiceSdkCallReportLogEntry.level())
            .contains(VoiceSdkCallReportLogEntry.Level.DEBUG)
        assertThat(voiceSdkCallReportLogEntry.message()).contains("message")
        assertThat(voiceSdkCallReportLogEntry.timestamp())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val voiceSdkCallReportLogEntry =
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

        val roundtrippedVoiceSdkCallReportLogEntry =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(voiceSdkCallReportLogEntry),
                jacksonTypeRef<VoiceSdkCallReportLogEntry>(),
            )

        assertThat(roundtrippedVoiceSdkCallReportLogEntry).isEqualTo(voiceSdkCallReportLogEntry)
    }
}
