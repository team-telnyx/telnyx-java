// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.externalconnections.phonenumbers

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.api.core.Enum
import com.telnyx.api.core.ExcludeMissing
import com.telnyx.api.core.JsonField
import com.telnyx.api.core.JsonMissing
import com.telnyx.api.core.JsonValue
import com.telnyx.api.core.checkKnown
import com.telnyx.api.core.toImmutable
import com.telnyx.api.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ExternalConnectionPhoneNumber
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val acquiredCapabilities: JsonField<List<AcquiredCapability>>,
    private val civicAddressId: JsonField<String>,
    private val displayedCountryCode: JsonField<String>,
    private val locationId: JsonField<String>,
    private val numberId: JsonField<String>,
    private val telephoneNumber: JsonField<String>,
    private val ticketId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("acquired_capabilities")
        @ExcludeMissing
        acquiredCapabilities: JsonField<List<AcquiredCapability>> = JsonMissing.of(),
        @JsonProperty("civic_address_id")
        @ExcludeMissing
        civicAddressId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("displayed_country_code")
        @ExcludeMissing
        displayedCountryCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("location_id")
        @ExcludeMissing
        locationId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("number_id") @ExcludeMissing numberId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("telephone_number")
        @ExcludeMissing
        telephoneNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ticket_id") @ExcludeMissing ticketId: JsonField<String> = JsonMissing.of(),
    ) : this(
        acquiredCapabilities,
        civicAddressId,
        displayedCountryCode,
        locationId,
        numberId,
        telephoneNumber,
        ticketId,
        mutableMapOf(),
    )

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun acquiredCapabilities(): Optional<List<AcquiredCapability>> =
        acquiredCapabilities.getOptional("acquired_capabilities")

    /**
     * Identifies the civic address assigned to the phone number.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun civicAddressId(): Optional<String> = civicAddressId.getOptional("civic_address_id")

    /**
     * The iso country code that will be displayed to the user when they receive a call from this
     * phone number.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun displayedCountryCode(): Optional<String> =
        displayedCountryCode.getOptional("displayed_country_code")

    /**
     * Identifies the location assigned to the phone number.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun locationId(): Optional<String> = locationId.getOptional("location_id")

    /**
     * Phone number ID from the Telnyx API.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun numberId(): Optional<String> = numberId.getOptional("number_id")

    /**
     * Phone number in E164 format.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun telephoneNumber(): Optional<String> = telephoneNumber.getOptional("telephone_number")

    /**
     * Uniquely identifies the resource.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun ticketId(): Optional<String> = ticketId.getOptional("ticket_id")

    /**
     * Returns the raw JSON value of [acquiredCapabilities].
     *
     * Unlike [acquiredCapabilities], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("acquired_capabilities")
    @ExcludeMissing
    fun _acquiredCapabilities(): JsonField<List<AcquiredCapability>> = acquiredCapabilities

    /**
     * Returns the raw JSON value of [civicAddressId].
     *
     * Unlike [civicAddressId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("civic_address_id")
    @ExcludeMissing
    fun _civicAddressId(): JsonField<String> = civicAddressId

    /**
     * Returns the raw JSON value of [displayedCountryCode].
     *
     * Unlike [displayedCountryCode], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("displayed_country_code")
    @ExcludeMissing
    fun _displayedCountryCode(): JsonField<String> = displayedCountryCode

    /**
     * Returns the raw JSON value of [locationId].
     *
     * Unlike [locationId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("location_id") @ExcludeMissing fun _locationId(): JsonField<String> = locationId

    /**
     * Returns the raw JSON value of [numberId].
     *
     * Unlike [numberId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("number_id") @ExcludeMissing fun _numberId(): JsonField<String> = numberId

    /**
     * Returns the raw JSON value of [telephoneNumber].
     *
     * Unlike [telephoneNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("telephone_number")
    @ExcludeMissing
    fun _telephoneNumber(): JsonField<String> = telephoneNumber

    /**
     * Returns the raw JSON value of [ticketId].
     *
     * Unlike [ticketId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ticket_id") @ExcludeMissing fun _ticketId(): JsonField<String> = ticketId

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

        /**
         * Returns a mutable builder for constructing an instance of
         * [ExternalConnectionPhoneNumber].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ExternalConnectionPhoneNumber]. */
    class Builder internal constructor() {

        private var acquiredCapabilities: JsonField<MutableList<AcquiredCapability>>? = null
        private var civicAddressId: JsonField<String> = JsonMissing.of()
        private var displayedCountryCode: JsonField<String> = JsonMissing.of()
        private var locationId: JsonField<String> = JsonMissing.of()
        private var numberId: JsonField<String> = JsonMissing.of()
        private var telephoneNumber: JsonField<String> = JsonMissing.of()
        private var ticketId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(externalConnectionPhoneNumber: ExternalConnectionPhoneNumber) = apply {
            acquiredCapabilities =
                externalConnectionPhoneNumber.acquiredCapabilities.map { it.toMutableList() }
            civicAddressId = externalConnectionPhoneNumber.civicAddressId
            displayedCountryCode = externalConnectionPhoneNumber.displayedCountryCode
            locationId = externalConnectionPhoneNumber.locationId
            numberId = externalConnectionPhoneNumber.numberId
            telephoneNumber = externalConnectionPhoneNumber.telephoneNumber
            ticketId = externalConnectionPhoneNumber.ticketId
            additionalProperties = externalConnectionPhoneNumber.additionalProperties.toMutableMap()
        }

        fun acquiredCapabilities(acquiredCapabilities: List<AcquiredCapability>) =
            acquiredCapabilities(JsonField.of(acquiredCapabilities))

        /**
         * Sets [Builder.acquiredCapabilities] to an arbitrary JSON value.
         *
         * You should usually call [Builder.acquiredCapabilities] with a well-typed
         * `List<AcquiredCapability>` value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun acquiredCapabilities(acquiredCapabilities: JsonField<List<AcquiredCapability>>) =
            apply {
                this.acquiredCapabilities = acquiredCapabilities.map { it.toMutableList() }
            }

        /**
         * Adds a single [AcquiredCapability] to [acquiredCapabilities].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAcquiredCapability(acquiredCapability: AcquiredCapability) = apply {
            acquiredCapabilities =
                (acquiredCapabilities ?: JsonField.of(mutableListOf())).also {
                    checkKnown("acquiredCapabilities", it).add(acquiredCapability)
                }
        }

        /** Identifies the civic address assigned to the phone number. */
        fun civicAddressId(civicAddressId: String) = civicAddressId(JsonField.of(civicAddressId))

        /**
         * Sets [Builder.civicAddressId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.civicAddressId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun civicAddressId(civicAddressId: JsonField<String>) = apply {
            this.civicAddressId = civicAddressId
        }

        /**
         * The iso country code that will be displayed to the user when they receive a call from
         * this phone number.
         */
        fun displayedCountryCode(displayedCountryCode: String) =
            displayedCountryCode(JsonField.of(displayedCountryCode))

        /**
         * Sets [Builder.displayedCountryCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.displayedCountryCode] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun displayedCountryCode(displayedCountryCode: JsonField<String>) = apply {
            this.displayedCountryCode = displayedCountryCode
        }

        /** Identifies the location assigned to the phone number. */
        fun locationId(locationId: String) = locationId(JsonField.of(locationId))

        /**
         * Sets [Builder.locationId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.locationId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun locationId(locationId: JsonField<String>) = apply { this.locationId = locationId }

        /** Phone number ID from the Telnyx API. */
        fun numberId(numberId: String) = numberId(JsonField.of(numberId))

        /**
         * Sets [Builder.numberId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.numberId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun numberId(numberId: JsonField<String>) = apply { this.numberId = numberId }

        /** Phone number in E164 format. */
        fun telephoneNumber(telephoneNumber: String) =
            telephoneNumber(JsonField.of(telephoneNumber))

        /**
         * Sets [Builder.telephoneNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.telephoneNumber] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun telephoneNumber(telephoneNumber: JsonField<String>) = apply {
            this.telephoneNumber = telephoneNumber
        }

        /** Uniquely identifies the resource. */
        fun ticketId(ticketId: String) = ticketId(JsonField.of(ticketId))

        /**
         * Sets [Builder.ticketId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ticketId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun ticketId(ticketId: JsonField<String>) = apply { this.ticketId = ticketId }

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
         * Returns an immutable instance of [ExternalConnectionPhoneNumber].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ExternalConnectionPhoneNumber =
            ExternalConnectionPhoneNumber(
                (acquiredCapabilities ?: JsonMissing.of()).map { it.toImmutable() },
                civicAddressId,
                displayedCountryCode,
                locationId,
                numberId,
                telephoneNumber,
                ticketId,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ExternalConnectionPhoneNumber = apply {
        if (validated) {
            return@apply
        }

        acquiredCapabilities().ifPresent { it.forEach { it.validate() } }
        civicAddressId()
        displayedCountryCode()
        locationId()
        numberId()
        telephoneNumber()
        ticketId()
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
    @JvmSynthetic
    internal fun validity(): Int =
        (acquiredCapabilities.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (civicAddressId.asKnown().isPresent) 1 else 0) +
            (if (displayedCountryCode.asKnown().isPresent) 1 else 0) +
            (if (locationId.asKnown().isPresent) 1 else 0) +
            (if (numberId.asKnown().isPresent) 1 else 0) +
            (if (telephoneNumber.asKnown().isPresent) 1 else 0) +
            (if (ticketId.asKnown().isPresent) 1 else 0)

    /** The capabilities that are available for this phone number on Microsoft Teams. */
    class AcquiredCapability
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val FIRST_PARTY_APP_ASSIGNMENT = of("FirstPartyAppAssignment")

            @JvmField val INBOUND_CALLING = of("InboundCalling")

            @JvmField val OFFICE365 = of("Office365")

            @JvmField val OUTBOUND_CALLING = of("OutboundCalling")

            @JvmField val USER_ASSIGNMENT = of("UserAssignment")

            @JvmStatic fun of(value: String) = AcquiredCapability(JsonField.of(value))
        }

        /** An enum containing [AcquiredCapability]'s known values. */
        enum class Known {
            FIRST_PARTY_APP_ASSIGNMENT,
            INBOUND_CALLING,
            OFFICE365,
            OUTBOUND_CALLING,
            USER_ASSIGNMENT,
        }

        /**
         * An enum containing [AcquiredCapability]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [AcquiredCapability] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            FIRST_PARTY_APP_ASSIGNMENT,
            INBOUND_CALLING,
            OFFICE365,
            OUTBOUND_CALLING,
            USER_ASSIGNMENT,
            /**
             * An enum member indicating that [AcquiredCapability] was instantiated with an unknown
             * value.
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
                FIRST_PARTY_APP_ASSIGNMENT -> Value.FIRST_PARTY_APP_ASSIGNMENT
                INBOUND_CALLING -> Value.INBOUND_CALLING
                OFFICE365 -> Value.OFFICE365
                OUTBOUND_CALLING -> Value.OUTBOUND_CALLING
                USER_ASSIGNMENT -> Value.USER_ASSIGNMENT
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
                FIRST_PARTY_APP_ASSIGNMENT -> Known.FIRST_PARTY_APP_ASSIGNMENT
                INBOUND_CALLING -> Known.INBOUND_CALLING
                OFFICE365 -> Known.OFFICE365
                OUTBOUND_CALLING -> Known.OUTBOUND_CALLING
                USER_ASSIGNMENT -> Known.USER_ASSIGNMENT
                else -> throw TelnyxInvalidDataException("Unknown AcquiredCapability: $value")
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

        fun validate(): AcquiredCapability = apply {
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

            return other is AcquiredCapability && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ExternalConnectionPhoneNumber &&
            acquiredCapabilities == other.acquiredCapabilities &&
            civicAddressId == other.civicAddressId &&
            displayedCountryCode == other.displayedCountryCode &&
            locationId == other.locationId &&
            numberId == other.numberId &&
            telephoneNumber == other.telephoneNumber &&
            ticketId == other.ticketId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            acquiredCapabilities,
            civicAddressId,
            displayedCountryCode,
            locationId,
            numberId,
            telephoneNumber,
            ticketId,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ExternalConnectionPhoneNumber{acquiredCapabilities=$acquiredCapabilities, civicAddressId=$civicAddressId, displayedCountryCode=$displayedCountryCode, locationId=$locationId, numberId=$numberId, telephoneNumber=$telephoneNumber, ticketId=$ticketId, additionalProperties=$additionalProperties}"
}
