// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models

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
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class PortingOrdersExceptionType
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val code: JsonField<Code>,
    private val description: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("code") @ExcludeMissing code: JsonField<Code> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
    ) : this(code, description, mutableMapOf())

    /**
     * Identifier of an exception type
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun code(): Optional<Code> = code.getOptional("code")

    /**
     * Description of an exception type
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<String> = description.getOptional("description")

    /**
     * Returns the raw JSON value of [code].
     *
     * Unlike [code], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<Code> = code

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

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
         * Returns a mutable builder for constructing an instance of [PortingOrdersExceptionType].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PortingOrdersExceptionType]. */
    class Builder internal constructor() {

        private var code: JsonField<Code> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(portingOrdersExceptionType: PortingOrdersExceptionType) = apply {
            code = portingOrdersExceptionType.code
            description = portingOrdersExceptionType.description
            additionalProperties = portingOrdersExceptionType.additionalProperties.toMutableMap()
        }

        /** Identifier of an exception type */
        fun code(code: Code) = code(JsonField.of(code))

        /**
         * Sets [Builder.code] to an arbitrary JSON value.
         *
         * You should usually call [Builder.code] with a well-typed [Code] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun code(code: JsonField<Code>) = apply { this.code = code }

        /** Description of an exception type */
        fun description(description: String) = description(JsonField.of(description))

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

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
         * Returns an immutable instance of [PortingOrdersExceptionType].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): PortingOrdersExceptionType =
            PortingOrdersExceptionType(code, description, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): PortingOrdersExceptionType = apply {
        if (validated) {
            return@apply
        }

        code().ifPresent { it.validate() }
        description()
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
        (code.asKnown().getOrNull()?.validity() ?: 0) +
            (if (description.asKnown().isPresent) 1 else 0)

    /** Identifier of an exception type */
    class Code @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val ACCOUNT_NUMBER_MISMATCH = of("ACCOUNT_NUMBER_MISMATCH")

            @JvmField val AUTH_PERSON_MISMATCH = of("AUTH_PERSON_MISMATCH")

            @JvmField val BTN_ATN_MISMATCH = of("BTN_ATN_MISMATCH")

            @JvmField val ENTITY_NAME_MISMATCH = of("ENTITY_NAME_MISMATCH")

            @JvmField val FOC_EXPIRED = of("FOC_EXPIRED")

            @JvmField val FOC_REJECTED = of("FOC_REJECTED")

            @JvmField val LOCATION_MISMATCH = of("LOCATION_MISMATCH")

            @JvmField val LSR_PENDING = of("LSR_PENDING")

            @JvmField val MAIN_BTN_PORTING = of("MAIN_BTN_PORTING")

            @JvmField val OSP_IRRESPONSIVE = of("OSP_IRRESPONSIVE")

            @JvmField val OTHER = of("OTHER")

            @JvmField val PASSCODE_PIN_INVALID = of("PASSCODE_PIN_INVALID")

            @JvmField val PHONE_NUMBER_HAS_SPECIAL_FEATURE = of("PHONE_NUMBER_HAS_SPECIAL_FEATURE")

            @JvmField val PHONE_NUMBER_MISMATCH = of("PHONE_NUMBER_MISMATCH")

            @JvmField val PHONE_NUMBER_NOT_PORTABLE = of("PHONE_NUMBER_NOT_PORTABLE")

            @JvmField val PORT_TYPE_INCORRECT = of("PORT_TYPE_INCORRECT")

            @JvmField val PORTING_ORDER_SPLIT_REQUIRED = of("PORTING_ORDER_SPLIT_REQUIRED")

            @JvmField val POSTAL_CODE_MISMATCH = of("POSTAL_CODE_MISMATCH")

            @JvmField val RATE_CENTER_NOT_PORTABLE = of("RATE_CENTER_NOT_PORTABLE")

            @JvmField val SV_CONFLICT = of("SV_CONFLICT")

            @JvmField val SV_UNKNOWN_FAILURE = of("SV_UNKNOWN_FAILURE")

            @JvmStatic fun of(value: String) = Code(JsonField.of(value))
        }

        /** An enum containing [Code]'s known values. */
        enum class Known {
            ACCOUNT_NUMBER_MISMATCH,
            AUTH_PERSON_MISMATCH,
            BTN_ATN_MISMATCH,
            ENTITY_NAME_MISMATCH,
            FOC_EXPIRED,
            FOC_REJECTED,
            LOCATION_MISMATCH,
            LSR_PENDING,
            MAIN_BTN_PORTING,
            OSP_IRRESPONSIVE,
            OTHER,
            PASSCODE_PIN_INVALID,
            PHONE_NUMBER_HAS_SPECIAL_FEATURE,
            PHONE_NUMBER_MISMATCH,
            PHONE_NUMBER_NOT_PORTABLE,
            PORT_TYPE_INCORRECT,
            PORTING_ORDER_SPLIT_REQUIRED,
            POSTAL_CODE_MISMATCH,
            RATE_CENTER_NOT_PORTABLE,
            SV_CONFLICT,
            SV_UNKNOWN_FAILURE,
        }

        /**
         * An enum containing [Code]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Code] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ACCOUNT_NUMBER_MISMATCH,
            AUTH_PERSON_MISMATCH,
            BTN_ATN_MISMATCH,
            ENTITY_NAME_MISMATCH,
            FOC_EXPIRED,
            FOC_REJECTED,
            LOCATION_MISMATCH,
            LSR_PENDING,
            MAIN_BTN_PORTING,
            OSP_IRRESPONSIVE,
            OTHER,
            PASSCODE_PIN_INVALID,
            PHONE_NUMBER_HAS_SPECIAL_FEATURE,
            PHONE_NUMBER_MISMATCH,
            PHONE_NUMBER_NOT_PORTABLE,
            PORT_TYPE_INCORRECT,
            PORTING_ORDER_SPLIT_REQUIRED,
            POSTAL_CODE_MISMATCH,
            RATE_CENTER_NOT_PORTABLE,
            SV_CONFLICT,
            SV_UNKNOWN_FAILURE,
            /** An enum member indicating that [Code] was instantiated with an unknown value. */
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
                ACCOUNT_NUMBER_MISMATCH -> Value.ACCOUNT_NUMBER_MISMATCH
                AUTH_PERSON_MISMATCH -> Value.AUTH_PERSON_MISMATCH
                BTN_ATN_MISMATCH -> Value.BTN_ATN_MISMATCH
                ENTITY_NAME_MISMATCH -> Value.ENTITY_NAME_MISMATCH
                FOC_EXPIRED -> Value.FOC_EXPIRED
                FOC_REJECTED -> Value.FOC_REJECTED
                LOCATION_MISMATCH -> Value.LOCATION_MISMATCH
                LSR_PENDING -> Value.LSR_PENDING
                MAIN_BTN_PORTING -> Value.MAIN_BTN_PORTING
                OSP_IRRESPONSIVE -> Value.OSP_IRRESPONSIVE
                OTHER -> Value.OTHER
                PASSCODE_PIN_INVALID -> Value.PASSCODE_PIN_INVALID
                PHONE_NUMBER_HAS_SPECIAL_FEATURE -> Value.PHONE_NUMBER_HAS_SPECIAL_FEATURE
                PHONE_NUMBER_MISMATCH -> Value.PHONE_NUMBER_MISMATCH
                PHONE_NUMBER_NOT_PORTABLE -> Value.PHONE_NUMBER_NOT_PORTABLE
                PORT_TYPE_INCORRECT -> Value.PORT_TYPE_INCORRECT
                PORTING_ORDER_SPLIT_REQUIRED -> Value.PORTING_ORDER_SPLIT_REQUIRED
                POSTAL_CODE_MISMATCH -> Value.POSTAL_CODE_MISMATCH
                RATE_CENTER_NOT_PORTABLE -> Value.RATE_CENTER_NOT_PORTABLE
                SV_CONFLICT -> Value.SV_CONFLICT
                SV_UNKNOWN_FAILURE -> Value.SV_UNKNOWN_FAILURE
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
                ACCOUNT_NUMBER_MISMATCH -> Known.ACCOUNT_NUMBER_MISMATCH
                AUTH_PERSON_MISMATCH -> Known.AUTH_PERSON_MISMATCH
                BTN_ATN_MISMATCH -> Known.BTN_ATN_MISMATCH
                ENTITY_NAME_MISMATCH -> Known.ENTITY_NAME_MISMATCH
                FOC_EXPIRED -> Known.FOC_EXPIRED
                FOC_REJECTED -> Known.FOC_REJECTED
                LOCATION_MISMATCH -> Known.LOCATION_MISMATCH
                LSR_PENDING -> Known.LSR_PENDING
                MAIN_BTN_PORTING -> Known.MAIN_BTN_PORTING
                OSP_IRRESPONSIVE -> Known.OSP_IRRESPONSIVE
                OTHER -> Known.OTHER
                PASSCODE_PIN_INVALID -> Known.PASSCODE_PIN_INVALID
                PHONE_NUMBER_HAS_SPECIAL_FEATURE -> Known.PHONE_NUMBER_HAS_SPECIAL_FEATURE
                PHONE_NUMBER_MISMATCH -> Known.PHONE_NUMBER_MISMATCH
                PHONE_NUMBER_NOT_PORTABLE -> Known.PHONE_NUMBER_NOT_PORTABLE
                PORT_TYPE_INCORRECT -> Known.PORT_TYPE_INCORRECT
                PORTING_ORDER_SPLIT_REQUIRED -> Known.PORTING_ORDER_SPLIT_REQUIRED
                POSTAL_CODE_MISMATCH -> Known.POSTAL_CODE_MISMATCH
                RATE_CENTER_NOT_PORTABLE -> Known.RATE_CENTER_NOT_PORTABLE
                SV_CONFLICT -> Known.SV_CONFLICT
                SV_UNKNOWN_FAILURE -> Known.SV_UNKNOWN_FAILURE
                else -> throw TelnyxInvalidDataException("Unknown Code: $value")
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

        fun validate(): Code = apply {
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

            return other is Code && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PortingOrdersExceptionType &&
            code == other.code &&
            description == other.description &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(code, description, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PortingOrdersExceptionType{code=$code, description=$description, additionalProperties=$additionalProperties}"
}
