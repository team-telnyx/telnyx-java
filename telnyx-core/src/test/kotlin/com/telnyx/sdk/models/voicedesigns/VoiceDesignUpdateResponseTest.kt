// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.voicedesigns

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VoiceDesignUpdateResponseTest {

    @Test
    fun create() {
        val voiceDesignUpdateResponse =
            VoiceDesignUpdateResponse.builder()
                .data(
                    VoiceDesignUpdateResponse.Data.builder()
                        .id("550e8400-e29b-41d4-a716-446655440000")
                        .createdAt(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
                        .name("updated-narrator")
                        .recordType(VoiceDesignUpdateResponse.Data.RecordType.VOICE_DESIGN)
                        .updatedAt(OffsetDateTime.parse("2024-01-02T00:00:00Z"))
                        .build()
                )
                .build()

        assertThat(voiceDesignUpdateResponse.data())
            .contains(
                VoiceDesignUpdateResponse.Data.builder()
                    .id("550e8400-e29b-41d4-a716-446655440000")
                    .createdAt(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
                    .name("updated-narrator")
                    .recordType(VoiceDesignUpdateResponse.Data.RecordType.VOICE_DESIGN)
                    .updatedAt(OffsetDateTime.parse("2024-01-02T00:00:00Z"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val voiceDesignUpdateResponse =
            VoiceDesignUpdateResponse.builder()
                .data(
                    VoiceDesignUpdateResponse.Data.builder()
                        .id("550e8400-e29b-41d4-a716-446655440000")
                        .createdAt(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
                        .name("updated-narrator")
                        .recordType(VoiceDesignUpdateResponse.Data.RecordType.VOICE_DESIGN)
                        .updatedAt(OffsetDateTime.parse("2024-01-02T00:00:00Z"))
                        .build()
                )
                .build()

        val roundtrippedVoiceDesignUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(voiceDesignUpdateResponse),
                jacksonTypeRef<VoiceDesignUpdateResponse>(),
            )

        assertThat(roundtrippedVoiceDesignUpdateResponse).isEqualTo(voiceDesignUpdateResponse)
    }
}
