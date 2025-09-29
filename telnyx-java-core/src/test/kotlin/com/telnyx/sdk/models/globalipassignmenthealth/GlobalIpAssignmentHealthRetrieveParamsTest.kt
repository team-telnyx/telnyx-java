// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.globalipassignmenthealth

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GlobalIpAssignmentHealthRetrieveParamsTest {

    @Test
    fun create() {
        GlobalIpAssignmentHealthRetrieveParams.builder()
            .filter(
                GlobalIpAssignmentHealthRetrieveParams.Filter.builder()
                    .globalIpAssignmentId("string")
                    .globalIpId("string")
                    .build()
            )
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            GlobalIpAssignmentHealthRetrieveParams.builder()
                .filter(
                    GlobalIpAssignmentHealthRetrieveParams.Filter.builder()
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
        val params = GlobalIpAssignmentHealthRetrieveParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
