// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.spendlimits.SpendLimitCreateParams
import com.telnyx.sdk.models.spendlimits.SpendLimitDeleteParams
import com.telnyx.sdk.models.spendlimits.SpendLimitPeriod
import com.telnyx.sdk.models.spendlimits.SpendLimitUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SpendLimitServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val spendLimitService = client.spendLimits()

        val spendLimitResponse =
            spendLimitService.create(
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

        spendLimitResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val spendLimitService = client.spendLimits()

        val spendLimitResponse =
            spendLimitService.update(
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

        spendLimitResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val spendLimitService = client.spendLimits()

        val spendLimits = spendLimitService.list()

        spendLimits.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val spendLimitService = client.spendLimits()

        val spendLimitResponse =
            spendLimitService.delete(
                SpendLimitDeleteParams.builder()
                    .product("inference")
                    .period(SpendLimitPeriod.DAILY)
                    .reason("reason")
                    .build()
            )

        spendLimitResponse.validate()
    }
}
