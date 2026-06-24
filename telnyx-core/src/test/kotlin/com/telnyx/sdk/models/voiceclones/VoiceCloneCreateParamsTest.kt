// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.voiceclones

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VoiceCloneCreateParamsTest {

    @Test
    fun create() {
        VoiceCloneCreateParams.builder()
            .voiceCloneRequest(
                VoiceCloneCreateParams.VoiceCloneRequest.TelnyxDesignClone.builder()
                    .gender(VoiceCloneCreateParams.VoiceCloneRequest.TelnyxDesignClone.Gender.MALE)
                    .language("en")
                    .name("clone-narrator")
                    .voiceDesignId("550e8400-e29b-41d4-a716-446655440000")
                    .provider(
                        VoiceCloneCreateParams.VoiceCloneRequest.TelnyxDesignClone.Provider.TELNYX
                    )
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            VoiceCloneCreateParams.builder()
                .voiceCloneRequest(
                    VoiceCloneCreateParams.VoiceCloneRequest.TelnyxDesignClone.builder()
                        .gender(
                            VoiceCloneCreateParams.VoiceCloneRequest.TelnyxDesignClone.Gender.MALE
                        )
                        .language("en")
                        .name("clone-narrator")
                        .voiceDesignId("550e8400-e29b-41d4-a716-446655440000")
                        .provider(
                            VoiceCloneCreateParams.VoiceCloneRequest.TelnyxDesignClone.Provider
                                .TELNYX
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                VoiceCloneCreateParams.VoiceCloneRequest.ofTelnyxDesignClone(
                    VoiceCloneCreateParams.VoiceCloneRequest.TelnyxDesignClone.builder()
                        .gender(
                            VoiceCloneCreateParams.VoiceCloneRequest.TelnyxDesignClone.Gender.MALE
                        )
                        .language("en")
                        .name("clone-narrator")
                        .voiceDesignId("550e8400-e29b-41d4-a716-446655440000")
                        .provider(
                            VoiceCloneCreateParams.VoiceCloneRequest.TelnyxDesignClone.Provider
                                .TELNYX
                        )
                        .build()
                )
            )
    }
}
