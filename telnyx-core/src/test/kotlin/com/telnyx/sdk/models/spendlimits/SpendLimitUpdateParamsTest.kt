// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.spendlimits

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SpendLimitUpdateParamsTest {

    @Test
    fun create() {
        SpendLimitUpdateParams.builder()
            .product("inference")
            .period(SpendLimitPeriod.DAILY)
            .body(
                SpendLimitUpdateParams.Body.UpdateSpendLimitWithAmount.builder()
                    .amount(250.0)
                    .reason("Raised for the product launch")
                    .unlimited(
                        SpendLimitUpdateParams.Body.UpdateSpendLimitWithAmount.Unlimited.FALSE
                    )
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            SpendLimitUpdateParams.builder()
                .product("inference")
                .body(
                    SpendLimitUpdateParams.Body.UpdateSpendLimitWithAmount.builder()
                        .amount(250.0)
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("inference")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            SpendLimitUpdateParams.builder()
                .product("inference")
                .period(SpendLimitPeriod.DAILY)
                .body(
                    SpendLimitUpdateParams.Body.UpdateSpendLimitWithAmount.builder()
                        .amount(250.0)
                        .reason("Raised for the product launch")
                        .unlimited(
                            SpendLimitUpdateParams.Body.UpdateSpendLimitWithAmount.Unlimited.FALSE
                        )
                        .build()
                )
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("period", "daily").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            SpendLimitUpdateParams.builder()
                .product("inference")
                .body(
                    SpendLimitUpdateParams.Body.UpdateSpendLimitWithAmount.builder()
                        .amount(250.0)
                        .build()
                )
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Test
    fun body() {
        val params =
            SpendLimitUpdateParams.builder()
                .product("inference")
                .period(SpendLimitPeriod.DAILY)
                .body(
                    SpendLimitUpdateParams.Body.UpdateSpendLimitWithAmount.builder()
                        .amount(250.0)
                        .reason("Raised for the product launch")
                        .unlimited(
                            SpendLimitUpdateParams.Body.UpdateSpendLimitWithAmount.Unlimited.FALSE
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                SpendLimitUpdateParams.Body.ofUpdateSpendLimitWithAmount(
                    SpendLimitUpdateParams.Body.UpdateSpendLimitWithAmount.builder()
                        .amount(250.0)
                        .reason("Raised for the product launch")
                        .unlimited(
                            SpendLimitUpdateParams.Body.UpdateSpendLimitWithAmount.Unlimited.FALSE
                        )
                        .build()
                )
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            SpendLimitUpdateParams.builder()
                .product("inference")
                .body(
                    SpendLimitUpdateParams.Body.UpdateSpendLimitWithAmount.builder()
                        .amount(250.0)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                SpendLimitUpdateParams.Body.ofUpdateSpendLimitWithAmount(
                    SpendLimitUpdateParams.Body.UpdateSpendLimitWithAmount.builder()
                        .amount(250.0)
                        .build()
                )
            )
    }
}
