// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.managedaccounts

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ManagedAccountUpdateGlobalChannelLimitParamsTest {

    @Test
    fun create() {
        ManagedAccountUpdateGlobalChannelLimitParams.builder().id("id").channelLimit(30L).build()
    }

    @Test
    fun pathParams() {
        val params = ManagedAccountUpdateGlobalChannelLimitParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ManagedAccountUpdateGlobalChannelLimitParams.builder()
                .id("id")
                .channelLimit(30L)
                .build()

        val body = params._body()

        assertThat(body.channelLimit()).contains(30L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = ManagedAccountUpdateGlobalChannelLimitParams.builder().id("id").build()

        val body = params._body()
    }
}
