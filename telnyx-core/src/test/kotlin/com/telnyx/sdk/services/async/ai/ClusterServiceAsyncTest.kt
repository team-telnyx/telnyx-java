// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai

import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.ai.clusters.ClusterComputeParams
import com.telnyx.sdk.models.ai.clusters.ClusterFetchGraphParams
import com.telnyx.sdk.models.ai.clusters.ClusterRetrieveParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.junit.jupiter.api.parallel.ResourceLock

@ExtendWith(TestServerExtension::class)
@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
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

        val pageFuture = clusterServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
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

    @Test
    fun fetchGraph(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .apiKey("My API Key")
                .build()
        val clusterServiceAsync = client.ai().clusters()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val responseFuture =
            clusterServiceAsync.fetchGraph(
                ClusterFetchGraphParams.builder().taskId("task_id").clusterId(0L).build()
            )

        val response = responseFuture.get()
        assertThat(response.body()).hasContent("abc")
    }
}
