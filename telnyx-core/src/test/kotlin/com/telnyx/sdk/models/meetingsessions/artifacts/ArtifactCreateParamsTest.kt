// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.meetingsessions.artifacts

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ArtifactCreateParamsTest {

    @Test
    fun create() {
        ArtifactCreateParams.builder()
            .id("mtgsess_a1b2c3d4-e5f6-7890-abcd-ef1234567890")
            .type(ArtifactCreateParams.Type.SUMMARY)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ArtifactCreateParams.builder()
                .id("mtgsess_a1b2c3d4-e5f6-7890-abcd-ef1234567890")
                .type(ArtifactCreateParams.Type.SUMMARY)
                .build()

        assertThat(params._pathParam(0)).isEqualTo("mtgsess_a1b2c3d4-e5f6-7890-abcd-ef1234567890")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ArtifactCreateParams.builder()
                .id("mtgsess_a1b2c3d4-e5f6-7890-abcd-ef1234567890")
                .type(ArtifactCreateParams.Type.SUMMARY)
                .build()

        val body = params._body()

        assertThat(body.type()).isEqualTo(ArtifactCreateParams.Type.SUMMARY)
    }
}
