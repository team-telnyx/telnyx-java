// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants

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
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.getOrThrow
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * A node in a deterministic expression AST. Exactly one variant is selected by the `type`
 * discriminator. Terminal variants (`number_literal`, `string_literal`, `bool_literal`, `variable`)
 * bottom out the recursion; `arithmetic`, `bool_op`, and `comparison` nest further sub-expressions.
 *
 * Extracted into a single named schema so the recursive union is defined once (was previously
 * inlined at every operand site).
 */
@JsonDeserialize(using = Expression.Deserializer::class)
@JsonSerialize(using = Expression.Serializer::class)
class Expression
private constructor(
    private val comparison: ComparisonExpression? = null,
    private val boolOp: BooleanOpExpression? = null,
    private val arithmetic: ArithmeticExpression? = null,
    private val variable: Variable? = null,
    private val stringLiteral: StringLiteral? = null,
    private val numberLiteral: NumberLiteral? = null,
    private val boolLiteral: BoolLiteral? = null,
    private val _json: JsonValue? = null,
) {

    /**
     * Compare two sub-expressions with a relational or membership operator.
     *
     * Evaluates to a boolean. Used in edge conditions to gate transitions on runtime values, e.g.
     * `user_age >= 18` or `tier == "gold"`.
     */
    fun comparison(): Optional<ComparisonExpression> = Optional.ofNullable(comparison)

    /**
     * Combine sub-expressions with a logical operator (`and` / `or` / `not`).
     *
     * `and` and `or` accept two or more operands; `not` accepts exactly one.
     */
    fun boolOp(): Optional<BooleanOpExpression> = Optional.ofNullable(boolOp)

    /**
     * Numeric expression: applies an arithmetic operator to two sub-expressions.
     *
     * Useful for derived numeric checks, e.g. `cart_total + shipping > 50`. Both operands should
     * resolve to numbers at runtime.
     */
    fun arithmetic(): Optional<ArithmeticExpression> = Optional.ofNullable(arithmetic)

    /**
     * Reference a dynamic variable by name.
     *
     * Resolved at runtime from the assistant's dynamic-variables context (see
     * `Assistant.dynamic_variables` and the dynamic-variables webhook).
     */
    fun variable(): Optional<Variable> = Optional.ofNullable(variable)

    /** Constant string value. */
    fun stringLiteral(): Optional<StringLiteral> = Optional.ofNullable(stringLiteral)

    /** Constant numeric value (float; integers are accepted and stored as float). */
    fun numberLiteral(): Optional<NumberLiteral> = Optional.ofNullable(numberLiteral)

    /** Constant boolean value. Useful for unconditional ('always') edges. */
    fun boolLiteral(): Optional<BoolLiteral> = Optional.ofNullable(boolLiteral)

    fun isComparison(): Boolean = comparison != null

    fun isBoolOp(): Boolean = boolOp != null

    fun isArithmetic(): Boolean = arithmetic != null

    fun isVariable(): Boolean = variable != null

    fun isStringLiteral(): Boolean = stringLiteral != null

    fun isNumberLiteral(): Boolean = numberLiteral != null

    fun isBoolLiteral(): Boolean = boolLiteral != null

    /**
     * Compare two sub-expressions with a relational or membership operator.
     *
     * Evaluates to a boolean. Used in edge conditions to gate transitions on runtime values, e.g.
     * `user_age >= 18` or `tier == "gold"`.
     */
    fun asComparison(): ComparisonExpression = comparison.getOrThrow("comparison")

    /**
     * Combine sub-expressions with a logical operator (`and` / `or` / `not`).
     *
     * `and` and `or` accept two or more operands; `not` accepts exactly one.
     */
    fun asBoolOp(): BooleanOpExpression = boolOp.getOrThrow("boolOp")

    /**
     * Numeric expression: applies an arithmetic operator to two sub-expressions.
     *
     * Useful for derived numeric checks, e.g. `cart_total + shipping > 50`. Both operands should
     * resolve to numbers at runtime.
     */
    fun asArithmetic(): ArithmeticExpression = arithmetic.getOrThrow("arithmetic")

    /**
     * Reference a dynamic variable by name.
     *
     * Resolved at runtime from the assistant's dynamic-variables context (see
     * `Assistant.dynamic_variables` and the dynamic-variables webhook).
     */
    fun asVariable(): Variable = variable.getOrThrow("variable")

    /** Constant string value. */
    fun asStringLiteral(): StringLiteral = stringLiteral.getOrThrow("stringLiteral")

    /** Constant numeric value (float; integers are accepted and stored as float). */
    fun asNumberLiteral(): NumberLiteral = numberLiteral.getOrThrow("numberLiteral")

    /** Constant boolean value. Useful for unconditional ('always') edges. */
    fun asBoolLiteral(): BoolLiteral = boolLiteral.getOrThrow("boolLiteral")

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
     * Optional<String> result = expression.accept(new Expression.Visitor<Optional<String>>() {
     *     @Override
     *     public Optional<String> visitComparison(ComparisonExpression comparison) {
     *         return Optional.of(comparison.toString());
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
            comparison != null -> visitor.visitComparison(comparison)
            boolOp != null -> visitor.visitBoolOp(boolOp)
            arithmetic != null -> visitor.visitArithmetic(arithmetic)
            variable != null -> visitor.visitVariable(variable)
            stringLiteral != null -> visitor.visitStringLiteral(stringLiteral)
            numberLiteral != null -> visitor.visitNumberLiteral(numberLiteral)
            boolLiteral != null -> visitor.visitBoolLiteral(boolLiteral)
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
    fun validate(): Expression = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitComparison(comparison: ComparisonExpression) {
                    comparison.validate()
                }

                override fun visitBoolOp(boolOp: BooleanOpExpression) {
                    boolOp.validate()
                }

                override fun visitArithmetic(arithmetic: ArithmeticExpression) {
                    arithmetic.validate()
                }

                override fun visitVariable(variable: Variable) {
                    variable.validate()
                }

                override fun visitStringLiteral(stringLiteral: StringLiteral) {
                    stringLiteral.validate()
                }

                override fun visitNumberLiteral(numberLiteral: NumberLiteral) {
                    numberLiteral.validate()
                }

                override fun visitBoolLiteral(boolLiteral: BoolLiteral) {
                    boolLiteral.validate()
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
                override fun visitComparison(comparison: ComparisonExpression) =
                    comparison.validity()

                override fun visitBoolOp(boolOp: BooleanOpExpression) = boolOp.validity()

                override fun visitArithmetic(arithmetic: ArithmeticExpression) =
                    arithmetic.validity()

                override fun visitVariable(variable: Variable) = variable.validity()

                override fun visitStringLiteral(stringLiteral: StringLiteral) =
                    stringLiteral.validity()

                override fun visitNumberLiteral(numberLiteral: NumberLiteral) =
                    numberLiteral.validity()

                override fun visitBoolLiteral(boolLiteral: BoolLiteral) = boolLiteral.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Expression &&
            comparison == other.comparison &&
            boolOp == other.boolOp &&
            arithmetic == other.arithmetic &&
            variable == other.variable &&
            stringLiteral == other.stringLiteral &&
            numberLiteral == other.numberLiteral &&
            boolLiteral == other.boolLiteral
    }

    override fun hashCode(): Int =
        Objects.hash(
            comparison,
            boolOp,
            arithmetic,
            variable,
            stringLiteral,
            numberLiteral,
            boolLiteral,
        )

    override fun toString(): String =
        when {
            comparison != null -> "Expression{comparison=$comparison}"
            boolOp != null -> "Expression{boolOp=$boolOp}"
            arithmetic != null -> "Expression{arithmetic=$arithmetic}"
            variable != null -> "Expression{variable=$variable}"
            stringLiteral != null -> "Expression{stringLiteral=$stringLiteral}"
            numberLiteral != null -> "Expression{numberLiteral=$numberLiteral}"
            boolLiteral != null -> "Expression{boolLiteral=$boolLiteral}"
            _json != null -> "Expression{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid Expression")
        }

    companion object {

        /**
         * Compare two sub-expressions with a relational or membership operator.
         *
         * Evaluates to a boolean. Used in edge conditions to gate transitions on runtime values,
         * e.g. `user_age >= 18` or `tier == "gold"`.
         */
        @JvmStatic
        fun ofComparison(comparison: ComparisonExpression) = Expression(comparison = comparison)

        /**
         * Combine sub-expressions with a logical operator (`and` / `or` / `not`).
         *
         * `and` and `or` accept two or more operands; `not` accepts exactly one.
         */
        @JvmStatic fun ofBoolOp(boolOp: BooleanOpExpression) = Expression(boolOp = boolOp)

        /**
         * Numeric expression: applies an arithmetic operator to two sub-expressions.
         *
         * Useful for derived numeric checks, e.g. `cart_total + shipping > 50`. Both operands
         * should resolve to numbers at runtime.
         */
        @JvmStatic
        fun ofArithmetic(arithmetic: ArithmeticExpression) = Expression(arithmetic = arithmetic)

        /**
         * Reference a dynamic variable by name.
         *
         * Resolved at runtime from the assistant's dynamic-variables context (see
         * `Assistant.dynamic_variables` and the dynamic-variables webhook).
         */
        @JvmStatic fun ofVariable(variable: Variable) = Expression(variable = variable)

        /** Constant string value. */
        @JvmStatic
        fun ofStringLiteral(stringLiteral: StringLiteral) =
            Expression(stringLiteral = stringLiteral)

        /** Constant numeric value (float; integers are accepted and stored as float). */
        @JvmStatic
        fun ofNumberLiteral(numberLiteral: NumberLiteral) =
            Expression(numberLiteral = numberLiteral)

        /** Constant boolean value. Useful for unconditional ('always') edges. */
        @JvmStatic
        fun ofBoolLiteral(boolLiteral: BoolLiteral) = Expression(boolLiteral = boolLiteral)
    }

    /** An interface that defines how to map each variant of [Expression] to a value of type [T]. */
    interface Visitor<out T> {

        /**
         * Compare two sub-expressions with a relational or membership operator.
         *
         * Evaluates to a boolean. Used in edge conditions to gate transitions on runtime values,
         * e.g. `user_age >= 18` or `tier == "gold"`.
         */
        fun visitComparison(comparison: ComparisonExpression): T

        /**
         * Combine sub-expressions with a logical operator (`and` / `or` / `not`).
         *
         * `and` and `or` accept two or more operands; `not` accepts exactly one.
         */
        fun visitBoolOp(boolOp: BooleanOpExpression): T

        /**
         * Numeric expression: applies an arithmetic operator to two sub-expressions.
         *
         * Useful for derived numeric checks, e.g. `cart_total + shipping > 50`. Both operands
         * should resolve to numbers at runtime.
         */
        fun visitArithmetic(arithmetic: ArithmeticExpression): T

        /**
         * Reference a dynamic variable by name.
         *
         * Resolved at runtime from the assistant's dynamic-variables context (see
         * `Assistant.dynamic_variables` and the dynamic-variables webhook).
         */
        fun visitVariable(variable: Variable): T

        /** Constant string value. */
        fun visitStringLiteral(stringLiteral: StringLiteral): T

        /** Constant numeric value (float; integers are accepted and stored as float). */
        fun visitNumberLiteral(numberLiteral: NumberLiteral): T

        /** Constant boolean value. Useful for unconditional ('always') edges. */
        fun visitBoolLiteral(boolLiteral: BoolLiteral): T

        /**
         * Maps an unknown variant of [Expression] to a value of type [T].
         *
         * An instance of [Expression] can contain an unknown variant if it was deserialized from
         * data that doesn't match any known variant. For example, if the SDK is on an older version
         * than the API, then the API may respond with new variants that the SDK is unaware of.
         *
         * @throws TelnyxInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw TelnyxInvalidDataException("Unknown Expression: $json")
        }
    }

    internal class Deserializer : BaseDeserializer<Expression>(Expression::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): Expression {
            val json = JsonValue.fromJsonNode(node)
            val type = json.asObject().getOrNull()?.get("type")?.asString()?.getOrNull()

            when (type) {
                "comparison" -> {
                    return tryDeserialize(node, jacksonTypeRef<ComparisonExpression>())?.let {
                        Expression(comparison = it, _json = json)
                    } ?: Expression(_json = json)
                }
                "bool_op" -> {
                    return tryDeserialize(node, jacksonTypeRef<BooleanOpExpression>())?.let {
                        Expression(boolOp = it, _json = json)
                    } ?: Expression(_json = json)
                }
                "arithmetic" -> {
                    return tryDeserialize(node, jacksonTypeRef<ArithmeticExpression>())?.let {
                        Expression(arithmetic = it, _json = json)
                    } ?: Expression(_json = json)
                }
                "variable" -> {
                    return tryDeserialize(node, jacksonTypeRef<Variable>())?.let {
                        Expression(variable = it, _json = json)
                    } ?: Expression(_json = json)
                }
                "string_literal" -> {
                    return tryDeserialize(node, jacksonTypeRef<StringLiteral>())?.let {
                        Expression(stringLiteral = it, _json = json)
                    } ?: Expression(_json = json)
                }
                "number_literal" -> {
                    return tryDeserialize(node, jacksonTypeRef<NumberLiteral>())?.let {
                        Expression(numberLiteral = it, _json = json)
                    } ?: Expression(_json = json)
                }
                "bool_literal" -> {
                    return tryDeserialize(node, jacksonTypeRef<BoolLiteral>())?.let {
                        Expression(boolLiteral = it, _json = json)
                    } ?: Expression(_json = json)
                }
            }

            return Expression(_json = json)
        }
    }

    internal class Serializer : BaseSerializer<Expression>(Expression::class) {

        override fun serialize(
            value: Expression,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.comparison != null -> generator.writeObject(value.comparison)
                value.boolOp != null -> generator.writeObject(value.boolOp)
                value.arithmetic != null -> generator.writeObject(value.arithmetic)
                value.variable != null -> generator.writeObject(value.variable)
                value.stringLiteral != null -> generator.writeObject(value.stringLiteral)
                value.numberLiteral != null -> generator.writeObject(value.numberLiteral)
                value.boolLiteral != null -> generator.writeObject(value.boolLiteral)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid Expression")
            }
        }
    }

    /**
     * Reference a dynamic variable by name.
     *
     * Resolved at runtime from the assistant's dynamic-variables context (see
     * `Assistant.dynamic_variables` and the dynamic-variables webhook).
     */
    class Variable
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val name: JsonField<String>,
        private val type: JsonValue,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
        ) : this(name, type, mutableMapOf())

        /**
         * Variable name to look up in the runtime context.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * Expected to always return the following:
         * ```java
         * JsonValue.from("variable")
         * ```
         *
         * However, this method can be useful for debugging and logging (e.g. if the server
         * responded with an unexpected value).
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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
             * Returns a mutable builder for constructing an instance of [Variable].
             *
             * The following fields are required:
             * ```java
             * .name()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Variable]. */
        class Builder internal constructor() {

            private var name: JsonField<String>? = null
            private var type: JsonValue = JsonValue.from("variable")
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(variable: Variable) = apply {
                name = variable.name
                type = variable.type
                additionalProperties = variable.additionalProperties.toMutableMap()
            }

            /** Variable name to look up in the runtime context. */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /**
             * Sets the field to an arbitrary JSON value.
             *
             * It is usually unnecessary to call this method because the field defaults to the
             * following:
             * ```java
             * JsonValue.from("variable")
             * ```
             *
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * Returns an immutable instance of [Variable].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .name()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Variable =
                Variable(checkRequired("name", name), type, additionalProperties.toMutableMap())
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
        fun validate(): Variable = apply {
            if (validated) {
                return@apply
            }

            name()
            _type().let {
                if (it != JsonValue.from("variable")) {
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (name.asKnown().isPresent) 1 else 0) +
                type.let { if (it == JsonValue.from("variable")) 1 else 0 }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Variable &&
                name == other.name &&
                type == other.type &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(name, type, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Variable{name=$name, type=$type, additionalProperties=$additionalProperties}"
    }

    /** Constant string value. */
    class StringLiteral
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val type: JsonValue,
        private val value: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
            @JsonProperty("value") @ExcludeMissing value: JsonField<String> = JsonMissing.of(),
        ) : this(type, value, mutableMapOf())

        /**
         * Expected to always return the following:
         * ```java
         * JsonValue.from("string_literal")
         * ```
         *
         * However, this method can be useful for debugging and logging (e.g. if the server
         * responded with an unexpected value).
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

        /**
         * Literal string value.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun value(): String = value.getRequired("value")

        /**
         * Returns the raw JSON value of [value].
         *
         * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<String> = value

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
             * Returns a mutable builder for constructing an instance of [StringLiteral].
             *
             * The following fields are required:
             * ```java
             * .value()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [StringLiteral]. */
        class Builder internal constructor() {

            private var type: JsonValue = JsonValue.from("string_literal")
            private var value: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(stringLiteral: StringLiteral) = apply {
                type = stringLiteral.type
                value = stringLiteral.value
                additionalProperties = stringLiteral.additionalProperties.toMutableMap()
            }

            /**
             * Sets the field to an arbitrary JSON value.
             *
             * It is usually unnecessary to call this method because the field defaults to the
             * following:
             * ```java
             * JsonValue.from("string_literal")
             * ```
             *
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun type(type: JsonValue) = apply { this.type = type }

            /** Literal string value. */
            fun value(value: String) = value(JsonField.of(value))

            /**
             * Sets [Builder.value] to an arbitrary JSON value.
             *
             * You should usually call [Builder.value] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun value(value: JsonField<String>) = apply { this.value = value }

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
             * Returns an immutable instance of [StringLiteral].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .value()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): StringLiteral =
                StringLiteral(
                    type,
                    checkRequired("value", value),
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
        fun validate(): StringLiteral = apply {
            if (validated) {
                return@apply
            }

            _type().let {
                if (it != JsonValue.from("string_literal")) {
                    throw TelnyxInvalidDataException("'type' is invalid, received $it")
                }
            }
            value()
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
            type.let { if (it == JsonValue.from("string_literal")) 1 else 0 } +
                (if (value.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is StringLiteral &&
                type == other.type &&
                value == other.value &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(type, value, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "StringLiteral{type=$type, value=$value, additionalProperties=$additionalProperties}"
    }

    /** Constant numeric value (float; integers are accepted and stored as float). */
    class NumberLiteral
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val type: JsonValue,
        private val value: JsonField<Double>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
            @JsonProperty("value") @ExcludeMissing value: JsonField<Double> = JsonMissing.of(),
        ) : this(type, value, mutableMapOf())

        /**
         * Expected to always return the following:
         * ```java
         * JsonValue.from("number_literal")
         * ```
         *
         * However, this method can be useful for debugging and logging (e.g. if the server
         * responded with an unexpected value).
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

        /**
         * Literal numeric value.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun value(): Double = value.getRequired("value")

        /**
         * Returns the raw JSON value of [value].
         *
         * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<Double> = value

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
             * Returns a mutable builder for constructing an instance of [NumberLiteral].
             *
             * The following fields are required:
             * ```java
             * .value()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [NumberLiteral]. */
        class Builder internal constructor() {

            private var type: JsonValue = JsonValue.from("number_literal")
            private var value: JsonField<Double>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(numberLiteral: NumberLiteral) = apply {
                type = numberLiteral.type
                value = numberLiteral.value
                additionalProperties = numberLiteral.additionalProperties.toMutableMap()
            }

            /**
             * Sets the field to an arbitrary JSON value.
             *
             * It is usually unnecessary to call this method because the field defaults to the
             * following:
             * ```java
             * JsonValue.from("number_literal")
             * ```
             *
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun type(type: JsonValue) = apply { this.type = type }

            /** Literal numeric value. */
            fun value(value: Double) = value(JsonField.of(value))

            /**
             * Sets [Builder.value] to an arbitrary JSON value.
             *
             * You should usually call [Builder.value] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun value(value: JsonField<Double>) = apply { this.value = value }

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
             * Returns an immutable instance of [NumberLiteral].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .value()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): NumberLiteral =
                NumberLiteral(
                    type,
                    checkRequired("value", value),
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
        fun validate(): NumberLiteral = apply {
            if (validated) {
                return@apply
            }

            _type().let {
                if (it != JsonValue.from("number_literal")) {
                    throw TelnyxInvalidDataException("'type' is invalid, received $it")
                }
            }
            value()
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
            type.let { if (it == JsonValue.from("number_literal")) 1 else 0 } +
                (if (value.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is NumberLiteral &&
                type == other.type &&
                value == other.value &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(type, value, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "NumberLiteral{type=$type, value=$value, additionalProperties=$additionalProperties}"
    }

    /** Constant boolean value. Useful for unconditional ('always') edges. */
    class BoolLiteral
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val type: JsonValue,
        private val value: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
            @JsonProperty("value") @ExcludeMissing value: JsonField<Boolean> = JsonMissing.of(),
        ) : this(type, value, mutableMapOf())

        /**
         * Expected to always return the following:
         * ```java
         * JsonValue.from("bool_literal")
         * ```
         *
         * However, this method can be useful for debugging and logging (e.g. if the server
         * responded with an unexpected value).
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

        /**
         * Literal boolean value.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun value(): Boolean = value.getRequired("value")

        /**
         * Returns the raw JSON value of [value].
         *
         * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<Boolean> = value

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
             * Returns a mutable builder for constructing an instance of [BoolLiteral].
             *
             * The following fields are required:
             * ```java
             * .value()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [BoolLiteral]. */
        class Builder internal constructor() {

            private var type: JsonValue = JsonValue.from("bool_literal")
            private var value: JsonField<Boolean>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(boolLiteral: BoolLiteral) = apply {
                type = boolLiteral.type
                value = boolLiteral.value
                additionalProperties = boolLiteral.additionalProperties.toMutableMap()
            }

            /**
             * Sets the field to an arbitrary JSON value.
             *
             * It is usually unnecessary to call this method because the field defaults to the
             * following:
             * ```java
             * JsonValue.from("bool_literal")
             * ```
             *
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun type(type: JsonValue) = apply { this.type = type }

            /** Literal boolean value. */
            fun value(value: Boolean) = value(JsonField.of(value))

            /**
             * Sets [Builder.value] to an arbitrary JSON value.
             *
             * You should usually call [Builder.value] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun value(value: JsonField<Boolean>) = apply { this.value = value }

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
             * Returns an immutable instance of [BoolLiteral].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .value()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): BoolLiteral =
                BoolLiteral(
                    type,
                    checkRequired("value", value),
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
        fun validate(): BoolLiteral = apply {
            if (validated) {
                return@apply
            }

            _type().let {
                if (it != JsonValue.from("bool_literal")) {
                    throw TelnyxInvalidDataException("'type' is invalid, received $it")
                }
            }
            value()
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
            type.let { if (it == JsonValue.from("bool_literal")) 1 else 0 } +
                (if (value.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is BoolLiteral &&
                type == other.type &&
                value == other.value &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(type, value, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "BoolLiteral{type=$type, value=$value, additionalProperties=$additionalProperties}"
    }
}
