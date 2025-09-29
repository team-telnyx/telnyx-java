// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.phonenumberblocks.jobs

import com.telnyx.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class JobListParamsTest {

    @Test
    fun create() {
        JobListParams.builder()
            .filter(
                JobListParams.Filter.builder()
                    .status(JobListParams.Filter.Status.IN_PROGRESS)
                    .type(JobListParams.Filter.Type.DELETE_PHONE_NUMBER_BLOCK)
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
                        .status(JobListParams.Filter.Status.IN_PROGRESS)
                        .type(JobListParams.Filter.Type.DELETE_PHONE_NUMBER_BLOCK)
                        .build()
                )
                .page(JobListParams.Page.builder().number(1L).size(1L).build())
                .sort(JobListParams.Sort.CREATED_AT)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("filter[status]", "in_progress")
                    .put("filter[type]", "delete_phone_number_block")
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
