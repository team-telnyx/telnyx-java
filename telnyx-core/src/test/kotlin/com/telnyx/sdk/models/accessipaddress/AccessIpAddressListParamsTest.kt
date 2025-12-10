// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.accessipaddress

import com.telnyx.sdk.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccessIpAddressListParamsTest {

    @Test
    fun create() {
        AccessIpAddressListParams.builder()
            .filter(
                AccessIpAddressListParams.Filter.builder()
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .ipAddress("ip_address")
                    .ipSource("ip_source")
                    .build()
            )
            .pageNumber(0L)
            .pageSize(0L)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            AccessIpAddressListParams.builder()
                .filter(
                    AccessIpAddressListParams.Filter.builder()
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .ipAddress("ip_address")
                        .ipSource("ip_source")
                        .build()
                )
                .pageNumber(0L)
                .pageSize(0L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("filter[created_at]", "2019-12-27T18:11:19.117Z")
                    .put("filter[ip_address]", "ip_address")
                    .put("filter[ip_source]", "ip_source")
                    .put("page[number]", "0")
                    .put("page[size]", "0")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = AccessIpAddressListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
