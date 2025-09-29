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
import com.telnyx.api.core.checkKnown
import com.telnyx.api.core.checkRequired
import com.telnyx.api.core.toImmutable
import com.telnyx.api.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

/** Request model for creating or updating canary deploys. */
class CanaryDeploy
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val versions: JsonField<List<VersionConfig>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("versions")
        @ExcludeMissing
        versions: JsonField<List<VersionConfig>> = JsonMissing.of()
    ) : this(versions, mutableMapOf())

    /**
     * List of version configurations
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun versions(): List<VersionConfig> = versions.getRequired("versions")

    /**
     * Returns the raw JSON value of [versions].
     *
     * Unlike [versions], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("versions")
    @ExcludeMissing
    fun _versions(): JsonField<List<VersionConfig>> = versions

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
         * Returns a mutable builder for constructing an instance of [CanaryDeploy].
         *
         * The following fields are required:
         * ```java
         * .versions()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CanaryDeploy]. */
    class Builder internal constructor() {

        private var versions: JsonField<MutableList<VersionConfig>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(canaryDeploy: CanaryDeploy) = apply {
            versions = canaryDeploy.versions.map { it.toMutableList() }
            additionalProperties = canaryDeploy.additionalProperties.toMutableMap()
        }

        /** List of version configurations */
        fun versions(versions: List<VersionConfig>) = versions(JsonField.of(versions))

        /**
         * Sets [Builder.versions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.versions] with a well-typed `List<VersionConfig>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun versions(versions: JsonField<List<VersionConfig>>) = apply {
            this.versions = versions.map { it.toMutableList() }
        }

        /**
         * Adds a single [VersionConfig] to [versions].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addVersion(version: VersionConfig) = apply {
            versions =
                (versions ?: JsonField.of(mutableListOf())).also {
                    checkKnown("versions", it).add(version)
                }
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
         * Returns an immutable instance of [CanaryDeploy].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .versions()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CanaryDeploy =
            CanaryDeploy(
                checkRequired("versions", versions).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): CanaryDeploy = apply {
        if (validated) {
            return@apply
        }

        versions().forEach { it.validate() }
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
        (versions.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CanaryDeploy &&
            versions == other.versions &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(versions, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CanaryDeploy{versions=$versions, additionalProperties=$additionalProperties}"
}
