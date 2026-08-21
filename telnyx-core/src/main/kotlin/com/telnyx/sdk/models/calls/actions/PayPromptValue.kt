// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.calls.actions

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.BaseDeserializer
import com.telnyx.sdk.core.BaseSerializer
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.allMaxBy
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.getOrThrow
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** A default prompt string or an ordered list of qualified prompts. */
@JsonDeserialize(using = PayPromptValue.Deserializer::class)
@JsonSerialize(using = PayPromptValue.Serializer::class)
class PayPromptValue
private constructor(
    private val string: String? = null,
    private val list: List<PayPrompt>? = null,
    private val _json: JsonValue? = null,
) {

    fun string(): Optional<String> = Optional.ofNullable(string)

    fun list(): Optional<List<PayPrompt>> = Optional.ofNullable(list)

    fun isString(): Boolean = string != null

    fun isList(): Boolean = list != null

    fun asString(): String = string.getOrThrow("string")

    fun asList(): List<PayPrompt> = list.getOrThrow("list")

    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

    /**
     * Maps this instance's current variant to a value of type [T] using the given [visitor].
     *
     * Note that this method is _not_ forwards compatible with new variants from the API, unless
     * [visitor] overrides [Visitor.unknown]. To handle variants not known to this version of the
     * SDK gracefully, consider overriding [Visitor.unknown]:
     * ```java
     * import com.telnyx.sdk.core.JsonValue;
     * import java.util.Optional;
     *
     * Optional<String> result = payPromptValue.accept(new PayPromptValue.Visitor<Optional<String>>() {
     *     @Override
     *     public Optional<String> visitString(String string) {
     *         return Optional.of(string.toString());
     *     }
     *
     *     // ...
     *
     *     @Override
     *     public Optional<String> unknown(JsonValue json) {
     *         // Or inspect the `json`.
     *         return Optional.empty();
     *     }
     * });
     * ```
     *
     * @throws TelnyxInvalidDataException if [Visitor.unknown] is not overridden in [visitor] and
     *   the current variant is unknown.
     */
    fun <T> accept(visitor: Visitor<T>): T =
        when {
            string != null -> visitor.visitString(string)
            list != null -> visitor.visitList(list)
            else -> visitor.unknown(_json)
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
    fun validate(): PayPromptValue = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitString(string: String) {}

                override fun visitList(list: List<PayPrompt>) {
                    list.forEach { it.validate() }
                }
            }
        )
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
        accept(
            object : Visitor<Int> {
                override fun visitString(string: String) = 1

                override fun visitList(list: List<PayPrompt>) = list.sumOf { it.validity().toInt() }

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PayPromptValue && string == other.string && list == other.list
    }

    override fun hashCode(): Int = Objects.hash(string, list)

    override fun toString(): String =
        when {
            string != null -> "PayPromptValue{string=$string}"
            list != null -> "PayPromptValue{list=$list}"
            _json != null -> "PayPromptValue{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid PayPromptValue")
        }

    companion object {

        @JvmStatic fun ofString(string: String) = PayPromptValue(string = string)

        @JvmStatic fun ofList(list: List<PayPrompt>) = PayPromptValue(list = list.toImmutable())
    }

    /**
     * An interface that defines how to map each variant of [PayPromptValue] to a value of type [T].
     */
    interface Visitor<out T> {

        fun visitString(string: String): T

        fun visitList(list: List<PayPrompt>): T

        /**
         * Maps an unknown variant of [PayPromptValue] to a value of type [T].
         *
         * An instance of [PayPromptValue] can contain an unknown variant if it was deserialized
         * from data that doesn't match any known variant. For example, if the SDK is on an older
         * version than the API, then the API may respond with new variants that the SDK is unaware
         * of.
         *
         * @throws TelnyxInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw TelnyxInvalidDataException("Unknown PayPromptValue: $json")
        }
    }

    internal class Deserializer : BaseDeserializer<PayPromptValue>(PayPromptValue::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): PayPromptValue {
            val json = JsonValue.fromJsonNode(node)

            val bestMatches =
                sequenceOf(
                        tryDeserialize(node, jacksonTypeRef<String>())?.let {
                            PayPromptValue(string = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<List<PayPrompt>>())?.let {
                            PayPromptValue(list = it, _json = json)
                        },
                    )
                    .filterNotNull()
                    .allMaxBy { it.validity() }
                    .toList()
            return when (bestMatches.size) {
                // This can happen if what we're deserializing is completely incompatible with all
                // the possible variants (e.g. deserializing from boolean).
                0 -> PayPromptValue(_json = json)
                1 -> bestMatches.single()
                // If there's more than one match with the highest validity, then use the first
                // completely valid match, or simply the first match if none are completely valid.
                else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
            }
        }
    }

    internal class Serializer : BaseSerializer<PayPromptValue>(PayPromptValue::class) {

        override fun serialize(
            value: PayPromptValue,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.string != null -> generator.writeObject(value.string)
                value.list != null -> generator.writeObject(value.list)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid PayPromptValue")
            }
        }
    }

    /** A text-to-speech prompt with optional matching qualifiers. */
    class PayPrompt
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val text: JsonField<String>,
        private val attempt: JsonField<String>,
        private val cardType: JsonField<CardType>,
        private val errorType: JsonField<ErrorType>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("text") @ExcludeMissing text: JsonField<String> = JsonMissing.of(),
            @JsonProperty("attempt") @ExcludeMissing attempt: JsonField<String> = JsonMissing.of(),
            @JsonProperty("card_type")
            @ExcludeMissing
            cardType: JsonField<CardType> = JsonMissing.of(),
            @JsonProperty("error_type")
            @ExcludeMissing
            errorType: JsonField<ErrorType> = JsonMissing.of(),
        ) : this(text, attempt, cardType, errorType, mutableMapOf())

        /**
         * Text spoken for the payment collection step.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun text(): String = text.getRequired("text")

        /**
         * Space-separated 1-based attempt numbers for which this prompt applies.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun attempt(): Optional<String> = attempt.getOptional("attempt")

        /**
         * Lowercase, case-sensitive detected card type for which this prompt applies. Only the
         * listed brands are currently detected; accepted UnionPay and Maestro test cards do not
         * produce a card-type qualifier.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun cardType(): Optional<CardType> = cardType.getOptional("card_type")

        /**
         * Step error for which this prompt applies.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun errorType(): Optional<ErrorType> = errorType.getOptional("error_type")

        /**
         * Returns the raw JSON value of [text].
         *
         * Unlike [text], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("text") @ExcludeMissing fun _text(): JsonField<String> = text

        /**
         * Returns the raw JSON value of [attempt].
         *
         * Unlike [attempt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("attempt") @ExcludeMissing fun _attempt(): JsonField<String> = attempt

        /**
         * Returns the raw JSON value of [cardType].
         *
         * Unlike [cardType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("card_type") @ExcludeMissing fun _cardType(): JsonField<CardType> = cardType

        /**
         * Returns the raw JSON value of [errorType].
         *
         * Unlike [errorType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("error_type")
        @ExcludeMissing
        fun _errorType(): JsonField<ErrorType> = errorType

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
             * Returns a mutable builder for constructing an instance of [PayPrompt].
             *
             * The following fields are required:
             * ```java
             * .text()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [PayPrompt]. */
        class Builder internal constructor() {

            private var text: JsonField<String>? = null
            private var attempt: JsonField<String> = JsonMissing.of()
            private var cardType: JsonField<CardType> = JsonMissing.of()
            private var errorType: JsonField<ErrorType> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(payPrompt: PayPrompt) = apply {
                text = payPrompt.text
                attempt = payPrompt.attempt
                cardType = payPrompt.cardType
                errorType = payPrompt.errorType
                additionalProperties = payPrompt.additionalProperties.toMutableMap()
            }

            /** Text spoken for the payment collection step. */
            fun text(text: String) = text(JsonField.of(text))

            /**
             * Sets [Builder.text] to an arbitrary JSON value.
             *
             * You should usually call [Builder.text] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun text(text: JsonField<String>) = apply { this.text = text }

            /** Space-separated 1-based attempt numbers for which this prompt applies. */
            fun attempt(attempt: String) = attempt(JsonField.of(attempt))

            /**
             * Sets [Builder.attempt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.attempt] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun attempt(attempt: JsonField<String>) = apply { this.attempt = attempt }

            /**
             * Lowercase, case-sensitive detected card type for which this prompt applies. Only the
             * listed brands are currently detected; accepted UnionPay and Maestro test cards do not
             * produce a card-type qualifier.
             */
            fun cardType(cardType: CardType) = cardType(JsonField.of(cardType))

            /**
             * Sets [Builder.cardType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cardType] with a well-typed [CardType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun cardType(cardType: JsonField<CardType>) = apply { this.cardType = cardType }

            /** Step error for which this prompt applies. */
            fun errorType(errorType: ErrorType) = errorType(JsonField.of(errorType))

            /**
             * Sets [Builder.errorType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.errorType] with a well-typed [ErrorType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun errorType(errorType: JsonField<ErrorType>) = apply { this.errorType = errorType }

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
             * Returns an immutable instance of [PayPrompt].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .text()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): PayPrompt =
                PayPrompt(
                    checkRequired("text", text),
                    attempt,
                    cardType,
                    errorType,
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
        fun validate(): PayPrompt = apply {
            if (validated) {
                return@apply
            }

            text()
            attempt()
            cardType().ifPresent { it.validate() }
            errorType().ifPresent { it.validate() }
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
            (if (text.asKnown().isPresent) 1 else 0) +
                (if (attempt.asKnown().isPresent) 1 else 0) +
                (cardType.asKnown().getOrNull()?.validity() ?: 0) +
                (errorType.asKnown().getOrNull()?.validity() ?: 0)

        /**
         * Lowercase, case-sensitive detected card type for which this prompt applies. Only the
         * listed brands are currently detected; accepted UnionPay and Maestro test cards do not
         * produce a card-type qualifier.
         */
        class CardType @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val VISA = of("visa")

                @JvmField val MASTERCARD = of("mastercard")

                @JvmField val AMEX = of("amex")

                @JvmField val DISCOVER = of("discover")

                @JvmField val DINERS_CLUB = of("diners-club")

                @JvmField val JCB = of("jcb")

                @JvmStatic fun of(value: String) = CardType(JsonField.of(value))
            }

            /** An enum containing [CardType]'s known values. */
            enum class Known {
                VISA,
                MASTERCARD,
                AMEX,
                DISCOVER,
                DINERS_CLUB,
                JCB,
            }

            /**
             * An enum containing [CardType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [CardType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                VISA,
                MASTERCARD,
                AMEX,
                DISCOVER,
                DINERS_CLUB,
                JCB,
                /**
                 * An enum member indicating that [CardType] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    VISA -> Value.VISA
                    MASTERCARD -> Value.MASTERCARD
                    AMEX -> Value.AMEX
                    DISCOVER -> Value.DISCOVER
                    DINERS_CLUB -> Value.DINERS_CLUB
                    JCB -> Value.JCB
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws TelnyxInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    VISA -> Known.VISA
                    MASTERCARD -> Known.MASTERCARD
                    AMEX -> Known.AMEX
                    DISCOVER -> Known.DISCOVER
                    DINERS_CLUB -> Known.DINERS_CLUB
                    JCB -> Known.JCB
                    else -> throw TelnyxInvalidDataException("Unknown CardType: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws TelnyxInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    TelnyxInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): CardType = apply {
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

                return other is CardType && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** Step error for which this prompt applies. */
        class ErrorType @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val TIMEOUT = of("timeout")

                @JvmField val INVALID_CARD_NUMBER = of("invalid-card-number")

                @JvmField val INVALID_DATE = of("invalid-date")

                @JvmField val INVALID_SECURITY_CODE = of("invalid-security-code")

                @JvmField val INVALID_POSTAL_CODE = of("invalid-postal-code")

                @JvmField val INVALID_BANK_ROUTING_NUMBER = of("invalid-bank-routing-number")

                @JvmField val INVALID_BANK_ACCOUNT_NUMBER = of("invalid-bank-account-number")

                @JvmField val INPUT_MATCHING_FAILED = of("input-matching-failed")

                @JvmStatic fun of(value: String) = ErrorType(JsonField.of(value))
            }

            /** An enum containing [ErrorType]'s known values. */
            enum class Known {
                TIMEOUT,
                INVALID_CARD_NUMBER,
                INVALID_DATE,
                INVALID_SECURITY_CODE,
                INVALID_POSTAL_CODE,
                INVALID_BANK_ROUTING_NUMBER,
                INVALID_BANK_ACCOUNT_NUMBER,
                INPUT_MATCHING_FAILED,
            }

            /**
             * An enum containing [ErrorType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [ErrorType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                TIMEOUT,
                INVALID_CARD_NUMBER,
                INVALID_DATE,
                INVALID_SECURITY_CODE,
                INVALID_POSTAL_CODE,
                INVALID_BANK_ROUTING_NUMBER,
                INVALID_BANK_ACCOUNT_NUMBER,
                INPUT_MATCHING_FAILED,
                /**
                 * An enum member indicating that [ErrorType] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    TIMEOUT -> Value.TIMEOUT
                    INVALID_CARD_NUMBER -> Value.INVALID_CARD_NUMBER
                    INVALID_DATE -> Value.INVALID_DATE
                    INVALID_SECURITY_CODE -> Value.INVALID_SECURITY_CODE
                    INVALID_POSTAL_CODE -> Value.INVALID_POSTAL_CODE
                    INVALID_BANK_ROUTING_NUMBER -> Value.INVALID_BANK_ROUTING_NUMBER
                    INVALID_BANK_ACCOUNT_NUMBER -> Value.INVALID_BANK_ACCOUNT_NUMBER
                    INPUT_MATCHING_FAILED -> Value.INPUT_MATCHING_FAILED
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws TelnyxInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    TIMEOUT -> Known.TIMEOUT
                    INVALID_CARD_NUMBER -> Known.INVALID_CARD_NUMBER
                    INVALID_DATE -> Known.INVALID_DATE
                    INVALID_SECURITY_CODE -> Known.INVALID_SECURITY_CODE
                    INVALID_POSTAL_CODE -> Known.INVALID_POSTAL_CODE
                    INVALID_BANK_ROUTING_NUMBER -> Known.INVALID_BANK_ROUTING_NUMBER
                    INVALID_BANK_ACCOUNT_NUMBER -> Known.INVALID_BANK_ACCOUNT_NUMBER
                    INPUT_MATCHING_FAILED -> Known.INPUT_MATCHING_FAILED
                    else -> throw TelnyxInvalidDataException("Unknown ErrorType: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws TelnyxInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    TelnyxInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): ErrorType = apply {
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

                return other is ErrorType && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is PayPrompt &&
                text == other.text &&
                attempt == other.attempt &&
                cardType == other.cardType &&
                errorType == other.errorType &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(text, attempt, cardType, errorType, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PayPrompt{text=$text, attempt=$attempt, cardType=$cardType, errorType=$errorType, additionalProperties=$additionalProperties}"
    }
}
