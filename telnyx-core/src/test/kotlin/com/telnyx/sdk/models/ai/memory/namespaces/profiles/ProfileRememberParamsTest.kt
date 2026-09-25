// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.memory.namespaces.profiles

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProfileRememberParamsTest {

    @Test
    fun create() {
        ProfileRememberParams.builder()
            .namespace("namespace")
            .profileId("profile_id")
            .text("Prefers window seats and flies out of ORD")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ProfileRememberParams.builder()
                .namespace("namespace")
                .profileId("profile_id")
                .text("Prefers window seats and flies out of ORD")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("namespace")
        assertThat(params._pathParam(1)).isEqualTo("profile_id")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ProfileRememberParams.builder()
                .namespace("namespace")
                .profileId("profile_id")
                .text("Prefers window seats and flies out of ORD")
                .build()

        val body = params._body()

        assertThat(body.text()).isEqualTo("Prefers window seats and flies out of ORD")
    }
}
