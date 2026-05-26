// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants.canarydeploys

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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Response shape.
 *
 * Always carries ``rules`` (canonical).
 */
class CanaryDeployResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val assistantId: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val rules: JsonField<List<Rule>>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("assistant_id")
        @ExcludeMissing
        assistantId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("rules") @ExcludeMissing rules: JsonField<List<Rule>> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(assistantId, createdAt, rules, updatedAt, mutableMapOf())

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun assistantId(): String = assistantId.getRequired("assistant_id")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun rules(): List<Rule> = rules.getRequired("rules")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

    /**
     * Returns the raw JSON value of [assistantId].
     *
     * Unlike [assistantId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("assistant_id")
    @ExcludeMissing
    fun _assistantId(): JsonField<String> = assistantId

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [rules].
     *
     * Unlike [rules], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rules") @ExcludeMissing fun _rules(): JsonField<List<Rule>> = rules

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

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
         * Returns a mutable builder for constructing an instance of [CanaryDeployResponse].
         *
         * The following fields are required:
         * ```java
         * .assistantId()
         * .createdAt()
         * .rules()
         * .updatedAt()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CanaryDeployResponse]. */
    class Builder internal constructor() {

        private var assistantId: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var rules: JsonField<MutableList<Rule>>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(canaryDeployResponse: CanaryDeployResponse) = apply {
            assistantId = canaryDeployResponse.assistantId
            createdAt = canaryDeployResponse.createdAt
            rules = canaryDeployResponse.rules.map { it.toMutableList() }
            updatedAt = canaryDeployResponse.updatedAt
            additionalProperties = canaryDeployResponse.additionalProperties.toMutableMap()
        }

        fun assistantId(assistantId: String) = assistantId(JsonField.of(assistantId))

        /**
         * Sets [Builder.assistantId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.assistantId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun assistantId(assistantId: JsonField<String>) = apply { this.assistantId = assistantId }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun rules(rules: List<Rule>) = rules(JsonField.of(rules))

        /**
         * Sets [Builder.rules] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rules] with a well-typed `List<Rule>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun rules(rules: JsonField<List<Rule>>) = apply {
            this.rules = rules.map { it.toMutableList() }
        }

        /**
         * Adds a single [Rule] to [rules].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRule(rule: Rule) = apply {
            rules =
                (rules ?: JsonField.of(mutableListOf())).also { checkKnown("rules", it).add(rule) }
        }

        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

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
         * Returns an immutable instance of [CanaryDeployResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .assistantId()
         * .createdAt()
         * .rules()
         * .updatedAt()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CanaryDeployResponse =
            CanaryDeployResponse(
                checkRequired("assistantId", assistantId),
                checkRequired("createdAt", createdAt),
                checkRequired("rules", rules).map { it.toImmutable() },
                checkRequired("updatedAt", updatedAt),
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
    fun validate(): CanaryDeployResponse = apply {
        if (validated) {
            return@apply
        }

        assistantId()
        createdAt()
        rules().forEach { it.validate() }
        updatedAt()
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
        (if (assistantId.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (rules.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0)

    /**
     * A targeting rule: ``match`` clauses (AND) gate ``serve``.
     *
     * An empty ``match`` is a catch-all (always fires).
     */
    class Rule
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val serve: JsonField<Serve>,
        private val match: JsonField<List<Match>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("serve") @ExcludeMissing serve: JsonField<Serve> = JsonMissing.of(),
            @JsonProperty("match") @ExcludeMissing match: JsonField<List<Match>> = JsonMissing.of(),
        ) : this(serve, match, mutableMapOf())

        /**
         * What a rule serves when matched.
         *
         * Exactly one of:
         * - ``version_id`` — serve a specific version
         * - ``rollout`` — weighted random across versions; weights must sum to less than 100, with
         *   the leftover routing to the main version
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun serve(): Serve = serve.getRequired("serve")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun match(): Optional<List<Match>> = match.getOptional("match")

        /**
         * Returns the raw JSON value of [serve].
         *
         * Unlike [serve], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("serve") @ExcludeMissing fun _serve(): JsonField<Serve> = serve

        /**
         * Returns the raw JSON value of [match].
         *
         * Unlike [match], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("match") @ExcludeMissing fun _match(): JsonField<List<Match>> = match

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
             * Returns a mutable builder for constructing an instance of [Rule].
             *
             * The following fields are required:
             * ```java
             * .serve()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Rule]. */
        class Builder internal constructor() {

            private var serve: JsonField<Serve>? = null
            private var match: JsonField<MutableList<Match>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(rule: Rule) = apply {
                serve = rule.serve
                match = rule.match.map { it.toMutableList() }
                additionalProperties = rule.additionalProperties.toMutableMap()
            }

            /**
             * What a rule serves when matched.
             *
             * Exactly one of:
             * - ``version_id`` — serve a specific version
             * - ``rollout`` — weighted random across versions; weights must sum to less than 100,
             *   with the leftover routing to the main version
             */
            fun serve(serve: Serve) = serve(JsonField.of(serve))

            /**
             * Sets [Builder.serve] to an arbitrary JSON value.
             *
             * You should usually call [Builder.serve] with a well-typed [Serve] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun serve(serve: JsonField<Serve>) = apply { this.serve = serve }

            fun match(match: List<Match>) = match(JsonField.of(match))

            /**
             * Sets [Builder.match] to an arbitrary JSON value.
             *
             * You should usually call [Builder.match] with a well-typed `List<Match>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun match(match: JsonField<List<Match>>) = apply {
                this.match = match.map { it.toMutableList() }
            }

            /**
             * Adds a single [Match] to [Builder.match].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addMatch(match: Match) = apply {
                this.match =
                    (this.match ?: JsonField.of(mutableListOf())).also {
                        checkKnown("match", it).add(match)
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
             * Returns an immutable instance of [Rule].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .serve()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Rule =
                Rule(
                    checkRequired("serve", serve),
                    (match ?: JsonMissing.of()).map { it.toImmutable() },
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
        fun validate(): Rule = apply {
            if (validated) {
                return@apply
            }

            serve().validate()
            match().ifPresent { it.forEach { it.validate() } }
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
            (serve.asKnown().getOrNull()?.validity() ?: 0) +
                (match.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        /**
         * What a rule serves when matched.
         *
         * Exactly one of:
         * - ``version_id`` — serve a specific version
         * - ``rollout`` — weighted random across versions; weights must sum to less than 100, with
         *   the leftover routing to the main version
         */
        class Serve
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val rollout: JsonField<List<Rollout>>,
            private val versionId: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("rollout")
                @ExcludeMissing
                rollout: JsonField<List<Rollout>> = JsonMissing.of(),
                @JsonProperty("version_id")
                @ExcludeMissing
                versionId: JsonField<String> = JsonMissing.of(),
            ) : this(rollout, versionId, mutableMapOf())

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun rollout(): Optional<List<Rollout>> = rollout.getOptional("rollout")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun versionId(): Optional<String> = versionId.getOptional("version_id")

            /**
             * Returns the raw JSON value of [rollout].
             *
             * Unlike [rollout], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("rollout")
            @ExcludeMissing
            fun _rollout(): JsonField<List<Rollout>> = rollout

            /**
             * Returns the raw JSON value of [versionId].
             *
             * Unlike [versionId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("version_id")
            @ExcludeMissing
            fun _versionId(): JsonField<String> = versionId

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

                /** Returns a mutable builder for constructing an instance of [Serve]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Serve]. */
            class Builder internal constructor() {

                private var rollout: JsonField<MutableList<Rollout>>? = null
                private var versionId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(serve: Serve) = apply {
                    rollout = serve.rollout.map { it.toMutableList() }
                    versionId = serve.versionId
                    additionalProperties = serve.additionalProperties.toMutableMap()
                }

                fun rollout(rollout: List<Rollout>) = rollout(JsonField.of(rollout))

                /**
                 * Sets [Builder.rollout] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.rollout] with a well-typed `List<Rollout>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun rollout(rollout: JsonField<List<Rollout>>) = apply {
                    this.rollout = rollout.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Rollout] to [Builder.rollout].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addRollout(rollout: Rollout) = apply {
                    this.rollout =
                        (this.rollout ?: JsonField.of(mutableListOf())).also {
                            checkKnown("rollout", it).add(rollout)
                        }
                }

                fun versionId(versionId: String) = versionId(JsonField.of(versionId))

                /**
                 * Sets [Builder.versionId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.versionId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun versionId(versionId: JsonField<String>) = apply { this.versionId = versionId }

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
                 * Returns an immutable instance of [Serve].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Serve =
                    Serve(
                        (rollout ?: JsonMissing.of()).map { it.toImmutable() },
                        versionId,
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
            fun validate(): Serve = apply {
                if (validated) {
                    return@apply
                }

                rollout().ifPresent { it.forEach { it.validate() } }
                versionId()
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
                (rollout.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (versionId.asKnown().isPresent) 1 else 0)

            /** One slot in a percentage rollout. */
            class Rollout
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val versionId: JsonField<String>,
                private val weight: JsonField<Double>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("version_id")
                    @ExcludeMissing
                    versionId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("weight")
                    @ExcludeMissing
                    weight: JsonField<Double> = JsonMissing.of(),
                ) : this(versionId, weight, mutableMapOf())

                /**
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun versionId(): String = versionId.getRequired("version_id")

                /**
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun weight(): Double = weight.getRequired("weight")

                /**
                 * Returns the raw JSON value of [versionId].
                 *
                 * Unlike [versionId], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("version_id")
                @ExcludeMissing
                fun _versionId(): JsonField<String> = versionId

                /**
                 * Returns the raw JSON value of [weight].
                 *
                 * Unlike [weight], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("weight") @ExcludeMissing fun _weight(): JsonField<Double> = weight

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
                     * Returns a mutable builder for constructing an instance of [Rollout].
                     *
                     * The following fields are required:
                     * ```java
                     * .versionId()
                     * .weight()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Rollout]. */
                class Builder internal constructor() {

                    private var versionId: JsonField<String>? = null
                    private var weight: JsonField<Double>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(rollout: Rollout) = apply {
                        versionId = rollout.versionId
                        weight = rollout.weight
                        additionalProperties = rollout.additionalProperties.toMutableMap()
                    }

                    fun versionId(versionId: String) = versionId(JsonField.of(versionId))

                    /**
                     * Sets [Builder.versionId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.versionId] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun versionId(versionId: JsonField<String>) = apply {
                        this.versionId = versionId
                    }

                    fun weight(weight: Double) = weight(JsonField.of(weight))

                    /**
                     * Sets [Builder.weight] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.weight] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun weight(weight: JsonField<Double>) = apply { this.weight = weight }

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
                     * Returns an immutable instance of [Rollout].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .versionId()
                     * .weight()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Rollout =
                        Rollout(
                            checkRequired("versionId", versionId),
                            checkRequired("weight", weight),
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
                fun validate(): Rollout = apply {
                    if (validated) {
                        return@apply
                    }

                    versionId()
                    weight()
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
                    (if (versionId.asKnown().isPresent) 1 else 0) +
                        (if (weight.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Rollout &&
                        versionId == other.versionId &&
                        weight == other.weight &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(versionId, weight, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Rollout{versionId=$versionId, weight=$weight, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Serve &&
                    rollout == other.rollout &&
                    versionId == other.versionId &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(rollout, versionId, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Serve{rollout=$rollout, versionId=$versionId, additionalProperties=$additionalProperties}"
        }

        /**
         * A single attribute/operator/values check.
         *
         * A clause matches when the routing context's value for ``attribute`` satisfies
         * ``operator`` against any of ``values``.
         */
        class Match
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val attribute: JsonField<String>,
            private val operator: JsonField<Operator>,
            private val values: JsonField<List<String>>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("attribute")
                @ExcludeMissing
                attribute: JsonField<String> = JsonMissing.of(),
                @JsonProperty("operator")
                @ExcludeMissing
                operator: JsonField<Operator> = JsonMissing.of(),
                @JsonProperty("values")
                @ExcludeMissing
                values: JsonField<List<String>> = JsonMissing.of(),
            ) : this(attribute, operator, values, mutableMapOf())

            /**
             * Attribute name from the routing context
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun attribute(): String = attribute.getRequired("attribute")

            /**
             * Match operator
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun operator(): Operator = operator.getRequired("operator")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun values(): List<String> = values.getRequired("values")

            /**
             * Returns the raw JSON value of [attribute].
             *
             * Unlike [attribute], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("attribute")
            @ExcludeMissing
            fun _attribute(): JsonField<String> = attribute

            /**
             * Returns the raw JSON value of [operator].
             *
             * Unlike [operator], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("operator")
            @ExcludeMissing
            fun _operator(): JsonField<Operator> = operator

            /**
             * Returns the raw JSON value of [values].
             *
             * Unlike [values], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("values") @ExcludeMissing fun _values(): JsonField<List<String>> = values

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
                 * Returns a mutable builder for constructing an instance of [Match].
                 *
                 * The following fields are required:
                 * ```java
                 * .attribute()
                 * .operator()
                 * .values()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Match]. */
            class Builder internal constructor() {

                private var attribute: JsonField<String>? = null
                private var operator: JsonField<Operator>? = null
                private var values: JsonField<MutableList<String>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(match: Match) = apply {
                    attribute = match.attribute
                    operator = match.operator
                    values = match.values.map { it.toMutableList() }
                    additionalProperties = match.additionalProperties.toMutableMap()
                }

                /** Attribute name from the routing context */
                fun attribute(attribute: String) = attribute(JsonField.of(attribute))

                /**
                 * Sets [Builder.attribute] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.attribute] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun attribute(attribute: JsonField<String>) = apply { this.attribute = attribute }

                /** Match operator */
                fun operator(operator: Operator) = operator(JsonField.of(operator))

                /**
                 * Sets [Builder.operator] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.operator] with a well-typed [Operator] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun operator(operator: JsonField<Operator>) = apply { this.operator = operator }

                fun values(values: List<String>) = values(JsonField.of(values))

                /**
                 * Sets [Builder.values] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.values] with a well-typed `List<String>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun values(values: JsonField<List<String>>) = apply {
                    this.values = values.map { it.toMutableList() }
                }

                /**
                 * Adds a single [String] to [values].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addValue(value: String) = apply {
                    values =
                        (values ?: JsonField.of(mutableListOf())).also {
                            checkKnown("values", it).add(value)
                        }
                }

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
                 * Returns an immutable instance of [Match].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .attribute()
                 * .operator()
                 * .values()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Match =
                    Match(
                        checkRequired("attribute", attribute),
                        checkRequired("operator", operator),
                        checkRequired("values", values).map { it.toImmutable() },
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
            fun validate(): Match = apply {
                if (validated) {
                    return@apply
                }

                attribute()
                operator().validate()
                values()
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
                (if (attribute.asKnown().isPresent) 1 else 0) +
                    (operator.asKnown().getOrNull()?.validity() ?: 0) +
                    (values.asKnown().getOrNull()?.size ?: 0)

            /** Match operator */
            class Operator @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val IN = of("in")

                    @JvmField val NOT_IN = of("not_in")

                    @JvmField val STARTS_WITH = of("starts_with")

                    @JvmStatic fun of(value: String) = Operator(JsonField.of(value))
                }

                /** An enum containing [Operator]'s known values. */
                enum class Known {
                    IN,
                    NOT_IN,
                    STARTS_WITH,
                }

                /**
                 * An enum containing [Operator]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Operator] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    IN,
                    NOT_IN,
                    STARTS_WITH,
                    /**
                     * An enum member indicating that [Operator] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        IN -> Value.IN
                        NOT_IN -> Value.NOT_IN
                        STARTS_WITH -> Value.STARTS_WITH
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        IN -> Known.IN
                        NOT_IN -> Known.NOT_IN
                        STARTS_WITH -> Known.STARTS_WITH
                        else -> throw TelnyxInvalidDataException("Unknown Operator: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
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
                 * @throws TelnyxInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): Operator = apply {
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

                    return other is Operator && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Match &&
                    attribute == other.attribute &&
                    operator == other.operator &&
                    values == other.values &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(attribute, operator, values, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Match{attribute=$attribute, operator=$operator, values=$values, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Rule &&
                serve == other.serve &&
                match == other.match &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(serve, match, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Rule{serve=$serve, match=$match, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CanaryDeployResponse &&
            assistantId == other.assistantId &&
            createdAt == other.createdAt &&
            rules == other.rules &&
            updatedAt == other.updatedAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(assistantId, createdAt, rules, updatedAt, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CanaryDeployResponse{assistantId=$assistantId, createdAt=$createdAt, rules=$rules, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
