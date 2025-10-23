// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.finetuning.jobs

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class JobRetrieveParamsTest {

    @Test
    fun create() {
        JobRetrieveParams.builder().jobId("job_id").build()
    }

    @Test
    fun pathParams() {
        val params = JobRetrieveParams.builder().jobId("job_id").build()

        assertThat(params._pathParam(0)).isEqualTo("job_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
