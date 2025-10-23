// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
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

class InferenceEmbeddingTransferToolParams
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val from: JsonField<String>,
    private val targets: JsonField<List<Target>>,
    private val customHeaders: JsonField<List<CustomHeader>>,
    private val warmTransferInstructions: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("from") @ExcludeMissing from: JsonField<String> = JsonMissing.of(),
        @JsonProperty("targets")
        @ExcludeMissing
        targets: JsonField<List<Target>> = JsonMissing.of(),
        @JsonProperty("custom_headers")
        @ExcludeMissing
        customHeaders: JsonField<List<CustomHeader>> = JsonMissing.of(),
        @JsonProperty("warm_transfer_instructions")
        @ExcludeMissing
        warmTransferInstructions: JsonField<String> = JsonMissing.of(),
    ) : this(from, targets, customHeaders, warmTransferInstructions, mutableMapOf())

    /**
     * Number or SIP URI placing the call.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun from(): String = from.getRequired("from")

    /**
     * The different possible targets of the transfer. The assistant will be able to choose one of
     * the targets to transfer the call to.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun targets(): List<Target> = targets.getRequired("targets")

    /**
     * Custom headers to be added to the SIP INVITE for the transfer command.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun customHeaders(): Optional<List<CustomHeader>> = customHeaders.getOptional("custom_headers")

    /**
     * Natural language instructions for your agent for how to provide context for the transfer
     * recipient.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun warmTransferInstructions(): Optional<String> =
        warmTransferInstructions.getOptional("warm_transfer_instructions")

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
    @JsonProperty("targets") @ExcludeMissing fun _targets(): JsonField<List<Target>> = targets

    /**
     * Returns the raw JSON value of [customHeaders].
     *
     * Unlike [customHeaders], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("custom_headers")
    @ExcludeMissing
    fun _customHeaders(): JsonField<List<CustomHeader>> = customHeaders

    /**
     * Returns the raw JSON value of [warmTransferInstructions].
     *
     * Unlike [warmTransferInstructions], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("warm_transfer_instructions")
    @ExcludeMissing
    fun _warmTransferInstructions(): JsonField<String> = warmTransferInstructions

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
         * [InferenceEmbeddingTransferToolParams].
         *
         * The following fields are required:
         * ```java
         * .from()
         * .targets()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [InferenceEmbeddingTransferToolParams]. */
    class Builder internal constructor() {

        private var from: JsonField<String>? = null
        private var targets: JsonField<MutableList<Target>>? = null
        private var customHeaders: JsonField<MutableList<CustomHeader>>? = null
        private var warmTransferInstructions: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            inferenceEmbeddingTransferToolParams: InferenceEmbeddingTransferToolParams
        ) = apply {
            from = inferenceEmbeddingTransferToolParams.from
            targets = inferenceEmbeddingTransferToolParams.targets.map { it.toMutableList() }
            customHeaders =
                inferenceEmbeddingTransferToolParams.customHeaders.map { it.toMutableList() }
            warmTransferInstructions = inferenceEmbeddingTransferToolParams.warmTransferInstructions
            additionalProperties =
                inferenceEmbeddingTransferToolParams.additionalProperties.toMutableMap()
        }

        /** Number or SIP URI placing the call. */
        fun from(from: String) = from(JsonField.of(from))

        /**
         * Sets [Builder.from] to an arbitrary JSON value.
         *
         * You should usually call [Builder.from] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun from(from: JsonField<String>) = apply { this.from = from }

        /**
         * The different possible targets of the transfer. The assistant will be able to choose one
         * of the targets to transfer the call to.
         */
        fun targets(targets: List<Target>) = targets(JsonField.of(targets))

        /**
         * Sets [Builder.targets] to an arbitrary JSON value.
         *
         * You should usually call [Builder.targets] with a well-typed `List<Target>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun targets(targets: JsonField<List<Target>>) = apply {
            this.targets = targets.map { it.toMutableList() }
        }

        /**
         * Adds a single [Target] to [targets].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTarget(target: Target) = apply {
            targets =
                (targets ?: JsonField.of(mutableListOf())).also {
                    checkKnown("targets", it).add(target)
                }
        }

        /** Custom headers to be added to the SIP INVITE for the transfer command. */
        fun customHeaders(customHeaders: List<CustomHeader>) =
            customHeaders(JsonField.of(customHeaders))

        /**
         * Sets [Builder.customHeaders] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customHeaders] with a well-typed `List<CustomHeader>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun customHeaders(customHeaders: JsonField<List<CustomHeader>>) = apply {
            this.customHeaders = customHeaders.map { it.toMutableList() }
        }

        /**
         * Adds a single [CustomHeader] to [customHeaders].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCustomHeader(customHeader: CustomHeader) = apply {
            customHeaders =
                (customHeaders ?: JsonField.of(mutableListOf())).also {
                    checkKnown("customHeaders", it).add(customHeader)
                }
        }

        /**
         * Natural language instructions for your agent for how to provide context for the transfer
         * recipient.
         */
        fun warmTransferInstructions(warmTransferInstructions: String) =
            warmTransferInstructions(JsonField.of(warmTransferInstructions))

        /**
         * Sets [Builder.warmTransferInstructions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.warmTransferInstructions] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun warmTransferInstructions(warmTransferInstructions: JsonField<String>) = apply {
            this.warmTransferInstructions = warmTransferInstructions
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
         * Returns an immutable instance of [InferenceEmbeddingTransferToolParams].
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
        fun build(): InferenceEmbeddingTransferToolParams =
            InferenceEmbeddingTransferToolParams(
                checkRequired("from", from),
                checkRequired("targets", targets).map { it.toImmutable() },
                (customHeaders ?: JsonMissing.of()).map { it.toImmutable() },
                warmTransferInstructions,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): InferenceEmbeddingTransferToolParams = apply {
        if (validated) {
            return@apply
        }

        from()
        targets().forEach { it.validate() }
        customHeaders().ifPresent { it.forEach { it.validate() } }
        warmTransferInstructions()
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
        (if (from.asKnown().isPresent) 1 else 0) +
            (targets.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (customHeaders.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (warmTransferInstructions.asKnown().isPresent) 1 else 0)

    class Target
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val name: JsonField<String>,
        private val to: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("to") @ExcludeMissing to: JsonField<String> = JsonMissing.of(),
        ) : this(name, to, mutableMapOf())

        /**
         * The name of the target.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * The destination number or SIP URI of the call.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun to(): Optional<String> = to.getOptional("to")

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [to].
         *
         * Unlike [to], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("to") @ExcludeMissing fun _to(): JsonField<String> = to

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

            /** Returns a mutable builder for constructing an instance of [Target]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Target]. */
        class Builder internal constructor() {

            private var name: JsonField<String> = JsonMissing.of()
            private var to: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(target: Target) = apply {
                name = target.name
                to = target.to
                additionalProperties = target.additionalProperties.toMutableMap()
            }

            /** The name of the target. */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** The destination number or SIP URI of the call. */
            fun to(to: String) = to(JsonField.of(to))

            /**
             * Sets [Builder.to] to an arbitrary JSON value.
             *
             * You should usually call [Builder.to] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun to(to: JsonField<String>) = apply { this.to = to }

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
             * Returns an immutable instance of [Target].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Target = Target(name, to, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Target = apply {
            if (validated) {
                return@apply
            }

            name()
            to()
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
            (if (name.asKnown().isPresent) 1 else 0) + (if (to.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Target &&
                name == other.name &&
                to == other.to &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(name, to, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Target{name=$name, to=$to, additionalProperties=$additionalProperties}"
    }

    class CustomHeader
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val name: JsonField<String>,
        private val value: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("value") @ExcludeMissing value: JsonField<String> = JsonMissing.of(),
        ) : this(name, value, mutableMapOf())

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * The value of the header. Note that we support mustache templating for the value. For
         * example you can use `{{#integration_secret}}test-secret{{/integration_secret}}` to pass
         * the value of the integration secret.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun value(): Optional<String> = value.getOptional("value")

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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

            /** Returns a mutable builder for constructing an instance of [CustomHeader]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [CustomHeader]. */
        class Builder internal constructor() {

            private var name: JsonField<String> = JsonMissing.of()
            private var value: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(customHeader: CustomHeader) = apply {
                name = customHeader.name
                value = customHeader.value
                additionalProperties = customHeader.additionalProperties.toMutableMap()
            }

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
             * The value of the header. Note that we support mustache templating for the value. For
             * example you can use `{{#integration_secret}}test-secret{{/integration_secret}}` to
             * pass the value of the integration secret.
             */
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
             * Returns an immutable instance of [CustomHeader].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): CustomHeader =
                CustomHeader(name, value, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): CustomHeader = apply {
            if (validated) {
                return@apply
            }

            name()
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
            (if (name.asKnown().isPresent) 1 else 0) + (if (value.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CustomHeader &&
                name == other.name &&
                value == other.value &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(name, value, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CustomHeader{name=$name, value=$value, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InferenceEmbeddingTransferToolParams &&
            from == other.from &&
            targets == other.targets &&
            customHeaders == other.customHeaders &&
            warmTransferInstructions == other.warmTransferInstructions &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(from, targets, customHeaders, warmTransferInstructions, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "InferenceEmbeddingTransferToolParams{from=$from, targets=$targets, customHeaders=$customHeaders, warmTransferInstructions=$warmTransferInstructions, additionalProperties=$additionalProperties}"
}
