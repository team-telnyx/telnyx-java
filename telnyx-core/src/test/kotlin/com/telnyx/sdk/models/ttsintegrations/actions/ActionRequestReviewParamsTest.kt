// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ttsintegrations.actions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionRequestReviewParamsTest {

    @Test
    fun create() {
        ActionRequestReviewParams.builder().id("id").build()
    }

    @Test
    fun pathParams() {
        val params = ActionRequestReviewParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
