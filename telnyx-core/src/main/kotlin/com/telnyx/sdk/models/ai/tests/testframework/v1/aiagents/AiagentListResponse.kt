// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.tests.testframework.v1.aiagents

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

class AiagentListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val count: JsonField<Long>,
    private val next: JsonField<String>,
    private val previous: JsonField<String>,
    private val results: JsonField<List<TestAgent>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("count") @ExcludeMissing count: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("next") @ExcludeMissing next: JsonField<String> = JsonMissing.of(),
        @JsonProperty("previous") @ExcludeMissing previous: JsonField<String> = JsonMissing.of(),
        @JsonProperty("results")
        @ExcludeMissing
        results: JsonField<List<TestAgent>> = JsonMissing.of(),
    ) : this(count, next, previous, results, mutableMapOf())

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun count(): Long = count.getRequired("count")

    /**
     * Link to the next page of results, or null.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun next(): Optional<String> = next.getOptional("next")

    /**
     * Link to the previous page of results, or null.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun previous(): Optional<String> = previous.getOptional("previous")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun results(): List<TestAgent> = results.getRequired("results")

    /**
     * Returns the raw JSON value of [count].
     *
     * Unlike [count], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("count") @ExcludeMissing fun _count(): JsonField<Long> = count

    /**
     * Returns the raw JSON value of [next].
     *
     * Unlike [next], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("next") @ExcludeMissing fun _next(): JsonField<String> = next

    /**
     * Returns the raw JSON value of [previous].
     *
     * Unlike [previous], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("previous") @ExcludeMissing fun _previous(): JsonField<String> = previous

    /**
     * Returns the raw JSON value of [results].
     *
     * Unlike [results], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("results") @ExcludeMissing fun _results(): JsonField<List<TestAgent>> = results

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
         * Returns a mutable builder for constructing an instance of [AiagentListResponse].
         *
         * The following fields are required:
         * ```java
         * .count()
         * .next()
         * .previous()
         * .results()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AiagentListResponse]. */
    class Builder internal constructor() {

        private var count: JsonField<Long>? = null
        private var next: JsonField<String>? = null
        private var previous: JsonField<String>? = null
        private var results: JsonField<MutableList<TestAgent>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(aiagentListResponse: AiagentListResponse) = apply {
            count = aiagentListResponse.count
            next = aiagentListResponse.next
            previous = aiagentListResponse.previous
            results = aiagentListResponse.results.map { it.toMutableList() }
            additionalProperties = aiagentListResponse.additionalProperties.toMutableMap()
        }

        fun count(count: Long) = count(JsonField.of(count))

        /**
         * Sets [Builder.count] to an arbitrary JSON value.
         *
         * You should usually call [Builder.count] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun count(count: JsonField<Long>) = apply { this.count = count }

        /** Link to the next page of results, or null. */
        fun next(next: String?) = next(JsonField.ofNullable(next))

        /** Alias for calling [Builder.next] with `next.orElse(null)`. */
        fun next(next: Optional<String>) = next(next.getOrNull())

        /**
         * Sets [Builder.next] to an arbitrary JSON value.
         *
         * You should usually call [Builder.next] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun next(next: JsonField<String>) = apply { this.next = next }

        /** Link to the previous page of results, or null. */
        fun previous(previous: String?) = previous(JsonField.ofNullable(previous))

        /** Alias for calling [Builder.previous] with `previous.orElse(null)`. */
        fun previous(previous: Optional<String>) = previous(previous.getOrNull())

        /**
         * Sets [Builder.previous] to an arbitrary JSON value.
         *
         * You should usually call [Builder.previous] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun previous(previous: JsonField<String>) = apply { this.previous = previous }

        fun results(results: List<TestAgent>) = results(JsonField.of(results))

        /**
         * Sets [Builder.results] to an arbitrary JSON value.
         *
         * You should usually call [Builder.results] with a well-typed `List<TestAgent>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun results(results: JsonField<List<TestAgent>>) = apply {
            this.results = results.map { it.toMutableList() }
        }

        /**
         * Adds a single [TestAgent] to [results].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addResult(result: TestAgent) = apply {
            results =
                (results ?: JsonField.of(mutableListOf())).also {
                    checkKnown("results", it).add(result)
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
         * Returns an immutable instance of [AiagentListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .count()
         * .next()
         * .previous()
         * .results()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AiagentListResponse =
            AiagentListResponse(
                checkRequired("count", count),
                checkRequired("next", next),
                checkRequired("previous", previous),
                checkRequired("results", results).map { it.toImmutable() },
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
    fun validate(): AiagentListResponse = apply {
        if (validated) {
            return@apply
        }

        count()
        next()
        previous()
        results().forEach { it.validate() }
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
        (if (count.asKnown().isPresent) 1 else 0) +
            (if (next.asKnown().isPresent) 1 else 0) +
            (if (previous.asKnown().isPresent) 1 else 0) +
            (results.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AiagentListResponse &&
            count == other.count &&
            next == other.next &&
            previous == other.previous &&
            results == other.results &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(count, next, previous, results, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AiagentListResponse{count=$count, next=$next, previous=$previous, results=$results, additionalProperties=$additionalProperties}"
}
