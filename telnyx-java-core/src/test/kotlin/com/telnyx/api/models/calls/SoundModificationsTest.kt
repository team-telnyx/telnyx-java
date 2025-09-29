// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.calls

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SoundModificationsTest {

    @Test
    fun create() {
        val soundModifications =
            SoundModifications.builder()
                .octaves(0.1)
                .pitch(0.0)
                .semitone(-2.0)
                .track("both")
                .build()

        assertThat(soundModifications.octaves()).contains(0.1)
        assertThat(soundModifications.pitch()).contains(0.0)
        assertThat(soundModifications.semitone()).contains(-2.0)
        assertThat(soundModifications.track()).contains("both")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val soundModifications =
            SoundModifications.builder()
                .octaves(0.1)
                .pitch(0.0)
                .semitone(-2.0)
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
