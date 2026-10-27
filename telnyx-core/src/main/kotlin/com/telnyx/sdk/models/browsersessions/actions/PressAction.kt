// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.browsersessions.actions

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Press a keyboard key. */
class PressAction
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val key: JsonField<Key>,
    private val type: JsonValue,
    private val idempotencyKey: JsonField<String>,
    private val includeObservation: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("key") @ExcludeMissing key: JsonField<Key> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
        @JsonProperty("idempotency_key")
        @ExcludeMissing
        idempotencyKey: JsonField<String> = JsonMissing.of(),
        @JsonProperty("include_observation")
        @ExcludeMissing
        includeObservation: JsonField<Boolean> = JsonMissing.of(),
    ) : this(key, type, idempotencyKey, includeObservation, mutableMapOf())

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun key(): Key = key.getRequired("key")

    /**
     * Expected to always return the following:
     * ```java
     * JsonValue.from("press")
     * ```
     *
     * However, this method can be useful for debugging and logging (e.g. if the server responded
     * with an unexpected value).
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun idempotencyKey(): Optional<String> = idempotencyKey.getOptional("idempotency_key")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun includeObservation(): Optional<Boolean> =
        includeObservation.getOptional("include_observation")

    /**
     * Returns the raw JSON value of [key].
     *
     * Unlike [key], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("key") @ExcludeMissing fun _key(): JsonField<Key> = key

    /**
     * Returns the raw JSON value of [idempotencyKey].
     *
     * Unlike [idempotencyKey], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("idempotency_key")
    @ExcludeMissing
    fun _idempotencyKey(): JsonField<String> = idempotencyKey

    /**
     * Returns the raw JSON value of [includeObservation].
     *
     * Unlike [includeObservation], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("include_observation")
    @ExcludeMissing
    fun _includeObservation(): JsonField<Boolean> = includeObservation

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
         * Returns a mutable builder for constructing an instance of [PressAction].
         *
         * The following fields are required:
         * ```java
         * .key()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PressAction]. */
    class Builder internal constructor() {

        private var key: JsonField<Key>? = null
        private var type: JsonValue = JsonValue.from("press")
        private var idempotencyKey: JsonField<String> = JsonMissing.of()
        private var includeObservation: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(pressAction: PressAction) = apply {
            key = pressAction.key
            type = pressAction.type
            idempotencyKey = pressAction.idempotencyKey
            includeObservation = pressAction.includeObservation
            additionalProperties = pressAction.additionalProperties.toMutableMap()
        }

        fun key(key: Key) = key(JsonField.of(key))

        /**
         * Sets [Builder.key] to an arbitrary JSON value.
         *
         * You should usually call [Builder.key] with a well-typed [Key] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun key(key: JsonField<Key>) = apply { this.key = key }

        /**
         * Sets the field to an arbitrary JSON value.
         *
         * It is usually unnecessary to call this method because the field defaults to the
         * following:
         * ```java
         * JsonValue.from("press")
         * ```
         *
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun type(type: JsonValue) = apply { this.type = type }

        fun idempotencyKey(idempotencyKey: String) = idempotencyKey(JsonField.of(idempotencyKey))

        /**
         * Sets [Builder.idempotencyKey] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idempotencyKey] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun idempotencyKey(idempotencyKey: JsonField<String>) = apply {
            this.idempotencyKey = idempotencyKey
        }

        fun includeObservation(includeObservation: Boolean) =
            includeObservation(JsonField.of(includeObservation))

        /**
         * Sets [Builder.includeObservation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.includeObservation] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun includeObservation(includeObservation: JsonField<Boolean>) = apply {
            this.includeObservation = includeObservation
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
         * Returns an immutable instance of [PressAction].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .key()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PressAction =
            PressAction(
                checkRequired("key", key),
                type,
                idempotencyKey,
                includeObservation,
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
    fun validate(): PressAction = apply {
        if (validated) {
            return@apply
        }

        key().validate()
        _type().let {
            if (it != JsonValue.from("press")) {
                throw TelnyxInvalidDataException("'type' is invalid, received $it")
            }
        }
        idempotencyKey()
        includeObservation()
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
        (key.asKnown().getOrNull()?.validity() ?: 0) +
            type.let { if (it == JsonValue.from("press")) 1 else 0 } +
            (if (idempotencyKey.asKnown().isPresent) 1 else 0) +
            (if (includeObservation.asKnown().isPresent) 1 else 0)

    class Key @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val ENTER = of("Enter")

            @JvmField val TAB = of("Tab")

            @JvmField val ESCAPE = of("Escape")

            @JvmField val BACKSPACE = of("Backspace")

            @JvmField val ARROW_UP = of("ArrowUp")

            @JvmField val ARROW_DOWN = of("ArrowDown")

            @JvmField val ARROW_LEFT = of("ArrowLeft")

            @JvmField val ARROW_RIGHT = of("ArrowRight")

            @JvmField val PAGE_UP = of("PageUp")

            @JvmField val PAGE_DOWN = of("PageDown")

            @JvmField val HOME = of("Home")

            @JvmField val END = of("End")

            @JvmStatic fun of(value: String) = Key(JsonField.of(value))
        }

        /** An enum containing [Key]'s known values. */
        enum class Known {
            ENTER,
            TAB,
            ESCAPE,
            BACKSPACE,
            ARROW_UP,
            ARROW_DOWN,
            ARROW_LEFT,
            ARROW_RIGHT,
            PAGE_UP,
            PAGE_DOWN,
            HOME,
            END,
        }

        /**
         * An enum containing [Key]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Key] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ENTER,
            TAB,
            ESCAPE,
            BACKSPACE,
            ARROW_UP,
            ARROW_DOWN,
            ARROW_LEFT,
            ARROW_RIGHT,
            PAGE_UP,
            PAGE_DOWN,
            HOME,
            END,
            /** An enum member indicating that [Key] was instantiated with an unknown value. */
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
                ENTER -> Value.ENTER
                TAB -> Value.TAB
                ESCAPE -> Value.ESCAPE
                BACKSPACE -> Value.BACKSPACE
                ARROW_UP -> Value.ARROW_UP
                ARROW_DOWN -> Value.ARROW_DOWN
                ARROW_LEFT -> Value.ARROW_LEFT
                ARROW_RIGHT -> Value.ARROW_RIGHT
                PAGE_UP -> Value.PAGE_UP
                PAGE_DOWN -> Value.PAGE_DOWN
                HOME -> Value.HOME
                END -> Value.END
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
                ENTER -> Known.ENTER
                TAB -> Known.TAB
                ESCAPE -> Known.ESCAPE
                BACKSPACE -> Known.BACKSPACE
                ARROW_UP -> Known.ARROW_UP
                ARROW_DOWN -> Known.ARROW_DOWN
                ARROW_LEFT -> Known.ARROW_LEFT
                ARROW_RIGHT -> Known.ARROW_RIGHT
                PAGE_UP -> Known.PAGE_UP
                PAGE_DOWN -> Known.PAGE_DOWN
                HOME -> Known.HOME
                END -> Known.END
                else -> throw TelnyxInvalidDataException("Unknown Key: $value")
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
        fun validate(): Key = apply {
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

            return other is Key && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PressAction &&
            key == other.key &&
            type == other.type &&
            idempotencyKey == other.idempotencyKey &&
            includeObservation == other.includeObservation &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(key, type, idempotencyKey, includeObservation, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PressAction{key=$key, type=$type, idempotencyKey=$idempotencyKey, includeObservation=$includeObservation, additionalProperties=$additionalProperties}"
}
