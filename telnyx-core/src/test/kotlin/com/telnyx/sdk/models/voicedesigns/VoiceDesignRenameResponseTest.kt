// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.voicedesigns

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VoiceDesignRenameResponseTest {

    @Test
    fun create() {
        val voiceDesignRenameResponse =
            VoiceDesignRenameResponse.builder()
                .data(
                    VoiceDesignRenameResponse.Data.builder()
                        .id("550e8400-e29b-41d4-a716-446655440000")
                        .createdAt(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
                        .name("updated-narrator")
                        .provider(VoiceDesignRenameResponse.Data.Provider.TELNYX)
                        .addProviderSupportedModel("string")
                        .recordType(VoiceDesignRenameResponse.Data.RecordType.VOICE_DESIGN)
                        .updatedAt(OffsetDateTime.parse("2024-01-02T00:00:00Z"))
                        .build()
                )
                .build()

        assertThat(voiceDesignRenameResponse.data())
            .contains(
                VoiceDesignRenameResponse.Data.builder()
                    .id("550e8400-e29b-41d4-a716-446655440000")
                    .createdAt(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
                    .name("updated-narrator")
                    .provider(VoiceDesignRenameResponse.Data.Provider.TELNYX)
                    .addProviderSupportedModel("string")
                    .recordType(VoiceDesignRenameResponse.Data.RecordType.VOICE_DESIGN)
                    .updatedAt(OffsetDateTime.parse("2024-01-02T00:00:00Z"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val voiceDesignRenameResponse =
            VoiceDesignRenameResponse.builder()
                .data(
                    VoiceDesignRenameResponse.Data.builder()
                        .id("550e8400-e29b-41d4-a716-446655440000")
                        .createdAt(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
                        .name("updated-narrator")
                        .provider(VoiceDesignRenameResponse.Data.Provider.TELNYX)
                        .addProviderSupportedModel("string")
                        .recordType(VoiceDesignRenameResponse.Data.RecordType.VOICE_DESIGN)
                        .updatedAt(OffsetDateTime.parse("2024-01-02T00:00:00Z"))
                        .build()
                )
                .build()

        val roundtrippedVoiceDesignRenameResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(voiceDesignRenameResponse),
                jacksonTypeRef<VoiceDesignRenameResponse>(),
            )

        assertThat(roundtrippedVoiceDesignRenameResponse).isEqualTo(voiceDesignRenameResponse)
    }
}
