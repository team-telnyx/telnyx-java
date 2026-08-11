// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.collections.sources

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class SourceRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val sourceType: JsonField<SourceType>,
    private val bucketId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("source_type")
        @ExcludeMissing
        sourceType: JsonField<SourceType> = JsonMissing.of(),
        @JsonProperty("bucket_id") @ExcludeMissing bucketId: JsonField<String> = JsonMissing.of(),
    ) : this(sourceType, bucketId, mutableMapOf())

    /**
     * The type of Telnyx data attached as a source. `bucket` requires an additional `bucket_id`.
     * Only `voice` is searchable today; `meeting_bot`, `message`, and `bucket` attach but are not
     * yet searchable (Coming soon).
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun sourceType(): SourceType = sourceType.getRequired("source_type")

    /**
     * The Telnyx Storage bucket name. Required when `source_type` is `bucket`; ignored otherwise.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun bucketId(): Optional<String> = bucketId.getOptional("bucket_id")

    /**
     * Returns the raw JSON value of [sourceType].
     *
     * Unlike [sourceType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("source_type")
    @ExcludeMissing
    fun _sourceType(): JsonField<SourceType> = sourceType

    /**
     * Returns the raw JSON value of [bucketId].
     *
     * Unlike [bucketId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("bucket_id") @ExcludeMissing fun _bucketId(): JsonField<String> = bucketId

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
         * Returns a mutable builder for constructing an instance of [SourceRequest].
         *
         * The following fields are required:
         * ```java
         * .sourceType()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SourceRequest]. */
    class Builder internal constructor() {

        private var sourceType: JsonField<SourceType>? = null
        private var bucketId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(sourceRequest: SourceRequest) = apply {
            sourceType = sourceRequest.sourceType
            bucketId = sourceRequest.bucketId
            additionalProperties = sourceRequest.additionalProperties.toMutableMap()
        }

        /**
         * The type of Telnyx data attached as a source. `bucket` requires an additional
         * `bucket_id`. Only `voice` is searchable today; `meeting_bot`, `message`, and `bucket`
         * attach but are not yet searchable (Coming soon).
         */
        fun sourceType(sourceType: SourceType) = sourceType(JsonField.of(sourceType))

        /**
         * Sets [Builder.sourceType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sourceType] with a well-typed [SourceType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun sourceType(sourceType: JsonField<SourceType>) = apply { this.sourceType = sourceType }

        /**
         * The Telnyx Storage bucket name. Required when `source_type` is `bucket`; ignored
         * otherwise.
         */
        fun bucketId(bucketId: String) = bucketId(JsonField.of(bucketId))

        /**
         * Sets [Builder.bucketId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bucketId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun bucketId(bucketId: JsonField<String>) = apply { this.bucketId = bucketId }

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
         * Returns an immutable instance of [SourceRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .sourceType()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SourceRequest =
            SourceRequest(
                checkRequired("sourceType", sourceType),
                bucketId,
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
    fun validate(): SourceRequest = apply {
        if (validated) {
            return@apply
        }

        sourceType().validate()
        bucketId()
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
        (sourceType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (bucketId.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SourceRequest &&
            sourceType == other.sourceType &&
            bucketId == other.bucketId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(sourceType, bucketId, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SourceRequest{sourceType=$sourceType, bucketId=$bucketId, additionalProperties=$additionalProperties}"
}
