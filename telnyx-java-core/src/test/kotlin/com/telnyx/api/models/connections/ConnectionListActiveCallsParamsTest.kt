// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.connections

import com.telnyx.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConnectionListActiveCallsParamsTest {

    @Test
    fun create() {
        ConnectionListActiveCallsParams.builder()
            .connectionId("1293384261075731461")
            .page(
                ConnectionListActiveCallsParams.Page.builder()
                    .after("after")
                    .before("before")
                    .limit(1L)
                    .number(1L)
                    .size(1L)
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ConnectionListActiveCallsParams.builder().connectionId("1293384261075731461").build()

        assertThat(params._pathParam(0)).isEqualTo("1293384261075731461")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            ConnectionListActiveCallsParams.builder()
                .connectionId("1293384261075731461")
                .page(
                    ConnectionListActiveCallsParams.Page.builder()
                        .after("after")
                        .before("before")
                        .limit(1L)
                        .number(1L)
                        .size(1L)
                        .build()
                )
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("page[after]", "after")
                    .put("page[before]", "before")
                    .put("page[limit]", "1")
                    .put("page[number]", "1")
                    .put("page[size]", "1")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            ConnectionListActiveCallsParams.builder().connectionId("1293384261075731461").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
