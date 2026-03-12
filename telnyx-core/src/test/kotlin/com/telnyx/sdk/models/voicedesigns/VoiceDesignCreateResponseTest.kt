// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.voicedesigns

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VoiceDesignCreateResponseTest {

    @Test
    fun create() {
        val voiceDesignCreateResponse =
            VoiceDesignCreateResponse.builder()
                .data(
                    VoiceDesignCreateResponse.Data.builder()
                        .id("550e8400-e29b-41d4-a716-446655440000")
                        .createdAt(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
                        .name("friendly-narrator")
                        .prompt("Speak in a warm tone")
                        .recordType(VoiceDesignCreateResponse.Data.RecordType.VOICE_DESIGN)
                        .text("Hello, welcome.")
                        .updatedAt(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
                        .version(1L)
                        .versionCreatedAt(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
                        .voiceSampleSize(48000L)
                        .build()
                )
                .build()

        assertThat(voiceDesignCreateResponse.data())
            .contains(
                VoiceDesignCreateResponse.Data.builder()
                    .id("550e8400-e29b-41d4-a716-446655440000")
                    .createdAt(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
                    .name("friendly-narrator")
                    .prompt("Speak in a warm tone")
                    .recordType(VoiceDesignCreateResponse.Data.RecordType.VOICE_DESIGN)
                    .text("Hello, welcome.")
                    .updatedAt(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
                    .version(1L)
                    .versionCreatedAt(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
                    .voiceSampleSize(48000L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val voiceDesignCreateResponse =
            VoiceDesignCreateResponse.builder()
                .data(
                    VoiceDesignCreateResponse.Data.builder()
                        .id("550e8400-e29b-41d4-a716-446655440000")
                        .createdAt(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
                        .name("friendly-narrator")
                        .prompt("Speak in a warm tone")
                        .recordType(VoiceDesignCreateResponse.Data.RecordType.VOICE_DESIGN)
                        .text("Hello, welcome.")
                        .updatedAt(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
                        .version(1L)
                        .versionCreatedAt(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
                        .voiceSampleSize(48000L)
                        .build()
                )
                .build()

        val roundtrippedVoiceDesignCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(voiceDesignCreateResponse),
                jacksonTypeRef<VoiceDesignCreateResponse>(),
            )

        assertThat(roundtrippedVoiceDesignCreateResponse).isEqualTo(voiceDesignCreateResponse)
    }
}
