// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.voiceclones

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VoiceCloneCreateParamsTest {

    @Test
    fun create() {
        VoiceCloneCreateParams.builder()
            .gender(VoiceCloneCreateParams.Gender.MALE)
            .language("en")
            .name("clone-narrator")
            .voiceDesignId("550e8400-e29b-41d4-a716-446655440000")
            .provider(VoiceCloneCreateParams.Provider.TELNYX)
            .build()
    }

    @Test
    fun body() {
        val params =
            VoiceCloneCreateParams.builder()
                .gender(VoiceCloneCreateParams.Gender.MALE)
                .language("en")
                .name("clone-narrator")
                .voiceDesignId("550e8400-e29b-41d4-a716-446655440000")
                .provider(VoiceCloneCreateParams.Provider.TELNYX)
                .build()

        val body = params._body()

        assertThat(body.gender()).isEqualTo(VoiceCloneCreateParams.Gender.MALE)
        assertThat(body.language()).isEqualTo("en")
        assertThat(body.name()).isEqualTo("clone-narrator")
        assertThat(body.voiceDesignId()).isEqualTo("550e8400-e29b-41d4-a716-446655440000")
        assertThat(body.provider()).contains(VoiceCloneCreateParams.Provider.TELNYX)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            VoiceCloneCreateParams.builder()
                .gender(VoiceCloneCreateParams.Gender.MALE)
                .language("en")
                .name("clone-narrator")
                .voiceDesignId("550e8400-e29b-41d4-a716-446655440000")
                .build()

        val body = params._body()

        assertThat(body.gender()).isEqualTo(VoiceCloneCreateParams.Gender.MALE)
        assertThat(body.language()).isEqualTo("en")
        assertThat(body.name()).isEqualTo("clone-narrator")
        assertThat(body.voiceDesignId()).isEqualTo("550e8400-e29b-41d4-a716-446655440000")
    }
}
