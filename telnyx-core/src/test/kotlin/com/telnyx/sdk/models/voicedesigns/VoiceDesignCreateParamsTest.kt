// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.voicedesigns

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VoiceDesignCreateParamsTest {

    @Test
    fun create() {
        VoiceDesignCreateParams.builder()
            .prompt("Speak in a warm, friendly tone")
            .text("Hello, welcome to our service.")
            .language("Auto")
            .maxNewTokens(100L)
            .name("friendly-narrator")
            .repetitionPenalty(1.0f)
            .temperature(0.0f)
            .topK(1L)
            .topP(0.0f)
            .voiceDesignId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .build()
    }

    @Test
    fun body() {
        val params =
            VoiceDesignCreateParams.builder()
                .prompt("Speak in a warm, friendly tone")
                .text("Hello, welcome to our service.")
                .language("Auto")
                .maxNewTokens(100L)
                .name("friendly-narrator")
                .repetitionPenalty(1.0f)
                .temperature(0.0f)
                .topK(1L)
                .topP(0.0f)
                .voiceDesignId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val body = params._body()

        assertThat(body.prompt()).isEqualTo("Speak in a warm, friendly tone")
        assertThat(body.text()).isEqualTo("Hello, welcome to our service.")
        assertThat(body.language()).contains("Auto")
        assertThat(body.maxNewTokens()).contains(100L)
        assertThat(body.name()).contains("friendly-narrator")
        assertThat(body.repetitionPenalty()).contains(1.0f)
        assertThat(body.temperature()).contains(0.0f)
        assertThat(body.topK()).contains(1L)
        assertThat(body.topP()).contains(0.0f)
        assertThat(body.voiceDesignId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            VoiceDesignCreateParams.builder()
                .prompt("Speak in a warm, friendly tone")
                .text("Hello, welcome to our service.")
                .build()

        val body = params._body()

        assertThat(body.prompt()).isEqualTo("Speak in a warm, friendly tone")
        assertThat(body.text()).isEqualTo("Hello, welcome to our service.")
    }
}
