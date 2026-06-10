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

class TransferTool
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val transfer: JsonField<Transfer>,
    private val type: JsonField<Type>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("transfer") @ExcludeMissing transfer: JsonField<Transfer> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
    ) : this(transfer, type, mutableMapOf())

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun transfer(): Transfer = transfer.getRequired("transfer")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): Type = type.getRequired("type")

    /**
     * Returns the raw JSON value of [transfer].
     *
     * Unlike [transfer], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("transfer") @ExcludeMissing fun _transfer(): JsonField<Transfer> = transfer

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
         * Returns a mutable builder for constructing an instance of [TransferTool].
         *
         * The following fields are required:
         * ```java
         * .transfer()
         * .type()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TransferTool]. */
    class Builder internal constructor() {

        private var transfer: JsonField<Transfer>? = null
        private var type: JsonField<Type>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(transferTool: TransferTool) = apply {
            transfer = transferTool.transfer
            type = transferTool.type
            additionalProperties = transferTool.additionalProperties.toMutableMap()
        }

        fun transfer(transfer: Transfer) = transfer(JsonField.of(transfer))

        /**
         * Sets [Builder.transfer] to an arbitrary JSON value.
         *
         * You should usually call [Builder.transfer] with a well-typed [Transfer] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun transfer(transfer: JsonField<Transfer>) = apply { this.transfer = transfer }

        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

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
         * Returns an immutable instance of [TransferTool].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .transfer()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): TransferTool =
            TransferTool(
                checkRequired("transfer", transfer),
                checkRequired("type", type),
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
    fun validate(): TransferTool = apply {
        if (validated) {
            return@apply
        }

        transfer().validate()
        type().validate()
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
        (transfer.asKnown().getOrNull()?.validity() ?: 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0)

    class Transfer
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val from: JsonField<String>,
        private val targets: JsonField<Targets>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("from") @ExcludeMissing from: JsonField<String> = JsonMissing.of(),
            @JsonProperty("targets") @ExcludeMissing targets: JsonField<Targets> = JsonMissing.of(),
        ) : this(from, targets, mutableMapOf())

        /**
         * Number or SIP URI placing the call.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun from(): String = from.getRequired("from")

        /**
         * The different possible targets of the transfer. The assistant will be able to choose one
         * of the targets to transfer the call to. This can also be a dynamic variable string like
         * `{{ targets }}` where `targets` is returned by the dynamic variables webhook and resolves
         * to an array of target objects at runtime.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun targets(): Targets = targets.getRequired("targets")

        /**
         * Returns the raw JSON value of [from].
         *
         * Unlike [from], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("from") @ExcludeMissing fun _from(): JsonField<String> = from

        /**
         * Returns the raw JSON value of [targets].
         *
         * Unlike [targets], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("targets") @ExcludeMissing fun _targets(): JsonField<Targets> = targets

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
             * Returns a mutable builder for constructing an instance of [Transfer].
             *
             * The following fields are required:
             * ```java
             * .from()
             * .targets()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Transfer]. */
        class Builder internal constructor() {

            private var from: JsonField<String>? = null
            private var targets: JsonField<Targets>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(transfer: Transfer) = apply {
                from = transfer.from
                targets = transfer.targets
                additionalProperties = transfer.additionalProperties.toMutableMap()
            }

            /** Number or SIP URI placing the call. */
            fun from(from: String) = from(JsonField.of(from))

            /**
             * Sets [Builder.from] to an arbitrary JSON value.
             *
             * You should usually call [Builder.from] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun from(from: JsonField<String>) = apply { this.from = from }

            /**
             * The different possible targets of the transfer. The assistant will be able to choose
             * one of the targets to transfer the call to. This can also be a dynamic variable
             * string like `{{ targets }}` where `targets` is returned by the dynamic variables
             * webhook and resolves to an array of target objects at runtime.
             */
            fun targets(targets: Targets) = targets(JsonField.of(targets))

            /**
             * Sets [Builder.targets] to an arbitrary JSON value.
             *
             * You should usually call [Builder.targets] with a well-typed [Targets] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun targets(targets: JsonField<Targets>) = apply { this.targets = targets }

            /**
             * Alias for calling [targets] with
             * `Targets.ofUnnamedSchemaWithArrayParent2s(unnamedSchemaWithArrayParent2s)`.
             */
            fun targetsOfUnnamedSchemaWithArrayParent2s(
                unnamedSchemaWithArrayParent2s: List<Targets.UnnamedSchemaWithArrayParent2>
            ) = targets(Targets.ofUnnamedSchemaWithArrayParent2s(unnamedSchemaWithArrayParent2s))

            /** Alias for calling [targets] with `Targets.ofString(string)`. */
            fun targets(string: String) = targets(Targets.ofString(string))

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
             * Returns an immutable instance of [Transfer].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .from()
             * .targets()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Transfer =
                Transfer(
                    checkRequired("from", from),
                    checkRequired("targets", targets),
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
        fun validate(): Transfer = apply {
            if (validated) {
                return@apply
            }

            from()
            targets().validate()
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
            (if (from.asKnown().isPresent) 1 else 0) +
                (targets.asKnown().getOrNull()?.validity() ?: 0)

        /**
         * The different possible targets of the transfer. The assistant will be able to choose one
         * of the targets to transfer the call to. This can also be a dynamic variable string like
         * `{{ targets }}` where `targets` is returned by the dynamic variables webhook and resolves
         * to an array of target objects at runtime.
         */
        @JsonDeserialize(using = Targets.Deserializer::class)
        @JsonSerialize(using = Targets.Serializer::class)
        class Targets
        private constructor(
            private val unnamedSchemaWithArrayParent2s: List<UnnamedSchemaWithArrayParent2>? = null,
            private val string: String? = null,
            private val _json: JsonValue? = null,
        ) {

            fun unnamedSchemaWithArrayParent2s(): Optional<List<UnnamedSchemaWithArrayParent2>> =
                Optional.ofNullable(unnamedSchemaWithArrayParent2s)

            /**
             * A dynamic variable string like `{{ targets }}` where `targets` is returned by the
             * dynamic variables webhook and resolves to an array of target objects at runtime.
             */
            fun string(): Optional<String> = Optional.ofNullable(string)

            fun isUnnamedSchemaWithArrayParent2s(): Boolean = unnamedSchemaWithArrayParent2s != null

            fun isString(): Boolean = string != null

            fun asUnnamedSchemaWithArrayParent2s(): List<UnnamedSchemaWithArrayParent2> =
                unnamedSchemaWithArrayParent2s.getOrThrow("unnamedSchemaWithArrayParent2s")

            /**
             * A dynamic variable string like `{{ targets }}` where `targets` is returned by the
             * dynamic variables webhook and resolves to an array of target objects at runtime.
             */
            fun asString(): String = string.getOrThrow("string")

            fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

            /**
             * Maps this instance's current variant to a value of type [T] using the given
             * [visitor].
             *
             * Note that this method is _not_ forwards compatible with new variants from the API,
             * unless [visitor] overrides [Visitor.unknown]. To handle variants not known to this
             * version of the SDK gracefully, consider overriding [Visitor.unknown]:
             * ```java
             * import com.telnyx.sdk.core.JsonValue;
             * import java.util.Optional;
             *
             * Optional<String> result = targets.accept(new Targets.Visitor<Optional<String>>() {
             *     @Override
             *     public Optional<String> visitUnnamedSchemaWithArrayParent2s(List<UnnamedSchemaWithArrayParent2> unnamedSchemaWithArrayParent2s) {
             *         return Optional.of(unnamedSchemaWithArrayParent2s.toString());
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
             * @throws TelnyxInvalidDataException if [Visitor.unknown] is not overridden in
             *   [visitor] and the current variant is unknown.
             */
            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    unnamedSchemaWithArrayParent2s != null ->
                        visitor.visitUnnamedSchemaWithArrayParent2s(unnamedSchemaWithArrayParent2s)
                    string != null -> visitor.visitString(string)
                    else -> visitor.unknown(_json)
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
            fun validate(): Targets = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitUnnamedSchemaWithArrayParent2s(
                            unnamedSchemaWithArrayParent2s: List<UnnamedSchemaWithArrayParent2>
                        ) {
                            unnamedSchemaWithArrayParent2s.forEach { it.validate() }
                        }

                        override fun visitString(string: String) {}
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
                        override fun visitUnnamedSchemaWithArrayParent2s(
                            unnamedSchemaWithArrayParent2s: List<UnnamedSchemaWithArrayParent2>
                        ) = unnamedSchemaWithArrayParent2s.sumOf { it.validity().toInt() }

                        override fun visitString(string: String) = 1

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Targets &&
                    unnamedSchemaWithArrayParent2s == other.unnamedSchemaWithArrayParent2s &&
                    string == other.string
            }

            override fun hashCode(): Int = Objects.hash(unnamedSchemaWithArrayParent2s, string)

            override fun toString(): String =
                when {
                    unnamedSchemaWithArrayParent2s != null ->
                        "Targets{unnamedSchemaWithArrayParent2s=$unnamedSchemaWithArrayParent2s}"
                    string != null -> "Targets{string=$string}"
                    _json != null -> "Targets{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid Targets")
                }

            companion object {

                @JvmStatic
                fun ofUnnamedSchemaWithArrayParent2s(
                    unnamedSchemaWithArrayParent2s: List<UnnamedSchemaWithArrayParent2>
                ) =
                    Targets(
                        unnamedSchemaWithArrayParent2s =
                            unnamedSchemaWithArrayParent2s.toImmutable()
                    )

                /**
                 * A dynamic variable string like `{{ targets }}` where `targets` is returned by the
                 * dynamic variables webhook and resolves to an array of target objects at runtime.
                 */
                @JvmStatic fun ofString(string: String) = Targets(string = string)
            }

            /**
             * An interface that defines how to map each variant of [Targets] to a value of type
             * [T].
             */
            interface Visitor<out T> {

                fun visitUnnamedSchemaWithArrayParent2s(
                    unnamedSchemaWithArrayParent2s: List<UnnamedSchemaWithArrayParent2>
                ): T

                /**
                 * A dynamic variable string like `{{ targets }}` where `targets` is returned by the
                 * dynamic variables webhook and resolves to an array of target objects at runtime.
                 */
                fun visitString(string: String): T

                /**
                 * Maps an unknown variant of [Targets] to a value of type [T].
                 *
                 * An instance of [Targets] can contain an unknown variant if it was deserialized
                 * from data that doesn't match any known variant. For example, if the SDK is on an
                 * older version than the API, then the API may respond with new variants that the
                 * SDK is unaware of.
                 *
                 * @throws TelnyxInvalidDataException in the default implementation.
                 */
                fun unknown(json: JsonValue?): T {
                    throw TelnyxInvalidDataException("Unknown Targets: $json")
                }
            }

            internal class Deserializer : BaseDeserializer<Targets>(Targets::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): Targets {
                    val json = JsonValue.fromJsonNode(node)

                    val bestMatches =
                        sequenceOf(
                                tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                    Targets(string = it, _json = json)
                                },
                                tryDeserialize(
                                        node,
                                        jacksonTypeRef<List<UnnamedSchemaWithArrayParent2>>(),
                                    )
                                    ?.let {
                                        Targets(unnamedSchemaWithArrayParent2s = it, _json = json)
                                    },
                            )
                            .filterNotNull()
                            .allMaxBy { it.validity() }
                            .toList()
                    return when (bestMatches.size) {
                        // This can happen if what we're deserializing is completely incompatible
                        // with all the possible variants (e.g. deserializing from boolean).
                        0 -> Targets(_json = json)
                        1 -> bestMatches.single()
                        // If there's more than one match with the highest validity, then use the
                        // first completely valid match, or simply the first match if none are
                        // completely valid.
                        else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                    }
                }
            }

            internal class Serializer : BaseSerializer<Targets>(Targets::class) {

                override fun serialize(
                    value: Targets,
                    generator: JsonGenerator,
                    provider: SerializerProvider,
                ) {
                    when {
                        value.unnamedSchemaWithArrayParent2s != null ->
                            generator.writeObject(value.unnamedSchemaWithArrayParent2s)
                        value.string != null -> generator.writeObject(value.string)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid Targets")
                    }
                }
            }

            class UnnamedSchemaWithArrayParent2
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val to: JsonField<String>,
                private val name: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("to") @ExcludeMissing to: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
                ) : this(to, name, mutableMapOf())

                /**
                 * The destination number or SIP URI of the call.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun to(): String = to.getRequired("to")

                /**
                 * The name of the target.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun name(): Optional<String> = name.getOptional("name")

                /**
                 * Returns the raw JSON value of [to].
                 *
                 * Unlike [to], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("to") @ExcludeMissing fun _to(): JsonField<String> = to

                /**
                 * Returns the raw JSON value of [name].
                 *
                 * Unlike [name], this method doesn't throw if the JSON field has an unexpected
                 * type.
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
                     * Returns a mutable builder for constructing an instance of
                     * [UnnamedSchemaWithArrayParent2].
                     *
                     * The following fields are required:
                     * ```java
                     * .to()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [UnnamedSchemaWithArrayParent2]. */
                class Builder internal constructor() {

                    private var to: JsonField<String>? = null
                    private var name: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(
                        unnamedSchemaWithArrayParent2: UnnamedSchemaWithArrayParent2
                    ) = apply {
                        to = unnamedSchemaWithArrayParent2.to
                        name = unnamedSchemaWithArrayParent2.name
                        additionalProperties =
                            unnamedSchemaWithArrayParent2.additionalProperties.toMutableMap()
                    }

                    /** The destination number or SIP URI of the call. */
                    fun to(to: String) = to(JsonField.of(to))

                    /**
                     * Sets [Builder.to] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.to] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun to(to: JsonField<String>) = apply { this.to = to }

                    /** The name of the target. */
                    fun name(name: String) = name(JsonField.of(name))

                    /**
                     * Sets [Builder.name] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.name] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun name(name: JsonField<String>) = apply { this.name = name }

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
                     * Returns an immutable instance of [UnnamedSchemaWithArrayParent2].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .to()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): UnnamedSchemaWithArrayParent2 =
                        UnnamedSchemaWithArrayParent2(
                            checkRequired("to", to),
                            name,
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
                 * @throws TelnyxInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): UnnamedSchemaWithArrayParent2 = apply {
                    if (validated) {
                        return@apply
                    }

                    to()
                    name()
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
                    (if (to.asKnown().isPresent) 1 else 0) +
                        (if (name.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is UnnamedSchemaWithArrayParent2 &&
                        to == other.to &&
                        name == other.name &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(to, name, additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "UnnamedSchemaWithArrayParent2{to=$to, name=$name, additionalProperties=$additionalProperties}"
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Transfer &&
                from == other.from &&
                targets == other.targets &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(from, targets, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Transfer{from=$from, targets=$targets, additionalProperties=$additionalProperties}"
    }

    class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val TRANSFER = of("transfer")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            TRANSFER
        }

        /**
         * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Type] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            TRANSFER,
            /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                TRANSFER -> Value.TRANSFER
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
                TRANSFER -> Known.TRANSFER
                else -> throw TelnyxInvalidDataException("Unknown Type: $value")
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
        fun validate(): Type = apply {
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

            return other is Type && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TransferTool &&
            transfer == other.transfer &&
            type == other.type &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(transfer, type, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TransferTool{transfer=$transfer, type=$type, additionalProperties=$additionalProperties}"
}
