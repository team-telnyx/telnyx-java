// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.privatewirelessgateways

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

/** The current status or failure details of the Private Wireless Gateway. */
class PrivateWirelessGatewayStatus
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val errorCode: JsonField<String>,
    private val errorDescription: JsonField<String>,
    private val value: JsonField<Value_>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("error_code") @ExcludeMissing errorCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("error_description")
        @ExcludeMissing
        errorDescription: JsonField<String> = JsonMissing.of(),
        @JsonProperty("value") @ExcludeMissing value: JsonField<Value_> = JsonMissing.of(),
    ) : this(errorCode, errorDescription, value, mutableMapOf())

    /**
     * This attribute is an [error code](https://developers.telnyx.com/api/errors) related to the
     * failure reason.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun errorCode(): Optional<String> = errorCode.getOptional("error_code")

    /**
     * This attribute provides a human-readable explanation of why a failure happened.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun errorDescription(): Optional<String> = errorDescription.getOptional("error_description")

    /**
     * The current status or failure details of the Private Wireless Gateway. <ul>
     * <li><code>provisioning</code> - the Private Wireless Gateway is being provisioned.</li>
     * <li><code>provisioned</code> - the Private Wireless Gateway was provisioned and able to
     *   receive connections.</li>
     * <li><code>failed</code> - the provisioning had failed for a reason and it requires an
     *   intervention.</li>
     * <li><code>decommissioning</code> - the Private Wireless Gateway is being removed from the
     *   network.</li> </ul> Transitioning between the provisioning and provisioned states may take
     *   some time.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun value(): Optional<Value_> = value.getOptional("value")

    /**
     * Returns the raw JSON value of [errorCode].
     *
     * Unlike [errorCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("error_code") @ExcludeMissing fun _errorCode(): JsonField<String> = errorCode

    /**
     * Returns the raw JSON value of [errorDescription].
     *
     * Unlike [errorDescription], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("error_description")
    @ExcludeMissing
    fun _errorDescription(): JsonField<String> = errorDescription

    /**
     * Returns the raw JSON value of [value].
     *
     * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<Value_> = value

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
         * Returns a mutable builder for constructing an instance of [PrivateWirelessGatewayStatus].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PrivateWirelessGatewayStatus]. */
    class Builder internal constructor() {

        private var errorCode: JsonField<String> = JsonMissing.of()
        private var errorDescription: JsonField<String> = JsonMissing.of()
        private var value: JsonField<Value_> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(privateWirelessGatewayStatus: PrivateWirelessGatewayStatus) = apply {
            errorCode = privateWirelessGatewayStatus.errorCode
            errorDescription = privateWirelessGatewayStatus.errorDescription
            value = privateWirelessGatewayStatus.value
            additionalProperties = privateWirelessGatewayStatus.additionalProperties.toMutableMap()
        }

        /**
         * This attribute is an [error code](https://developers.telnyx.com/api/errors) related to
         * the failure reason.
         */
        fun errorCode(errorCode: String) = errorCode(JsonField.of(errorCode))

        /**
         * Sets [Builder.errorCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.errorCode] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun errorCode(errorCode: JsonField<String>) = apply { this.errorCode = errorCode }

        /** This attribute provides a human-readable explanation of why a failure happened. */
        fun errorDescription(errorDescription: String) =
            errorDescription(JsonField.of(errorDescription))

        /**
         * Sets [Builder.errorDescription] to an arbitrary JSON value.
         *
         * You should usually call [Builder.errorDescription] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun errorDescription(errorDescription: JsonField<String>) = apply {
            this.errorDescription = errorDescription
        }

        /**
         * The current status or failure details of the Private Wireless Gateway. <ul>
         * <li><code>provisioning</code> - the Private Wireless Gateway is being provisioned.</li>
         * <li><code>provisioned</code> - the Private Wireless Gateway was provisioned and able to
         *   receive connections.</li>
         * <li><code>failed</code> - the provisioning had failed for a reason and it requires an
         *   intervention.</li>
         * <li><code>decommissioning</code> - the Private Wireless Gateway is being removed from the
         *   network.</li> </ul> Transitioning between the provisioning and provisioned states may
         *   take some time.
         */
        fun value(value: Value_) = value(JsonField.of(value))

        /**
         * Sets [Builder.value] to an arbitrary JSON value.
         *
         * You should usually call [Builder.value] with a well-typed [Value_] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun value(value: JsonField<Value_>) = apply { this.value = value }

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
         * Returns an immutable instance of [PrivateWirelessGatewayStatus].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): PrivateWirelessGatewayStatus =
            PrivateWirelessGatewayStatus(
                errorCode,
                errorDescription,
                value,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PrivateWirelessGatewayStatus = apply {
        if (validated) {
            return@apply
        }

        errorCode()
        errorDescription()
        value().ifPresent { it.validate() }
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
        (if (errorCode.asKnown().isPresent) 1 else 0) +
            (if (errorDescription.asKnown().isPresent) 1 else 0) +
            (value.asKnown().getOrNull()?.validity() ?: 0)

    /**
     * The current status or failure details of the Private Wireless Gateway. <ul>
     * <li><code>provisioning</code> - the Private Wireless Gateway is being provisioned.</li>
     * <li><code>provisioned</code> - the Private Wireless Gateway was provisioned and able to
     *   receive connections.</li>
     * <li><code>failed</code> - the provisioning had failed for a reason and it requires an
     *   intervention.</li>
     * <li><code>decommissioning</code> - the Private Wireless Gateway is being removed from the
     *   network.</li> </ul> Transitioning between the provisioning and provisioned states may take
     *   some time.
     */
    class Value_ @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val PROVISIONING = of("provisioning")

            @JvmField val PROVISIONED = of("provisioned")

            @JvmField val FAILED = of("failed")

            @JvmField val DECOMMISSIONING = of("decommissioning")

            @JvmStatic fun of(value: String) = Value_(JsonField.of(value))
        }

        /** An enum containing [Value_]'s known values. */
        enum class Known {
            PROVISIONING,
            PROVISIONED,
            FAILED,
            DECOMMISSIONING,
        }

        /**
         * An enum containing [Value_]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Value_] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PROVISIONING,
            PROVISIONED,
            FAILED,
            DECOMMISSIONING,
            /** An enum member indicating that [Value_] was instantiated with an unknown value. */
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
                PROVISIONING -> Value.PROVISIONING
                PROVISIONED -> Value.PROVISIONED
                FAILED -> Value.FAILED
                DECOMMISSIONING -> Value.DECOMMISSIONING
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
                PROVISIONING -> Known.PROVISIONING
                PROVISIONED -> Known.PROVISIONED
                FAILED -> Known.FAILED
                DECOMMISSIONING -> Known.DECOMMISSIONING
                else -> throw TelnyxInvalidDataException("Unknown Value_: $value")
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

        fun validate(): Value_ = apply {
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

            return other is Value_ && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PrivateWirelessGatewayStatus &&
            errorCode == other.errorCode &&
            errorDescription == other.errorDescription &&
            value == other.value &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(errorCode, errorDescription, value, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PrivateWirelessGatewayStatus{errorCode=$errorCode, errorDescription=$errorDescription, value=$value, additionalProperties=$additionalProperties}"
}
