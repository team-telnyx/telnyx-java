// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.voicedesigns

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VoiceDesignRenameParamsTest {

    @Test
    fun create() {
        VoiceDesignRenameParams.builder().id("id").name("updated-narrator").build()
    }

    @Test
    fun pathParams() {
        val params = VoiceDesignRenameParams.builder().id("id").name("updated-narrator").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params = VoiceDesignRenameParams.builder().id("id").name("updated-narrator").build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("updated-narrator")
    }
}
