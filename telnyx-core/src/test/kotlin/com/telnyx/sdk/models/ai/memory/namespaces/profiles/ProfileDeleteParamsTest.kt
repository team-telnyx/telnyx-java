// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.memory.namespaces.profiles

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProfileDeleteParamsTest {

    @Test
    fun create() {
        ProfileDeleteParams.builder().namespace("namespace").profileId("profile_id").build()
    }

    @Test
    fun pathParams() {
        val params =
            ProfileDeleteParams.builder().namespace("namespace").profileId("profile_id").build()

        assertThat(params._pathParam(0)).isEqualTo("namespace")
        assertThat(params._pathParam(1)).isEqualTo("profile_id")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
