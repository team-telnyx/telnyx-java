// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.memory.namespaces.profiles

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

class ProfileListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val memoryCount: JsonField<Long>,
    private val profileId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("memory_count")
        @ExcludeMissing
        memoryCount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("profile_id") @ExcludeMissing profileId: JsonField<String> = JsonMissing.of(),
    ) : this(memoryCount, profileId, mutableMapOf())

    /**
     * Memories stored under this profile, including the consolidated ones that paraphrase others.
     * Listings are ordered by it.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun memoryCount(): Long = memoryCount.getRequired("memory_count")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun profileId(): String = profileId.getRequired("profile_id")

    /**
     * Returns the raw JSON value of [memoryCount].
     *
     * Unlike [memoryCount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("memory_count") @ExcludeMissing fun _memoryCount(): JsonField<Long> = memoryCount

    /**
     * Returns the raw JSON value of [profileId].
     *
     * Unlike [profileId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("profile_id") @ExcludeMissing fun _profileId(): JsonField<String> = profileId

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
         * Returns a mutable builder for constructing an instance of [ProfileListResponse].
         *
         * The following fields are required:
         * ```java
         * .memoryCount()
         * .profileId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ProfileListResponse]. */
    class Builder internal constructor() {

        private var memoryCount: JsonField<Long>? = null
        private var profileId: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(profileListResponse: ProfileListResponse) = apply {
            memoryCount = profileListResponse.memoryCount
            profileId = profileListResponse.profileId
            additionalProperties = profileListResponse.additionalProperties.toMutableMap()
        }

        /**
         * Memories stored under this profile, including the consolidated ones that paraphrase
         * others. Listings are ordered by it.
         */
        fun memoryCount(memoryCount: Long) = memoryCount(JsonField.of(memoryCount))

        /**
         * Sets [Builder.memoryCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.memoryCount] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun memoryCount(memoryCount: JsonField<Long>) = apply { this.memoryCount = memoryCount }

        fun profileId(profileId: String) = profileId(JsonField.of(profileId))

        /**
         * Sets [Builder.profileId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.profileId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun profileId(profileId: JsonField<String>) = apply { this.profileId = profileId }

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
         * Returns an immutable instance of [ProfileListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .memoryCount()
         * .profileId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ProfileListResponse =
            ProfileListResponse(
                checkRequired("memoryCount", memoryCount),
                checkRequired("profileId", profileId),
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
    fun validate(): ProfileListResponse = apply {
        if (validated) {
            return@apply
        }

        memoryCount()
        profileId()
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
        (if (memoryCount.asKnown().isPresent) 1 else 0) +
            (if (profileId.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ProfileListResponse &&
            memoryCount == other.memoryCount &&
            profileId == other.profileId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(memoryCount, profileId, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ProfileListResponse{memoryCount=$memoryCount, profileId=$profileId, additionalProperties=$additionalProperties}"
}
