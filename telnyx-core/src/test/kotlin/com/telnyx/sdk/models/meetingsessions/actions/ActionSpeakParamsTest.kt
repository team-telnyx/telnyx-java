// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.meetingsessions.actions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionSpeakParamsTest {

    @Test
    fun create() {
        ActionSpeakParams.builder()
            .id("mtgsess_a1b2c3d4-e5f6-7890-abcd-ef1234567890")
            .text("Here are the three decisions from this call.")
            .interrupt(false)
            .voice("x")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ActionSpeakParams.builder()
                .id("mtgsess_a1b2c3d4-e5f6-7890-abcd-ef1234567890")
                .text("Here are the three decisions from this call.")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("mtgsess_a1b2c3d4-e5f6-7890-abcd-ef1234567890")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ActionSpeakParams.builder()
                .id("mtgsess_a1b2c3d4-e5f6-7890-abcd-ef1234567890")
                .text("Here are the three decisions from this call.")
                .interrupt(false)
                .voice("x")
                .build()

        val body = params._body()

        assertThat(body.text()).isEqualTo("Here are the three decisions from this call.")
        assertThat(body.interrupt()).contains(false)
        assertThat(body.voice()).contains("x")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ActionSpeakParams.builder()
                .id("mtgsess_a1b2c3d4-e5f6-7890-abcd-ef1234567890")
                .text("Here are the three decisions from this call.")
                .build()

        val body = params._body()

        assertThat(body.text()).isEqualTo("Here are the three decisions from this call.")
    }
}
