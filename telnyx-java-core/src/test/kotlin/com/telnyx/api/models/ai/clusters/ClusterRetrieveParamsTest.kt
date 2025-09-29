// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.ai.clusters

import com.telnyx.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ClusterRetrieveParamsTest {

    @Test
    fun create() {
        ClusterRetrieveParams.builder()
            .taskId("task_id")
            .showSubclusters(true)
            .topNNodes(0L)
            .build()
    }

    @Test
    fun pathParams() {
        val params = ClusterRetrieveParams.builder().taskId("task_id").build()

        assertThat(params._pathParam(0)).isEqualTo("task_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            ClusterRetrieveParams.builder()
                .taskId("task_id")
                .showSubclusters(true)
                .topNNodes(0L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("show_subclusters", "true")
                    .put("top_n_nodes", "0")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ClusterRetrieveParams.builder().taskId("task_id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
