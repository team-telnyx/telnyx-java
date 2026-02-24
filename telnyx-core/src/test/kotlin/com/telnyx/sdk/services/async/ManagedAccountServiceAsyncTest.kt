// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.managedaccounts.ManagedAccountCreateParams
import com.telnyx.sdk.models.managedaccounts.ManagedAccountUpdateGlobalChannelLimitParams
import com.telnyx.sdk.models.managedaccounts.ManagedAccountUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ManagedAccountServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val managedAccountServiceAsync = client.managedAccounts()

        val managedAccountFuture =
            managedAccountServiceAsync.create(
                ManagedAccountCreateParams.builder()
                    .businessName("Larry's Cat Food Inc")
                    .email("larry_cat_food@customer.org")
                    .managedAccountAllowCustomPricing(false)
                    .password("3jVjLq!tMuWKyWx4NN*CvhnB")
                    .rollupBilling(false)
                    .build()
            )

        val managedAccount = managedAccountFuture.get()
        managedAccount.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val managedAccountServiceAsync = client.managedAccounts()

        val managedAccountFuture = managedAccountServiceAsync.retrieve("id")

        val managedAccount = managedAccountFuture.get()
        managedAccount.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val managedAccountServiceAsync = client.managedAccounts()

        val managedAccountFuture =
            managedAccountServiceAsync.update(
                ManagedAccountUpdateParams.builder()
                    .id("id")
                    .managedAccountAllowCustomPricing(true)
                    .build()
            )

        val managedAccount = managedAccountFuture.get()
        managedAccount.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val managedAccountServiceAsync = client.managedAccounts()

        val pageFuture = managedAccountServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getAllocatableGlobalOutboundChannels() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val managedAccountServiceAsync = client.managedAccounts()

        val responseFuture = managedAccountServiceAsync.getAllocatableGlobalOutboundChannels()

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateGlobalChannelLimit() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val managedAccountServiceAsync = client.managedAccounts()

        val responseFuture =
            managedAccountServiceAsync.updateGlobalChannelLimit(
                ManagedAccountUpdateGlobalChannelLimitParams.builder()
                    .id("id")
                    .channelLimit(30L)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
