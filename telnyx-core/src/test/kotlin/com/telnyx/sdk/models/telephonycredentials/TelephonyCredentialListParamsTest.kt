// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.telephonycredentials

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TelephonyCredentialListParamsTest {

    @Test
    fun create() {
        TelephonyCredentialListParams.builder()
            .filter(
                TelephonyCredentialListParams.Filter.builder()
                    .name("name")
                    .resourceId("resource_id")
                    .sipUsername("sip_username")
                    .status("status")
                    .tag("tag")
                    .build()
            )
            .pageNumber(0L)
            .pageSize(0L)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            TelephonyCredentialListParams.builder()
                .filter(
                    TelephonyCredentialListParams.Filter.builder()
                        .name("name")
                        .resourceId("resource_id")
                        .sipUsername("sip_username")
                        .status("status")
                        .tag("tag")
                        .build()
                )
                .pageNumber(0L)
                .pageSize(0L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("filter[name]", "name")
                    .put("filter[resource_id]", "resource_id")
                    .put("filter[sip_username]", "sip_username")
                    .put("filter[status]", "status")
                    .put("filter[tag]", "tag")
                    .put("page[number]", "0")
                    .put("page[size]", "0")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = TelephonyCredentialListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
