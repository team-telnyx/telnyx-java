// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messagingtollfree.verification.requests

import com.fasterxml.jackson.annotation.JsonCreator
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.errors.TelnyxInvalidDataException

/** Tollfree usecase categories */
class UseCaseCategories @JsonCreator private constructor(private val value: JsonField<String>) :
    Enum {

    /**
     * Returns this class instance's raw value.
     *
     * This is usually only useful if this instance was deserialized from data that doesn't match
     * any known member, and you want to know that value. For example, if the SDK is on an older
     * version than the API, then the API may respond with new members that the SDK is unaware of.
     */
    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    companion object {

        @JvmField val _2_FA = of("2FA")

        @JvmField val APP_NOTIFICATIONS = of("App Notifications")

        @JvmField val APPOINTMENTS = of("Appointments")

        @JvmField val AUCTIONS = of("Auctions")

        @JvmField val AUTO_REPAIR_SERVICES = of("Auto Repair Services")

        @JvmField val BANK_TRANSFERS = of("Bank Transfers")

        @JvmField val BILLING = of("Billing")

        @JvmField val BOOKING_CONFIRMATIONS = of("Booking Confirmations")

        @JvmField val BUSINESS_UPDATES = of("Business Updates")

        @JvmField val COVID_19_ALERTS = of("COVID-19 Alerts")

        @JvmField val CAREER_TRAINING = of("Career Training")

        @JvmField val CHATBOT = of("Chatbot")

        @JvmField val CONVERSATIONAL_ALERTS = of("Conversational / Alerts")

        @JvmField val COURIER_SERVICES_DELIVERIES = of("Courier Services & Deliveries")

        @JvmField val EMERGENCY_ALERTS = of("Emergency Alerts")

        @JvmField val EVENTS_PLANNING = of("Events & Planning")

        @JvmField val FINANCIAL_SERVICES = of("Financial Services")

        @JvmField val FRAUD_ALERTS = of("Fraud Alerts")

        @JvmField val FUNDRAISING = of("Fundraising")

        @JvmField val GENERAL_MARKETING = of("General Marketing")

        @JvmField val GENERAL_SCHOOL_UPDATES = of("General School Updates")

        @JvmField val HR_STAFFING = of("HR / Staffing")

        @JvmField val HEALTHCARE_ALERTS = of("Healthcare Alerts")

        @JvmField val HOUSING_COMMUNITY_UPDATES = of("Housing Community Updates")

        @JvmField val INSURANCE_SERVICES = of("Insurance Services")

        @JvmField val JOB_DISPATCH = of("Job Dispatch")

        @JvmField val LEGAL_SERVICES = of("Legal Services")

        @JvmField val MIXED = of("Mixed")

        @JvmField val MOTIVATIONAL_REMINDERS = of("Motivational Reminders")

        @JvmField val NOTARY_NOTIFICATIONS = of("Notary Notifications")

        @JvmField val ORDER_NOTIFICATIONS = of("Order Notifications")

        @JvmField val POLITICAL = of("Political")

        @JvmField val PUBLIC_WORKS = of("Public Works")

        @JvmField val REAL_ESTATE_SERVICES = of("Real Estate Services")

        @JvmField val RELIGIOUS_SERVICES = of("Religious Services")

        @JvmField val REPAIR_AND_DIAGNOSTICS_ALERTS = of("Repair and Diagnostics Alerts")

        @JvmField val REWARDS_PROGRAM = of("Rewards Program")

        @JvmField val SURVEYS = of("Surveys")

        @JvmField val SYSTEM_ALERTS = of("System Alerts")

        @JvmField val VOTING_REMINDERS = of("Voting Reminders")

        @JvmField val WAITLIST_ALERTS = of("Waitlist Alerts")

        @JvmField val WEBINAR_REMINDERS = of("Webinar Reminders")

        @JvmField val WORKSHOP_ALERTS = of("Workshop Alerts")

        @JvmStatic fun of(value: String) = UseCaseCategories(JsonField.of(value))
    }

    /** An enum containing [UseCaseCategories]'s known values. */
    enum class Known {
        _2_FA,
        APP_NOTIFICATIONS,
        APPOINTMENTS,
        AUCTIONS,
        AUTO_REPAIR_SERVICES,
        BANK_TRANSFERS,
        BILLING,
        BOOKING_CONFIRMATIONS,
        BUSINESS_UPDATES,
        COVID_19_ALERTS,
        CAREER_TRAINING,
        CHATBOT,
        CONVERSATIONAL_ALERTS,
        COURIER_SERVICES_DELIVERIES,
        EMERGENCY_ALERTS,
        EVENTS_PLANNING,
        FINANCIAL_SERVICES,
        FRAUD_ALERTS,
        FUNDRAISING,
        GENERAL_MARKETING,
        GENERAL_SCHOOL_UPDATES,
        HR_STAFFING,
        HEALTHCARE_ALERTS,
        HOUSING_COMMUNITY_UPDATES,
        INSURANCE_SERVICES,
        JOB_DISPATCH,
        LEGAL_SERVICES,
        MIXED,
        MOTIVATIONAL_REMINDERS,
        NOTARY_NOTIFICATIONS,
        ORDER_NOTIFICATIONS,
        POLITICAL,
        PUBLIC_WORKS,
        REAL_ESTATE_SERVICES,
        RELIGIOUS_SERVICES,
        REPAIR_AND_DIAGNOSTICS_ALERTS,
        REWARDS_PROGRAM,
        SURVEYS,
        SYSTEM_ALERTS,
        VOTING_REMINDERS,
        WAITLIST_ALERTS,
        WEBINAR_REMINDERS,
        WORKSHOP_ALERTS,
    }

    /**
     * An enum containing [UseCaseCategories]'s known values, as well as an [_UNKNOWN] member.
     *
     * An instance of [UseCaseCategories] can contain an unknown value in a couple of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        _2_FA,
        APP_NOTIFICATIONS,
        APPOINTMENTS,
        AUCTIONS,
        AUTO_REPAIR_SERVICES,
        BANK_TRANSFERS,
        BILLING,
        BOOKING_CONFIRMATIONS,
        BUSINESS_UPDATES,
        COVID_19_ALERTS,
        CAREER_TRAINING,
        CHATBOT,
        CONVERSATIONAL_ALERTS,
        COURIER_SERVICES_DELIVERIES,
        EMERGENCY_ALERTS,
        EVENTS_PLANNING,
        FINANCIAL_SERVICES,
        FRAUD_ALERTS,
        FUNDRAISING,
        GENERAL_MARKETING,
        GENERAL_SCHOOL_UPDATES,
        HR_STAFFING,
        HEALTHCARE_ALERTS,
        HOUSING_COMMUNITY_UPDATES,
        INSURANCE_SERVICES,
        JOB_DISPATCH,
        LEGAL_SERVICES,
        MIXED,
        MOTIVATIONAL_REMINDERS,
        NOTARY_NOTIFICATIONS,
        ORDER_NOTIFICATIONS,
        POLITICAL,
        PUBLIC_WORKS,
        REAL_ESTATE_SERVICES,
        RELIGIOUS_SERVICES,
        REPAIR_AND_DIAGNOSTICS_ALERTS,
        REWARDS_PROGRAM,
        SURVEYS,
        SYSTEM_ALERTS,
        VOTING_REMINDERS,
        WAITLIST_ALERTS,
        WEBINAR_REMINDERS,
        WORKSHOP_ALERTS,
        /**
         * An enum member indicating that [UseCaseCategories] was instantiated with an unknown
         * value.
         */
        _UNKNOWN,
    }

    /**
     * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN] if
     * the class was instantiated with an unknown value.
     *
     * Use the [known] method instead if you're certain the value is always known or if you want to
     * throw for the unknown case.
     */
    fun value(): Value =
        when (this) {
            _2_FA -> Value._2_FA
            APP_NOTIFICATIONS -> Value.APP_NOTIFICATIONS
            APPOINTMENTS -> Value.APPOINTMENTS
            AUCTIONS -> Value.AUCTIONS
            AUTO_REPAIR_SERVICES -> Value.AUTO_REPAIR_SERVICES
            BANK_TRANSFERS -> Value.BANK_TRANSFERS
            BILLING -> Value.BILLING
            BOOKING_CONFIRMATIONS -> Value.BOOKING_CONFIRMATIONS
            BUSINESS_UPDATES -> Value.BUSINESS_UPDATES
            COVID_19_ALERTS -> Value.COVID_19_ALERTS
            CAREER_TRAINING -> Value.CAREER_TRAINING
            CHATBOT -> Value.CHATBOT
            CONVERSATIONAL_ALERTS -> Value.CONVERSATIONAL_ALERTS
            COURIER_SERVICES_DELIVERIES -> Value.COURIER_SERVICES_DELIVERIES
            EMERGENCY_ALERTS -> Value.EMERGENCY_ALERTS
            EVENTS_PLANNING -> Value.EVENTS_PLANNING
            FINANCIAL_SERVICES -> Value.FINANCIAL_SERVICES
            FRAUD_ALERTS -> Value.FRAUD_ALERTS
            FUNDRAISING -> Value.FUNDRAISING
            GENERAL_MARKETING -> Value.GENERAL_MARKETING
            GENERAL_SCHOOL_UPDATES -> Value.GENERAL_SCHOOL_UPDATES
            HR_STAFFING -> Value.HR_STAFFING
            HEALTHCARE_ALERTS -> Value.HEALTHCARE_ALERTS
            HOUSING_COMMUNITY_UPDATES -> Value.HOUSING_COMMUNITY_UPDATES
            INSURANCE_SERVICES -> Value.INSURANCE_SERVICES
            JOB_DISPATCH -> Value.JOB_DISPATCH
            LEGAL_SERVICES -> Value.LEGAL_SERVICES
            MIXED -> Value.MIXED
            MOTIVATIONAL_REMINDERS -> Value.MOTIVATIONAL_REMINDERS
            NOTARY_NOTIFICATIONS -> Value.NOTARY_NOTIFICATIONS
            ORDER_NOTIFICATIONS -> Value.ORDER_NOTIFICATIONS
            POLITICAL -> Value.POLITICAL
            PUBLIC_WORKS -> Value.PUBLIC_WORKS
            REAL_ESTATE_SERVICES -> Value.REAL_ESTATE_SERVICES
            RELIGIOUS_SERVICES -> Value.RELIGIOUS_SERVICES
            REPAIR_AND_DIAGNOSTICS_ALERTS -> Value.REPAIR_AND_DIAGNOSTICS_ALERTS
            REWARDS_PROGRAM -> Value.REWARDS_PROGRAM
            SURVEYS -> Value.SURVEYS
            SYSTEM_ALERTS -> Value.SYSTEM_ALERTS
            VOTING_REMINDERS -> Value.VOTING_REMINDERS
            WAITLIST_ALERTS -> Value.WAITLIST_ALERTS
            WEBINAR_REMINDERS -> Value.WEBINAR_REMINDERS
            WORKSHOP_ALERTS -> Value.WORKSHOP_ALERTS
            else -> Value._UNKNOWN
        }

    /**
     * Returns an enum member corresponding to this class instance's value.
     *
     * Use the [value] method instead if you're uncertain the value is always known and don't want
     * to throw for the unknown case.
     *
     * @throws TelnyxInvalidDataException if this class instance's value is a not a known member.
     */
    fun known(): Known =
        when (this) {
            _2_FA -> Known._2_FA
            APP_NOTIFICATIONS -> Known.APP_NOTIFICATIONS
            APPOINTMENTS -> Known.APPOINTMENTS
            AUCTIONS -> Known.AUCTIONS
            AUTO_REPAIR_SERVICES -> Known.AUTO_REPAIR_SERVICES
            BANK_TRANSFERS -> Known.BANK_TRANSFERS
            BILLING -> Known.BILLING
            BOOKING_CONFIRMATIONS -> Known.BOOKING_CONFIRMATIONS
            BUSINESS_UPDATES -> Known.BUSINESS_UPDATES
            COVID_19_ALERTS -> Known.COVID_19_ALERTS
            CAREER_TRAINING -> Known.CAREER_TRAINING
            CHATBOT -> Known.CHATBOT
            CONVERSATIONAL_ALERTS -> Known.CONVERSATIONAL_ALERTS
            COURIER_SERVICES_DELIVERIES -> Known.COURIER_SERVICES_DELIVERIES
            EMERGENCY_ALERTS -> Known.EMERGENCY_ALERTS
            EVENTS_PLANNING -> Known.EVENTS_PLANNING
            FINANCIAL_SERVICES -> Known.FINANCIAL_SERVICES
            FRAUD_ALERTS -> Known.FRAUD_ALERTS
            FUNDRAISING -> Known.FUNDRAISING
            GENERAL_MARKETING -> Known.GENERAL_MARKETING
            GENERAL_SCHOOL_UPDATES -> Known.GENERAL_SCHOOL_UPDATES
            HR_STAFFING -> Known.HR_STAFFING
            HEALTHCARE_ALERTS -> Known.HEALTHCARE_ALERTS
            HOUSING_COMMUNITY_UPDATES -> Known.HOUSING_COMMUNITY_UPDATES
            INSURANCE_SERVICES -> Known.INSURANCE_SERVICES
            JOB_DISPATCH -> Known.JOB_DISPATCH
            LEGAL_SERVICES -> Known.LEGAL_SERVICES
            MIXED -> Known.MIXED
            MOTIVATIONAL_REMINDERS -> Known.MOTIVATIONAL_REMINDERS
            NOTARY_NOTIFICATIONS -> Known.NOTARY_NOTIFICATIONS
            ORDER_NOTIFICATIONS -> Known.ORDER_NOTIFICATIONS
            POLITICAL -> Known.POLITICAL
            PUBLIC_WORKS -> Known.PUBLIC_WORKS
            REAL_ESTATE_SERVICES -> Known.REAL_ESTATE_SERVICES
            RELIGIOUS_SERVICES -> Known.RELIGIOUS_SERVICES
            REPAIR_AND_DIAGNOSTICS_ALERTS -> Known.REPAIR_AND_DIAGNOSTICS_ALERTS
            REWARDS_PROGRAM -> Known.REWARDS_PROGRAM
            SURVEYS -> Known.SURVEYS
            SYSTEM_ALERTS -> Known.SYSTEM_ALERTS
            VOTING_REMINDERS -> Known.VOTING_REMINDERS
            WAITLIST_ALERTS -> Known.WAITLIST_ALERTS
            WEBINAR_REMINDERS -> Known.WEBINAR_REMINDERS
            WORKSHOP_ALERTS -> Known.WORKSHOP_ALERTS
            else -> throw TelnyxInvalidDataException("Unknown UseCaseCategories: $value")
        }

    /**
     * Returns this class instance's primitive wire representation.
     *
     * This differs from the [toString] method because that method is primarily for debugging and
     * generally doesn't throw.
     *
     * @throws TelnyxInvalidDataException if this class instance's value does not have the expected
     *   primitive type.
     */
    fun asString(): String =
        _value().asString().orElseThrow { TelnyxInvalidDataException("Value is not a String") }

    private var validated: Boolean = false

    fun validate(): UseCaseCategories = apply {
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UseCaseCategories && value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
