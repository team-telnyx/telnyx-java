// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.clusters

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ClusterFetchGraphParamsTest {

    @Test
    fun create() {
        ClusterFetchGraphParams.builder().taskId("task_id").clusterId(0L).build()
    }

    @Test
    fun pathParams() {
        val params = ClusterFetchGraphParams.builder().taskId("task_id").build()

        assertThat(params._pathParam(0)).isEqualTo("task_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params = ClusterFetchGraphParams.builder().taskId("task_id").clusterId(0L).build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("cluster_id", "0").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ClusterFetchGraphParams.builder().taskId("task_id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
