// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClient
import com.telnyx.api.models.managedaccounts.ManagedAccountCreateParams
import com.telnyx.api.models.managedaccounts.ManagedAccountListParams
import com.telnyx.api.models.managedaccounts.ManagedAccountUpdateGlobalChannelLimitParams
import com.telnyx.api.models.managedaccounts.ManagedAccountUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ManagedAccountServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
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

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val managedAccountService = client.managedAccounts()

        val managedAccount = managedAccountService.retrieve("id")

        managedAccount.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
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

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val managedAccountService = client.managedAccounts()

        val managedAccounts =
            managedAccountService.list(
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

        managedAccounts.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getAllocatableGlobalOutboundChannels() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val managedAccountService = client.managedAccounts()

        val response = managedAccountService.getAllocatableGlobalOutboundChannels()

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun updateGlobalChannelLimit() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
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
