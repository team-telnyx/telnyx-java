// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.voicedesigns

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VoiceDesignListResponseTest {

    @Test
    fun create() {
        val voiceDesignListResponse =
            VoiceDesignListResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .name("name")
                .provider(VoiceDesignListResponse.Provider.TELNYX)
                .addProviderSupportedModel("string")
                .recordType(VoiceDesignListResponse.RecordType.VOICE_DESIGN)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(voiceDesignListResponse.id()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(voiceDesignListResponse.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(voiceDesignListResponse.name()).contains("name")
        assertThat(voiceDesignListResponse.provider())
            .contains(VoiceDesignListResponse.Provider.TELNYX)
        assertThat(voiceDesignListResponse.providerSupportedModels().getOrNull())
            .containsExactly("string")
        assertThat(voiceDesignListResponse.recordType())
            .contains(VoiceDesignListResponse.RecordType.VOICE_DESIGN)
        assertThat(voiceDesignListResponse.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val voiceDesignListResponse =
            VoiceDesignListResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .name("name")
                .provider(VoiceDesignListResponse.Provider.TELNYX)
                .addProviderSupportedModel("string")
                .recordType(VoiceDesignListResponse.RecordType.VOICE_DESIGN)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedVoiceDesignListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(voiceDesignListResponse),
                jacksonTypeRef<VoiceDesignListResponse>(),
            )

        assertThat(roundtrippedVoiceDesignListResponse).isEqualTo(voiceDesignListResponse)
    }
}
