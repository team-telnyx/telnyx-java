// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.simcards.actions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionEnableVoiceParamsTest {

    @Test
    fun create() {
        ActionEnableVoiceParams.builder()
            .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
            .connectionId("123456789")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ActionEnableVoiceParams.builder().id("6a09cdc3-8948-47f0-aa62-74ac943d6c58").build()

        assertThat(params._pathParam(0)).isEqualTo("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ActionEnableVoiceParams.builder()
                .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .connectionId("123456789")
                .build()

        val body = params._body()

        assertThat(body.connectionId()).contains("123456789")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ActionEnableVoiceParams.builder().id("6a09cdc3-8948-47f0-aa62-74ac943d6c58").build()

        val body = params._body()
    }
}
