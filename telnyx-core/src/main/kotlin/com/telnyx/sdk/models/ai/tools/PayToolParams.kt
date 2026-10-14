// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.tools

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class PayToolParams
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val connectorName: JsonField<String>,
    private val connectorParameters: JsonField<ConnectorParameters>,
    private val currency: JsonField<String>,
    private val description: JsonField<String>,
    private val paymentMethod: JsonField<String>,
    private val validCardTypes: JsonField<List<ValidCardType>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("connector_name")
        @ExcludeMissing
        connectorName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("connector_parameters")
        @ExcludeMissing
        connectorParameters: JsonField<ConnectorParameters> = JsonMissing.of(),
        @JsonProperty("currency") @ExcludeMissing currency: JsonField<String> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("payment_method")
        @ExcludeMissing
        paymentMethod: JsonField<String> = JsonMissing.of(),
        @JsonProperty("valid_card_types")
        @ExcludeMissing
        validCardTypes: JsonField<List<ValidCardType>> = JsonMissing.of(),
    ) : this(
        connectorName,
        connectorParameters,
        currency,
        description,
        paymentMethod,
        validCardTypes,
        mutableMapOf(),
    )

    /**
     * The name of the pay connector configured in the Telnyx API. Must reference an existing pay
     * connector for this organization.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun connectorName(): String = connectorName.getRequired("connector_name")

    /**
     * Custom key/value parameters forwarded to the pay connector as `parameters` in the processor
     * request. String values may use `{{dynamic_variable}}` templating, resolved per call.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun connectorParameters(): Optional<ConnectorParameters> =
        connectorParameters.getOptional("connector_parameters")

    /**
     * Default currency for payments processed by this tool.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun currency(): Optional<String> = currency.getOptional("currency")

    /**
     * Description of the pay tool shown to the assistant so it knows when to call the tool. Not
     * sent to the payment connector — the per-call `description` argument the assistant passes is
     * what reaches the processor.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<String> = description.getOptional("description")

    /**
     * Default payment method for payments processed by this tool.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun paymentMethod(): Optional<String> = paymentMethod.getOptional("payment_method")

    /**
     * Restricts accepted card numbers to the listed card types. When the caller enters a card
     * number that does not match one of the listed types, Pay treats the input as invalid and
     * re-prompts for the card number.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun validCardTypes(): Optional<List<ValidCardType>> =
        validCardTypes.getOptional("valid_card_types")

    /**
     * Returns the raw JSON value of [connectorName].
     *
     * Unlike [connectorName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("connector_name")
    @ExcludeMissing
    fun _connectorName(): JsonField<String> = connectorName

    /**
     * Returns the raw JSON value of [connectorParameters].
     *
     * Unlike [connectorParameters], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("connector_parameters")
    @ExcludeMissing
    fun _connectorParameters(): JsonField<ConnectorParameters> = connectorParameters

    /**
     * Returns the raw JSON value of [currency].
     *
     * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [paymentMethod].
     *
     * Unlike [paymentMethod], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("payment_method")
    @ExcludeMissing
    fun _paymentMethod(): JsonField<String> = paymentMethod

    /**
     * Returns the raw JSON value of [validCardTypes].
     *
     * Unlike [validCardTypes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("valid_card_types")
    @ExcludeMissing
    fun _validCardTypes(): JsonField<List<ValidCardType>> = validCardTypes

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
         * Returns a mutable builder for constructing an instance of [PayToolParams].
         *
         * The following fields are required:
         * ```java
         * .connectorName()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PayToolParams]. */
    class Builder internal constructor() {

        private var connectorName: JsonField<String>? = null
        private var connectorParameters: JsonField<ConnectorParameters> = JsonMissing.of()
        private var currency: JsonField<String> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var paymentMethod: JsonField<String> = JsonMissing.of()
        private var validCardTypes: JsonField<MutableList<ValidCardType>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(payToolParams: PayToolParams) = apply {
            connectorName = payToolParams.connectorName
            connectorParameters = payToolParams.connectorParameters
            currency = payToolParams.currency
            description = payToolParams.description
            paymentMethod = payToolParams.paymentMethod
            validCardTypes = payToolParams.validCardTypes.map { it.toMutableList() }
            additionalProperties = payToolParams.additionalProperties.toMutableMap()
        }

        /**
         * The name of the pay connector configured in the Telnyx API. Must reference an existing
         * pay connector for this organization.
         */
        fun connectorName(connectorName: String) = connectorName(JsonField.of(connectorName))

        /**
         * Sets [Builder.connectorName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.connectorName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun connectorName(connectorName: JsonField<String>) = apply {
            this.connectorName = connectorName
        }

        /**
         * Custom key/value parameters forwarded to the pay connector as `parameters` in the
         * processor request. String values may use `{{dynamic_variable}}` templating, resolved per
         * call.
         */
        fun connectorParameters(connectorParameters: ConnectorParameters) =
            connectorParameters(JsonField.of(connectorParameters))

        /**
         * Sets [Builder.connectorParameters] to an arbitrary JSON value.
         *
         * You should usually call [Builder.connectorParameters] with a well-typed
         * [ConnectorParameters] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun connectorParameters(connectorParameters: JsonField<ConnectorParameters>) = apply {
            this.connectorParameters = connectorParameters
        }

        /** Default currency for payments processed by this tool. */
        fun currency(currency: String) = currency(JsonField.of(currency))

        /**
         * Sets [Builder.currency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currency] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun currency(currency: JsonField<String>) = apply { this.currency = currency }

        /**
         * Description of the pay tool shown to the assistant so it knows when to call the tool. Not
         * sent to the payment connector — the per-call `description` argument the assistant passes
         * is what reaches the processor.
         */
        fun description(description: String?) = description(JsonField.ofNullable(description))

        /** Alias for calling [Builder.description] with `description.orElse(null)`. */
        fun description(description: Optional<String>) = description(description.getOrNull())

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        /** Default payment method for payments processed by this tool. */
        fun paymentMethod(paymentMethod: String) = paymentMethod(JsonField.of(paymentMethod))

        /**
         * Sets [Builder.paymentMethod] to an arbitrary JSON value.
         *
         * You should usually call [Builder.paymentMethod] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun paymentMethod(paymentMethod: JsonField<String>) = apply {
            this.paymentMethod = paymentMethod
        }

        /**
         * Restricts accepted card numbers to the listed card types. When the caller enters a card
         * number that does not match one of the listed types, Pay treats the input as invalid and
         * re-prompts for the card number.
         */
        fun validCardTypes(validCardTypes: List<ValidCardType>) =
            validCardTypes(JsonField.of(validCardTypes))

        /**
         * Sets [Builder.validCardTypes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.validCardTypes] with a well-typed `List<ValidCardType>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun validCardTypes(validCardTypes: JsonField<List<ValidCardType>>) = apply {
            this.validCardTypes = validCardTypes.map { it.toMutableList() }
        }

        /**
         * Adds a single [ValidCardType] to [validCardTypes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addValidCardType(validCardType: ValidCardType) = apply {
            validCardTypes =
                (validCardTypes ?: JsonField.of(mutableListOf())).also {
                    checkKnown("validCardTypes", it).add(validCardType)
                }
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
         * Returns an immutable instance of [PayToolParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .connectorName()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PayToolParams =
            PayToolParams(
                checkRequired("connectorName", connectorName),
                connectorParameters,
                currency,
                description,
                paymentMethod,
                (validCardTypes ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): PayToolParams = apply {
        if (validated) {
            return@apply
        }

        connectorName()
        connectorParameters().ifPresent { it.validate() }
        currency()
        description()
        paymentMethod()
        validCardTypes().ifPresent { it.forEach { it.validate() } }
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
        (if (connectorName.asKnown().isPresent) 1 else 0) +
            (connectorParameters.asKnown().getOrNull()?.validity() ?: 0) +
            (if (currency.asKnown().isPresent) 1 else 0) +
            (if (description.asKnown().isPresent) 1 else 0) +
            (if (paymentMethod.asKnown().isPresent) 1 else 0) +
            (validCardTypes.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    /**
     * Custom key/value parameters forwarded to the pay connector as `parameters` in the processor
     * request. String values may use `{{dynamic_variable}}` templating, resolved per call.
     */
    class ConnectorParameters
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [ConnectorParameters]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ConnectorParameters]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(connectorParameters: ConnectorParameters) = apply {
                additionalProperties = connectorParameters.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [ConnectorParameters].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): ConnectorParameters =
                ConnectorParameters(additionalProperties.toImmutable())
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
        fun validate(): ConnectorParameters = apply {
            if (validated) {
                return@apply
            }

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
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ConnectorParameters &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "ConnectorParameters{additionalProperties=$additionalProperties}"
    }

    class ValidCardType @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val VISA = of("visa")

            @JvmField val MASTERCARD = of("mastercard")

            @JvmField val AMEX = of("amex")

            @JvmField val MAESTRO = of("maestro")

            @JvmField val DISCOVER = of("discover")

            @JvmField val OPTIMA = of("optima")

            @JvmField val JCB = of("jcb")

            @JvmField val DINERS_CLUB = of("diners-club")

            @JvmField val ENROUTE = of("enroute")

            @JvmStatic fun of(value: String) = ValidCardType(JsonField.of(value))
        }

        /** An enum containing [ValidCardType]'s known values. */
        enum class Known {
            VISA,
            MASTERCARD,
            AMEX,
            MAESTRO,
            DISCOVER,
            OPTIMA,
            JCB,
            DINERS_CLUB,
            ENROUTE,
        }

        /**
         * An enum containing [ValidCardType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ValidCardType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            VISA,
            MASTERCARD,
            AMEX,
            MAESTRO,
            DISCOVER,
            OPTIMA,
            JCB,
            DINERS_CLUB,
            ENROUTE,
            /**
             * An enum member indicating that [ValidCardType] was instantiated with an unknown
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
                VISA -> Value.VISA
                MASTERCARD -> Value.MASTERCARD
                AMEX -> Value.AMEX
                MAESTRO -> Value.MAESTRO
                DISCOVER -> Value.DISCOVER
                OPTIMA -> Value.OPTIMA
                JCB -> Value.JCB
                DINERS_CLUB -> Value.DINERS_CLUB
                ENROUTE -> Value.ENROUTE
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
                VISA -> Known.VISA
                MASTERCARD -> Known.MASTERCARD
                AMEX -> Known.AMEX
                MAESTRO -> Known.MAESTRO
                DISCOVER -> Known.DISCOVER
                OPTIMA -> Known.OPTIMA
                JCB -> Known.JCB
                DINERS_CLUB -> Known.DINERS_CLUB
                ENROUTE -> Known.ENROUTE
                else -> throw TelnyxInvalidDataException("Unknown ValidCardType: $value")
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
        fun validate(): ValidCardType = apply {
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

            return other is ValidCardType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PayToolParams &&
            connectorName == other.connectorName &&
            connectorParameters == other.connectorParameters &&
            currency == other.currency &&
            description == other.description &&
            paymentMethod == other.paymentMethod &&
            validCardTypes == other.validCardTypes &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            connectorName,
            connectorParameters,
            currency,
            description,
            paymentMethod,
            validCardTypes,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PayToolParams{connectorName=$connectorName, connectorParameters=$connectorParameters, currency=$currency, description=$description, paymentMethod=$paymentMethod, validCardTypes=$validCardTypes, additionalProperties=$additionalProperties}"
}
