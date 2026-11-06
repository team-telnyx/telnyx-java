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
import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Changes a policy, which publishes a new version of it. A field left out stays as it is;
 * `guardrails` and `pipeline` are replaced whole, and `model: null` removes the condition.
 */
class PolicyUpdateParams
private constructor(
    private val instanceId: String,
    private val name: String?,
    private val body: Body,
    private val additionalHeaders: com.telnyx.sdk.core.http.Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun instanceId(): String = instanceId

    fun name(): Optional<String> = Optional.ofNullable(name)

    /**
     * A policy this one builds on, by name. The policy starts with the base's guardrails.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun base(): Optional<String> = body.base()

    /**
     * What the policy is for.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<String> = body.description()

    /**
     * The guardrails a policy adds to its base's, and the ones it removes from them, by name.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun guardrails(): Optional<AgentGatewayPolicyGuardrails> = body.guardrails()

    /**
     * A condition on the model, by name or regular expression. The policy's guardrails run only on
     * requests for a matching model. `null` matches every model.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun model(): Optional<String> = body.model()

    /**
     * Ordered steps that run in place of the policy's guardrails running independently.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun pipeline(): Optional<AgentGatewayPolicyPipeline> = body.pipeline()

    /**
     * Returns the raw JSON value of [base].
     *
     * Unlike [base], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _base(): JsonField<String> = body._base()

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _description(): JsonField<String> = body._description()

    /**
     * Returns the raw JSON value of [guardrails].
     *
     * Unlike [guardrails], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _guardrails(): JsonField<AgentGatewayPolicyGuardrails> = body._guardrails()

    /**
     * Returns the raw JSON value of [model].
     *
     * Unlike [model], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _model(): JsonField<String> = body._model()

    /**
     * Returns the raw JSON value of [pipeline].
     *
     * Unlike [pipeline], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _pipeline(): JsonField<AgentGatewayPolicyPipeline> = body._pipeline()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PolicyUpdateParams].
         *
         * The following fields are required:
         * ```java
         * .instanceId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PolicyUpdateParams]. */
    class Builder internal constructor() {

        private var instanceId: String? = null
        private var name: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: com.telnyx.sdk.core.http.Headers.Builder =
            com.telnyx.sdk.core.http.Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(policyUpdateParams: PolicyUpdateParams) = apply {
            instanceId = policyUpdateParams.instanceId
            name = policyUpdateParams.name
            body = policyUpdateParams.body.toBuilder()
            additionalHeaders = policyUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = policyUpdateParams.additionalQueryParams.toBuilder()
        }

        fun instanceId(instanceId: String) = apply { this.instanceId = instanceId }

        fun name(name: String?) = apply { this.name = name }

        /** Alias for calling [Builder.name] with `name.orElse(null)`. */
        fun name(name: Optional<String>) = name(name.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [base]
         * - [description]
         * - [guardrails]
         * - [model]
         * - [pipeline]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** A policy this one builds on, by name. The policy starts with the base's guardrails. */
        fun base(base: String?) = apply { body.base(base) }

        /** Alias for calling [Builder.base] with `base.orElse(null)`. */
        fun base(base: Optional<String>) = base(base.getOrNull())

        /**
         * Sets [Builder.base] to an arbitrary JSON value.
         *
         * You should usually call [Builder.base] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun base(base: JsonField<String>) = apply { body.base(base) }

        /** What the policy is for. */
        fun description(description: String?) = apply { body.description(description) }

        /** Alias for calling [Builder.description] with `description.orElse(null)`. */
        fun description(description: Optional<String>) = description(description.getOrNull())

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { body.description(description) }

        /**
         * The guardrails a policy adds to its base's, and the ones it removes from them, by name.
         */
        fun guardrails(guardrails: AgentGatewayPolicyGuardrails) = apply {
            body.guardrails(guardrails)
        }

        /**
         * Sets [Builder.guardrails] to an arbitrary JSON value.
         *
         * You should usually call [Builder.guardrails] with a well-typed
         * [AgentGatewayPolicyGuardrails] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun guardrails(guardrails: JsonField<AgentGatewayPolicyGuardrails>) = apply {
            body.guardrails(guardrails)
        }

        /**
         * A condition on the model, by name or regular expression. The policy's guardrails run only
         * on requests for a matching model. `null` matches every model.
         */
        fun model(model: String?) = apply { body.model(model) }

        /** Alias for calling [Builder.model] with `model.orElse(null)`. */
        fun model(model: Optional<String>) = model(model.getOrNull())

        /**
         * Sets [Builder.model] to an arbitrary JSON value.
         *
         * You should usually call [Builder.model] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun model(model: JsonField<String>) = apply { body.model(model) }

        /** Ordered steps that run in place of the policy's guardrails running independently. */
        fun pipeline(pipeline: AgentGatewayPolicyPipeline?) = apply { body.pipeline(pipeline) }

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
            body.pipeline(pipeline)
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: com.telnyx.sdk.core.http.Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: com.telnyx.sdk.core.http.Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: com.telnyx.sdk.core.http.Headers) =
            apply {
                this.additionalHeaders.replaceAll(additionalHeaders)
            }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [PolicyUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .instanceId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PolicyUpdateParams =
            PolicyUpdateParams(
                checkRequired("instanceId", instanceId),
                name,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> instanceId
            1 -> name ?: ""
            else -> ""
        }

    override fun _headers(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /**
     * A field left out stays as it is. `guardrails` and `pipeline` are replaced whole, and `model:
     * null` removes the condition. The name cannot change.
     */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val base: JsonField<String>,
        private val description: JsonField<String>,
        private val guardrails: JsonField<AgentGatewayPolicyGuardrails>,
        private val model: JsonField<String>,
        private val pipeline: JsonField<AgentGatewayPolicyPipeline>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("base") @ExcludeMissing base: JsonField<String> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("guardrails")
            @ExcludeMissing
            guardrails: JsonField<AgentGatewayPolicyGuardrails> = JsonMissing.of(),
            @JsonProperty("model") @ExcludeMissing model: JsonField<String> = JsonMissing.of(),
            @JsonProperty("pipeline")
            @ExcludeMissing
            pipeline: JsonField<AgentGatewayPolicyPipeline> = JsonMissing.of(),
        ) : this(base, description, guardrails, model, pipeline, mutableMapOf())

        /**
         * A policy this one builds on, by name. The policy starts with the base's guardrails.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun base(): Optional<String> = base.getOptional("base")

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
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun guardrails(): Optional<AgentGatewayPolicyGuardrails> =
            guardrails.getOptional("guardrails")

        /**
         * A condition on the model, by name or regular expression. The policy's guardrails run only
         * on requests for a matching model. `null` matches every model.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun model(): Optional<String> = model.getOptional("model")

        /**
         * Ordered steps that run in place of the policy's guardrails running independently.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun pipeline(): Optional<AgentGatewayPolicyPipeline> = pipeline.getOptional("pipeline")

        /**
         * Returns the raw JSON value of [base].
         *
         * Unlike [base], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("base") @ExcludeMissing fun _base(): JsonField<String> = base

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

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
         * Returns the raw JSON value of [pipeline].
         *
         * Unlike [pipeline], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("pipeline")
        @ExcludeMissing
        fun _pipeline(): JsonField<AgentGatewayPolicyPipeline> = pipeline

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

            /** Returns a mutable builder for constructing an instance of [Body]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var base: JsonField<String> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var guardrails: JsonField<AgentGatewayPolicyGuardrails> = JsonMissing.of()
            private var model: JsonField<String> = JsonMissing.of()
            private var pipeline: JsonField<AgentGatewayPolicyPipeline> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                base = body.base
                description = body.description
                guardrails = body.guardrails
                model = body.model
                pipeline = body.pipeline
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * A policy this one builds on, by name. The policy starts with the base's guardrails.
             */
            fun base(base: String?) = base(JsonField.ofNullable(base))

            /** Alias for calling [Builder.base] with `base.orElse(null)`. */
            fun base(base: Optional<String>) = base(base.getOrNull())

            /**
             * Sets [Builder.base] to an arbitrary JSON value.
             *
             * You should usually call [Builder.base] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun base(base: JsonField<String>) = apply { this.base = base }

            /** What the policy is for. */
            fun description(description: String?) = description(JsonField.ofNullable(description))

            /** Alias for calling [Builder.description] with `description.orElse(null)`. */
            fun description(description: Optional<String>) = description(description.getOrNull())

            /**
             * Sets [Builder.description] to an arbitrary JSON value.
             *
             * You should usually call [Builder.description] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /**
             * The guardrails a policy adds to its base's, and the ones it removes from them, by
             * name.
             */
            fun guardrails(guardrails: AgentGatewayPolicyGuardrails) =
                guardrails(JsonField.of(guardrails))

            /**
             * Sets [Builder.guardrails] to an arbitrary JSON value.
             *
             * You should usually call [Builder.guardrails] with a well-typed
             * [AgentGatewayPolicyGuardrails] value instead. This method is primarily for setting
             * the field to an undocumented or not yet supported value.
             */
            fun guardrails(guardrails: JsonField<AgentGatewayPolicyGuardrails>) = apply {
                this.guardrails = guardrails
            }

            /**
             * A condition on the model, by name or regular expression. The policy's guardrails run
             * only on requests for a matching model. `null` matches every model.
             */
            fun model(model: String?) = model(JsonField.ofNullable(model))

            /** Alias for calling [Builder.model] with `model.orElse(null)`. */
            fun model(model: Optional<String>) = model(model.getOrNull())

            /**
             * Sets [Builder.model] to an arbitrary JSON value.
             *
             * You should usually call [Builder.model] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun model(model: JsonField<String>) = apply { this.model = model }

            /** Ordered steps that run in place of the policy's guardrails running independently. */
            fun pipeline(pipeline: AgentGatewayPolicyPipeline?) =
                pipeline(JsonField.ofNullable(pipeline))

            /** Alias for calling [Builder.pipeline] with `pipeline.orElse(null)`. */
            fun pipeline(pipeline: Optional<AgentGatewayPolicyPipeline>) =
                pipeline(pipeline.getOrNull())

            /**
             * Sets [Builder.pipeline] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pipeline] with a well-typed
             * [AgentGatewayPolicyPipeline] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun pipeline(pipeline: JsonField<AgentGatewayPolicyPipeline>) = apply {
                this.pipeline = pipeline
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Body =
                Body(
                    base,
                    description,
                    guardrails,
                    model,
                    pipeline,
                    additionalProperties.toMutableMap(),
                )
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
        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            base()
            description()
            guardrails().ifPresent { it.validate() }
            model()
            pipeline().ifPresent { it.validate() }
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
            (if (base.asKnown().isPresent) 1 else 0) +
                (if (description.asKnown().isPresent) 1 else 0) +
                (guardrails.asKnown().getOrNull()?.validity() ?: 0) +
                (if (model.asKnown().isPresent) 1 else 0) +
                (pipeline.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                base == other.base &&
                description == other.description &&
                guardrails == other.guardrails &&
                model == other.model &&
                pipeline == other.pipeline &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(base, description, guardrails, model, pipeline, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{base=$base, description=$description, guardrails=$guardrails, model=$model, pipeline=$pipeline, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PolicyUpdateParams &&
            instanceId == other.instanceId &&
            name == other.name &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(instanceId, name, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "PolicyUpdateParams{instanceId=$instanceId, name=$name, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
