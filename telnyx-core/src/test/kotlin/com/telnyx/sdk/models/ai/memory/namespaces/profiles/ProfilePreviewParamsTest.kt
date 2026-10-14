// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.memory.namespaces.profiles

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProfilePreviewParamsTest {

    @Test
    fun create() {
        ProfilePreviewParams.builder()
            .namespace("namespace")
            .profileId("profile_id")
            .instructions("Lead with billing status. Prefer plain language over jargon.")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ProfilePreviewParams.builder().namespace("namespace").profileId("profile_id").build()

        assertThat(params._pathParam(0)).isEqualTo("namespace")
        assertThat(params._pathParam(1)).isEqualTo("profile_id")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ProfilePreviewParams.builder()
                .namespace("namespace")
                .profileId("profile_id")
                .instructions("Lead with billing status. Prefer plain language over jargon.")
                .build()

        val body = params._body()

        assertThat(body.instructions())
            .contains("Lead with billing status. Prefer plain language over jargon.")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ProfilePreviewParams.builder().namespace("namespace").profileId("profile_id").build()

        val body = params._body()
    }
}
