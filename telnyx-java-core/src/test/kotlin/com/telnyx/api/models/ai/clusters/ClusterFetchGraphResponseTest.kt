// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.ai.clusters

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ClusterFetchGraphResponseTest {

    @Test
    fun create() {
        val clusterFetchGraphResponse = ClusterFetchGraphResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val clusterFetchGraphResponse = ClusterFetchGraphResponse.builder().build()

        val roundtrippedClusterFetchGraphResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(clusterFetchGraphResponse),
                jacksonTypeRef<ClusterFetchGraphResponse>(),
            )

        assertThat(roundtrippedClusterFetchGraphResponse).isEqualTo(clusterFetchGraphResponse)
    }
}
