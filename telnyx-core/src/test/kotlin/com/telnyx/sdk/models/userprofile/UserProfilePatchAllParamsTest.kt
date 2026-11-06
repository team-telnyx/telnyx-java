// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.userprofile

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserProfilePatchAllParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertThat(body.address1()).contains("123 Example Street")
        assertThat(body.address2()).contains("Suite 100")
        assertThat(body.businessName()).contains("Example Company")
        assertThat(body.city()).contains("Chicago")
        assertThat(body.companySize()).contains("11-50")
        assertThat(body.country()).contains("US")
        assertThat(body.dataLocality()).contains(UserProfilePatchAllParams.DataLocality.DEU)
        assertThat(body.defaultManagedAccountAllowCustomPricing()).contains(false)
        assertThat(body.defaultManagedAccountInheritEmergencyTermsOfService()).contains(false)
        assertThat(body.defaultManagedAccountRollupBilling()).contains(false)
        assertThat(body.defaultNotifyManagerAccount()).contains(true)
        assertThat(body.defaultNumbersExternalPin()).contains("1234")
        assertThat(body.firstName()).contains("Alex")
        assertThat(body.gotFreeNumberAtSignup()).contains(false)
        assertThat(body.lastName()).contains("Taylor")
        assertThat(body.lowBalanceNotificationFrequency())
            .contains(UserProfilePatchAllParams.LowBalanceNotificationFrequency.FREQUENCY_12)
        assertThat(body.lowBalanceThresholdAmount()).contains(10.0)
        assertThat(body.notifyOnInvoiceAvailable()).contains(true)
        assertThat(body.notifyOnInvoicePayment()).contains(false)
        assertThat(body.npacUser()).contains(false)
        assertThat(body.onboardingBuildMethod().getOrNull()).containsExactly("API")
        assertThat(body.onboardingIndustries().getOrNull()).containsExactly("software")
        assertThat(body.onboardingMonthlyBudget().getOrNull()).containsExactly("1000-5000")
        assertThat(body.onboardingProductInterest().getOrNull()).containsExactly("voice")
        assertThat(body.onboardingProjectTypes().getOrNull()).containsExactly("contact center")
        assertThat(body.onboardingReasonsForConsideration().getOrNull())
            .containsExactly("API integration")
        assertThat(body.onboardingReferrer().getOrNull()).containsExactly("search engine")
        assertThat(body.onboardingUseCasesOther().getOrNull()).containsExactly("customer support")
        assertThat(body.phoneNumber()).contains("+13125550100")
        assertThat(body.portOutPinValidation()).contains(false)
        assertThat(body.primaryUseCase()).contains("configure sip trunks")
        assertThat(body.role()).contains("account manager")
        assertThat(body.state()).contains("IL")
        assertThat(body.uiTheme()).contains(UserProfilePatchAllParams.UiTheme.LIGHT)
        assertThat(body.useCases().getOrNull()).containsExactly("voice")
        assertThat(body.userSubscriptionOptIn()).contains(false)
        assertThat(body.zip()).contains("60601")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = UserProfilePatchAllParams.builder().build()

        val body = params._body()
    }
}
