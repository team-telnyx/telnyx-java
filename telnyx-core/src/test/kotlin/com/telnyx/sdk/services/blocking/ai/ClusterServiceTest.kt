// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai

import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.ai.clusters.ClusterComputeParams
import com.telnyx.sdk.models.ai.clusters.ClusterFetchGraphParams
import com.telnyx.sdk.models.ai.clusters.ClusterRetrieveParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.parallel.ResourceLock

@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class ClusterServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
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
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val clusterService = client.ai().clusters()

        val page = clusterService.list()

        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val clusterService = client.ai().clusters()

        clusterService.delete("task_id")
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun compute() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
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

    @Test
    fun fetchGraph(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .apiKey("My API Key")
                .build()
        val clusterService = client.ai().clusters()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val response =
            clusterService.fetchGraph(
                ClusterFetchGraphParams.builder().taskId("task_id").clusterId(0L).build()
            )

        assertThat(response.body()).hasContent("abc")
    }
}
