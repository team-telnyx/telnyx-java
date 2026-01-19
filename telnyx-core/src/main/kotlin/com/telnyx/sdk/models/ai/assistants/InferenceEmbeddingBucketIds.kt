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

class InferenceEmbeddingBucketIds
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val bucketIds: JsonField<List<String>>,
    private val maxNumResults: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("bucket_ids")
        @ExcludeMissing
        bucketIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("max_num_results")
        @ExcludeMissing
        maxNumResults: JsonField<Long> = JsonMissing.of(),
    ) : this(bucketIds, maxNumResults, mutableMapOf())

    /**
     * List of
     * [embedded storage buckets](https://developers.telnyx.com/api-reference/embeddings/embed-documents)
     * to use for retrieval-augmented generation.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun bucketIds(): List<String> = bucketIds.getRequired("bucket_ids")

    /**
     * The maximum number of results to retrieve as context for the language model.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun maxNumResults(): Optional<Long> = maxNumResults.getOptional("max_num_results")

    /**
     * Returns the raw JSON value of [bucketIds].
     *
     * Unlike [bucketIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("bucket_ids")
    @ExcludeMissing
    fun _bucketIds(): JsonField<List<String>> = bucketIds

    /**
     * Returns the raw JSON value of [maxNumResults].
     *
     * Unlike [maxNumResults], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("max_num_results")
    @ExcludeMissing
    fun _maxNumResults(): JsonField<Long> = maxNumResults

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
         * Returns a mutable builder for constructing an instance of [InferenceEmbeddingBucketIds].
         *
         * The following fields are required:
         * ```java
         * .bucketIds()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [InferenceEmbeddingBucketIds]. */
    class Builder internal constructor() {

        private var bucketIds: JsonField<MutableList<String>>? = null
        private var maxNumResults: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(inferenceEmbeddingBucketIds: InferenceEmbeddingBucketIds) = apply {
            bucketIds = inferenceEmbeddingBucketIds.bucketIds.map { it.toMutableList() }
            maxNumResults = inferenceEmbeddingBucketIds.maxNumResults
            additionalProperties = inferenceEmbeddingBucketIds.additionalProperties.toMutableMap()
        }

        /**
         * List of
         * [embedded storage buckets](https://developers.telnyx.com/api-reference/embeddings/embed-documents)
         * to use for retrieval-augmented generation.
         */
        fun bucketIds(bucketIds: List<String>) = bucketIds(JsonField.of(bucketIds))

        /**
         * Sets [Builder.bucketIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bucketIds] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun bucketIds(bucketIds: JsonField<List<String>>) = apply {
            this.bucketIds = bucketIds.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [bucketIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addBucketId(bucketId: String) = apply {
            bucketIds =
                (bucketIds ?: JsonField.of(mutableListOf())).also {
                    checkKnown("bucketIds", it).add(bucketId)
                }
        }

        /** The maximum number of results to retrieve as context for the language model. */
        fun maxNumResults(maxNumResults: Long) = maxNumResults(JsonField.of(maxNumResults))

        /**
         * Sets [Builder.maxNumResults] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxNumResults] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun maxNumResults(maxNumResults: JsonField<Long>) = apply {
            this.maxNumResults = maxNumResults
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
         * Returns an immutable instance of [InferenceEmbeddingBucketIds].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .bucketIds()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): InferenceEmbeddingBucketIds =
            InferenceEmbeddingBucketIds(
                checkRequired("bucketIds", bucketIds).map { it.toImmutable() },
                maxNumResults,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): InferenceEmbeddingBucketIds = apply {
        if (validated) {
            return@apply
        }

        bucketIds()
        maxNumResults()
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
        (bucketIds.asKnown().getOrNull()?.size ?: 0) +
            (if (maxNumResults.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InferenceEmbeddingBucketIds &&
            bucketIds == other.bucketIds &&
            maxNumResults == other.maxNumResults &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(bucketIds, maxNumResults, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "InferenceEmbeddingBucketIds{bucketIds=$bucketIds, maxNumResults=$maxNumResults, additionalProperties=$additionalProperties}"
}
