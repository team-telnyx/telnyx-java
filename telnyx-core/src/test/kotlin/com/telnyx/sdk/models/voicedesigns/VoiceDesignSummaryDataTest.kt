// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.voicedesigns

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VoiceDesignSummaryDataTest {

    @Test
    fun create() {
        val voiceDesignSummaryData =
            VoiceDesignSummaryData.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .name("name")
                .provider(VoiceDesignSummaryData.Provider.TELNYX)
                .addProviderSupportedModel("string")
                .recordType(VoiceDesignSummaryData.RecordType.VOICE_DESIGN)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(voiceDesignSummaryData.id()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(voiceDesignSummaryData.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(voiceDesignSummaryData.name()).contains("name")
        assertThat(voiceDesignSummaryData.provider())
            .contains(VoiceDesignSummaryData.Provider.TELNYX)
        assertThat(voiceDesignSummaryData.providerSupportedModels().getOrNull())
            .containsExactly("string")
        assertThat(voiceDesignSummaryData.recordType())
            .contains(VoiceDesignSummaryData.RecordType.VOICE_DESIGN)
        assertThat(voiceDesignSummaryData.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val voiceDesignSummaryData =
            VoiceDesignSummaryData.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .name("name")
                .provider(VoiceDesignSummaryData.Provider.TELNYX)
                .addProviderSupportedModel("string")
                .recordType(VoiceDesignSummaryData.RecordType.VOICE_DESIGN)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedVoiceDesignSummaryData =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(voiceDesignSummaryData),
                jacksonTypeRef<VoiceDesignSummaryData>(),
            )

        assertThat(roundtrippedVoiceDesignSummaryData).isEqualTo(voiceDesignSummaryData)
    }
}
