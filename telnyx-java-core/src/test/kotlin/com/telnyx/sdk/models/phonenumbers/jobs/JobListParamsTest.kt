// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.phonenumbers.jobs

import com.telnyx.sdk.core.http.QueryParams
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
            .pageNumber(0L)
            .pageSize(0L)
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
                .pageNumber(0L)
                .pageSize(0L)
                .sort(JobListParams.Sort.CREATED_AT)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("filter[type]", "update_emergency_settings")
                    .put("page[number]", "0")
                    .put("page[size]", "0")
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
