// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.simcards.actions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionBulkEnableVoiceParamsTest {

    @Test
    fun create() {
        ActionBulkEnableVoiceParams.builder()
            .simCardGroupId("6b14e151-8493-4fa1-8664-1cc4e6d14158")
            .build()
    }

    @Test
    fun body() {
        val params =
            ActionBulkEnableVoiceParams.builder()
                .simCardGroupId("6b14e151-8493-4fa1-8664-1cc4e6d14158")
                .build()

        val body = params._body()

        assertThat(body.simCardGroupId()).isEqualTo("6b14e151-8493-4fa1-8664-1cc4e6d14158")
    }
}
