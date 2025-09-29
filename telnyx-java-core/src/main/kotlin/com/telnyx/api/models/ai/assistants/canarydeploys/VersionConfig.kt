// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.ai.assistants.canarydeploys

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.api.core.ExcludeMissing
import com.telnyx.api.core.JsonField
import com.telnyx.api.core.JsonMissing
import com.telnyx.api.core.JsonValue
import com.telnyx.api.core.checkRequired
import com.telnyx.api.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects

/** Configuration for a single version in canary deploy. */
class VersionConfig
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val percentage: JsonField<Double>,
    private val versionId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("percentage")
        @ExcludeMissing
        percentage: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("version_id") @ExcludeMissing versionId: JsonField<String> = JsonMissing.of(),
    ) : this(percentage, versionId, mutableMapOf())

    /**
     * Percentage of traffic for this version [1-99]
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun percentage(): Double = percentage.getRequired("percentage")

    /**
     * Version ID string that references assistant_versions.version_id
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun versionId(): String = versionId.getRequired("version_id")

    /**
     * Returns the raw JSON value of [percentage].
     *
     * Unlike [percentage], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("percentage") @ExcludeMissing fun _percentage(): JsonField<Double> = percentage

    /**
     * Returns the raw JSON value of [versionId].
     *
     * Unlike [versionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("version_id") @ExcludeMissing fun _versionId(): JsonField<String> = versionId

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
         * Returns a mutable builder for constructing an instance of [VersionConfig].
         *
         * The following fields are required:
         * ```java
         * .percentage()
         * .versionId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [VersionConfig]. */
    class Builder internal constructor() {

        private var percentage: JsonField<Double>? = null
        private var versionId: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(versionConfig: VersionConfig) = apply {
            percentage = versionConfig.percentage
            versionId = versionConfig.versionId
            additionalProperties = versionConfig.additionalProperties.toMutableMap()
        }

        /** Percentage of traffic for this version [1-99] */
        fun percentage(percentage: Double) = percentage(JsonField.of(percentage))

        /**
         * Sets [Builder.percentage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.percentage] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun percentage(percentage: JsonField<Double>) = apply { this.percentage = percentage }

        /** Version ID string that references assistant_versions.version_id */
        fun versionId(versionId: String) = versionId(JsonField.of(versionId))

        /**
         * Sets [Builder.versionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.versionId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun versionId(versionId: JsonField<String>) = apply { this.versionId = versionId }

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
         * Returns an immutable instance of [VersionConfig].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .percentage()
         * .versionId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): VersionConfig =
            VersionConfig(
                checkRequired("percentage", percentage),
                checkRequired("versionId", versionId),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): VersionConfig = apply {
        if (validated) {
            return@apply
        }

        percentage()
        versionId()
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
        (if (percentage.asKnown().isPresent) 1 else 0) +
            (if (versionId.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is VersionConfig &&
            percentage == other.percentage &&
            versionId == other.versionId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(percentage, versionId, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "VersionConfig{percentage=$percentage, versionId=$versionId, additionalProperties=$additionalProperties}"
}
