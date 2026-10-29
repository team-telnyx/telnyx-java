// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailtemplates

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

class VariableSchemaEntry
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val required: JsonField<Boolean>,
    private val default_: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("required") @ExcludeMissing required: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("default") @ExcludeMissing default_: JsonField<String> = JsonMissing.of(),
    ) : this(required, default_, mutableMapOf())

    /**
     * Whether the variable must be supplied when strict variable validation is enabled.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun required(): Boolean = required.getRequired("required")

    /**
     * Default value for an optional variable. Rejected when `required` is `true`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun default_(): Optional<String> = default_.getOptional("default")

    /**
     * Returns the raw JSON value of [required].
     *
     * Unlike [required], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("required") @ExcludeMissing fun _required(): JsonField<Boolean> = required

    /**
     * Returns the raw JSON value of [default_].
     *
     * Unlike [default_], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("default") @ExcludeMissing fun _default_(): JsonField<String> = default_

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
         * Returns a mutable builder for constructing an instance of [VariableSchemaEntry].
         *
         * The following fields are required:
         * ```java
         * .required()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [VariableSchemaEntry]. */
    class Builder internal constructor() {

        private var required: JsonField<Boolean>? = null
        private var default_: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(variableSchemaEntry: VariableSchemaEntry) = apply {
            required = variableSchemaEntry.required
            default_ = variableSchemaEntry.default_
            additionalProperties = variableSchemaEntry.additionalProperties.toMutableMap()
        }

        /** Whether the variable must be supplied when strict variable validation is enabled. */
        fun required(required: Boolean) = required(JsonField.of(required))

        /**
         * Sets [Builder.required] to an arbitrary JSON value.
         *
         * You should usually call [Builder.required] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun required(required: JsonField<Boolean>) = apply { this.required = required }

        /** Default value for an optional variable. Rejected when `required` is `true`. */
        fun default_(default_: String) = default_(JsonField.of(default_))

        /**
         * Sets [Builder.default_] to an arbitrary JSON value.
         *
         * You should usually call [Builder.default_] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun default_(default_: JsonField<String>) = apply { this.default_ = default_ }

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
         * Returns an immutable instance of [VariableSchemaEntry].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .required()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): VariableSchemaEntry =
            VariableSchemaEntry(
                checkRequired("required", required),
                default_,
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
    fun validate(): VariableSchemaEntry = apply {
        if (validated) {
            return@apply
        }

        required()
        default_()
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
        (if (required.asKnown().isPresent) 1 else 0) + (if (default_.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is VariableSchemaEntry &&
            required == other.required &&
            default_ == other.default_ &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(required, default_, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "VariableSchemaEntry{required=$required, default_=$default_, additionalProperties=$additionalProperties}"
}
