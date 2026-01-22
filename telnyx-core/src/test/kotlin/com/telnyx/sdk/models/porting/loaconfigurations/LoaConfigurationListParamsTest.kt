// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.porting.loaconfigurations

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LoaConfigurationListParamsTest {

    @Test
    fun create() {
        LoaConfigurationListParams.builder()
            .page(LoaConfigurationListParams.Page.builder().number(1L).size(1L).build())
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            LoaConfigurationListParams.builder()
                .page(LoaConfigurationListParams.Page.builder().number(1L).size(1L).build())
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder().put("page[number]", "1").put("page[size]", "1").build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = LoaConfigurationListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
