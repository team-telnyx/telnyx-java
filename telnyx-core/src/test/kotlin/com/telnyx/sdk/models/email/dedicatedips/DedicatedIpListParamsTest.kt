// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.email.dedicatedips

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DedicatedIpListParamsTest {

    @Test
    fun create() {
        DedicatedIpListParams.builder()
            .filterPoolId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .filterRegion("filter[region]")
            .filterStatus(DedicatedIpListParams.FilterStatus.PROVISIONING)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            DedicatedIpListParams.builder()
                .filterPoolId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .filterRegion("filter[region]")
                .filterStatus(DedicatedIpListParams.FilterStatus.PROVISIONING)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("filter[pool_id]", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("filter[region]", "filter[region]")
                    .put("filter[status]", "provisioning")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = DedicatedIpListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
