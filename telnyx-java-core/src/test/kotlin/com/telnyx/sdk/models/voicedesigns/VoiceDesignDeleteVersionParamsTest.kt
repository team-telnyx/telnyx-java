// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.voicedesigns

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VoiceDesignDeleteVersionParamsTest {

    @Test
    fun create() {
        VoiceDesignDeleteVersionParams.builder().id("id").version(1L).build()
    }

    @Test
    fun pathParams() {
        val params = VoiceDesignDeleteVersionParams.builder().id("id").version(1L).build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        assertThat(params._pathParam(1)).isEqualTo("1")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
