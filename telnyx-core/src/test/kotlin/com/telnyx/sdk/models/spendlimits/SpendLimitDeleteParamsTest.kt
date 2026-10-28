// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.spendlimits

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SpendLimitDeleteParamsTest {

    @Test
    fun create() {
        SpendLimitDeleteParams.builder()
            .product("inference")
            .credentialId("KEY0192F3A1B2C3D4E5F6A7B8C9D0E1F2")
            .period(SpendLimitPeriod.DAILY)
            .reason("reason")
            .build()
    }

    @Test
    fun pathParams() {
        val params = SpendLimitDeleteParams.builder().product("inference").build()

        assertThat(params._pathParam(0)).isEqualTo("inference")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            SpendLimitDeleteParams.builder()
                .product("inference")
                .credentialId("KEY0192F3A1B2C3D4E5F6A7B8C9D0E1F2")
                .period(SpendLimitPeriod.DAILY)
                .reason("reason")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("credential_id", "KEY0192F3A1B2C3D4E5F6A7B8C9D0E1F2")
                    .put("period", "daily")
                    .put("reason", "reason")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = SpendLimitDeleteParams.builder().product("inference").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
