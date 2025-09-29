// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.globalipassignments

import com.telnyx.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GlobalIpAssignmentListParamsTest {

    @Test
    fun create() {
        GlobalIpAssignmentListParams.builder()
            .page(GlobalIpAssignmentListParams.Page.builder().number(1L).size(1L).build())
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            GlobalIpAssignmentListParams.builder()
                .page(GlobalIpAssignmentListParams.Page.builder().number(1L).size(1L).build())
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder().put("page[number]", "1").put("page[size]", "1").build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = GlobalIpAssignmentListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
