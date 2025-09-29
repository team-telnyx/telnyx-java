// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.ai.clusters

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ClusterDeleteParamsTest {

    @Test
    fun create() {
        ClusterDeleteParams.builder().taskId("task_id").build()
    }

    @Test
    fun pathParams() {
        val params = ClusterDeleteParams.builder().taskId("task_id").build()

        assertThat(params._pathParam(0)).isEqualTo("task_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
