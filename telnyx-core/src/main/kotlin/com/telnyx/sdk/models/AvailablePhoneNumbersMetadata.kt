// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional

class AvailablePhoneNumbersMetadata
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val bestEffortResults: JsonField<Long>,
    private val totalResults: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("best_effort_results")
        @ExcludeMissing
        bestEffortResults: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("total_results")
        @ExcludeMissing
        totalResults: JsonField<Long> = JsonMissing.of(),
    ) : this(bestEffortResults, totalResults, mutableMapOf())

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun bestEffortResults(): Optional<Long> = bestEffortResults.getOptional("best_effort_results")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun totalResults(): Optional<Long> = totalResults.getOptional("total_results")

    /**
     * Returns the raw JSON value of [bestEffortResults].
     *
     * Unlike [bestEffortResults], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("best_effort_results")
    @ExcludeMissing
    fun _bestEffortResults(): JsonField<Long> = bestEffortResults

    /**
     * Returns the raw JSON value of [totalResults].
     *
     * Unlike [totalResults], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("total_results")
    @ExcludeMissing
    fun _totalResults(): JsonField<Long> = totalResults

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
         * [AvailablePhoneNumbersMetadata].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AvailablePhoneNumbersMetadata]. */
    class Builder internal constructor() {

        private var bestEffortResults: JsonField<Long> = JsonMissing.of()
        private var totalResults: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(availablePhoneNumbersMetadata: AvailablePhoneNumbersMetadata) = apply {
            bestEffortResults = availablePhoneNumbersMetadata.bestEffortResults
            totalResults = availablePhoneNumbersMetadata.totalResults
            additionalProperties = availablePhoneNumbersMetadata.additionalProperties.toMutableMap()
        }

        fun bestEffortResults(bestEffortResults: Long) =
            bestEffortResults(JsonField.of(bestEffortResults))

        /**
         * Sets [Builder.bestEffortResults] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bestEffortResults] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun bestEffortResults(bestEffortResults: JsonField<Long>) = apply {
            this.bestEffortResults = bestEffortResults
        }

        fun totalResults(totalResults: Long) = totalResults(JsonField.of(totalResults))

        /**
         * Sets [Builder.totalResults] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalResults] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun totalResults(totalResults: JsonField<Long>) = apply { this.totalResults = totalResults }

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
         * Returns an immutable instance of [AvailablePhoneNumbersMetadata].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): AvailablePhoneNumbersMetadata =
            AvailablePhoneNumbersMetadata(
                bestEffortResults,
                totalResults,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): AvailablePhoneNumbersMetadata = apply {
        if (validated) {
            return@apply
        }

        bestEffortResults()
        totalResults()
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
        (if (bestEffortResults.asKnown().isPresent) 1 else 0) +
            (if (totalResults.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AvailablePhoneNumbersMetadata &&
            bestEffortResults == other.bestEffortResults &&
            totalResults == other.totalResults &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(bestEffortResults, totalResults, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AvailablePhoneNumbersMetadata{bestEffortResults=$bestEffortResults, totalResults=$totalResults, additionalProperties=$additionalProperties}"
}
