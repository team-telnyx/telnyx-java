// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.bundlepricing.userbundles

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import com.telnyx.sdk.models.bundlepricing.billingbundles.BillingBundleSummary
import java.time.LocalDate
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class UserBundle
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val active: JsonField<Boolean>,
    private val billingBundle: JsonField<BillingBundleSummary>,
    private val createdAt: JsonField<LocalDate>,
    private val resources: JsonField<List<UserBundleResource>>,
    private val userId: JsonField<String>,
    private val updatedAt: JsonField<LocalDate>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("active") @ExcludeMissing active: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("billing_bundle")
        @ExcludeMissing
        billingBundle: JsonField<BillingBundleSummary> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("resources")
        @ExcludeMissing
        resources: JsonField<List<UserBundleResource>> = JsonMissing.of(),
        @JsonProperty("user_id") @ExcludeMissing userId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<LocalDate> = JsonMissing.of(),
    ) : this(id, active, billingBundle, createdAt, resources, userId, updatedAt, mutableMapOf())

    /**
     * User bundle's ID, this is used to identify the user bundle in the API.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * Status of the user bundle.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun active(): Boolean = active.getRequired("active")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun billingBundle(): BillingBundleSummary = billingBundle.getRequired("billing_bundle")

    /**
     * Date the user bundle was created.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): LocalDate = createdAt.getRequired("created_at")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun resources(): List<UserBundleResource> = resources.getRequired("resources")

    /**
     * The customer's ID that owns this user bundle.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun userId(): String = userId.getRequired("user_id")

    /**
     * Date the user bundle was last updated.
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
     * Returns the raw JSON value of [active].
     *
     * Unlike [active], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("active") @ExcludeMissing fun _active(): JsonField<Boolean> = active

    /**
     * Returns the raw JSON value of [billingBundle].
     *
     * Unlike [billingBundle], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("billing_bundle")
    @ExcludeMissing
    fun _billingBundle(): JsonField<BillingBundleSummary> = billingBundle

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at") @ExcludeMissing fun _createdAt(): JsonField<LocalDate> = createdAt

    /**
     * Returns the raw JSON value of [resources].
     *
     * Unlike [resources], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("resources")
    @ExcludeMissing
    fun _resources(): JsonField<List<UserBundleResource>> = resources

    /**
     * Returns the raw JSON value of [userId].
     *
     * Unlike [userId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("user_id") @ExcludeMissing fun _userId(): JsonField<String> = userId

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
         * Returns a mutable builder for constructing an instance of [UserBundle].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .active()
         * .billingBundle()
         * .createdAt()
         * .resources()
         * .userId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [UserBundle]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var active: JsonField<Boolean>? = null
        private var billingBundle: JsonField<BillingBundleSummary>? = null
        private var createdAt: JsonField<LocalDate>? = null
        private var resources: JsonField<MutableList<UserBundleResource>>? = null
        private var userId: JsonField<String>? = null
        private var updatedAt: JsonField<LocalDate> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(userBundle: UserBundle) = apply {
            id = userBundle.id
            active = userBundle.active
            billingBundle = userBundle.billingBundle
            createdAt = userBundle.createdAt
            resources = userBundle.resources.map { it.toMutableList() }
            userId = userBundle.userId
            updatedAt = userBundle.updatedAt
            additionalProperties = userBundle.additionalProperties.toMutableMap()
        }

        /** User bundle's ID, this is used to identify the user bundle in the API. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Status of the user bundle. */
        fun active(active: Boolean) = active(JsonField.of(active))

        /**
         * Sets [Builder.active] to an arbitrary JSON value.
         *
         * You should usually call [Builder.active] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun active(active: JsonField<Boolean>) = apply { this.active = active }

        fun billingBundle(billingBundle: BillingBundleSummary) =
            billingBundle(JsonField.of(billingBundle))

        /**
         * Sets [Builder.billingBundle] to an arbitrary JSON value.
         *
         * You should usually call [Builder.billingBundle] with a well-typed [BillingBundleSummary]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun billingBundle(billingBundle: JsonField<BillingBundleSummary>) = apply {
            this.billingBundle = billingBundle
        }

        /** Date the user bundle was created. */
        fun createdAt(createdAt: LocalDate) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [LocalDate] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun createdAt(createdAt: JsonField<LocalDate>) = apply { this.createdAt = createdAt }

        fun resources(resources: List<UserBundleResource>) = resources(JsonField.of(resources))

        /**
         * Sets [Builder.resources] to an arbitrary JSON value.
         *
         * You should usually call [Builder.resources] with a well-typed `List<UserBundleResource>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun resources(resources: JsonField<List<UserBundleResource>>) = apply {
            this.resources = resources.map { it.toMutableList() }
        }

        /**
         * Adds a single [UserBundleResource] to [resources].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addResource(resource: UserBundleResource) = apply {
            resources =
                (resources ?: JsonField.of(mutableListOf())).also {
                    checkKnown("resources", it).add(resource)
                }
        }

        /** The customer's ID that owns this user bundle. */
        fun userId(userId: String) = userId(JsonField.of(userId))

        /**
         * Sets [Builder.userId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.userId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun userId(userId: JsonField<String>) = apply { this.userId = userId }

        /** Date the user bundle was last updated. */
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
         * Returns an immutable instance of [UserBundle].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .active()
         * .billingBundle()
         * .createdAt()
         * .resources()
         * .userId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): UserBundle =
            UserBundle(
                checkRequired("id", id),
                checkRequired("active", active),
                checkRequired("billingBundle", billingBundle),
                checkRequired("createdAt", createdAt),
                checkRequired("resources", resources).map { it.toImmutable() },
                checkRequired("userId", userId),
                updatedAt,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): UserBundle = apply {
        if (validated) {
            return@apply
        }

        id()
        active()
        billingBundle().validate()
        createdAt()
        resources().forEach { it.validate() }
        userId()
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
            (if (active.asKnown().isPresent) 1 else 0) +
            (billingBundle.asKnown().getOrNull()?.validity() ?: 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (resources.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (userId.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UserBundle &&
            id == other.id &&
            active == other.active &&
            billingBundle == other.billingBundle &&
            createdAt == other.createdAt &&
            resources == other.resources &&
            userId == other.userId &&
            updatedAt == other.updatedAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            active,
            billingBundle,
            createdAt,
            resources,
            userId,
            updatedAt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "UserBundle{id=$id, active=$active, billingBundle=$billingBundle, createdAt=$createdAt, resources=$resources, userId=$userId, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
