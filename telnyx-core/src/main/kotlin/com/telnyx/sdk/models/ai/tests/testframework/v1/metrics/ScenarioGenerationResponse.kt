// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.tests.testframework.v1.metrics

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

class ScenarioGenerationResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val progressId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("progress_id")
        @ExcludeMissing
        progressId: JsonField<String> = JsonMissing.of()
    ) : this(progressId, mutableMapOf())

    /**
     * Identifier to poll generation progress with.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun progressId(): String = progressId.getRequired("progress_id")

    /**
     * Returns the raw JSON value of [progressId].
     *
     * Unlike [progressId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("progress_id") @ExcludeMissing fun _progressId(): JsonField<String> = progressId

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
         * Returns a mutable builder for constructing an instance of [ScenarioGenerationResponse].
         *
         * The following fields are required:
         * ```java
         * .progressId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ScenarioGenerationResponse]. */
    class Builder internal constructor() {

        private var progressId: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(scenarioGenerationResponse: ScenarioGenerationResponse) = apply {
            progressId = scenarioGenerationResponse.progressId
            additionalProperties = scenarioGenerationResponse.additionalProperties.toMutableMap()
        }

        /** Identifier to poll generation progress with. */
        fun progressId(progressId: String) = progressId(JsonField.of(progressId))

        /**
         * Sets [Builder.progressId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.progressId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun progressId(progressId: JsonField<String>) = apply { this.progressId = progressId }

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
         * Returns an immutable instance of [ScenarioGenerationResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .progressId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ScenarioGenerationResponse =
            ScenarioGenerationResponse(
                checkRequired("progressId", progressId),
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
    fun validate(): ScenarioGenerationResponse = apply {
        if (validated) {
            return@apply
        }

        progressId()
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
    @JvmSynthetic internal fun validity(): Int = (if (progressId.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ScenarioGenerationResponse &&
            progressId == other.progressId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(progressId, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ScenarioGenerationResponse{progressId=$progressId, additionalProperties=$additionalProperties}"
}
