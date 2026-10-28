// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.tests.schedules.v1.cronjobs

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CronJobRetrieveCronJobsParamsTest {

    @Test
    fun create() {
        CronJobRetrieveCronJobsParams.builder().agentId(0L).build()
    }

    @Test
    fun queryParams() {
        val params = CronJobRetrieveCronJobsParams.builder().agentId(0L).build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("agent_id", "0").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = CronJobRetrieveCronJobsParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
