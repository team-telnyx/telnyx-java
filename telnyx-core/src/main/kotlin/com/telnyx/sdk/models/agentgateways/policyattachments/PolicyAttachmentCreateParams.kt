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
import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Applies a policy to every request, or to the requests for the models named. It applies from the
 * next request on.
 */
class PolicyAttachmentCreateParams
private constructor(
    private val instanceId: String?,
    private val body: Body,
    private val additionalHeaders: com.telnyx.sdk.core.http.Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun instanceId(): Optional<String> = Optional.ofNullable(instanceId)

    /**
     * The policy to apply, by name.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun policy(): String = body.policy()

    /**
     * `true` applies the policy only to the requests no other attachment matches.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun default_(): Optional<Boolean> = body.default_()

    /**
     * The models whose requests the policy applies to, by name. A name can use `*` as a wildcard.
     * Empty applies the policy to every request.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun models(): Optional<List<String>> = body.models()

    /**
     * An attachment with a priority applies before the others.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun priority(): Optional<Long> = body.priority()

    /**
     * Returns the raw JSON value of [policy].
     *
     * Unlike [policy], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _policy(): JsonField<String> = body._policy()

    /**
     * Returns the raw JSON value of [default_].
     *
     * Unlike [default_], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _default_(): JsonField<Boolean> = body._default_()

    /**
     * Returns the raw JSON value of [models].
     *
     * Unlike [models], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _models(): JsonField<List<String>> = body._models()

    /**
     * Returns the raw JSON value of [priority].
     *
     * Unlike [priority], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _priority(): JsonField<Long> = body._priority()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PolicyAttachmentCreateParams].
         *
         * The following fields are required:
         * ```java
         * .policy()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PolicyAttachmentCreateParams]. */
    class Builder internal constructor() {

        private var instanceId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: com.telnyx.sdk.core.http.Headers.Builder =
            com.telnyx.sdk.core.http.Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(policyAttachmentCreateParams: PolicyAttachmentCreateParams) = apply {
            instanceId = policyAttachmentCreateParams.instanceId
            body = policyAttachmentCreateParams.body.toBuilder()
            additionalHeaders = policyAttachmentCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = policyAttachmentCreateParams.additionalQueryParams.toBuilder()
        }

        fun instanceId(instanceId: String?) = apply { this.instanceId = instanceId }

        /** Alias for calling [Builder.instanceId] with `instanceId.orElse(null)`. */
        fun instanceId(instanceId: Optional<String>) = instanceId(instanceId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [policy]
         * - [default_]
         * - [models]
         * - [priority]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** The policy to apply, by name. */
        fun policy(policy: String) = apply { body.policy(policy) }

        /**
         * Sets [Builder.policy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.policy] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun policy(policy: JsonField<String>) = apply { body.policy(policy) }

        /** `true` applies the policy only to the requests no other attachment matches. */
        fun default_(default_: Boolean) = apply { body.default_(default_) }

        /**
         * Sets [Builder.default_] to an arbitrary JSON value.
         *
         * You should usually call [Builder.default_] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun default_(default_: JsonField<Boolean>) = apply { body.default_(default_) }

        /**
         * The models whose requests the policy applies to, by name. A name can use `*` as a
         * wildcard. Empty applies the policy to every request.
         */
        fun models(models: List<String>) = apply { body.models(models) }

        /**
         * Sets [Builder.models] to an arbitrary JSON value.
         *
         * You should usually call [Builder.models] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun models(models: JsonField<List<String>>) = apply { body.models(models) }

        /**
         * Adds a single [String] to [models].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addModel(model: String) = apply { body.addModel(model) }

        /** An attachment with a priority applies before the others. */
        fun priority(priority: Long?) = apply { body.priority(priority) }

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
        fun priority(priority: JsonField<Long>) = apply { body.priority(priority) }

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
         * Returns an immutable instance of [PolicyAttachmentCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .policy()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PolicyAttachmentCreateParams =
            PolicyAttachmentCreateParams(
                instanceId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> instanceId ?: ""
            else -> ""
        }

    override fun _headers(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val policy: JsonField<String>,
        private val default_: JsonField<Boolean>,
        private val models: JsonField<List<String>>,
        private val priority: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("policy") @ExcludeMissing policy: JsonField<String> = JsonMissing.of(),
            @JsonProperty("default")
            @ExcludeMissing
            default_: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("models")
            @ExcludeMissing
            models: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("priority") @ExcludeMissing priority: JsonField<Long> = JsonMissing.of(),
        ) : this(policy, default_, models, priority, mutableMapOf())

        /**
         * The policy to apply, by name.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun policy(): String = policy.getRequired("policy")

        /**
         * `true` applies the policy only to the requests no other attachment matches.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun default_(): Optional<Boolean> = default_.getOptional("default")

        /**
         * The models whose requests the policy applies to, by name. A name can use `*` as a
         * wildcard. Empty applies the policy to every request.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun models(): Optional<List<String>> = models.getOptional("models")

        /**
         * An attachment with a priority applies before the others.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun priority(): Optional<Long> = priority.getOptional("priority")

        /**
         * Returns the raw JSON value of [policy].
         *
         * Unlike [policy], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("policy") @ExcludeMissing fun _policy(): JsonField<String> = policy

        /**
         * Returns the raw JSON value of [default_].
         *
         * Unlike [default_], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("default") @ExcludeMissing fun _default_(): JsonField<Boolean> = default_

        /**
         * Returns the raw JSON value of [models].
         *
         * Unlike [models], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("models") @ExcludeMissing fun _models(): JsonField<List<String>> = models

        /**
         * Returns the raw JSON value of [priority].
         *
         * Unlike [priority], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("priority") @ExcludeMissing fun _priority(): JsonField<Long> = priority

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
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .policy()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var policy: JsonField<String>? = null
            private var default_: JsonField<Boolean> = JsonMissing.of()
            private var models: JsonField<MutableList<String>>? = null
            private var priority: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                policy = body.policy
                default_ = body.default_
                models = body.models.map { it.toMutableList() }
                priority = body.priority
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The policy to apply, by name. */
            fun policy(policy: String) = policy(JsonField.of(policy))

            /**
             * Sets [Builder.policy] to an arbitrary JSON value.
             *
             * You should usually call [Builder.policy] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun policy(policy: JsonField<String>) = apply { this.policy = policy }

            /** `true` applies the policy only to the requests no other attachment matches. */
            fun default_(default_: Boolean) = default_(JsonField.of(default_))

            /**
             * Sets [Builder.default_] to an arbitrary JSON value.
             *
             * You should usually call [Builder.default_] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun default_(default_: JsonField<Boolean>) = apply { this.default_ = default_ }

            /**
             * The models whose requests the policy applies to, by name. A name can use `*` as a
             * wildcard. Empty applies the policy to every request.
             */
            fun models(models: List<String>) = models(JsonField.of(models))

            /**
             * Sets [Builder.models] to an arbitrary JSON value.
             *
             * You should usually call [Builder.models] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * You should usually call [Builder.priority] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun priority(priority: JsonField<Long>) = apply { this.priority = priority }

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
             *
             * The following fields are required:
             * ```java
             * .policy()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("policy", policy),
                    default_,
                    (models ?: JsonMissing.of()).map { it.toImmutable() },
                    priority,
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

            policy()
            default_()
            models()
            priority()
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
            (if (policy.asKnown().isPresent) 1 else 0) +
                (if (default_.asKnown().isPresent) 1 else 0) +
                (models.asKnown().getOrNull()?.size ?: 0) +
                (if (priority.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                policy == other.policy &&
                default_ == other.default_ &&
                models == other.models &&
                priority == other.priority &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(policy, default_, models, priority, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{policy=$policy, default_=$default_, models=$models, priority=$priority, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PolicyAttachmentCreateParams &&
            instanceId == other.instanceId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(instanceId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "PolicyAttachmentCreateParams{instanceId=$instanceId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
