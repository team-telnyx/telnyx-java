// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.numberorderphonenumbers

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

class UpdateRegulatoryRequirement
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val fieldValue: JsonField<String>,
    private val requirementId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("field_value")
        @ExcludeMissing
        fieldValue: JsonField<String> = JsonMissing.of(),
        @JsonProperty("requirement_id")
        @ExcludeMissing
        requirementId: JsonField<String> = JsonMissing.of(),
    ) : this(fieldValue, requirementId, mutableMapOf())

    /**
     * The value of the requirement. For address and document requirements, this should be the ID of
     * the resource. For textual, this should be the value of the requirement.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun fieldValue(): Optional<String> = fieldValue.getOptional("field_value")

    /**
     * Unique id for a requirement.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun requirementId(): Optional<String> = requirementId.getOptional("requirement_id")

    /**
     * Returns the raw JSON value of [fieldValue].
     *
     * Unlike [fieldValue], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("field_value") @ExcludeMissing fun _fieldValue(): JsonField<String> = fieldValue

    /**
     * Returns the raw JSON value of [requirementId].
     *
     * Unlike [requirementId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("requirement_id")
    @ExcludeMissing
    fun _requirementId(): JsonField<String> = requirementId

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
         * Returns a mutable builder for constructing an instance of [UpdateRegulatoryRequirement].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [UpdateRegulatoryRequirement]. */
    class Builder internal constructor() {

        private var fieldValue: JsonField<String> = JsonMissing.of()
        private var requirementId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(updateRegulatoryRequirement: UpdateRegulatoryRequirement) = apply {
            fieldValue = updateRegulatoryRequirement.fieldValue
            requirementId = updateRegulatoryRequirement.requirementId
            additionalProperties = updateRegulatoryRequirement.additionalProperties.toMutableMap()
        }

        /**
         * The value of the requirement. For address and document requirements, this should be the
         * ID of the resource. For textual, this should be the value of the requirement.
         */
        fun fieldValue(fieldValue: String) = fieldValue(JsonField.of(fieldValue))

        /**
         * Sets [Builder.fieldValue] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fieldValue] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun fieldValue(fieldValue: JsonField<String>) = apply { this.fieldValue = fieldValue }

        /** Unique id for a requirement. */
        fun requirementId(requirementId: String) = requirementId(JsonField.of(requirementId))

        /**
         * Sets [Builder.requirementId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.requirementId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun requirementId(requirementId: JsonField<String>) = apply {
            this.requirementId = requirementId
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
         * Returns an immutable instance of [UpdateRegulatoryRequirement].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): UpdateRegulatoryRequirement =
            UpdateRegulatoryRequirement(
                fieldValue,
                requirementId,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): UpdateRegulatoryRequirement = apply {
        if (validated) {
            return@apply
        }

        fieldValue()
        requirementId()
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
        (if (fieldValue.asKnown().isPresent) 1 else 0) +
            (if (requirementId.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UpdateRegulatoryRequirement &&
            fieldValue == other.fieldValue &&
            requirementId == other.requirementId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(fieldValue, requirementId, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "UpdateRegulatoryRequirement{fieldValue=$fieldValue, requirementId=$requirementId, additionalProperties=$additionalProperties}"
}
