// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.memory.namespaces.profiles.sources

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SourceDeleteParamsTest {

    @Test
    fun create() {
        SourceDeleteParams.builder()
            .namespace("namespace")
            .profileId("profile_id")
            .sourceId("source_id")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            SourceDeleteParams.builder()
                .namespace("namespace")
                .profileId("profile_id")
                .sourceId("source_id")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("namespace")
        assertThat(params._pathParam(1)).isEqualTo("profile_id")
        assertThat(params._pathParam(2)).isEqualTo("source_id")
        // out-of-bound path param
        assertThat(params._pathParam(3)).isEqualTo("")
    }
}
