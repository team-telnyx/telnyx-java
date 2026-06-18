// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.voiceclones

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VoiceCloneUpdateParamsTest {

    @Test
    fun create() {
        VoiceCloneUpdateParams.builder()
            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .name("updated-clone")
            .gender(VoiceCloneUpdateParams.Gender.MALE)
            .language("language")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            VoiceCloneUpdateParams.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .name("updated-clone")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            VoiceCloneUpdateParams.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .name("updated-clone")
                .gender(VoiceCloneUpdateParams.Gender.MALE)
                .language("language")
                .build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("updated-clone")
        assertThat(body.gender()).contains(VoiceCloneUpdateParams.Gender.MALE)
        assertThat(body.language()).contains("language")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            VoiceCloneUpdateParams.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .name("updated-clone")
                .build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("updated-clone")
    }
}
