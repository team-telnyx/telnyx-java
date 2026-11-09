// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.agentgateways.policies

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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** A named set of guardrails. */
class AgentGatewayPolicy
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val base: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val description: JsonField<String>,
    private val guardrails: JsonField<AgentGatewayPolicyGuardrails>,
    private val model: JsonField<String>,
    private val name: JsonField<String>,
    private val pipeline: JsonField<AgentGatewayPolicyPipeline>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("base") @ExcludeMissing base: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("guardrails")
        @ExcludeMissing
        guardrails: JsonField<AgentGatewayPolicyGuardrails> = JsonMissing.of(),
        @JsonProperty("model") @ExcludeMissing model: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("pipeline")
        @ExcludeMissing
        pipeline: JsonField<AgentGatewayPolicyPipeline> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        base,
        createdAt,
        description,
        guardrails,
        model,
        name,
        pipeline,
        updatedAt,
        mutableMapOf(),
    )

    /**
     * A policy this one builds on, by name. The policy starts with the base's guardrails.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun base(): Optional<String> = base.getOptional("base")

    /**
     * When the policy's current version was created. An update creates a new version.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("created_at")

    /**
     * What the policy is for.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<String> = description.getOptional("description")

    /**
     * The guardrails a policy adds to its base's, and the ones it removes from them, by name.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun guardrails(): AgentGatewayPolicyGuardrails = guardrails.getRequired("guardrails")

    /**
     * A condition on the model, by name or regular expression. The policy's guardrails run only on
     * requests for a matching model. `null` matches every model.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun model(): Optional<String> = model.getOptional("model")

    /**
     * A name, unique on the instance. A request names the policy in its `policies` field.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * Ordered steps that run in place of the policy's guardrails running independently.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun pipeline(): Optional<AgentGatewayPolicyPipeline> = pipeline.getOptional("pipeline")

    /**
     * When the policy last changed.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun updatedAt(): Optional<OffsetDateTime> = updatedAt.getOptional("updated_at")

    /**
     * Returns the raw JSON value of [base].
     *
     * Unlike [base], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("base") @ExcludeMissing fun _base(): JsonField<String> = base

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [guardrails].
     *
     * Unlike [guardrails], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("guardrails")
    @ExcludeMissing
    fun _guardrails(): JsonField<AgentGatewayPolicyGuardrails> = guardrails

    /**
     * Returns the raw JSON value of [model].
     *
     * Unlike [model], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("model") @ExcludeMissing fun _model(): JsonField<String> = model

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [pipeline].
     *
     * Unlike [pipeline], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pipeline")
    @ExcludeMissing
    fun _pipeline(): JsonField<AgentGatewayPolicyPipeline> = pipeline

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
         * Returns a mutable builder for constructing an instance of [AgentGatewayPolicy].
         *
         * The following fields are required:
         * ```java
         * .base()
         * .createdAt()
         * .description()
         * .guardrails()
         * .model()
         * .name()
         * .pipeline()
         * .updatedAt()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AgentGatewayPolicy]. */
    class Builder internal constructor() {

        private var base: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var description: JsonField<String>? = null
        private var guardrails: JsonField<AgentGatewayPolicyGuardrails>? = null
        private var model: JsonField<String>? = null
        private var name: JsonField<String>? = null
        private var pipeline: JsonField<AgentGatewayPolicyPipeline>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(agentGatewayPolicy: AgentGatewayPolicy) = apply {
            base = agentGatewayPolicy.base
            createdAt = agentGatewayPolicy.createdAt
            description = agentGatewayPolicy.description
            guardrails = agentGatewayPolicy.guardrails
            model = agentGatewayPolicy.model
            name = agentGatewayPolicy.name
            pipeline = agentGatewayPolicy.pipeline
            updatedAt = agentGatewayPolicy.updatedAt
            additionalProperties = agentGatewayPolicy.additionalProperties.toMutableMap()
        }

        /** A policy this one builds on, by name. The policy starts with the base's guardrails. */
        fun base(base: String?) = base(JsonField.ofNullable(base))

        /** Alias for calling [Builder.base] with `base.orElse(null)`. */
        fun base(base: Optional<String>) = base(base.getOrNull())

        /**
         * Sets [Builder.base] to an arbitrary JSON value.
         *
         * You should usually call [Builder.base] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun base(base: JsonField<String>) = apply { this.base = base }

        /** When the policy's current version was created. An update creates a new version. */
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

        /** What the policy is for. */
        fun description(description: String?) = description(JsonField.ofNullable(description))

        /** Alias for calling [Builder.description] with `description.orElse(null)`. */
        fun description(description: Optional<String>) = description(description.getOrNull())

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        /**
         * The guardrails a policy adds to its base's, and the ones it removes from them, by name.
         */
        fun guardrails(guardrails: AgentGatewayPolicyGuardrails) =
            guardrails(JsonField.of(guardrails))

        /**
         * Sets [Builder.guardrails] to an arbitrary JSON value.
         *
         * You should usually call [Builder.guardrails] with a well-typed
         * [AgentGatewayPolicyGuardrails] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun guardrails(guardrails: JsonField<AgentGatewayPolicyGuardrails>) = apply {
            this.guardrails = guardrails
        }

        /**
         * A condition on the model, by name or regular expression. The policy's guardrails run only
         * on requests for a matching model. `null` matches every model.
         */
        fun model(model: String?) = model(JsonField.ofNullable(model))

        /** Alias for calling [Builder.model] with `model.orElse(null)`. */
        fun model(model: Optional<String>) = model(model.getOrNull())

        /**
         * Sets [Builder.model] to an arbitrary JSON value.
         *
         * You should usually call [Builder.model] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun model(model: JsonField<String>) = apply { this.model = model }

        /** A name, unique on the instance. A request names the policy in its `policies` field. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** Ordered steps that run in place of the policy's guardrails running independently. */
        fun pipeline(pipeline: AgentGatewayPolicyPipeline?) =
            pipeline(JsonField.ofNullable(pipeline))

        /** Alias for calling [Builder.pipeline] with `pipeline.orElse(null)`. */
        fun pipeline(pipeline: Optional<AgentGatewayPolicyPipeline>) =
            pipeline(pipeline.getOrNull())

        /**
         * Sets [Builder.pipeline] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pipeline] with a well-typed [AgentGatewayPolicyPipeline]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun pipeline(pipeline: JsonField<AgentGatewayPolicyPipeline>) = apply {
            this.pipeline = pipeline
        }

        /** When the policy last changed. */
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
         * Returns an immutable instance of [AgentGatewayPolicy].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .base()
         * .createdAt()
         * .description()
         * .guardrails()
         * .model()
         * .name()
         * .pipeline()
         * .updatedAt()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AgentGatewayPolicy =
            AgentGatewayPolicy(
                checkRequired("base", base),
                checkRequired("createdAt", createdAt),
                checkRequired("description", description),
                checkRequired("guardrails", guardrails),
                checkRequired("model", model),
                checkRequired("name", name),
                checkRequired("pipeline", pipeline),
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
    fun validate(): AgentGatewayPolicy = apply {
        if (validated) {
            return@apply
        }

        base()
        createdAt()
        description()
        guardrails().validate()
        model()
        name()
        pipeline().ifPresent { it.validate() }
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
        (if (base.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (description.asKnown().isPresent) 1 else 0) +
            (guardrails.asKnown().getOrNull()?.validity() ?: 0) +
            (if (model.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (pipeline.asKnown().getOrNull()?.validity() ?: 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AgentGatewayPolicy &&
            base == other.base &&
            createdAt == other.createdAt &&
            description == other.description &&
            guardrails == other.guardrails &&
            model == other.model &&
            name == other.name &&
            pipeline == other.pipeline &&
            updatedAt == other.updatedAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            base,
            createdAt,
            description,
            guardrails,
            model,
            name,
            pipeline,
            updatedAt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AgentGatewayPolicy{base=$base, createdAt=$createdAt, description=$description, guardrails=$guardrails, model=$model, name=$name, pipeline=$pipeline, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
