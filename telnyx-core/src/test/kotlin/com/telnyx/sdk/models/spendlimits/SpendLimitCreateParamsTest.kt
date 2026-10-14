// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.spendlimits

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SpendLimitCreateParamsTest {

    @Test
    fun create() {
        SpendLimitCreateParams.builder()
            .body(
                SpendLimitCreateParams.Body.CreateSpendLimitWithAmount.builder()
                    .amount(100.0)
                    .product("inference")
                    .period(SpendLimitPeriod.DAILY)
                    .reason("Team budget")
                    .unlimited(
                        SpendLimitCreateParams.Body.CreateSpendLimitWithAmount.Unlimited.FALSE
                    )
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            SpendLimitCreateParams.builder()
                .body(
                    SpendLimitCreateParams.Body.CreateSpendLimitWithAmount.builder()
                        .amount(100.0)
                        .product("inference")
                        .period(SpendLimitPeriod.DAILY)
                        .reason("Team budget")
                        .unlimited(
                            SpendLimitCreateParams.Body.CreateSpendLimitWithAmount.Unlimited.FALSE
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                SpendLimitCreateParams.Body.ofCreateSpendLimitWithAmount(
                    SpendLimitCreateParams.Body.CreateSpendLimitWithAmount.builder()
                        .amount(100.0)
                        .product("inference")
                        .period(SpendLimitPeriod.DAILY)
                        .reason("Team budget")
                        .unlimited(
                            SpendLimitCreateParams.Body.CreateSpendLimitWithAmount.Unlimited.FALSE
                        )
                        .build()
                )
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            SpendLimitCreateParams.builder()
                .body(
                    SpendLimitCreateParams.Body.CreateSpendLimitWithAmount.builder()
                        .amount(100.0)
                        .product("inference")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                SpendLimitCreateParams.Body.ofCreateSpendLimitWithAmount(
                    SpendLimitCreateParams.Body.CreateSpendLimitWithAmount.builder()
                        .amount(100.0)
                        .product("inference")
                        .build()
                )
            )
    }
}
