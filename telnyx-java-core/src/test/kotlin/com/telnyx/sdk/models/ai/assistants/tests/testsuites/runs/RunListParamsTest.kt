// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants.tests.testsuites.runs

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RunListParamsTest {

    @Test
    fun create() {
        RunListParams.builder()
            .suiteName("suite_name")
            .pageNumber(0L)
            .pageSize(0L)
            .status("status")
            .testSuiteRunId("test_suite_run_id")
            .build()
    }

    @Test
    fun pathParams() {
        val params = RunListParams.builder().suiteName("suite_name").build()

        assertThat(params._pathParam(0)).isEqualTo("suite_name")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            RunListParams.builder()
                .suiteName("suite_name")
                .pageNumber(0L)
                .pageSize(0L)
                .status("status")
                .testSuiteRunId("test_suite_run_id")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("page[number]", "0")
                    .put("page[size]", "0")
                    .put("status", "status")
                    .put("test_suite_run_id", "test_suite_run_id")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = RunListParams.builder().suiteName("suite_name").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
