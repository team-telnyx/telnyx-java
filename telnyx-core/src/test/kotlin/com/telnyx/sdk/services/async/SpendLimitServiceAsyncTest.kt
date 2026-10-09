// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.spendlimits.SpendLimitCreateParams
import com.telnyx.sdk.models.spendlimits.SpendLimitDeleteParams
import com.telnyx.sdk.models.spendlimits.SpendLimitPeriod
import com.telnyx.sdk.models.spendlimits.SpendLimitUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SpendLimitServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val spendLimitServiceAsync = client.spendLimits()

        val spendLimitResponseFuture =
            spendLimitServiceAsync.create(
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

        val spendLimitResponse = spendLimitResponseFuture.get()
        spendLimitResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val spendLimitServiceAsync = client.spendLimits()

        val spendLimitResponseFuture =
            spendLimitServiceAsync.update(
                SpendLimitUpdateParams.builder()
                    .product("inference")
                    .period(SpendLimitPeriod.DAILY)
                    .body(
                        SpendLimitUpdateParams.Body.UpdateSpendLimitWithAmount.builder()
                            .amount(250.0)
                            .reason("Raised for the product launch")
                            .unlimited(
                                SpendLimitUpdateParams.Body.UpdateSpendLimitWithAmount.Unlimited
                                    .FALSE
                            )
                            .build()
                    )
                    .build()
            )

        val spendLimitResponse = spendLimitResponseFuture.get()
        spendLimitResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val spendLimitServiceAsync = client.spendLimits()

        val spendLimitsFuture = spendLimitServiceAsync.list()

        val spendLimits = spendLimitsFuture.get()
        spendLimits.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val spendLimitServiceAsync = client.spendLimits()

        val spendLimitResponseFuture =
            spendLimitServiceAsync.delete(
                SpendLimitDeleteParams.builder()
                    .product("inference")
                    .period(SpendLimitPeriod.DAILY)
                    .reason("reason")
                    .build()
            )

        val spendLimitResponse = spendLimitResponseFuture.get()
        spendLimitResponse.validate()
    }
}
