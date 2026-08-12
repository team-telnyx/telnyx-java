// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.collections.settings

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SettingListParamsTest {

    @Test
    fun create() {
        SettingListParams.builder().uuid("6a09ccbd-8f9b-4c3a-9b0e-2f1d3c4b5a6e").build()
    }

    @Test
    fun pathParams() {
        val params =
            SettingListParams.builder().uuid("6a09ccbd-8f9b-4c3a-9b0e-2f1d3c4b5a6e").build()

        assertThat(params._pathParam(0)).isEqualTo("6a09ccbd-8f9b-4c3a-9b0e-2f1d3c4b5a6e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
