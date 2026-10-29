// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.browsersessions.actions

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
import com.telnyx.sdk.core.allMaxBy
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.getOrThrow
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Wait for a condition before continuing. */
class WaitForAction
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val condition: JsonField<Condition>,
    private val type: JsonValue,
    private val idempotencyKey: JsonField<String>,
    private val includeObservation: JsonField<Boolean>,
    private val timeoutMs: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("condition")
        @ExcludeMissing
        condition: JsonField<Condition> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
        @JsonProperty("idempotency_key")
        @ExcludeMissing
        idempotencyKey: JsonField<String> = JsonMissing.of(),
        @JsonProperty("include_observation")
        @ExcludeMissing
        includeObservation: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("timeout_ms") @ExcludeMissing timeoutMs: JsonField<Long> = JsonMissing.of(),
    ) : this(condition, type, idempotencyKey, includeObservation, timeoutMs, mutableMapOf())

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun condition(): Condition = condition.getRequired("condition")

    /**
     * Expected to always return the following:
     * ```java
     * JsonValue.from("wait_for")
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
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun timeoutMs(): Optional<Long> = timeoutMs.getOptional("timeout_ms")

    /**
     * Returns the raw JSON value of [condition].
     *
     * Unlike [condition], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("condition") @ExcludeMissing fun _condition(): JsonField<Condition> = condition

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

    /**
     * Returns the raw JSON value of [timeoutMs].
     *
     * Unlike [timeoutMs], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("timeout_ms") @ExcludeMissing fun _timeoutMs(): JsonField<Long> = timeoutMs

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
         * Returns a mutable builder for constructing an instance of [WaitForAction].
         *
         * The following fields are required:
         * ```java
         * .condition()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [WaitForAction]. */
    class Builder internal constructor() {

        private var condition: JsonField<Condition>? = null
        private var type: JsonValue = JsonValue.from("wait_for")
        private var idempotencyKey: JsonField<String> = JsonMissing.of()
        private var includeObservation: JsonField<Boolean> = JsonMissing.of()
        private var timeoutMs: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(waitForAction: WaitForAction) = apply {
            condition = waitForAction.condition
            type = waitForAction.type
            idempotencyKey = waitForAction.idempotencyKey
            includeObservation = waitForAction.includeObservation
            timeoutMs = waitForAction.timeoutMs
            additionalProperties = waitForAction.additionalProperties.toMutableMap()
        }

        fun condition(condition: Condition) = condition(JsonField.of(condition))

        /**
         * Sets [Builder.condition] to an arbitrary JSON value.
         *
         * You should usually call [Builder.condition] with a well-typed [Condition] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun condition(condition: JsonField<Condition>) = apply { this.condition = condition }

        /** Alias for calling [condition] with `Condition.ofUnionMember0(unionMember0)`. */
        fun condition(unionMember0: Condition.UnionMember0) =
            condition(Condition.ofUnionMember0(unionMember0))

        /** Alias for calling [condition] with `Condition.ofUnionMember1(unionMember1)`. */
        fun condition(unionMember1: Condition.UnionMember1) =
            condition(Condition.ofUnionMember1(unionMember1))

        /** Alias for calling [condition] with `Condition.ofUnionMember2(unionMember2)`. */
        fun condition(unionMember2: Condition.UnionMember2) =
            condition(Condition.ofUnionMember2(unionMember2))

        /** Alias for calling [condition] with `Condition.ofUnionMember3()`. */
        fun conditionUnionMember3() = condition(Condition.ofUnionMember3())

        /**
         * Sets the field to an arbitrary JSON value.
         *
         * It is usually unnecessary to call this method because the field defaults to the
         * following:
         * ```java
         * JsonValue.from("wait_for")
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

        fun timeoutMs(timeoutMs: Long) = timeoutMs(JsonField.of(timeoutMs))

        /**
         * Sets [Builder.timeoutMs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timeoutMs] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun timeoutMs(timeoutMs: JsonField<Long>) = apply { this.timeoutMs = timeoutMs }

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
         * Returns an immutable instance of [WaitForAction].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .condition()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): WaitForAction =
            WaitForAction(
                checkRequired("condition", condition),
                type,
                idempotencyKey,
                includeObservation,
                timeoutMs,
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
    fun validate(): WaitForAction = apply {
        if (validated) {
            return@apply
        }

        condition().validate()
        _type().let {
            if (it != JsonValue.from("wait_for")) {
                throw TelnyxInvalidDataException("'type' is invalid, received $it")
            }
        }
        idempotencyKey()
        includeObservation()
        timeoutMs()
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
        (condition.asKnown().getOrNull()?.validity() ?: 0) +
            type.let { if (it == JsonValue.from("wait_for")) 1 else 0 } +
            (if (idempotencyKey.asKnown().isPresent) 1 else 0) +
            (if (includeObservation.asKnown().isPresent) 1 else 0) +
            (if (timeoutMs.asKnown().isPresent) 1 else 0)

    @JsonDeserialize(using = Condition.Deserializer::class)
    @JsonSerialize(using = Condition.Serializer::class)
    class Condition
    private constructor(
        private val unionMember0: UnionMember0? = null,
        private val unionMember1: UnionMember1? = null,
        private val unionMember2: UnionMember2? = null,
        private val unionMember3: JsonValue? = null,
        private val _json: JsonValue? = null,
    ) {

        fun unionMember0(): Optional<UnionMember0> = Optional.ofNullable(unionMember0)

        fun unionMember1(): Optional<UnionMember1> = Optional.ofNullable(unionMember1)

        fun unionMember2(): Optional<UnionMember2> = Optional.ofNullable(unionMember2)

        fun unionMember3(): Optional<JsonValue> = Optional.ofNullable(unionMember3)

        fun isUnionMember0(): Boolean = unionMember0 != null

        fun isUnionMember1(): Boolean = unionMember1 != null

        fun isUnionMember2(): Boolean = unionMember2 != null

        fun isUnionMember3(): Boolean = unionMember3 != null

        fun asUnionMember0(): UnionMember0 = unionMember0.getOrThrow("unionMember0")

        fun asUnionMember1(): UnionMember1 = unionMember1.getOrThrow("unionMember1")

        fun asUnionMember2(): UnionMember2 = unionMember2.getOrThrow("unionMember2")

        fun asUnionMember3(): JsonValue = unionMember3.getOrThrow("unionMember3")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        /**
         * Maps this instance's current variant to a value of type [T] using the given [visitor].
         *
         * Note that this method is _not_ forwards compatible with new variants from the API, unless
         * [visitor] overrides [Visitor.unknown]. To handle variants not known to this version of
         * the SDK gracefully, consider overriding [Visitor.unknown]:
         * ```java
         * import com.telnyx.sdk.core.JsonValue;
         * import java.util.Optional;
         *
         * Optional<String> result = condition.accept(new Condition.Visitor<Optional<String>>() {
         *     @Override
         *     public Optional<String> visitUnionMember0(UnionMember0 unionMember0) {
         *         return Optional.of(unionMember0.toString());
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
         * @throws TelnyxInvalidDataException if [Visitor.unknown] is not overridden in [visitor]
         *   and the current variant is unknown.
         */
        fun <T> accept(visitor: Visitor<T>): T =
            when {
                unionMember0 != null -> visitor.visitUnionMember0(unionMember0)
                unionMember1 != null -> visitor.visitUnionMember1(unionMember1)
                unionMember2 != null -> visitor.visitUnionMember2(unionMember2)
                unionMember3 != null -> visitor.visitUnionMember3(unionMember3)
                else -> visitor.unknown(_json)
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
        fun validate(): Condition = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitUnionMember0(unionMember0: UnionMember0) {
                        unionMember0.validate()
                    }

                    override fun visitUnionMember1(unionMember1: UnionMember1) {
                        unionMember1.validate()
                    }

                    override fun visitUnionMember2(unionMember2: UnionMember2) {
                        unionMember2.validate()
                    }

                    override fun visitUnionMember3(unionMember3: JsonValue) {
                        unionMember3.let {
                            if (it != JsonValue.from(mapOf("kind" to "dom_stable"))) {
                                throw TelnyxInvalidDataException(
                                    "'unionMember3' is invalid, received $it"
                                )
                            }
                        }
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            accept(
                object : Visitor<Int> {
                    override fun visitUnionMember0(unionMember0: UnionMember0) =
                        unionMember0.validity()

                    override fun visitUnionMember1(unionMember1: UnionMember1) =
                        unionMember1.validity()

                    override fun visitUnionMember2(unionMember2: UnionMember2) =
                        unionMember2.validity()

                    override fun visitUnionMember3(unionMember3: JsonValue) =
                        unionMember3.let {
                            if (it == JsonValue.from(mapOf("kind" to "dom_stable"))) 1 else 0
                        }

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Condition &&
                unionMember0 == other.unionMember0 &&
                unionMember1 == other.unionMember1 &&
                unionMember2 == other.unionMember2 &&
                unionMember3 == other.unionMember3
        }

        override fun hashCode(): Int =
            Objects.hash(unionMember0, unionMember1, unionMember2, unionMember3)

        override fun toString(): String =
            when {
                unionMember0 != null -> "Condition{unionMember0=$unionMember0}"
                unionMember1 != null -> "Condition{unionMember1=$unionMember1}"
                unionMember2 != null -> "Condition{unionMember2=$unionMember2}"
                unionMember3 != null -> "Condition{unionMember3=$unionMember3}"
                _json != null -> "Condition{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Condition")
            }

        companion object {

            @JvmStatic
            fun ofUnionMember0(unionMember0: UnionMember0) = Condition(unionMember0 = unionMember0)

            @JvmStatic
            fun ofUnionMember1(unionMember1: UnionMember1) = Condition(unionMember1 = unionMember1)

            @JvmStatic
            fun ofUnionMember2(unionMember2: UnionMember2) = Condition(unionMember2 = unionMember2)

            @JvmStatic
            fun ofUnionMember3() =
                Condition(unionMember3 = JsonValue.from(mapOf("kind" to "dom_stable")))
        }

        /**
         * An interface that defines how to map each variant of [Condition] to a value of type [T].
         */
        interface Visitor<out T> {

            fun visitUnionMember0(unionMember0: UnionMember0): T

            fun visitUnionMember1(unionMember1: UnionMember1): T

            fun visitUnionMember2(unionMember2: UnionMember2): T

            fun visitUnionMember3(unionMember3: JsonValue): T

            /**
             * Maps an unknown variant of [Condition] to a value of type [T].
             *
             * An instance of [Condition] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an older
             * version than the API, then the API may respond with new variants that the SDK is
             * unaware of.
             *
             * @throws TelnyxInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw TelnyxInvalidDataException("Unknown Condition: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Condition>(Condition::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Condition {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<JsonValue>())
                                ?.let { Condition(unionMember3 = it, _json = json) }
                                ?.takeIf { it.isValid() },
                            tryDeserialize(node, jacksonTypeRef<UnionMember0>())?.let {
                                Condition(unionMember0 = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<UnionMember1>())?.let {
                                Condition(unionMember1 = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<UnionMember2>())?.let {
                                Condition(unionMember2 = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> Condition(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<Condition>(Condition::class) {

            override fun serialize(
                value: Condition,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.unionMember0 != null -> generator.writeObject(value.unionMember0)
                    value.unionMember1 != null -> generator.writeObject(value.unionMember1)
                    value.unionMember2 != null -> generator.writeObject(value.unionMember2)
                    value.unionMember3 != null -> generator.writeObject(value.unionMember3)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Condition")
                }
            }
        }

        class UnionMember0
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val kind: JsonValue,
            private val pattern: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("kind") @ExcludeMissing kind: JsonValue = JsonMissing.of(),
                @JsonProperty("pattern")
                @ExcludeMissing
                pattern: JsonField<String> = JsonMissing.of(),
            ) : this(kind, pattern, mutableMapOf())

            /**
             * Expected to always return the following:
             * ```java
             * JsonValue.from("url_pattern")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("kind") @ExcludeMissing fun _kind(): JsonValue = kind

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun pattern(): String = pattern.getRequired("pattern")

            /**
             * Returns the raw JSON value of [pattern].
             *
             * Unlike [pattern], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("pattern") @ExcludeMissing fun _pattern(): JsonField<String> = pattern

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
                 * Returns a mutable builder for constructing an instance of [UnionMember0].
                 *
                 * The following fields are required:
                 * ```java
                 * .pattern()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [UnionMember0]. */
            class Builder internal constructor() {

                private var kind: JsonValue = JsonValue.from("url_pattern")
                private var pattern: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(unionMember0: UnionMember0) = apply {
                    kind = unionMember0.kind
                    pattern = unionMember0.pattern
                    additionalProperties = unionMember0.additionalProperties.toMutableMap()
                }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```java
                 * JsonValue.from("url_pattern")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun kind(kind: JsonValue) = apply { this.kind = kind }

                fun pattern(pattern: String) = pattern(JsonField.of(pattern))

                /**
                 * Sets [Builder.pattern] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.pattern] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun pattern(pattern: JsonField<String>) = apply { this.pattern = pattern }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [UnionMember0].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .pattern()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): UnionMember0 =
                    UnionMember0(
                        kind,
                        checkRequired("pattern", pattern),
                        additionalProperties.toMutableMap(),
                    )
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
            fun validate(): UnionMember0 = apply {
                if (validated) {
                    return@apply
                }

                _kind().let {
                    if (it != JsonValue.from("url_pattern")) {
                        throw TelnyxInvalidDataException("'kind' is invalid, received $it")
                    }
                }
                pattern()
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
                kind.let { if (it == JsonValue.from("url_pattern")) 1 else 0 } +
                    (if (pattern.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is UnionMember0 &&
                    kind == other.kind &&
                    pattern == other.pattern &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(kind, pattern, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "UnionMember0{kind=$kind, pattern=$pattern, additionalProperties=$additionalProperties}"
        }

        class UnionMember1
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val kind: JsonValue,
            private val observationId: JsonField<String>,
            private val ref: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("kind") @ExcludeMissing kind: JsonValue = JsonMissing.of(),
                @JsonProperty("observation_id")
                @ExcludeMissing
                observationId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("ref") @ExcludeMissing ref: JsonField<String> = JsonMissing.of(),
            ) : this(kind, observationId, ref, mutableMapOf())

            /**
             * Expected to always return the following:
             * ```java
             * JsonValue.from("ref")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("kind") @ExcludeMissing fun _kind(): JsonValue = kind

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun observationId(): String = observationId.getRequired("observation_id")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun ref(): String = ref.getRequired("ref")

            /**
             * Returns the raw JSON value of [observationId].
             *
             * Unlike [observationId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("observation_id")
            @ExcludeMissing
            fun _observationId(): JsonField<String> = observationId

            /**
             * Returns the raw JSON value of [ref].
             *
             * Unlike [ref], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("ref") @ExcludeMissing fun _ref(): JsonField<String> = ref

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
                 * Returns a mutable builder for constructing an instance of [UnionMember1].
                 *
                 * The following fields are required:
                 * ```java
                 * .observationId()
                 * .ref()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [UnionMember1]. */
            class Builder internal constructor() {

                private var kind: JsonValue = JsonValue.from("ref")
                private var observationId: JsonField<String>? = null
                private var ref: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(unionMember1: UnionMember1) = apply {
                    kind = unionMember1.kind
                    observationId = unionMember1.observationId
                    ref = unionMember1.ref
                    additionalProperties = unionMember1.additionalProperties.toMutableMap()
                }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```java
                 * JsonValue.from("ref")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun kind(kind: JsonValue) = apply { this.kind = kind }

                fun observationId(observationId: String) =
                    observationId(JsonField.of(observationId))

                /**
                 * Sets [Builder.observationId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.observationId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun observationId(observationId: JsonField<String>) = apply {
                    this.observationId = observationId
                }

                fun ref(ref: String) = ref(JsonField.of(ref))

                /**
                 * Sets [Builder.ref] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.ref] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun ref(ref: JsonField<String>) = apply { this.ref = ref }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [UnionMember1].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .observationId()
                 * .ref()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): UnionMember1 =
                    UnionMember1(
                        kind,
                        checkRequired("observationId", observationId),
                        checkRequired("ref", ref),
                        additionalProperties.toMutableMap(),
                    )
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
            fun validate(): UnionMember1 = apply {
                if (validated) {
                    return@apply
                }

                _kind().let {
                    if (it != JsonValue.from("ref")) {
                        throw TelnyxInvalidDataException("'kind' is invalid, received $it")
                    }
                }
                observationId()
                ref()
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
                kind.let { if (it == JsonValue.from("ref")) 1 else 0 } +
                    (if (observationId.asKnown().isPresent) 1 else 0) +
                    (if (ref.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is UnionMember1 &&
                    kind == other.kind &&
                    observationId == other.observationId &&
                    ref == other.ref &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(kind, observationId, ref, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "UnionMember1{kind=$kind, observationId=$observationId, ref=$ref, additionalProperties=$additionalProperties}"
        }

        class UnionMember2
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val kind: JsonValue,
            private val text: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("kind") @ExcludeMissing kind: JsonValue = JsonMissing.of(),
                @JsonProperty("text") @ExcludeMissing text: JsonField<String> = JsonMissing.of(),
            ) : this(kind, text, mutableMapOf())

            /**
             * Expected to always return the following:
             * ```java
             * JsonValue.from("text")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("kind") @ExcludeMissing fun _kind(): JsonValue = kind

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun text(): String = text.getRequired("text")

            /**
             * Returns the raw JSON value of [text].
             *
             * Unlike [text], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("text") @ExcludeMissing fun _text(): JsonField<String> = text

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
                 * Returns a mutable builder for constructing an instance of [UnionMember2].
                 *
                 * The following fields are required:
                 * ```java
                 * .text()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [UnionMember2]. */
            class Builder internal constructor() {

                private var kind: JsonValue = JsonValue.from("text")
                private var text: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(unionMember2: UnionMember2) = apply {
                    kind = unionMember2.kind
                    text = unionMember2.text
                    additionalProperties = unionMember2.additionalProperties.toMutableMap()
                }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```java
                 * JsonValue.from("text")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun kind(kind: JsonValue) = apply { this.kind = kind }

                fun text(text: String) = text(JsonField.of(text))

                /**
                 * Sets [Builder.text] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.text] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun text(text: JsonField<String>) = apply { this.text = text }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [UnionMember2].
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
                fun build(): UnionMember2 =
                    UnionMember2(
                        kind,
                        checkRequired("text", text),
                        additionalProperties.toMutableMap(),
                    )
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
            fun validate(): UnionMember2 = apply {
                if (validated) {
                    return@apply
                }

                _kind().let {
                    if (it != JsonValue.from("text")) {
                        throw TelnyxInvalidDataException("'kind' is invalid, received $it")
                    }
                }
                text()
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
                kind.let { if (it == JsonValue.from("text")) 1 else 0 } +
                    (if (text.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is UnionMember2 &&
                    kind == other.kind &&
                    text == other.text &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(kind, text, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "UnionMember2{kind=$kind, text=$text, additionalProperties=$additionalProperties}"
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is WaitForAction &&
            condition == other.condition &&
            type == other.type &&
            idempotencyKey == other.idempotencyKey &&
            includeObservation == other.includeObservation &&
            timeoutMs == other.timeoutMs &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            condition,
            type,
            idempotencyKey,
            includeObservation,
            timeoutMs,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "WaitForAction{condition=$condition, type=$type, idempotencyKey=$idempotencyKey, includeObservation=$includeObservation, timeoutMs=$timeoutMs, additionalProperties=$additionalProperties}"
}
