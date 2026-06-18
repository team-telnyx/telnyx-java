// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.clusters

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.messaging10dlc.phonenumberassignmentbyprofile.TaskStatus
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ClusterRetrieveResponseTest {

    @Test
    fun create() {
        val clusterRetrieveResponse =
            ClusterRetrieveResponse.builder()
                .data(
                    ClusterRetrieveResponse.Data.builder()
                        .bucket("bucket")
                        .addCluster(
                            RecursiveCluster.builder()
                                .clusterId("cluster_id")
                                .clusterSummary("cluster_summary")
                                .totalNumberOfNodes(0L)
                                .clusterHeader("cluster_header")
                                .addNode(
                                    RecursiveCluster.Node.builder()
                                        .filename("filename")
                                        .text("text")
                                        .build()
                                )
                                .subclusters(listOf())
                                .build()
                        )
                        .status(TaskStatus.PENDING)
                        .build()
                )
                .build()

        assertThat(clusterRetrieveResponse.data())
            .isEqualTo(
                ClusterRetrieveResponse.Data.builder()
                    .bucket("bucket")
                    .addCluster(
                        RecursiveCluster.builder()
                            .clusterId("cluster_id")
                            .clusterSummary("cluster_summary")
                            .totalNumberOfNodes(0L)
                            .clusterHeader("cluster_header")
                            .addNode(
                                RecursiveCluster.Node.builder()
                                    .filename("filename")
                                    .text("text")
                                    .build()
                            )
                            .subclusters(listOf())
                            .build()
                    )
                    .status(TaskStatus.PENDING)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val clusterRetrieveResponse =
            ClusterRetrieveResponse.builder()
                .data(
                    ClusterRetrieveResponse.Data.builder()
                        .bucket("bucket")
                        .addCluster(
                            RecursiveCluster.builder()
                                .clusterId("cluster_id")
                                .clusterSummary("cluster_summary")
                                .totalNumberOfNodes(0L)
                                .clusterHeader("cluster_header")
                                .addNode(
                                    RecursiveCluster.Node.builder()
                                        .filename("filename")
                                        .text("text")
                                        .build()
                                )
                                .subclusters(listOf())
                                .build()
                        )
                        .status(TaskStatus.PENDING)
                        .build()
                )
                .build()

        val roundtrippedClusterRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(clusterRetrieveResponse),
                jacksonTypeRef<ClusterRetrieveResponse>(),
            )

        assertThat(roundtrippedClusterRetrieveResponse).isEqualTo(clusterRetrieveResponse)
    }
}
