// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.portingorders

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class PortingOrderActivationSettings
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val activationStatus: JsonField<ActivationStatus>,
    private val fastPortEligible: JsonField<Boolean>,
    private val focDatetimeActual: JsonField<OffsetDateTime>,
    private val focDatetimeRequested: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("activation_status")
        @ExcludeMissing
        activationStatus: JsonField<ActivationStatus> = JsonMissing.of(),
        @JsonProperty("fast_port_eligible")
        @ExcludeMissing
        fastPortEligible: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("foc_datetime_actual")
        @ExcludeMissing
        focDatetimeActual: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("foc_datetime_requested")
        @ExcludeMissing
        focDatetimeRequested: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        activationStatus,
        fastPortEligible,
        focDatetimeActual,
        focDatetimeRequested,
        mutableMapOf(),
    )

    /**
     * Activation status
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun activationStatus(): Optional<ActivationStatus> =
        activationStatus.getOptional("activation_status")

    /**
     * Indicates whether this porting order is eligible for FastPort
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun fastPortEligible(): Optional<Boolean> = fastPortEligible.getOptional("fast_port_eligible")

    /**
     * ISO 8601 formatted Date/Time of the FOC date
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun focDatetimeActual(): Optional<OffsetDateTime> =
        focDatetimeActual.getOptional("foc_datetime_actual")

    /**
     * ISO 8601 formatted Date/Time requested for the FOC date
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun focDatetimeRequested(): Optional<OffsetDateTime> =
        focDatetimeRequested.getOptional("foc_datetime_requested")

    /**
     * Returns the raw JSON value of [activationStatus].
     *
     * Unlike [activationStatus], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("activation_status")
    @ExcludeMissing
    fun _activationStatus(): JsonField<ActivationStatus> = activationStatus

    /**
     * Returns the raw JSON value of [fastPortEligible].
     *
     * Unlike [fastPortEligible], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("fast_port_eligible")
    @ExcludeMissing
    fun _fastPortEligible(): JsonField<Boolean> = fastPortEligible

    /**
     * Returns the raw JSON value of [focDatetimeActual].
     *
     * Unlike [focDatetimeActual], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("foc_datetime_actual")
    @ExcludeMissing
    fun _focDatetimeActual(): JsonField<OffsetDateTime> = focDatetimeActual

    /**
     * Returns the raw JSON value of [focDatetimeRequested].
     *
     * Unlike [focDatetimeRequested], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("foc_datetime_requested")
    @ExcludeMissing
    fun _focDatetimeRequested(): JsonField<OffsetDateTime> = focDatetimeRequested

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
         * [PortingOrderActivationSettings].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PortingOrderActivationSettings]. */
    class Builder internal constructor() {

        private var activationStatus: JsonField<ActivationStatus> = JsonMissing.of()
        private var fastPortEligible: JsonField<Boolean> = JsonMissing.of()
        private var focDatetimeActual: JsonField<OffsetDateTime> = JsonMissing.of()
        private var focDatetimeRequested: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(portingOrderActivationSettings: PortingOrderActivationSettings) = apply {
            activationStatus = portingOrderActivationSettings.activationStatus
            fastPortEligible = portingOrderActivationSettings.fastPortEligible
            focDatetimeActual = portingOrderActivationSettings.focDatetimeActual
            focDatetimeRequested = portingOrderActivationSettings.focDatetimeRequested
            additionalProperties =
                portingOrderActivationSettings.additionalProperties.toMutableMap()
        }

        /** Activation status */
        fun activationStatus(activationStatus: ActivationStatus?) =
            activationStatus(JsonField.ofNullable(activationStatus))

        /** Alias for calling [Builder.activationStatus] with `activationStatus.orElse(null)`. */
        fun activationStatus(activationStatus: Optional<ActivationStatus>) =
            activationStatus(activationStatus.getOrNull())

        /**
         * Sets [Builder.activationStatus] to an arbitrary JSON value.
         *
         * You should usually call [Builder.activationStatus] with a well-typed [ActivationStatus]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun activationStatus(activationStatus: JsonField<ActivationStatus>) = apply {
            this.activationStatus = activationStatus
        }

        /** Indicates whether this porting order is eligible for FastPort */
        fun fastPortEligible(fastPortEligible: Boolean) =
            fastPortEligible(JsonField.of(fastPortEligible))

        /**
         * Sets [Builder.fastPortEligible] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fastPortEligible] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun fastPortEligible(fastPortEligible: JsonField<Boolean>) = apply {
            this.fastPortEligible = fastPortEligible
        }

        /** ISO 8601 formatted Date/Time of the FOC date */
        fun focDatetimeActual(focDatetimeActual: OffsetDateTime?) =
            focDatetimeActual(JsonField.ofNullable(focDatetimeActual))

        /** Alias for calling [Builder.focDatetimeActual] with `focDatetimeActual.orElse(null)`. */
        fun focDatetimeActual(focDatetimeActual: Optional<OffsetDateTime>) =
            focDatetimeActual(focDatetimeActual.getOrNull())

        /**
         * Sets [Builder.focDatetimeActual] to an arbitrary JSON value.
         *
         * You should usually call [Builder.focDatetimeActual] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun focDatetimeActual(focDatetimeActual: JsonField<OffsetDateTime>) = apply {
            this.focDatetimeActual = focDatetimeActual
        }

        /** ISO 8601 formatted Date/Time requested for the FOC date */
        fun focDatetimeRequested(focDatetimeRequested: OffsetDateTime?) =
            focDatetimeRequested(JsonField.ofNullable(focDatetimeRequested))

        /**
         * Alias for calling [Builder.focDatetimeRequested] with
         * `focDatetimeRequested.orElse(null)`.
         */
        fun focDatetimeRequested(focDatetimeRequested: Optional<OffsetDateTime>) =
            focDatetimeRequested(focDatetimeRequested.getOrNull())

        /**
         * Sets [Builder.focDatetimeRequested] to an arbitrary JSON value.
         *
         * You should usually call [Builder.focDatetimeRequested] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun focDatetimeRequested(focDatetimeRequested: JsonField<OffsetDateTime>) = apply {
            this.focDatetimeRequested = focDatetimeRequested
        }

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
         * Returns an immutable instance of [PortingOrderActivationSettings].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): PortingOrderActivationSettings =
            PortingOrderActivationSettings(
                activationStatus,
                fastPortEligible,
                focDatetimeActual,
                focDatetimeRequested,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PortingOrderActivationSettings = apply {
        if (validated) {
            return@apply
        }

        activationStatus().ifPresent { it.validate() }
        fastPortEligible()
        focDatetimeActual()
        focDatetimeRequested()
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
        (activationStatus.asKnown().getOrNull()?.validity() ?: 0) +
            (if (fastPortEligible.asKnown().isPresent) 1 else 0) +
            (if (focDatetimeActual.asKnown().isPresent) 1 else 0) +
            (if (focDatetimeRequested.asKnown().isPresent) 1 else 0)

    /** Activation status */
    class ActivationStatus @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val NEW = of("New")

            @JvmField val PENDING = of("Pending")

            @JvmField val CONFLICT = of("Conflict")

            @JvmField val CANCEL_PENDING = of("Cancel Pending")

            @JvmField val FAILED = of("Failed")

            @JvmField val CONCURRED = of("Concurred")

            @JvmField val ACTIVATE_RDY = of("Activate RDY")

            @JvmField val DISCONNECT_PENDING = of("Disconnect Pending")

            @JvmField val CONCURRENCE_SENT = of("Concurrence Sent")

            @JvmField val OLD = of("Old")

            @JvmField val SENDING = of("Sending")

            @JvmField val ACTIVE = of("Active")

            @JvmField val CANCELLED = of("Cancelled")

            @JvmStatic fun of(value: String) = ActivationStatus(JsonField.of(value))
        }

        /** An enum containing [ActivationStatus]'s known values. */
        enum class Known {
            NEW,
            PENDING,
            CONFLICT,
            CANCEL_PENDING,
            FAILED,
            CONCURRED,
            ACTIVATE_RDY,
            DISCONNECT_PENDING,
            CONCURRENCE_SENT,
            OLD,
            SENDING,
            ACTIVE,
            CANCELLED,
        }

        /**
         * An enum containing [ActivationStatus]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ActivationStatus] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            NEW,
            PENDING,
            CONFLICT,
            CANCEL_PENDING,
            FAILED,
            CONCURRED,
            ACTIVATE_RDY,
            DISCONNECT_PENDING,
            CONCURRENCE_SENT,
            OLD,
            SENDING,
            ACTIVE,
            CANCELLED,
            /**
             * An enum member indicating that [ActivationStatus] was instantiated with an unknown
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
                NEW -> Value.NEW
                PENDING -> Value.PENDING
                CONFLICT -> Value.CONFLICT
                CANCEL_PENDING -> Value.CANCEL_PENDING
                FAILED -> Value.FAILED
                CONCURRED -> Value.CONCURRED
                ACTIVATE_RDY -> Value.ACTIVATE_RDY
                DISCONNECT_PENDING -> Value.DISCONNECT_PENDING
                CONCURRENCE_SENT -> Value.CONCURRENCE_SENT
                OLD -> Value.OLD
                SENDING -> Value.SENDING
                ACTIVE -> Value.ACTIVE
                CANCELLED -> Value.CANCELLED
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
                NEW -> Known.NEW
                PENDING -> Known.PENDING
                CONFLICT -> Known.CONFLICT
                CANCEL_PENDING -> Known.CANCEL_PENDING
                FAILED -> Known.FAILED
                CONCURRED -> Known.CONCURRED
                ACTIVATE_RDY -> Known.ACTIVATE_RDY
                DISCONNECT_PENDING -> Known.DISCONNECT_PENDING
                CONCURRENCE_SENT -> Known.CONCURRENCE_SENT
                OLD -> Known.OLD
                SENDING -> Known.SENDING
                ACTIVE -> Known.ACTIVE
                CANCELLED -> Known.CANCELLED
                else -> throw TelnyxInvalidDataException("Unknown ActivationStatus: $value")
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

        fun validate(): ActivationStatus = apply {
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

            return other is ActivationStatus && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PortingOrderActivationSettings &&
            activationStatus == other.activationStatus &&
            fastPortEligible == other.fastPortEligible &&
            focDatetimeActual == other.focDatetimeActual &&
            focDatetimeRequested == other.focDatetimeRequested &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            activationStatus,
            fastPortEligible,
            focDatetimeActual,
            focDatetimeRequested,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PortingOrderActivationSettings{activationStatus=$activationStatus, fastPortEligible=$fastPortEligible, focDatetimeActual=$focDatetimeActual, focDatetimeRequested=$focDatetimeRequested, additionalProperties=$additionalProperties}"
}
