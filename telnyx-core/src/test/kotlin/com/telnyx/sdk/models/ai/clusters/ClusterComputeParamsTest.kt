// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.clusters

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ClusterComputeParamsTest {

    @Test
    fun create() {
        ClusterComputeParams.builder()
            .bucket("string")
            .addFile("string")
            .minClusterSize(25L)
            .minSubclusterSize(5L)
            .prefix("string")
            .build()
    }

    @Test
    fun body() {
        val params =
            ClusterComputeParams.builder()
                .bucket("string")
                .addFile("string")
                .minClusterSize(25L)
                .minSubclusterSize(5L)
                .prefix("string")
                .build()

        val body = params._body()

        assertThat(body.bucket()).isEqualTo("string")
        assertThat(body.files().getOrNull()).containsExactly("string")
        assertThat(body.minClusterSize()).contains(25L)
        assertThat(body.minSubclusterSize()).contains(5L)
        assertThat(body.prefix()).contains("string")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = ClusterComputeParams.builder().bucket("string").build()

        val body = params._body()

        assertThat(body.bucket()).isEqualTo("string")
    }
}
