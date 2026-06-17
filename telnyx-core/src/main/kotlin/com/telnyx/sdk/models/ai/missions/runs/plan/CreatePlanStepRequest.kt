// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.missions.runs.plan

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class CreatePlanStepRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val description: JsonField<String>,
    private val sequence: JsonField<Long>,
    private val stepId: JsonField<String>,
    private val metadata: JsonField<Metadata>,
    private val parentStepId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sequence") @ExcludeMissing sequence: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("step_id") @ExcludeMissing stepId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("metadata") @ExcludeMissing metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonProperty("parent_step_id")
        @ExcludeMissing
        parentStepId: JsonField<String> = JsonMissing.of(),
    ) : this(description, sequence, stepId, metadata, parentStepId, mutableMapOf())

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun description(): String = description.getRequired("description")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun sequence(): Long = sequence.getRequired("sequence")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun stepId(): String = stepId.getRequired("step_id")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun metadata(): Optional<Metadata> = metadata.getOptional("metadata")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun parentStepId(): Optional<String> = parentStepId.getOptional("parent_step_id")

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [sequence].
     *
     * Unlike [sequence], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sequence") @ExcludeMissing fun _sequence(): JsonField<Long> = sequence

    /**
     * Returns the raw JSON value of [stepId].
     *
     * Unlike [stepId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("step_id") @ExcludeMissing fun _stepId(): JsonField<String> = stepId

    /**
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

    /**
     * Returns the raw JSON value of [parentStepId].
     *
     * Unlike [parentStepId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("parent_step_id")
    @ExcludeMissing
    fun _parentStepId(): JsonField<String> = parentStepId

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
         * Returns a mutable builder for constructing an instance of [CreatePlanStepRequest].
         *
         * The following fields are required:
         * ```java
         * .description()
         * .sequence()
         * .stepId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CreatePlanStepRequest]. */
    class Builder internal constructor() {

        private var description: JsonField<String>? = null
        private var sequence: JsonField<Long>? = null
        private var stepId: JsonField<String>? = null
        private var metadata: JsonField<Metadata> = JsonMissing.of()
        private var parentStepId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(createPlanStepRequest: CreatePlanStepRequest) = apply {
            description = createPlanStepRequest.description
            sequence = createPlanStepRequest.sequence
            stepId = createPlanStepRequest.stepId
            metadata = createPlanStepRequest.metadata
            parentStepId = createPlanStepRequest.parentStepId
            additionalProperties = createPlanStepRequest.additionalProperties.toMutableMap()
        }

        fun description(description: String) = description(JsonField.of(description))

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        fun sequence(sequence: Long) = sequence(JsonField.of(sequence))

        /**
         * Sets [Builder.sequence] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sequence] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun sequence(sequence: JsonField<Long>) = apply { this.sequence = sequence }

        fun stepId(stepId: String) = stepId(JsonField.of(stepId))

        /**
         * Sets [Builder.stepId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.stepId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun stepId(stepId: JsonField<String>) = apply { this.stepId = stepId }

        fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

        /**
         * Sets [Builder.metadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadata] with a well-typed [Metadata] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

        fun parentStepId(parentStepId: String) = parentStepId(JsonField.of(parentStepId))

        /**
         * Sets [Builder.parentStepId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.parentStepId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun parentStepId(parentStepId: JsonField<String>) = apply {
            this.parentStepId = parentStepId
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
         * Returns an immutable instance of [CreatePlanStepRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .description()
         * .sequence()
         * .stepId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CreatePlanStepRequest =
            CreatePlanStepRequest(
                checkRequired("description", description),
                checkRequired("sequence", sequence),
                checkRequired("stepId", stepId),
                metadata,
                parentStepId,
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
    fun validate(): CreatePlanStepRequest = apply {
        if (validated) {
            return@apply
        }

        description()
        sequence()
        stepId()
        metadata().ifPresent { it.validate() }
        parentStepId()
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
        (if (description.asKnown().isPresent) 1 else 0) +
            (if (sequence.asKnown().isPresent) 1 else 0) +
            (if (stepId.asKnown().isPresent) 1 else 0) +
            (metadata.asKnown().getOrNull()?.validity() ?: 0) +
            (if (parentStepId.asKnown().isPresent) 1 else 0)

    class Metadata
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Metadata]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Metadata]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(metadata: Metadata) = apply {
                additionalProperties = metadata.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Metadata].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Metadata = Metadata(additionalProperties.toImmutable())
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
        fun validate(): Metadata = apply {
            if (validated) {
                return@apply
            }

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
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Metadata && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CreatePlanStepRequest &&
            description == other.description &&
            sequence == other.sequence &&
            stepId == other.stepId &&
            metadata == other.metadata &&
            parentStepId == other.parentStepId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(description, sequence, stepId, metadata, parentStepId, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CreatePlanStepRequest{description=$description, sequence=$sequence, stepId=$stepId, metadata=$metadata, parentStepId=$parentStepId, additionalProperties=$additionalProperties}"
}
