// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.browsersessions

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

/** Creates an isolated browser session with network access restricted to the domains you allow. */
class BrowserSessionCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: com.telnyx.sdk.core.http.Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun policy(): Policy = body.policy()

    /**
     * Scoped to the organization. The same key and identical normalized policy, limits, and
     * metadata replay the existing session (HTTP 201); a different request returns 409
     * idempotency_conflict. Replays do not restart terminal sessions.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun idempotencyKey(): Optional<String> = body.idempotencyKey()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun limits(): Optional<Limits> = body.limits()

    /**
     * Arbitrary key-value metadata.
     *
     * This arbitrary value can be deserialized into a custom type using the `convert` method:
     * ```java
     * MyClass myObject = browserSessionCreateParams.metadata().convert(MyClass.class);
     * ```
     */
    fun _metadata(): JsonValue = body._metadata()

    /**
     * Returns the raw JSON value of [policy].
     *
     * Unlike [policy], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _policy(): JsonField<Policy> = body._policy()

    /**
     * Returns the raw JSON value of [idempotencyKey].
     *
     * Unlike [idempotencyKey], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _idempotencyKey(): JsonField<String> = body._idempotencyKey()

    /**
     * Returns the raw JSON value of [limits].
     *
     * Unlike [limits], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _limits(): JsonField<Limits> = body._limits()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [BrowserSessionCreateParams].
         *
         * The following fields are required:
         * ```java
         * .policy()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BrowserSessionCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: com.telnyx.sdk.core.http.Headers.Builder =
            com.telnyx.sdk.core.http.Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(browserSessionCreateParams: BrowserSessionCreateParams) = apply {
            body = browserSessionCreateParams.body.toBuilder()
            additionalHeaders = browserSessionCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = browserSessionCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [policy]
         * - [idempotencyKey]
         * - [limits]
         * - [metadata]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun policy(policy: Policy) = apply { body.policy(policy) }

        /**
         * Sets [Builder.policy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.policy] with a well-typed [Policy] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun policy(policy: JsonField<Policy>) = apply { body.policy(policy) }

        /**
         * Scoped to the organization. The same key and identical normalized policy, limits, and
         * metadata replay the existing session (HTTP 201); a different request returns 409
         * idempotency_conflict. Replays do not restart terminal sessions.
         */
        fun idempotencyKey(idempotencyKey: String) = apply { body.idempotencyKey(idempotencyKey) }

        /**
         * Sets [Builder.idempotencyKey] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idempotencyKey] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun idempotencyKey(idempotencyKey: JsonField<String>) = apply {
            body.idempotencyKey(idempotencyKey)
        }

        fun limits(limits: Limits) = apply { body.limits(limits) }

        /**
         * Sets [Builder.limits] to an arbitrary JSON value.
         *
         * You should usually call [Builder.limits] with a well-typed [Limits] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun limits(limits: JsonField<Limits>) = apply { body.limits(limits) }

        /** Arbitrary key-value metadata. */
        fun metadata(metadata: JsonValue) = apply { body.metadata(metadata) }

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
         * Returns an immutable instance of [BrowserSessionCreateParams].
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
        fun build(): BrowserSessionCreateParams =
            BrowserSessionCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val policy: JsonField<Policy>,
        private val idempotencyKey: JsonField<String>,
        private val limits: JsonField<Limits>,
        private val metadata: JsonValue,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("policy") @ExcludeMissing policy: JsonField<Policy> = JsonMissing.of(),
            @JsonProperty("idempotency_key")
            @ExcludeMissing
            idempotencyKey: JsonField<String> = JsonMissing.of(),
            @JsonProperty("limits") @ExcludeMissing limits: JsonField<Limits> = JsonMissing.of(),
            @JsonProperty("metadata") @ExcludeMissing metadata: JsonValue = JsonMissing.of(),
        ) : this(policy, idempotencyKey, limits, metadata, mutableMapOf())

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun policy(): Policy = policy.getRequired("policy")

        /**
         * Scoped to the organization. The same key and identical normalized policy, limits, and
         * metadata replay the existing session (HTTP 201); a different request returns 409
         * idempotency_conflict. Replays do not restart terminal sessions.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun idempotencyKey(): Optional<String> = idempotencyKey.getOptional("idempotency_key")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun limits(): Optional<Limits> = limits.getOptional("limits")

        /**
         * Arbitrary key-value metadata.
         *
         * This arbitrary value can be deserialized into a custom type using the `convert` method:
         * ```java
         * MyClass myObject = body.metadata().convert(MyClass.class);
         * ```
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonValue = metadata

        /**
         * Returns the raw JSON value of [policy].
         *
         * Unlike [policy], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("policy") @ExcludeMissing fun _policy(): JsonField<Policy> = policy

        /**
         * Returns the raw JSON value of [idempotencyKey].
         *
         * Unlike [idempotencyKey], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("idempotency_key")
        @ExcludeMissing
        fun _idempotencyKey(): JsonField<String> = idempotencyKey

        /**
         * Returns the raw JSON value of [limits].
         *
         * Unlike [limits], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("limits") @ExcludeMissing fun _limits(): JsonField<Limits> = limits

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

            private var policy: JsonField<Policy>? = null
            private var idempotencyKey: JsonField<String> = JsonMissing.of()
            private var limits: JsonField<Limits> = JsonMissing.of()
            private var metadata: JsonValue = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                policy = body.policy
                idempotencyKey = body.idempotencyKey
                limits = body.limits
                metadata = body.metadata
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun policy(policy: Policy) = policy(JsonField.of(policy))

            /**
             * Sets [Builder.policy] to an arbitrary JSON value.
             *
             * You should usually call [Builder.policy] with a well-typed [Policy] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun policy(policy: JsonField<Policy>) = apply { this.policy = policy }

            /**
             * Scoped to the organization. The same key and identical normalized policy, limits, and
             * metadata replay the existing session (HTTP 201); a different request returns 409
             * idempotency_conflict. Replays do not restart terminal sessions.
             */
            fun idempotencyKey(idempotencyKey: String) =
                idempotencyKey(JsonField.of(idempotencyKey))

            /**
             * Sets [Builder.idempotencyKey] to an arbitrary JSON value.
             *
             * You should usually call [Builder.idempotencyKey] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun idempotencyKey(idempotencyKey: JsonField<String>) = apply {
                this.idempotencyKey = idempotencyKey
            }

            fun limits(limits: Limits) = limits(JsonField.of(limits))

            /**
             * Sets [Builder.limits] to an arbitrary JSON value.
             *
             * You should usually call [Builder.limits] with a well-typed [Limits] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun limits(limits: JsonField<Limits>) = apply { this.limits = limits }

            /** Arbitrary key-value metadata. */
            fun metadata(metadata: JsonValue) = apply { this.metadata = metadata }

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
                    idempotencyKey,
                    limits,
                    metadata,
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

            policy().validate()
            idempotencyKey()
            limits().ifPresent { it.validate() }
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
            (policy.asKnown().getOrNull()?.validity() ?: 0) +
                (if (idempotencyKey.asKnown().isPresent) 1 else 0) +
                (limits.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                policy == other.policy &&
                idempotencyKey == other.idempotencyKey &&
                limits == other.limits &&
                metadata == other.metadata &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(policy, idempotencyKey, limits, metadata, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{policy=$policy, idempotencyKey=$idempotencyKey, limits=$limits, metadata=$metadata, additionalProperties=$additionalProperties}"
    }

    class Policy
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val allowedDomains: JsonField<List<String>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("allowed_domains")
            @ExcludeMissing
            allowedDomains: JsonField<List<String>> = JsonMissing.of()
        ) : this(allowedDomains, mutableMapOf())

        /**
         * Domain patterns the browser can navigate to. Exact match (example.com) or wildcard
         * (*.example.com). IP literals not allowed.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun allowedDomains(): List<String> = allowedDomains.getRequired("allowed_domains")

        /**
         * Returns the raw JSON value of [allowedDomains].
         *
         * Unlike [allowedDomains], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("allowed_domains")
        @ExcludeMissing
        fun _allowedDomains(): JsonField<List<String>> = allowedDomains

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
             * Returns a mutable builder for constructing an instance of [Policy].
             *
             * The following fields are required:
             * ```java
             * .allowedDomains()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Policy]. */
        class Builder internal constructor() {

            private var allowedDomains: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(policy: Policy) = apply {
                allowedDomains = policy.allowedDomains.map { it.toMutableList() }
                additionalProperties = policy.additionalProperties.toMutableMap()
            }

            /**
             * Domain patterns the browser can navigate to. Exact match (example.com) or wildcard
             * (*.example.com). IP literals not allowed.
             */
            fun allowedDomains(allowedDomains: List<String>) =
                allowedDomains(JsonField.of(allowedDomains))

            /**
             * Sets [Builder.allowedDomains] to an arbitrary JSON value.
             *
             * You should usually call [Builder.allowedDomains] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun allowedDomains(allowedDomains: JsonField<List<String>>) = apply {
                this.allowedDomains = allowedDomains.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [allowedDomains].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAllowedDomain(allowedDomain: String) = apply {
                allowedDomains =
                    (allowedDomains ?: JsonField.of(mutableListOf())).also {
                        checkKnown("allowedDomains", it).add(allowedDomain)
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
             * Returns an immutable instance of [Policy].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .allowedDomains()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Policy =
                Policy(
                    checkRequired("allowedDomains", allowedDomains).map { it.toImmutable() },
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
        fun validate(): Policy = apply {
            if (validated) {
                return@apply
            }

            allowedDomains()
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
        internal fun validity(): Int = (allowedDomains.asKnown().getOrNull()?.size ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Policy &&
                allowedDomains == other.allowedDomains &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(allowedDomains, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Policy{allowedDomains=$allowedDomains, additionalProperties=$additionalProperties}"
    }

    class Limits
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val idleTimeoutS: JsonField<Long>,
        private val lifetimeS: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("idle_timeout_s")
            @ExcludeMissing
            idleTimeoutS: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("lifetime_s")
            @ExcludeMissing
            lifetimeS: JsonField<Long> = JsonMissing.of(),
        ) : this(idleTimeoutS, lifetimeS, mutableMapOf())

        /**
         * Idle timeout in seconds. Must not exceed lifetime_s.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun idleTimeoutS(): Optional<Long> = idleTimeoutS.getOptional("idle_timeout_s")

        /**
         * Max session duration in seconds (60-1800).
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun lifetimeS(): Optional<Long> = lifetimeS.getOptional("lifetime_s")

        /**
         * Returns the raw JSON value of [idleTimeoutS].
         *
         * Unlike [idleTimeoutS], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("idle_timeout_s")
        @ExcludeMissing
        fun _idleTimeoutS(): JsonField<Long> = idleTimeoutS

        /**
         * Returns the raw JSON value of [lifetimeS].
         *
         * Unlike [lifetimeS], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("lifetime_s") @ExcludeMissing fun _lifetimeS(): JsonField<Long> = lifetimeS

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

            /** Returns a mutable builder for constructing an instance of [Limits]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Limits]. */
        class Builder internal constructor() {

            private var idleTimeoutS: JsonField<Long> = JsonMissing.of()
            private var lifetimeS: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(limits: Limits) = apply {
                idleTimeoutS = limits.idleTimeoutS
                lifetimeS = limits.lifetimeS
                additionalProperties = limits.additionalProperties.toMutableMap()
            }

            /** Idle timeout in seconds. Must not exceed lifetime_s. */
            fun idleTimeoutS(idleTimeoutS: Long) = idleTimeoutS(JsonField.of(idleTimeoutS))

            /**
             * Sets [Builder.idleTimeoutS] to an arbitrary JSON value.
             *
             * You should usually call [Builder.idleTimeoutS] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun idleTimeoutS(idleTimeoutS: JsonField<Long>) = apply {
                this.idleTimeoutS = idleTimeoutS
            }

            /** Max session duration in seconds (60-1800). */
            fun lifetimeS(lifetimeS: Long) = lifetimeS(JsonField.of(lifetimeS))

            /**
             * Sets [Builder.lifetimeS] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lifetimeS] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun lifetimeS(lifetimeS: JsonField<Long>) = apply { this.lifetimeS = lifetimeS }

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
             * Returns an immutable instance of [Limits].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Limits =
                Limits(idleTimeoutS, lifetimeS, additionalProperties.toMutableMap())
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
        fun validate(): Limits = apply {
            if (validated) {
                return@apply
            }

            idleTimeoutS()
            lifetimeS()
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
            (if (idleTimeoutS.asKnown().isPresent) 1 else 0) +
                (if (lifetimeS.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Limits &&
                idleTimeoutS == other.idleTimeoutS &&
                lifetimeS == other.lifetimeS &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(idleTimeoutS, lifetimeS, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Limits{idleTimeoutS=$idleTimeoutS, lifetimeS=$lifetimeS, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BrowserSessionCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "BrowserSessionCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
