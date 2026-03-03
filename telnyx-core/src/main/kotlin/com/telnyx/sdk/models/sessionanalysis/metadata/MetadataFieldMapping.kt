// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.sessionanalysis.metadata

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

class MetadataFieldMapping
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val localField: JsonField<String>,
    private val parentField: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("local_field")
        @ExcludeMissing
        localField: JsonField<String> = JsonMissing.of(),
        @JsonProperty("parent_field")
        @ExcludeMissing
        parentField: JsonField<String> = JsonMissing.of(),
    ) : this(localField, parentField, mutableMapOf())

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun localField(): String = localField.getRequired("local_field")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun parentField(): String = parentField.getRequired("parent_field")

    /**
     * Returns the raw JSON value of [localField].
     *
     * Unlike [localField], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("local_field") @ExcludeMissing fun _localField(): JsonField<String> = localField

    /**
     * Returns the raw JSON value of [parentField].
     *
     * Unlike [parentField], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("parent_field")
    @ExcludeMissing
    fun _parentField(): JsonField<String> = parentField

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
         * Returns a mutable builder for constructing an instance of [MetadataFieldMapping].
         *
         * The following fields are required:
         * ```java
         * .localField()
         * .parentField()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MetadataFieldMapping]. */
    class Builder internal constructor() {

        private var localField: JsonField<String>? = null
        private var parentField: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(metadataFieldMapping: MetadataFieldMapping) = apply {
            localField = metadataFieldMapping.localField
            parentField = metadataFieldMapping.parentField
            additionalProperties = metadataFieldMapping.additionalProperties.toMutableMap()
        }

        fun localField(localField: String) = localField(JsonField.of(localField))

        /**
         * Sets [Builder.localField] to an arbitrary JSON value.
         *
         * You should usually call [Builder.localField] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun localField(localField: JsonField<String>) = apply { this.localField = localField }

        fun parentField(parentField: String) = parentField(JsonField.of(parentField))

        /**
         * Sets [Builder.parentField] to an arbitrary JSON value.
         *
         * You should usually call [Builder.parentField] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun parentField(parentField: JsonField<String>) = apply { this.parentField = parentField }

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
         * Returns an immutable instance of [MetadataFieldMapping].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .localField()
         * .parentField()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): MetadataFieldMapping =
            MetadataFieldMapping(
                checkRequired("localField", localField),
                checkRequired("parentField", parentField),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): MetadataFieldMapping = apply {
        if (validated) {
            return@apply
        }

        localField()
        parentField()
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
        (if (localField.asKnown().isPresent) 1 else 0) +
            (if (parentField.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MetadataFieldMapping &&
            localField == other.localField &&
            parentField == other.parentField &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(localField, parentField, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "MetadataFieldMapping{localField=$localField, parentField=$parentField, additionalProperties=$additionalProperties}"
}
