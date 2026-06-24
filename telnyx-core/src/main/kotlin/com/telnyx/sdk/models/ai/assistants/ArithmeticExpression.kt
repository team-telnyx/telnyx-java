// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants

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
import kotlin.jvm.optionals.getOrNull

/**
 * Numeric expression: applies an arithmetic operator to two sub-expressions.
 *
 * Useful for derived numeric checks, e.g. `cart_total + shipping > 50`. Both operands should
 * resolve to numbers at runtime.
 */
class ArithmeticExpression
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val left: JsonValue,
    private val op: JsonField<Op>,
    private val right: JsonValue,
    private val type: JsonValue,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("left") @ExcludeMissing left: JsonValue = JsonMissing.of(),
        @JsonProperty("op") @ExcludeMissing op: JsonField<Op> = JsonMissing.of(),
        @JsonProperty("right") @ExcludeMissing right: JsonValue = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
    ) : this(left, op, right, type, mutableMapOf())

    /**
     * Operand sub-expression (Expression AST node). Typed as free-form JSON to support arbitrary
     * recursion depth without an uncompilable by-value self-reference; see the Expression schema
     * for the variant structure.
     *
     * This arbitrary value can be deserialized into a custom type using the `convert` method:
     * ```java
     * MyClass myObject = arithmeticExpression.left().convert(MyClass.class);
     * ```
     */
    @JsonProperty("left") @ExcludeMissing fun _left(): JsonValue = left

    /**
     * Arithmetic operator applied to `left` and `right`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun op(): Op = op.getRequired("op")

    /**
     * Operand sub-expression (Expression AST node). Typed as free-form JSON to support arbitrary
     * recursion depth without an uncompilable by-value self-reference; see the Expression schema
     * for the variant structure.
     *
     * This arbitrary value can be deserialized into a custom type using the `convert` method:
     * ```java
     * MyClass myObject = arithmeticExpression.right().convert(MyClass.class);
     * ```
     */
    @JsonProperty("right") @ExcludeMissing fun _right(): JsonValue = right

    /**
     * Expected to always return the following:
     * ```java
     * JsonValue.from("arithmetic")
     * ```
     *
     * However, this method can be useful for debugging and logging (e.g. if the server responded
     * with an unexpected value).
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

    /**
     * Returns the raw JSON value of [op].
     *
     * Unlike [op], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("op") @ExcludeMissing fun _op(): JsonField<Op> = op

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
         * Returns a mutable builder for constructing an instance of [ArithmeticExpression].
         *
         * The following fields are required:
         * ```java
         * .left()
         * .op()
         * .right()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ArithmeticExpression]. */
    class Builder internal constructor() {

        private var left: JsonValue? = null
        private var op: JsonField<Op>? = null
        private var right: JsonValue? = null
        private var type: JsonValue = JsonValue.from("arithmetic")
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(arithmeticExpression: ArithmeticExpression) = apply {
            left = arithmeticExpression.left
            op = arithmeticExpression.op
            right = arithmeticExpression.right
            type = arithmeticExpression.type
            additionalProperties = arithmeticExpression.additionalProperties.toMutableMap()
        }

        /**
         * Operand sub-expression (Expression AST node). Typed as free-form JSON to support
         * arbitrary recursion depth without an uncompilable by-value self-reference; see the
         * Expression schema for the variant structure.
         */
        fun left(left: JsonValue) = apply { this.left = left }

        /** Arithmetic operator applied to `left` and `right`. */
        fun op(op: Op) = op(JsonField.of(op))

        /**
         * Sets [Builder.op] to an arbitrary JSON value.
         *
         * You should usually call [Builder.op] with a well-typed [Op] value instead. This method is
         * primarily for setting the field to an undocumented or not yet supported value.
         */
        fun op(op: JsonField<Op>) = apply { this.op = op }

        /**
         * Operand sub-expression (Expression AST node). Typed as free-form JSON to support
         * arbitrary recursion depth without an uncompilable by-value self-reference; see the
         * Expression schema for the variant structure.
         */
        fun right(right: JsonValue) = apply { this.right = right }

        /**
         * Sets the field to an arbitrary JSON value.
         *
         * It is usually unnecessary to call this method because the field defaults to the
         * following:
         * ```java
         * JsonValue.from("arithmetic")
         * ```
         *
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun type(type: JsonValue) = apply { this.type = type }

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
         * Returns an immutable instance of [ArithmeticExpression].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .left()
         * .op()
         * .right()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ArithmeticExpression =
            ArithmeticExpression(
                checkRequired("left", left),
                checkRequired("op", op),
                checkRequired("right", right),
                type,
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
    fun validate(): ArithmeticExpression = apply {
        if (validated) {
            return@apply
        }

        op().validate()
        _type().let {
            if (it != JsonValue.from("arithmetic")) {
                throw TelnyxInvalidDataException("'type' is invalid, received $it")
            }
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (op.asKnown().getOrNull()?.validity() ?: 0) +
            type.let { if (it == JsonValue.from("arithmetic")) 1 else 0 }

    /** Arithmetic operator applied to `left` and `right`. */
    class Op @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val PLUS = of("+")

            @JvmField val MINUS = of("-")

            @JvmField val MULTIPLY = of("*")

            @JvmField val DIVIDE = of("/")

            @JvmField val MODULO = of("%")

            @JvmStatic fun of(value: String) = Op(JsonField.of(value))
        }

        /** An enum containing [Op]'s known values. */
        enum class Known {
            PLUS,
            MINUS,
            MULTIPLY,
            DIVIDE,
            MODULO,
        }

        /**
         * An enum containing [Op]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Op] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PLUS,
            MINUS,
            MULTIPLY,
            DIVIDE,
            MODULO,
            /** An enum member indicating that [Op] was instantiated with an unknown value. */
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
                PLUS -> Value.PLUS
                MINUS -> Value.MINUS
                MULTIPLY -> Value.MULTIPLY
                DIVIDE -> Value.DIVIDE
                MODULO -> Value.MODULO
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
                PLUS -> Known.PLUS
                MINUS -> Known.MINUS
                MULTIPLY -> Known.MULTIPLY
                DIVIDE -> Known.DIVIDE
                MODULO -> Known.MODULO
                else -> throw TelnyxInvalidDataException("Unknown Op: $value")
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
        fun validate(): Op = apply {
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

            return other is Op && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ArithmeticExpression &&
            left == other.left &&
            op == other.op &&
            right == other.right &&
            type == other.type &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(left, op, right, type, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ArithmeticExpression{left=$left, op=$op, right=$right, type=$type, additionalProperties=$additionalProperties}"
}
