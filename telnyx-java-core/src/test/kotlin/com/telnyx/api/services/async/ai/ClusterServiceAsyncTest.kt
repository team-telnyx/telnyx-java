// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async.ai

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.api.models.ai.clusters.ClusterComputeParams
import com.telnyx.api.models.ai.clusters.ClusterFetchGraphParams
import com.telnyx.api.models.ai.clusters.ClusterListParams
import com.telnyx.api.models.ai.clusters.ClusterRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ClusterServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val clusterServiceAsync = client.ai().clusters()

        val clusterFuture =
            clusterServiceAsync.retrieve(
                ClusterRetrieveParams.builder()
                    .taskId("task_id")
                    .showSubclusters(true)
                    .topNNodes(0L)
                    .build()
            )

        val cluster = clusterFuture.get()
        cluster.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val clusterServiceAsync = client.ai().clusters()

        val clustersFuture =
            clusterServiceAsync.list(
                ClusterListParams.builder()
                    .page(ClusterListParams.Page.builder().number(0L).size(0L).build())
                    .build()
            )

        val clusters = clustersFuture.get()
        clusters.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val clusterServiceAsync = client.ai().clusters()

        val future = clusterServiceAsync.delete("task_id")

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun compute() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val clusterServiceAsync = client.ai().clusters()

        val responseFuture =
            clusterServiceAsync.compute(
                ClusterComputeParams.builder()
                    .bucket("bucket")
                    .addFile("string")
                    .minClusterSize(0L)
                    .minSubclusterSize(0L)
                    .prefix("prefix")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun fetchGraph() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val clusterServiceAsync = client.ai().clusters()

        val responseFuture =
            clusterServiceAsync.fetchGraph(
                ClusterFetchGraphParams.builder().taskId("task_id").clusterId(0L).build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
