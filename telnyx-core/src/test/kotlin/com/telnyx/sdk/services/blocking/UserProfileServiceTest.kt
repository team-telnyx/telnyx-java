// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.userprofile.UserProfilePatchAllParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class UserProfileServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val userProfileService = client.userProfile()

        val userProfiles = userProfileService.list()

        userProfiles.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun patchAll() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val userProfileService = client.userProfile()

        val response =
            userProfileService.patchAll(
                UserProfilePatchAllParams.builder()
                    .address1("123 Example Street")
                    .address2("Suite 100")
                    .businessName("Example Company")
                    .city("Chicago")
                    .companySize("11-50")
                    .country("US")
                    .dataLocality(UserProfilePatchAllParams.DataLocality.DEU)
                    .defaultManagedAccountAllowCustomPricing(false)
                    .defaultManagedAccountInheritEmergencyTermsOfService(false)
                    .defaultManagedAccountRollupBilling(false)
                    .defaultNotifyManagerAccount(true)
                    .defaultNumbersExternalPin("1234")
                    .firstName("Alex")
                    .gotFreeNumberAtSignup(false)
                    .lastName("Taylor")
                    .lowBalanceNotificationFrequency(
                        UserProfilePatchAllParams.LowBalanceNotificationFrequency.FREQUENCY_12
                    )
                    .lowBalanceThresholdAmount(10.0)
                    .notifyOnInvoiceAvailable(true)
                    .notifyOnInvoicePayment(false)
                    .npacUser(false)
                    .addOnboardingBuildMethod("API")
                    .addOnboardingIndustry("software")
                    .addOnboardingMonthlyBudget("1000-5000")
                    .addOnboardingProductInterest("voice")
                    .addOnboardingProjectType("contact center")
                    .addOnboardingReasonsForConsideration("API integration")
                    .addOnboardingReferrer("search engine")
                    .addOnboardingUseCasesOther("customer support")
                    .phoneNumber("+13125550100")
                    .portOutPinValidation(false)
                    .primaryUseCase("configure sip trunks")
                    .role("account manager")
                    .state("IL")
                    .uiTheme(UserProfilePatchAllParams.UiTheme.LIGHT)
                    .addUseCase("voice")
                    .userSubscriptionOptIn(false)
                    .zip("60601")
                    .build()
            )

        response.validate()
    }
}
