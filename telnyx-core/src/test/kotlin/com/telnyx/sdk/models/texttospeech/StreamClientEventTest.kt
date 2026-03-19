// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.texttospeech

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class StreamClientEventTest {

    @Test
    fun create() {
        val streamClientEvent =
            StreamClientEvent.builder()
                .text(" ")
                .force(true)
                .voiceSettings(
                    StreamClientEvent.VoiceSettings.builder()
                        .putAdditionalProperty("voice_speed", JsonValue.from("bar"))
                        .build()
                )
                .build()

        assertThat(streamClientEvent.text()).isEqualTo(" ")
        assertThat(streamClientEvent.force()).contains(true)
        assertThat(streamClientEvent.voiceSettings())
            .contains(
                StreamClientEvent.VoiceSettings.builder()
                    .putAdditionalProperty("voice_speed", JsonValue.from("bar"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val streamClientEvent =
            StreamClientEvent.builder()
                .text(" ")
                .force(true)
                .voiceSettings(
                    StreamClientEvent.VoiceSettings.builder()
                        .putAdditionalProperty("voice_speed", JsonValue.from("bar"))
                        .build()
                )
                .build()

        val roundtrippedStreamClientEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(streamClientEvent),
                jacksonTypeRef<StreamClientEvent>(),
            )

        assertThat(roundtrippedStreamClientEvent).isEqualTo(streamClientEvent)
    }
}
