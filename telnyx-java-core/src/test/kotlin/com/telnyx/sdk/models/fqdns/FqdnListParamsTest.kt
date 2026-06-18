// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.fqdns

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FqdnListParamsTest {

    @Test
    fun create() {
        FqdnListParams.builder()
            .filter(
                FqdnListParams.Filter.builder()
                    .connectionId("connection_id")
                    .dnsRecordType("a")
                    .fqdn("example.com")
                    .port(5060L)
                    .build()
            )
            .pageNumber(0L)
            .pageSize(0L)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            FqdnListParams.builder()
                .filter(
                    FqdnListParams.Filter.builder()
                        .connectionId("connection_id")
                        .dnsRecordType("a")
                        .fqdn("example.com")
                        .port(5060L)
                        .build()
                )
                .pageNumber(0L)
                .pageSize(0L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("filter[connection_id]", "connection_id")
                    .put("filter[dns_record_type]", "a")
                    .put("filter[fqdn]", "example.com")
                    .put("filter[port]", "5060")
                    .put("page[number]", "0")
                    .put("page[size]", "0")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = FqdnListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
