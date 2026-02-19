// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.managedaccounts.ManagedAccountCreateParams
import com.telnyx.sdk.models.managedaccounts.ManagedAccountUpdateGlobalChannelLimitParams
import com.telnyx.sdk.models.managedaccounts.ManagedAccountUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ManagedAccountServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val managedAccountService = client.managedAccounts()

        val managedAccount =
            managedAccountService.create(
                ManagedAccountCreateParams.builder()
                    .businessName("Larry's Cat Food Inc")
                    .email("larry_cat_food@customer.org")
                    .managedAccountAllowCustomPricing(false)
                    .password("3jVjLq!tMuWKyWx4NN*CvhnB")
                    .rollupBilling(false)
                    .build()
            )

        managedAccount.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val managedAccountService = client.managedAccounts()

        val managedAccount = managedAccountService.retrieve("id")

        managedAccount.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val managedAccountService = client.managedAccounts()

        val managedAccount =
            managedAccountService.update(
                ManagedAccountUpdateParams.builder()
                    .id("id")
                    .managedAccountAllowCustomPricing(true)
                    .build()
            )

        managedAccount.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val managedAccountService = client.managedAccounts()

        val page = managedAccountService.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getAllocatableGlobalOutboundChannels() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val managedAccountService = client.managedAccounts()

        val response = managedAccountService.getAllocatableGlobalOutboundChannels()

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateGlobalChannelLimit() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val managedAccountService = client.managedAccounts()

        val response =
            managedAccountService.updateGlobalChannelLimit(
                ManagedAccountUpdateGlobalChannelLimitParams.builder()
                    .id("id")
                    .channelLimit(30L)
                    .build()
            )

        response.validate()
    }
}
