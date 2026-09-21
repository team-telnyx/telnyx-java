// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.botsignup

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BotSignupResendMagicLinkParamsTest {

    @Test
    fun create() {
        BotSignupResendMagicLinkParams.builder().email("agent-owner@example.com").build()
    }

    @Test
    fun body() {
        val params =
            BotSignupResendMagicLinkParams.builder().email("agent-owner@example.com").build()

        val body = params._body()

        assertThat(body.email()).isEqualTo("agent-owner@example.com")
    }
}
