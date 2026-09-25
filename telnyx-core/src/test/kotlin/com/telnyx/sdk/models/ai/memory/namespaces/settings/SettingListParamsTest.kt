// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.memory.namespaces.settings

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SettingListParamsTest {

    @Test
    fun create() {
        SettingListParams.builder().namespace("namespace").build()
    }

    @Test
    fun pathParams() {
        val params = SettingListParams.builder().namespace("namespace").build()

        assertThat(params._pathParam(0)).isEqualTo("namespace")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
