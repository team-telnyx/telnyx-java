// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.accessipranges

import com.telnyx.api.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccessIpRangeListParamsTest {

    @Test
    fun create() {
        AccessIpRangeListParams.builder()
            .filter(
                AccessIpRangeListParams.Filter.builder()
                    .cidrBlock("string")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
            .page(AccessIpRangeListParams.Page.builder().number(0L).size(250L).build())
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            AccessIpRangeListParams.builder()
                .filter(
                    AccessIpRangeListParams.Filter.builder()
                        .cidrBlock("string")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .page(AccessIpRangeListParams.Page.builder().number(0L).size(250L).build())
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("filter[cidr_block]", "string")
                    .put("filter[created_at]", "2019-12-27T18:11:19.117Z")
                    .put("page[number]", "0")
                    .put("page[size]", "250")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = AccessIpRangeListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
