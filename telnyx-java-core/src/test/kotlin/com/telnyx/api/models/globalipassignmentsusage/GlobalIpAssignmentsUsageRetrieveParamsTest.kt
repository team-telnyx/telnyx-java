// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.globalipassignmentsusage

import com.telnyx.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GlobalIpAssignmentsUsageRetrieveParamsTest {

    @Test
    fun create() {
        GlobalIpAssignmentsUsageRetrieveParams.builder()
            .filter(
                GlobalIpAssignmentsUsageRetrieveParams.Filter.builder()
                    .globalIpAssignmentId("string")
                    .globalIpId("string")
                    .build()
            )
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            GlobalIpAssignmentsUsageRetrieveParams.builder()
                .filter(
                    GlobalIpAssignmentsUsageRetrieveParams.Filter.builder()
                        .globalIpAssignmentId("string")
                        .globalIpId("string")
                        .build()
                )
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("filter[global_ip_assignment_id]", "string")
                    .put("filter[global_ip_id]", "string")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = GlobalIpAssignmentsUsageRetrieveParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
