// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.meetingsessions.artifacts

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ArtifactRetrieveParamsTest {

    @Test
    fun create() {
        ArtifactRetrieveParams.builder()
            .id("mtgsess_a1b2c3d4-e5f6-7890-abcd-ef1234567890")
            .artifactId("mtgart_b2c3d4e5-f6a7-8901-bcde-f23456789012")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ArtifactRetrieveParams.builder()
                .id("mtgsess_a1b2c3d4-e5f6-7890-abcd-ef1234567890")
                .artifactId("mtgart_b2c3d4e5-f6a7-8901-bcde-f23456789012")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("mtgsess_a1b2c3d4-e5f6-7890-abcd-ef1234567890")
        assertThat(params._pathParam(1)).isEqualTo("mtgart_b2c3d4e5-f6a7-8901-bcde-f23456789012")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
