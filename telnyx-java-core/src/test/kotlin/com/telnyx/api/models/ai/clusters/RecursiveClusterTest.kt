// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.ai.clusters

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RecursiveClusterTest {

    @Test
    fun create() {
        val recursiveCluster =
            RecursiveCluster.builder()
                .clusterId("cluster_id")
                .clusterSummary("cluster_summary")
                .totalNumberOfNodes(0L)
                .clusterHeader("cluster_header")
                .addNode(RecursiveCluster.Node.builder().filename("filename").text("text").build())
                .subclusters(listOf())
                .build()

        assertThat(recursiveCluster.clusterId()).isEqualTo("cluster_id")
        assertThat(recursiveCluster.clusterSummary()).isEqualTo("cluster_summary")
        assertThat(recursiveCluster.totalNumberOfNodes()).isEqualTo(0L)
        assertThat(recursiveCluster.clusterHeader()).contains("cluster_header")
        assertThat(recursiveCluster.nodes().getOrNull())
            .containsExactly(
                RecursiveCluster.Node.builder().filename("filename").text("text").build()
            )
        assertThat(recursiveCluster.subclusters().getOrNull()).containsExactly()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val recursiveCluster =
            RecursiveCluster.builder()
                .clusterId("cluster_id")
                .clusterSummary("cluster_summary")
                .totalNumberOfNodes(0L)
                .clusterHeader("cluster_header")
                .addNode(RecursiveCluster.Node.builder().filename("filename").text("text").build())
                .subclusters(listOf())
                .build()

        val roundtrippedRecursiveCluster =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(recursiveCluster),
                jacksonTypeRef<RecursiveCluster>(),
            )

        assertThat(roundtrippedRecursiveCluster).isEqualTo(recursiveCluster)
    }
}
