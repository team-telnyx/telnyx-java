// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.portingorders

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.api.core.Enum
import com.telnyx.api.core.ExcludeMissing
import com.telnyx.api.core.JsonField
import com.telnyx.api.core.JsonMissing
import com.telnyx.api.core.JsonValue
import com.telnyx.api.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class PortingOrderMisc
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val newBillingPhoneNumber: JsonField<String>,
    private val remainingNumbersAction: JsonField<RemainingNumbersAction>,
    private val type: JsonField<PortingOrderType>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("new_billing_phone_number")
        @ExcludeMissing
        newBillingPhoneNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("remaining_numbers_action")
        @ExcludeMissing
        remainingNumbersAction: JsonField<RemainingNumbersAction> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<PortingOrderType> = JsonMissing.of(),
    ) : this(newBillingPhoneNumber, remainingNumbersAction, type, mutableMapOf())

    /**
     * New billing phone number for the remaining numbers. Used in case the current billing phone
     * number is being ported to Telnyx. This will be set on your account with your current service
     * provider and should be one of the numbers remaining on that account.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun newBillingPhoneNumber(): Optional<String> =
        newBillingPhoneNumber.getOptional("new_billing_phone_number")

    /**
     * Remaining numbers can be either kept with their current service provider or disconnected.
     * 'new_billing_telephone_number' is required when 'remaining_numbers_action' is 'keep'.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun remainingNumbersAction(): Optional<RemainingNumbersAction> =
        remainingNumbersAction.getOptional("remaining_numbers_action")

    /**
     * A port can be either 'full' or 'partial'. When type is 'full' the other attributes should be
     * omitted.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun type(): Optional<PortingOrderType> = type.getOptional("type")

    /**
     * Returns the raw JSON value of [newBillingPhoneNumber].
     *
     * Unlike [newBillingPhoneNumber], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("new_billing_phone_number")
    @ExcludeMissing
    fun _newBillingPhoneNumber(): JsonField<String> = newBillingPhoneNumber

    /**
     * Returns the raw JSON value of [remainingNumbersAction].
     *
     * Unlike [remainingNumbersAction], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("remaining_numbers_action")
    @ExcludeMissing
    fun _remainingNumbersAction(): JsonField<RemainingNumbersAction> = remainingNumbersAction

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<PortingOrderType> = type

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

        /** Returns a mutable builder for constructing an instance of [PortingOrderMisc]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PortingOrderMisc]. */
    class Builder internal constructor() {

        private var newBillingPhoneNumber: JsonField<String> = JsonMissing.of()
        private var remainingNumbersAction: JsonField<RemainingNumbersAction> = JsonMissing.of()
        private var type: JsonField<PortingOrderType> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(portingOrderMisc: PortingOrderMisc) = apply {
            newBillingPhoneNumber = portingOrderMisc.newBillingPhoneNumber
            remainingNumbersAction = portingOrderMisc.remainingNumbersAction
            type = portingOrderMisc.type
            additionalProperties = portingOrderMisc.additionalProperties.toMutableMap()
        }

        /**
         * New billing phone number for the remaining numbers. Used in case the current billing
         * phone number is being ported to Telnyx. This will be set on your account with your
         * current service provider and should be one of the numbers remaining on that account.
         */
        fun newBillingPhoneNumber(newBillingPhoneNumber: String) =
            newBillingPhoneNumber(JsonField.of(newBillingPhoneNumber))

        /**
         * Sets [Builder.newBillingPhoneNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.newBillingPhoneNumber] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun newBillingPhoneNumber(newBillingPhoneNumber: JsonField<String>) = apply {
            this.newBillingPhoneNumber = newBillingPhoneNumber
        }

        /**
         * Remaining numbers can be either kept with their current service provider or disconnected.
         * 'new_billing_telephone_number' is required when 'remaining_numbers_action' is 'keep'.
         */
        fun remainingNumbersAction(remainingNumbersAction: RemainingNumbersAction) =
            remainingNumbersAction(JsonField.of(remainingNumbersAction))

        /**
         * Sets [Builder.remainingNumbersAction] to an arbitrary JSON value.
         *
         * You should usually call [Builder.remainingNumbersAction] with a well-typed
         * [RemainingNumbersAction] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun remainingNumbersAction(remainingNumbersAction: JsonField<RemainingNumbersAction>) =
            apply {
                this.remainingNumbersAction = remainingNumbersAction
            }

        /**
         * A port can be either 'full' or 'partial'. When type is 'full' the other attributes should
         * be omitted.
         */
        fun type(type: PortingOrderType) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [PortingOrderType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun type(type: JsonField<PortingOrderType>) = apply { this.type = type }

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
         * Returns an immutable instance of [PortingOrderMisc].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): PortingOrderMisc =
            PortingOrderMisc(
                newBillingPhoneNumber,
                remainingNumbersAction,
                type,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PortingOrderMisc = apply {
        if (validated) {
            return@apply
        }

        newBillingPhoneNumber()
        remainingNumbersAction().ifPresent { it.validate() }
        type().ifPresent { it.validate() }
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
        (if (newBillingPhoneNumber.asKnown().isPresent) 1 else 0) +
            (remainingNumbersAction.asKnown().getOrNull()?.validity() ?: 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0)

    /**
     * Remaining numbers can be either kept with their current service provider or disconnected.
     * 'new_billing_telephone_number' is required when 'remaining_numbers_action' is 'keep'.
     */
    class RemainingNumbersAction
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

            @JvmField val KEEP = of("keep")

            @JvmField val DISCONNECT = of("disconnect")

            @JvmStatic fun of(value: String) = RemainingNumbersAction(JsonField.of(value))
        }

        /** An enum containing [RemainingNumbersAction]'s known values. */
        enum class Known {
            KEEP,
            DISCONNECT,
        }

        /**
         * An enum containing [RemainingNumbersAction]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [RemainingNumbersAction] can contain an unknown value in a couple of
         * cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            KEEP,
            DISCONNECT,
            /**
             * An enum member indicating that [RemainingNumbersAction] was instantiated with an
             * unknown value.
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
                KEEP -> Value.KEEP
                DISCONNECT -> Value.DISCONNECT
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
                KEEP -> Known.KEEP
                DISCONNECT -> Known.DISCONNECT
                else -> throw TelnyxInvalidDataException("Unknown RemainingNumbersAction: $value")
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

        fun validate(): RemainingNumbersAction = apply {
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

            return other is RemainingNumbersAction && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PortingOrderMisc &&
            newBillingPhoneNumber == other.newBillingPhoneNumber &&
            remainingNumbersAction == other.remainingNumbersAction &&
            type == other.type &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(newBillingPhoneNumber, remainingNumbersAction, type, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PortingOrderMisc{newBillingPhoneNumber=$newBillingPhoneNumber, remainingNumbersAction=$remainingNumbersAction, type=$type, additionalProperties=$additionalProperties}"
}
