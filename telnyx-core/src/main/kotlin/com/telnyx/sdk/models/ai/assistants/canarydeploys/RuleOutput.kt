// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants.canarydeploys

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

/**
 * A targeting rule: ``match`` clauses (AND) gate ``serve``.
 *
 * An empty ``match`` is a catch-all (always fires).
 */
class RuleOutput
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val serve: JsonField<Serve>,
    private val match: JsonField<List<Clause>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("serve") @ExcludeMissing serve: JsonField<Serve> = JsonMissing.of(),
        @JsonProperty("match") @ExcludeMissing match: JsonField<List<Clause>> = JsonMissing.of(),
    ) : this(serve, match, mutableMapOf())

    /**
     * What a rule serves when matched.
     *
     * Exactly one of:
     * - ``version_id`` — serve a specific version
     * - ``rollout`` — weighted random across versions; weights must sum to less than 100, with the
     *   leftover routing to the main version
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun serve(): Serve = serve.getRequired("serve")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun match(): Optional<List<Clause>> = match.getOptional("match")

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
    @JsonProperty("match") @ExcludeMissing fun _match(): JsonField<List<Clause>> = match

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
         * Returns a mutable builder for constructing an instance of [RuleOutput].
         *
         * The following fields are required:
         * ```java
         * .serve()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RuleOutput]. */
    class Builder internal constructor() {

        private var serve: JsonField<Serve>? = null
        private var match: JsonField<MutableList<Clause>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(ruleOutput: RuleOutput) = apply {
            serve = ruleOutput.serve
            match = ruleOutput.match.map { it.toMutableList() }
            additionalProperties = ruleOutput.additionalProperties.toMutableMap()
        }

        /**
         * What a rule serves when matched.
         *
         * Exactly one of:
         * - ``version_id`` — serve a specific version
         * - ``rollout`` — weighted random across versions; weights must sum to less than 100, with
         *   the leftover routing to the main version
         */
        fun serve(serve: Serve) = serve(JsonField.of(serve))

        /**
         * Sets [Builder.serve] to an arbitrary JSON value.
         *
         * You should usually call [Builder.serve] with a well-typed [Serve] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun serve(serve: JsonField<Serve>) = apply { this.serve = serve }

        fun match(match: List<Clause>) = match(JsonField.of(match))

        /**
         * Sets [Builder.match] to an arbitrary JSON value.
         *
         * You should usually call [Builder.match] with a well-typed `List<Clause>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun match(match: JsonField<List<Clause>>) = apply {
            this.match = match.map { it.toMutableList() }
        }

        /**
         * Adds a single [Clause] to [Builder.match].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addMatch(match: Clause) = apply {
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
         * Returns an immutable instance of [RuleOutput].
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
        fun build(): RuleOutput =
            RuleOutput(
                checkRequired("serve", serve),
                (match ?: JsonMissing.of()).map { it.toImmutable() },
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
    fun validate(): RuleOutput = apply {
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (serve.asKnown().getOrNull()?.validity() ?: 0) +
            (match.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RuleOutput &&
            serve == other.serve &&
            match == other.match &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(serve, match, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "RuleOutput{serve=$serve, match=$match, additionalProperties=$additionalProperties}"
}
