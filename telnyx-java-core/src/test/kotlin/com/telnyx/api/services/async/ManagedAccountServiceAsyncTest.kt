// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.api.models.managedaccounts.ManagedAccountCreateParams
import com.telnyx.api.models.managedaccounts.ManagedAccountListParams
import com.telnyx.api.models.managedaccounts.ManagedAccountUpdateGlobalChannelLimitParams
import com.telnyx.api.models.managedaccounts.ManagedAccountUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ManagedAccountServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
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

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val managedAccountServiceAsync = client.managedAccounts()

        val managedAccountFuture = managedAccountServiceAsync.retrieve("id")

        val managedAccount = managedAccountFuture.get()
        managedAccount.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
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

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val managedAccountServiceAsync = client.managedAccounts()

        val managedAccountsFuture =
            managedAccountServiceAsync.list(
                ManagedAccountListParams.builder()
                    .filter(
                        ManagedAccountListParams.Filter.builder()
                            .email(
                                ManagedAccountListParams.Filter.Email.builder()
                                    .contains("john")
                                    .eq("eq")
                                    .build()
                            )
                            .organizationName(
                                ManagedAccountListParams.Filter.OrganizationName.builder()
                                    .contains("contains")
                                    .eq("Example Company LLC")
                                    .build()
                            )
                            .build()
                    )
                    .includeCancelledAccounts(true)
                    .page(ManagedAccountListParams.Page.builder().number(1L).size(1L).build())
                    .sort(ManagedAccountListParams.Sort.EMAIL)
                    .build()
            )

        val managedAccounts = managedAccountsFuture.get()
        managedAccounts.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getAllocatableGlobalOutboundChannels() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val managedAccountServiceAsync = client.managedAccounts()

        val responseFuture = managedAccountServiceAsync.getAllocatableGlobalOutboundChannels()

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun updateGlobalChannelLimit() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
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
