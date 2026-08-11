// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.collections.settings

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
import kotlin.jvm.optionals.getOrNull

class RetrievalSettingsWrapper
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val recordType: JsonField<String>,
    private val retrieval: JsonField<RetrievalSettings>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("record_type")
        @ExcludeMissing
        recordType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("retrieval")
        @ExcludeMissing
        retrieval: JsonField<RetrievalSettings> = JsonMissing.of(),
    ) : this(recordType, retrieval, mutableMapOf())

    /**
     * Identifies the record type. Always `ai_collection_settings`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun recordType(): Optional<String> = recordType.getOptional("record_type")

    /**
     * How documents are retrieved when searching the collection.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun retrieval(): Optional<RetrievalSettings> = retrieval.getOptional("retrieval")

    /**
     * Returns the raw JSON value of [recordType].
     *
     * Unlike [recordType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("record_type") @ExcludeMissing fun _recordType(): JsonField<String> = recordType

    /**
     * Returns the raw JSON value of [retrieval].
     *
     * Unlike [retrieval], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("retrieval")
    @ExcludeMissing
    fun _retrieval(): JsonField<RetrievalSettings> = retrieval

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

        /** Returns a mutable builder for constructing an instance of [RetrievalSettingsWrapper]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RetrievalSettingsWrapper]. */
    class Builder internal constructor() {

        private var recordType: JsonField<String> = JsonMissing.of()
        private var retrieval: JsonField<RetrievalSettings> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(retrievalSettingsWrapper: RetrievalSettingsWrapper) = apply {
            recordType = retrievalSettingsWrapper.recordType
            retrieval = retrievalSettingsWrapper.retrieval
            additionalProperties = retrievalSettingsWrapper.additionalProperties.toMutableMap()
        }

        /** Identifies the record type. Always `ai_collection_settings`. */
        fun recordType(recordType: String) = recordType(JsonField.of(recordType))

        /**
         * Sets [Builder.recordType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recordType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun recordType(recordType: JsonField<String>) = apply { this.recordType = recordType }

        /** How documents are retrieved when searching the collection. */
        fun retrieval(retrieval: RetrievalSettings) = retrieval(JsonField.of(retrieval))

        /**
         * Sets [Builder.retrieval] to an arbitrary JSON value.
         *
         * You should usually call [Builder.retrieval] with a well-typed [RetrievalSettings] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun retrieval(retrieval: JsonField<RetrievalSettings>) = apply {
            this.retrieval = retrieval
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
         * Returns an immutable instance of [RetrievalSettingsWrapper].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): RetrievalSettingsWrapper =
            RetrievalSettingsWrapper(recordType, retrieval, additionalProperties.toMutableMap())
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
    fun validate(): RetrievalSettingsWrapper = apply {
        if (validated) {
            return@apply
        }

        recordType()
        retrieval().ifPresent { it.validate() }
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
        (if (recordType.asKnown().isPresent) 1 else 0) +
            (retrieval.asKnown().getOrNull()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RetrievalSettingsWrapper &&
            recordType == other.recordType &&
            retrieval == other.retrieval &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(recordType, retrieval, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "RetrievalSettingsWrapper{recordType=$recordType, retrieval=$retrieval, additionalProperties=$additionalProperties}"
}
