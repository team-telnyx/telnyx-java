// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.agentgateways.policyattachments

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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Where an instance applies a policy. */
class AgentGatewayPolicyAttachment
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val isDefault: JsonField<Boolean>,
    private val models: JsonField<List<String>>,
    private val policy: JsonField<String>,
    private val priority: JsonField<Long>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("default") @ExcludeMissing isDefault: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("models") @ExcludeMissing models: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("policy") @ExcludeMissing policy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("priority") @ExcludeMissing priority: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(id, createdAt, isDefault, models, policy, priority, updatedAt, mutableMapOf())

    /**
     * The attachment's ID.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * When the attachment was created.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("created_at")

    /**
     * `true` applies the policy only to the requests no other attachment matches.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun isDefault(): Boolean = isDefault.getRequired("default")

    /**
     * The models whose requests the policy applies to, by name. A name can use `*` as a wildcard.
     * Empty applies the policy to every request.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun models(): List<String> = models.getRequired("models")

    /**
     * The policy to apply, by name.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun policy(): String = policy.getRequired("policy")

    /**
     * An attachment with a priority applies before the others.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun priority(): Optional<Long> = priority.getOptional("priority")

    /**
     * When the attachment last changed.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun updatedAt(): Optional<OffsetDateTime> = updatedAt.getOptional("updated_at")

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
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [isDefault].
     *
     * Unlike [isDefault], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("default") @ExcludeMissing fun _isDefault(): JsonField<Boolean> = isDefault

    /**
     * Returns the raw JSON value of [models].
     *
     * Unlike [models], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("models") @ExcludeMissing fun _models(): JsonField<List<String>> = models

    /**
     * Returns the raw JSON value of [policy].
     *
     * Unlike [policy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("policy") @ExcludeMissing fun _policy(): JsonField<String> = policy

    /**
     * Returns the raw JSON value of [priority].
     *
     * Unlike [priority], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("priority") @ExcludeMissing fun _priority(): JsonField<Long> = priority

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

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
         * Returns a mutable builder for constructing an instance of [AgentGatewayPolicyAttachment].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .createdAt()
         * .isDefault()
         * .models()
         * .policy()
         * .priority()
         * .updatedAt()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AgentGatewayPolicyAttachment]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var isDefault: JsonField<Boolean>? = null
        private var models: JsonField<MutableList<String>>? = null
        private var policy: JsonField<String>? = null
        private var priority: JsonField<Long>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(agentGatewayPolicyAttachment: AgentGatewayPolicyAttachment) = apply {
            id = agentGatewayPolicyAttachment.id
            createdAt = agentGatewayPolicyAttachment.createdAt
            isDefault = agentGatewayPolicyAttachment.isDefault
            models = agentGatewayPolicyAttachment.models.map { it.toMutableList() }
            policy = agentGatewayPolicyAttachment.policy
            priority = agentGatewayPolicyAttachment.priority
            updatedAt = agentGatewayPolicyAttachment.updatedAt
            additionalProperties = agentGatewayPolicyAttachment.additionalProperties.toMutableMap()
        }

        /** The attachment's ID. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** When the attachment was created. */
        fun createdAt(createdAt: OffsetDateTime?) = createdAt(JsonField.ofNullable(createdAt))

        /** Alias for calling [Builder.createdAt] with `createdAt.orElse(null)`. */
        fun createdAt(createdAt: Optional<OffsetDateTime>) = createdAt(createdAt.getOrNull())

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** `true` applies the policy only to the requests no other attachment matches. */
        fun isDefault(isDefault: Boolean) = isDefault(JsonField.of(isDefault))

        /**
         * Sets [Builder.isDefault] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isDefault] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isDefault(isDefault: JsonField<Boolean>) = apply { this.isDefault = isDefault }

        /**
         * The models whose requests the policy applies to, by name. A name can use `*` as a
         * wildcard. Empty applies the policy to every request.
         */
        fun models(models: List<String>) = models(JsonField.of(models))

        /**
         * Sets [Builder.models] to an arbitrary JSON value.
         *
         * You should usually call [Builder.models] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun models(models: JsonField<List<String>>) = apply {
            this.models = models.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [models].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addModel(model: String) = apply {
            models =
                (models ?: JsonField.of(mutableListOf())).also {
                    checkKnown("models", it).add(model)
                }
        }

        /** The policy to apply, by name. */
        fun policy(policy: String) = policy(JsonField.of(policy))

        /**
         * Sets [Builder.policy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.policy] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun policy(policy: JsonField<String>) = apply { this.policy = policy }

        /** An attachment with a priority applies before the others. */
        fun priority(priority: Long?) = priority(JsonField.ofNullable(priority))

        /**
         * Alias for [Builder.priority].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun priority(priority: Long) = priority(priority as Long?)

        /** Alias for calling [Builder.priority] with `priority.orElse(null)`. */
        fun priority(priority: Optional<Long>) = priority(priority.getOrNull())

        /**
         * Sets [Builder.priority] to an arbitrary JSON value.
         *
         * You should usually call [Builder.priority] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun priority(priority: JsonField<Long>) = apply { this.priority = priority }

        /** When the attachment last changed. */
        fun updatedAt(updatedAt: OffsetDateTime?) = updatedAt(JsonField.ofNullable(updatedAt))

        /** Alias for calling [Builder.updatedAt] with `updatedAt.orElse(null)`. */
        fun updatedAt(updatedAt: Optional<OffsetDateTime>) = updatedAt(updatedAt.getOrNull())

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

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
         * Returns an immutable instance of [AgentGatewayPolicyAttachment].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .createdAt()
         * .isDefault()
         * .models()
         * .policy()
         * .priority()
         * .updatedAt()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AgentGatewayPolicyAttachment =
            AgentGatewayPolicyAttachment(
                checkRequired("id", id),
                checkRequired("createdAt", createdAt),
                checkRequired("isDefault", isDefault),
                checkRequired("models", models).map { it.toImmutable() },
                checkRequired("policy", policy),
                checkRequired("priority", priority),
                checkRequired("updatedAt", updatedAt),
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
    fun validate(): AgentGatewayPolicyAttachment = apply {
        if (validated) {
            return@apply
        }

        id()
        createdAt()
        isDefault()
        models()
        policy()
        priority()
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
            (if (isDefault.asKnown().isPresent) 1 else 0) +
            (models.asKnown().getOrNull()?.size ?: 0) +
            (if (policy.asKnown().isPresent) 1 else 0) +
            (if (priority.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AgentGatewayPolicyAttachment &&
            id == other.id &&
            createdAt == other.createdAt &&
            isDefault == other.isDefault &&
            models == other.models &&
            policy == other.policy &&
            priority == other.priority &&
            updatedAt == other.updatedAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            createdAt,
            isDefault,
            models,
            policy,
            priority,
            updatedAt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AgentGatewayPolicyAttachment{id=$id, createdAt=$createdAt, isDefault=$isDefault, models=$models, policy=$policy, priority=$priority, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
