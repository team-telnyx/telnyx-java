// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.storage.cloudfs

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CloudfListParamsTest {

    @Test
    fun create() {
        CloudfListParams.builder()
            .filterName("filter[name]")
            .filterRegion("us-east-1")
            .filterStatus(CloudfListParams.FilterStatus.PROVISIONING)
            .pageAfter("page[after]")
            .pageBefore("page[before]")
            .pageLimit(1L)
            .sort(CloudfListParams.Sort.CREATED_AT)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            CloudfListParams.builder()
                .filterName("filter[name]")
                .filterRegion("us-east-1")
                .filterStatus(CloudfListParams.FilterStatus.PROVISIONING)
                .pageAfter("page[after]")
                .pageBefore("page[before]")
                .pageLimit(1L)
                .sort(CloudfListParams.Sort.CREATED_AT)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("filter[name]", "filter[name]")
                    .put("filter[region]", "us-east-1")
                    .put("filter[status]", "provisioning")
                    .put("page[after]", "page[after]")
                    .put("page[before]", "page[before]")
                    .put("page[limit]", "1")
                    .put("sort", "created_at")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = CloudfListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
