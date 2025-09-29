// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.phonenumbers.jobs

import com.telnyx.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class JobListParamsTest {

    @Test
    fun create() {
        JobListParams.builder()
            .filter(
                JobListParams.Filter.builder()
                    .type(JobListParams.Filter.Type.UPDATE_EMERGENCY_SETTINGS)
                    .build()
            )
            .page(JobListParams.Page.builder().number(1L).size(1L).build())
            .sort(JobListParams.Sort.CREATED_AT)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            JobListParams.builder()
                .filter(
                    JobListParams.Filter.builder()
                        .type(JobListParams.Filter.Type.UPDATE_EMERGENCY_SETTINGS)
                        .build()
                )
                .page(JobListParams.Page.builder().number(1L).size(1L).build())
                .sort(JobListParams.Sort.CREATED_AT)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("filter[type]", "update_emergency_settings")
                    .put("page[number]", "1")
                    .put("page[size]", "1")
                    .put("sort", "created_at")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = JobListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
