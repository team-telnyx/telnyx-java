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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

/** Response model for canary deploy operations. */
class CanaryDeployResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val assistantId: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val versions: JsonField<List<VersionConfig>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("assistant_id")
        @ExcludeMissing
        assistantId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("versions")
        @ExcludeMissing
        versions: JsonField<List<VersionConfig>> = JsonMissing.of(),
    ) : this(assistantId, createdAt, updatedAt, versions, mutableMapOf())

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun assistantId(): String = assistantId.getRequired("assistant_id")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun versions(): List<VersionConfig> = versions.getRequired("versions")

    /**
     * Returns the raw JSON value of [assistantId].
     *
     * Unlike [assistantId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("assistant_id")
    @ExcludeMissing
    fun _assistantId(): JsonField<String> = assistantId

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

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
         * Returns a mutable builder for constructing an instance of [CanaryDeployResponse].
         *
         * The following fields are required:
         * ```java
         * .assistantId()
         * .createdAt()
         * .updatedAt()
         * .versions()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CanaryDeployResponse]. */
    class Builder internal constructor() {

        private var assistantId: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var versions: JsonField<MutableList<VersionConfig>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(canaryDeployResponse: CanaryDeployResponse) = apply {
            assistantId = canaryDeployResponse.assistantId
            createdAt = canaryDeployResponse.createdAt
            updatedAt = canaryDeployResponse.updatedAt
            versions = canaryDeployResponse.versions.map { it.toMutableList() }
            additionalProperties = canaryDeployResponse.additionalProperties.toMutableMap()
        }

        fun assistantId(assistantId: String) = assistantId(JsonField.of(assistantId))

        /**
         * Sets [Builder.assistantId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.assistantId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun assistantId(assistantId: JsonField<String>) = apply { this.assistantId = assistantId }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

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
         * Returns an immutable instance of [CanaryDeployResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .assistantId()
         * .createdAt()
         * .updatedAt()
         * .versions()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CanaryDeployResponse =
            CanaryDeployResponse(
                checkRequired("assistantId", assistantId),
                checkRequired("createdAt", createdAt),
                checkRequired("updatedAt", updatedAt),
                checkRequired("versions", versions).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): CanaryDeployResponse = apply {
        if (validated) {
            return@apply
        }

        assistantId()
        createdAt()
        updatedAt()
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
        (if (assistantId.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (versions.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CanaryDeployResponse &&
            assistantId == other.assistantId &&
            createdAt == other.createdAt &&
            updatedAt == other.updatedAt &&
            versions == other.versions &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(assistantId, createdAt, updatedAt, versions, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CanaryDeployResponse{assistantId=$assistantId, createdAt=$createdAt, updatedAt=$updatedAt, versions=$versions, additionalProperties=$additionalProperties}"
}
