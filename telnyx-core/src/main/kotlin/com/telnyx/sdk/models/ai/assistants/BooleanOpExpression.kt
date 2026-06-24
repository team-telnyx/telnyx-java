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
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

/**
 * Combine sub-expressions with a logical operator (`and` / `or` / `not`).
 *
 * `and` and `or` accept two or more operands; `not` accepts exactly one.
 */
class BooleanOpExpression
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val op: JsonField<Op>,
    private val operands: JsonField<List<Expression>>,
    private val type: JsonValue,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("op") @ExcludeMissing op: JsonField<Op> = JsonMissing.of(),
        @JsonProperty("operands")
        @ExcludeMissing
        operands: JsonField<List<Expression>> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
    ) : this(op, operands, type, mutableMapOf())

    /**
     * Logical operator. `not` is unary; `and`/`or` are n-ary (>=2).
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun op(): Op = op.getRequired("op")

    /**
     * Operand sub-expressions. Length must be exactly 1 for `not` and >= 2 for `and`/`or`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun operands(): List<Expression> = operands.getRequired("operands")

    /**
     * Expected to always return the following:
     * ```java
     * JsonValue.from("bool_op")
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

    /**
     * Returns the raw JSON value of [operands].
     *
     * Unlike [operands], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("operands")
    @ExcludeMissing
    fun _operands(): JsonField<List<Expression>> = operands

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
         * Returns a mutable builder for constructing an instance of [BooleanOpExpression].
         *
         * The following fields are required:
         * ```java
         * .op()
         * .operands()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BooleanOpExpression]. */
    class Builder internal constructor() {

        private var op: JsonField<Op>? = null
        private var operands: JsonField<MutableList<Expression>>? = null
        private var type: JsonValue = JsonValue.from("bool_op")
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(booleanOpExpression: BooleanOpExpression) = apply {
            op = booleanOpExpression.op
            operands = booleanOpExpression.operands.map { it.toMutableList() }
            type = booleanOpExpression.type
            additionalProperties = booleanOpExpression.additionalProperties.toMutableMap()
        }

        /** Logical operator. `not` is unary; `and`/`or` are n-ary (>=2). */
        fun op(op: Op) = op(JsonField.of(op))

        /**
         * Sets [Builder.op] to an arbitrary JSON value.
         *
         * You should usually call [Builder.op] with a well-typed [Op] value instead. This method is
         * primarily for setting the field to an undocumented or not yet supported value.
         */
        fun op(op: JsonField<Op>) = apply { this.op = op }

        /** Operand sub-expressions. Length must be exactly 1 for `not` and >= 2 for `and`/`or`. */
        fun operands(operands: List<Expression>) = operands(JsonField.of(operands))

        /**
         * Sets [Builder.operands] to an arbitrary JSON value.
         *
         * You should usually call [Builder.operands] with a well-typed `List<Expression>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun operands(operands: JsonField<List<Expression>>) = apply {
            this.operands = operands.map { it.toMutableList() }
        }

        /**
         * Adds a single [Expression] to [operands].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addOperand(operand: Expression) = apply {
            operands =
                (operands ?: JsonField.of(mutableListOf())).also {
                    checkKnown("operands", it).add(operand)
                }
        }

        /** Alias for calling [addOperand] with `Expression.ofComparison(comparison)`. */
        fun addOperand(comparison: ComparisonExpression) =
            addOperand(Expression.ofComparison(comparison))

        /** Alias for calling [addOperand] with `Expression.ofBoolOp(boolOp)`. */
        fun addOperand(boolOp: BooleanOpExpression) = addOperand(Expression.ofBoolOp(boolOp))

        /** Alias for calling [addOperand] with `Expression.ofArithmetic(arithmetic)`. */
        fun addOperand(arithmetic: ArithmeticExpression) =
            addOperand(Expression.ofArithmetic(arithmetic))

        /** Alias for calling [addOperand] with `Expression.ofVariable(variable)`. */
        fun addOperand(variable: Expression.Variable) = addOperand(Expression.ofVariable(variable))

        /**
         * Alias for calling [addOperand] with the following:
         * ```java
         * Expression.Variable.builder()
         *     .name(name)
         *     .build()
         * ```
         */
        fun addVariableOperand(name: String) =
            addOperand(Expression.Variable.builder().name(name).build())

        /** Alias for calling [addOperand] with `Expression.ofStringLiteral(stringLiteral)`. */
        fun addOperand(stringLiteral: Expression.StringLiteral) =
            addOperand(Expression.ofStringLiteral(stringLiteral))

        /**
         * Alias for calling [addOperand] with the following:
         * ```java
         * Expression.StringLiteral.builder()
         *     .value(value)
         *     .build()
         * ```
         */
        fun addStringLiteralOperand(value: String) =
            addOperand(Expression.StringLiteral.builder().value(value).build())

        /** Alias for calling [addOperand] with `Expression.ofNumberLiteral(numberLiteral)`. */
        fun addOperand(numberLiteral: Expression.NumberLiteral) =
            addOperand(Expression.ofNumberLiteral(numberLiteral))

        /**
         * Alias for calling [addOperand] with the following:
         * ```java
         * Expression.NumberLiteral.builder()
         *     .value(value)
         *     .build()
         * ```
         */
        fun addNumberLiteralOperand(value: Double) =
            addOperand(Expression.NumberLiteral.builder().value(value).build())

        /** Alias for calling [addOperand] with `Expression.ofBoolLiteral(boolLiteral)`. */
        fun addOperand(boolLiteral: Expression.BoolLiteral) =
            addOperand(Expression.ofBoolLiteral(boolLiteral))

        /**
         * Alias for calling [addOperand] with the following:
         * ```java
         * Expression.BoolLiteral.builder()
         *     .value(value)
         *     .build()
         * ```
         */
        fun addBoolLiteralOperand(value: Boolean) =
            addOperand(Expression.BoolLiteral.builder().value(value).build())

        /**
         * Sets the field to an arbitrary JSON value.
         *
         * It is usually unnecessary to call this method because the field defaults to the
         * following:
         * ```java
         * JsonValue.from("bool_op")
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
         * Returns an immutable instance of [BooleanOpExpression].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .op()
         * .operands()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): BooleanOpExpression =
            BooleanOpExpression(
                checkRequired("op", op),
                checkRequired("operands", operands).map { it.toImmutable() },
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
    fun validate(): BooleanOpExpression = apply {
        if (validated) {
            return@apply
        }

        op().validate()
        operands().forEach { it.validate() }
        _type().let {
            if (it != JsonValue.from("bool_op")) {
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
            (operands.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            type.let { if (it == JsonValue.from("bool_op")) 1 else 0 }

    /** Logical operator. `not` is unary; `and`/`or` are n-ary (>=2). */
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

            @JvmField val AND = of("and")

            @JvmField val OR = of("or")

            @JvmField val NOT = of("not")

            @JvmStatic fun of(value: String) = Op(JsonField.of(value))
        }

        /** An enum containing [Op]'s known values. */
        enum class Known {
            AND,
            OR,
            NOT,
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
            AND,
            OR,
            NOT,
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
                AND -> Value.AND
                OR -> Value.OR
                NOT -> Value.NOT
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
                AND -> Known.AND
                OR -> Known.OR
                NOT -> Known.NOT
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

        return other is BooleanOpExpression &&
            op == other.op &&
            operands == other.operands &&
            type == other.type &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(op, operands, type, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BooleanOpExpression{op=$op, operands=$operands, type=$type, additionalProperties=$additionalProperties}"
}
