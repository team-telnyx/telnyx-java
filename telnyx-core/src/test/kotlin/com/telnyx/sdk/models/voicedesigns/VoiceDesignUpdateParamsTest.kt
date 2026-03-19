// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.voicedesigns

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VoiceDesignUpdateParamsTest {

    @Test
    fun create() {
        VoiceDesignUpdateParams.builder().id("id").name("updated-narrator").build()
    }

    @Test
    fun pathParams() {
        val params = VoiceDesignUpdateParams.builder().id("id").name("updated-narrator").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params = VoiceDesignUpdateParams.builder().id("id").name("updated-narrator").build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("updated-narrator")
    }
}
