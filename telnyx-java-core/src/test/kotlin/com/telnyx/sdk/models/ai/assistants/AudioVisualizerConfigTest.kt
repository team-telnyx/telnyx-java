// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AudioVisualizerConfigTest {

    @Test
    fun create() {
        val audioVisualizerConfig =
            AudioVisualizerConfig.builder()
                .color(AudioVisualizerConfig.Color.VERDANT)
                .preset("preset")
                .build()

        assertThat(audioVisualizerConfig.color()).contains(AudioVisualizerConfig.Color.VERDANT)
        assertThat(audioVisualizerConfig.preset()).contains("preset")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val audioVisualizerConfig =
            AudioVisualizerConfig.builder()
                .color(AudioVisualizerConfig.Color.VERDANT)
                .preset("preset")
                .build()

        val roundtrippedAudioVisualizerConfig =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(audioVisualizerConfig),
                jacksonTypeRef<AudioVisualizerConfig>(),
            )

        assertThat(roundtrippedAudioVisualizerConfig).isEqualTo(audioVisualizerConfig)
    }
}
