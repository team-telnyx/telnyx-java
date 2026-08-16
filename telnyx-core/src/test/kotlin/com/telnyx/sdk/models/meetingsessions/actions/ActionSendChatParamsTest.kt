// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.meetingsessions.actions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionSendChatParamsTest {

    @Test
    fun create() {
        ActionSendChatParams.builder()
            .id("mtgsess_a1b2c3d4-e5f6-7890-abcd-ef1234567890")
            .text("I will send the summary after this call.")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ActionSendChatParams.builder()
                .id("mtgsess_a1b2c3d4-e5f6-7890-abcd-ef1234567890")
                .text("I will send the summary after this call.")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("mtgsess_a1b2c3d4-e5f6-7890-abcd-ef1234567890")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ActionSendChatParams.builder()
                .id("mtgsess_a1b2c3d4-e5f6-7890-abcd-ef1234567890")
                .text("I will send the summary after this call.")
                .build()

        val body = params._body()

        assertThat(body.text()).isEqualTo("I will send the summary after this call.")
    }
}
