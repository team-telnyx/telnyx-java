// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.ips

import com.telnyx.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IpListParamsTest {

    @Test
    fun create() {
        IpListParams.builder()
            .filter(
                IpListParams.Filter.builder()
                    .connectionId("connection_id")
                    .ipAddress("192.168.0.0")
                    .port(5060L)
                    .build()
            )
            .page(IpListParams.Page.builder().number(1L).size(1L).build())
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            IpListParams.builder()
                .filter(
                    IpListParams.Filter.builder()
                        .connectionId("connection_id")
                        .ipAddress("192.168.0.0")
                        .port(5060L)
                        .build()
                )
                .page(IpListParams.Page.builder().number(1L).size(1L).build())
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("filter[connection_id]", "connection_id")
                    .put("filter[ip_address]", "192.168.0.0")
                    .put("filter[port]", "5060")
                    .put("page[number]", "1")
                    .put("page[size]", "1")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = IpListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
