// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.voiceclones

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VoiceCloneCreateFromDesignParamsTest {

    @Test
    fun create() {
        VoiceCloneCreateFromDesignParams.builder()
            .gender(VoiceCloneCreateFromDesignParams.Gender.MALE)
            .language("en")
            .name("clone-narrator")
            .voiceDesignId("550e8400-e29b-41d4-a716-446655440000")
            .build()
    }

    @Test
    fun body() {
        val params =
            VoiceCloneCreateFromDesignParams.builder()
                .gender(VoiceCloneCreateFromDesignParams.Gender.MALE)
                .language("en")
                .name("clone-narrator")
                .voiceDesignId("550e8400-e29b-41d4-a716-446655440000")
                .build()

        val body = params._body()

        assertThat(body.gender()).isEqualTo(VoiceCloneCreateFromDesignParams.Gender.MALE)
        assertThat(body.language()).isEqualTo("en")
        assertThat(body.name()).isEqualTo("clone-narrator")
        assertThat(body.voiceDesignId()).isEqualTo("550e8400-e29b-41d4-a716-446655440000")
    }
}
