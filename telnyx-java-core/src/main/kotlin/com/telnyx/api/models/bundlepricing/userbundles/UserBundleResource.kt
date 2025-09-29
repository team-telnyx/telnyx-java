// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.bundlepricing.userbundles

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
import java.time.LocalDate
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class UserBundleResource
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val createdAt: JsonField<LocalDate>,
    private val resource: JsonField<String>,
    private val resourceType: JsonField<String>,
    private val updatedAt: JsonField<LocalDate>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("resource") @ExcludeMissing resource: JsonField<String> = JsonMissing.of(),
        @JsonProperty("resource_type")
        @ExcludeMissing
        resourceType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<LocalDate> = JsonMissing.of(),
    ) : this(id, createdAt, resource, resourceType, updatedAt, mutableMapOf())

    /**
     * Resource's ID.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * Date the resource was created.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): LocalDate = createdAt.getRequired("created_at")

    /**
     * The resource itself (usually a phone number).
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun resource(): String = resource.getRequired("resource")

    /**
     * The type of the resource (usually 'number').
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun resourceType(): String = resourceType.getRequired("resource_type")

    /**
     * Date the resource was last updated.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun updatedAt(): Optional<LocalDate> = updatedAt.getOptional("updated_at")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at") @ExcludeMissing fun _createdAt(): JsonField<LocalDate> = createdAt

    /**
     * Returns the raw JSON value of [resource].
     *
     * Unlike [resource], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("resource") @ExcludeMissing fun _resource(): JsonField<String> = resource

    /**
     * Returns the raw JSON value of [resourceType].
     *
     * Unlike [resourceType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("resource_type")
    @ExcludeMissing
    fun _resourceType(): JsonField<String> = resourceType

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at") @ExcludeMissing fun _updatedAt(): JsonField<LocalDate> = updatedAt

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
         * Returns a mutable builder for constructing an instance of [UserBundleResource].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .createdAt()
         * .resource()
         * .resourceType()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [UserBundleResource]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var createdAt: JsonField<LocalDate>? = null
        private var resource: JsonField<String>? = null
        private var resourceType: JsonField<String>? = null
        private var updatedAt: JsonField<LocalDate> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(userBundleResource: UserBundleResource) = apply {
            id = userBundleResource.id
            createdAt = userBundleResource.createdAt
            resource = userBundleResource.resource
            resourceType = userBundleResource.resourceType
            updatedAt = userBundleResource.updatedAt
            additionalProperties = userBundleResource.additionalProperties.toMutableMap()
        }

        /** Resource's ID. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Date the resource was created. */
        fun createdAt(createdAt: LocalDate) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [LocalDate] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun createdAt(createdAt: JsonField<LocalDate>) = apply { this.createdAt = createdAt }

        /** The resource itself (usually a phone number). */
        fun resource(resource: String) = resource(JsonField.of(resource))

        /**
         * Sets [Builder.resource] to an arbitrary JSON value.
         *
         * You should usually call [Builder.resource] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun resource(resource: JsonField<String>) = apply { this.resource = resource }

        /** The type of the resource (usually 'number'). */
        fun resourceType(resourceType: String) = resourceType(JsonField.of(resourceType))

        /**
         * Sets [Builder.resourceType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.resourceType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun resourceType(resourceType: JsonField<String>) = apply {
            this.resourceType = resourceType
        }

        /** Date the resource was last updated. */
        fun updatedAt(updatedAt: LocalDate?) = updatedAt(JsonField.ofNullable(updatedAt))

        /** Alias for calling [Builder.updatedAt] with `updatedAt.orElse(null)`. */
        fun updatedAt(updatedAt: Optional<LocalDate>) = updatedAt(updatedAt.getOrNull())

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [LocalDate] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun updatedAt(updatedAt: JsonField<LocalDate>) = apply { this.updatedAt = updatedAt }

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
         * Returns an immutable instance of [UserBundleResource].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .createdAt()
         * .resource()
         * .resourceType()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): UserBundleResource =
            UserBundleResource(
                checkRequired("id", id),
                checkRequired("createdAt", createdAt),
                checkRequired("resource", resource),
                checkRequired("resourceType", resourceType),
                updatedAt,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): UserBundleResource = apply {
        if (validated) {
            return@apply
        }

        id()
        createdAt()
        resource()
        resourceType()
        updatedAt()
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
        (if (id.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (resource.asKnown().isPresent) 1 else 0) +
            (if (resourceType.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UserBundleResource &&
            id == other.id &&
            createdAt == other.createdAt &&
            resource == other.resource &&
            resourceType == other.resourceType &&
            updatedAt == other.updatedAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(id, createdAt, resource, resourceType, updatedAt, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "UserBundleResource{id=$id, createdAt=$createdAt, resource=$resource, resourceType=$resourceType, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
