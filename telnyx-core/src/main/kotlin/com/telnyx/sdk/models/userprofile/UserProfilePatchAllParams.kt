// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.userprofile

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Update the authenticated user's profile using top-level JSON fields. Returns the updated profile.
 *
 * **Beta:** this API should be considered a beta integration target because it may change if user
 * account settings require changes
 */
class UserProfilePatchAllParams
private constructor(
    private val body: Body,
    private val additionalHeaders: com.telnyx.sdk.core.http.Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * First line of the profile address.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun address1(): Optional<String> = body.address1()

    /**
     * Second line of the profile address.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun address2(): Optional<String> = body.address2()

    /**
     * Business name associated with the profile.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun businessName(): Optional<String> = body.businessName()

    /**
     * City in the profile address.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun city(): Optional<String> = body.city()

    /**
     * Company size reported by the user.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun companySize(): Optional<String> = body.companySize()

    /**
     * Country code in the profile address.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun country(): Optional<String> = body.country()

    /**
     * Data locality: USA (United States), DEU (Germany), AUS (Australia), UAE (United Arab
     * Emirates), or CAN (Canada). A change is permitted only if data locality has not previously
     * been changed. A successful change sets data_locality_updated_at and initializes
     * data_locality_migration_status to not_started.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dataLocality(): Optional<DataLocality> = body.dataLocality()

    /**
     * Default custom-pricing setting for managed accounts.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun defaultManagedAccountAllowCustomPricing(): Optional<Boolean> =
        body.defaultManagedAccountAllowCustomPricing()

    /**
     * Default emergency terms-of-service inheritance setting for managed accounts, where supported.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun defaultManagedAccountInheritEmergencyTermsOfService(): Optional<Boolean> =
        body.defaultManagedAccountInheritEmergencyTermsOfService()

    /**
     * Default rollup-billing setting for managed accounts.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun defaultManagedAccountRollupBilling(): Optional<Boolean> =
        body.defaultManagedAccountRollupBilling()

    /**
     * Default setting for notifying the manager account.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun defaultNotifyManagerAccount(): Optional<Boolean> = body.defaultNotifyManagerAccount()

    /**
     * Default alphanumeric external PIN for phone numbers.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun defaultNumbersExternalPin(): Optional<String> = body.defaultNumbersExternalPin()

    /**
     * The user's first name.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun firstName(): Optional<String> = body.firstName()

    /**
     * Whether the user received a free number at signup.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun gotFreeNumberAtSignup(): Optional<Boolean> = body.gotFreeNumberAtSignup()

    /**
     * The user's last name.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lastName(): Optional<String> = body.lastName()

    /**
     * Low-balance notification frequency. Organization sub-users cannot set a non-null frequency.
     * The resulting profile must have both a threshold and frequency, or neither.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lowBalanceNotificationFrequency(): Optional<LowBalanceNotificationFrequency> =
        body.lowBalanceNotificationFrequency()

    /**
     * Low-balance notification threshold in the billing currency. The resulting profile must have
     * both a threshold and notification frequency, or neither.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lowBalanceThresholdAmount(): Optional<Double> = body.lowBalanceThresholdAmount()

    /**
     * Whether to notify the user when an invoice is available.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun notifyOnInvoiceAvailable(): Optional<Boolean> = body.notifyOnInvoiceAvailable()

    /**
     * Whether to notify the user when an invoice is paid.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun notifyOnInvoicePayment(): Optional<Boolean> = body.notifyOnInvoicePayment()

    /**
     * Whether the user is an NPAC user.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun npacUser(): Optional<Boolean> = body.npacUser()

    /**
     * Build methods reported during onboarding.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun onboardingBuildMethod(): Optional<List<String>> = body.onboardingBuildMethod()

    /**
     * Industries reported during onboarding.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun onboardingIndustries(): Optional<List<String>> = body.onboardingIndustries()

    /**
     * Monthly budget ranges reported during onboarding.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun onboardingMonthlyBudget(): Optional<List<String>> = body.onboardingMonthlyBudget()

    /**
     * Products of interest reported during onboarding.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun onboardingProductInterest(): Optional<List<String>> = body.onboardingProductInterest()

    /**
     * Onboarding project types.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun onboardingProjectTypes(): Optional<List<String>> = body.onboardingProjectTypes()

    /**
     * Reasons for considering Telnyx.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun onboardingReasonsForConsideration(): Optional<List<String>> =
        body.onboardingReasonsForConsideration()

    /**
     * Referral sources reported during onboarding.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun onboardingReferrer(): Optional<List<String>> = body.onboardingReferrer()

    /**
     * Other onboarding use cases.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun onboardingUseCasesOther(): Optional<List<String>> = body.onboardingUseCasesOther()

    /**
     * Contact phone number associated with the profile.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun phoneNumber(): Optional<String> = body.phoneNumber()

    /**
     * Whether port-out PIN validation is enabled.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun portOutPinValidation(): Optional<Boolean> = body.portOutPinValidation()

    /**
     * Primary use case for the account.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun primaryUseCase(): Optional<String> = body.primaryUseCase()

    /**
     * The user's role.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun role(): Optional<String> = body.role()

    /**
     * State or region in the profile address.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun state(): Optional<String> = body.state()

    /**
     * User interface theme: 0 for dark or 1 for light.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun uiTheme(): Optional<UiTheme> = body.uiTheme()

    /**
     * Use cases reported by the user.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun useCases(): Optional<List<String>> = body.useCases()

    /**
     * Whether the user opts in to subscriptions.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun userSubscriptionOptIn(): Optional<Boolean> = body.userSubscriptionOptIn()

    /**
     * Postal code in the profile address.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun zip(): Optional<String> = body.zip()

    /**
     * Returns the raw JSON value of [address1].
     *
     * Unlike [address1], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _address1(): JsonField<String> = body._address1()

    /**
     * Returns the raw JSON value of [address2].
     *
     * Unlike [address2], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _address2(): JsonField<String> = body._address2()

    /**
     * Returns the raw JSON value of [businessName].
     *
     * Unlike [businessName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _businessName(): JsonField<String> = body._businessName()

    /**
     * Returns the raw JSON value of [city].
     *
     * Unlike [city], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _city(): JsonField<String> = body._city()

    /**
     * Returns the raw JSON value of [companySize].
     *
     * Unlike [companySize], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _companySize(): JsonField<String> = body._companySize()

    /**
     * Returns the raw JSON value of [country].
     *
     * Unlike [country], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _country(): JsonField<String> = body._country()

    /**
     * Returns the raw JSON value of [dataLocality].
     *
     * Unlike [dataLocality], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _dataLocality(): JsonField<DataLocality> = body._dataLocality()

    /**
     * Returns the raw JSON value of [defaultManagedAccountAllowCustomPricing].
     *
     * Unlike [defaultManagedAccountAllowCustomPricing], this method doesn't throw if the JSON field
     * has an unexpected type.
     */
    fun _defaultManagedAccountAllowCustomPricing(): JsonField<Boolean> =
        body._defaultManagedAccountAllowCustomPricing()

    /**
     * Returns the raw JSON value of [defaultManagedAccountInheritEmergencyTermsOfService].
     *
     * Unlike [defaultManagedAccountInheritEmergencyTermsOfService], this method doesn't throw if
     * the JSON field has an unexpected type.
     */
    fun _defaultManagedAccountInheritEmergencyTermsOfService(): JsonField<Boolean> =
        body._defaultManagedAccountInheritEmergencyTermsOfService()

    /**
     * Returns the raw JSON value of [defaultManagedAccountRollupBilling].
     *
     * Unlike [defaultManagedAccountRollupBilling], this method doesn't throw if the JSON field has
     * an unexpected type.
     */
    fun _defaultManagedAccountRollupBilling(): JsonField<Boolean> =
        body._defaultManagedAccountRollupBilling()

    /**
     * Returns the raw JSON value of [defaultNotifyManagerAccount].
     *
     * Unlike [defaultNotifyManagerAccount], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _defaultNotifyManagerAccount(): JsonField<Boolean> = body._defaultNotifyManagerAccount()

    /**
     * Returns the raw JSON value of [defaultNumbersExternalPin].
     *
     * Unlike [defaultNumbersExternalPin], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _defaultNumbersExternalPin(): JsonField<String> = body._defaultNumbersExternalPin()

    /**
     * Returns the raw JSON value of [firstName].
     *
     * Unlike [firstName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _firstName(): JsonField<String> = body._firstName()

    /**
     * Returns the raw JSON value of [gotFreeNumberAtSignup].
     *
     * Unlike [gotFreeNumberAtSignup], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _gotFreeNumberAtSignup(): JsonField<Boolean> = body._gotFreeNumberAtSignup()

    /**
     * Returns the raw JSON value of [lastName].
     *
     * Unlike [lastName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _lastName(): JsonField<String> = body._lastName()

    /**
     * Returns the raw JSON value of [lowBalanceNotificationFrequency].
     *
     * Unlike [lowBalanceNotificationFrequency], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _lowBalanceNotificationFrequency(): JsonField<LowBalanceNotificationFrequency> =
        body._lowBalanceNotificationFrequency()

    /**
     * Returns the raw JSON value of [lowBalanceThresholdAmount].
     *
     * Unlike [lowBalanceThresholdAmount], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _lowBalanceThresholdAmount(): JsonField<Double> = body._lowBalanceThresholdAmount()

    /**
     * Returns the raw JSON value of [notifyOnInvoiceAvailable].
     *
     * Unlike [notifyOnInvoiceAvailable], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _notifyOnInvoiceAvailable(): JsonField<Boolean> = body._notifyOnInvoiceAvailable()

    /**
     * Returns the raw JSON value of [notifyOnInvoicePayment].
     *
     * Unlike [notifyOnInvoicePayment], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _notifyOnInvoicePayment(): JsonField<Boolean> = body._notifyOnInvoicePayment()

    /**
     * Returns the raw JSON value of [npacUser].
     *
     * Unlike [npacUser], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _npacUser(): JsonField<Boolean> = body._npacUser()

    /**
     * Returns the raw JSON value of [onboardingBuildMethod].
     *
     * Unlike [onboardingBuildMethod], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _onboardingBuildMethod(): JsonField<List<String>> = body._onboardingBuildMethod()

    /**
     * Returns the raw JSON value of [onboardingIndustries].
     *
     * Unlike [onboardingIndustries], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _onboardingIndustries(): JsonField<List<String>> = body._onboardingIndustries()

    /**
     * Returns the raw JSON value of [onboardingMonthlyBudget].
     *
     * Unlike [onboardingMonthlyBudget], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _onboardingMonthlyBudget(): JsonField<List<String>> = body._onboardingMonthlyBudget()

    /**
     * Returns the raw JSON value of [onboardingProductInterest].
     *
     * Unlike [onboardingProductInterest], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _onboardingProductInterest(): JsonField<List<String>> = body._onboardingProductInterest()

    /**
     * Returns the raw JSON value of [onboardingProjectTypes].
     *
     * Unlike [onboardingProjectTypes], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _onboardingProjectTypes(): JsonField<List<String>> = body._onboardingProjectTypes()

    /**
     * Returns the raw JSON value of [onboardingReasonsForConsideration].
     *
     * Unlike [onboardingReasonsForConsideration], this method doesn't throw if the JSON field has
     * an unexpected type.
     */
    fun _onboardingReasonsForConsideration(): JsonField<List<String>> =
        body._onboardingReasonsForConsideration()

    /**
     * Returns the raw JSON value of [onboardingReferrer].
     *
     * Unlike [onboardingReferrer], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _onboardingReferrer(): JsonField<List<String>> = body._onboardingReferrer()

    /**
     * Returns the raw JSON value of [onboardingUseCasesOther].
     *
     * Unlike [onboardingUseCasesOther], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _onboardingUseCasesOther(): JsonField<List<String>> = body._onboardingUseCasesOther()

    /**
     * Returns the raw JSON value of [phoneNumber].
     *
     * Unlike [phoneNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _phoneNumber(): JsonField<String> = body._phoneNumber()

    /**
     * Returns the raw JSON value of [portOutPinValidation].
     *
     * Unlike [portOutPinValidation], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _portOutPinValidation(): JsonField<Boolean> = body._portOutPinValidation()

    /**
     * Returns the raw JSON value of [primaryUseCase].
     *
     * Unlike [primaryUseCase], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _primaryUseCase(): JsonField<String> = body._primaryUseCase()

    /**
     * Returns the raw JSON value of [role].
     *
     * Unlike [role], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _role(): JsonField<String> = body._role()

    /**
     * Returns the raw JSON value of [state].
     *
     * Unlike [state], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _state(): JsonField<String> = body._state()

    /**
     * Returns the raw JSON value of [uiTheme].
     *
     * Unlike [uiTheme], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _uiTheme(): JsonField<UiTheme> = body._uiTheme()

    /**
     * Returns the raw JSON value of [useCases].
     *
     * Unlike [useCases], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _useCases(): JsonField<List<String>> = body._useCases()

    /**
     * Returns the raw JSON value of [userSubscriptionOptIn].
     *
     * Unlike [userSubscriptionOptIn], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _userSubscriptionOptIn(): JsonField<Boolean> = body._userSubscriptionOptIn()

    /**
     * Returns the raw JSON value of [zip].
     *
     * Unlike [zip], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _zip(): JsonField<String> = body._zip()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): UserProfilePatchAllParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of [UserProfilePatchAllParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [UserProfilePatchAllParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: com.telnyx.sdk.core.http.Headers.Builder =
            com.telnyx.sdk.core.http.Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(userProfilePatchAllParams: UserProfilePatchAllParams) = apply {
            body = userProfilePatchAllParams.body.toBuilder()
            additionalHeaders = userProfilePatchAllParams.additionalHeaders.toBuilder()
            additionalQueryParams = userProfilePatchAllParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [address1]
         * - [address2]
         * - [businessName]
         * - [city]
         * - [companySize]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** First line of the profile address. */
        fun address1(address1: String?) = apply { body.address1(address1) }

        /** Alias for calling [Builder.address1] with `address1.orElse(null)`. */
        fun address1(address1: Optional<String>) = address1(address1.getOrNull())

        /**
         * Sets [Builder.address1] to an arbitrary JSON value.
         *
         * You should usually call [Builder.address1] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun address1(address1: JsonField<String>) = apply { body.address1(address1) }

        /** Second line of the profile address. */
        fun address2(address2: String?) = apply { body.address2(address2) }

        /** Alias for calling [Builder.address2] with `address2.orElse(null)`. */
        fun address2(address2: Optional<String>) = address2(address2.getOrNull())

        /**
         * Sets [Builder.address2] to an arbitrary JSON value.
         *
         * You should usually call [Builder.address2] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun address2(address2: JsonField<String>) = apply { body.address2(address2) }

        /** Business name associated with the profile. */
        fun businessName(businessName: String?) = apply { body.businessName(businessName) }

        /** Alias for calling [Builder.businessName] with `businessName.orElse(null)`. */
        fun businessName(businessName: Optional<String>) = businessName(businessName.getOrNull())

        /**
         * Sets [Builder.businessName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.businessName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun businessName(businessName: JsonField<String>) = apply {
            body.businessName(businessName)
        }

        /** City in the profile address. */
        fun city(city: String?) = apply { body.city(city) }

        /** Alias for calling [Builder.city] with `city.orElse(null)`. */
        fun city(city: Optional<String>) = city(city.getOrNull())

        /**
         * Sets [Builder.city] to an arbitrary JSON value.
         *
         * You should usually call [Builder.city] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun city(city: JsonField<String>) = apply { body.city(city) }

        /** Company size reported by the user. */
        fun companySize(companySize: String) = apply { body.companySize(companySize) }

        /**
         * Sets [Builder.companySize] to an arbitrary JSON value.
         *
         * You should usually call [Builder.companySize] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun companySize(companySize: JsonField<String>) = apply { body.companySize(companySize) }

        /** Country code in the profile address. */
        fun country(country: String?) = apply { body.country(country) }

        /** Alias for calling [Builder.country] with `country.orElse(null)`. */
        fun country(country: Optional<String>) = country(country.getOrNull())

        /**
         * Sets [Builder.country] to an arbitrary JSON value.
         *
         * You should usually call [Builder.country] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun country(country: JsonField<String>) = apply { body.country(country) }

        /**
         * Data locality: USA (United States), DEU (Germany), AUS (Australia), UAE (United Arab
         * Emirates), or CAN (Canada). A change is permitted only if data locality has not
         * previously been changed. A successful change sets data_locality_updated_at and
         * initializes data_locality_migration_status to not_started.
         */
        fun dataLocality(dataLocality: DataLocality) = apply { body.dataLocality(dataLocality) }

        /**
         * Sets [Builder.dataLocality] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dataLocality] with a well-typed [DataLocality] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dataLocality(dataLocality: JsonField<DataLocality>) = apply {
            body.dataLocality(dataLocality)
        }

        /** Default custom-pricing setting for managed accounts. */
        fun defaultManagedAccountAllowCustomPricing(
            defaultManagedAccountAllowCustomPricing: Boolean
        ) = apply {
            body.defaultManagedAccountAllowCustomPricing(defaultManagedAccountAllowCustomPricing)
        }

        /**
         * Sets [Builder.defaultManagedAccountAllowCustomPricing] to an arbitrary JSON value.
         *
         * You should usually call [Builder.defaultManagedAccountAllowCustomPricing] with a
         * well-typed [Boolean] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun defaultManagedAccountAllowCustomPricing(
            defaultManagedAccountAllowCustomPricing: JsonField<Boolean>
        ) = apply {
            body.defaultManagedAccountAllowCustomPricing(defaultManagedAccountAllowCustomPricing)
        }

        /**
         * Default emergency terms-of-service inheritance setting for managed accounts, where
         * supported.
         */
        fun defaultManagedAccountInheritEmergencyTermsOfService(
            defaultManagedAccountInheritEmergencyTermsOfService: Boolean
        ) = apply {
            body.defaultManagedAccountInheritEmergencyTermsOfService(
                defaultManagedAccountInheritEmergencyTermsOfService
            )
        }

        /**
         * Sets [Builder.defaultManagedAccountInheritEmergencyTermsOfService] to an arbitrary JSON
         * value.
         *
         * You should usually call [Builder.defaultManagedAccountInheritEmergencyTermsOfService]
         * with a well-typed [Boolean] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun defaultManagedAccountInheritEmergencyTermsOfService(
            defaultManagedAccountInheritEmergencyTermsOfService: JsonField<Boolean>
        ) = apply {
            body.defaultManagedAccountInheritEmergencyTermsOfService(
                defaultManagedAccountInheritEmergencyTermsOfService
            )
        }

        /** Default rollup-billing setting for managed accounts. */
        fun defaultManagedAccountRollupBilling(defaultManagedAccountRollupBilling: Boolean) =
            apply {
                body.defaultManagedAccountRollupBilling(defaultManagedAccountRollupBilling)
            }

        /**
         * Sets [Builder.defaultManagedAccountRollupBilling] to an arbitrary JSON value.
         *
         * You should usually call [Builder.defaultManagedAccountRollupBilling] with a well-typed
         * [Boolean] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun defaultManagedAccountRollupBilling(
            defaultManagedAccountRollupBilling: JsonField<Boolean>
        ) = apply { body.defaultManagedAccountRollupBilling(defaultManagedAccountRollupBilling) }

        /** Default setting for notifying the manager account. */
        fun defaultNotifyManagerAccount(defaultNotifyManagerAccount: Boolean) = apply {
            body.defaultNotifyManagerAccount(defaultNotifyManagerAccount)
        }

        /**
         * Sets [Builder.defaultNotifyManagerAccount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.defaultNotifyManagerAccount] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun defaultNotifyManagerAccount(defaultNotifyManagerAccount: JsonField<Boolean>) = apply {
            body.defaultNotifyManagerAccount(defaultNotifyManagerAccount)
        }

        /** Default alphanumeric external PIN for phone numbers. */
        fun defaultNumbersExternalPin(defaultNumbersExternalPin: String) = apply {
            body.defaultNumbersExternalPin(defaultNumbersExternalPin)
        }

        /**
         * Sets [Builder.defaultNumbersExternalPin] to an arbitrary JSON value.
         *
         * You should usually call [Builder.defaultNumbersExternalPin] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun defaultNumbersExternalPin(defaultNumbersExternalPin: JsonField<String>) = apply {
            body.defaultNumbersExternalPin(defaultNumbersExternalPin)
        }

        /** The user's first name. */
        fun firstName(firstName: String?) = apply { body.firstName(firstName) }

        /** Alias for calling [Builder.firstName] with `firstName.orElse(null)`. */
        fun firstName(firstName: Optional<String>) = firstName(firstName.getOrNull())

        /**
         * Sets [Builder.firstName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.firstName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun firstName(firstName: JsonField<String>) = apply { body.firstName(firstName) }

        /** Whether the user received a free number at signup. */
        fun gotFreeNumberAtSignup(gotFreeNumberAtSignup: Boolean) = apply {
            body.gotFreeNumberAtSignup(gotFreeNumberAtSignup)
        }

        /**
         * Sets [Builder.gotFreeNumberAtSignup] to an arbitrary JSON value.
         *
         * You should usually call [Builder.gotFreeNumberAtSignup] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun gotFreeNumberAtSignup(gotFreeNumberAtSignup: JsonField<Boolean>) = apply {
            body.gotFreeNumberAtSignup(gotFreeNumberAtSignup)
        }

        /** The user's last name. */
        fun lastName(lastName: String?) = apply { body.lastName(lastName) }

        /** Alias for calling [Builder.lastName] with `lastName.orElse(null)`. */
        fun lastName(lastName: Optional<String>) = lastName(lastName.getOrNull())

        /**
         * Sets [Builder.lastName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastName] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun lastName(lastName: JsonField<String>) = apply { body.lastName(lastName) }

        /**
         * Low-balance notification frequency. Organization sub-users cannot set a non-null
         * frequency. The resulting profile must have both a threshold and frequency, or neither.
         */
        fun lowBalanceNotificationFrequency(
            lowBalanceNotificationFrequency: LowBalanceNotificationFrequency?
        ) = apply { body.lowBalanceNotificationFrequency(lowBalanceNotificationFrequency) }

        /**
         * Alias for calling [Builder.lowBalanceNotificationFrequency] with
         * `lowBalanceNotificationFrequency.orElse(null)`.
         */
        fun lowBalanceNotificationFrequency(
            lowBalanceNotificationFrequency: Optional<LowBalanceNotificationFrequency>
        ) = lowBalanceNotificationFrequency(lowBalanceNotificationFrequency.getOrNull())

        /**
         * Sets [Builder.lowBalanceNotificationFrequency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lowBalanceNotificationFrequency] with a well-typed
         * [LowBalanceNotificationFrequency] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun lowBalanceNotificationFrequency(
            lowBalanceNotificationFrequency: JsonField<LowBalanceNotificationFrequency>
        ) = apply { body.lowBalanceNotificationFrequency(lowBalanceNotificationFrequency) }

        /**
         * Low-balance notification threshold in the billing currency. The resulting profile must
         * have both a threshold and notification frequency, or neither.
         */
        fun lowBalanceThresholdAmount(lowBalanceThresholdAmount: Double?) = apply {
            body.lowBalanceThresholdAmount(lowBalanceThresholdAmount)
        }

        /**
         * Alias for [Builder.lowBalanceThresholdAmount].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun lowBalanceThresholdAmount(lowBalanceThresholdAmount: Double) =
            lowBalanceThresholdAmount(lowBalanceThresholdAmount as Double?)

        /**
         * Alias for calling [Builder.lowBalanceThresholdAmount] with
         * `lowBalanceThresholdAmount.orElse(null)`.
         */
        fun lowBalanceThresholdAmount(lowBalanceThresholdAmount: Optional<Double>) =
            lowBalanceThresholdAmount(lowBalanceThresholdAmount.getOrNull())

        /**
         * Sets [Builder.lowBalanceThresholdAmount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lowBalanceThresholdAmount] with a well-typed [Double]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun lowBalanceThresholdAmount(lowBalanceThresholdAmount: JsonField<Double>) = apply {
            body.lowBalanceThresholdAmount(lowBalanceThresholdAmount)
        }

        /** Whether to notify the user when an invoice is available. */
        fun notifyOnInvoiceAvailable(notifyOnInvoiceAvailable: Boolean) = apply {
            body.notifyOnInvoiceAvailable(notifyOnInvoiceAvailable)
        }

        /**
         * Sets [Builder.notifyOnInvoiceAvailable] to an arbitrary JSON value.
         *
         * You should usually call [Builder.notifyOnInvoiceAvailable] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun notifyOnInvoiceAvailable(notifyOnInvoiceAvailable: JsonField<Boolean>) = apply {
            body.notifyOnInvoiceAvailable(notifyOnInvoiceAvailable)
        }

        /** Whether to notify the user when an invoice is paid. */
        fun notifyOnInvoicePayment(notifyOnInvoicePayment: Boolean) = apply {
            body.notifyOnInvoicePayment(notifyOnInvoicePayment)
        }

        /**
         * Sets [Builder.notifyOnInvoicePayment] to an arbitrary JSON value.
         *
         * You should usually call [Builder.notifyOnInvoicePayment] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun notifyOnInvoicePayment(notifyOnInvoicePayment: JsonField<Boolean>) = apply {
            body.notifyOnInvoicePayment(notifyOnInvoicePayment)
        }

        /** Whether the user is an NPAC user. */
        fun npacUser(npacUser: Boolean) = apply { body.npacUser(npacUser) }

        /**
         * Sets [Builder.npacUser] to an arbitrary JSON value.
         *
         * You should usually call [Builder.npacUser] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun npacUser(npacUser: JsonField<Boolean>) = apply { body.npacUser(npacUser) }

        /** Build methods reported during onboarding. */
        fun onboardingBuildMethod(onboardingBuildMethod: List<String>) = apply {
            body.onboardingBuildMethod(onboardingBuildMethod)
        }

        /**
         * Sets [Builder.onboardingBuildMethod] to an arbitrary JSON value.
         *
         * You should usually call [Builder.onboardingBuildMethod] with a well-typed `List<String>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun onboardingBuildMethod(onboardingBuildMethod: JsonField<List<String>>) = apply {
            body.onboardingBuildMethod(onboardingBuildMethod)
        }

        /**
         * Adds a single [String] to [Builder.onboardingBuildMethod].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addOnboardingBuildMethod(onboardingBuildMethod: String) = apply {
            body.addOnboardingBuildMethod(onboardingBuildMethod)
        }

        /** Industries reported during onboarding. */
        fun onboardingIndustries(onboardingIndustries: List<String>) = apply {
            body.onboardingIndustries(onboardingIndustries)
        }

        /**
         * Sets [Builder.onboardingIndustries] to an arbitrary JSON value.
         *
         * You should usually call [Builder.onboardingIndustries] with a well-typed `List<String>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun onboardingIndustries(onboardingIndustries: JsonField<List<String>>) = apply {
            body.onboardingIndustries(onboardingIndustries)
        }

        /**
         * Adds a single [String] to [onboardingIndustries].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addOnboardingIndustry(onboardingIndustry: String) = apply {
            body.addOnboardingIndustry(onboardingIndustry)
        }

        /** Monthly budget ranges reported during onboarding. */
        fun onboardingMonthlyBudget(onboardingMonthlyBudget: List<String>) = apply {
            body.onboardingMonthlyBudget(onboardingMonthlyBudget)
        }

        /**
         * Sets [Builder.onboardingMonthlyBudget] to an arbitrary JSON value.
         *
         * You should usually call [Builder.onboardingMonthlyBudget] with a well-typed
         * `List<String>` value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun onboardingMonthlyBudget(onboardingMonthlyBudget: JsonField<List<String>>) = apply {
            body.onboardingMonthlyBudget(onboardingMonthlyBudget)
        }

        /**
         * Adds a single [String] to [Builder.onboardingMonthlyBudget].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addOnboardingMonthlyBudget(onboardingMonthlyBudget: String) = apply {
            body.addOnboardingMonthlyBudget(onboardingMonthlyBudget)
        }

        /** Products of interest reported during onboarding. */
        fun onboardingProductInterest(onboardingProductInterest: List<String>) = apply {
            body.onboardingProductInterest(onboardingProductInterest)
        }

        /**
         * Sets [Builder.onboardingProductInterest] to an arbitrary JSON value.
         *
         * You should usually call [Builder.onboardingProductInterest] with a well-typed
         * `List<String>` value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun onboardingProductInterest(onboardingProductInterest: JsonField<List<String>>) = apply {
            body.onboardingProductInterest(onboardingProductInterest)
        }

        /**
         * Adds a single [String] to [Builder.onboardingProductInterest].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addOnboardingProductInterest(onboardingProductInterest: String) = apply {
            body.addOnboardingProductInterest(onboardingProductInterest)
        }

        /** Onboarding project types. */
        fun onboardingProjectTypes(onboardingProjectTypes: List<String>) = apply {
            body.onboardingProjectTypes(onboardingProjectTypes)
        }

        /**
         * Sets [Builder.onboardingProjectTypes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.onboardingProjectTypes] with a well-typed `List<String>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun onboardingProjectTypes(onboardingProjectTypes: JsonField<List<String>>) = apply {
            body.onboardingProjectTypes(onboardingProjectTypes)
        }

        /**
         * Adds a single [String] to [onboardingProjectTypes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addOnboardingProjectType(onboardingProjectType: String) = apply {
            body.addOnboardingProjectType(onboardingProjectType)
        }

        /** Reasons for considering Telnyx. */
        fun onboardingReasonsForConsideration(onboardingReasonsForConsideration: List<String>) =
            apply {
                body.onboardingReasonsForConsideration(onboardingReasonsForConsideration)
            }

        /**
         * Sets [Builder.onboardingReasonsForConsideration] to an arbitrary JSON value.
         *
         * You should usually call [Builder.onboardingReasonsForConsideration] with a well-typed
         * `List<String>` value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun onboardingReasonsForConsideration(
            onboardingReasonsForConsideration: JsonField<List<String>>
        ) = apply { body.onboardingReasonsForConsideration(onboardingReasonsForConsideration) }

        /**
         * Adds a single [String] to [Builder.onboardingReasonsForConsideration].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addOnboardingReasonsForConsideration(onboardingReasonsForConsideration: String) =
            apply {
                body.addOnboardingReasonsForConsideration(onboardingReasonsForConsideration)
            }

        /** Referral sources reported during onboarding. */
        fun onboardingReferrer(onboardingReferrer: List<String>) = apply {
            body.onboardingReferrer(onboardingReferrer)
        }

        /**
         * Sets [Builder.onboardingReferrer] to an arbitrary JSON value.
         *
         * You should usually call [Builder.onboardingReferrer] with a well-typed `List<String>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun onboardingReferrer(onboardingReferrer: JsonField<List<String>>) = apply {
            body.onboardingReferrer(onboardingReferrer)
        }

        /**
         * Adds a single [String] to [Builder.onboardingReferrer].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addOnboardingReferrer(onboardingReferrer: String) = apply {
            body.addOnboardingReferrer(onboardingReferrer)
        }

        /** Other onboarding use cases. */
        fun onboardingUseCasesOther(onboardingUseCasesOther: List<String>) = apply {
            body.onboardingUseCasesOther(onboardingUseCasesOther)
        }

        /**
         * Sets [Builder.onboardingUseCasesOther] to an arbitrary JSON value.
         *
         * You should usually call [Builder.onboardingUseCasesOther] with a well-typed
         * `List<String>` value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun onboardingUseCasesOther(onboardingUseCasesOther: JsonField<List<String>>) = apply {
            body.onboardingUseCasesOther(onboardingUseCasesOther)
        }

        /**
         * Adds a single [String] to [Builder.onboardingUseCasesOther].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addOnboardingUseCasesOther(onboardingUseCasesOther: String) = apply {
            body.addOnboardingUseCasesOther(onboardingUseCasesOther)
        }

        /** Contact phone number associated with the profile. */
        fun phoneNumber(phoneNumber: String?) = apply { body.phoneNumber(phoneNumber) }

        /** Alias for calling [Builder.phoneNumber] with `phoneNumber.orElse(null)`. */
        fun phoneNumber(phoneNumber: Optional<String>) = phoneNumber(phoneNumber.getOrNull())

        /**
         * Sets [Builder.phoneNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.phoneNumber] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun phoneNumber(phoneNumber: JsonField<String>) = apply { body.phoneNumber(phoneNumber) }

        /** Whether port-out PIN validation is enabled. */
        fun portOutPinValidation(portOutPinValidation: Boolean) = apply {
            body.portOutPinValidation(portOutPinValidation)
        }

        /**
         * Sets [Builder.portOutPinValidation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.portOutPinValidation] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun portOutPinValidation(portOutPinValidation: JsonField<Boolean>) = apply {
            body.portOutPinValidation(portOutPinValidation)
        }

        /** Primary use case for the account. */
        fun primaryUseCase(primaryUseCase: String) = apply { body.primaryUseCase(primaryUseCase) }

        /**
         * Sets [Builder.primaryUseCase] to an arbitrary JSON value.
         *
         * You should usually call [Builder.primaryUseCase] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun primaryUseCase(primaryUseCase: JsonField<String>) = apply {
            body.primaryUseCase(primaryUseCase)
        }

        /** The user's role. */
        fun role(role: String) = apply { body.role(role) }

        /**
         * Sets [Builder.role] to an arbitrary JSON value.
         *
         * You should usually call [Builder.role] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun role(role: JsonField<String>) = apply { body.role(role) }

        /** State or region in the profile address. */
        fun state(state: String?) = apply { body.state(state) }

        /** Alias for calling [Builder.state] with `state.orElse(null)`. */
        fun state(state: Optional<String>) = state(state.getOrNull())

        /**
         * Sets [Builder.state] to an arbitrary JSON value.
         *
         * You should usually call [Builder.state] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun state(state: JsonField<String>) = apply { body.state(state) }

        /** User interface theme: 0 for dark or 1 for light. */
        fun uiTheme(uiTheme: UiTheme) = apply { body.uiTheme(uiTheme) }

        /**
         * Sets [Builder.uiTheme] to an arbitrary JSON value.
         *
         * You should usually call [Builder.uiTheme] with a well-typed [UiTheme] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun uiTheme(uiTheme: JsonField<UiTheme>) = apply { body.uiTheme(uiTheme) }

        /** Use cases reported by the user. */
        fun useCases(useCases: List<String>) = apply { body.useCases(useCases) }

        /**
         * Sets [Builder.useCases] to an arbitrary JSON value.
         *
         * You should usually call [Builder.useCases] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun useCases(useCases: JsonField<List<String>>) = apply { body.useCases(useCases) }

        /**
         * Adds a single [String] to [useCases].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addUseCase(useCase: String) = apply { body.addUseCase(useCase) }

        /** Whether the user opts in to subscriptions. */
        fun userSubscriptionOptIn(userSubscriptionOptIn: Boolean) = apply {
            body.userSubscriptionOptIn(userSubscriptionOptIn)
        }

        /**
         * Sets [Builder.userSubscriptionOptIn] to an arbitrary JSON value.
         *
         * You should usually call [Builder.userSubscriptionOptIn] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun userSubscriptionOptIn(userSubscriptionOptIn: JsonField<Boolean>) = apply {
            body.userSubscriptionOptIn(userSubscriptionOptIn)
        }

        /** Postal code in the profile address. */
        fun zip(zip: String?) = apply { body.zip(zip) }

        /** Alias for calling [Builder.zip] with `zip.orElse(null)`. */
        fun zip(zip: Optional<String>) = zip(zip.getOrNull())

        /**
         * Sets [Builder.zip] to an arbitrary JSON value.
         *
         * You should usually call [Builder.zip] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun zip(zip: JsonField<String>) = apply { body.zip(zip) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: com.telnyx.sdk.core.http.Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: com.telnyx.sdk.core.http.Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: com.telnyx.sdk.core.http.Headers) =
            apply {
                this.additionalHeaders.replaceAll(additionalHeaders)
            }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [UserProfilePatchAllParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): UserProfilePatchAllParams =
            UserProfilePatchAllParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /** Profile fields to update. Omitted fields retain their current values. */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val address1: JsonField<String>,
        private val address2: JsonField<String>,
        private val businessName: JsonField<String>,
        private val city: JsonField<String>,
        private val companySize: JsonField<String>,
        private val country: JsonField<String>,
        private val dataLocality: JsonField<DataLocality>,
        private val defaultManagedAccountAllowCustomPricing: JsonField<Boolean>,
        private val defaultManagedAccountInheritEmergencyTermsOfService: JsonField<Boolean>,
        private val defaultManagedAccountRollupBilling: JsonField<Boolean>,
        private val defaultNotifyManagerAccount: JsonField<Boolean>,
        private val defaultNumbersExternalPin: JsonField<String>,
        private val firstName: JsonField<String>,
        private val gotFreeNumberAtSignup: JsonField<Boolean>,
        private val lastName: JsonField<String>,
        private val lowBalanceNotificationFrequency: JsonField<LowBalanceNotificationFrequency>,
        private val lowBalanceThresholdAmount: JsonField<Double>,
        private val notifyOnInvoiceAvailable: JsonField<Boolean>,
        private val notifyOnInvoicePayment: JsonField<Boolean>,
        private val npacUser: JsonField<Boolean>,
        private val onboardingBuildMethod: JsonField<List<String>>,
        private val onboardingIndustries: JsonField<List<String>>,
        private val onboardingMonthlyBudget: JsonField<List<String>>,
        private val onboardingProductInterest: JsonField<List<String>>,
        private val onboardingProjectTypes: JsonField<List<String>>,
        private val onboardingReasonsForConsideration: JsonField<List<String>>,
        private val onboardingReferrer: JsonField<List<String>>,
        private val onboardingUseCasesOther: JsonField<List<String>>,
        private val phoneNumber: JsonField<String>,
        private val portOutPinValidation: JsonField<Boolean>,
        private val primaryUseCase: JsonField<String>,
        private val role: JsonField<String>,
        private val state: JsonField<String>,
        private val uiTheme: JsonField<UiTheme>,
        private val useCases: JsonField<List<String>>,
        private val userSubscriptionOptIn: JsonField<Boolean>,
        private val zip: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("address_1")
            @ExcludeMissing
            address1: JsonField<String> = JsonMissing.of(),
            @JsonProperty("address_2")
            @ExcludeMissing
            address2: JsonField<String> = JsonMissing.of(),
            @JsonProperty("business_name")
            @ExcludeMissing
            businessName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("city") @ExcludeMissing city: JsonField<String> = JsonMissing.of(),
            @JsonProperty("company_size")
            @ExcludeMissing
            companySize: JsonField<String> = JsonMissing.of(),
            @JsonProperty("country") @ExcludeMissing country: JsonField<String> = JsonMissing.of(),
            @JsonProperty("data_locality")
            @ExcludeMissing
            dataLocality: JsonField<DataLocality> = JsonMissing.of(),
            @JsonProperty("default_managed_account_allow_custom_pricing")
            @ExcludeMissing
            defaultManagedAccountAllowCustomPricing: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("default_managed_account_inherit_emergency_terms_of_service")
            @ExcludeMissing
            defaultManagedAccountInheritEmergencyTermsOfService: JsonField<Boolean> =
                JsonMissing.of(),
            @JsonProperty("default_managed_account_rollup_billing")
            @ExcludeMissing
            defaultManagedAccountRollupBilling: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("default_notify_manager_account")
            @ExcludeMissing
            defaultNotifyManagerAccount: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("default_numbers_external_pin")
            @ExcludeMissing
            defaultNumbersExternalPin: JsonField<String> = JsonMissing.of(),
            @JsonProperty("first_name")
            @ExcludeMissing
            firstName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("got_free_number_at_signup")
            @ExcludeMissing
            gotFreeNumberAtSignup: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("last_name")
            @ExcludeMissing
            lastName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("low_balance_notification_frequency")
            @ExcludeMissing
            lowBalanceNotificationFrequency: JsonField<LowBalanceNotificationFrequency> =
                JsonMissing.of(),
            @JsonProperty("low_balance_threshold_amount")
            @ExcludeMissing
            lowBalanceThresholdAmount: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("notify_on_invoice_available")
            @ExcludeMissing
            notifyOnInvoiceAvailable: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("notify_on_invoice_payment")
            @ExcludeMissing
            notifyOnInvoicePayment: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("npac_user")
            @ExcludeMissing
            npacUser: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("onboarding_build_method")
            @ExcludeMissing
            onboardingBuildMethod: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("onboarding_industries")
            @ExcludeMissing
            onboardingIndustries: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("onboarding_monthly_budget")
            @ExcludeMissing
            onboardingMonthlyBudget: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("onboarding_product_interest")
            @ExcludeMissing
            onboardingProductInterest: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("onboarding_project_types")
            @ExcludeMissing
            onboardingProjectTypes: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("onboarding_reasons_for_consideration")
            @ExcludeMissing
            onboardingReasonsForConsideration: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("onboarding_referrer")
            @ExcludeMissing
            onboardingReferrer: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("onboarding_use_cases_other")
            @ExcludeMissing
            onboardingUseCasesOther: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("phone_number")
            @ExcludeMissing
            phoneNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("port_out_pin_validation")
            @ExcludeMissing
            portOutPinValidation: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("primary_use_case")
            @ExcludeMissing
            primaryUseCase: JsonField<String> = JsonMissing.of(),
            @JsonProperty("role") @ExcludeMissing role: JsonField<String> = JsonMissing.of(),
            @JsonProperty("state") @ExcludeMissing state: JsonField<String> = JsonMissing.of(),
            @JsonProperty("ui_theme")
            @ExcludeMissing
            uiTheme: JsonField<UiTheme> = JsonMissing.of(),
            @JsonProperty("use_cases")
            @ExcludeMissing
            useCases: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("user_subscription_opt_in")
            @ExcludeMissing
            userSubscriptionOptIn: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("zip") @ExcludeMissing zip: JsonField<String> = JsonMissing.of(),
        ) : this(
            address1,
            address2,
            businessName,
            city,
            companySize,
            country,
            dataLocality,
            defaultManagedAccountAllowCustomPricing,
            defaultManagedAccountInheritEmergencyTermsOfService,
            defaultManagedAccountRollupBilling,
            defaultNotifyManagerAccount,
            defaultNumbersExternalPin,
            firstName,
            gotFreeNumberAtSignup,
            lastName,
            lowBalanceNotificationFrequency,
            lowBalanceThresholdAmount,
            notifyOnInvoiceAvailable,
            notifyOnInvoicePayment,
            npacUser,
            onboardingBuildMethod,
            onboardingIndustries,
            onboardingMonthlyBudget,
            onboardingProductInterest,
            onboardingProjectTypes,
            onboardingReasonsForConsideration,
            onboardingReferrer,
            onboardingUseCasesOther,
            phoneNumber,
            portOutPinValidation,
            primaryUseCase,
            role,
            state,
            uiTheme,
            useCases,
            userSubscriptionOptIn,
            zip,
            mutableMapOf(),
        )

        /**
         * First line of the profile address.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun address1(): Optional<String> = address1.getOptional("address_1")

        /**
         * Second line of the profile address.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun address2(): Optional<String> = address2.getOptional("address_2")

        /**
         * Business name associated with the profile.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun businessName(): Optional<String> = businessName.getOptional("business_name")

        /**
         * City in the profile address.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun city(): Optional<String> = city.getOptional("city")

        /**
         * Company size reported by the user.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun companySize(): Optional<String> = companySize.getOptional("company_size")

        /**
         * Country code in the profile address.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun country(): Optional<String> = country.getOptional("country")

        /**
         * Data locality: USA (United States), DEU (Germany), AUS (Australia), UAE (United Arab
         * Emirates), or CAN (Canada). A change is permitted only if data locality has not
         * previously been changed. A successful change sets data_locality_updated_at and
         * initializes data_locality_migration_status to not_started.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun dataLocality(): Optional<DataLocality> = dataLocality.getOptional("data_locality")

        /**
         * Default custom-pricing setting for managed accounts.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun defaultManagedAccountAllowCustomPricing(): Optional<Boolean> =
            defaultManagedAccountAllowCustomPricing.getOptional(
                "default_managed_account_allow_custom_pricing"
            )

        /**
         * Default emergency terms-of-service inheritance setting for managed accounts, where
         * supported.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun defaultManagedAccountInheritEmergencyTermsOfService(): Optional<Boolean> =
            defaultManagedAccountInheritEmergencyTermsOfService.getOptional(
                "default_managed_account_inherit_emergency_terms_of_service"
            )

        /**
         * Default rollup-billing setting for managed accounts.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun defaultManagedAccountRollupBilling(): Optional<Boolean> =
            defaultManagedAccountRollupBilling.getOptional("default_managed_account_rollup_billing")

        /**
         * Default setting for notifying the manager account.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun defaultNotifyManagerAccount(): Optional<Boolean> =
            defaultNotifyManagerAccount.getOptional("default_notify_manager_account")

        /**
         * Default alphanumeric external PIN for phone numbers.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun defaultNumbersExternalPin(): Optional<String> =
            defaultNumbersExternalPin.getOptional("default_numbers_external_pin")

        /**
         * The user's first name.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun firstName(): Optional<String> = firstName.getOptional("first_name")

        /**
         * Whether the user received a free number at signup.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun gotFreeNumberAtSignup(): Optional<Boolean> =
            gotFreeNumberAtSignup.getOptional("got_free_number_at_signup")

        /**
         * The user's last name.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun lastName(): Optional<String> = lastName.getOptional("last_name")

        /**
         * Low-balance notification frequency. Organization sub-users cannot set a non-null
         * frequency. The resulting profile must have both a threshold and frequency, or neither.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun lowBalanceNotificationFrequency(): Optional<LowBalanceNotificationFrequency> =
            lowBalanceNotificationFrequency.getOptional("low_balance_notification_frequency")

        /**
         * Low-balance notification threshold in the billing currency. The resulting profile must
         * have both a threshold and notification frequency, or neither.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun lowBalanceThresholdAmount(): Optional<Double> =
            lowBalanceThresholdAmount.getOptional("low_balance_threshold_amount")

        /**
         * Whether to notify the user when an invoice is available.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun notifyOnInvoiceAvailable(): Optional<Boolean> =
            notifyOnInvoiceAvailable.getOptional("notify_on_invoice_available")

        /**
         * Whether to notify the user when an invoice is paid.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun notifyOnInvoicePayment(): Optional<Boolean> =
            notifyOnInvoicePayment.getOptional("notify_on_invoice_payment")

        /**
         * Whether the user is an NPAC user.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun npacUser(): Optional<Boolean> = npacUser.getOptional("npac_user")

        /**
         * Build methods reported during onboarding.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun onboardingBuildMethod(): Optional<List<String>> =
            onboardingBuildMethod.getOptional("onboarding_build_method")

        /**
         * Industries reported during onboarding.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun onboardingIndustries(): Optional<List<String>> =
            onboardingIndustries.getOptional("onboarding_industries")

        /**
         * Monthly budget ranges reported during onboarding.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun onboardingMonthlyBudget(): Optional<List<String>> =
            onboardingMonthlyBudget.getOptional("onboarding_monthly_budget")

        /**
         * Products of interest reported during onboarding.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun onboardingProductInterest(): Optional<List<String>> =
            onboardingProductInterest.getOptional("onboarding_product_interest")

        /**
         * Onboarding project types.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun onboardingProjectTypes(): Optional<List<String>> =
            onboardingProjectTypes.getOptional("onboarding_project_types")

        /**
         * Reasons for considering Telnyx.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun onboardingReasonsForConsideration(): Optional<List<String>> =
            onboardingReasonsForConsideration.getOptional("onboarding_reasons_for_consideration")

        /**
         * Referral sources reported during onboarding.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun onboardingReferrer(): Optional<List<String>> =
            onboardingReferrer.getOptional("onboarding_referrer")

        /**
         * Other onboarding use cases.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun onboardingUseCasesOther(): Optional<List<String>> =
            onboardingUseCasesOther.getOptional("onboarding_use_cases_other")

        /**
         * Contact phone number associated with the profile.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun phoneNumber(): Optional<String> = phoneNumber.getOptional("phone_number")

        /**
         * Whether port-out PIN validation is enabled.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun portOutPinValidation(): Optional<Boolean> =
            portOutPinValidation.getOptional("port_out_pin_validation")

        /**
         * Primary use case for the account.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun primaryUseCase(): Optional<String> = primaryUseCase.getOptional("primary_use_case")

        /**
         * The user's role.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun role(): Optional<String> = role.getOptional("role")

        /**
         * State or region in the profile address.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun state(): Optional<String> = state.getOptional("state")

        /**
         * User interface theme: 0 for dark or 1 for light.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun uiTheme(): Optional<UiTheme> = uiTheme.getOptional("ui_theme")

        /**
         * Use cases reported by the user.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun useCases(): Optional<List<String>> = useCases.getOptional("use_cases")

        /**
         * Whether the user opts in to subscriptions.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun userSubscriptionOptIn(): Optional<Boolean> =
            userSubscriptionOptIn.getOptional("user_subscription_opt_in")

        /**
         * Postal code in the profile address.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun zip(): Optional<String> = zip.getOptional("zip")

        /**
         * Returns the raw JSON value of [address1].
         *
         * Unlike [address1], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("address_1") @ExcludeMissing fun _address1(): JsonField<String> = address1

        /**
         * Returns the raw JSON value of [address2].
         *
         * Unlike [address2], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("address_2") @ExcludeMissing fun _address2(): JsonField<String> = address2

        /**
         * Returns the raw JSON value of [businessName].
         *
         * Unlike [businessName], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("business_name")
        @ExcludeMissing
        fun _businessName(): JsonField<String> = businessName

        /**
         * Returns the raw JSON value of [city].
         *
         * Unlike [city], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("city") @ExcludeMissing fun _city(): JsonField<String> = city

        /**
         * Returns the raw JSON value of [companySize].
         *
         * Unlike [companySize], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("company_size")
        @ExcludeMissing
        fun _companySize(): JsonField<String> = companySize

        /**
         * Returns the raw JSON value of [country].
         *
         * Unlike [country], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<String> = country

        /**
         * Returns the raw JSON value of [dataLocality].
         *
         * Unlike [dataLocality], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("data_locality")
        @ExcludeMissing
        fun _dataLocality(): JsonField<DataLocality> = dataLocality

        /**
         * Returns the raw JSON value of [defaultManagedAccountAllowCustomPricing].
         *
         * Unlike [defaultManagedAccountAllowCustomPricing], this method doesn't throw if the JSON
         * field has an unexpected type.
         */
        @JsonProperty("default_managed_account_allow_custom_pricing")
        @ExcludeMissing
        fun _defaultManagedAccountAllowCustomPricing(): JsonField<Boolean> =
            defaultManagedAccountAllowCustomPricing

        /**
         * Returns the raw JSON value of [defaultManagedAccountInheritEmergencyTermsOfService].
         *
         * Unlike [defaultManagedAccountInheritEmergencyTermsOfService], this method doesn't throw
         * if the JSON field has an unexpected type.
         */
        @JsonProperty("default_managed_account_inherit_emergency_terms_of_service")
        @ExcludeMissing
        fun _defaultManagedAccountInheritEmergencyTermsOfService(): JsonField<Boolean> =
            defaultManagedAccountInheritEmergencyTermsOfService

        /**
         * Returns the raw JSON value of [defaultManagedAccountRollupBilling].
         *
         * Unlike [defaultManagedAccountRollupBilling], this method doesn't throw if the JSON field
         * has an unexpected type.
         */
        @JsonProperty("default_managed_account_rollup_billing")
        @ExcludeMissing
        fun _defaultManagedAccountRollupBilling(): JsonField<Boolean> =
            defaultManagedAccountRollupBilling

        /**
         * Returns the raw JSON value of [defaultNotifyManagerAccount].
         *
         * Unlike [defaultNotifyManagerAccount], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("default_notify_manager_account")
        @ExcludeMissing
        fun _defaultNotifyManagerAccount(): JsonField<Boolean> = defaultNotifyManagerAccount

        /**
         * Returns the raw JSON value of [defaultNumbersExternalPin].
         *
         * Unlike [defaultNumbersExternalPin], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("default_numbers_external_pin")
        @ExcludeMissing
        fun _defaultNumbersExternalPin(): JsonField<String> = defaultNumbersExternalPin

        /**
         * Returns the raw JSON value of [firstName].
         *
         * Unlike [firstName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("first_name") @ExcludeMissing fun _firstName(): JsonField<String> = firstName

        /**
         * Returns the raw JSON value of [gotFreeNumberAtSignup].
         *
         * Unlike [gotFreeNumberAtSignup], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("got_free_number_at_signup")
        @ExcludeMissing
        fun _gotFreeNumberAtSignup(): JsonField<Boolean> = gotFreeNumberAtSignup

        /**
         * Returns the raw JSON value of [lastName].
         *
         * Unlike [lastName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("last_name") @ExcludeMissing fun _lastName(): JsonField<String> = lastName

        /**
         * Returns the raw JSON value of [lowBalanceNotificationFrequency].
         *
         * Unlike [lowBalanceNotificationFrequency], this method doesn't throw if the JSON field has
         * an unexpected type.
         */
        @JsonProperty("low_balance_notification_frequency")
        @ExcludeMissing
        fun _lowBalanceNotificationFrequency(): JsonField<LowBalanceNotificationFrequency> =
            lowBalanceNotificationFrequency

        /**
         * Returns the raw JSON value of [lowBalanceThresholdAmount].
         *
         * Unlike [lowBalanceThresholdAmount], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("low_balance_threshold_amount")
        @ExcludeMissing
        fun _lowBalanceThresholdAmount(): JsonField<Double> = lowBalanceThresholdAmount

        /**
         * Returns the raw JSON value of [notifyOnInvoiceAvailable].
         *
         * Unlike [notifyOnInvoiceAvailable], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("notify_on_invoice_available")
        @ExcludeMissing
        fun _notifyOnInvoiceAvailable(): JsonField<Boolean> = notifyOnInvoiceAvailable

        /**
         * Returns the raw JSON value of [notifyOnInvoicePayment].
         *
         * Unlike [notifyOnInvoicePayment], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("notify_on_invoice_payment")
        @ExcludeMissing
        fun _notifyOnInvoicePayment(): JsonField<Boolean> = notifyOnInvoicePayment

        /**
         * Returns the raw JSON value of [npacUser].
         *
         * Unlike [npacUser], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("npac_user") @ExcludeMissing fun _npacUser(): JsonField<Boolean> = npacUser

        /**
         * Returns the raw JSON value of [onboardingBuildMethod].
         *
         * Unlike [onboardingBuildMethod], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("onboarding_build_method")
        @ExcludeMissing
        fun _onboardingBuildMethod(): JsonField<List<String>> = onboardingBuildMethod

        /**
         * Returns the raw JSON value of [onboardingIndustries].
         *
         * Unlike [onboardingIndustries], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("onboarding_industries")
        @ExcludeMissing
        fun _onboardingIndustries(): JsonField<List<String>> = onboardingIndustries

        /**
         * Returns the raw JSON value of [onboardingMonthlyBudget].
         *
         * Unlike [onboardingMonthlyBudget], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("onboarding_monthly_budget")
        @ExcludeMissing
        fun _onboardingMonthlyBudget(): JsonField<List<String>> = onboardingMonthlyBudget

        /**
         * Returns the raw JSON value of [onboardingProductInterest].
         *
         * Unlike [onboardingProductInterest], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("onboarding_product_interest")
        @ExcludeMissing
        fun _onboardingProductInterest(): JsonField<List<String>> = onboardingProductInterest

        /**
         * Returns the raw JSON value of [onboardingProjectTypes].
         *
         * Unlike [onboardingProjectTypes], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("onboarding_project_types")
        @ExcludeMissing
        fun _onboardingProjectTypes(): JsonField<List<String>> = onboardingProjectTypes

        /**
         * Returns the raw JSON value of [onboardingReasonsForConsideration].
         *
         * Unlike [onboardingReasonsForConsideration], this method doesn't throw if the JSON field
         * has an unexpected type.
         */
        @JsonProperty("onboarding_reasons_for_consideration")
        @ExcludeMissing
        fun _onboardingReasonsForConsideration(): JsonField<List<String>> =
            onboardingReasonsForConsideration

        /**
         * Returns the raw JSON value of [onboardingReferrer].
         *
         * Unlike [onboardingReferrer], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("onboarding_referrer")
        @ExcludeMissing
        fun _onboardingReferrer(): JsonField<List<String>> = onboardingReferrer

        /**
         * Returns the raw JSON value of [onboardingUseCasesOther].
         *
         * Unlike [onboardingUseCasesOther], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("onboarding_use_cases_other")
        @ExcludeMissing
        fun _onboardingUseCasesOther(): JsonField<List<String>> = onboardingUseCasesOther

        /**
         * Returns the raw JSON value of [phoneNumber].
         *
         * Unlike [phoneNumber], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("phone_number")
        @ExcludeMissing
        fun _phoneNumber(): JsonField<String> = phoneNumber

        /**
         * Returns the raw JSON value of [portOutPinValidation].
         *
         * Unlike [portOutPinValidation], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("port_out_pin_validation")
        @ExcludeMissing
        fun _portOutPinValidation(): JsonField<Boolean> = portOutPinValidation

        /**
         * Returns the raw JSON value of [primaryUseCase].
         *
         * Unlike [primaryUseCase], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("primary_use_case")
        @ExcludeMissing
        fun _primaryUseCase(): JsonField<String> = primaryUseCase

        /**
         * Returns the raw JSON value of [role].
         *
         * Unlike [role], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("role") @ExcludeMissing fun _role(): JsonField<String> = role

        /**
         * Returns the raw JSON value of [state].
         *
         * Unlike [state], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<String> = state

        /**
         * Returns the raw JSON value of [uiTheme].
         *
         * Unlike [uiTheme], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("ui_theme") @ExcludeMissing fun _uiTheme(): JsonField<UiTheme> = uiTheme

        /**
         * Returns the raw JSON value of [useCases].
         *
         * Unlike [useCases], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("use_cases")
        @ExcludeMissing
        fun _useCases(): JsonField<List<String>> = useCases

        /**
         * Returns the raw JSON value of [userSubscriptionOptIn].
         *
         * Unlike [userSubscriptionOptIn], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("user_subscription_opt_in")
        @ExcludeMissing
        fun _userSubscriptionOptIn(): JsonField<Boolean> = userSubscriptionOptIn

        /**
         * Returns the raw JSON value of [zip].
         *
         * Unlike [zip], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("zip") @ExcludeMissing fun _zip(): JsonField<String> = zip

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Body]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var address1: JsonField<String> = JsonMissing.of()
            private var address2: JsonField<String> = JsonMissing.of()
            private var businessName: JsonField<String> = JsonMissing.of()
            private var city: JsonField<String> = JsonMissing.of()
            private var companySize: JsonField<String> = JsonMissing.of()
            private var country: JsonField<String> = JsonMissing.of()
            private var dataLocality: JsonField<DataLocality> = JsonMissing.of()
            private var defaultManagedAccountAllowCustomPricing: JsonField<Boolean> =
                JsonMissing.of()
            private var defaultManagedAccountInheritEmergencyTermsOfService: JsonField<Boolean> =
                JsonMissing.of()
            private var defaultManagedAccountRollupBilling: JsonField<Boolean> = JsonMissing.of()
            private var defaultNotifyManagerAccount: JsonField<Boolean> = JsonMissing.of()
            private var defaultNumbersExternalPin: JsonField<String> = JsonMissing.of()
            private var firstName: JsonField<String> = JsonMissing.of()
            private var gotFreeNumberAtSignup: JsonField<Boolean> = JsonMissing.of()
            private var lastName: JsonField<String> = JsonMissing.of()
            private var lowBalanceNotificationFrequency:
                JsonField<LowBalanceNotificationFrequency> =
                JsonMissing.of()
            private var lowBalanceThresholdAmount: JsonField<Double> = JsonMissing.of()
            private var notifyOnInvoiceAvailable: JsonField<Boolean> = JsonMissing.of()
            private var notifyOnInvoicePayment: JsonField<Boolean> = JsonMissing.of()
            private var npacUser: JsonField<Boolean> = JsonMissing.of()
            private var onboardingBuildMethod: JsonField<MutableList<String>>? = null
            private var onboardingIndustries: JsonField<MutableList<String>>? = null
            private var onboardingMonthlyBudget: JsonField<MutableList<String>>? = null
            private var onboardingProductInterest: JsonField<MutableList<String>>? = null
            private var onboardingProjectTypes: JsonField<MutableList<String>>? = null
            private var onboardingReasonsForConsideration: JsonField<MutableList<String>>? = null
            private var onboardingReferrer: JsonField<MutableList<String>>? = null
            private var onboardingUseCasesOther: JsonField<MutableList<String>>? = null
            private var phoneNumber: JsonField<String> = JsonMissing.of()
            private var portOutPinValidation: JsonField<Boolean> = JsonMissing.of()
            private var primaryUseCase: JsonField<String> = JsonMissing.of()
            private var role: JsonField<String> = JsonMissing.of()
            private var state: JsonField<String> = JsonMissing.of()
            private var uiTheme: JsonField<UiTheme> = JsonMissing.of()
            private var useCases: JsonField<MutableList<String>>? = null
            private var userSubscriptionOptIn: JsonField<Boolean> = JsonMissing.of()
            private var zip: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                address1 = body.address1
                address2 = body.address2
                businessName = body.businessName
                city = body.city
                companySize = body.companySize
                country = body.country
                dataLocality = body.dataLocality
                defaultManagedAccountAllowCustomPricing =
                    body.defaultManagedAccountAllowCustomPricing
                defaultManagedAccountInheritEmergencyTermsOfService =
                    body.defaultManagedAccountInheritEmergencyTermsOfService
                defaultManagedAccountRollupBilling = body.defaultManagedAccountRollupBilling
                defaultNotifyManagerAccount = body.defaultNotifyManagerAccount
                defaultNumbersExternalPin = body.defaultNumbersExternalPin
                firstName = body.firstName
                gotFreeNumberAtSignup = body.gotFreeNumberAtSignup
                lastName = body.lastName
                lowBalanceNotificationFrequency = body.lowBalanceNotificationFrequency
                lowBalanceThresholdAmount = body.lowBalanceThresholdAmount
                notifyOnInvoiceAvailable = body.notifyOnInvoiceAvailable
                notifyOnInvoicePayment = body.notifyOnInvoicePayment
                npacUser = body.npacUser
                onboardingBuildMethod = body.onboardingBuildMethod.map { it.toMutableList() }
                onboardingIndustries = body.onboardingIndustries.map { it.toMutableList() }
                onboardingMonthlyBudget = body.onboardingMonthlyBudget.map { it.toMutableList() }
                onboardingProductInterest =
                    body.onboardingProductInterest.map { it.toMutableList() }
                onboardingProjectTypes = body.onboardingProjectTypes.map { it.toMutableList() }
                onboardingReasonsForConsideration =
                    body.onboardingReasonsForConsideration.map { it.toMutableList() }
                onboardingReferrer = body.onboardingReferrer.map { it.toMutableList() }
                onboardingUseCasesOther = body.onboardingUseCasesOther.map { it.toMutableList() }
                phoneNumber = body.phoneNumber
                portOutPinValidation = body.portOutPinValidation
                primaryUseCase = body.primaryUseCase
                role = body.role
                state = body.state
                uiTheme = body.uiTheme
                useCases = body.useCases.map { it.toMutableList() }
                userSubscriptionOptIn = body.userSubscriptionOptIn
                zip = body.zip
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** First line of the profile address. */
            fun address1(address1: String?) = address1(JsonField.ofNullable(address1))

            /** Alias for calling [Builder.address1] with `address1.orElse(null)`. */
            fun address1(address1: Optional<String>) = address1(address1.getOrNull())

            /**
             * Sets [Builder.address1] to an arbitrary JSON value.
             *
             * You should usually call [Builder.address1] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun address1(address1: JsonField<String>) = apply { this.address1 = address1 }

            /** Second line of the profile address. */
            fun address2(address2: String?) = address2(JsonField.ofNullable(address2))

            /** Alias for calling [Builder.address2] with `address2.orElse(null)`. */
            fun address2(address2: Optional<String>) = address2(address2.getOrNull())

            /**
             * Sets [Builder.address2] to an arbitrary JSON value.
             *
             * You should usually call [Builder.address2] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun address2(address2: JsonField<String>) = apply { this.address2 = address2 }

            /** Business name associated with the profile. */
            fun businessName(businessName: String?) =
                businessName(JsonField.ofNullable(businessName))

            /** Alias for calling [Builder.businessName] with `businessName.orElse(null)`. */
            fun businessName(businessName: Optional<String>) =
                businessName(businessName.getOrNull())

            /**
             * Sets [Builder.businessName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.businessName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun businessName(businessName: JsonField<String>) = apply {
                this.businessName = businessName
            }

            /** City in the profile address. */
            fun city(city: String?) = city(JsonField.ofNullable(city))

            /** Alias for calling [Builder.city] with `city.orElse(null)`. */
            fun city(city: Optional<String>) = city(city.getOrNull())

            /**
             * Sets [Builder.city] to an arbitrary JSON value.
             *
             * You should usually call [Builder.city] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun city(city: JsonField<String>) = apply { this.city = city }

            /** Company size reported by the user. */
            fun companySize(companySize: String) = companySize(JsonField.of(companySize))

            /**
             * Sets [Builder.companySize] to an arbitrary JSON value.
             *
             * You should usually call [Builder.companySize] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun companySize(companySize: JsonField<String>) = apply {
                this.companySize = companySize
            }

            /** Country code in the profile address. */
            fun country(country: String?) = country(JsonField.ofNullable(country))

            /** Alias for calling [Builder.country] with `country.orElse(null)`. */
            fun country(country: Optional<String>) = country(country.getOrNull())

            /**
             * Sets [Builder.country] to an arbitrary JSON value.
             *
             * You should usually call [Builder.country] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun country(country: JsonField<String>) = apply { this.country = country }

            /**
             * Data locality: USA (United States), DEU (Germany), AUS (Australia), UAE (United Arab
             * Emirates), or CAN (Canada). A change is permitted only if data locality has not
             * previously been changed. A successful change sets data_locality_updated_at and
             * initializes data_locality_migration_status to not_started.
             */
            fun dataLocality(dataLocality: DataLocality) = dataLocality(JsonField.of(dataLocality))

            /**
             * Sets [Builder.dataLocality] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dataLocality] with a well-typed [DataLocality] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dataLocality(dataLocality: JsonField<DataLocality>) = apply {
                this.dataLocality = dataLocality
            }

            /** Default custom-pricing setting for managed accounts. */
            fun defaultManagedAccountAllowCustomPricing(
                defaultManagedAccountAllowCustomPricing: Boolean
            ) =
                defaultManagedAccountAllowCustomPricing(
                    JsonField.of(defaultManagedAccountAllowCustomPricing)
                )

            /**
             * Sets [Builder.defaultManagedAccountAllowCustomPricing] to an arbitrary JSON value.
             *
             * You should usually call [Builder.defaultManagedAccountAllowCustomPricing] with a
             * well-typed [Boolean] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun defaultManagedAccountAllowCustomPricing(
                defaultManagedAccountAllowCustomPricing: JsonField<Boolean>
            ) = apply {
                this.defaultManagedAccountAllowCustomPricing =
                    defaultManagedAccountAllowCustomPricing
            }

            /**
             * Default emergency terms-of-service inheritance setting for managed accounts, where
             * supported.
             */
            fun defaultManagedAccountInheritEmergencyTermsOfService(
                defaultManagedAccountInheritEmergencyTermsOfService: Boolean
            ) =
                defaultManagedAccountInheritEmergencyTermsOfService(
                    JsonField.of(defaultManagedAccountInheritEmergencyTermsOfService)
                )

            /**
             * Sets [Builder.defaultManagedAccountInheritEmergencyTermsOfService] to an arbitrary
             * JSON value.
             *
             * You should usually call [Builder.defaultManagedAccountInheritEmergencyTermsOfService]
             * with a well-typed [Boolean] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun defaultManagedAccountInheritEmergencyTermsOfService(
                defaultManagedAccountInheritEmergencyTermsOfService: JsonField<Boolean>
            ) = apply {
                this.defaultManagedAccountInheritEmergencyTermsOfService =
                    defaultManagedAccountInheritEmergencyTermsOfService
            }

            /** Default rollup-billing setting for managed accounts. */
            fun defaultManagedAccountRollupBilling(defaultManagedAccountRollupBilling: Boolean) =
                defaultManagedAccountRollupBilling(JsonField.of(defaultManagedAccountRollupBilling))

            /**
             * Sets [Builder.defaultManagedAccountRollupBilling] to an arbitrary JSON value.
             *
             * You should usually call [Builder.defaultManagedAccountRollupBilling] with a
             * well-typed [Boolean] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun defaultManagedAccountRollupBilling(
                defaultManagedAccountRollupBilling: JsonField<Boolean>
            ) = apply {
                this.defaultManagedAccountRollupBilling = defaultManagedAccountRollupBilling
            }

            /** Default setting for notifying the manager account. */
            fun defaultNotifyManagerAccount(defaultNotifyManagerAccount: Boolean) =
                defaultNotifyManagerAccount(JsonField.of(defaultNotifyManagerAccount))

            /**
             * Sets [Builder.defaultNotifyManagerAccount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.defaultNotifyManagerAccount] with a well-typed
             * [Boolean] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun defaultNotifyManagerAccount(defaultNotifyManagerAccount: JsonField<Boolean>) =
                apply {
                    this.defaultNotifyManagerAccount = defaultNotifyManagerAccount
                }

            /** Default alphanumeric external PIN for phone numbers. */
            fun defaultNumbersExternalPin(defaultNumbersExternalPin: String) =
                defaultNumbersExternalPin(JsonField.of(defaultNumbersExternalPin))

            /**
             * Sets [Builder.defaultNumbersExternalPin] to an arbitrary JSON value.
             *
             * You should usually call [Builder.defaultNumbersExternalPin] with a well-typed
             * [String] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun defaultNumbersExternalPin(defaultNumbersExternalPin: JsonField<String>) = apply {
                this.defaultNumbersExternalPin = defaultNumbersExternalPin
            }

            /** The user's first name. */
            fun firstName(firstName: String?) = firstName(JsonField.ofNullable(firstName))

            /** Alias for calling [Builder.firstName] with `firstName.orElse(null)`. */
            fun firstName(firstName: Optional<String>) = firstName(firstName.getOrNull())

            /**
             * Sets [Builder.firstName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.firstName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun firstName(firstName: JsonField<String>) = apply { this.firstName = firstName }

            /** Whether the user received a free number at signup. */
            fun gotFreeNumberAtSignup(gotFreeNumberAtSignup: Boolean) =
                gotFreeNumberAtSignup(JsonField.of(gotFreeNumberAtSignup))

            /**
             * Sets [Builder.gotFreeNumberAtSignup] to an arbitrary JSON value.
             *
             * You should usually call [Builder.gotFreeNumberAtSignup] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun gotFreeNumberAtSignup(gotFreeNumberAtSignup: JsonField<Boolean>) = apply {
                this.gotFreeNumberAtSignup = gotFreeNumberAtSignup
            }

            /** The user's last name. */
            fun lastName(lastName: String?) = lastName(JsonField.ofNullable(lastName))

            /** Alias for calling [Builder.lastName] with `lastName.orElse(null)`. */
            fun lastName(lastName: Optional<String>) = lastName(lastName.getOrNull())

            /**
             * Sets [Builder.lastName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lastName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun lastName(lastName: JsonField<String>) = apply { this.lastName = lastName }

            /**
             * Low-balance notification frequency. Organization sub-users cannot set a non-null
             * frequency. The resulting profile must have both a threshold and frequency, or
             * neither.
             */
            fun lowBalanceNotificationFrequency(
                lowBalanceNotificationFrequency: LowBalanceNotificationFrequency?
            ) =
                lowBalanceNotificationFrequency(
                    JsonField.ofNullable(lowBalanceNotificationFrequency)
                )

            /**
             * Alias for calling [Builder.lowBalanceNotificationFrequency] with
             * `lowBalanceNotificationFrequency.orElse(null)`.
             */
            fun lowBalanceNotificationFrequency(
                lowBalanceNotificationFrequency: Optional<LowBalanceNotificationFrequency>
            ) = lowBalanceNotificationFrequency(lowBalanceNotificationFrequency.getOrNull())

            /**
             * Sets [Builder.lowBalanceNotificationFrequency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lowBalanceNotificationFrequency] with a well-typed
             * [LowBalanceNotificationFrequency] value instead. This method is primarily for setting
             * the field to an undocumented or not yet supported value.
             */
            fun lowBalanceNotificationFrequency(
                lowBalanceNotificationFrequency: JsonField<LowBalanceNotificationFrequency>
            ) = apply { this.lowBalanceNotificationFrequency = lowBalanceNotificationFrequency }

            /**
             * Low-balance notification threshold in the billing currency. The resulting profile
             * must have both a threshold and notification frequency, or neither.
             */
            fun lowBalanceThresholdAmount(lowBalanceThresholdAmount: Double?) =
                lowBalanceThresholdAmount(JsonField.ofNullable(lowBalanceThresholdAmount))

            /**
             * Alias for [Builder.lowBalanceThresholdAmount].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun lowBalanceThresholdAmount(lowBalanceThresholdAmount: Double) =
                lowBalanceThresholdAmount(lowBalanceThresholdAmount as Double?)

            /**
             * Alias for calling [Builder.lowBalanceThresholdAmount] with
             * `lowBalanceThresholdAmount.orElse(null)`.
             */
            fun lowBalanceThresholdAmount(lowBalanceThresholdAmount: Optional<Double>) =
                lowBalanceThresholdAmount(lowBalanceThresholdAmount.getOrNull())

            /**
             * Sets [Builder.lowBalanceThresholdAmount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lowBalanceThresholdAmount] with a well-typed
             * [Double] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun lowBalanceThresholdAmount(lowBalanceThresholdAmount: JsonField<Double>) = apply {
                this.lowBalanceThresholdAmount = lowBalanceThresholdAmount
            }

            /** Whether to notify the user when an invoice is available. */
            fun notifyOnInvoiceAvailable(notifyOnInvoiceAvailable: Boolean) =
                notifyOnInvoiceAvailable(JsonField.of(notifyOnInvoiceAvailable))

            /**
             * Sets [Builder.notifyOnInvoiceAvailable] to an arbitrary JSON value.
             *
             * You should usually call [Builder.notifyOnInvoiceAvailable] with a well-typed
             * [Boolean] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun notifyOnInvoiceAvailable(notifyOnInvoiceAvailable: JsonField<Boolean>) = apply {
                this.notifyOnInvoiceAvailable = notifyOnInvoiceAvailable
            }

            /** Whether to notify the user when an invoice is paid. */
            fun notifyOnInvoicePayment(notifyOnInvoicePayment: Boolean) =
                notifyOnInvoicePayment(JsonField.of(notifyOnInvoicePayment))

            /**
             * Sets [Builder.notifyOnInvoicePayment] to an arbitrary JSON value.
             *
             * You should usually call [Builder.notifyOnInvoicePayment] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun notifyOnInvoicePayment(notifyOnInvoicePayment: JsonField<Boolean>) = apply {
                this.notifyOnInvoicePayment = notifyOnInvoicePayment
            }

            /** Whether the user is an NPAC user. */
            fun npacUser(npacUser: Boolean) = npacUser(JsonField.of(npacUser))

            /**
             * Sets [Builder.npacUser] to an arbitrary JSON value.
             *
             * You should usually call [Builder.npacUser] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun npacUser(npacUser: JsonField<Boolean>) = apply { this.npacUser = npacUser }

            /** Build methods reported during onboarding. */
            fun onboardingBuildMethod(onboardingBuildMethod: List<String>) =
                onboardingBuildMethod(JsonField.of(onboardingBuildMethod))

            /**
             * Sets [Builder.onboardingBuildMethod] to an arbitrary JSON value.
             *
             * You should usually call [Builder.onboardingBuildMethod] with a well-typed
             * `List<String>` value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun onboardingBuildMethod(onboardingBuildMethod: JsonField<List<String>>) = apply {
                this.onboardingBuildMethod = onboardingBuildMethod.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [Builder.onboardingBuildMethod].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addOnboardingBuildMethod(onboardingBuildMethod: String) = apply {
                this.onboardingBuildMethod =
                    (this.onboardingBuildMethod ?: JsonField.of(mutableListOf())).also {
                        checkKnown("onboardingBuildMethod", it).add(onboardingBuildMethod)
                    }
            }

            /** Industries reported during onboarding. */
            fun onboardingIndustries(onboardingIndustries: List<String>) =
                onboardingIndustries(JsonField.of(onboardingIndustries))

            /**
             * Sets [Builder.onboardingIndustries] to an arbitrary JSON value.
             *
             * You should usually call [Builder.onboardingIndustries] with a well-typed
             * `List<String>` value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun onboardingIndustries(onboardingIndustries: JsonField<List<String>>) = apply {
                this.onboardingIndustries = onboardingIndustries.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [onboardingIndustries].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addOnboardingIndustry(onboardingIndustry: String) = apply {
                onboardingIndustries =
                    (onboardingIndustries ?: JsonField.of(mutableListOf())).also {
                        checkKnown("onboardingIndustries", it).add(onboardingIndustry)
                    }
            }

            /** Monthly budget ranges reported during onboarding. */
            fun onboardingMonthlyBudget(onboardingMonthlyBudget: List<String>) =
                onboardingMonthlyBudget(JsonField.of(onboardingMonthlyBudget))

            /**
             * Sets [Builder.onboardingMonthlyBudget] to an arbitrary JSON value.
             *
             * You should usually call [Builder.onboardingMonthlyBudget] with a well-typed
             * `List<String>` value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun onboardingMonthlyBudget(onboardingMonthlyBudget: JsonField<List<String>>) = apply {
                this.onboardingMonthlyBudget = onboardingMonthlyBudget.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [Builder.onboardingMonthlyBudget].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addOnboardingMonthlyBudget(onboardingMonthlyBudget: String) = apply {
                this.onboardingMonthlyBudget =
                    (this.onboardingMonthlyBudget ?: JsonField.of(mutableListOf())).also {
                        checkKnown("onboardingMonthlyBudget", it).add(onboardingMonthlyBudget)
                    }
            }

            /** Products of interest reported during onboarding. */
            fun onboardingProductInterest(onboardingProductInterest: List<String>) =
                onboardingProductInterest(JsonField.of(onboardingProductInterest))

            /**
             * Sets [Builder.onboardingProductInterest] to an arbitrary JSON value.
             *
             * You should usually call [Builder.onboardingProductInterest] with a well-typed
             * `List<String>` value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun onboardingProductInterest(onboardingProductInterest: JsonField<List<String>>) =
                apply {
                    this.onboardingProductInterest =
                        onboardingProductInterest.map { it.toMutableList() }
                }

            /**
             * Adds a single [String] to [Builder.onboardingProductInterest].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addOnboardingProductInterest(onboardingProductInterest: String) = apply {
                this.onboardingProductInterest =
                    (this.onboardingProductInterest ?: JsonField.of(mutableListOf())).also {
                        checkKnown("onboardingProductInterest", it).add(onboardingProductInterest)
                    }
            }

            /** Onboarding project types. */
            fun onboardingProjectTypes(onboardingProjectTypes: List<String>) =
                onboardingProjectTypes(JsonField.of(onboardingProjectTypes))

            /**
             * Sets [Builder.onboardingProjectTypes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.onboardingProjectTypes] with a well-typed
             * `List<String>` value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun onboardingProjectTypes(onboardingProjectTypes: JsonField<List<String>>) = apply {
                this.onboardingProjectTypes = onboardingProjectTypes.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [onboardingProjectTypes].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addOnboardingProjectType(onboardingProjectType: String) = apply {
                onboardingProjectTypes =
                    (onboardingProjectTypes ?: JsonField.of(mutableListOf())).also {
                        checkKnown("onboardingProjectTypes", it).add(onboardingProjectType)
                    }
            }

            /** Reasons for considering Telnyx. */
            fun onboardingReasonsForConsideration(onboardingReasonsForConsideration: List<String>) =
                onboardingReasonsForConsideration(JsonField.of(onboardingReasonsForConsideration))

            /**
             * Sets [Builder.onboardingReasonsForConsideration] to an arbitrary JSON value.
             *
             * You should usually call [Builder.onboardingReasonsForConsideration] with a well-typed
             * `List<String>` value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun onboardingReasonsForConsideration(
                onboardingReasonsForConsideration: JsonField<List<String>>
            ) = apply {
                this.onboardingReasonsForConsideration =
                    onboardingReasonsForConsideration.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [Builder.onboardingReasonsForConsideration].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addOnboardingReasonsForConsideration(onboardingReasonsForConsideration: String) =
                apply {
                    this.onboardingReasonsForConsideration =
                        (this.onboardingReasonsForConsideration ?: JsonField.of(mutableListOf()))
                            .also {
                                checkKnown("onboardingReasonsForConsideration", it)
                                    .add(onboardingReasonsForConsideration)
                            }
                }

            /** Referral sources reported during onboarding. */
            fun onboardingReferrer(onboardingReferrer: List<String>) =
                onboardingReferrer(JsonField.of(onboardingReferrer))

            /**
             * Sets [Builder.onboardingReferrer] to an arbitrary JSON value.
             *
             * You should usually call [Builder.onboardingReferrer] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun onboardingReferrer(onboardingReferrer: JsonField<List<String>>) = apply {
                this.onboardingReferrer = onboardingReferrer.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [Builder.onboardingReferrer].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addOnboardingReferrer(onboardingReferrer: String) = apply {
                this.onboardingReferrer =
                    (this.onboardingReferrer ?: JsonField.of(mutableListOf())).also {
                        checkKnown("onboardingReferrer", it).add(onboardingReferrer)
                    }
            }

            /** Other onboarding use cases. */
            fun onboardingUseCasesOther(onboardingUseCasesOther: List<String>) =
                onboardingUseCasesOther(JsonField.of(onboardingUseCasesOther))

            /**
             * Sets [Builder.onboardingUseCasesOther] to an arbitrary JSON value.
             *
             * You should usually call [Builder.onboardingUseCasesOther] with a well-typed
             * `List<String>` value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun onboardingUseCasesOther(onboardingUseCasesOther: JsonField<List<String>>) = apply {
                this.onboardingUseCasesOther = onboardingUseCasesOther.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [Builder.onboardingUseCasesOther].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addOnboardingUseCasesOther(onboardingUseCasesOther: String) = apply {
                this.onboardingUseCasesOther =
                    (this.onboardingUseCasesOther ?: JsonField.of(mutableListOf())).also {
                        checkKnown("onboardingUseCasesOther", it).add(onboardingUseCasesOther)
                    }
            }

            /** Contact phone number associated with the profile. */
            fun phoneNumber(phoneNumber: String?) = phoneNumber(JsonField.ofNullable(phoneNumber))

            /** Alias for calling [Builder.phoneNumber] with `phoneNumber.orElse(null)`. */
            fun phoneNumber(phoneNumber: Optional<String>) = phoneNumber(phoneNumber.getOrNull())

            /**
             * Sets [Builder.phoneNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.phoneNumber] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun phoneNumber(phoneNumber: JsonField<String>) = apply {
                this.phoneNumber = phoneNumber
            }

            /** Whether port-out PIN validation is enabled. */
            fun portOutPinValidation(portOutPinValidation: Boolean) =
                portOutPinValidation(JsonField.of(portOutPinValidation))

            /**
             * Sets [Builder.portOutPinValidation] to an arbitrary JSON value.
             *
             * You should usually call [Builder.portOutPinValidation] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun portOutPinValidation(portOutPinValidation: JsonField<Boolean>) = apply {
                this.portOutPinValidation = portOutPinValidation
            }

            /** Primary use case for the account. */
            fun primaryUseCase(primaryUseCase: String) =
                primaryUseCase(JsonField.of(primaryUseCase))

            /**
             * Sets [Builder.primaryUseCase] to an arbitrary JSON value.
             *
             * You should usually call [Builder.primaryUseCase] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun primaryUseCase(primaryUseCase: JsonField<String>) = apply {
                this.primaryUseCase = primaryUseCase
            }

            /** The user's role. */
            fun role(role: String) = role(JsonField.of(role))

            /**
             * Sets [Builder.role] to an arbitrary JSON value.
             *
             * You should usually call [Builder.role] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun role(role: JsonField<String>) = apply { this.role = role }

            /** State or region in the profile address. */
            fun state(state: String?) = state(JsonField.ofNullable(state))

            /** Alias for calling [Builder.state] with `state.orElse(null)`. */
            fun state(state: Optional<String>) = state(state.getOrNull())

            /**
             * Sets [Builder.state] to an arbitrary JSON value.
             *
             * You should usually call [Builder.state] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun state(state: JsonField<String>) = apply { this.state = state }

            /** User interface theme: 0 for dark or 1 for light. */
            fun uiTheme(uiTheme: UiTheme) = uiTheme(JsonField.of(uiTheme))

            /**
             * Sets [Builder.uiTheme] to an arbitrary JSON value.
             *
             * You should usually call [Builder.uiTheme] with a well-typed [UiTheme] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun uiTheme(uiTheme: JsonField<UiTheme>) = apply { this.uiTheme = uiTheme }

            /** Use cases reported by the user. */
            fun useCases(useCases: List<String>) = useCases(JsonField.of(useCases))

            /**
             * Sets [Builder.useCases] to an arbitrary JSON value.
             *
             * You should usually call [Builder.useCases] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun useCases(useCases: JsonField<List<String>>) = apply {
                this.useCases = useCases.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [useCases].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addUseCase(useCase: String) = apply {
                useCases =
                    (useCases ?: JsonField.of(mutableListOf())).also {
                        checkKnown("useCases", it).add(useCase)
                    }
            }

            /** Whether the user opts in to subscriptions. */
            fun userSubscriptionOptIn(userSubscriptionOptIn: Boolean) =
                userSubscriptionOptIn(JsonField.of(userSubscriptionOptIn))

            /**
             * Sets [Builder.userSubscriptionOptIn] to an arbitrary JSON value.
             *
             * You should usually call [Builder.userSubscriptionOptIn] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun userSubscriptionOptIn(userSubscriptionOptIn: JsonField<Boolean>) = apply {
                this.userSubscriptionOptIn = userSubscriptionOptIn
            }

            /** Postal code in the profile address. */
            fun zip(zip: String?) = zip(JsonField.ofNullable(zip))

            /** Alias for calling [Builder.zip] with `zip.orElse(null)`. */
            fun zip(zip: Optional<String>) = zip(zip.getOrNull())

            /**
             * Sets [Builder.zip] to an arbitrary JSON value.
             *
             * You should usually call [Builder.zip] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun zip(zip: JsonField<String>) = apply { this.zip = zip }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Body =
                Body(
                    address1,
                    address2,
                    businessName,
                    city,
                    companySize,
                    country,
                    dataLocality,
                    defaultManagedAccountAllowCustomPricing,
                    defaultManagedAccountInheritEmergencyTermsOfService,
                    defaultManagedAccountRollupBilling,
                    defaultNotifyManagerAccount,
                    defaultNumbersExternalPin,
                    firstName,
                    gotFreeNumberAtSignup,
                    lastName,
                    lowBalanceNotificationFrequency,
                    lowBalanceThresholdAmount,
                    notifyOnInvoiceAvailable,
                    notifyOnInvoicePayment,
                    npacUser,
                    (onboardingBuildMethod ?: JsonMissing.of()).map { it.toImmutable() },
                    (onboardingIndustries ?: JsonMissing.of()).map { it.toImmutable() },
                    (onboardingMonthlyBudget ?: JsonMissing.of()).map { it.toImmutable() },
                    (onboardingProductInterest ?: JsonMissing.of()).map { it.toImmutable() },
                    (onboardingProjectTypes ?: JsonMissing.of()).map { it.toImmutable() },
                    (onboardingReasonsForConsideration ?: JsonMissing.of()).map {
                        it.toImmutable()
                    },
                    (onboardingReferrer ?: JsonMissing.of()).map { it.toImmutable() },
                    (onboardingUseCasesOther ?: JsonMissing.of()).map { it.toImmutable() },
                    phoneNumber,
                    portOutPinValidation,
                    primaryUseCase,
                    role,
                    state,
                    uiTheme,
                    (useCases ?: JsonMissing.of()).map { it.toImmutable() },
                    userSubscriptionOptIn,
                    zip,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            address1()
            address2()
            businessName()
            city()
            companySize()
            country()
            dataLocality().ifPresent { it.validate() }
            defaultManagedAccountAllowCustomPricing()
            defaultManagedAccountInheritEmergencyTermsOfService()
            defaultManagedAccountRollupBilling()
            defaultNotifyManagerAccount()
            defaultNumbersExternalPin()
            firstName()
            gotFreeNumberAtSignup()
            lastName()
            lowBalanceNotificationFrequency().ifPresent { it.validate() }
            lowBalanceThresholdAmount()
            notifyOnInvoiceAvailable()
            notifyOnInvoicePayment()
            npacUser()
            onboardingBuildMethod()
            onboardingIndustries()
            onboardingMonthlyBudget()
            onboardingProductInterest()
            onboardingProjectTypes()
            onboardingReasonsForConsideration()
            onboardingReferrer()
            onboardingUseCasesOther()
            phoneNumber()
            portOutPinValidation()
            primaryUseCase()
            role()
            state()
            uiTheme().ifPresent { it.validate() }
            useCases()
            userSubscriptionOptIn()
            zip()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: TelnyxInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (address1.asKnown().isPresent) 1 else 0) +
                (if (address2.asKnown().isPresent) 1 else 0) +
                (if (businessName.asKnown().isPresent) 1 else 0) +
                (if (city.asKnown().isPresent) 1 else 0) +
                (if (companySize.asKnown().isPresent) 1 else 0) +
                (if (country.asKnown().isPresent) 1 else 0) +
                (dataLocality.asKnown().getOrNull()?.validity() ?: 0) +
                (if (defaultManagedAccountAllowCustomPricing.asKnown().isPresent) 1 else 0) +
                (if (defaultManagedAccountInheritEmergencyTermsOfService.asKnown().isPresent) 1
                else 0) +
                (if (defaultManagedAccountRollupBilling.asKnown().isPresent) 1 else 0) +
                (if (defaultNotifyManagerAccount.asKnown().isPresent) 1 else 0) +
                (if (defaultNumbersExternalPin.asKnown().isPresent) 1 else 0) +
                (if (firstName.asKnown().isPresent) 1 else 0) +
                (if (gotFreeNumberAtSignup.asKnown().isPresent) 1 else 0) +
                (if (lastName.asKnown().isPresent) 1 else 0) +
                (lowBalanceNotificationFrequency.asKnown().getOrNull()?.validity() ?: 0) +
                (if (lowBalanceThresholdAmount.asKnown().isPresent) 1 else 0) +
                (if (notifyOnInvoiceAvailable.asKnown().isPresent) 1 else 0) +
                (if (notifyOnInvoicePayment.asKnown().isPresent) 1 else 0) +
                (if (npacUser.asKnown().isPresent) 1 else 0) +
                (onboardingBuildMethod.asKnown().getOrNull()?.size ?: 0) +
                (onboardingIndustries.asKnown().getOrNull()?.size ?: 0) +
                (onboardingMonthlyBudget.asKnown().getOrNull()?.size ?: 0) +
                (onboardingProductInterest.asKnown().getOrNull()?.size ?: 0) +
                (onboardingProjectTypes.asKnown().getOrNull()?.size ?: 0) +
                (onboardingReasonsForConsideration.asKnown().getOrNull()?.size ?: 0) +
                (onboardingReferrer.asKnown().getOrNull()?.size ?: 0) +
                (onboardingUseCasesOther.asKnown().getOrNull()?.size ?: 0) +
                (if (phoneNumber.asKnown().isPresent) 1 else 0) +
                (if (portOutPinValidation.asKnown().isPresent) 1 else 0) +
                (if (primaryUseCase.asKnown().isPresent) 1 else 0) +
                (if (role.asKnown().isPresent) 1 else 0) +
                (if (state.asKnown().isPresent) 1 else 0) +
                (uiTheme.asKnown().getOrNull()?.validity() ?: 0) +
                (useCases.asKnown().getOrNull()?.size ?: 0) +
                (if (userSubscriptionOptIn.asKnown().isPresent) 1 else 0) +
                (if (zip.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                address1 == other.address1 &&
                address2 == other.address2 &&
                businessName == other.businessName &&
                city == other.city &&
                companySize == other.companySize &&
                country == other.country &&
                dataLocality == other.dataLocality &&
                defaultManagedAccountAllowCustomPricing ==
                    other.defaultManagedAccountAllowCustomPricing &&
                defaultManagedAccountInheritEmergencyTermsOfService ==
                    other.defaultManagedAccountInheritEmergencyTermsOfService &&
                defaultManagedAccountRollupBilling == other.defaultManagedAccountRollupBilling &&
                defaultNotifyManagerAccount == other.defaultNotifyManagerAccount &&
                defaultNumbersExternalPin == other.defaultNumbersExternalPin &&
                firstName == other.firstName &&
                gotFreeNumberAtSignup == other.gotFreeNumberAtSignup &&
                lastName == other.lastName &&
                lowBalanceNotificationFrequency == other.lowBalanceNotificationFrequency &&
                lowBalanceThresholdAmount == other.lowBalanceThresholdAmount &&
                notifyOnInvoiceAvailable == other.notifyOnInvoiceAvailable &&
                notifyOnInvoicePayment == other.notifyOnInvoicePayment &&
                npacUser == other.npacUser &&
                onboardingBuildMethod == other.onboardingBuildMethod &&
                onboardingIndustries == other.onboardingIndustries &&
                onboardingMonthlyBudget == other.onboardingMonthlyBudget &&
                onboardingProductInterest == other.onboardingProductInterest &&
                onboardingProjectTypes == other.onboardingProjectTypes &&
                onboardingReasonsForConsideration == other.onboardingReasonsForConsideration &&
                onboardingReferrer == other.onboardingReferrer &&
                onboardingUseCasesOther == other.onboardingUseCasesOther &&
                phoneNumber == other.phoneNumber &&
                portOutPinValidation == other.portOutPinValidation &&
                primaryUseCase == other.primaryUseCase &&
                role == other.role &&
                state == other.state &&
                uiTheme == other.uiTheme &&
                useCases == other.useCases &&
                userSubscriptionOptIn == other.userSubscriptionOptIn &&
                zip == other.zip &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                address1,
                address2,
                businessName,
                city,
                companySize,
                country,
                dataLocality,
                defaultManagedAccountAllowCustomPricing,
                defaultManagedAccountInheritEmergencyTermsOfService,
                defaultManagedAccountRollupBilling,
                defaultNotifyManagerAccount,
                defaultNumbersExternalPin,
                firstName,
                gotFreeNumberAtSignup,
                lastName,
                lowBalanceNotificationFrequency,
                lowBalanceThresholdAmount,
                notifyOnInvoiceAvailable,
                notifyOnInvoicePayment,
                npacUser,
                onboardingBuildMethod,
                onboardingIndustries,
                onboardingMonthlyBudget,
                onboardingProductInterest,
                onboardingProjectTypes,
                onboardingReasonsForConsideration,
                onboardingReferrer,
                onboardingUseCasesOther,
                phoneNumber,
                portOutPinValidation,
                primaryUseCase,
                role,
                state,
                uiTheme,
                useCases,
                userSubscriptionOptIn,
                zip,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{address1=$address1, address2=$address2, businessName=$businessName, city=$city, companySize=$companySize, country=$country, dataLocality=$dataLocality, defaultManagedAccountAllowCustomPricing=$defaultManagedAccountAllowCustomPricing, defaultManagedAccountInheritEmergencyTermsOfService=$defaultManagedAccountInheritEmergencyTermsOfService, defaultManagedAccountRollupBilling=$defaultManagedAccountRollupBilling, defaultNotifyManagerAccount=$defaultNotifyManagerAccount, defaultNumbersExternalPin=$defaultNumbersExternalPin, firstName=$firstName, gotFreeNumberAtSignup=$gotFreeNumberAtSignup, lastName=$lastName, lowBalanceNotificationFrequency=$lowBalanceNotificationFrequency, lowBalanceThresholdAmount=$lowBalanceThresholdAmount, notifyOnInvoiceAvailable=$notifyOnInvoiceAvailable, notifyOnInvoicePayment=$notifyOnInvoicePayment, npacUser=$npacUser, onboardingBuildMethod=$onboardingBuildMethod, onboardingIndustries=$onboardingIndustries, onboardingMonthlyBudget=$onboardingMonthlyBudget, onboardingProductInterest=$onboardingProductInterest, onboardingProjectTypes=$onboardingProjectTypes, onboardingReasonsForConsideration=$onboardingReasonsForConsideration, onboardingReferrer=$onboardingReferrer, onboardingUseCasesOther=$onboardingUseCasesOther, phoneNumber=$phoneNumber, portOutPinValidation=$portOutPinValidation, primaryUseCase=$primaryUseCase, role=$role, state=$state, uiTheme=$uiTheme, useCases=$useCases, userSubscriptionOptIn=$userSubscriptionOptIn, zip=$zip, additionalProperties=$additionalProperties}"
    }

    /**
     * Data locality: USA (United States), DEU (Germany), AUS (Australia), UAE (United Arab
     * Emirates), or CAN (Canada). A change is permitted only if data locality has not previously
     * been changed. A successful change sets data_locality_updated_at and initializes
     * data_locality_migration_status to not_started.
     */
    class DataLocality @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val USA = of("USA")

            @JvmField val DEU = of("DEU")

            @JvmField val AUS = of("AUS")

            @JvmField val UAE = of("UAE")

            @JvmField val CAN = of("CAN")

            @JvmStatic fun of(value: String) = DataLocality(JsonField.of(value))
        }

        /** An enum containing [DataLocality]'s known values. */
        enum class Known {
            USA,
            DEU,
            AUS,
            UAE,
            CAN,
        }

        /**
         * An enum containing [DataLocality]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [DataLocality] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            USA,
            DEU,
            AUS,
            UAE,
            CAN,
            /**
             * An enum member indicating that [DataLocality] was instantiated with an unknown value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                USA -> Value.USA
                DEU -> Value.DEU
                AUS -> Value.AUS
                UAE -> Value.UAE
                CAN -> Value.CAN
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws TelnyxInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                USA -> Known.USA
                DEU -> Known.DEU
                AUS -> Known.AUS
                UAE -> Known.UAE
                CAN -> Known.CAN
                else -> throw TelnyxInvalidDataException("Unknown DataLocality: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws TelnyxInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { TelnyxInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): DataLocality = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: TelnyxInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is DataLocality && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Low-balance notification frequency. Organization sub-users cannot set a non-null frequency.
     * The resulting profile must have both a threshold and frequency, or neither.
     */
    class LowBalanceNotificationFrequency
    @JsonCreator
    private constructor(private val value: JsonField<Long>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<Long> = value

        companion object {

            @JvmField val _2 = of(2L)

            @JvmField val _4 = of(4L)

            @JvmField val _12 = of(12L)

            @JvmField val _24 = of(24L)

            @JvmStatic fun of(value: Long) = LowBalanceNotificationFrequency(JsonField.of(value))
        }

        /** An enum containing [LowBalanceNotificationFrequency]'s known values. */
        enum class Known {
            _2,
            _4,
            _12,
            _24,
        }

        /**
         * An enum containing [LowBalanceNotificationFrequency]'s known values, as well as an
         * [_UNKNOWN] member.
         *
         * An instance of [LowBalanceNotificationFrequency] can contain an unknown value in a couple
         * of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            _2,
            _4,
            _12,
            _24,
            /**
             * An enum member indicating that [LowBalanceNotificationFrequency] was instantiated
             * with an unknown value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                _2 -> Value._2
                _4 -> Value._4
                _12 -> Value._12
                _24 -> Value._24
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws TelnyxInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                _2 -> Known._2
                _4 -> Known._4
                _12 -> Known._12
                _24 -> Known._24
                else ->
                    throw TelnyxInvalidDataException(
                        "Unknown LowBalanceNotificationFrequency: $value"
                    )
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * @throws TelnyxInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asLong(): Long =
            _value().asNumber().getOrNull()?.let {
                if (it.toDouble() % 1 == 0.0) it.toLong() else null
            } ?: throw TelnyxInvalidDataException("Value is not a Long")

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): LowBalanceNotificationFrequency = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: TelnyxInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is LowBalanceNotificationFrequency && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** User interface theme: 0 for dark or 1 for light. */
    class UiTheme @JsonCreator private constructor(private val value: JsonField<Long>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<Long> = value

        companion object {

            @JvmField val _0 = of(0L)

            @JvmField val _1 = of(1L)

            @JvmStatic fun of(value: Long) = UiTheme(JsonField.of(value))
        }

        /** An enum containing [UiTheme]'s known values. */
        enum class Known {
            _0,
            _1,
        }

        /**
         * An enum containing [UiTheme]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [UiTheme] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            _0,
            _1,
            /** An enum member indicating that [UiTheme] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                _0 -> Value._0
                _1 -> Value._1
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws TelnyxInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                _0 -> Known._0
                _1 -> Known._1
                else -> throw TelnyxInvalidDataException("Unknown UiTheme: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * @throws TelnyxInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asLong(): Long =
            _value().asNumber().getOrNull()?.let {
                if (it.toDouble() % 1 == 0.0) it.toLong() else null
            } ?: throw TelnyxInvalidDataException("Value is not a Long")

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): UiTheme = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: TelnyxInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is UiTheme && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UserProfilePatchAllParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "UserProfilePatchAllParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
