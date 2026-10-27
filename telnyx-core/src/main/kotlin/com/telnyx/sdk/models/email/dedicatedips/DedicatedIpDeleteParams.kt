// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.email.dedicatedips

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Release the dedicated IP to Telnyx. The IP stops carrying mail immediately, leaves its pool, and
 * moves to `released`. Telnyx sets `quarantine_until` to 30 days after release. Release requests
 * that the MRC stop asynchronously. Check `billing`: `stopping` means the stop is pending,
 * `stopped` means it completed, and `stop_failed` means the charge remains. If the charge was never
 * created or its creation has not completed, `billing` keeps showing the creation status
 * (`not_started`, `pending`, `in_progress`, or `failed`). Any status except `released` can be
 * released. Releasing the last IP in a pool requires `force=true` and `drain=true`.
 */
class DedicatedIpDeleteParams
private constructor(
    private val id: String?,
    private val queryDrain: Boolean?,
    private val queryForce: Boolean?,
    private val queryReason: String?,
    private val body: Body,
    private val additionalHeaders: com.telnyx.sdk.core.http.Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun id(): Optional<String> = Optional.ofNullable(id)

    /**
     * Set together with `force=true` to release the last IP in a pool. Acknowledges that mail
     * routed to the emptied pool is held until the pool has a sendable IP again. Also accepted in
     * the JSON body.
     */
    fun queryDrain(): Optional<Boolean> = Optional.ofNullable(queryDrain)

    /**
     * Set together with `drain=true` to release the last IP in a pool. Either flag alone has no
     * effect. Also accepted in the JSON body.
     */
    fun queryForce(): Optional<Boolean> = Optional.ofNullable(queryForce)

    /** Free-text reason recorded with the release. Also accepted in the JSON body. */
    fun queryReason(): Optional<String> = Optional.ofNullable(queryReason)

    /**
     * Set together with `force: true` to release the last IP in a pool. Acknowledges that mail
     * routed to the emptied pool is held until the pool has a sendable IP again.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun bodyDrain(): Optional<Boolean> = body.bodyDrain()

    /**
     * Set together with `drain: true` to release the last IP in a pool. Either flag alone has no
     * effect.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun bodyForce(): Optional<Boolean> = body.bodyForce()

    /**
     * Free-text reason recorded with the release.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun bodyReason(): Optional<String> = body.bodyReason()

    /**
     * Returns the raw JSON value of [bodyDrain].
     *
     * Unlike [bodyDrain], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _bodyDrain(): JsonField<Boolean> = body._bodyDrain()

    /**
     * Returns the raw JSON value of [bodyForce].
     *
     * Unlike [bodyForce], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _bodyForce(): JsonField<Boolean> = body._bodyForce()

    /**
     * Returns the raw JSON value of [bodyReason].
     *
     * Unlike [bodyReason], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _bodyReason(): JsonField<String> = body._bodyReason()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): DedicatedIpDeleteParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [DedicatedIpDeleteParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DedicatedIpDeleteParams]. */
    class Builder internal constructor() {

        private var id: String? = null
        private var queryDrain: Boolean? = null
        private var queryForce: Boolean? = null
        private var queryReason: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: com.telnyx.sdk.core.http.Headers.Builder =
            com.telnyx.sdk.core.http.Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(dedicatedIpDeleteParams: DedicatedIpDeleteParams) = apply {
            id = dedicatedIpDeleteParams.id
            queryDrain = dedicatedIpDeleteParams.queryDrain
            queryForce = dedicatedIpDeleteParams.queryForce
            queryReason = dedicatedIpDeleteParams.queryReason
            body = dedicatedIpDeleteParams.body.toBuilder()
            additionalHeaders = dedicatedIpDeleteParams.additionalHeaders.toBuilder()
            additionalQueryParams = dedicatedIpDeleteParams.additionalQueryParams.toBuilder()
        }

        fun id(id: String?) = apply { this.id = id }

        /** Alias for calling [Builder.id] with `id.orElse(null)`. */
        fun id(id: Optional<String>) = id(id.getOrNull())

        /**
         * Set together with `force=true` to release the last IP in a pool. Acknowledges that mail
         * routed to the emptied pool is held until the pool has a sendable IP again. Also accepted
         * in the JSON body.
         */
        fun queryDrain(queryDrain: Boolean?) = apply { this.queryDrain = queryDrain }

        /**
         * Alias for [Builder.queryDrain].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun queryDrain(queryDrain: Boolean) = queryDrain(queryDrain as Boolean?)

        /** Alias for calling [Builder.queryDrain] with `queryDrain.orElse(null)`. */
        fun queryDrain(queryDrain: Optional<Boolean>) = queryDrain(queryDrain.getOrNull())

        /**
         * Set together with `drain=true` to release the last IP in a pool. Either flag alone has no
         * effect. Also accepted in the JSON body.
         */
        fun queryForce(queryForce: Boolean?) = apply { this.queryForce = queryForce }

        /**
         * Alias for [Builder.queryForce].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun queryForce(queryForce: Boolean) = queryForce(queryForce as Boolean?)

        /** Alias for calling [Builder.queryForce] with `queryForce.orElse(null)`. */
        fun queryForce(queryForce: Optional<Boolean>) = queryForce(queryForce.getOrNull())

        /** Free-text reason recorded with the release. Also accepted in the JSON body. */
        fun queryReason(queryReason: String?) = apply { this.queryReason = queryReason }

        /** Alias for calling [Builder.queryReason] with `queryReason.orElse(null)`. */
        fun queryReason(queryReason: Optional<String>) = queryReason(queryReason.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [bodyDrain]
         * - [bodyForce]
         * - [bodyReason]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * Set together with `force: true` to release the last IP in a pool. Acknowledges that mail
         * routed to the emptied pool is held until the pool has a sendable IP again.
         */
        fun bodyDrain(bodyDrain: Boolean) = apply { body.bodyDrain(bodyDrain) }

        /**
         * Sets [Builder.bodyDrain] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bodyDrain] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun bodyDrain(bodyDrain: JsonField<Boolean>) = apply { body.bodyDrain(bodyDrain) }

        /**
         * Set together with `drain: true` to release the last IP in a pool. Either flag alone has
         * no effect.
         */
        fun bodyForce(bodyForce: Boolean) = apply { body.bodyForce(bodyForce) }

        /**
         * Sets [Builder.bodyForce] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bodyForce] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun bodyForce(bodyForce: JsonField<Boolean>) = apply { body.bodyForce(bodyForce) }

        /** Free-text reason recorded with the release. */
        fun bodyReason(bodyReason: String) = apply { body.bodyReason(bodyReason) }

        /**
         * Sets [Builder.bodyReason] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bodyReason] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun bodyReason(bodyReason: JsonField<String>) = apply { body.bodyReason(bodyReason) }

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
         * Returns an immutable instance of [DedicatedIpDeleteParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): DedicatedIpDeleteParams =
            DedicatedIpDeleteParams(
                id,
                queryDrain,
                queryForce,
                queryReason,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> id ?: ""
            else -> ""
        }

    override fun _headers(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                queryDrain?.let { put("drain", it.toString()) }
                queryForce?.let { put("force", it.toString()) }
                queryReason?.let { put("reason", it) }
                putAll(additionalQueryParams)
            }
            .build()

    /** Optional release options. The same fields are accepted as query parameters. */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val bodyDrain: JsonField<Boolean>,
        private val bodyForce: JsonField<Boolean>,
        private val bodyReason: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("drain") @ExcludeMissing bodyDrain: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("force") @ExcludeMissing bodyForce: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("reason") @ExcludeMissing bodyReason: JsonField<String> = JsonMissing.of(),
        ) : this(bodyDrain, bodyForce, bodyReason, mutableMapOf())

        /**
         * Set together with `force: true` to release the last IP in a pool. Acknowledges that mail
         * routed to the emptied pool is held until the pool has a sendable IP again.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun bodyDrain(): Optional<Boolean> = bodyDrain.getOptional("drain")

        /**
         * Set together with `drain: true` to release the last IP in a pool. Either flag alone has
         * no effect.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun bodyForce(): Optional<Boolean> = bodyForce.getOptional("force")

        /**
         * Free-text reason recorded with the release.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun bodyReason(): Optional<String> = bodyReason.getOptional("reason")

        /**
         * Returns the raw JSON value of [bodyDrain].
         *
         * Unlike [bodyDrain], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("drain") @ExcludeMissing fun _bodyDrain(): JsonField<Boolean> = bodyDrain

        /**
         * Returns the raw JSON value of [bodyForce].
         *
         * Unlike [bodyForce], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("force") @ExcludeMissing fun _bodyForce(): JsonField<Boolean> = bodyForce

        /**
         * Returns the raw JSON value of [bodyReason].
         *
         * Unlike [bodyReason], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("reason") @ExcludeMissing fun _bodyReason(): JsonField<String> = bodyReason

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

            private var bodyDrain: JsonField<Boolean> = JsonMissing.of()
            private var bodyForce: JsonField<Boolean> = JsonMissing.of()
            private var bodyReason: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                bodyDrain = body.bodyDrain
                bodyForce = body.bodyForce
                bodyReason = body.bodyReason
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * Set together with `force: true` to release the last IP in a pool. Acknowledges that
             * mail routed to the emptied pool is held until the pool has a sendable IP again.
             */
            fun bodyDrain(bodyDrain: Boolean) = bodyDrain(JsonField.of(bodyDrain))

            /**
             * Sets [Builder.bodyDrain] to an arbitrary JSON value.
             *
             * You should usually call [Builder.bodyDrain] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun bodyDrain(bodyDrain: JsonField<Boolean>) = apply { this.bodyDrain = bodyDrain }

            /**
             * Set together with `drain: true` to release the last IP in a pool. Either flag alone
             * has no effect.
             */
            fun bodyForce(bodyForce: Boolean) = bodyForce(JsonField.of(bodyForce))

            /**
             * Sets [Builder.bodyForce] to an arbitrary JSON value.
             *
             * You should usually call [Builder.bodyForce] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun bodyForce(bodyForce: JsonField<Boolean>) = apply { this.bodyForce = bodyForce }

            /** Free-text reason recorded with the release. */
            fun bodyReason(bodyReason: String) = bodyReason(JsonField.of(bodyReason))

            /**
             * Sets [Builder.bodyReason] to an arbitrary JSON value.
             *
             * You should usually call [Builder.bodyReason] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun bodyReason(bodyReason: JsonField<String>) = apply { this.bodyReason = bodyReason }

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
                Body(bodyDrain, bodyForce, bodyReason, additionalProperties.toMutableMap())
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

            bodyDrain()
            bodyForce()
            bodyReason()
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
            (if (bodyDrain.asKnown().isPresent) 1 else 0) +
                (if (bodyForce.asKnown().isPresent) 1 else 0) +
                (if (bodyReason.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                bodyDrain == other.bodyDrain &&
                bodyForce == other.bodyForce &&
                bodyReason == other.bodyReason &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(bodyDrain, bodyForce, bodyReason, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{bodyDrain=$bodyDrain, bodyForce=$bodyForce, bodyReason=$bodyReason, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DedicatedIpDeleteParams &&
            id == other.id &&
            queryDrain == other.queryDrain &&
            queryForce == other.queryForce &&
            queryReason == other.queryReason &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            id,
            queryDrain,
            queryForce,
            queryReason,
            body,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "DedicatedIpDeleteParams{id=$id, queryDrain=$queryDrain, queryForce=$queryForce, queryReason=$queryReason, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
