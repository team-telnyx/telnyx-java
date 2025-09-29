// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.messaginghostednumberorders

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessagingHostedNumberOrderDeleteParamsTest {

    @Test
    fun create() {
        MessagingHostedNumberOrderDeleteParams.builder().id("id").build()
    }

    @Test
    fun pathParams() {
        val params = MessagingHostedNumberOrderDeleteParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
