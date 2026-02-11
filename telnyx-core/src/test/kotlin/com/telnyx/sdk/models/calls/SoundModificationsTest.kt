// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.calls

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SoundModificationsTest {

    @Test
    fun create() {
        val soundModifications =
            SoundModifications.builder()
                .octaves(0.1f)
                .pitch(0.8f)
                .semitone(-2.0f)
                .track("both")
                .build()

        assertThat(soundModifications.octaves()).contains(0.1f)
        assertThat(soundModifications.pitch()).contains(0.8f)
        assertThat(soundModifications.semitone()).contains(-2.0f)
        assertThat(soundModifications.track()).contains("both")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val soundModifications =
            SoundModifications.builder()
                .octaves(0.1f)
                .pitch(0.8f)
                .semitone(-2.0f)
                .track("both")
                .build()

        val roundtrippedSoundModifications =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(soundModifications),
                jacksonTypeRef<SoundModifications>(),
            )

        assertThat(roundtrippedSoundModifications).isEqualTo(soundModifications)
    }
}
