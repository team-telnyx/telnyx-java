// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.clusters

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ClusterComputeResponseTest {

    @Test
    fun create() {
        val clusterComputeResponse =
            ClusterComputeResponse.builder()
                .data(ClusterComputeResponse.Data.builder().taskId("task_id").build())
                .build()

        assertThat(clusterComputeResponse.data())
            .isEqualTo(ClusterComputeResponse.Data.builder().taskId("task_id").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val clusterComputeResponse =
            ClusterComputeResponse.builder()
                .data(ClusterComputeResponse.Data.builder().taskId("task_id").build())
                .build()

        val roundtrippedClusterComputeResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(clusterComputeResponse),
                jacksonTypeRef<ClusterComputeResponse>(),
            )

        assertThat(roundtrippedClusterComputeResponse).isEqualTo(clusterComputeResponse)
    }
}
