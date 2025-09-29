// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.ai.clusters

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ClusterComputeParamsTest {

    @Test
    fun create() {
        ClusterComputeParams.builder()
            .bucket("bucket")
            .addFile("string")
            .minClusterSize(0L)
            .minSubclusterSize(0L)
            .prefix("prefix")
            .build()
    }

    @Test
    fun body() {
        val params =
            ClusterComputeParams.builder()
                .bucket("bucket")
                .addFile("string")
                .minClusterSize(0L)
                .minSubclusterSize(0L)
                .prefix("prefix")
                .build()

        val body = params._body()

        assertThat(body.bucket()).isEqualTo("bucket")
        assertThat(body.files().getOrNull()).containsExactly("string")
        assertThat(body.minClusterSize()).contains(0L)
        assertThat(body.minSubclusterSize()).contains(0L)
        assertThat(body.prefix()).contains("prefix")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = ClusterComputeParams.builder().bucket("bucket").build()

        val body = params._body()

        assertThat(body.bucket()).isEqualTo("bucket")
    }
}
