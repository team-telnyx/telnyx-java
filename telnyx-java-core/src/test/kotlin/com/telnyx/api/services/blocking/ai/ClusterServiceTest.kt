// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking.ai

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClient
import com.telnyx.api.models.ai.clusters.ClusterComputeParams
import com.telnyx.api.models.ai.clusters.ClusterFetchGraphParams
import com.telnyx.api.models.ai.clusters.ClusterListParams
import com.telnyx.api.models.ai.clusters.ClusterRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ClusterServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val clusterService = client.ai().clusters()

        val cluster =
            clusterService.retrieve(
                ClusterRetrieveParams.builder()
                    .taskId("task_id")
                    .showSubclusters(true)
                    .topNNodes(0L)
                    .build()
            )

        cluster.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val clusterService = client.ai().clusters()

        val clusters =
            clusterService.list(
                ClusterListParams.builder()
                    .page(ClusterListParams.Page.builder().number(0L).size(0L).build())
                    .build()
            )

        clusters.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val clusterService = client.ai().clusters()

        clusterService.delete("task_id")
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun compute() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val clusterService = client.ai().clusters()

        val response =
            clusterService.compute(
                ClusterComputeParams.builder()
                    .bucket("bucket")
                    .addFile("string")
                    .minClusterSize(0L)
                    .minSubclusterSize(0L)
                    .prefix("prefix")
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun fetchGraph() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val clusterService = client.ai().clusters()

        val response =
            clusterService.fetchGraph(
                ClusterFetchGraphParams.builder().taskId("task_id").clusterId(0L).build()
            )

        response.validate()
    }
}
