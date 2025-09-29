// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.media

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MediaDeleteParamsTest {

    @Test
    fun create() {
        MediaDeleteParams.builder().mediaName("media_name").build()
    }

    @Test
    fun pathParams() {
        val params = MediaDeleteParams.builder().mediaName("media_name").build()

        assertThat(params._pathParam(0)).isEqualTo("media_name")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
